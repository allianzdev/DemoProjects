# AzTech demo suite of services

Demo Service
The demo-service app has a controller that return a message. 
This message resides within the configuration files hosted in the Configuration service.
The gateway app end point is used to access the message from the demo service.
The gateway will route the endpoint to the demo service and returns the response.

Instructions
1. Download or clone the apps to your workspace.
2. From within the demo-config folder, execute cf push -f manifest-dev.yml
3. Now push the demo-gateway and demo-service apps by issuing 'cf push -f manifest-dev.yml' command from within respective folders.

The jar files are  uploaded to git so you can push the apps without executing 'mvn clean package'
If any changes are made to the app execute the 'mvn clean package' before doing the push to ADP cloud.

4. Once all apps are up and running, enter the demo-gateway url https://demo-gateway-service-dev.apps.adp.allianz/app/healthcheck on browser and see the response.
5. The demo-service url can also be accessed directly and you get the same result : https://demo-service-dev.apps.adp.allianz/app/healthcheck
