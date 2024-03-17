import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustDeleteTest {

    public static void main(String[] args) throws Exception {
       // final CustService service = null;
        CustService service = new CustService();
        CustDto dto = CustDto.builder().id("id99").pwd("pwd99").name("allzero").build();
        try{
            service.remove(dto.getId()); // 왜 안되지.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
