## 本地仓库使用

1. 安装脚手架到本地仓库：
    ```shell
    mvn clean install
    ```

2. 使用脚手架生成工程：
    ```shell
    mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=com.hollowlatte.archetypes -DarchetypeArtifactId=springboot3-scaffold-lite -DarchetypeVersion=2.0 -DgroupId=com.hollowlatte.example -DartifactId=hello-test -Dversion=0.0.1 -DarchetypeCatalog=local -DoutputDirectory=../
    ```

## 远程仓库使用

1. 上传脚手架：
   ```shell
   mvn clean deploy -DskipTests
   ```

2. 使用脚手架生成工程：
   ```shell
   mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=com.hollowlatte.archetypes -DarchetypeArtifactId=springboot3-scaffold-lite -DarchetypeVersion=2.0 -DgroupId=com.hollowlatte.example -DartifactId=hello-test -Dversion=0.0.1 -DoutputDirectory=../../hi-project
   ```

## 生成效果

如果不想生成工程，但是想测试生成效果怎么办？

由于Archetype插件进行install或package等操作时，会默认会进行集成测试IT，使用src/test/resources/projects/basic/archetype.properties配置文件中的配置进行生成测试，
生成的测试工程在target/projects/basic/project/test下。

所以可以通过这个测试工程来看生成效果