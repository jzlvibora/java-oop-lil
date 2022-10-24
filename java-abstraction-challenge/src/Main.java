public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("12345");
        MissedPaymentEvent eventTwo = new MissedPaymentEvent("6789");

        Event[] events = {eventOne, eventTwo};
        for(Event e:events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
