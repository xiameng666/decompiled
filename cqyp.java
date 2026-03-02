import android.os.Parcel;
import com.google.android.gms.mdocstore.GetEncryptionKeyRequest;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;

public final class cqyp implements azys {
    public final craf a;
    public final CryptoSchemeId b;

    public cqyp(craf craf0, CryptoSchemeId cryptoSchemeId0) {
        this.a = craf0;
        this.b = cryptoSchemeId0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetEncryptionKeyRequest getEncryptionKeyRequest0 = new GetEncryptionKeyRequest();
        getEncryptionKeyRequest0.a = this.a.b;
        getEncryptionKeyRequest0.b = this.b;
        cqzy cqzy0 = new cqzy(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getEncryptionKeyRequest0);
        wbz.h(parcel0, cqzy0);
        cqxv0.jq(23, parcel0);
    }
}

