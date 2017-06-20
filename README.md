Kotlin DefinitelyTyped for Bytes
======


### Usage

* add dependency in build.gradle
```
dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib-js:$kotlin_version"
    compile "org.mvnsearch.kotlin.definitelytyped:bytes:2.5.0"
}
```
* import code

```
import bytes.bytes

bytes(1024)

```

### setup

* Compile ts to kotlin
```
$ ts2kt bytes.d.ts
```
* mvn package install


