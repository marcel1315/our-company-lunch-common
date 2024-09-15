# Overview

This is common library for our-company-lunch project.

Contains:
- JwtAuthenticationFilter
- TokenProvider

# How to import (Gradle)
In build.gradle file dependencies,
```
implementation 'com.github.marcel1315:our-company-lunch-common:0.0.11'
```

Need to add repository for jitpack besides mavenCentral.
```
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
```

# Usage
In project, add below properties in application.yml.

```
common:
  jwt:
    secret: rs234u2n34t13u4qn28ar3s7t2w3f89rlsthq23np982l387j2lrs8t
    expired-in-hour: 1
```