screencast4j-weka-package
============================

Weka package that allows you to record sound, webcam and screen for creating
screencasts, e.g., to be uploaded to YouTube. This package is only used for
recording the raw feeds for the screencasts, you need to use a 
[video editor](https://en.wikipedia.org/wiki/List_of_video_editing_software) 
for rendering the final screencast.

Uses the [screencast4j](https://github.com/fracpete/screencast4j) library.


Releases
--------

* [2016.5.8](https://github.com/fracpete/screencast4j-weka-package/releases/download/v2016.5.8/screencast4j-2016.5.8.zip) (Weka >= 3.9.0)
* [2016.1.3](https://github.com/fracpete/screencast4j-weka-package/releases/download/screencast4j-weka-package-2016.1.3/screencast4j-2016.1.3.zip) (Weka >= 3.7.12)


How to use packages
-------------------

For more information on how to install the package, see:

https://waikato.github.io/weka-wiki/packages/manager/


Maven
-----

Add the following dependency in your `pom.xml` to include the package:

```xml
    <dependency>
      <groupId>com.github.fracpete</groupId>
      <artifactId>screencast4j-weka-package</artifactId>
      <version>2016.5.8</version>
      <type>jar</type>
      <exclusions>
        <exclusion>
          <groupId>nz.ac.waikato.cms.weka</groupId>
          <artifactId>weka-dev</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
```

