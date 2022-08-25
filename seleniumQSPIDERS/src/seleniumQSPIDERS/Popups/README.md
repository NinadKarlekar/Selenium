# Handling Elements

1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)
2.  [Handling_Alerts](#Handling_Alerts)
3.  [HandlingListItems](#HandlingListItems)


********************************************************************************
# Handling_Alerts




- There are 4 ways to handle JavaScript Popup:-

    1.  **dismiss():-** To click on the **'Cancel'** button of the alert.
    ```java
        driver.switchTo().alert().dismiss();
    ```

    2.  **accept():-** To click on the **'OK'** button of the alert.
    ```java
        driver.switchTo().alert().accept();
    ```

    3.  **getText():-** To fetch text from the popup.
    ```java
        driver.switchTo().alert().getText();
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

![HTMLlistitemsHTML](https://user-images.githubusercontent.com/88243315/186495029-493d31ae-4a3e-4deb-a416-28d9878483e3.png)


