//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    project("Ada")
    division(33,10)
    addition(400,25,12,7654)


}

fun project(name: String){
    val result = "Hello Ada"
    println(result)
    interest("I play instruments")


}

fun division (x:Int , z:Int){

    var solution = x % z
    println(solution)

}

fun addition (a:Int , b:Int , c:Int , d:Int ){

    var answer = a+b+c+d
    print(answer)

}

fun interest(statement : String){

    var fact = statement
    println(fact)

}


