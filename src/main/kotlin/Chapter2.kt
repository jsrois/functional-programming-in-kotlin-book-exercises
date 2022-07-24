fun fib(n: Int): Int {

    tailrec fun go(a: Int, b: Int, n: Int): Int {
        return if (n == 0) a
        else go(b, a + b, n - 1)
    }

    return go(0, 1, n)
}


val <T> List<T>.tail: List<T>
    get() = drop(1)
val <T> List<T>.head: T
    get() = first()

fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
    fun <A> go(head: A, tail: List<A>, order: (A, A) -> Boolean): Boolean {
        return tail.isEmpty() || (order(head, tail.head) && go(tail.head, tail.tail, order))
    }

    return go(aa.head, aa.tail, order)
}

fun <A, B, C> curry(f: (A, B) -> C): (A) -> (B) -> C =
    { a: A -> { b: B -> f(a, b) } }

fun <A, B, C> uncurry(f: (A) -> (B) -> C): (A, B) -> C =
    { a: A, b: B -> f(a)(b) }
