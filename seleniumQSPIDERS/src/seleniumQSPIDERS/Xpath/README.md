# Xpath
Xpath are of 2 types:-
1.  [AbsoluteXpath](#AbsoluteXpath)
2.  [RelativeXpath](#RelativeXpath)
    1.  [Xpath_by_Attribute](#Xpath_by_Attribute)
    2.  [Xpath_by_TextFunction](#Xpath_by_TextFunction)
    2.  [Xpath_by_ContainsFunction](#Xpath_by_ContainsFunction)
    2.  [Xpath_by_Dependant_Independant](#Xpath_by_Dependant_Independant)
    2.  [Xpath_by_TextFunction](#Xpath_by_TextFunction)


## AbsoluteXpath
- In AbsoluteXpath syntax starts from `.`
- We use `.` for current html program / directory.
- We use `/` for child element.
- We use `/..` for parent element.
- We use `//` for desendnt element(child, grand-child, great-grand-child).
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
    3.  [Xpath_by_ContainsFunction](#Xpath_by_ContainsFunction)
    4.  [Xpath_by_Dependant_Independant](#Xpath_by_Dependant_Independant)
    5.  [Xpath_by_Group_Index](#Xpath_by_Group_Index)
    6.  [Xpath_by_AxesTag](#Xpath_by_AxesTag)


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
*****************************************************

### Xpath_by_Dependant_Independant
- It is also called as **Xpath Traversing**.
- In this type of Xpath there are elements which changes with respect to time.
- Steps:-
    1. Write xpath for independant element.
    2. Trverse towards dependant element.

************************************************

### Xpath_by_Group_Index
- In this type of xpath, we specify the xpath within **common brackets** `()`.
- By doing this an xpath array is generated starting with index `1`.
- Unique indexes are given for every matching element.
- At end of xpath we specify the index value within **Square Brackets** `[]`.
- Syntax:-
```
    (//tagName)[IndexValue];
```
- Example:-
```java
    driver.findElement(By.xpath("(//a)[1]")).click(); //For Link 1 a[1] Google
```

******************************************************
### Xpath_by_AxesTag
- Different XPath Axes Used In Selenium Testing:-
    1. **child:-** This indicates the children of the context node
        - Syntax:-
        ```
            /child::tagName
        ```

    2. **parent:-** This indicates the parent of the context node
        - Syntax:-
        ```
            /parent::tagName
        ```

    3. **descendent:-** This indicates the children, grandchildren, and their children (if any) of the context node.
        - Syntax:-
        ```
            /descendant::tagName
        ```

    4. **following-sibling:-** This one indicates all the sibling nodes (same parent as the context node) that appear after the context node .
        - Syntax:-
        ```
            /following-sibling::tagName
        ```

    5. preceding-sibling:- This one indicates all the sibling nodes (same parent as context node) that appear before the context node
        - Syntax:-
        ```
            /preceding-sibling::tagName
        ```
- Example for Axes Tag
```java
    driver.findElement(By.xpath("//a[.='JAVA']/parent::td/following-sibling::td/child::a")).click();
```