How to make a release
=====================

Preparation
-----------

* Change the artifact ID to today''s date, e.g.:

  ```
  2016.1.3-SNAPSHOT
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


Maven Central
-------------

* Run the following command to deploy the artifact:

  ```
  mvn release:clean release:prepare release:perform
  ```

* After successful deployment, push the changes out:

  ```
  git push
  ```

