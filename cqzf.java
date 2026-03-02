import android.os.Parcel;
import com.google.android.gms.mdocstore.DecryptDataRequest;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.EncryptedData;
import java.util.List;

public final class cqzf implements azys {
    public final craf a;
    public final CryptoSchemeId b;
    public final List c;

    public cqzf(craf craf0, CryptoSchemeId cryptoSchemeId0, List list0) {
        this.a = craf0;
        this.b = cryptoSchemeId0;
        this.c = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        DecryptDataRequest decryptDataRequest0 = new DecryptDataRequest();
        decryptDataRequest0.a = this.a.b;
        decryptDataRequest0.b = this.b;
        decryptDataRequest0.c = (EncryptedData[])this.c.toArray(new EncryptedData[0]);
        decryptDataRequest0.d = true;
        craa craa0 = new craa(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, decryptDataRequest0);
        wbz.h(parcel0, craa0);
        cqxv0.jq(25, parcel0);
    }
}

