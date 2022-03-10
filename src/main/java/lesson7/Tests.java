package lesson7;

public class Tests {

    @Test(priority = 1)
    public static  void test1(){
        System.out.printf("test1");
    }

    @Test(priority = 2)
    public static void test2(){
        System.out.printf("test2");
    }

    @Test(priority = 3)
    public static void test3(){
        System.out.println("test3");
    }

    @Test(priority = 4)
    public static void test4(){
        System.out.println("test4");
    }
    @Test
    public static void test5(){
        System.out.println("test5");
    }

    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("До начала тестов");
    }

    @AfterSuite
    public static void afterSuite(){
        System.out.println("После окончания тестов");
    }
}
