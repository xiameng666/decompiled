import android.content.Context;
import android.security.intrusiondetection.IntrusionDetectionEvent;
import android.security.intrusiondetection.IntrusionDetectionEventTransport;
import java.util.ArrayList;
import java.util.List;

public final class cadz extends IntrusionDetectionEventTransport {
    private final Context a;
    private caed b;

    public cadz(Context context0) {
        this.a = context0;
        new ArrayList();
    }

    public final boolean addData(List list0) {
        ibuq.f(list0, "events");
        this.initialize();
        caed caed0 = null;
        if(!list0.isEmpty()) {
            try {
                caed caed1 = this.b;
                if(caed1 == null) {
                    ibuq.j("dataRepository");
                }
                else {
                    caed0 = caed1;
                }
                ibuq.f(list0, "events");
                caej caej0 = caed0.a.u();
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object0: list0) {
                    arrayList0.add(new caei(0L, ((IntrusionDetectionEvent)object0)));
                }
                cael cael0 = new cael(caej0, arrayList0);
                oqj.b(caej0.a, false, true, cael0);
                return true;
            }
            catch(Exception exception0) {
                throw new caeb("Failed to add data to the transport.", exception0);
            }
        }
        throw new caeb("Events list is empty.", null);
    }

    public final boolean initialize() {
        if(this.b != null) {
            return true;
        }
        try {
            this.b = new caed(this.a);
            return true;
        }
        catch(Exception exception0) {
            throw new caeb("Failed to initialize the transport.", exception0);
        }
    }

    public final boolean release() {
        return true;
    }
}

