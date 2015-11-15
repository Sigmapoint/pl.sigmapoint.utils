
# Sigmapoint Utils

This is a set of usefull tools like PersistanceUtil for simpler and faster saving data to shared preferences, DateFormatterUtil for date formatting, etc.

## Usage

Library is available in jcenter. In your gradle file add dependency to ```pl.sigmapoint.utils:sigmapoint-utils:1.0.1```

Many of util classes have static method, but e.g. PersistanceUtil have only public method, not static. 
This verison contains:

```
AppVerisonUtil - getters for code version and verison name
DateFormatterUtil - contains methods which return text with formated date. Format can be choose.
DateUtil - modify date.
ImageUtil - decode or encode bitmap to or from Base64
L - Logger with static tag.
NetworkUtil - contains method for chcecking network connection.
PersistanceUtil - util for persit, load or remove data from shared preferences.
PhoneUtil - getters for device ID and phone number.
ScreensDensityUtil - conatins getter for scree density and have methods which convert px to dp or dp to px.
SharedPreferenceUtil - getter for shared preferences.
SoftKeyboardUtil - contains method to hide or show keyboard.
ToastUtil - faster and simpler Toast maker.
``` 

## History

It is a first release

## License

pl.sigmapoint.utils is licensed under the [MIT license] (https://raw.githubusercontent.com/Sigmapoint/pl.sigmapoint.utils/master/LICENSE.txt)
