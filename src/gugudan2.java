public class gugudan2 {
	
	public static int[] calculate(int times) {
		int [] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result [i] = times * (i + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner sc = new Scanner(System.in);
//		int num =  sc.nextInt();
//		System.out.println("number :" + num);
//		
//		int result = num*1;
//		System.out.println(result);
//		
//		result = num*2;
//		System.out.println(result);
//		
//		result = num*3;
//		System.out.println(result);
//		
//		result = num*4;
//		System.out.println(result);
//		
//		result = num*5;
//		System.out.println(result);
//		
//		result = num*6;
//		System.out.println(result);
//		
//		result = num*7;
//		System.out.println(result);
//		
//		result = num*8;
//		System.out.println(result);
//		
//		result = num*9;
//		System.out.println(result);
//		
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출락할 단은? :");
//		int num = sc.nextInt();
//		int i = 1;
//		while(i<10) {
//			System.out.println(num + "*" + i + " = " + num*i);
//		i++;}
//		
		
		// 입력한 숫자에 해당하는 구구단 출력
		// 2이상 9이하가 아닌 값을 입력할 경우 "2이상, 9이하의 값만 입력할 수 있습니다 " 라는 메세지 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출락하고 싶은 단을 입력하시오 :");
//		int num = sc.nextInt();
//		if(1 < num && num < 10 ) {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(num + " * " + i + "=" + num*i);
//			}
//		}
//		else {
//			System.out.println("2이상 9이하의 값만 입력할 수 있습니다");
//		}

		// 배열을 활용해 구구단 구현
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출력하고 싶은 단을 입력하시오");
//		int num = sc.nextInt();
//		int [] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = num* (i+1);
//		}
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		// 메소드를 활용한 구구단
		// 반복되는 부분을 메소드로 만든다
		
		
		int [] result = calculate(2);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

	
			
	}
	

