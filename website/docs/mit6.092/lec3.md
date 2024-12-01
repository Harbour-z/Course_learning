# Lecture 3: Loops, Arrays
Topics include: good programming style, frequent issues, loops and arrays.
## Signature of the main method
The signature of the main method cannot be modified.

主方法的签名指的是方法的名称和参数类型的组合，其是由语言的规范严格定义的，不能随意更改。在 Java 中，主方法的签名：
```Java
public static void main(String[] args)
```
之所以不能被修改，是由于编译器或运行时环境依赖这种标准的签名来找到并执行程序的入口点。如果更改了签名，如改变返回类型等，编译器或运行时环境将无法正确识别主方法，这样程序就无法启动。
## Return values
If you declare that the method is not void, then it has to return something.

## Good Programming Style
The goal of good style is to make your code more readable.
So you should better remember the following rules:
* use meaningful names
* use indentation(缩进)-   Ctrl-Shift-F to auto-format the file
* Put whitespaces in complex expressions and Put blank lines to improve readability
*  Don't duplicate tests .(不要编写重复测试)

## Loop
 Continue skips the current iteration of a loop and proceeds directly to the next iteration  
## Arrays
An array is an indexed list of values and All elements of an array must have the same type.
The index starts at zero and ends at length-1.
An array is defined using TYPE[ ] :
```Java
int[] values1;
int[][] values2;
int[] values3 = new int[5];
int[] values4 = {23,45,35,23,1};
int size = values4.length;
```
