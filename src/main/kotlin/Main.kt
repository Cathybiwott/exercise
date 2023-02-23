fun main(){
    text("AkiraChix")
    myself("cathy", 22)
    noOfStrings("Teacher")
    Myname("Cathy Bikens")



}

fun text(word:String){
    var word=("AkiraChix")
    println(word[0] + "" + word[2] + "" + word[3])
}

fun myself(name:String, age:Int):String{
    var result =("Hi my name is $name and I am $age years old")
    println(result)
    return result
}

fun noOfStrings(y:String){
    y.length
    println(y.length)

}
fun Myname(name:String){
    if(name.equals("Cathy Bikens")){
        println("that is me")

} else
    println("I don't know who that is")

}




