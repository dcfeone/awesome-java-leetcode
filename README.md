1. Create new project
```
$ mvn archetype:generate -DgroupId=leetcode -DartifactId=awesom-java-leetcode -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```

2. Download libraries
```
wget -P lib https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar
wget -P lib https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.11.3/junit-jupiter-api-5.11.3.jar
```

3. Build package 
```
# build
javac -d ${td::=$(mktemp -d)} -cp "$td:$(printf %s: lib/*.jar)" src/**/*/*.java
# package
jar -cvf $td/${pkg::=$(find $td -type f -printf "%P\n" |fzf|rev | cut -f 2- -d "/" |rev|sed -e 's/\//./g')}.jar -C $td .
# run test
java -jar lib/junit-platform-console-standalone-1.9.3.jar -cp "$td:$(printf %s: lib/*.jar)" --select-package $pkg
```


