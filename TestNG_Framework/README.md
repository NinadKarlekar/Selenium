# TestNG


1.  [TestNG](#TestNG)
2.  [TestNG_Installation](#TestNG_Installation)
3.  [TestNG_Configuration](#TestNG_Configuration)

***********************

## TestNG_Installation
Steps:-
1. Open Eclipse and create java project
2. Go to Help -> Eclipse marketplace

    ![SS_Help_Marketplace](GitImages/SS_Help_Marketplace.jpg)

3. Type **testNG for eclipse** in searchbox and install.

    ![SS_testng_for_eclipse](GitImages/SS_testng_for_eclipse.jpg)

4. During Midway of installation we get a popup. Click on install anyway and after installing restart eclipse.

    ![SS_InstallAnyway](GitImages/SS_InstallAnyway.jpg)

-----------------
**If this is not working try these steps:-**

1. click on Help menu -> Click on Install new software.

2. In popup click on add button. We get add repository popup.

3. Type TestNG in **name** textfield and paste following link in **location** textfield
    ![SS_AddrepoLINK](GitImages/SS_AddrepoLINK.jpg)

```
https://testng.org/testng-eclipse-update-site
```


4. Select TestNG Checkbox and click on next and finish.

5. During Midway of installation we get a popup. Click on install anyway and after installing restart eclipse.

    ![SS_InstallAnyway](GitImages/SS_InstallAnyway.jpg)


******************************

## TestNG_Configuration

1. Right click on java project -> build path -> add libraries

    ![SS_AddLibraries](GitImages/SS_AddLibraries.jpg)

2. Select TestNG from popup click on next and finish.

    ![SS_TestNGPOPUP](GitImages/SS_TestNGPOPUP.jpg)

3. By doing this the TestNG library is added into project.


***********************
## P1

- **Code:-**

![P1](GitImages/c_P1.png)

- **Explanation:-**

    - All methods will get executed in **alphabetical** order.

- **Console**

![SS_P1_Console](GitImages/SS_P1_Console.jpg)

- **Report.html**

![SS_P1_Report](GitImages/SS_P1_Report.png)

*********************************


## P2

- **Code:-**

![c_P2](GitImages/c_P2.png)

- **Explanation:-**

    - 

- **Console**

![SS_P1_Console](GitImages/SS_P1_Console.jpg)

- **Report.html**

![SS_P1_Report](GitImages/SS_P1_Report.png)


*********************************


## MouseHoverAction

- **Scenario**

    1. Open Browser and maximize it.
    2. Go to `https://www.vtiger.com/`
    3. Hover mouse on Resources -> and click on contact us.
    3. Print the phone number in console and report.
    4. Close browser.

- **Code:-**

![c_MouseHover](GitImages/c_MouseHover.png)


- **Report.html**

![SS_MouseHover_Browser](GitImages/SS_MouseHover_Browser.jpg)

- **Explanation:-**

    - Declared driver variable in global area So that we can use it in all methods.

    ```java
        WebDriver driver;
    ```

    - Create a method called **openApp()** with @Test annotation and give **priority as 1**

    - Open browser -> Maximize window -> Give implicit wait of 15 seconds.

    ```java
        @Test(priority = 1)
        public void openApp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
    ```

    - Mandatory statements for Actions class:-
    ```java
        WebElement resources = driver.findElement(By.xpath("")); //xpath of hovering element 
        Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(resources).build().perform();
    ```

    - Reporter.log( , true) will print in **console** as well as in **report**
    ```java
        Reporter.log(contactNo.getText(),true);
    ```


*********************************************
