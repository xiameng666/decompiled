import android.os.Parcel;
import com.google.android.gms.mdocstore.StoreStaticAuthDataRequest;
import com.google.android.gms.mdocstore.types.AuthenticationData;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.util.List;

public final class cqyh implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final List c;

    public cqyh(craf craf0, ProvisioningId provisioningId0, List list0) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        StoreStaticAuthDataRequest storeStaticAuthDataRequest0 = new StoreStaticAuthDataRequest();
        storeStaticAuthDataRequest0.a = this.a.b;
        storeStaticAuthDataRequest0.b = this.b;
        storeStaticAuthDataRequest0.c = (AuthenticationData[])this.c.toArray(new AuthenticationData[0]);
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, storeStaticAuthDataRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(7, parcel0);
    }
}

