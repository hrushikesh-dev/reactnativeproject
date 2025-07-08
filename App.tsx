/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */
import { StatusBar, StyleSheet, useColorScheme, View } from 'react-native';
import TriangleView from './TriangleView';

function App() {
  const isDarkMode = useColorScheme() === 'dark';
  const triangleColor = '#800000'; // Use this for both background and triangle

  return (
    // Example usage of TriangleView with a dynamic color
    <View style={[styles.container, { backgroundColor: triangleColor }]}>
      <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
      <TriangleView color={triangleColor} style={{ width: 200, height: 200 }} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#000', // Set background to black
    justifyContent: 'center', // Center vertically
    alignItems: 'center', // Center horizontally
  },
});

export default App;
