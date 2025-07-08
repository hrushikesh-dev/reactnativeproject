package com.reactnativetask

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import android.graphics.Color

class TriangleViewManager : SimpleViewManager<TriangleView>() {
    override fun getName() = "TriangleView"

    override fun createViewInstance(reactContext: ThemedReactContext): TriangleView {
        return TriangleView(reactContext)
    }

    @ReactProp(name = "color")
    fun setColor(view: TriangleView, color: String?) {
        val parsedColor = try {
            Color.parseColor(color ?: "#FFFFFF")
        } catch (e: Exception) {
            Color.WHITE
        }
        view.setBgColor(parsedColor)
    }
}
