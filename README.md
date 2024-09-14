# Overview

This is common library for our-company-lunch project.

Contains:
- JwtAuthenticationFilter
- TokenProvider

# Usage
Add below properties in application.yml.

```
common:
  jwt:
    secret: rs234u2n34t13u4qn28ar3s7t2w3f89rlsthq23np982l387j2lrs8t
    expired-in-hour: 1
```