# Synchronization
1.  [Implicit_Wait](#Implicit_Wait)
2.  [Explicit_Wait](#Explicit_Wait)
3.  [Custom_Wait](#Custom_Wait)

**********************************************************************
# Implicit_Wait
- The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”.
- Syntax:-
```java
    driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS);
```
- Example:-
```java
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
```
*****************************************************************
# Explicit_Wait

- Syntax:-
```java
    WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
```
- Example:-
```java
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
```
*****************************************************************
# Custom_Wait

- Syntax:-
```java
    int n = val;
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