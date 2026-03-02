import android.os.Parcel;
import com.google.android.gms.mdocstore.NamespaceRequest;
import com.google.android.gms.mdocstore.SendMdocDataRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqzb implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final NamespaceRequest[] c;

    public cqzb(craf craf0, ProvisioningId provisioningId0, NamespaceRequest[] arr_namespaceRequest) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_namespaceRequest;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        SendMdocDataRequest sendMdocDataRequest0 = new SendMdocDataRequest();
        sendMdocDataRequest0.a = this.a.b;
        sendMdocDataRequest0.b = this.b;
        sendMdocDataRequest0.c = this.c;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, sendMdocDataRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(16, parcel0);
    }
}

