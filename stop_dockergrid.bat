cd F:\java1\Docker
docker ps -a
@ECHO OFF
echo.
echo.
ECHO These are the list of containes in up and Running Status.
TIMEOUT /T 3
echo.
echo.
ECHO "docker-compose down" this command will stop and remove the containes.
TIMEOUT /T 3
echo.
echo.
@ECHO ON
docker-compose down
@ECHO OFF
echo.
echo.
ECHO Containers stopped and removed successfully.
TIMEOUT /T 3
