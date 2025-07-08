import React from 'react';
import { requireNativeComponent, ViewProps } from 'react-native';

interface TriangleViewProps extends ViewProps {
  color?: string;
}

const NativeTriangleView =
  requireNativeComponent<TriangleViewProps>('TriangleView');

const TriangleView: React.FC<TriangleViewProps> = props => {
  return <NativeTriangleView {...props} />;
};

export default TriangleView;
