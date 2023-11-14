public class Main {

    public static void main(String[] args) {

        MyCalendarThree obj = new MyCalendarThree();
        int param_1 = obj.book(10, 20); // return 1
        int param_2  = obj.book(50, 60); // return 1
        int param_3 = obj.book(10, 40); // return 2
        int param_4 = obj.book(5, 15); // return 3
        int param_5 = obj.book(5, 10); // return 3
        int param_6 = obj.book(25, 55);// return 3
        System.out.println(param_1 +", "+ param_2 +", "+ param_3 +", "+ param_4 +", "+ param_5 +", "+ param_6);

    }
}
