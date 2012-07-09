# StartApp plugin for Cordova

## License

MIT/X11

## Usage

See Android and iOS folders for Android and iOS usage, respectivelly.

### If you want to build for both platforms

1. Add `iOS/StartApp.m` and `iOS/StartApp.h` files to your iOS project in
   `Plugins` directory.
2. Add `iOS/startapp.js` to your web application as `startapp.ios.js`.
3. Add

        <key>StartApp</key>
        <string>StartApp</string>

   to your `Cordova.plist` inside `<key>Plugins</key><dict>...</dict>`
4. Copy `Android/StartApp.java` to `src/com/phonegap/plugins/startapp`
   directory of your Android project.
5. Add `Android/startapp.js` to your web application as `startapp.android.js`.
6. Add

        <plugin name="StartApp" value="com.phonegap.plugins.startapp.StartApp"/>

   to your `res/xml/plugins/xml` inside `<plugins></plugins>`.
7. Copy corresponding JS file to `startapp.js` when building the project.
8. Include `startapp.js` on your HTML pages.
8. Use

        window.plugins.startapp.start(
            {
                android: 'com.mycompany.myapp/com.mycompany.myapp.MyActivity',
                ios: 'myURL'
            },
            successCallback, failureCallback
        );

   whenever required.
