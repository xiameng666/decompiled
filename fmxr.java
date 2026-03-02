import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Map;

public final class fmxr implements fmoz {
    public final fmya a;

    public fmxr(fmya fmya0) {
        this.a = fmya0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmya fmya0 = this.a;
        if(((gged_interceptors)object0).isEmpty()) {
            ((fmuw)fmya0.g).c(102);
        }
        fmpe fmpe0 = fmya0.l;
        if(fmpe0 != null) {
            fmpe0.l(fmya0.d);
            fmya0.l = null;
        }
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            fmga fmga0 = (fmga)((gged_interceptors)object0).get(v1);
            Map map0 = fmya0.f;
            ContactId contactId0 = fmga0.b;
            if(!map0.containsKey(contactId0)) {
                map0.put(contactId0, fmya0.z.c(fmya0.b, contactId0));
            }
        }
        fmya0.l = new fmpe(fmya0.f.values());
        fmya0.l.j(fmya0.d);
        fmya0.w = true;
    }
}

