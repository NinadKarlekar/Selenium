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
	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
```
