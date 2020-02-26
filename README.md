# springboot-with-angular-war
spring boot project with angular 8 project embedded to single project to generate war file

# Step-1
Add front end maven plugin in the build in pom.xml
<build>
		<finalName>auth-portal</finalName>
		<plugins>
			<plugin>
				<groupId>com.github.eirslett</groupId>
				<artifactId>frontend-maven-plugin</artifactId>
				<version>1.6</version>
				<configuration>
					<workingDirectory>src/main/resources//auth-portal/</workingDirectory>
				</configuration>
				<executions>
					<execution>
						<id>install-node-and-npm</id>
						<goals>
							<goal>install-node-and-npm</goal>
						</goals>
						<configuration>
							<nodeVersion>v12.9.1</nodeVersion>
						</configuration>
					</execution>
					<execution>
						<id>npm install</id>
						<goals>
							<goal>npm</goal>
						</goals>
						<configuration>
							<arguments>install</arguments>
						</configuration>
					</execution>
					<execution>
						<id>npm build</id>
						<goals>
							<goal>npm</goal>
						</goals>
						<configuration>
							<arguments>run buildProduction</arguments>
						</configuration>
						<phase>generate-resources</phase>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.2.2</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
					<!-- Add frontend folder to war package -->
					<webResources>
						<resource>
							<directory>src/main/resources/auth-portal/dist/auth-portal</directory>
						</resource>
					</webResources>
				</configuration>
			</plugin>
		</plugins>
	</build>
# step 2
Copy angular project into src/main/resources folder

# step 3
add  "buildProduction": "ng build --prod --base-href /auth-portal/", to package.json file

# Step 4
Build War file
Open Java project root folder in terminal and then run "mvn clean package"
