#include<stdio.h>
#include<math.h>
int main()
{
  int sum=0,rem,n,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem*pow(2,i);
    n=n/10;
    i++;
  }
printf("%d",sum);
  return 0;
}