import android.os.Parcel;
import com.google.android.gms.mdocstore.GetAuthKeysNeedingCertificationRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyw implements azys {
    public final craf a;
    public final ProvisioningId b;

    public cqyw(craf craf0, ProvisioningId provisioningId0) {
        this.a = craf0;
        this.b = provisioningId0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetAuthKeysNeedingCertificationRequest getAuthKeysNeedingCertificationRequest0 = new GetAuthKeysNeedingCertificationRequest();
        getAuthKeysNeedingCertificationRequest0.a = this.a.b;
        getAuthKeysNeedingCertificationRequest0.b = this.b;
        cqzs cqzs0 = new cqzs(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getAuthKeysNeedingCertificationRequest0);
        wbz.h(parcel0, cqzs0);
        cqxv0.jq(6, parcel0);
    }
}

