/**
 * @since 2022-02-24
 */
public class testMain {
    public static void main(String [] args)
    {
        try {
            test();
            System.out.println("====== Test called =========");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void test() throws Exception {
        throw new Exception("test exception");
    }
}
