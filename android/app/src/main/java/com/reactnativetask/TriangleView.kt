package com.reactnativetask

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class TriangleView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private var bgColor: Int = Color.WHITE
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val trianglePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        style = Paint.Style.FILL
    }

    fun setBgColor(color: Int) {
        bgColor = color
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Draw background
        paint.color = bgColor
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)

        // Draw triangle (centered)
        val path = Path()
        path.moveTo(width / 2f, height / 4f) // Top
        path.lineTo(width / 4f, height * 3 / 4f) // Bottom left
        path.lineTo(width * 3 / 4f, height * 3 / 4f) // Bottom right
        path.close()
        canvas.drawPath(path, trianglePaint)
    }
}
