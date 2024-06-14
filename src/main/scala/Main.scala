import mathlib.set.SetTheory._
import mathlib.graph._
import mathlib.graph.GraphImplicits._

object Main {
  def main(args: Array[String]): Unit = {
    val intersection = Set("apple", "bread", "cinnamon") /\ Set("cinnamon", "bread", "dough")

    // Prints the intersection.
    println(intersection)

    /**
     * Returns the position in the alphabet for character c. For example, a = 1 and z = 26. Characters outside a-z
     * will return nonsensical values.
     * @param c The character
     * @return
     */
    def letterValue(c: Char): Int = c.toLower.toInt - 96

    /**
     * Returns the sum of the letter values in word.
     * @param word The word
     * @return
     */
    def wordValue(word: String): Int = sum(word.toSet, letterValue _)

    // Prints the set of words with maximum word value.
    println(argMax(intersection, wordValue))

    val graph = WUnDiGraph(Set(
      "apple" ~ "bread" % 1,
      "bread" ~ "cinnamon" % 2,
      "bread" ~ "dough" % 1
    ))

    // Prints the graph.
    println(graph)

    // Prints the neighbouring vertices of bread with the edge weights.
    println(graph.adjacencyList(N("bread")))
  }
}