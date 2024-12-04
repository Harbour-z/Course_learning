# Lecture 6: Design, Debugging, Interfaces
## A good program
* Correct / no errors
* Easy to understand
* Easy to modify / extend
* Good performance(speed)
* writing code with a consistent way makes it easier to write and understand
### Good Naming
● variables: Nouns, lowercase first letter, capitals separating words
● Methods: Verbs, then same with variavles
● Classed: Nouns, uppercase first letter.
### Good Class Design
● Make fields and methods private by default
● Only make methods public if you need to
● If you need access to a field, create a method;
将field字段private是之前没有考虑的
public int getBar(){return bar;}
## Debugging
**Design: Pseudocode（伪代码）**

* A high-level, understandable description of what a program is supposed to do
* Don't worry about the details, worry about the structure.

这里提到了一种方法叫作区间测试Interval Testing，其用于检查程序在特定输入区间内的行为。

在设计程序的时候，可以为对象或者程序工作流程进行视觉上的一些设计，不要特别关注特定的符号表示是怎么样的，只需要对你合理即可。这里我理解的意思就像slides中展示的这副图片一样，进行可视化的一些设计就会清晰很多：
![](images\debug.png)

可以考虑重要的输入和边界值等来进行一些测试，尽早发现程序的问题。

Assertions是一种很好用的工具/语法，以前我自己写程序倒是很少用到过，以后会逐渐尝试这种工具。

## Interfaces
介绍了使用methods的好处，比如封装和复用性，还可以隐藏具体实现只对外暴露接口，使用的人也无需知道具体实现

### Java Interface

* Manipulate objects, without knowing how they work
* Useful when you have similar but not identical objects
* Useful when you want to use code written by others
* Set of classes that share methods
* declare an interface with the common methods
* Interface only have methods, only definition (called signatures) without codes
* A class can implement any number of interface