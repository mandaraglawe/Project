Here I have automated the "Sell Your Phone" functionality for www.oruphones.com
I have created a maven project and in the src/main folder I have created 2 packages named PageObjectModels and Resources
In the pageObjectModel package I have created a class in which all the webelements are stored , the main reason for this is that if in future a developer makes some changes in the code then we dont have to go in each class individually to change the locationg technique, Instead we can just make the changes to the PageObjectModel class.
In the resources package I have created a data.properties file in which  I have initialized the browser and also created a base class where I have written a code to initialize various browsers based on the browser selected in data.properties file, The main reason to create this was to felicitate cross broswer testing. So if we want to test our application on a different browser just change the browser name in data.properties file.
In the src/test folder I have created a class for automating the sellYourPhone Functionality.

