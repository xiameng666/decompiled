import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.util.concurrent.TimeUnit;

public final class arjy implements Runnable {
    public final arkk a;
    public final Bundle b;
    public final arkj c;

    public arjy(arkk arkk0, Bundle bundle0, arkj arkj0) {
        this.a = arkk0;
        this.b = bundle0;
        this.c = arkj0;
    }

    @Override
    public final void run() {
        arkk arkk0 = this.a;
        aqql aqql0 = arkk0.a;
        aqql0.d("executing #findCompatiblePackages", new Object[0]);
        byte[] arr_b = this.b.getByteArray("p2pdevicetoken");
        ResultReceiver resultReceiver0 = (ResultReceiver)this.b.getParcelable("p2presultreceiver");
        arkj arkj0 = this.c;
        try {
            if(!arkk0.f()) {
                aqql0.f("PlayP2pRestoreService got disconnected", new Object[0]);
                arkc arkc0 = new arkc(arkj0);
                arkk0.b.execute(arkc0);
                return;
            }
            gful_cronetEngineProvider gful0 = arkk0.e;
            if(((Boolean)gful0.mr()).booleanValue()) {
                aqql0.d("findCompatiblePackages timeout enabled. Scheduling timeout task.", new Object[0]);
                arkk0.d();
                arkg arkg0 = new arkg(arkk0, arkk0.b, arkj0);
                long v = (long)(((Long)arkk0.f.mr()));
                gmcf gmcf0 = ((bbll)arkk0.c).g(arkg0, v, TimeUnit.MILLISECONDS);
                arkk0.d.set(gmcf0);
            }
            else {
                aqql0.d("findCompatiblePackages timeout disabled", new Object[0]);
            }
            sov sov0 = arkk0.g;
            Parcel parcel0 = sov0.jo();
            parcel0.writeByteArray(arr_b);
            wbz.f(parcel0, resultReceiver0);
            Parcel parcel1 = sov0.hM(2, parcel0);
            Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
            parcel1.recycle();
            if((!((Boolean)gful0.mr()).booleanValue() || arkk0.d()) && bundle0.getString("ERROR") != null) {
                aqql0.f("Error response from play service", new Object[0]);
                arkd arkd0 = new arkd(arkj0);
                arkk0.b.execute(arkd0);
            }
        }
        catch(RemoteException remoteException0) {
            arkk0.a.g("Exception thrown", remoteException0, new Object[0]);
            if(!((Boolean)arkk0.e.mr()).booleanValue()) {
                goto label_37;
            }
            if(arkk0.d()) {
            label_37:
                arke arke0 = new arke(arkj0);
                arkk0.b.execute(arke0);
            }
        }
    }
}

