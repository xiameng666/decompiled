import android.os.Parcel;
import com.google.android.gms.mdocstore.MakeCryptoSchemeRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqzj implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final byte[] c;

    public cqzj(craf craf0, ProvisioningId provisioningId0, byte[] arr_b) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        MakeCryptoSchemeRequest makeCryptoSchemeRequest0 = new MakeCryptoSchemeRequest();
        makeCryptoSchemeRequest0.a = this.a.b;
        makeCryptoSchemeRequest0.b = this.b;
        makeCryptoSchemeRequest0.c = this.c;
        cqzx cqzx0 = new cqzx(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, makeCryptoSchemeRequest0);
        wbz.h(parcel0, cqzx0);
        cqxv0.jq(22, parcel0);
    }
}

