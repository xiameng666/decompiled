import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class cqst extends cqul implements cjug {
    public static final cqwd a;
    public final String b;
    public final cjts c;
    final cqro d;
    final ConcurrentMap e;
    private final String f;
    private final String g;
    private final cqrq h;

    static {
        cqst.a = new cqwd("MdnsServiceStub");
    }

    public cqst(MdnsOptions mdnsOptions0, cqrq cqrq0, cjts cjts0, cqro cqro0, String s, String s1) {
        this.e = new ConcurrentHashMap();
        this.f = s;
        this.g = s1;
        this.b = mdnsOptions0.a;
        this.h = cqrq0;
        batl.s(cjts0);
        this.c = cjts0;
        batl.s(cqro0);
        this.d = cqro0;
    }

    public final cqro a(MdnsSearchOptions mdnsSearchOptions0) {
        return mdnsSearchOptions0.f != 0 && mdnsSearchOptions0.f != 1 ? this.d : this.h;
    }

    @Override  // cqum
    public final void c(cqup cqup0, MdnsSearchOptions mdnsSearchOptions0, ApiMetadata apiMetadata0) {
        cqss cqss0;
        cqro cqro0;
        if(cqup0 != null && mdnsSearchOptions0 != null) {
            try {
                cqro0 = this.a(mdnsSearchOptions0);
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.f(azud.a);
                azuf0.e(bbdp.cN);
                azuf0.g(bbdq.z);
                azuf0.d(this.f);
                azuf0.c(this.g);
                cqss0 = new cqss(this, cqup0, cqro0, azuf0.a());
            }
            catch(RemoteException unused_ex) {
                return;
            }
            IBinder iBinder0 = cqup0.asBinder();
            this.e.put(iBinder0, cqro0);
            azuf azuf1 = azug.b(apiMetadata0);
            azuf1.f(azud.a);
            azuf1.e(bbdp.cN);
            azuf1.g(bbdq.z);
            azuf1.d(this.f);
            azuf1.c(this.g);
            cqsp cqsp0 = new cqsp(this, azuf1.a(), mdnsSearchOptions0, cqss0);
            this.c.b(cqsp0);
        }
    }

    @Override  // cqum
    public final void d(cqup cqup0, ApiMetadata apiMetadata0) {
        cqss cqss0;
        if(cqup0 != null) {
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.f(azud.a);
            azuf0.e(bbdp.cN);
            azuf0.g(bbdq.z);
            azuf0.d(this.f);
            azuf0.c(this.g);
            azug azug0 = azuf0.a();
            IBinder iBinder0 = cqup0.asBinder();
            cqro cqro0 = (cqro)this.e.remove(iBinder0);
            if(cqro0 == null) {
                cqro0 = this.h;
            }
            try {
                cqss0 = new cqss(this, cqup0, cqro0, azug0);
            }
            catch(RemoteException unused_ex) {
                return;
            }
            cqss0.binderDied();
        }
    }
}

