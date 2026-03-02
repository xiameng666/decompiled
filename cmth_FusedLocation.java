import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;

public final class cmth_FusedLocation extends cnxc {
    public static final bboh a;
    public static final ibnn b;
    public final bxd c;
    public final cnxc d;

    static {
        cmth_FusedLocation.a = bboh.b("FusedLocation", bbcu.g);
        cmth_FusedLocation.b = new ibnz(new cmsg());
    }

    public cmth_FusedLocation() {
        super(((int)huqy_phenotype.e()), Object.class);
        this.c = new bxd();
        this.d = new cnxc(((int)huqy_phenotype.e()), Object.class);
    }

    public final cmsk a(ClientIdentity clientIdentity0) {
        Object object0;
        bxd bxd0 = this.c;
        synchronized(bxd0) {
            ClientIdentity clientIdentity1 = clientIdentity0.c();
            object0 = bxd0.get(clientIdentity1);
            if(object0 == null) {
                object0 = new cmsk();
                bxd0.put(clientIdentity1, object0);
            }
        }
        return (cmsk)object0;
    }

    @Override  // cnxc
    public final void b(Object object0) {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            if(this.p(new cmsb(new cmsa(v1, object0)))) {
                this.r();
                this.m(v1, new cmsq(((cmsq)object0).a, cmsp.c, ((cmsq)object0).c));
            }
            else if(this.p(new cmsd(new cmsc(v1, object0)))) {
                this.r();
                this.b(object0);
            }
            else if(!this.p(new cmsf(new cmse(v1, object0)))) {
                this.m(v1, object0);
            }
        }
    }

    public final void c(ClientIdentity clientIdentity0, cmtm cmtm0) {
        synchronized(this) {
            cmsr cmsr0 = new cmsr(clientIdentity0, cmtm0);
            this.d.b(cmsr0);
        }
        if(cmtm0 != null) {
            cmsk cmsk0 = this.a(clientIdentity0);
            int v1 = cmtm0.a();
            synchronized(cmsk0) {
                cmsk0.f += v1;
                if(!cmsk0.e.isEmpty()) {
                    cmsk0.g += v1;
                }
            }
        }
    }

    public final void d(cmuh_unknownRequest cmuh0, long v) {
        ibuq.f(cmuh0, "request");
        this.b(new cmsx(cmuh0, v));
    }

    public final void e(cmuh_unknownRequest cmuh0) {
        ibuq.f(cmuh0, "request");
        this.d(cmuh0, 0L);
    }

    public final void f(String s, long v, long v1) {
        this.b(new cmsz(s, v, v1));
    }

    public final void g(String s, boolean z) {
        ibuq.f(s, "provider");
        this.b(new cmtd(s, z));
    }
}

