import org.mortbay.xml.XmlConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author: leefaus
 * Create Date: 7/22/11
 * @version: v0.1
 */

public class InfiniDoc {
    public static void main(String args[]) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"cxf-service-config.xml"});
    }
}
