import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");

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

