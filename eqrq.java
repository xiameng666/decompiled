import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

public final class eqrq {
    private static final baun a;
    private final List b;
    private ResultReceiver c;

    static {
        eqrq.a = new erqc(new String[]{"D2D", "UI", "QueuedMessageSender"});
    }

    public eqrq() {
        this.b = new ArrayList();
    }

    public final void a(ResultReceiver resultReceiver0) {
        synchronized(this) {
            List list0 = this.b;
            for(Object object0: list0) {
                eqrq.a.j(a.h(((eqrp)object0).a, "Sending queued message with eventCode: "), new Object[0]);
                resultReceiver0.send(((eqrp)object0).a, ((eqrp)object0).b);
            }
            this.c = resultReceiver0;
            list0.clear();
        }
    }

    public final void b() {
        synchronized(this) {
            this.c = null;
        }
    }

    public final void c(int v, Bundle bundle0) {
        synchronized(this) {
            ResultReceiver resultReceiver0 = this.c;
            if(resultReceiver0 != null) {
                resultReceiver0.send(v, bundle0);
                return;
            }
            eqrq.a.j("Queuing message with eventCode: " + v, new Object[0]);
            eqrp eqrp0 = new eqrp(v, bundle0);
            this.b.add(eqrp0);
        }
    }
}

