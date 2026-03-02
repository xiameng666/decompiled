import android.os.Parcel;
import com.google.android.gms.mdocstore.StoreMdocMetadataRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqzk implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final byte[] c;

    public cqzk(craf craf0, ProvisioningId provisioningId0, byte[] arr_b) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        StoreMdocMetadataRequest storeMdocMetadataRequest0 = new StoreMdocMetadataRequest();
        storeMdocMetadataRequest0.a = this.a.b;
        storeMdocMetadataRequest0.b = this.b;
        storeMdocMetadataRequest0.c = this.c;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, storeMdocMetadataRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(10, parcel0);
    }
}

