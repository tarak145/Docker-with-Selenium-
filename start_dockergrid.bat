cd F:\java1\Docker
docker ps -a
@echo off
echo.
echo.
TIMEOUT /T 3
echo.
echo.
ECHO Sorry, No Containers Found.
TIMEOUT /T 3
echo.
echo.
ECHO "docker-compose up" this command will start the containers.
TIMEOUT /T 3
echo.
echo.
@ECHO ON
docker-compose up -d
@echo off
TIMEOUT /T 3
exit