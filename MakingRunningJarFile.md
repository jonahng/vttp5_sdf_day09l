140

Open a command prompt.

Go to the directory where you have your .java files

Create a directory build

Run java compilation from the command line

javac -d ./build *.java
if there are no errors, in the build directory you should have your class tree

move to the build directory and do a

jar cvf YourJar.jar *




to run it:
java -jar <jar-file-name>.jar

If you dont have an entry point defined in your manifest invoking java -jar foo.jar will not work.

Use this command if you dont have a manifest or to run a different main class than the one specified in the manifest:

java -cp foo.jar full.package.name.ClassName