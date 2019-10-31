//done
import java.util.Scanner;
public class TestCalender{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TestCalender obj=new TestCalender();
        System.out.println("first day?");
        int firstday=sc.nextInt();
        System.out.println("year?");
        int year=sc.nextInt();
        System.out.println("month?");
        int month=sc.nextInt();
        int blankday,dayinfeb;
        
        //int c to passed to method
        if(year%4==0){
            dayinfeb=29;
        }
        else{
            dayinfeb=28;
        }
        
        //blankday
        int totalday=(obj.total(month,dayinfeb));
        if(month==1){
           blankday=firstday;
           obj.calender(blankday,(obj.dayinmonth(month, year)));
        }
        else{
            blankday=(totalday+firstday)%7;
            obj.calender(blankday,(obj.dayinmonth(month, year)));
        }
    }
    
    //int a is month,int b is year
    public int dayinmonth(int a,int b){
        int day;
        if ((a==1)||(a==3)||(a==5)||(a==7)||(a==8)||(a==10)||(a==12)){
            day=31;
        }
        else if(a==2){
            if(b%4==0)
                day=29;
            else
                day=28;
        }
        else{
            day=30;
        }
        return day;
    }
    
    //int a is month,int c is day in feb
    public int total(int a,int c){
        int ttl=0;
         switch(a){
             case 1:
                 ttl=0;
                 break;
             case 2:
                 ttl=31;
                 break;
             case 3:
                 ttl=31+c;
                 break;
             case 4:
                 ttl=31+c+31;
                 break;
             case 5:
                 ttl=31+c+31+30;
                 break;
             case 6:
                 ttl=31+c+31+30+31;
                 break;
             case 7:
                 ttl=31+c+31+30+31+30;
                 break;
             case 8:
                 ttl=31+c+31+30+31+30+31;
                 break;
             case 9:
                 ttl=31+c+31+30+31+30+31+31;
                 break;
             case 10:
                 ttl=31+c+31+30+31+30+31+31+30;
                 break;
             case 11:
                 ttl=31+c+31+30+31+30+31+31+30+31;
                 break;
             case 12:
                 ttl=31+c+31+30+31+30+31+31+30+31+30;
                 break;
         }
         return ttl;
    }
    
    //int a is blankday,int b is day in the month
    public void calender(int a,int b){
        System.out.println(a);
        System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
        for(int i=0;i<a;i++){
            System.out.print("\t");
        }
        for(int i=0;i<b;i++){
            if((a+i)%7==0){
                System.out.println("");
            }
            System.out.print((i+1)+"\t");
        }
        
    }
}