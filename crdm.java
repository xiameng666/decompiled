import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

public final class crdm {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public crdm(crkt crkt0, String s, String s1, String s2, long v, long v1, Bundle bundle0) {
        batl.q(s1);
        EventParams eventParams0;
        batl.q(s2);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = v1;
        if(v1 != 0L && v1 > v) {
            crkt0.aJ().f.b("Event created with reverse previous/current timestamps. appId", crji.a(s1));
        }
        if(bundle0 != null && !bundle0.isEmpty()) {
            Bundle bundle1 = new Bundle(bundle0);
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(s3 == null) {
                    crkt0.aJ().c.a("Param name can\'t be null");
                    iterator0.remove();
                }
                else {
                    Object object1 = crkt0.p().y(s3, bundle1.get(s3));
                    if(object1 == null) {
                        crkt0.aJ().f.b("Param value can\'t be null", crkt0.i.d(s3));
                        iterator0.remove();
                    }
                    else {
                        crkt0.p().L(bundle1, s3, object1);
                    }
                }
            }
            eventParams0 = new EventParams(bundle1);
        }
        else {
            eventParams0 = new EventParams(new Bundle());
        }
        this.f = eventParams0;
    }

    public crdm(crkt crkt0, String s, String s1, String s2, long v, long v1, EventParams eventParams0) {
        batl.q(s1);
        batl.q(s2);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = v1;
        if(v1 != 0L && v1 > v) {
            crkt0.aJ().f.c("Event created with reverse previous/current timestamps. appId, name", crji.a(s1), crji.a(s2));
        }
        this.f = eventParams0;
    }

    @Override
    public final String toString() {
        return "Event{appId=\'" + this.a + "\', name=\'" + this.b + "\', params=" + this.f.toString() + "}";
    }
}

