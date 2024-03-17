import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustUpdateTest {

    public static void main(String[] args) throws Exception {
       // final CustService service = null;
        CustService service = new CustService();
        CustDto dto = CustDto.builder().id("id99").pwd("pwd99").name("allzero").build();
        try{
            service.modify(dto); // 왜 안되지.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
