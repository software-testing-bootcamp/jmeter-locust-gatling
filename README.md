# Performance Testing with JMeter, Locust and Gatling

"Software Testing Bootcamp" is a community of people interested in software testing. We record the weekly webinars that we organize and publish them on Youtube. For more information -> https://testingbootcamp.com/

**Youtube Webinar Video:**

https://youtu.be/PhBUx1Uwwsg

![image](https://user-images.githubusercontent.com/89974862/137537135-9bc84d3a-09bc-4767-bbe1-21bd2f3d9b27.png)

******

![image](https://user-images.githubusercontent.com/89974862/140658380-6a1a48dc-dd7a-4a3c-969f-aec78762831f.png)

**Jmeter Requirements:**

* Java JRE or JDK Installation (Requires Java 8+)

https://www.oracle.com/tr/java/technologies/javase-downloads.html 

* Download latest release of JMeter (Binaries -> zip extension) and unzip file.

https://jmeter.apache.org/

* Download plugins-manager.jar and put it into JMeter's lib/ext directory, then restart JMeter.

https://jmeter-plugins.org/install/Install/


**How to run Jmeter test with GUI support?**

1. Start bin/jmeter.sh on MacOS or bin/jmeter.bat file Windows OS.
2. Open Jmeter/demoblaze.jmx file from Jmeter GUI
3. Use Thread Group to set your virtual user load and test time.
4. Start your test and view Test Results on listeners (View Results Tree, Aggregate Graph, ...)

![image](https://user-images.githubusercontent.com/89974862/140658217-a78baff2-36ea-46a4-9b29-4afce1e6fcb9.png)


**How to run Jmeter test from Terminal or Command Prompt?**

1. Start Terminal or Command Prompt
2. Start Jmeter Load Test from Command-line with full paths for jmeter.sh , JMX file and the JTL file for the results.
sh /Users/ozgur.kaya/Downloads/apache-jmeter-5.4.1/bin/jmeter -n -t /Users/ozgur.kaya/Downloads/demoblaze.jmx -l /Users/ozgur.kaya/Downloads/jmeterTestResults.jtl

![image](https://user-images.githubusercontent.com/89974862/140658276-f8a2fde1-7ff3-4579-a13a-6c4c7377d126.png)


**NOTE:** If you got some Copy-Paste issues on JMeter please change your Jmeter theme by clicking Options -> Look and Feel -> System

******

![image](https://user-images.githubusercontent.com/89974862/140658350-bd40837a-8045-46b6-9d00-3088774c3b6b.png)


**Locust Requirements:**

* Install Python 3.6 or later https://docs.python-guide.org/starting/installation/

* Install locust from terminal

pip3 install locust

* Optionally you need an IDE for the development. We will use Visual Studio Code in this example. Do not forget to install Python plugin for the VS Code.

https://code.visualstudio.com/download


**How to run Locust test without configuration file?**

1. Open terminal and navigate to your downloaded Locust/no-config/locustfile.py file.
cd /Users/ozgur.kaya/Downloads/Locust/no-config
2. Type "locust" and press ENTER.
![image](https://user-images.githubusercontent.com/89974862/140657943-c5e7ea1c-388c-4e42-953a-dbaba4d7cc3c.png)
3.Open your browser and type this URL to visit "http://0.0.0.0:8089/". Set number of users to 100, set spawnrate to 100 and set host as "https://www.demoblaze.com/"
![image](https://user-images.githubusercontent.com/89974862/140657969-769e7124-b8ca-465b-a463-219f1e1a23a0.png)
4. You can view the test while it's running.

**How to run Locust test with configuration file?**

1. Open terminal and navigate to your downloaded Locust/with-config/DemoBlaze.py file.
cd /Users/ozgur.kaya/Downloads/Locust/with-config
2. Type "locust" and press ENTER. The test will start at that moment. No need to trigger from UI.
3. Open your browser and type this URL to visit "http://0.0.0.0:8089/". 
4. You can view the test while it's running.
5. You can change the test settings from this downloaded file Locust/with-config/locust.conf

![image](https://user-images.githubusercontent.com/89974862/140658167-503ef07c-a860-4dfb-a22a-3caff5a6f252.png)
![image](https://user-images.githubusercontent.com/89974862/140658198-d2529b16-ece6-435b-9f61-ac776fb4568a.png)

******

![image](https://user-images.githubusercontent.com/89974862/140658505-dfc08532-c97a-4ca0-a276-6a2224184892.png)

**Gatling Requirements:**

* Install Java JDK
https://www.oracle.com/tr/java/technologies/javase-downloads.html 

* Install Brew as described in that URL -> https://brew.sh/

* Install Scala with this command from Terminal
brew install scala

* Download Gatling Open-source from this URL. And extract the zipped file on our computer. ("gatling-charts-highcharts-bundle-x.x.x-bundle.zip")
https://gatling.io/open-source/

* Optionally you need an IDE for the development. We will use IntelliJ IDEA in this example. Do not forget to install Scala plugin for the IntelliJ.

https://www.jetbrains.com/idea/download/

![image](https://user-images.githubusercontent.com/89974862/140658940-ae9841f0-772b-452b-a036-1e3be63d2648.png)



**How to run Gatling test from Terminal?**

1. Copy Gatling/user-files into your gatling-charts-highcharts-bundle-x.x.x-bundle unzipped folder and overwrite them.
2. Open terminal window and navigate to your user-files directory.
cd /Users/ozgur.kaya/Downloads/gatling-charts-highcharts-bundle-3.6.1/user-files
3. Run the gatling command.
sh /Users/ozgur.kaya/Downloads/gatling-charts-highcharts-bundle-3.6.1/bin/gatling.sh
4. Choose **DemoBlaze** as your simulation number. In this example we will type 0 for this.
5. Press ENTER for the run description.
6. You can watch your test on command line while running.
7. After test has been finished You can open index.html file to inspect test results with graphs.
Example Path:
/Users/ozgur.kaya/Downloads/gatling-charts-highcharts-bundle-3.6.1/results/demoblaze-20211104165049624

![image](https://user-images.githubusercontent.com/89974862/140658971-37eef7e1-8a6e-49f5-b7db-79ba7caf7b4b.png)

![image](https://user-images.githubusercontent.com/89974862/140659120-94588a2c-c9d8-47d8-971e-e67d4f755d62.png)
