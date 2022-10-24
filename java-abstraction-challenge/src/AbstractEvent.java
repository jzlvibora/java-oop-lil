import java.sql.Timestamp;

public abstract class AbstractEvent implements Event{

    protected Long createdTimeStamp;
    protected String id;

    public AbstractEvent(String id) {
        this.id = id;
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }

    @Override
    public abstract  void process() ;

}
