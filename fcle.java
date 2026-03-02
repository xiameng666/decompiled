import com.google.android.gms.wearable.internal.GetCachedBackupsResponse;
import com.google.android.gms.wearable.internal.ParcelableBackupDevice;
import java.util.ArrayList;

public final class fcle implements evqf {
    public final fcln a;

    public fcle(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fcln fcln0 = this.a;
        if(!((GetCachedBackupsResponse)object0).b) {
            fcln.a.h("fetchCachedBackups has no cache", new Object[0]);
            fcln0.b(fclm.a);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        ParcelableBackupDevice[] arr_parcelableBackupDevice = ((GetCachedBackupsResponse)object0).c;
        for(int v = 0; v < arr_parcelableBackupDevice.length; ++v) {
            ParcelableBackupDevice parcelableBackupDevice0 = arr_parcelableBackupDevice[v];
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfl.a), parcelableBackupDevice0.a, 0, parcelableBackupDevice0.a.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                arrayList0.add(((aqfl)hftv0));
            }
            catch(hfur hfur0) {
                fcln.a.n("Failed to parse device", hfur0, new Object[0]);
            }
        }
        fcln0.f(arrayList0);
    }
}

