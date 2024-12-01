# Lecture 2: More types, Methods, Conditionals
## Mismatched Types
Java verifies that types always match.

## Conversion by casting(强制类型转换)
```Java
int a = 2; //a = 2
double a = 2; // a = 2.0 (Implicit)

int a = 18.7; //Error
int a = (int)18.7; // a = 18

double a = 2/3; // a = 0.0
double a = (double)2/3
```

## Methods
```Java
public static void NAME(){
    STATEMENTS;
}

// To call a method
NAME();
```

## Multiple Parameters
```Java
[...] NAME(TYPE NAME, TYPE NAME){
  STATEMENTS;
}
// To call:
NAME(arg1, arg2);
```
void means "no type"

## Return Values
```Java
pulic static TYPE NAME(){
  STATEMENTS;
  return EXPRESSION;
}
```

## Variable Scope 变量作用域
Variables live in the block({}) where they are defined (scope).

Method parameters are like defining a new variable in the method.

## Methods: Building Blocks
* Big programs are built out of small methods.
* Methods can be individually developed, tested and reused.
* User of method does not need to know how it works.
* In CS, this is called "abstraction".