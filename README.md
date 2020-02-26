# springboot-with-angular-war
spring boot project with angular 8 project embedded to single project to generate war file

# Step-1
Add front end maven plugin in the build in pom.xml.
copy build portion of pom.xml into your pom.xml file and change the respective folder name as your project name

# step 2
Copy angular project into src/main/resources folder

# step 3
add  "buildProduction": "ng build --prod --base-href /auth-portal/", to package.json file

# Step 4
Build War file
Open Java project root folder in terminal and then run "mvn clean package"
