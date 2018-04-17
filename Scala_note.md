# scala
scalable语言
---
1：可伸缩
2：面向对象
3：在jvm之上构建的语言
4：和java无缝互操作
5：函数式编程

--函数式的编程
---
1：核心是围绕函数进行编程
2：对应的函数也是有特点的，需要纯函数
3：多核时代、云计算时代，函数式编程恰好适合，以后函数式编程可能更加的适应时代的发展，变得越来月流行
public class C {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("aaa");
        StringBuilder str2 = str.append("bbb");
        System.out.println(str2);
        StringBuilder str3 = str.append("ccc");
        System.out.println(str3);
    }
}
aaabbb
aaabbbccc

--安装scala sbt ide
---
配置环境变量
http://www.scala-lang.org/download/
https://www.scala-sbt.org/download.html
http://scala-ide.org/download/sdk.html
--命令行执行
C:\Users\ChenWeiPeng>scala -version
Scala code runner version 2.12.5 -- Copyright 2002-2018, LAMP/EPFL and Ligh

C:\Users\ChenWeiPeng>scala
Welcome to Scala 2.12.5 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_45).
Type in expressions for evaluation. Or try :help.

scala> println("hello world scala")
hello world scala

scala> var str = 2
str: Int = 2
scala命令或者sbt console

--eclipse编译执行
--手动编译执行
D:\WorkSpace\GitHub\scala\scalac>scalac Greeting.scala

D:\WorkSpace\GitHub\scala\scalac>scala greeting scala
hello world scala!

D:\WorkSpace\GitHub\scala\scalac>

----Scala的基本语法
https://blog.csdn.net/hpp1314520/article/details/78973872

