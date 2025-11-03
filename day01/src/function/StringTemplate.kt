package function

class StringTemplate {

    fun func1() {
        var a = 1;
        val s1 = "a is $a"
        println(s1)
        a = 10;
        val s2 = "${s1.replace("is","was")},but now is $a"
        println(s2)
    }
}