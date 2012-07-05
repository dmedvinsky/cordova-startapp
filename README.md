# StartApp plugin for Cordova

## License

MIT/X11

## Usage

### iOS

1. Add `StartApp.m` and `StartApp.h` files to your project in `Plugins`
   directory.
3. Add `startapp.ios.js` to your web application.
4. Add

        <key>StartApp</key>
        <string>StartApp</string>

   to your `Cordova.plist` inside `<key>Plugins</key><dict>...</dict>`
5. Use

        window.plugins.startapp.start(
            {ios: 'https://maps.google.com/'},
            successCallback, failureCallback
        );

   whenever required.

### Android

1. Create `src/com/phonegap/plugins/startapp` directory.
2. Copy `StartApp.java` to `src/com/phonegap/plugins/startapp` directory.
3. Add `startapp.android.js` to your web application.
4. Add

        <plugin name="StartApp" value="com.phonegap.plugins.startapp.StartApp"/>

   to your `res/xml/plugins/xml` inside `<plugins></plugins>`.
5. Use

        window.plugins.startapp.start(
            {android: 'com.mycompany.myapp/com.mycompany.myapp.MyActivity'},
            successCallback, failureCallback
        );

   whenever required.
