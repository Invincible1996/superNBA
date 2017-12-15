import React, { Component } from 'react';
import {
    Platform,
    StyleSheet,
    Text,
    View,
    Animated,
    Easing
} from 'react-native';
import {
    StackNavigator,
    TabNavigator,
    DrawerNavigator
} from "react-navigation";

import App from './App'

const TabConfig = {
    tabBarPosition: 'bottom',
    tabBarOptions: {
        activeTintColor: '#3F51B5',
        //tabBarComponent: 'TabBarBottom',
        inactiveTintColor: '#9c9c9c',
        indicatorStyle: { height: 0 },
        showIcon: true,
        labelStyle: {
            fontSize: 13,
            top: -8,
            //color:'#666666',
        },
        style: {
            backgroundColor: '#fff',
            height: 50,
            //flex:1,
            //top:-60
        },
    },
    lazy: true,
    animationEnabled: false,
    swipeEnabled: false
}

const StackNav = StackNavigator({
    App: { screen: App }
}, {
        initialRouteName: 'App',
        navigationOptions: ({ navigation }) => ({
            headerBackTitle: null,
            headerStyle: {
                backgroundColor: '#3F51B5',
                elevation: 0,
                shadowOffset: { width: 0, height: 0 },
                shadowColor: '#ff9000',
                shadowOpacity: 10,
                shadowRadius: 5,
            },
            headerTintColor: '#ffffff',
            headerTitleStyle: {
                fontSize: 16,
                // alignSelf: 'center'
            },
            // headerRight: (<View></View>)
        }),
        transitionConfig: () => ({
            transitionSpec: {
                duration: 0,
                timing: Animated.timing,
                easing: Easing.step0,
            },
        }),
    }
)

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#fff',
    },
});
export default StackNav;