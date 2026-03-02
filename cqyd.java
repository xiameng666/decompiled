import android.os.Parcel;
import com.google.android.gms.mdocstore.DeleteMdocRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyd implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final byte[] c;

    public cqyd(craf craf0, ProvisioningId provisioningId0, byte[] arr_b) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        DeleteMdocRequest deleteMdocRequest0 = new DeleteMdocRequest();
        deleteMdocRequest0.a = this.a.b;
        deleteMdocRequest0.b = this.b;
        deleteMdocRequest0.c = this.c;
        crad crad0 = new crad(((evqp)object1), new cqzi());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, deleteMdocRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(12, parcel0);
    }
}

