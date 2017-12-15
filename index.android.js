import React, { Component, } from 'react'
import { View, Text, Platform, Alert, StyleSheet, TouchableOpacity, AppRegistry } from 'react-native'

class HelloWorld extends Component {

    constructor(props) {
        super(props)
        this.state = {}
    }

    render() {
        return (<View style={styles.container}>
            <Text style={{ fontSize: 30, color: '#00f' }}>我是ReactNative界面</Text>
        </View>)
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#0ff',
        justifyContent: 'center',
        alignItems: 'center'
    }
})

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);