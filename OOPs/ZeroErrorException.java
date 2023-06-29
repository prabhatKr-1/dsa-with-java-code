package com.OOPs;

public class ZeroErrorException extends Exception{
/* Steps in exception handling:
* When you want to handle:
* Create an object of Exception class if you don't want to specify that much
* or create a subclass like this one and then create an object of this class.
* It's better to create object at the place of throwing, just for convenience
* then throw the exception using the object name
*At the place where the function is called, create the try block and put the function
*inside it. Just after try, create the catch block with argument. The argument will
* be what it is catching, here, it's an object of ZeroErrorException. Write whatever
* message you want to convey to the user.
*
* When you don't want to handle:
* First of all, write throws exception_name after the function name.
* No try and/or catch blocks are needed. The user will see that some exception is
* there. You can specify by creating an Exception subclass.
*/






    //    Write the try command while using the function, not in the fraction class
}
