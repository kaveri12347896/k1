class hello{
public static void main(String[]args)
{
int a=10;
int b=5;
int c=5;
int x,y;
try
{
x=a/(b-c);
}
catch(Arithmetic Exception e)
{
System.out.println("division by zero");
}
y=a/(b+c);
System.out.println("y="+y);
}
}