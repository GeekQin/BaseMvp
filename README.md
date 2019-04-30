使用

工程的Gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

Moudle的Gradle
implementation 'com.github.GeekQin:BaseMvp:Tag'
