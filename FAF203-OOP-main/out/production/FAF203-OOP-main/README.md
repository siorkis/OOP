## OOP Laboratory Work 04

#### TODO:

- ~~Write a program which would find if a mathematical expression is correct from the point of view of the parentheses within it (hint - use stack to store parentheses).~~
- ~~Read the expression from the file attached at this laboratory(one_expression.txt ) and print the result if the parentheses are put correct in this expression.~~
- ~~Do the same for a file with 3 expressions(three_expression.txt ) in it and print in console information about all of them if the parenthesis in it are put correct.~~

*One expression*

`2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))`

*Three expressions*

```
1. 2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14
2. 2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12
3. ((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))
```

#### OUT:

```
2 * 4 + (3 +6 * 9 - 12 * (2*9 - 15)) + 2 +(-4)*((2 - 15)) - BALANCED
2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) - 14 - BALANCED
2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12 - UNBALANCED
((((((((((((((((((((2x-4y * 98 ))))))))))))))))))))) - UNBALANCED
```
