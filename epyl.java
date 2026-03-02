import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;

public class epyl {
    private static final erqc a;
    private final gfsx b;
    private final gfsx c;

    static {
        epyl.a = new erqc(new String[]{"epyl"});
    }

    public epyl(epyl epyl0) {
        this.b = epyl0.b;
        this.c = epyl0.c;
    }

    public epyl(eqia eqia0) {
        this.c = gfsx.l(eqia0);
        this.b = gfqx.a;
    }

    public epyl(eqib eqib0) {
        this.b = gfsx.l(eqib0);
        this.c = gfqx.a;
    }

    public void a(AccountTransferResult[] arr_accountTransferResult) {
        try {
            gfsx gfsx0 = this.b;
            if(gfsx0.i()) {
                ((eqib)gfsx0.d()).a(arr_accountTransferResult);
            }
        }
        catch(RemoteException remoteException0) {
            epyl.a.l(remoteException0);
        }
    }

    public void b(int v, String s) {
        try {
            gfsx gfsx0 = this.b;
            if(gfsx0.i()) {
                ((eqib)gfsx0.d()).b(v, s);
                return;
            }
            gfsx gfsx1 = this.c;
            if(gfsx1.i()) {
                eqia eqia0 = (eqia)gfsx1.d();
                Parcel parcel0 = eqia0.jo();
                parcel0.writeInt(v);
                parcel0.writeString(s);
                eqia0.jp(5, parcel0);
            }
        }
        catch(RemoteException remoteException0) {
            epyl.a.l(remoteException0);
        }
    }

    public final void c(PendingIntent pendingIntent0) {
        try {
            gfsx gfsx0 = this.b;
            if(gfsx0.i()) {
                ((eqib)gfsx0.d()).c(pendingIntent0);
                return;
            }
            gfsx gfsx1 = this.c;
            if(gfsx1.i()) {
                eqia eqia0 = (eqia)gfsx1.d();
                Parcel parcel0 = eqia0.jo();
                wbz.f(parcel0, pendingIntent0);
                eqia0.jp(4, parcel0);
            }
        }
        catch(RemoteException remoteException0) {
            epyl.a.l(remoteException0);
        }
    }
}

