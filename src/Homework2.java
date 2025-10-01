import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String major;
    private long phoneNumber;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public long getPhoneNumber() { return phoneNumber; }

    public String getFormattedPhoneNumber() {
        String phoneStr = "0" + phoneNumber;
        String part1 = phoneStr.substring(0, 3);
        String part2 = phoneStr.substring(3, 7);
        String part3 = phoneStr.substring(7);
        return part1 + "-" + part2 + "-" + part3;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = scanner.nextLine();
            String[] info = input.split(" ");

            students[i] = new Student();
            students[i].setId(Integer.parseInt(info[0]));
            students[i].setName(info[1]);
            students[i].setMajor(info[2]);
            students[i].setPhoneNumber(Long.parseLong(info[3]));
        }

        System.out.println();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        String[] ordinals = {"첫번째", "두번째", "세번째"};

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(ordinals[i] + " 학생: " +
                    s.getId() + " " +
                    s.getName() + " " +
                    s.getMajor() + " " +
                    s.getFormattedPhoneNumber());
        }

        scanner.close();
    }
}