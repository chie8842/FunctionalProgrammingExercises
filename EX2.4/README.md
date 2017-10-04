## EXERCISE 2.4

curryによる変換を逆向きに行うuncurryを実装せよ。=>は右結合であるため、A => (B => C)はA => B => Cと記述できる。

```
def uncurry[A, B, C](f: A => B => C): (A, B) => C
```
