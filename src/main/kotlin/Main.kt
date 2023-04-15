import java.util.Scanner

fun main() {
    val entrada= Scanner (System.`in`)

    //1 - Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5,
    //usando continue.
    for(i in 0..10){
        if(i==5){
            continue
        }
        print("$i ")
    }
    print("\n")

    //2 - Escreva um programa que leia números do usuário e pare quando o número
    //digitado for negativo usando break.
    var num:Int
    for(i in 1..5){
        println("Informe um número: ")
        num=entrada.nextInt()
        if(num<0){
            print("\n")
            break
        }
    }

    //3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima
    //todos os números pares de 0 até o número digitado, exceto o número 4, usando
    //continue e break.
    println("Informe um número: ")
    num=entrada.nextInt()
    for(i in 0..num){
        if(i%2==0){
            if(i==4){
                continue
             }
            print("$i ")
        }
    }
}