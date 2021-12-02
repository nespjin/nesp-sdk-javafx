# nesp-sdk-javafx
Nesp software development kit for JavaFx

## Features

### Resource
Required [nesp-gradle-plugin-javafx](https://github.com/nespjin/nesp-gradle-plugin-javafx)

#### String
```java
final String title = getResource().getString(R.string.app_name);
setTitle(title);
```

#### Layout
```java
setContent(R.layout.main_stage);
```

### Database



## Dependencies

- [JavaFx 17.0.1](https://openjfx.io/)
- [OpenJDK 17.0.1](http://www.planetjdk.org/projects/jdk/)
- [nesp-sdk-java](https://github.com/nespjin/nesp-sdk-java)

## License

```
Copyright 2019 靳兆鲁（1756404649@qq.com）

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
