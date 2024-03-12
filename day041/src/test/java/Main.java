import org.example.app.data.CustDto;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // CustDto custDto = new CustDto("id01", "pwd01", "james");
        // builder형태로~
        CustDto custDto = CustDto.builder().id("test").pwd("testtt").build();
        System.out.println(custDto);
    }
}