import com.google.android.gms.mdocstore.GetEncryptedMdocRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqyk implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final gtwm c;

    public cqyk(craf craf0, ProvisioningId provisioningId0, gtwm gtwm0) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = gtwm0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetEncryptedMdocRequest getEncryptedMdocRequest0 = new GetEncryptedMdocRequest();
        getEncryptedMdocRequest0.a = this.a.b;
        getEncryptedMdocRequest0.b = this.b;
        getEncryptedMdocRequest0.f = this.c.toBytesArray();
        cqxv0.a(getEncryptedMdocRequest0, new cqzn(this.a, ((evqp)object1)));
    }
}

