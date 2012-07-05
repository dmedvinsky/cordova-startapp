# StartApp plugin for Cordova

## License

MIT/X11

## Usage

1. Create `src/com/phonegap/plugins/startapp` directory.
2. Copy `StartApp.java` to `src/com/phonegap/plugins/startapp` directory.
3. Add `startapp.js` to your web application.
4. Add

        <plugin name="StartApp" value="com.phonegap.plugins.startapp.StartApp"/>

   to your `res/xml/plugins/xml` inside `<plugins></plugins>`.
5. Use

        window.plugins.startapp.start(
            {app: 'com.mycompany.myapp/com.mycompany.myapp.MyActivity'},
            successCallback, failureCallback
        );

   whenever required.
