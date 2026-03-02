import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class eqzm implements eqfu {
    final eqzp a;

    public eqzm(eqzp eqzp0) {
        Objects.requireNonNull(eqzp0);
        this.a = eqzp0;
        super();
    }

    @Override  // epyv
    public final void a(int v, String s, eqoc eqoc0) {
        eqzp.f.m(s, new Object[0]);
        this.a.m(v, eqoc0);
        this.a.d.d(v, eqoc0);
    }

    @Override  // epyv
    public final void b(MessagePayload messagePayload0) {
        this.a.n(messagePayload0);
    }

    @Override  // eqfu
    public final void c(BootstrapAccount bootstrapAccount0) {
    }

    @Override  // eqfu
    public final void d(List list0) {
        this.a.y(list0);
    }

    @Override  // eqfu
    public final void e() {
        eqzp.f.h("onCompleted().", new Object[0]);
        this.a.p();
    }

    @Override  // eqfu
    public final void f() {
        eqzp eqzp0 = this.a;
        if(eqzp0.r == 1) {
            eqwu eqwu0 = eqzp0.h;
            if(eqwu0 != null) {
                try {
                    eqwu0.f(new QuickStartTargetEventData(5, null, null, 0, true, null, 0, null, false, null, 0));
                }
                catch(RemoteException remoteException0) {
                    eqzp.f.n("Failed to call onEvent() callback", remoteException0, new Object[0]);
                }
            }
        }
    }

    @Override  // eqfu
    public final void g(List list0) {
        eqzp eqzp0 = this.a;
        gged_interceptors gged0 = eqsh.l(list0);
        if(eqzp0.r == 3) {
            epxf epxf0 = eqzp0.e;
            epxf0.k = new ArrayList(new ArrayList(gged0));
        }
        eqwu eqwu0 = eqzp0.h;
        if(eqwu0 != null) {
            try {
                eqwu0.f(new QuickStartTargetEventData(5, null, null, 0, false, null, 0, null, false, gged0, 0));
            }
            catch(RemoteException remoteException0) {
                eqzp.f.l(remoteException0);
            }
        }
    }
}

