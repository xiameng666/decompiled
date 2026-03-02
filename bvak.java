import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;
import java.util.Map;

final class bvak extends ibsl implements ibtw {
    final bval a;
    final SessionLifecycleRequest b;
    final bvad c;
    private Object d;

    public bvak(bval bval0, SessionLifecycleRequest sessionLifecycleRequest0, bvad bvad0, ibrl ibrl0) {
        this.a = bval0;
        this.b = sessionLifecycleRequest0;
        this.c = bvad0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvak)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bvak(this.a, this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bvas bvas0;
        ibnx.b(object0);
        icck icck0 = (icck)this.d;
        SessionLifecycleRequest sessionLifecycleRequest0 = this.b;
        bval bval0 = this.a;
        Map map0 = bval0.a;
        String s = sessionLifecycleRequest0.a;
        iced iced0 = (iced)map0.get(s);
        if(iced0 != null) {
            iceb.a(iced0);
        }
        ibuq.f(sessionLifecycleRequest0, "<this>");
        int v = sessionLifecycleRequest0.b;
        ibot ibot0 = new ibot(((ibow)bvas.d));
        while(ibot0.hasNext()) {
            Object object1 = ibot0.next();
            bvas0 = (bvas)object1;
            if(bvas0.e != v) {
                continue;
            }
            goto label_18;
        }
        bvas0 = bvas.a;
    label_18:
        if(bvas0 == bvas.b) {
            map0.put(s, icbb.b(icck0, null, null, new bvaj(sessionLifecycleRequest0, bval0, this.c, null), 3));
            this.c.c();
            return Status.b;
        }
        if(bvas0 == bvas.c) {
            bval0.a(s, this.c, false);
        }
        return Status.b;
    }
}

