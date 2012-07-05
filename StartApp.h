//  Cordova plugin to run external app.
//
//  StartApp.m
//
//  Created by Dmitry Medvinsky <dmedvinsky@gmail.com>
//  License: MIT/X11

#import <Cordova/CDVPlugin.h>


@interface StartApp : CDVPlugin

- (void) start:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options;

@end
