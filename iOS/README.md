# StartApp plugin for Cordova

## License

MIT/X11

## Usage

### iOS

1. Add `StartApp.m` and `StartApp.h` files to your project in `Plugins`
   directory.
2. Add `startapp.js` to your web application.
3. Add

        <key>StartApp</key>
        <string>StartApp</string>

   to your `Cordova.plist` inside `<key>Plugins</key><dict>...</dict>`
4. Use

        window.startapp.start(
            {ios: 'myURL'},
            successCallback, failureCallback
        );

   whenever required.
