## EXERCISE 2.3

カリー化（currying）では、引数2つの関数fが、fを部分的に適用する引数1つの関数に変換される。この場合も、コンパイルできる実装は1つだけである。この実装を記述せよ。

```
def curry[A, B, C](f: (A, B) => C): A => (B => C)
```
