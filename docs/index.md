dans-cli-archetype
==================

Generate a skeleton DANS CLI (Command-Line Interface).

SYNOPSIS
--------
```text
generate-dans-cli.sh
```

DESCRIPTION
-----------
Creates a DANS CLI.


ARGUMENTS
----------
The `generate-dans-cli.sh` script will interactively query you for argument values.

EXAMPLES
--------

This assumes that you have copied the `generate-dans-cli.sh` script to a directory that is on your `$PATH`. On the Mac that could be `/usr/local/bin`

```text
cd ~/git/test/
generate-dans-cli.sh
dans-cli-archetype version? (default = 0.1.0-SNAPSHOT):
Module artifactId: dans-test-cli
Name module's main package (i.e. the one UNDER nl.knaw.dans): test
Command name: dans-test-app
Description (one to four sentences): This is a test module
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.1.2:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.1.2:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.1.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype repository not defined. Using the one from [nl.knaw.dans:dans-module-archetype:0.0.1-SNAPSHOT] found in catalog local
[INFO] Using property: groupId = nl.knaw.dans
[INFO] Using property: artifactId = dans-test-module
[INFO] Using property: version = 0.0.1-SNAPSHOT
[INFO] Using property: package = nl.knaw.dans.test
[INFO] Using property: description = This is a test module
[INFO] Using property: inceptionYear = 2021
[INFO] Using property: javaName = DansTestModule
[INFO] Using property: moduleSubpackage = test
[INFO] Using property: projectName = Dans Test Module
Confirm properties configuration:
groupId: nl.knaw.dans
artifactId: dans-test-cli
version: 0.0.1-SNAPSHOT
package: nl.knaw.dans.test
description: This is a test module
inceptionYear: 2021
javaName: DansTestModule
moduleSubpackage: test
projectName: Dans Test Module
 Y: :
```

Now hit Enter to accept these settings and the module will be generated and built for the first time.

INSTALLATION AND CONFIGURATION
------------------------------

* Add `https://maven.dans.knaw.nl/releases/` as a plug-in repository if you want to use a released version of this archetype.
* Clone and build the project if you want to use a snapshot.

DEVELOPMENT
-----------

### Building from source

Prerequisites:

* Maven 3.6.3 or higher

Steps:

```commandline
git clone https://github.com/DANS-KNAW/dans-cli-archetype.git
cd dans-cli-archetype
mvn install
```
