import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import j..util.Objects;

final class eqzd extends cvxg {
    final eqzf a;

    public eqzd(eqzf eqzf0, Class class0) {
        Objects.requireNonNull(eqzf0);
        this.a = eqzf0;
        super(class0);
    }

    @Override  // cvxn
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        DctDevice dctDevice0 = (DctDevice)cuwd0;
        eqzf.a.d("onBandwidthChanged", new Object[0]);
        if(cuuz0.a == 3) {
            eqwr eqwr0 = this.a.d;
            if(eqwr0 != null) {
                try {
                    eqwr0.a();
                }
                catch(RemoteException remoteException0) {
                    eqzf.a.l(remoteException0);
                }
            }
            this.a.g = true;
        }
    }

    @Override  // cvxn
    public final void b(cuwd cuwd0, cvxm cvxm0) {
        eqzf.a.d("onConnectionInitiated", new Object[0]);
        eqzf eqzf0 = this.a;
        cvxr cvxr0 = eqzf0.c;
        if(cvxr0 != null) {
            cvxr0.b(((DctDevice)cuwd0), eqzf0.i);
        }
    }

    @Override  // cvxn
    public final void c(cuwd cuwd0, cvxq cvxq0) {
        DctDevice dctDevice0 = (DctDevice)cuwd0;
        baun baun0 = eqzf.a;
        baun0.d("onConnectionResult", new Object[0]);
        Status status0 = cvxq0.a;
        if(status0.e()) {
            baun0.d("Connection succeed,", new Object[0]);
            eqzh eqzh0 = this.a.f;
            if(eqzh0 != null && this.a.c != null) {
                eqzh0.e = new eqwe();
            }
        }
        eqwr eqwr0 = this.a.d;
        if(eqwr0 != null) {
            try {
                eqwr0.b(status0);
            }
            catch(RemoteException remoteException0) {
                eqzf.a.l(remoteException0);
            }
        }
    }

    @Override  // cvxn
    public final void d(cuwd cuwd0, int v) {
        DctDevice dctDevice0 = (DctDevice)cuwd0;
        eqzf.a.d("onDisconnected", new Object[0]);
        eqzf eqzf0 = this.a;
        eqzf0.g = false;
        cvxr cvxr0 = eqzf0.c;
        if(cvxr0 != null) {
            cvxr0.f();
        }
        Context context0 = eqzf0.b;
        if(context0 != null) {
            TargetQuickStartChimeraService.g(context0);
        }
    }

    @Override  // cvxn
    public final void e(cuwd cuwd0, cuwq cuwq0) {
        eqzf.a.d("onInternetConnectionChanged.", new Object[0]);
        eqwr eqwr0 = this.a.d;
        if(eqwr0 != null) {
            try {
                eqwr0.d(cuwq0.b, cuwq0.c, cuwq0.a);
            }
            catch(RemoteException remoteException0) {
                eqzf.a.l(remoteException0);
            }
        }
    }

    @Override  // cvxg
    public final void f(String s, String s1) {
        eqzf.a.d("onEndpointIdRotated", new Object[0]);
        eqzf eqzf0 = this.a;
        String s2 = eqzf0.e;
        if(s2 != null) {
            String s3 = ejlj.a(1, 1, s1, s2).toString();
            Context context0 = eqzf0.b;
            if(context0 != null) {
                cjpa cjpa0 = new eqrm(context0).b.c();
                cjpa0.h("os_migration_session_id", s1);
                cjpd.g(cjpa0);
            }
            eqwr eqwr0 = eqzf0.d;
            if(eqwr0 != null) {
                try {
                    eqwr0.c(s3);
                }
                catch(RemoteException remoteException0) {
                    eqzf.a.l(remoteException0);
                }
            }
        }
    }

    @Override  // cvxg
    public final byte[] g(String s) {
        eqzf.a.d("onEndpointIdRotated", new Object[0]);
        return new byte[0];
    }
}

