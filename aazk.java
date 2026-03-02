import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

final class aazk extends clil {
    private final Context a;
    private final aazh b;

    public aazk(Context context0, aazh aazh0) {
        super("ads");
        this.a = context0;
        this.b = aazh0;
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        boolean z;
        fzdn fzdn0;
        if(iBinder0 == null) {
            fzdn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
            fzdn0 = (iInterface0 instanceof fzdn) ? ((fzdn)iInterface0) : new fzdn(iBinder0);
        }
        try {
            z = false;
            Parcel parcel0 = fzdn0.hM(1, fzdn0.jo());
            boolean z1 = wbz.i(parcel0);
            parcel0.recycle();
            z = z1;
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)aazl.b.j()).ar(445)).x("Error calling school-ownership service; assume it\'s not school-owned.");
            Log.w(aazl.a, remoteException0);
        }
        finally {
            bbic.a().b(this.a, this);
        }
        this.b.a(z);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

