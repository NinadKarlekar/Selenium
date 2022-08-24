# Synchronization
1.  [Implicit_Wait](#Implicit_Wait)
2.  [Explicit_Wait](#Explicit_Wait)
3.  [Custom_Wait](#Custom_Wait)
*******************************************************************
## Scenario
- Open browser and go to ```https://demo.actitime.com/login.do```
- Type username as ```admin``` and password as ```manager```.
- Click on <ins>login</ins> button.
- Click on <ins>logout</ins> button.
**********************************************************************
## Implicit_Wait
- The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”.
![image](https://user-images.githubusercontent.com/88243315/186238885-ad0f8d3d-48e4-4ddd-8df3-fc0ee4f0128d.png)

- Syntax:-
```java
    driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS);
```
- Example:-
```java
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
```
- The above statment should be written immediatly after opening browser.
*****************************************************************
## Explicit_Wait

![image](https://user-images.githubusercontent.com/88243315/186239686-294a8cd8-687d-4496-ac01-2b536844166c.png)

- Syntax:-
```java
	WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
```
- Example:-
```java
    WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
```
*****************************************************************
## Custom_Wait

- Syntax:-
```java
    int n = 1;
		while (true) {
			try {
				driver.findElement(By.id(" ")).click();
				break;
			} catch (Exception e) {
				System.out.println("Trying for " + (n++) + " time");
			}
		}
```
- Example:-
```java
    int n = 1;
		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {
				System.out.println("Trying for " + (n++) + " time");
			}
		}
```
*****************************************************************
