import android.os.Parcel;
import com.google.android.gms.mdocstore.GetMdocInfoRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyn implements azys {
    public final craf a;
    public final ProvisioningId b;

    public cqyn(craf craf0, ProvisioningId provisioningId0) {
        this.a = craf0;
        this.b = provisioningId0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetMdocInfoRequest getMdocInfoRequest0 = new GetMdocInfoRequest();
        getMdocInfoRequest0.a = this.a.b;
        getMdocInfoRequest0.b = this.b;
        crad crad0 = new crad(((evqp)object1), new cqys());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getMdocInfoRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(9, parcel0);
    }
}

