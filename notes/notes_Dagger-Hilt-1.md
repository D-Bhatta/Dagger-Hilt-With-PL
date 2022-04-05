# Notes: Dagger-Hilt with Phillip Lackner

Course URL: [Dagger-Hilt with PL](https://www.youtube.com/watch?v=ZE2Jkvnk2Bs)

<!-- markdownlint-disable MD010 -->

## Sections

- [Notes: Dagger-Hilt with Phillip Lackner](#notes-dagger-hilt-with-phillip-lackner)
  - [Sections](#sections)
  - [Notes](#notes)
  - [Additional Information](#additional-information)
  - [Errors](#errors)
    - [Course](#course)
    - [Screenshots](#screenshots)
    - [Links](#links)
  - [Notes template](#notes-template)

## Notes

## Setup

### Project level gradle file

- Add the following dependency classpath to the project level `build.gradle` file

```gradle
  dependencies {
      ...

      // Dagger - Hilt
      classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'
      ...
  }
```

### App level build.gradle file

- Add the `kotlin-kapt` or Kotlin Annotation Processing Tool plugin. It allows most Java annotations to work with kotlin easily. Know more at the [kapt reference](https://kotlinlang.org/docs/kapt.html#gradle-build-cache-support.
- Add the `dagger.hilt.android.plugin` plugin to the app.

```gradle
plugins {
    ...
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'

}
```

- Add the Dagger-Hilt dependencies as well as the Jetpack integrations for Compose, Navigation, and WorkManager.
- Add the KTX for `Activity` for `viewModels`.

```gradle
dependencies {

    ...

    // Dagger - Hilt
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-compiler:2.38.1"

    implementation "androidx.hilt:hilt-navigation-compose:1.0.0"
    implementation 'androidx.hilt:hilt-navigation-fragment:1.0.0'
    implementation 'androidx.hilt:hilt-work:1.0.0'
    kapt "androidx.hilt:hilt-compiler:1.0.0"

    // Activity KTX for viewModels()
    implementation "androidx.activity:activity-ktx:1.4.0"
}
```

## Additional Information

## Errors

### Course

### Screenshots

### Links

- StackOverflow: [Dagger Hilt 'Assisted' and 'ViewModelInject' is deprecated. in Dagger Hilt View Model 1.0.0-alpha03](https://stackoverflow.com/questions/66185820/dagger-hilt-assisted-and-viewmodelinject-is-deprecated-in-dagger-hilt-view)
- Android Dev Docs (Training): [Dependency injection with Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- Android Dev Docs (Training): [Hilt and Jetpack integrations](https://developer.android.com/training/dependency-injection/hilt-jetpack)
- Dagger Docs: [Hilt View Models](https://dagger.dev/hilt/view-model)
- AndroidX releases: [Hilt](https://developer.android.com/jetpack/androidx/releases/hilt)
- Android Dev Docs (Kotlin): [Android KTX](https://developer.android.com/kotlin/ktx)
- Android Dev Docs (Jetpack Compose): [Compose and other libraries](https://developer.android.com/jetpack/compose/libraries)
- Android Dev Docs (Jetpack Architecture): [Guide to app architecture](https://developer.android.com/jetpack/guide)

## Notes template

```language

```

![Text](./static/img/name.jpg)

- [Text](Link)
