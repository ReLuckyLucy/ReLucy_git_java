# Java练习仓库
通过构建优雅的java代码，一步一步发现并重构伟大的世界

## Java简介
### Java语言是简单的：

Java 语言的语法与 C 语言和 C++ 语言很接近，使得大多数程序员很容易学习和使用。另一方面，Java 丢弃了 C++ 中很少使用的、很难理解的、令人迷惑的那些特性，如操作符重载、多继承、自动的强制类型转换。特别地，Java 语言不使用指针，而是引用。并提供了自动分配和回收内存空间，使得程序员不必为内存管理而担忧。

### Java语言是面向对象的：

Java 语言提供类、接口和继承等面向对象的特性，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为 implements）。Java 语言全面支持动态绑定，而 C++语言只对虚函数使用动态绑定。总之，Java语言是一个纯的面向对象程序设计语言。

## Java基础语法
一个 Java 程序可以认为是一系列对象的集合，而这些对象通过调用彼此的方法来协同工作。下面简要介绍下类、对象、方法和实例变量的概念。

#### 对象：对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。
#### 类：类是一个模板，它描述一类对象的行为和状态。
#### 方法：方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的。
#### 实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。
![](img/1.jpg)

## 如何运行
> 打开代码编辑器，把上面的代码添加进去；
>
> 把文件名保存为：HelloWorld.java；
>
> 打开 cmd 命令窗口，进入目标文件所在的位置，假设是 C:\
>
> 在命令行窗口输入 javac HelloWorld.java 按下回车键编译代码。如果代码没有错误，cmd 命令提示符会进入下一行（假设环境变量都设置好了）。
>
> 再键输入 java HelloWorld 按下回车键就可以运行程序了

你将会在窗口看到 Hello World

```java
$ javac HelloWorld.java
$ java HelloWorld 
Hello World
```

### 基本语法

编写 Java 程序时，应注意以下几点：

- **大小写敏感**：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
- **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 **MyFirstJavaClass** 。
- **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 **.java**。（如果文件名和类名不相同则会导致编译错误）。
- **主方法入口**：所有的 Java 程序由 **public static void main(String[] args)** 方法开始执行
<<<<<<< HEAD

### Java修饰符
像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：

- 访问控制修饰符 : default, public , protected, private
- 非访问控制修饰符 : final, abstract, static, synchronized

### Java 变量
Java 中主要有如下几种类型的变量
局部变量
类变量（静态变量）
成员变量（非静态变量）

### Java 枚举
```
class FreshJuice {
    // 枚举类型 FreshJuiceSize，定义了三种果汁尺寸：小、中、大
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
    
    // 果汁的尺寸变量，类型为 FreshJuiceSize 枚举
    FreshJuiceSize size;
}

/*
FreshJuice 类定义了一个枚举类型 FreshJuiceSize，包含三个枚举常量：SMALL、MEDIUM 和 LARGE。
size 变量声明为 FreshJuiceSize 类型的枚举变量，用来表示果汁的大小。
*/

public class FreshJuiceTest {
    public static void main(String[] args) {
        // 创建一个 FreshJuice 对象 juice
        FreshJuice juice = new FreshJuice();
        
        // 给 juice 对象的 size 变量赋值为 MEDIUM，使用了枚举常量 FreshJuice.FreshJuiceSize.MEDIUM
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}
/*
FreshJuiceTest 是包含 main 方法的公共类，是程序的入口点。
在 main 方法中，首先创建了一个 FreshJuice 对象 juice。
然后，使用枚举类 FreshJuiceSize 的常量 MEDIUM 来给 juice 的 size 变量赋值。
*/
```
=======
>>>>>>> 632bd30e70b1b270ab2d7df278033a21db549994
