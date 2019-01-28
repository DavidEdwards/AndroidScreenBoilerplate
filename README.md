[![CircleCI](https://circleci.com/gh/DavidEdwards/AndroidScreenBoilerplate.svg?style=svg)](https://circleci.com/gh/DavidEdwards/AndroidScreenBoilerplate)

# AndroidScreenBoilerplate
Small boilerplate code that adds Kotlin extension functions to Context. This allows you to quickly determine whether the device you are using is, for example, a phone or a tablet.

## Usage

Simply add this to your dependencies:

```gradle
implementation 'com.github.DavidEdwards:AndroidScreenBoilerplate:1.0'
```

And make sure you have Jitpack enabled:

```gradle
repositories {
    // ...
    maven { url "https://jitpack.io" }
}
```

Now you can use `isPhone()`, `isTablet()`, `isTV()`, `isSmall()` and `isLarge()` in your `Activity`, `Fragment` or other `ContextWrapper` objects.