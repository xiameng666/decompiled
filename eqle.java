import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.RemoteException;
import android.os.UserHandle;
import com.google.android.gms.common.api.Status;

public final class eqle {
    public static final baun a;
    public final Context b;
    public final Handler c;
    public bask d;
    public erhe e;
    public evqp f;

    static {
        eqle.a = new erqc(new String[]{"AccountsCrossUserClient"});
    }

    public eqle(Context context0, Handler handler0) {
        this.b = context0;
        this.c = handler0;
    }

    public final evql a(UserHandle userHandle0) {
        evqp evqp0 = this.f;
        if(evqp0 != null) {
            return evqp0.a;
        }
        evqp evqp1 = new evqp();
        this.f = evqp1;
        eqla eqla0 = new eqla(this, evqp1);
        Intent intent0 = new Intent("com.google.android.gms.smartdevice.setup.accounts.AccountsService.START");
        intent0.setPackage("com.google.android.gms");
        if(!this.b.bindServiceAsUser(intent0, eqla0, 1, userHandle0)) {
            eqle.a.m("Failed to bind to %s", new Object[]{userHandle0});
            evqp1.a(new aztb(new Status(10553)));
        }
        return evqp1.a;
    }

    public final evql b() {
        erhe erhe0 = this.e;
        if(erhe0 == null) {
            return evrg.c(new aztb(Status.d));
        }
        evqp evqp0 = new evqp();
        eqlb eqlb0 = new eqlb(evqp0);
        try {
            erhe0.i(new erfx(eqlb0));
        }
        catch(RemoteException remoteException0) {
            eqle.a.l(remoteException0);
        }
        return evqp0.a;
    }
}

