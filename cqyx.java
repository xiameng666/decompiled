import android.os.Parcel;
import com.google.android.gms.mdocstore.GetAvailableMsoCountRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyx implements azys {
    public final craf a;
    public final ProvisioningId b;

    public cqyx(craf craf0, ProvisioningId provisioningId0) {
        this.a = craf0;
        this.b = provisioningId0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetAvailableMsoCountRequest getAvailableMsoCountRequest0 = new GetAvailableMsoCountRequest();
        getAvailableMsoCountRequest0.a = this.a.b;
        getAvailableMsoCountRequest0.b = this.b;
        crad crad0 = new crad(((evqp)object1), new cqyb());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getAvailableMsoCountRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(21, parcel0);
    }
}

