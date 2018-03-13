import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Properties properties = new Properties();
//
//        properties.setProperty("Driver", "Oracle JDBC");
//        properties.setProperty("URL", "JDBC.Oracle.thin:@localhost1521:xe");
//        properties.setProperty("User", "Yoon");
//        properties.setProperty("Pass", "sangwon");
//
//        System.out.print(properties + "\n");
//
//        try {
//            properties.store(new FileOutputStream("OracleDriver.dat"), "jdbcOracle");
//            properties.store(new FileWriter("OracleDriver.txt"), "Use Write");
//            properties.storeToXML(new FileOutputStream("OracleXml.xml"), "Save Xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Properties rprop = new Properties();

        try {
//            rprop.load(new FileInputStream("OracleDriver.dat"));
            rprop.loadFromXML(new FileInputStream("OracleXml.xml"));
//            rprop.load(new FileReader("OracleDriver.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(rprop + "\n");



//        map.put("Weather", " Sunny");
//        map.put("Time", "Fast");
//        map.put("time", new Date());
//        map.put(1, 150);
//
//        System.out.print(map + "\n");
//
//        System.out.print(map + "\n");
//
//        map.put(50, 150);
//        map.put(100, 150);
//
//        System.out.print(map + "\n");
//
//        String str = (String)map.get("Time");
//
//        System.out.print(str + "\n");
//        System.out.print(map.get("Time").toString() + "\n");
//
//        Date date = (Date)map.get("time");
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.print(sf.format(date) + "\n");
//
//        map.remove("Weather");
//        System.out.print(map + "\n");

//        MemberMenu memberMenu = new MemberMenu();
//        memberMenu.mainMenu();
//
//        System.out.println("Exit");
    }
}