import java.util.Scanner;

public class Project1 {
    static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.print("선택: ");
            choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "i":
                    inputText(scanner);
                    break;
                case "o":
                    displayText();
                    break;
                case "s":
                    searchText(scanner);
                    break;
                case "r":
                    replaceText(scanner);
                    break;
                case "h":
                    printHelp();
                    break;
                case "e":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    static void inputText(Scanner scanner) {
        System.out.print("문자열을 입력하세요: ");
        text = scanner.nextLine();
    }

    static void displayText() {
        System.out.println("현재 문자열: " + text);

        int length = text.length();
        System.out.println("글자 수: " + length);


        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            System.out.println("단어 수: 0");
        } else {
            String[] words = trimmed.split("\\s+");
            System.out.println("단어 수: " + words.length);
        }
    }

    static void searchText(Scanner scanner) {
        System.out.print("찾을 문자열을 입력하세요: ");
        String keyword = scanner.nextLine();

        if (keyword.isEmpty() || !text.contains(keyword)) {
            System.out.println("문자열을 찾을 수 없습니다.");
            return;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }

        System.out.println("'" + keyword + "'이/가 " + count + "회 존재합니다.");
    }

    static void replaceText(Scanner scanner) {
        System.out.print("찾을 문자열을 입력하세요: ");
        String target = scanner.nextLine();

        if (target.isEmpty() || !text.contains(target)) {
            System.out.println("바뀐 게 없습니다.");
            return;
        }

        System.out.print("바꿀 문자열을 입력하세요: ");
        String replacement = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }

        text = text.replace(target, replacement);

        System.out.println("변경된 문자열: " + text);
        System.out.println("'" + target + "'이/가 " + count + "번 바뀌었습니다.");
    }

    static void printHelp() {
        System.out.println("=== 메뉴 ===");
        System.out.println("i: 문자열 입력");
        System.out.println("o: 문자열 출력 (글자수, 단어수 포함)");
        System.out.println("s: 문자열 찾기");
        System.out.println("r: 문자열 바꾸기");
        System.out.println("h: 도움말");
        System.out.println("e: 종료");
    }
}
