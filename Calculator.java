package calculator;

public class Calculator {

}

Caculator caculator = new Caculator();


//레벨1-1
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1=sc.nextInt();

    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의  수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2=sc.nextInt();


        System.out.prinln("입력한 숫자는 "+num1+"과(와)"num2+"입니다."):

        sc.close();

        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    }
}
// Scanner 객체 sc를 사용하여 사용자로 부터 두 개의 정수를 입력 받아서 num1rhk num2 변수에 각각 저장을 합니다



//레벨1-2
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요:");
        ㅑㅜㅅ


        System.out.print("사칙연산 기호를 입력하세요: ")(+,-,*./): "";
        char op = sc text() charAT(0);
    )


        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
    }

    //사용자로터 연산 기호를 입력을 받아서 chat 타입의 op 변수에 저장을 합니다.sc.next()로 문자열을 읽고 나서 chaeAt(0)를 통해 첫 번쨰 문자를 가져온다


//레벨1-3
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char op = sc.next().charAt(0);

            int result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산 기호입니다.");
                    valid = false;
            }

            if (valid) {
                System.out.println("결과: " + result);
            }

            sc.close();
        }
    }
//설명 입력받은 op값에 따라서 switch 문을 사용하여 사칙연산을 수행합니다. 특히 난눗셈(case'/')의 경우에 num2가 0인지 확인하여
//나누는 오류를 방지하며 적절한 메시지를 출력을 한다.valid 변수를 사용하여 연산의 성공 여부를 기록합니다




//레벨1-4
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String command = "";

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char op = sc.next().charAt(0);

                int result = 0;
                boolean valid = true;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                            valid = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산 기호입니다.");
                        valid = false;
                }

                if (valid) {
                    System.out.println("결과: " + result);
                }

                sc.nextLine(); // 버퍼 비우기
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                command = sc.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }

            sc.close();
        }
    }
        //설명 while(true) 무한 루프를 사용하여 사용자가 exit를 입력하기 전까지 계속해서 계산을 수행
        //할 수 있도록 합니다.사용자ㅑ가 "exit"를 입력하면 break 문을 통해 반복문을 종료하고 프로그램을 끝낸다



//레벨1-5
       import java.util.LinkedList;
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 적합한 컬렉션 타입 변수 선언
            LinkedList<Integer> results = new LinkedList<>();
            String command = "";

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char op = sc.next().charAt(0);

                int result = 0;
                boolean valid = true;

                switch (op) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈에서 분모가 0일 수 없습니다.");
                            valid = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산 기호입니다.");
                        valid = false;
                }

                if (valid) {
                    // 연산 결과 저장
                    results.add(result);
                    System.out.println("결과: " + result);
                }

                sc.nextLine(); // 버퍼 비우기
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                command = sc.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
            sc.close();
        }
    }
//설명 //LinkedList<Inteager> 타입의 result 변수를 선언하여 연산 결과를 저장합니다. LinkedList는 요소의 추가
    //삭제가 효울적아며 특히나 removeFirst()메소드로 가장 오래된 데이터를 쉽게 삭제할 수 있어 이번 문제에 적합하다
    //연산이 성공적일 때(valid가 true일 때만)결과를 result에 추가한다




//레벨1-6
import java.util.LinkedList;
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList<Integer> results = new LinkedList<>();
            String command = "";

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char op = sc.next().charAt(0);

                int result = 0;
                boolean valid = true;

                switch (op) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈에서 분모가 0일 수 없습니다.");
                            valid = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산 기호입니다.");
                        valid = false;
                }

                if (valid) {
                    // 10개 초과 시 가장 먼저 저장된 결과 삭제
                    if (results.size() == 10) {
                        results.removeFirst();
                    }
                    results.add(result);
                    System.out.println("결과: " + result);
                }

                sc.nextLine(); // 버퍼 비우기
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                command = sc.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
            sc.close();
        }
    }


    //설명 result 컬렉션의 크기가 10개가 되는 시점에 새로운 결과를 추가하기 전에 removeFirst() 메소드를 호출하여 먼저 저장된
    // 결과를 자동으로 삭제를 하게됩니다. 이렇게 하면 컬렉션은 항상 최대 10개의 결과를 남게됩니다

//레벨1-7
import java.util.LinkedList;
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList<Integer> results = new LinkedList<>();
            String command = "";

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char op = sc.next().charAt(0);

                int result = 0;
                boolean valid = true;

                switch (op) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈에서 분모가 0일 수 없습니다.");
                            valid = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산 기호입니다.");
                        valid = false;
                }

                if (valid) {
                    if (results.size() == 10) {
                        results.removeFirst();
                    }
                    results.add(result);
                    System.out.println("결과: " + result);
                }

                sc.nextLine(); // 버퍼 비우기

                // 가장 먼저 저장된 연산 결과 삭제 여부
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeCmd = sc.nextLine();
                if (removeCmd.equalsIgnoreCase("remove") && !results.isEmpty()) {
                    int removed = results.removeFirst();
                    System.out.println("삭제된 결과: " + removed);
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                command = sc.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }

            //설명 사용자에게 가장 먼저 저장된 연산 결과 삭제 여부를 묻고나서 "remove"를 입력하면 results.removeFirst()를 호출하여
            //가장 오래된 결과를 삭제합니다.!results.isEmpty()로 컬렉션이 비어있지 않는지 먼저 확인을 하여 오류를 방지한다



//레벨1-8
import java.util.LinkedList;
import java.util.Scanner;

            public class App {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    LinkedList<Integer> results = new LinkedList<>();
                    String command = "";

                    while (true) {
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        int num1 = sc.nextInt();

                        System.out.print("두 번째 숫자를 입력하세요: ");
                        int num2 = sc.nextInt();

                        System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                        char op = sc.next().charAt(0);

                        int result = 0;
                        boolean valid = true;

                        switch (op) {
                            case '+': result = num1 + num2; break;
                            case '-': result = num1 - num2; break;
                            case '*': result = num1 * num2; break;
                            case '/':
                                if (num2 == 0) {
                                    System.out.println("나눗셈에서 분모가 0일 수 없습니다.");
                                    valid = false;
                                } else {
                                    result = num1 / num2;
                                }
                                break;
                            default:
                                System.out.println("잘못된 연산 기호입니다.");
                                valid = false;
                        }

                        if (valid) {
                            if (results.size() == 10) {
                                results.removeFirst();
                            }
                            results.add(result);
                            System.out.println("결과: " + result);
                        }

                        sc.nextLine(); // 버퍼 비우기

                        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                        String removeCmd = sc.nextLine();
                        if (removeCmd.equalsIgnoreCase("remove") && !results.isEmpty()) {
                            int removed = results.removeFirst();
                            System.out.println("삭제된 결과: " + removed);
                        }

                        // 저장된 연산결과 조회 기능 추가
                        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                        String inquiryCmd = sc.nextLine();
                        if (inquiryCmd.equalsIgnoreCase("inquiry")) {
                            if (results.isEmpty()) {
                                System.out.println("저장된 결과가 없습니다.");
                            } else {
                                System.out.println("--- 저장된 연산 결과 목록 ---");
                                for (int i = 0; i < results.size(); i++) {
                                    System.out.println((i + 1) + ": " + results.get(i));
                                }
                                System.out.println("-------------------------");
                            }
                        }

                        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                        command = sc.nextLine();
                        if (command.equalsIgnoreCase("exit")) {
                            System.out.println("프로그램을 종료합니다.");
                            break;
                        }
                    }
                    sc.close();
                }
            }

//설명 사용자에게 저장된 결과를 조회할지 묻고, "inquiry"를 입력하면 results 컬렉션에 저장된 모든 연산 결과를 순서대로
    //출력합니다. 컬렉션이 비어져 있다면 "저장된 결과가 없습니다"메세지를 출력합니다