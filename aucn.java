import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import j..util.Objects;

final class aucn implements aubh {
    final aucp a;

    public aucn(aucp aucp0) {
        Objects.requireNonNull(aucp0);
        this.a = aucp0;
        super();
    }

    @Override  // aubh
    public final void h(int v) {
        aucp aucp0 = this.a;
        aucp0.h.c("Failed with status code %d to %s to the endpoint of %s", new Object[]{v, (aucp0.x == 4 ? "reconnect" : "connect"), aucp0.e});
        int v1 = aucp0.v(v, aucp0.e);
        if(aucp0.x == 4) {
            aucp0.B(v1);
            return;
        }
        aucp0.x = 1;
        aucp0.q.e.h(v1);
    }

    @Override  // aubh
    public final void hh(ApplicationMetadata applicationMetadata0, String s, String s1, boolean z) {
        aucp aucp0 = this.a;
        String s2 = applicationMetadata0.a;
        aucp0.w = s2;
        aucp0.g.b(s1);
        aucp0.i.h(s1, aucp0, s2);
        if(aucp0.x != 4) {
            aucp0.h.n("notify onApplicationConnected with applicationId = %s", s2);
            aucp0.q.e.hh(applicationMetadata0, s, s1, z);
            return;
        }
        aucp0.h.n("%s successfully joined the app on the new endpoint device.", aucp0.e);
        aucp0.A();
        aucp0.x = 3;
        aucp0.q.e.hn(true);
    }

    @Override  // aubh
    public final void hi(int v) {
        aucp aucp0 = this.a;
        if(aucp0.x != 4) {
            aucp0.q.e.hi(v);
            return;
        }
        aucp0.h.p("%s failed to join the app on the new endpoint device. Error: %d ", aucp0.e, Integer.valueOf(v));
        aucp0.B(v);
    }

    @Override  // aubh
    public final void hj(int v, String s) {
        this.a.C();
        this.a.q.e.hj(v, s);
    }

    @Override  // aubh
    public final void hk(ApplicationStatus applicationStatus0) {
        this.a.q.e.hk(applicationStatus0);
    }

    @Override  // aubh
    public final void hl(int v, String s) {
        this.a.q.e.hl(v, s);
    }

    @Override  // aubh
    public final void hm(String s, byte[] arr_b) {
        this.a.q.e.hm(s, arr_b);
    }

    @Override  // aubh
    public final void hn(boolean z) {
        aucp aucp0 = this.a;
        if(aucp0.x == 4) {
            aucd aucd0 = aucp0.l;
            if(aucd0 != null) {
                for(Object object0: aucp0.o) {
                    aucd0.i(((String)object0));
                }
                aucd0.j();
                aucp0.t.f(null);
                if(aucp0.y() == null && aucp0.w == null) {
                    aucp0.x = 3;
                    aucp0.q.e.hn(z);
                }
            }
            return;
        }
        aucp0.x = 3;
        aucp0.q.e.hn(z);
    }

    @Override  // aubh
    public final void hw() {
        this.a.q.e.hw();
    }

    @Override  // aubh
    public final void i(int v) {
        this.a.h.d("CastSessionController.onConnectionSuspended() should never be called", new Object[0]);
    }

    @Override  // aubh
    public final void j(DeviceStatus deviceStatus0) {
        aucp aucp0 = this.a;
        if(aucp0.x == 4) {
            aucd aucd0 = aucp0.l;
            if(deviceStatus0.d != null && deviceStatus0.d.a.equals(aucp0.w) && aucd0 != null) {
                aucp0.h.p(" %s\'s endpoint device %s is running the desired app now. Connecting to it", aucp0.e, aucd0.e);
                aucd0.e(aucp0.w, aucp0.y(), aucp0.r);
            }
            return;
        }
        aucp0.q.e.j(deviceStatus0);
    }

    @Override  // aubh
    public final void k(int v) {
        if(v == 0) {
            this.a.C();
            this.a.x = 1;
            this.a.D();
            this.a.q.e.k(0);
            return;
        }
        aucp aucp0 = this.a;
        aucd aucd0 = aucp0.l;
        if(aucd0 != null) {
            avjh avjh0 = aucp0.h;
            CastDevice castDevice0 = aucd0.e;
            avjh0.c("disconnected with status code %d from the connected device %s", new Object[]{v, castDevice0});
            int v1 = aucp0.v(v, castDevice0);
            aucd aucd1 = aucp0.l;
            if(aucd1 == null) {
                avjh0.g("No active connection. Suspension should not happen.", new Object[0]);
                return;
            }
            CastDevice castDevice1 = aucd1.e;
            aucp0.D();
            aucp0.x = 4;
            aucp0.q.e.i(v1);
            aucp0.H(castDevice1, castDevice1.j, false);
        }
    }

    @Override  // aubh
    public final void l(String s, long v) {
        this.a.q.e.l(s, v);
    }

    @Override  // aubh
    public final void m(String s, long v, int v1) {
        this.a.q.e.m(s, v, v1);
    }

    @Override  // aubh
    public final void n(String s, double f, boolean z) {
        this.a.q.e.n(s, f, z);
    }

    @Override  // aubh
    public final void o(String s, String s1) {
        this.a.q.e.o(s, s1);
    }
}

