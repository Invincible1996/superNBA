import React, { Component, } from 'react'
import { View, Text, Platform, Alert, StyleSheet, TouchableOpacity, AppRegistry, NativeModules } from 'react-native'
let Close = NativeModules.test

class HelloWorld extends Component {

    constructor(props) {
        super(props)
        this.state = {}
        this.back = this.back.bind(this)
    }


    back() {
        Close.goBack();
    }

    render() {
        return (<View style={styles.container}>
            <Text style={{ fontSize: 30, color: '#00f' }}>我是ReactNative界面</Text>

            <TouchableOpacity
                onPress={() => this.back()}
                style={{ backgroundColor: 'red', padding: 10, borderRadius: 5 }}>
                <Text style={{ color: '#fff' }}>跳到Android原生界面</Text>
            </TouchableOpacity>
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