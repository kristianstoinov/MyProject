import java.util.Scanner;


public class Ex12trueOne {
private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean intercalary=false;
		System.out.println("Please enter the date:");
		int date=sc.nextInt();
		System.out.println("Please enter the month:");
		int month=sc.nextInt();
		System.out.println("Please enter the year:");
		int year=sc.nextInt();
		if(year>0){
			if(year%4==0){
				intercalary=true;
			}
			if(year%100==0 && year%400!=0){
				intercalary=false;
			}
			if(month<1 || month>12){
				System.out.println("You've entered an invalid month!");
			}else{
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
					if(date<1 || date>31){
						System.out.println("You've entered invalid date");
					}else{
						if(date==31){
							if(month==12){
								date=1;
								month=1;
								year++;
							}else{
								date=1;
								month++;
							}
							System.out.println("The date is : " + date + "." + month + "." + year);
						}else{
							date++;
							System.out.println("The date is : " + date + "." + month + "." + year);
						}
						System.exit(1);
					}
				}
				if(month==4 || month==6 || month==9 || month==11){
					if(date>30){
						System.out.println("You've entered invalid date");
					}else{
						if(date==30){
							date=1;
							month++;
						}else{
							date++;
						}
						System.out.println("The date is : " + date + "." + month + "." + year);
						System.exit(1);
					}
				}
				if(month==2){
					if(intercalary=true){
						if(date>29 || date<1){
							System.out.println("You've entered invalid date");
						}else{
							if(date==29){
								date=1;
								month++;
							}else{
								date++;
							}
							System.out.println("The date is : " + date + "." + month + "." + year);
							System.exit(1);
						}
					}else{
						if(date<1 || date>28){
							System.out.println("You've entered invalid date");
						}else{
							if(date==28){
								date=1;
								month++;
							}else{
								date++;
							}
							System.out.println("The date is : " + date + "." + month + "." + year);
							System.exit(1);
						}
					}
				}
			}
			
		}
		else{
			System.out.println("Invalid year!");
		}
		
		

	}

}
