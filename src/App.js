/**
 * created by wenqiang
 * 2017.12.15
 */
import React, { Component, } from 'react'
import { View, Text, Platform, Alert, StyleSheet, TouchableOpacity, AppRegistry, NativeModules} from 'react-native'
import { HeaderBackButton, HeaderTitle, NavigationActions } from 'react-navigation'
let Close = NativeModules.test
export default class App extends Component {

    static navigationOptions = ({ navigation }) => {

        return {
            headerTitle: "ReactNative页面",
            headerBackTitleStyle: '返回',
            headerLeft: (<HeaderBackButton tintColor="#fff" onPress={navigation.state.params && navigation.state.params.clickParams} />)
        }
    }

    constructor(props) {
        super(props)
        this.state = {}
        this.back = this.back.bind(this)
    }

    componentWillMount() {
        this.props.navigation.setParams({ clickParams: this.back })
    }


    back() {
        console.log('goBack')
        Close.goBack();
    }

    render() {
        return (<View style={styles.container}>
            <Text style={{ fontSize: 30, color: '#00f' }}>我是ReactNative界面</Text>

            <TouchableOpacity
                onPress={() => this.back()}
                style={{ backgroundColor: '#0f0', padding: 10, borderRadius: 5 ,justifyContent:'center'}}>
                <Text style={{ color: '#f00' }}>跳到Android原生界面</Text>
            </TouchableOpacity>

        </View>)
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#ff9000',
        justifyContent: 'center',
        alignItems: 'center'
    }
})
