import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.mdns.MdnsServiceInfo;
import j..util.Objects;
import java.util.List;

final class cqss implements IBinder.DeathRecipient, cqsk {
    public final cqro a;
    final cqst b;
    private final cqup c;
    private final IBinder d;
    private final azug e;

    public cqss(cqst cqst0, cqup cqup0, cqro cqro0, azug azug0) {
        Objects.requireNonNull(cqst0);
        this.b = cqst0;
        super();
        this.c = cqup0;
        this.a = cqro0;
        this.e = azug0;
        IBinder iBinder0 = cqup0.asBinder();
        this.d = iBinder0;
        iBinder0.linkToDeath(this, 0);
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        cqst.a.a("Binder is dead.");
        this.d.unlinkToDeath(this, 0);
        cqsr cqsr0 = new cqsr(this, this.e);
        this.b.c.b(cqsr0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof cqss) && this.d.equals(((cqss)object0).d);
    }

    @Override  // cqsk
    public final void f(List list0, int v) {
        try {
            this.c.a(list0, v);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void g(int v, int v1) {
        try {
            this.c.b(v, v1);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void h() {
        try {
            this.c.c();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override  // cqsk
    public final void i(int v) {
        try {
            this.c.d(v);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void j(MdnsServiceInfo mdnsServiceInfo0) {
        try {
            this.c.e(mdnsServiceInfo0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void k(String s) {
        try {
            this.c.f(s);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void l(MdnsServiceInfo mdnsServiceInfo0) {
        try {
            this.c.g(mdnsServiceInfo0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // cqsk
    public final void m() {
    }

    @Override  // cqsk
    public final void n() {
    }
}

