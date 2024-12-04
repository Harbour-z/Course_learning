# Lecture 7: Review Exceptions IO
## Review
Interfaces:

* Must implement ALL the methods
* All fields are final (cannot be changed)

关于继承这里讲的内容比较简单我就不再赘述了，简单来说就是父类与子类的关系。

## Exceptions
Exception: Event that occurs when something "unexpected" happens

* NullPointerException
* ArrayIndexOutOfBoundsException
* ClassCastException
* RuntimeException

How do exceptions "happen":

  Java doesn't know what to do, so

    - Create an Exception object
    - Includes some useful information
    - "throws" the Exception

我们自己也可以使用`throws`语句来抛出异常

## IO
InputStream有很多资料可以参考，需要的时候直接上手搜索相关的资料就好。
  