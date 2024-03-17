import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustInsertTest {

    public static void main(String[] args) throws Exception {
       // final CustService service = null;
        CustService service = new CustService();
        CustDto dto = CustDto.builder().id("id97").pwd("pwd97").name("allzero").build();
        try{
            service.add(dto); // 왜 안되지.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
