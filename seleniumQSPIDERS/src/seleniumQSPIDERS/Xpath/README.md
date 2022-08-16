# Xpath
Xpath are of 2 types:-
1.  [AbsoluteXpath](#AbsoluteXpath)
2.  [RelativeXpath](#RelativeXpath)


## AbsoluteXpath
- In AbsoluteXpath syntax starts from `.`
- We use `.` for current html program / directory.
- We use `/` for child element.
- We use `/..` for parent element.
- We use `//` for desendnt element.
- eg. 
    ```java
		WebElement a1 = driver.findElement(By.xpath("./html/body/div[1]/a[1]"));
		a1.click();
    ```
