fun fib(n: Int): Int {

    tailrec fun go(a: Int, b: Int, n: Int): Int {
        return if (n == 0) a
        else go(b, a+b, n-1)
    }

    return go(0, 1, n)
}


