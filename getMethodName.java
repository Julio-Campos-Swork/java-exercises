/*
 * 
 * Together with the Stream-API Java 8 introduced Method Reference Expressions (see §15.13 of the Java language specification) to provide a convenient way of passing method references to functions and avoid creating anonymous classes like it was done before e.g. with UI event handlers.

The problem is that the lambda object created from the method reference seems to have lost all information about the class and method it was created from. You'll have to find a way to get this information somehow.

Task
Given a lambda which was created by a method reference (e.g. String::length) determine the name of the class and method and return just that string which you would need in the code to recreate this method reference. Methods which are bound to instances should only return the general reference to the class method (see example 3).

Input
a method reference created by a method reference expression. For the scope of this Kata we will limit the methods to be of type Function<T, R> with one parameter. This means the method is either a parameterless instance method like String.length(), a one-parameter method bound to an instance like "a,b,c".equals(Object), or a static method with one argument like Objects.requireNonNull(Object). Constructors will not be tested.
Output
a String for the method reference like it would appear in Java source code. Only the simple name of the class is needed, no package names or outer class names.
Examples
String::length should return "String::length"
Objects::requireNonNull should return "Objects::requireNonNull"
"abc"::equals should return "String::equals"
OuterClass.InnerClass::method should return "InnerClass::method"
 */

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Function;

public class getMethodName {
     public static <T, R> String getMethodNameFun(Function<T, R> lambda) {
        try {
            // Obtener el método writeReplace del lambda
            Method writeReplace = lambda.getClass().getDeclaredMethod("writeReplace");
            writeReplace.setAccessible(true);
            
            // Invocar el método writeReplace para obtener el SerializedLambda
            SerializedLambda serializedLambda = (SerializedLambda) writeReplace.invoke(lambda);
            
            // Obtener el nombre de la clase y del método
            String className = serializedLambda.getImplClass().replace('/', '.');
            String methodName = serializedLambda.getImplMethodName();
            
            // Extraer el nombre simple de la clase (sin el paquete)
            String simpleClassName = className.substring(className.lastIndexOf('/') + 1);
            
            return simpleClassName + "::" + methodName;
            
          } catch (Exception e) {
            e.printStackTrace();
            return null;
          }
  }

  public static void main(String[] args) {
   System.out.println(getMethodNameFun(String::length));  // Debería imprimir "String::length"
    System.out.println(getMethodNameFun(Objects::requireNonNull));  // Debería imprimir "Objects::requireNonNull"
    System.out.println(getMethodNameFun(((Function<String, Boolean>) "abc"::equals)));  // Debería imprimir "String::equals"
    // System.out.println(getMethodNameFun(OuterClass.InnerClass::method));  // Debería imprimir "InnerClass::method"
  }
}
