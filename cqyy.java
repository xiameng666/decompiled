import android.os.Parcel;
import com.google.android.gms.mdocstore.CreateMdocOperatingStatusRequest;
import com.google.android.gms.mdocstore.OperatingStatus;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyy implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final OperatingStatus c;

    public cqyy(craf craf0, ProvisioningId provisioningId0, OperatingStatus operatingStatus0) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = operatingStatus0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        CreateMdocOperatingStatusRequest createMdocOperatingStatusRequest0 = new CreateMdocOperatingStatusRequest();
        createMdocOperatingStatusRequest0.a = this.a.b;
        createMdocOperatingStatusRequest0.b = this.b.a;
        createMdocOperatingStatusRequest0.c = this.c.a;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, createMdocOperatingStatusRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(28, parcel0);
    }
}

