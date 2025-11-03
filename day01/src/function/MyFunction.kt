package function

class MyFunction {
    // 熟悉kt的函数定义
    // 1. 显示返回数据类型
    fun fuc1(a: Int, b: Int): Int {
        return a + b;
    }

    // 2. 省略返回数据类型
    fun fun2(a: Int, b: Int) = a + b;

    // 2.1 如果函数的修饰符是public，则需要指定返回值类型
    public fun func2_1(a: Int, b: Int): Int = a + b;

    // 3. void
    fun fun3(a: Int, b: Int): Unit {
        println(a + b);
    }

    // 3.1 public修饰可以省略Unit
    public fun fun3_1(a: Int, b: Int) {
        println(a + b);
    }

    // 4. 可变参数，使用vararg关键字
    fun fun4(vararg a: Int): Unit {
        for (ax in a) {
            print("a=$ax ")
        }
    }
}