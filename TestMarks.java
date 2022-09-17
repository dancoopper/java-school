import hsa.Console;
public class TestMarks {
    Console c;

    public void drawTitle(){
        c.print("", 17);
        c.print("Student");
        c.print("", 5);
        c.print("Test1");
        c.print("", 5);
        c.print("Test2");
        c.print("", 5);
        c.println("Test Average");
    }

    public void drawData(){
        c.print("", 17);
        //data line one
        c.print("Donald");
        c.print("", 6);
        c.print(45);
        c.print("", 8);
        c.print(80);
        c.print("", 9);
        c.println((80d + 45d) /2d);
        //line two
        c.print("", 17);
        c.print("Mickey");
        c.print("", 6);
        c.print(33);
        c.print("", 8);
        c.print(39);
        c.print("", 9);
        c.println((33d + 39d) /2d);
        //line three
        c.print("", 17);
        c.print("Bugs");
        c.print("", 8);
        c.print(79);
        c.print("", 8);
        c.print(92);
        c.print("", 9);
        c.println((79d + 92d) /2d);
    }
    public TestMarks(){
        c = new Console();
    }
    public static void main(String[] args) {
        TestMarks tm;
        tm = new TestMarks();
        tm.drawTitle();
        tm.drawData();
    }
}
