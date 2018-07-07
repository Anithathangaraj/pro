#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
  if((n>=1)&&(n<=100000))
  {
   if(n%2!=0)
   {
   printf("ODD");
   }
   else
   {
   printf("EVEN");
   }
  }
  else
  {
    printf("-1");
  }
}
