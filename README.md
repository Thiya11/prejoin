# Quick Notes

This is the backend application for the [prejoin APP](https://github.com/Thiya11/prejoin-ui/tree/master).

Check out the UI Live Demo [here](https://prejoin-ui.vercel.app).

Check out the Live Demo of Backend [here](https://thunderfalls.xyz/api/employee).

# GETTING STARTED WITH PREJOIN SPRING BOOT APPLICATION

* This Spring Boot backend application contains the basic APIs for learning purposes.

## INITIAL SETUP

Before running this application, ensure Oracle DB is set up and you have the credentials of the DB.

## Environment variables used

* DB_URL = dbc:oracle:thin:@//localhost:1521/XEPDB1
* DB_USER_NAME = example_user
* DB_PASSWORD = example_pass
* ALLOWED_URL = http://example.com *URL of the third party UI domain for CORS bypass*

### Production environment

1. Copy the .jar file created by the maven build *./src/target/sample.jar* to the production domain.

2. Create a .env file and add your credentials as per the sample provided above.

3. Run the following bash command to check everything is working fine.

``` bash export $(grep -v '^#' .env | xargs)  java -jar sample.jar &```

4. If it runs without any error, rerun it using nohup so that it keeps running in the background.

``` bash export $(grep -v '^#' .env | xargs) nohup java -jar sample.jar &```


### Development environment (Eclipse IDE)

1. Pull this branch

2. Add the environment variables mentioned above in the run configurations. **Right click on the main java class *PrejoinApplication.java* Run as -> Run configurations**

3. Finally, run the application.

# Available APIs

## Get All Employees

* To get all the employees' names and IDs as an array of objects.

#### Path:  **/api/employee**

#### Method: GET

#### Sample request body:
N/A

#### Sample output:
```json [{"id": 1, "name": "John"}, {"id":2, "name": "Miller"}]```


## Post Employee

* To post the new employee's name.

#### Path: **/api/employee**

#### Method: POST

#### Sample request Body:

```json {"name":"Mike"}```

#### Sample output:
```Employee Created```
