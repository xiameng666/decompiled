import android.os.Parcel;
import com.google.android.gms.backup.ParcelableDevice;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class asar extends wby implements asas {
    final evqp a;

    public asar() {
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
    }

    public asar(aqgg aqgg0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aqgg0);
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
    }

    @Override  // asas
    public final void a(List list0, ApiMetadata apiMetadata0) {
        this.a.b(list0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(ParcelableDevice.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            asar.gr(parcel0);
            this.a(arrayList0, apiMetadata0);
            return true;
        }
        return false;
    }
}

