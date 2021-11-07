# Performance Testing with JMeter, Locust and Gatling

"Software Testing Bootcamp" is a community of people interested in software testing. We record the weekly webinars that we organize and publish them on Youtube. For more information -> https://testingbootcamp.com/

**Youtube Webinar Video:**

https://youtu.be/PhBUx1Uwwsg

![image](https://user-images.githubusercontent.com/89974862/137537135-9bc84d3a-09bc-4767-bbe1-21bd2f3d9b27.png)


**Jmeter Requirements:**

* Java JRE or JDK Installation (Requires Java 8+)

https://www.oracle.com/tr/java/technologies/javase-downloads.html 

* Download latest release of JMeter (Binaries -> zip extension) and unzip file.

https://jmeter.apache.org/

* Download plugins-manager.jar and put it into JMeter's lib/ext directory, then restart JMeter.

https://jmeter-plugins.org/install/Install/

******

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

******

**NOTE:** If you got some Copy-Paste issues on JMeter please change your Jmeter theme by clicking Options -> Look and Feel -> System


**Locust Requirements:**

* Install Python 3.6 or later https://docs.python-guide.org/starting/installation/

* Install locust from terminal

pip3 install locust

* Optionally you need an IDE for the development. We will use Visual Studio Code in this example. Do not forget to install Python plugin for the VS Code.

https://code.visualstudio.com/download

******

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

