import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustSelectTest {

    public static void main(String[] args) throws Exception {
       // final CustService service = null;
        CustService service = new CustService();

        try{
            CustDto custData= service.get("id01");
            System.out.println(custData);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
