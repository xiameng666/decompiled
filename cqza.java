import android.os.Parcel;
import com.google.android.gms.mdocstore.DeleteMdocOperatingStatusRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqza implements azys {
    public final craf a;
    public final ProvisioningId b;

    public cqza(craf craf0, ProvisioningId provisioningId0) {
        this.a = craf0;
        this.b = provisioningId0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        DeleteMdocOperatingStatusRequest deleteMdocOperatingStatusRequest0 = new DeleteMdocOperatingStatusRequest();
        deleteMdocOperatingStatusRequest0.a = this.a.b;
        deleteMdocOperatingStatusRequest0.b = this.b.a;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, deleteMdocOperatingStatusRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(30, parcel0);
    }
}

