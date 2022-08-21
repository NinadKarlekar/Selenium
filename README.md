# Selenium
Selenium Qspiders on eclipse with JAVA

1.  [get()](#get)
2.  [getTitle()](#getTitle)
3.  [getCurrentUrl()](#getCurrentUrl)
4.  [getPageSource()](#getPageSource)
5.  [manage()](#manage)
6.  [switchTo()](#switchTo)
7.  [navigate()](#navigate)
8.  [close()](#close)
9.  [quit()](#quit)
10.  [getWindowHandle](#getWindowHandle)
11.  [getWindowHandles](#getWindowHandles)

12. [findElement](#findElement)
    - [Fb login with findElement by id and name](#Fb_login_with_findElement_by_id_and_name)
    - [Fb login with findElement by cssSelector](#Fb_login_with_findElement_by_cssSelector)
    - [link access with findElement by linktext](#link_access_with_findElement_by_linktext)
    - [link access with xpath](#xpath1)
        - [link access with Absolute xpath](#AbsoluteXpath)
        - [link access with Relative xpath](#RelativeXpath)
13. [findElements](#findElements)




## get
- It is used to enter url
- It also waits till first page is completly loaded
- Syntax:-
```java
    driver.get("url");
```
*********************************

## getTitle
- It is used to fetch title of page
- Syntax:-
```java
    String title = driver.getTitle(); //getTitle()
    System.out.println("\nTitle of Page is:- "+title);
```
*********************************

## getCurrentUrl
- It is used to fetch url of current page
- Syntax:-
```java
    String url = driver.getCurrentUrl(); //getCurrentUrl()
    System.out.println("\nurl of Page is:-"+ url);
```
*********************************

## getPageSource
- It is used to fetch html code of current page
- Syntax:-
```java
		String page = driver.getPageSource(); //getPageSource()
		System.out.println("\nSource code of Page is:- "+page);
```

**************************************

## manage
- This method is used to maximize or minimize window
- Syntax:-
```java
		driver.manage().window().maximize();  //manage()
		driver.manage().window().minimize();
```
*********************************
## close
- The close() method is a Webdriver command that closes the browser window **currently in focus**.
- Syntax:-
```java
		driver.close();
```

*********************************
## quit
- The quit() command quits the entire browser session with **all its tabs and windows.**.
- Syntax:-
```java
		driver.quit();
```

*********************************

## get() , getTitle() , getCurrentUrl() , getPageSource() , manage() **CODE AND OUTPUT**
![get get](https://user-images.githubusercontent.com/88243315/183307855-7f0ea5b7-a162-4fb5-8214-b480875241b0.png)
![image](https://user-images.githubusercontent.com/88243315/183306372-f4fa19dc-ead4-4a5d-9c50-0a31817c5ad4.png)

*********************************



## switchTo
- switchTo() method is used to type text in active element.
- Any element where cursor is blinking is called Active element.
- Syntax:-

*********************************

## navigate
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
- set: helps to set the window handles which is in the form of a string.```  set<string> set= driver.get.windowhandles()```
![getwindowhandles](https://user-images.githubusercontent.com/88243315/183307832-43629bd6-d408-4ff3-aaae-c792be8bb1b1.png)


*********************************
## findElement
- A command used to uniquely identify a web element within the web page.
- Returns the first matching web element if multiple web elements are discovered by the locator
- Throws NoSuchElementException if the element is not found
- Detects a unique web element


## findElements
- A command used to identify a list of web elements within the web page.
- Returns a list of multiple matching web elements
- Returns an empty list if no matching element is found
- Returns a collection of matching elements
- findElement() and findElements() have 8 locators
- Syntax for findElements()
```java
    List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));
```
- Example
```java
    List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
```
## **Locators**
1.  [id()](#id)
2.  [name()](#name)
3.  [className()](#className)
4.  [tagName()](#tagName)
5.  [linkText()](#linkText)
6.  [partialLinkText()](#partialLinkText)
7.  [cssSelector()](#cssSelector)
8.  [xpath()](#xpath)

### id
- ID is uniquely defined for each element 
- driver will locate an element by "id" attribute
- Syntax:-
```java
    driver.findElement(By.id(" "));
```
- Example
```java
    WebElement loginTB = driver.findElement(By.id("email"));
```
- Where `email` is **'id'**.
******************************************************
### name
- driver will locate an element by "name" attribute.
- Syntax:-
```java
    driver.findElement(By.name(" "));
```
- Example
```java
    driver.findElement(By.name("login"));
```
- Where `login` is **'name'**.
******************************************************
### className
- Syntax:-
```java
    driver.findElement(By.className(" "));
```
- Example
```java
    driver.findElement(By.className("inputtext _55r1 _6luy"));	
```
- Where `inputtext _55r1 _6luy` is **'ClassName'**.
******************************************************
### tagName
- Syntax:-
```java
    driver.findElement(By.tagName(" "));
```
- Example
```java
    WebElement loginBtn = driver.findElement(By.name("login"));
```
- Where `login` is **'name'**.
******************************************************
### linkText
- LinkText is helpful to find links in a webpage. It is the most efficient way of finding web elements containing links.
- Syntax:-
```java
    driver.findElement(By.linkText(" "));
```
- Example
```java
    WebElement loginBtn = driver.findElement(By.name("login"));
```
******************************************************
### partialLinkText
- Syntax:-
```java
    driver.findElement(By.partialLinkText(" "));
```
- Example
```java
    WebElement loginBtn = driver.findElement(By.name("login"));
```
******************************************************
### cssSelector
- CSS Selectors are one of the locator strategies offered by Selenium to identify the web elements. 
- The CSS Selectors mainly use the character sequence pattern, which identifies the web elements based on their HTML structure.
- Syntax:-
```java
    tag[Attribute_Name = 'Attribute_value']
```
- CSS Selectors can be created based on the following ways:
    1.  [id_attribute](#idAttribute)
    2.  [class_attribute](#classAttribute)
    3.  [OtherAttribute](#OtherAttribute)
    4.  [CombiningAttribute](#CombiningAttribute)

#### idAttribute
- Syntax
```java
    tag[id = 'id_value']
```
- Example:-
```java
    //For password TextField in facebook login page
    driver.findElement(By.cssSelector("input[id='pass']"));
                        //OR
    driver.findElement(By.cssSelector("input#pass"));
```
- Where `pass` is **'id'**.
- The `'#'`sign symbolizes the **'ID'** in CSS Selector.

**********************************
#### classAttribute
- Syntax
```java
    tag[class = 'class_value']
```
- Example:-
```java
    //For password TextField in facebook login page
    driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']"));
                        //OR
    driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi"));
```
- Where `inputtext _55r1 _6luy _9npi` is **'className'**.
- The `.`dot sign symbolizes the **'class'** in CSS Selector.
************************************
#### OtherAttribute
- Apart from the id and class attributes, all other attributes present within the HTML tag of the element can also be used to locate web elements using the CSS Selectors.
- Syntax:-
```java
    tag[Attribute_Name = 'Attribute_value']
```
- Example
```java
    WebElement loginTB = driver.findElement(By.cssSelector("input[type='text']"));
	loginTB.sendKeys("bamlutuyde@vusra.com");
```
- Where `input` is `tag`.
- `type` is `Attribute_Name`.
- `text` is `Attribute_value`.
******************************************************
#### CombiningAttribute
- we combine multiple attributes to precisely locate any element present on the web page.

    1. Combine the **ID** and **other Attributes**
        - Syntax:-
            ```java
                tag#ID_Value[Other_AttributeName='Other_AttributeValue']
            ```
        - Example
            ```java
                input#pass[placeholder='Password']
            ```
        - where
            - `input` is **'tagName'**
            - `pass` is **'ID_Value'**
            - `placeholder` is **'Other Attribute Name'**
            - `Password` is **'Other Attribute Value'**
        ```java
            driver.findElement(By.cssSelector("input#pass[placeholder='Password']"));
        ```


    2. Combine the **Class** and **other Attributes**
        - Syntax:-
            ```java
                tag.Class_Value[Other_AttributeName='Other_AttributeValue']
            ```
        - Example
            ```java
                input.inputtext _55r1 _6luy _9npi[placeholder='Password']
            ```
        - where
            - `input` is **'tagName'**
            - `inputtext _55r1 _6luy _9npi` is **'class_Value'**
            - `placeholder` is **'Other Attribute Name'**
            - `Password` is **'Other Attribute Value'**   
        ```java
            driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[placeholder='Password']"));
        ```

**************************************************
### xpath
- Syntax:-
```java
    driver.findElement(By.xpath(" "));
```
******************************************************
### Fb_login_with_findElement_by_id_and_name


driver.findElement(By.className(" "));

driver.findElement(By.tagName(" "));

driver.findElement(By.linkText(" "));
********************************************************
## Fb_login_with_findElement_by_cssSelector
- tag[attribute name='attribute value']




***************************************************************
## link_access_with_findElement_by_linktext


 
***************************************************************


## xpath1
Xpath is having 2 types:-
1. Absolute Xpath
2. Relative Xpath

### AbsoluteXpath
![xpath1](https://user-images.githubusercontent.com/88243315/183301525-5aba36e7-e525-452d-b421-6cc29890ab55.png)

### RelativeXpath

- link.html file
![linkhtml](https://user-images.githubusercontent.com/88243315/183301642-8c39b684-cfa0-42fe-b463-5263d93c4d9f.png)
![WhatsApp Image 2022-08-07 at 8 44 19 PM](https://user-images.githubusercontent.com/88243315/183306551-ebe126c7-3227-47dd-bd34-808b153118b8.jpeg)



Element | Absolute Xpath | Relative Xpath
--- | --- | ---
*Google* | `./html/body/div[1]/a[1]` | `//div[1]/a[1]`
*T3* | `./html/body/div[2]/input[2]` | `//input[2]`
*Google , FB* | `./html/body/div[1]/a` | `//div[1]/a`
*Google ,Amazon* | `./html/body/div/a[1]` | `//a[1]`
*T1 ,T2 ,T3* | `./html/body/div/input` | `//input`
*T1 ,T2* | `./html/body/div/input[1]` | `//input[1]`
*Google ,FB ,Amazon* | `./html/body/div/a` | `//a`

***************************************************************
