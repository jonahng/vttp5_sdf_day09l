in project root folder

to compile:
javac -d bin --source-path . ./*.java FolderWithJavaFiles/*.java


to run the .class files:
java -cp bin <packageName>.<Classname>
java -cp bin packagename.App

to package into jar file, go into the bin folder where the class files are:
jar -c-v-f jarName.jar -e package.app .                (Fullstop at the back is critical)

to run the jar file:
go into the folder (bin) where  the jar file was made
java -jar day09.jar


to run the jar file from the project root folder(Not from the bin folder)
java -jar bin/day09jar
