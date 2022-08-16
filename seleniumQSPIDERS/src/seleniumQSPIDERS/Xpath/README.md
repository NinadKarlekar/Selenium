# Xpath
Xpath are of 2 types:-
1.  [AbsoluteXpath](#AbsoluteXpath)
2.  [RelativeXpath](#RelativeXpath)
    1.  [AbsoluteXpath](#AbsoluteXpath)
    2.  [RelativeXpath](#RelativeXpath)


## AbsoluteXpath
- In AbsoluteXpath syntax starts from `.`
- We use `.` for current html program / directory.
- We use `/` for child element.
- We use `/..` for parent element.
- We use `//` for desendnt element(child, grand-child, great f=grand-child).
- We use `[]` to specify index value.In html index value starts from *1*.
- eg. 
```java
	WebElement a1 = driver.findElement(By.xpath("./html/body/div[1]/a[1]"));
	a1.click();
```
*********************************************************************

## RelativeXpath
- Relative Xpath starts with `//` .
- We use `//` for desendnt element(child, grand-child, great f=grand-child).
- eg. 
```java
    //For link 1 GOOGLE
	driver.findElement(By.xpath("//div[1]/a[1]")).click();
```
- There are several types of Relative Xpath
1.  [Xpath_by_Attribute](#Xpath_by_Attribute)
2.  [Xpath_by_TextFunction](#Xpath_by_TextFunction)
2.  [Xpath_by_ContainsFunction](#Xpath_by_ContainsFunction)
2.  [Xpath_by_Dependant_Independant](#Xpath_by_Dependant_Independant)


### Xpath_by_Attribute
- XPath expression select nodes or list of nodes on the basis of attributes like ID , Name, Classname, etc.
- Syntax:-
```
    //tag[@AttributeName='AttributeValue']
```
- Example:-
```java
    //To find Login TextBox in Facebook login page.
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bamlutuyde@vusra.com");
```
**************************************************************************

### Xpath_by_TextFunction
- Syntax:-
```
    //tag[.='text Value']
            **OR**
    //tag[text()='text Value']
            **OR**
    //*[text()='text Value']
```
- Example:-
```java
    //To find password TextBox in Facebook login page.
	driver.findElement(By.xpath("//span[.='Log Out']")).click();
                    //OR
	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
                    //OR
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
```
**************************************************************************

### Xpath_by_ContainsFunction
- The contain feature has an ability to find the element with partial text.
- Contains Method has 2 types:-
    ##### 1. Attributes
    - Syntax:-
    ```
        //tag[contains(@AttributeName,'Partial Attribute Value')]
    ```
    - Example:-
    ```java
    	driver.findElement(By.xpath("//a[contains(@href,'google')]")).click();
    ```

    ##### 2. Text
    - Syntax:-
    ```
        //tag[contains(text(),'Partial Text Value')]

                        **OR**

        //tag[contains(.,'Partial Text Value')]
    ```
    - Example:-
    ```java
    	driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();

        driver.findElement(By.xpath("//a[contains(.,'Amazon')]")).click();
    ```