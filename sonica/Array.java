public class Array
{
public static void main(String [] args)
int[] Array = {1,5,6,3,4,1 };
int Element = 3;
int Index;

for (int i = 0; i < Array.Length; i++)
{
     if (Element == Array[i])
     {
         Index = i;
     }
}
