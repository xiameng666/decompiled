import android.os.Parcel;
import com.google.android.gms.mdocstore.UpdateMdocDataRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqzc implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final byte[] c;

    public cqzc(craf craf0, ProvisioningId provisioningId0, byte[] arr_b) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        UpdateMdocDataRequest updateMdocDataRequest0 = new UpdateMdocDataRequest();
        updateMdocDataRequest0.a = this.a.b;
        updateMdocDataRequest0.b = this.b;
        updateMdocDataRequest0.c = this.c;
        crad crad0 = new crad(((evqp)object1), new cqyz());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, updateMdocDataRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(8, parcel0);
    }
}

