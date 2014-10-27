import com.imipgroup.hieuvt.Birthday;
import com.imipgroup.hieuvt.BirthdayCalendar;
import com.imipgroup.hieuvt.BirthdayCalendarService;
import junit.framework.TestCase;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by hieu.vutrong on 10/27/2014.
 */
public class TestClient extends TestCase {
    public void testClient() throws Exception {
        BirthdayCalendar bc = new BirthdayCalendarService().getBirthdayCalendarPort();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        //have to convert Date to XMLGregorianCalendar
        Date date = sdf.parse("21-02-1971");

        GregorianCalendar gregory = new GregorianCalendar();
        gregory.setTime(date);

        XMLGregorianCalendar calendar = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(
                        gregory);
        List<Birthday> br = bc.getBirthdaysInMonth(2);
        if (br == null || br.size() == 0) {
            bc.addBirthday("Erik", calendar);
        }
        List<Birthday> b = bc.getBirthdaysInMonth(2);
        assertEquals(1, b.size());
        assertEquals("Erik", b.get(0).getName());
        assertEquals(21, b.get(0).getDayOfMonth());
        //
        System.out.println(b.get(0).getName() + " " + b.get(0).getDayOfMonth());
    }
}
