import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustSelectAllTest {

    public static void main(String[] args) throws Exception {
       // final CustService service = null;
        CustService service = new CustService();
        try{
            List<CustDto> custDtos = service.get();
//            System.out.println(custDtos);
            for(CustDto custDto: custDtos){
                System.out.printf("%s %s %s %n",  custDto.getId(), custDto.getName(), custDto.getPwd());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
