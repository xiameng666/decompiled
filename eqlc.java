import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqlc implements Runnable {
    final eqle a;
    final IBinder b;

    public eqlc(eqld eqld0, eqle eqle0, IBinder iBinder0) {
        this.a = eqle0;
        this.b = iBinder0;
        Objects.requireNonNull(eqld0);
        super();
    }

    @Override
    public final void run() {
        erhe erhe0;
        eqle eqle0 = this.a;
        evqp evqp0 = eqle0.f;
        if(evqp0 == null) {
            return;
        }
        IBinder iBinder0 = this.b;
        if(iBinder0 == null) {
            erhe0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
            erhe0 = (iInterface0 instanceof erhe) ? ((erhe)iInterface0) : new erhc(iBinder0);
        }
        if(erhe0 == null) {
            eqle.a.m("AccountsService is null", new Object[0]);
            evqp0.d(new aztb(new Status(13)));
            return;
        }
        eqle0.e = erhe0;
        evqp0.c(null);
    }
}

