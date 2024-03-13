package JDBC.cls;

import java.util.List;
import java.util.Stack;

public class SQLCommands {
public static String SCHEMA_NAME="couponland233";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS `class169`.`students` (  `id` INT NOT NULL AUTO_INCREMENT,  `name` VARCHAR(45) NULL,  `tel` VARCHAR(45) NULL,  `avgGrade` INT NULL,  `city` VARCHAR(45) NULL,  PRIMARY KEY (`id`));";
    public static final String addStudent = "INSERT INTO `ex1`.`students` (`name`, `phonenumber`, `city`, `AverageGrade`, `ismarried`) VALUES (?, ?, ?, ?, ?);";
    public static final String getAllStudents = "SELECT * FROM `class169`.`students`";
    public static final String getStudentsAbove95 = "SELECT * FROM `class169`.`students` WHERE avgGrade>95";
    public static final String getStudentAbove = "SELECT * FROM `class169`.`students` WHERE avgGrade>?";
    public static final String getStudentBetwen = "SELECT * FROM `class169`.`students` WHERE avgGrade>? AND avgGrade<?";
    public static final String createCompaniesTable = "CREATE TABLE `companies` (  `id` INT NOT NULL AUTO_INCREMENT,  `name` VARCHAR(45) NULL,  `email` VARCHAR(45) NULL,  `password` VARCHAR(10) NULL,  PRIMARY KEY (`id`),  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);";
    public static final String isCompanyExsists = "SELECT count(*) as isExists FROM `class169`.`companies` WHERE company_email=? AND company_password=?";
    public static final String isCompanyExsists2 = "SELECT * FROM `class169`.`companies` WHERE company_email=? AND company_password=?";


    public static final String CREATE_COUPONLAND_SCHEMA = "CREATE SCHEMA IF NOT EXISTS "+SCHEMA_NAME;
    public static final String CREATE_COMPANIES_TABLE = "CREATE TABLE IF NOT EXISTS "+SCHEMA_NAME+".`companies` (" +
            " `id` INT NOT NULL AUTO_INCREMENT," +
            " `name` VARCHAR(30) NOT NULL," +
            " `email` VARCHAR(30) NOT NULL," +
            " `password` VARCHAR(12) NOT NULL," +
            " PRIMARY KEY (`id`)," +
            " UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE," +
            " UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);";


    public static final String CREATE_CUSTOMERS_TABLE = "CREATE TABLE IF NOT EXISTS "+SCHEMA_NAME+".`customers` (" +
            " `id` INT NOT NULL AUTO_INCREMENT," +
            " `first_name` VARCHAR(12) NOT NULL," +
            " `last_name` VARCHAR(20) NOT NULL," +
            " `email` VARCHAR(30) NOT NULL," +
            " `password` VARCHAR(12) NOT NULL," +
            " PRIMARY KEY (`id`)," +
            " UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);";

    public static final String CREATE_CATEGORIES_TABLE = "CREATE TABLE IF NOT EXISTS "+SCHEMA_NAME+".`categories` (" +
            " `id` INT NOT NULL AUTO_INCREMENT," +
            " `name` VARCHAR(24) NOT NULL," +
            " PRIMARY KEY (`id`)," +
            " UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE);";

    public static final String CREATE_COUPONS_TABLE = "CREATE TABLE IF NOT EXISTS "+SCHEMA_NAME+".`coupons` (" +
            " `id` INT NOT NULL AUTO_INCREMENT," +
            " `company_id` INT NOT NULL," +
            " `category_id` INT NOT NULL," +
            " `title` VARCHAR(20) NOT NULL," +
            " `description` VARCHAR(120) NULL DEFAULT 'a detailed description will be added soon!'," +
            " `start_date` DATE NOT NULL," +
            " `end_date` DATE NOT NULL," +
            " `amount` INT UNSIGNED NOT NULL," +
            " `price` DOUBLE UNSIGNED NOT NULL," +
            " `image` VARCHAR(255) NULL DEFAULT 'an image will be added soon!'," +
            " PRIMARY KEY (`id`)," +
            " UNIQUE INDEX `unique coupon name per company` (`company_id` ASC, `title` ASC) INVISIBLE);";

    public static final String CREATE_CUSTOMERS_VS_COUPONS_TABLE = "CREATE TABLE IF NOT EXISTS "+SCHEMA_NAME+".`customers_vs_coupons` (" +
            " `customer_id` INT NOT NULL," +
            " `coupon_id` INT NOT NULL," +
            " PRIMARY KEY (`customer_id`, `coupon_id`));";
    public static final String SET_FK_COUPONS_TABLE1 = "ALTER TABLE "+SCHEMA_NAME+".`coupons`" +
            " ADD CONSTRAINT `fk_company_id`" +
            " FOREIGN KEY (`company_id`)" +
            " REFERENCES `couponland`.`companies` (`id`)" +
            " ON DELETE CASCADE" +
            " ON UPDATE CASCADE;";
    public static final String SET_FK_COUPONS_TABLE2="ALTER TABLE "+SCHEMA_NAME+".`coupons` " +
            "ADD INDEX `fk_category_id_idx` (`category_id` ASC) VISIBLE;" +
            ";";
    public static final String SET_FK_COUPONS_TABLE3 = "ALTER TABLE "+SCHEMA_NAME+".`coupons`" +
            " ADD CONSTRAINT `fk_category_id`" +
            " FOREIGN KEY (`category_id`)" +
            " REFERENCES `couponland`.`categories` (`id`)" +
            " ON DELETE CASCADE" +
            " ON UPDATE CASCADE;";

    public static final String SET_FK_CUSTOMERS_VS_COUPONS1="ALTER TABLE "+SCHEMA_NAME+".`customers_vs_coupons` " +
            "ADD INDEX `fk_coupon_id_idx` (`coupon_id` ASC) VISIBLE;" +
            ";";
    public static final String SET_FK_CUSTOMERS_VS_COUPONS2="ALTER TABLE "+SCHEMA_NAME+".`customers_vs_coupons` " +
            "ADD CONSTRAINT `fk_coupon_id`" +
            "  FOREIGN KEY (`coupon_id`)" +
            "  REFERENCES `couponland`.`coupons` (`id`)" +
            "  ON DELETE CASCADE" +
            "  ON UPDATE CASCADE," +
            "ADD CONSTRAINT `fk_customer_id`" +
            "  FOREIGN KEY (`customer_id`)" +
            "  REFERENCES `couponland`.`customers` (`id`)" +
            "  ON DELETE CASCADE" +
            "  ON UPDATE CASCADE;";
    private static final List<String> INSTALLATION_SQL=List.of(CREATE_COMPANIES_TABLE,CREATE_CUSTOMERS_TABLE,CREATE_CATEGORIES_TABLE,CREATE_COUPONS_TABLE,CREATE_CUSTOMERS_VS_COUPONS_TABLE,
            SET_FK_COUPONS_TABLE1,SET_FK_COUPONS_TABLE2,SET_FK_COUPONS_TABLE3,SET_FK_CUSTOMERS_VS_COUPONS1,SET_FK_CUSTOMERS_VS_COUPONS2);

    public static Stack<String> getInstallationSQL() {
        Stack<String> installationSQL = new Stack<>();
        INSTALLATION_SQL.forEach(installationSQL::push);
        return installationSQL;
    }
    public SQLCommands() {
    }
}




//    private static final List<String> INSTALLATION_SQL = List.of(CREATE_COMPANIES_TABLE, CREATE_CUSTOMERS_TABLE, CREATE_CATEGORIES_TABLE, CREATE_COUPONS_TABLE, CREATE_CUSTOMERS_VS_COUPONS_TABLE,
//            SET_FK_COUPONS_TABLE1, SET_FK_COUPONS_TABLE2, SET_FK_COUPONS_TABLE3, SET_FK_CUSTOMERS_VS_COUPONS1, SET_FK_CUSTOMERS_VS_COUPONS2);
//
//    public static Stack<String> getInstallationSQL() {
//        Stack<String> installationSQL = new Stack<>();
//        INSTALLATION_SQL.forEach(installationSQL::push);
//        return installationSQL;
//    }
//
//    public static Stack<String> getInstallationSQL2() {
//        Stack<String> installationSQL = new Stack<>();
//        return INSTALLATION_SQL.stream().reduce(installationSQL, (tempStack, command) -> {
//            tempStack.push(command);
//            return tempStack;
//        }, (a, b) -> a);
//    }










