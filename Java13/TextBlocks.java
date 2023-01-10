package Java13;

public class TextBlocks {

    static String dbSchema =   """
      CREATE TABLE 'TEST'.'EMPLOYEE'            \s
      (                                         \s
        'ID' INT NOT NULL DEFAULT 0 ,           \s
        'FIRST_NAME' VARCHAR(100) NOT NULL ,    \s
        'LAST_NAME' VARCHAR(100) NULL ,\
        'STAT_CD' TINYINT NOT NULL DEFAULT 0    \s
      );                                        \s
          """;

    public static void main(String[] args) {

        System.out.println("Using Text blocks to print multi-line data as is provided");
        System.out.println(dbSchema);
        System.out.println(dbSchema.replaceAll("\s", "."));
    }
}
