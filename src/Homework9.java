import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.equals("")) continue;

                String[] parts = line.split("\\s+"); // 공백 여러 개 가능
                if (parts.length == 2) {
                    map.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("db.txt 파일을 읽는 중 오류가 발생했습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("id와 password를 입력해주세요.\nid : ");
            String id = sc.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

        sc.close();
    }
}
