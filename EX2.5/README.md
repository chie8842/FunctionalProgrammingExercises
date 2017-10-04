## EXERCISE 2.5

2つの関数を合成する高階関数を実装せよ。

```
def compose[A, B, C](f: B => C, g: A => C): A => C
```
