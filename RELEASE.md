How to make a release
=====================

Preparation
-----------

* Change the artifact ID in `pom.xml` to today's date, e.g.:

  ```
  2014.12.31-SNAPSHOT
  ```

* Update the version, date and URL in `Description.props` to reflect new
  version, e.g.:

  ```
  Version=2014.12.31
  Date=2014-12-31
  PackageURL=https://github.com/fracpete/screencast4j-weka-package/releases/download/v2014.12.31/screencast4j-2014.12.31.zip
  ```

* Commit/push all changes


Weka package
------------

* Run the following command to generate the package archive for version `2016.1.3`:

  ```
  ant -f build_package.xml -Dpackage=screencast4j-2016.1.3 clean make_package
  ```

* Create a release tag on github (v2016.1.3)
* add release notes
* upload package archive from `dist`


Maven
-----

* Run the following command to deploy the artifact:

  ```
  mvn release:clean release:prepare release:perform
  ```

* log into https://oss.sonatype.org and close/release artifacts

* After successful deployment, push the changes out:

  ```
  git push
  ````

* Update Weka package links
* Update Maven artifact version
