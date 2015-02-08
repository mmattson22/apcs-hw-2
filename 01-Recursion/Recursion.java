/*Sorry about the crappy formatting. There was a mishap and I had to retrive the source code through a decompile and it turned everything weird.  All the code works though!*/

public class Recursion
{
public int fact(int paramInt)
{
if (paramInt == 1) {
return 1;
}
return paramInt * fact(paramInt - 1);
}
public int fibonacci(int paramInt) {
int i = 0;
if (paramInt == 0) {
i = 0;
}
if ((paramInt == 2) || (paramInt == 1)) {
i = 1;
}
if (paramInt > 2) {
i = fibonacci(paramInt - 1) + fibonacci(paramInt - 2);
}
return i;
}
public int len(String paramString) {
int i = 0;
if (paramString.equals(""))
i = 0;
else {
return 1 + len(paramString.substring(1));
}
return i;
}
public int count(String paramString, char paramChar) {
if (paramString.length() == 0) {
return 0;
}
if (paramString.charAt(0) == paramChar) {
return 1 + count(paramString.substring(1), paramChar);
}
return count(paramString.substring(1), paramChar);
}

public static void main(String[] paramArrayOfString) {
Recursion1 localRecursion1 = new Recursion1();
System.out.println(localRecursion1.fact(10));
System.out.println(localRecursion1.fibonacci(6));
System.out.println(localRecursion1.len("hello"));
System.out.println(localRecursion1.count("ababa", 'a'));
}
}