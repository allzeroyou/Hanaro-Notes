

import java.util.ArrayList;
import java.util.Scanner;

public class grademanagement {
    //static Info info = new Info();
    static ArrayList<String[]> info = new ArrayList<>();
    static String[] content = {"이름", " 국어", " 영어", " 수학", " 총점", " 평균"};
    static String[] subject = {"국어", "수학", "영어"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int kor, eng, mat;


        while(true) {
            System.out.println("-----------성적 관리 프로그램-------------");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("이름 입력 : ");
                    name = sc.next();
                    System.out.print("국어점수 입력 : ");
                    kor = sc.nextInt();
                    System.out.print("영어점수 입력 : ");
                    eng = sc.nextInt();
                    System.out.print("수학점수 입력 : ");
                    mat = sc.nextInt();
                    inputInfo(name, kor, eng, mat);
                    break;
                case 2:
                    printAllInfo();
                    break;
                case 3:
                    System.out.print("검색할 사람의 이름: ");
                    name = sc.next();
                    searchInfo(name);
                    break;
                case 4:
                    System.out.print("수정할 사람의 이름: ");
                    name = sc.next();
                    System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
                    int subj = sc.nextInt();
                    System.out.print(subject[subj-1]+"점수 수정 : ");
                    int score = sc.nextInt();
                    updateInfo(name, subj, score);
                    break;
                case 5:
                    System.out.print("삭제할 사람의 이름: ");
                    name = sc.next();
                    delInfo(name);
                    break;
                case 6:
                    System.out.println("종료!!");
                    System.out.println("종료 코드 0(으) 완료된 프로세스");
                    return;
            }

        }

    }

    public static void inputInfo(String name, int kor, int eng, int mat) {
        int total = kor + eng + mat;
        double avg = total*1.0/3;

        String[] i = new String[]{name, kor+"", eng+"", mat+"", total+"", avg+""};
        info.add(i);
    }

    public static void printAllInfo() {
        for(String[] in:info) {
            for(int i=0; i<6; i++) System.out.print(content[i]+": "+in[i]);
            System.out.println("");
        }
    }

    public static void searchInfo(String name) {
        for(String[] in:info) {
            if(name.equals(in[0])) {
                for(int i=0; i<6; i++) System.out.print(content[i]+": "+in[i]);
                System.out.println("");
            }
        }
    }

    public static void updateInfo(String name, int subj, int score) {
        for(int i=0; i<info.size(); i++) {
            if(name.equals(info.get(i)[0])) {
                String[] in = info.get(i);
                in[subj] = score+"";
                info.set(i, in);
            }
        }
    }

    public static void delInfo(String name) {
        for(int i=0; i<info.size(); i++) {
            if(name.equals(info.get(i)[0])) info.remove(i);
        }
    }
}