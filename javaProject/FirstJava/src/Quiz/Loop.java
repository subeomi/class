package Quiz;

public class Loop {

	public static void main(String[] args) {
		
		
		// 1번
		int num1 = 120;
	        if(num1 > 0 && num1 % 2 == 0) {
	                System.out.println("양수이면서 짝수");
	        }
	        
	        
	    // 2번
	    int num2 = 100;
	    
	    if(num2 < 0) {
	    	System.out.println("0 미만");
	    	
	    } else if(0 <= num2 && num2 < 100) {
	    	System.out.println("0 이상 100 미만");
	    	
	    } else if(100 <= num2 && num2 < 200) {
	    	System.out.println("100 이상 200 미만");
	    	
	    } else if(200 <= num2 && num2 < 300) {
	    	System.out.println("200 이상 300 미만");
	    	
	    } else if(num2 >= 300) {
	    	System.out.println("300이상");
	    }
	    
	    
	    // 3번
	    int num301 = 50;
	    int num302 = 100;
	    int big;
	    int diff;
	    
	    if(num301 > num302) {
	    	System.out.println(big = num301);
	    	
	    } else {
	    	System.out.println(big = num302);
	    }
	    
	    if(num301 > num302) {
	    	System.out.println(diff = num301 - num302);
	    	
	    } else {
	    	System.out.println(diff = num302 - num301);
	    }
	    
	    
	    // 4번
	    int n4 = 3;
	    if(n4 == 1) {
	    	System.out.println("Simple Java");
	    	
	    } else if(n4 == 2) {
	    	System.out.println("Funny Java");
	    	
	    } else if(n4 == 3) {
	    	System.out.println("Fantastic Java");
	    	
	    } else {
	    	System.out.println("The best programming language");
	    }
	    
	    System.out.println("Do you like coffee?");
	    
	    
	    // 5번
	    int num5 = 100 / 100;
	    
	    if(num5 < 0) {
	    	System.out.println("0 미만");
	    	
	    } else {
	    	
		    switch (num5) {
			case 0:
				System.out.println("0 이상 100 미만");
				break;
			case 1:
				System.out.println("100 이상 200 미만");
				break;
			case 2:
				System.out.println("200 이상 300 미만");
				break;
			default:
				System.out.println("300 이상");
				break;
			}
	    }
	    
	    
	    // 6번
	    int num6 = 1;
	    int sum6 = 0;
	    while(num6 < 100) {
	    	sum6 += num6;
	    	num6++;
	    }
	    System.out.println(sum6);
	    
	    
	    // 7번
	    int num7 = 1;

	    while(true) {
	    	num7++;
	    	System.out.print(num7 + " ");
	    	
	    	if(num7 == 100) {
	    		break;
	    	}
	    }
	    
	    System.out.println();
	    
	    do {
			System.out.print(num7 + " ");
			num7--;
		} while (num7 >= 1);
	    
	    System.out.println();
	    
	    
	    // 8번
	    int num8 = 0;
	    int sum8 = 0;
	    
	    while(true) {
	    	num8++;
	    	if(num8 >= 1000) {
	    		break;
	    	} else if(num8 % 2 == 0 && num8 % 7 == 0) {
	    		System.out.print(num8 + " ");
	    		sum8 += num8;
	    	}
	    }
	    System.out.println();
	    System.out.println("합 : " + sum8);
	   
	    
	    // 9번
	    int num9 = 1;
	    for(int i = 1; i < 11; i++) {
	    	num9 *= i;
	    }
	    
	    System.out.println(num9);
	    
	    
	    // 10번
	    int num10 = 5;
	    for(int i = 1; i < 10; i++) {
	    	System.out.println(num10 + " x " + i + " = " + num10 * i);
	    }
	    
	    
	    // 11번
	    int cnt11 = 0;
	    for(int i = 1; i < 100; i++) {
	    	if(i % 5 != 0 || i % 7 != 0) {
	    		continue;
	    	}
	    	cnt11++;
	    	System.out.print(i + " ");
	    }
	    System.out.println("count : " + cnt11);
	    
	    
	    // 12번
	    int num12 = 0;
	    int sum12 = 0;
	    int cnt12 = 0;
	    
	    while(true) {
	    	num12++;
	    	
	    	if(num12 % 2 != 0 || num12 % 3 == 0) {
	    		sum12 += num12;
	    	}
	    	
	    	if(sum12 >= 1000) {
	    		break;
	    	}
	    }
	    
	    System.out.println(num12 + "를 더했을 때 1000을 넘습니다.");
	    System.out.println("넘어선 값은 " + sum12 + "입니다.");
	    
	    
	    // 13번
	    for(int i = 1; i < 9; i++) {
	    	
	    	if(i % 2 == 0 && i != 6) {
	    		
	    		for(int j = 1; j <= i; j++) {
	    			System.out.println(i + " x " + j + " = " + j * i);
	    		}
	    	}
	    }
	    
	    
	    // 14번 ??
	    int AB = 1;
	    int BA = 1;
	    
	    while(true) {
	    	AB++;
	    	
	    	if(99 - AB == BA) {
	    		break;
	    	}
	    }
	    System.out.println(AB + "과 " + BA);
	    
	    
	    // 15번
	    int num15 = 4;
	    
	    if(num15 <= 3) {
		    switch (num15) {
			case 1:
				System.out.println("현재 인원은 " + num15 + "명 입니다.");
				break;
			case 2:
				System.out.println("현재 인원은 " + num15 + "명 입니다.");
				break;
			case 3:
				System.out.println("현재 인원은 " + num15 + "명 입니다.");
				break;
			}
	    } else {
	    	System.out.println("현재 많은 사람들이 있습니다.");
	    }
	    
	    
	    // 16번
	    int num16 = 1;
	    int sum16 = 0;
	    
	    while(true) {
	    	if(num16 == 100) {
	    		System.out.println(sum16);
	    		sum16 = 0;
	    		num16 = 0;
	    		break;
	    	}
	    	sum16 += num16;
	    	num16++;
	    }
	    
	    for(int i = 1; i < 100; i++) {
	    	sum16 += i;
	    	if(i == 99) {
	    		System.out.println(sum16);
	    		sum16 = 0;
	    	}
	    }
	    
	    do {
	    	if(num16 == 100) {
	    		System.out.println(sum16);
	    		sum16 = 0;
	    		num16 = 0;
	    		break;
	    	}
	    	sum16 += num16;
	    	num16++;
		} while (true);
	}
}
