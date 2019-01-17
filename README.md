# demo
Demo apps to start up with ADP

This app has 2 endpoints, 1 with a health check url and another that fetches batch status from DEV database

https://aztech-demo.apps.adp.allianz/healthcheck

https://aztech-demo.apps.adp.allianz/batch/52125/status

Some commands for starting with ADP :-

ADP CLI to be installed from
https://apps.sys.adp.allianz/organizations/e179aadb-e19f-4b9e-85c7-40575cb5a9ec/tools

From command prompt -> 

Login to ADP
cf login

endpoint: https://api.sys.adp.allianz
enter username and password
select space (dev/test)

Go to app folder (workspace directory) in local where pom.xml is present

Package the app by giving the command:
mvn clean package

Push the app to adp       
cf push -f manifest.yml

Check apps deployed in the space and status
cf apps

Start or stop the app         
cf start aztech-demo
cf stop aztech-demo
