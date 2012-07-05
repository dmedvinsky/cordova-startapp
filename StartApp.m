//  Cordova plugin to run external app
//
//  StartApp.m
//
//  Created by Dmitry Medvinsky <dmedvinsky@gmail.com>
//  License: MIT/X11

#import "StartApp.h"


@implementation StartApp

- (void) start:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options
{
    CDVPluginResult *result;
    NSString *callbackId = [arguments pop];
    NSString *stringURL = [arguments objectAtIndex:0];
    NSURL *url = [NSURL URLWithString:stringURL];
    bool opened = [[UIApplication sharedApplication] openURL:url];

    if (opened) {
        result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString: @"URL opened"];
        [self writeJavascript:[result toSuccessCallbackString:callbackId]];
    }
    else {
        result = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString: @"Couldn't open URL"];
        [self writeJavascript:[result toErrorCallbackString:callbackId]];
    }
}

@end
