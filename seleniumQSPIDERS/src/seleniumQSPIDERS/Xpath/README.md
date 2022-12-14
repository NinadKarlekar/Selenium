# Xpath
Xpath are of 2 types:-
1.  [AbsoluteXpath](#AbsoluteXpath)
2.  [RelativeXpath](#RelativeXpath)
    1.  [Xpath_by_Attribute](#Xpath_by_Attribute)
    2.  [Xpath_by_TextFunction](#Xpath_by_TextFunction)
    3.  [Xpath_by_ContainsFunction](#Xpath_by_ContainsFunction)
    4.  [Xpath_by_Dependant_Independant](#Xpath_by_Dependant_Independant)
    5.  [Xpath_by_Group_Index](#Xpath_by_Group_Index)
    6.  [Xpath_by_AxesTag](#Xpath_by_AxesTag)


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
- **There are several types of Relative Xpath**
    1.  [Xpath_by_Attribute](#Xpath_by_Attribute)
    2.  [Xpath_by_TextFunction](#Xpath_by_TextFunction)
    3.  [Xpath_by_ContainsFunction](#Xpath_by_ContainsFunction)
    4.  [Xpath_by_Dependant_Independant](#Xpath_by_Dependant_Independant)
    5.  [Xpath_by_Group_Index](#Xpath_by_Group_Index)
    6.  [Xpath_by_AxesTag](#Xpath_by_AxesTag)

***********************************************
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

![xpath_Attribute](../../../Images/xpath_Attribute.png)

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

![xpath_TextFunction](../../../Images/xpath_TextFunction.png)

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

![xpath_contains_java](../../../Images/xpath_contains.png)

![xpath_contains_html](../../../Images/AbsoluteXpath.png)
*****************************************************

### Xpath_by_Dependant_Independant
- It is also called as **Xpath Traversing**.
- In this type of Xpath there are elements which changes with respect to time.
- Steps:-
    1. Write xpath for independant element.
    2. Trverse towards dependant element.
- In AbsoluteXpath syntax starts from `.`
- We use `.` for current html program / directory.
- We use `/` for child element.
- We use `/..` for parent element.
- We use `//` for desendnt element(child, grand-child, great-grand-child).
- We use `[]` to specify index value.In html index value starts from *1*.
- Example
```java
    driver.findElement(By.xpath("//a[.='JAVA']/../../td[2]/a")).click();
```

![xpath_traversing_html](../../../Images/xpath_traversing_html.png)

![xpath_traversing](../../../Images/xpath_traversing.png)
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

![groupbyhtml](https://user-images.githubusercontent.com/88243315/187042829-bfb2ee35-cd70-45f8-beb6-1abebf48f1ad.png)



![groupbyindex](https://user-images.githubusercontent.com/88243315/187042759-7efa52be-e7d0-4bfe-88b0-110872be8e17.png)



![image](https://user-images.githubusercontent.com/88243315/187042457-4ba789d2-4c0b-4926-8d0b-7b9849fedd0e.png)

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

    5. **preceding-sibling:-** This one indicates all the sibling nodes (same parent as context node) that appear before the context node
        - Syntax:-
        ```
            /preceding-sibling::tagName
        ```

- Example for Axes Tag
```java
    driver.findElement(By.xpath("//a[.='JAVA']/parent::td/following-sibling::td/child::a")).click();
```

![xpath_Axes](../../../Images/xpath_traversing_html.png)

![xpath_axes_tag](../../../Images/xpath_axes_tag.png)


******************************************************************************

[GoBackToMainFile](https://github.com/NinadKarlekar/Selenium/blob/4316f057532f7bd3089d4e841319c5ce03f9b83d/README.md)
