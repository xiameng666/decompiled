import android.os.Parcel;
import com.google.android.gms.mdocstore.GetMdocDataRequest;
import com.google.android.gms.mdocstore.NamespaceEntriesRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.util.List;

public final class cqzd implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final List c;

    public cqzd(craf craf0, ProvisioningId provisioningId0, List list0) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetMdocDataRequest getMdocDataRequest0 = new GetMdocDataRequest();
        getMdocDataRequest0.a = this.a.b;
        getMdocDataRequest0.b = this.b;
        getMdocDataRequest0.d = (NamespaceEntriesRequest[])this.c.toArray(new NamespaceEntriesRequest[0]);
        crad crad0 = new crad(((evqp)object1), new cqyf());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getMdocDataRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(13, parcel0);
    }
}

