# Handling Elements
Xpath are of 2 types:-
1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)
2.  [Handling_Alerts](#Handling_Alerts)
3.  [HandlingListItems](#HandlingListItems)

1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)
1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)
1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)

**********************************************************************
# Handling_Multiple_Elements
- Syntax:-
```java
    List<WebElement> VariableName = driver.findElements(By.xpath(" "));
```
- Example:-
```java
    List<WebElement> allautosugg = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
    System.out.println("total number of auto suggetions " + allautosugg.size());
```
- Scenario:-
    1. Open browser and go to google.
    2. Type java in SearchBox
    3. Count number of autosuggetions.
    4. print all auto-suggetions.
    5. click on 4th autosuggetion.
    6. Close the browser
![google autosugg](https://user-images.githubusercontent.com/88243315/186228748-f3bc51b3-1330-45e5-8747-05258845eace.png)

********************************************************************************
# Handling_Alerts
- An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
- It notifies the user with some specific information or error, asks for permission to perform certain tasks and it also provides warning messages as well.
- Here are few alert in Selenium types:-
    1. **Simple alert:-** The simple alert class in Selenium displays some information or warning on the screen.
    ![image](https://user-images.githubusercontent.com/88243315/186227814-0fdb51df-eab7-482b-b10c-16d7858de84f.png)


    2. **Prompt Alert:-** This Prompt Alert asks some input from the user and Selenium webdriver can enter the text using sendkeys(” input….“).
    ![image](https://user-images.githubusercontent.com/88243315/186227926-2274e28d-c258-4ec0-9072-90fd3c4b3ed0.png)


    3. **Confirmation Alert:-** This confirmation alert asks permission to do some type of operation.
    ![image](https://user-images.githubusercontent.com/88243315/186227981-ac8b9120-459d-46d6-945d-4f1b1a36d492.png)


- There are 4 ways to handle Alert 
    1.  **dismiss():-** To click on the **'Cancel'** button of the alert.
    ```java
        driver.switchTo().alert().dismiss();
    ```

    2.  **accept():-** To click on the **'OK'** button of the alert.
    ```java
        driver.switchTo().alert().getText();
    ```

    3.  **getText():-** To capture the alert message.
    ```java
        driver.switchTo().alert().accept();
    ```

    4.  **sendKeys(String stringToSend) :-** To send some data to alert box.
    ```java
        driver.switchTo().alert().sendKeys("Text");
    ```
 ![alerts](https://user-images.githubusercontent.com/88243315/186230279-baca9bb2-da0d-4b05-8447-7c1c5804f2e9.png)


**************************************************************
# HandlingListItems
- List items can be handled by following ways:-
    1. **selectByIndex()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.selectByIndex(0);
    ```

    2. **selectByValue()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.selectByValue("vt");
    ```

    3. **selectByVisibleText()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.selectByVisibleText("Cake");
    ```
    
    4. **deselectByIndex()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.deselectByIndex(0);
    ```
    
    5. **deselectByValue()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.deselectByValue("vt");
    ```
    
    6. **deselectByVisibleText()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.deselectByVisibleText("Cake");
    ```
    
    7. **deselectAll()**
    - Example
    ```java
        s1 = new Select(driver.findElement(By.id("taj")));
        s1.deselectAll();
    ```

![listitems](https://user-images.githubusercontent.com/88243315/186230224-d988b5c2-d576-45e0-b1cc-ca2b3a98300d.png)

