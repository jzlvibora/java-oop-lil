public interface Event {
    //interface - set of method signatures for to-be-implemented function
    //specification for a set of behavior without implementation
    Long getTimeStamp();
    void process();
}
