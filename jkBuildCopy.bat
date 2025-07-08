@echo off
chcp 65001
setlocal

rem === Maven 빌드 실행 ===
echo [+] Maven build in progress...
call mvn clean package

rem === .jar파일 복붙 ===
echo [+] Copying JAR file...
copy /Y "target\PluginTest-1.0-SNAPSHOT.jar" "C:\Users\jkjay\OneDrive\Desktop\1.20.1 sever\plugins\target\PluginTest-1.0-SNAPSHOT.jar"
echo [+] COPY SUCCESS