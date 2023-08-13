# Exception2
homework exception 2

## Задание 2. Если необходимо, исправьте данный код
```Java
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
```

### Решение задачи 2.
```Java

int d = 0;
if (d != 0) {
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } else {
    System.out.println("Нельзя делить на ноль!");
    }   
```

## Задание 3. Дан следующий код, исправьте его там, где требуется
```Java
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
```
### Решение задачи 3.
```Java
public static void main(String[] args) {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;   
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   }
}
public static void printSum(Integer a, Integer b) {
   System.out.println(a + b);
}
```
> Удалены лишние исключения и изменен порядок в catch. Но лучше код переписать с использованием `if`, добавив обработку исключений деления на ноль и превышения размера массива.
