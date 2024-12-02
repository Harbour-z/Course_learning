# Lecture4: Classes and Objects
## Lecture Topic
1. OOP-Object Oriented Programming
2. Defining Classes
3. Using Classes
4. References vs Values
5. Static tyoes and Methods
## Debugging Notes
* Use System.out.println throughout your code to see what is's doing.
* 注意格式化方便阅读

## Java的面向对象
抽象出一类或一组对象的共性，以下是一个Class的定义与实例化的过程：
```Java
public class Baby {
  String name;
  boolean isMale;
  double weight;
  double decibels;
  int numPoops = 0;
  void poop(){
    numPoops+=1;
  }
}

// instance
Baby mybaby = new Baby();
```
总的来说，一个类应该是由成员变量fields和方法methods组成的。


**Note**：
1. 类名首字母大写，且需要与文件名保持一致；
2. 1 Class = 1 File，也就是一个文件就是一个类，类中可以继续定义类；
3. 类中有`main`方法表示这个类是可运行的。
   
## 类的构造方法/构造器-Constructor
### 构造器定义
* 构造器名与类名相同
* 没有返回类型，也即无需返回任何东西
* 构造器通常初始化类的字段(成员变量)，它被自动调用时主要目的是为类的成员对象fields分配初始值。也即我们给构造器传入参数或者自定义参数，而构造器外只定义没有初始化的字段，这种有利于代码的规范性。
* 所有类都有至少一个构造器(多个的时候会根据传入参数长度不同进行不同的构造)，没有显式子写出的话会执行默认定义：
```Java
ClASSNAME (){

}
```
### 类的使用
* 字段fields获取：`Object.FieldName`
* 方法调用：`Object.MethodName([Arguments])`

## 值与引用-References and Values
### Primitives and References
* Primitive types是Java的基本类型
  * int, long, double, boolean, char, short, byte, float
  * 真实值存储在变量中
* Reference type是数组和对象
  * String, int[], Baby
### Java存储Primitives和Objects
变量可任意存储基本类型，但是objects不能被变量存储，变量存储的只是可以确定对象位置的数字。
![](images\pri.png)   ![](images\obj.png)

Objects的位置就叫引用reference，用`==`可以比较引用。
### Reference
* 用`[]`或`.`
  * 这样操作时，会跟随引用指向的对象，意味着会直接追踪到对象本身
  * 这种操作会可以改变对象的属性，但是引用本身不会变。

!!!info
    引用类似指针，是用于操作对象的数据类型，比指针更安全。引用不是对象，它只是访问对象的一种手段，一个对象可以有多个引用指向它。比如赋值后的field(用Reference类型定义)就是一个引用。
    在**内存分配上**，基本类型的变量和引用类型的变量本身都在栈Stack内存中分配空间，但是引用指向的对象是在堆heap内存中分配空间。


## 静态类型和方法
* 修饰字段或方法
* Maens the field/method:
  * Is defined for the class declaration，也即无需实例化类就可以调用
  * Is not unique for each instance

看一个例子：
```Java
public class Baby {
 static int numBabiesMade = 0; 
}
 Baby.numBabiesMade = 100; 
Baby b1 = new Baby();
 Baby b2 = new Baby(); 
Baby.numBabiesMade = 2;
```
那么

b1.numBabiesMade?  b2.numBabiesMade?

经过代码验证可以得到上面两个值均为2，从这里可以看出对于静态类型的变量，改变他们时也会改变所有该类的实例中此静态类型的值或者静态方法的逻辑。

非静态方法可以调用(Reference)静态方法，因为静态方法本身不依赖于特定的实例，只要类存在就可以被访问到，但是反过来是肯定不行的。

!!!Thinking
    为什么Java中main方法是静态的

## Lab中的一个有趣的Notes
You should get a small part working at a time. Start by commenting the entire `main` method, then uncomment it line by lin.
