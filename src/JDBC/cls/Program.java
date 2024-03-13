package JDBC.cls;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
//        addNewStudent("omer","0528-888888",90.00,"Raanana",false);
//        addNewStudent("omer2","0528-8888838",93,"Raanana2",true);
        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_COUPONLAND_SCHEMA));
//        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_COMPANIES_TABLE));
//        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_CUSTOMERS_TABLE));
//        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_CATEGORIES_TABLE));
//        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_COUPONS_TABLE));
//        System.out.println(DBUtils.runQuery(SQLCommands.CREATE_CUSTOMERS_VS_COUPONS_TABLE));
//        System.out.println(DBUtils.runQuery(SQLCommands.SET_FK_CUSTOMERS_VS_COUPONS1));
//        System.out.println(DBUtils.runQuery(SQLCommands.SET_FK_CUSTOMERS_VS_COUPONS2));
//        System.out.println(DBUtils.runQuery(SQLCommands.SET_FK_COUPONS_TABLE1));
//        System.out.println(DBUtils.runQuery(SQLCommands.SET_FK_COUPONS_TABLE2));
//        System.out.println(DBUtils.runQuery(SQLCommands.SET_FK_COUPONS_TABLE3));
//        SQLCommands.INSTALLATION_SQL.stream().map(DBUtils::runQuery).forEach(result-> System.out.println(result?"Done!":"!!!!"));
        SQLCommands.getInstallationSQL().stream().map(DBUtils::runQuery).forEach(result-> System.out.println(result?"Done!":"!!!!"));


    //    SQLCommands.getInstallationSQL().forEach(System.out::println);

     //   System.out.println(SQLCommands.getInstallationSQL().pop());




    }


    private static void addNewStudent(String name, String tel, double avgGrade, String city, boolean married) {
        Map<Integer, Object> params = new HashMap<>();
        params.put(1, name);
        params.put(2, tel);
        params.put(3, city);
        params.put(4, avgGrade);
        params.put(5, married);
        DBUtils.runQuery(SQLCommands.addStudent, params);
    }

}
