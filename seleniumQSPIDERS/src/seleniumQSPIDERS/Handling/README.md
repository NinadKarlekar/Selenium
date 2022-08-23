# Handling Elements
Xpath are of 2 types:-
1.  [Handling_Multiple_Elements](#Handling_Multiple_Elements)
1.  [Handling_Popups](#Handling_Popups)
1.  [HandlingListItems](#HandlingListItems)

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
********************************************************************************
# Handling_Popups
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