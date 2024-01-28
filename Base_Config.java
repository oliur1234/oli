package Util.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base_Config {

    public static String getConfig(String value) throws IOException {

        String filePath = "src/main/java/Environment/Properties/qa.properties";
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(filePath);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties pro = new Properties();
        try {
            pro.load(fis);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
String propertiesName = pro.get(value).toString();

        return propertiesName;
    }

}

//    public static void main(String[] args) throws IOException {
//        System.out.println(BaseConfigReader.getConfigObject("url"));
//
//    }
//
//}
//    public static String getUrl(String url) throws IOException {
//       return getConfigObject().getProperty("url");
//    }
//
//    public static String getUsername() throws IOException {
//       return getConfigObject().getProperty("username");
//    }
//
//    public static String getPassword() throws IOException {
//        return getConfigObject().getProperty("password");
//    }
