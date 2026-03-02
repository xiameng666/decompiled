import android.os.Parcel;
import com.google.android.gms.mdocstore.EncryptDataRequest;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.UnencryptedData;
import java.util.List;

public final class cqyc implements azys {
    public final craf a;
    public final CryptoSchemeId b;
    public final List c;
    public final boolean d;

    public cqyc(craf craf0, CryptoSchemeId cryptoSchemeId0, List list0, boolean z) {
        this.a = craf0;
        this.b = cryptoSchemeId0;
        this.c = list0;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        EncryptDataRequest encryptDataRequest0 = new EncryptDataRequest();
        encryptDataRequest0.a = this.a.b;
        encryptDataRequest0.b = this.b;
        encryptDataRequest0.c = (UnencryptedData[])this.c.toArray(new UnencryptedData[0]);
        encryptDataRequest0.d = this.d;
        cqzz cqzz0 = new cqzz(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, encryptDataRequest0);
        wbz.h(parcel0, cqzz0);
        cqxv0.jq(24, parcel0);
    }
}

