# Selenium
Selenium Qspiders on eclipse with JAVA

1.  [get()](#get())
1.  [getTitle()](#getTitle())
1.  [getCurrentUrl()](#getCurrentUrl())
1.  [getPageSource()](#getPageSource())
1.  [getPageSource()](#getPageSource())
1.  [manage()](#manage())



1.  [getWindowHandles](#getWindowHandles)

1.  [Fb login with findElement by id and name](#Fb_login_with_findElement_by_id_and_name)
2.  [Fb login with findElement by cssSelector](#Fb_login_with_findElement_by_cssSelector)
3.  [link access with findElement by linktext](#link_access_with_findElement_by_linktext)
3.  [link access with xpath 1](#xpath1)


## get()
- It is used to enter url
- It also waits till first page is completly loaded
- Syntax:-
```java
    driver.get("url");
```
*********************************

## getTitle()
- It is used to fetch title of page
- Syntax:-
```java
    String title = driver.getTitle(); //getTitle()
    System.out.println("\nTitle of Page is:- "+title);
```
*********************************

## getCurrentUrl()
- It is used to fetch url of current page
- Syntax:-
```java
    String url = driver.getCurrentUrl(); //getCurrentUrl()
    System.out.println("\nurl of Page is:-"+ url);
```
*********************************

## getPageSource()
- It is used to fetch html code of current page
- Syntax:-
```java
		String page = driver.getPageSource(); //getPageSource()
		System.out.println("\nSource code of Page is:- "+page);
```

**************************************

## manage()
- This method is used to maximize or minimize window
- Syntax:-
```java
		driver.manage().window().maximize();  //manage()
		driver.manage().window().minimize();
```
*********************************

## get() , getTitle() , getCurrentUrl() , getPageSource() , manage() **CODE AND OUTPUT**
![get get](https://user-images.githubusercontent.com/88243315/183307855-7f0ea5b7-a162-4fb5-8214-b480875241b0.png)
![image](https://user-images.githubusercontent.com/88243315/183306372-f4fa19dc-ead4-4a5d-9c50-0a31817c5ad4.png)

*********************************



## switchTo()
- switchTo() method is used to type text in active element.
- Any element where cursor is blinking is called Active element.
- Syntax:-

*********************************

## navigate()
- Navigation commands are those commands in Selenium that are used to perform different operations such as backward, forward, refresh, wait, etc in the browser’s history.
- It has 3 types

    1. **Navigate forward:** This method is used to move forward by one page on the browser’s history.
        * Syntax:
    ```java
    driver.navigate().forward();
    ```
    2. **Navigate Back :**  This method is used to move back by one page on the browser’s history. 
        * Syntax:
    ```java
    driver.navigate().back();
    ```
    3. **To Command:**  This method is used to navigate the URL of the web page in the current browser window. It will just navigate to the web page but not wait till the whole page gets loaded.
        * Syntax: 
    ```java
    driver.navigate().to(URL);
    ```
    4. **To refresh:** This method is used to refresh the current web page.
        * Syntax:
    ```java
    driver.navigate().refresh();
    ```


*********************************


## getWindowHandles

- get.windowhandle(): helps in getting the window handle of the current window
- get.windowhandles(): helps in getting the handles of all the windows opened
- set: helps to set the window handles which is in the form of a string.  set<string> set= driver.get.windowhandles()
![getwindowhandles](https://user-images.githubusercontent.com/88243315/183307832-43629bd6-d408-4ff3-aaae-c792be8bb1b1.png)


*********************************

## Fb_login_with_findElement_by_id_and_name

![byidname](https://user-images.githubusercontent.com/88243315/183301543-461357b2-a43c-4cac-b1e8-b26280feb44c.png)


********************************************************
## Fb_login_with_findElement_by_cssSelector
- tag[attribute name='attribute value']
![cssselector](https://user-images.githubusercontent.com/88243315/183301536-42550764-13a1-45dc-aafd-32a8a36e79dc.png)


***************************************************************

## link_access_with_findElement_by_linktext




***************************************************************


## xpath1
- Here we used link.html file to test
![xpath1](https://user-images.githubusercontent.com/88243315/183301525-5aba36e7-e525-452d-b421-6cc29890ab55.png)

- link.html file
![linkhtml](https://user-images.githubusercontent.com/88243315/183301642-8c39b684-cfa0-42fe-b463-5263d93c4d9f.png)
![WhatsApp Image 2022-08-07 at 8 44 19 PM](https://user-images.githubusercontent.com/88243315/183306551-ebe126c7-3227-47dd-bd34-808b153118b8.jpeg)


***************************************************************

