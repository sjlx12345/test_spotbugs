package SpotBugsTets;

public class MyTest {

    static  String myclean(String x) { return x; } //clean
    static String mysource(String x) { return x; }
    static void mysink(String x) {}

    static void bad()
    {
        //BB1 0-0
        //BB3 2-9
        //BB5 10-17
        //BB7 19-26
        //BB9 27-32
        //BB11 34-34
        //BB13 37-42
        //BB15 44-44
        //BB17 47-51
        //BB19 52-55

        String dirty= mysource("dfdf");
        String bar;

        java.util.HashMap<String, Object> map51005 = new java.util.HashMap<String, Object>();

        map51005.put("keyA-51005", "a_Value"); // put some stuff in the collection
        map51005.put("keyB-51005", dirty); // put it in a collection
        bar = (String) map51005.get("keyB-51005"); // get it back out
        bar = (String) map51005.get("keyA-51005"); // get safe value back out

        mysink(dirty);
    }

    public static void main(String[] args) {
        //good();
        bad();
    }
}