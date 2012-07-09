package com.phonegap.plugins.startapp;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ComponentName;
import android.content.Intent;


/**
 * Launches an external application.
 *
 * @author Dmitry Medvinsky <dmedvinsky@gmail.com>
 * @license MIT/X11
 */
public class StartApp extends Plugin
{
    /**
     * Executes the request and returns PluginResult.
     *
     * @param action
     *          Action to perform.
     * @param args
     *          Arguments to the action.
     * @param callbackId
     *          JavaScript callback ID.
     * @return A PluginResult object with a status and message.
     */
    public PluginResult execute(String action, JSONArray args, String callbackId)
    {
        try {
            if (action.equals("startApp")) {
                if (args.length() != 1) {
                    return new PluginResult(PluginResult.Status.INVALID_ACTION);
                }
                String component = args.getString(0);
                startActivity(component);
                return new PluginResult(PluginResult.Status.OK);
            }
            return new PluginResult(PluginResult.Status.INVALID_ACTION);
        } catch (JSONException e) {
            e.printStackTrace();
            return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
        }
    }

    /**
     * Starts an activity.
     *
     * @param component
     *            Activity ComponentName.
     *            E.g.: com.mycompany.myapp/com.mycompany.myapp.MyActivity
     */
    void startActivity(String component) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(ComponentName.unflattenFromString(component));
        this.ctx.startActivity(intent);
    }
}
