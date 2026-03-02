import java.util.ArrayList;
import java.util.List;

public final class ekla implements lqj {
    public final eklg a;

    public ekla(eklg eklg0) {
        this.a = eklg0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((List)object0) != null && !((List)object0).isEmpty()) {
            ekkz ekkz0 = this.a.d;
            ekkz0.a = ((List)object0).isEmpty() ? new ArrayList() : ((List)object0);
            ekkz0.q();
        }
    }
}

