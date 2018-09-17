import java.util.*

fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) +  start

fun main (args: Array<String>)
{
    while (true)
    {
        val rand = (1..100).random()

        print("Do you want to play the game? (y/n): ")
        val keyInput : String? = readLine()
        if (keyInput != null && keyInput.toLowerCase() == "n")
            break

        do
        {
            print("Guess a number: ")
            val input = readLine()!!.toIntOrNull()
            if (input != null)
            {
                if (input == rand)
                    println("Congratulation, you won the game!")
                else
                    println("The searched number is ${if (input > rand) "lower" else "greater"}")
            }
        } while (rand != input)
    }

    println ("Thank you for playing. Bye bye!")
}