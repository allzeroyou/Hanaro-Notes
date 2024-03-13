import java.util.ArrayList;
import java.util.Scanner;

public class ManagerGrade {
    public static void main(String[] args) {
        // 1. 입력: 입력받고 배열에 삽입(add)
        // 2. 전체 출력: 배열을 for문 돌면서 출력
        // 3. 검색: 배열에서 이름을 기준으로 검색후 전체 출력
        // 4. 수정: 이름을 기준으로 검색 후 수정 과목 입력받음, 수정할 점수 적용
        // 5. 삭제: 배열에서 이름을 기준으로 검색 후 삭제
        // 6. 종료: 종료!! 출력

        ArrayList<Student> sList = new ArrayList<>(10); // 동적 할당
        Scanner scanner = new Scanner(System.in);
        int command = 0; // 초기값 설정

        // while문 탈출 조건: 6일때
        while (command != 6) {
            System.out.print("-----------성적 관리 프로그램------------- \n1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    addStudent(sList, scanner);
                    break;
                case 2:
                    // 전체 출력
                    printAllStudents(sList);
                    break;
                case 3:
                    // 3. 검색
                    searchStudent(sList, scanner);
                    break;
                case 4:
                    // 4. 수정
                    modifyStudent(sList, scanner);
                    break;
                case 5: // 삭제
                    deleteStudent(sList, scanner);
                    break;
                case 6:
                    System.out.println("종료!!");
                    break;
                default:
                    System.out.println("1~6까지 숫자만 입력");
            }
        }
    }

    // 함수로 쪼개기
    // 해당 클래스 내에서만 접근 가능, 클래스의 인스턴스 없이 호출가능 하게끔, 반환값 없음
    private static void addStudent(ArrayList<Student> sList, Scanner scanner) {
        System.out.print("이름 입력: ");
        String name = scanner.next();

        System.out.print("국어점수 입력: ");
        int kScore = scanner.nextInt();

        System.out.print("영어점수 입력: ");
        int eScore = scanner.nextInt();

        System.out.print("수학점수 입력: ");
        int mScore = scanner.nextInt();

        // 총점과 평균 계산
        int total = kScore + eScore + mScore;
        double avg = (double) total /  3;

        // Student 객체 생성 후 리스트에 추가
        Student student = new Student(name, kScore, eScore, mScore, total, avg);
        sList.add(student);
    }

    private static void printAllStudents(ArrayList<Student> sList) {
        for (Student s : sList) {
            System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %f\n", s.getName(), s.getkScore(), s.geteScore(), s.getmScore(), s.getTotal(), s.getAvg());
        }
    }

    private static void searchStudent(ArrayList<Student> sList, Scanner scanner) {
        System.out.print("검색할 사람의 이름 : ");
        String searchName = scanner.next();

        if (!sList.isEmpty()) { // 비어있지 않다면 검색 가능
            boolean sFound = false; // 검색 flag
            for (Student s : sList) {
                if (s.getName().equals(searchName)) {
                    System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n", s.getName(), s.getkScore(), s.geteScore(), s.getmScore(), s.getTotal(), s.getAvg());
                    sFound = true;
                    break; // 검색된 학생을 찾았으므로 루프 종료
                }
            }
            if (!sFound) {
                System.out.println("학생 이름을 확인해주세요.");
            }
        }
    }

    private static void modifyStudent(ArrayList<Student> sList, Scanner scanner) {
        System.out.print("수정할 사람의 이름 : ");
        String modName = scanner.next();
        if (!sList.isEmpty()) { // 비어있지 않다면 수정 가능
            System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
            int modSubject = scanner.nextInt();
            for (Student s : sList) {
                if (s.getName().equals(modName)) {
                    switch (modSubject) {
                        case 1:
                            System.out.print("국어점수 수정 : ");
                            int newKScore = scanner.nextInt();
                            s.setkScore(newKScore);
                            // 점수 수정 후 반영해서 총점, 평균 다시 구해야 함
                            s.setTotalAndAvg(newKScore, s.geteScore(), s.getmScore());
                            break;
                        case 2:
                            System.out.print("영어점수 수정 : ");
                            int newEScore = scanner.nextInt();
                            s.seteScore(newEScore);
                            // 점수 수정 후 반영해서 총점, 평균 다시 구해야 함
                            s.setTotalAndAvg(s.getkScore(), newEScore, s.getmScore());
                            break;
                        case 3:
                            System.out.print("수학점수 수정 : ");
                            int newMScore = scanner.nextInt();
                            // 점수 수정 후 반영해서 총점, 평균 다시 구해야 함
                            s.setTotalAndAvg(s.getkScore(), s.geteScore(), newMScore);
                            break;
                        default: // case이외의 경우
                            System.out.println("1,2,3 중 하나를 입력해주세요.");
                    }
                }
            }
        } else {
            System.out.println("수정할 학생이 없어요!");
        }
    }

    private static void deleteStudent(ArrayList<Student> sList, Scanner scanner) {
        System.out.print("삭제할 사람의 이름 : ");
        String delName = scanner.next();
        if (!sList.isEmpty()) { // 비어있지 않다면 삭제 가능
            for (int i = 0; i < sList.size(); i++) {
                Student s = sList.get(i);
                if (s.getName().equals(delName)) {
                    sList.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("삭제할 학생이 없어요!");
        }
    }

}
