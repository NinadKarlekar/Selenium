# Popups

## Types of popups

1.  [JavaScript_Popup](#JavaScript_Popup)
2.  [Hidden_Divison_Popup](#Hidden_Divison_Popup)
3.  [Child_Browser_Popup](#Child_Browser_Popup)
4.  [Notification_Popup](#Notification_Popup)
5.  [File_Upload_Popup](#File_Upload_Popup)
6.  [File_Download_Popup](#File_Download_Popup)
7.  [Print_Popup](#Print_Popup)


********************************************************************************
# JavaScript_Popup

- JavaScript Popup ia also called as **Alert Popups ,Confirmation Popups**.
- Characteristics
    1. we cannot inspect this popup.
    2. we cannot move this popup.
    3. This popup is located exactly below the address bar and in center of the page.
    4. It contains `OK` button(Alert) OR `OK` and `Cancel` button(Confirm). 
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