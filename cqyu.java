import android.os.Parcel;
import com.google.android.gms.mdocstore.PrepareMdocForProvisioningRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyu implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final byte[] c;

    public cqyu(craf craf0, ProvisioningId provisioningId0, byte[] arr_b) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        PrepareMdocForProvisioningRequest prepareMdocForProvisioningRequest0 = new PrepareMdocForProvisioningRequest();
        prepareMdocForProvisioningRequest0.a = this.a.b;
        prepareMdocForProvisioningRequest0.b = this.b;
        prepareMdocForProvisioningRequest0.c = this.c;
        cqzr cqzr0 = new cqzr(this.a, ((evqp)object1), this.b);
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, prepareMdocForProvisioningRequest0);
        wbz.h(parcel0, cqzr0);
        cqxv0.jq(3, parcel0);
    }
}

