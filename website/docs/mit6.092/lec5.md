# Lecture 5: Access Control, Class Scope, Packages, Java API
**fields 字段**：通常指的是类或结构体中的变量，其用来存储对象的状态或数据，是 OOP 中的一个核心概念。
## 1 Access Control-访问控制
在 Java 中，顶层类不能使用private访问修饰符。也就是说，顶层类（non-nested calss）只能使用public 或者default访问控制.
`public\private`是作用到`field and method`，使用 `private`修饰的只能在当前类中访问。

### 1.1 使用 Access Control 的原因
* protect private infomation
* Clarify how others should use your class
* Keep implementation separate from interface

## 2 Class Scope
variables只能获得在`{}`以内的。
`this`关键字可以让我们在Object-level层面修改变量。

## 3 Packages
### 关于包
* Each class belongs to a package
* Classes in the same package serve a similar purpose
* Packages are just directories
* Classes in other packages need to be imported
```Java
// defining packages
package path.to.package.foo;

//using packages
import path.to.package.foo.Foo;
import path.to.package.foo.*;
```
### 为什么要用package
可以合并相似功能或者实现同一个目的的函数

也可以区别类似的名称

### Special Packages
* All classes "see" classes in the same package(no import needed)
* All classes "see" classes in `java.lang`
* like: `java.lang.String` `java.lang.System`

## Java API

Java有许多官方的packages/classes，我们可以复用他们避免重复造轮子。
### ArrayList
这是一种可以修改的List，其内部通过arrays实现。
### Sets
类似于`ArrayList`，但是有一些不同：
* Only one copy of each object
* No array index

功能特性：
* Add objects to the set
* Remove objects to the set
* Is an object in the set
* 分为有序的TreeSet和无序的HashSet

### Maps
类似于Python的字典，是哈希表(key-value pair)，同样有TreeMap和HashMap

## Lab5
这是一个关于画图的Lab，在第二部分调用函数实现动画的部分很有意思，实现画图的main程序不用理解，只需修改其他两个类就可以实现。