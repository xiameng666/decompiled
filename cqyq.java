import android.os.Parcel;
import com.google.android.gms.mdocstore.GetEncryptedMdocRequest;
import com.google.android.gms.mdocstore.NamespaceEntriesRequest;
import com.google.android.gms.mdocstore.RelyingPartyEncryptionConfig;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.util.List;

public final class cqyq implements azys {
    public final craf a;
    public final ProvisioningId b;
    public final List c;
    public final byte[] d;
    public final byte[] e;
    public final String f;
    public final int g;

    public cqyq(craf craf0, ProvisioningId provisioningId0, List list0, byte[] arr_b, byte[] arr_b1, String s, int v) {
        this.a = craf0;
        this.b = provisioningId0;
        this.c = list0;
        this.d = arr_b;
        this.e = arr_b1;
        this.f = s;
        this.g = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetEncryptedMdocRequest getEncryptedMdocRequest0 = new GetEncryptedMdocRequest();
        getEncryptedMdocRequest0.a = this.a.b;
        getEncryptedMdocRequest0.b = this.b;
        getEncryptedMdocRequest0.c = (NamespaceEntriesRequest[])this.c.toArray(new NamespaceEntriesRequest[0]);
        RelyingPartyEncryptionConfig relyingPartyEncryptionConfig0 = new RelyingPartyEncryptionConfig();
        relyingPartyEncryptionConfig0.a = this.d;
        relyingPartyEncryptionConfig0.b = this.e;
        relyingPartyEncryptionConfig0.c = this.f;
        getEncryptedMdocRequest0.d = relyingPartyEncryptionConfig0;
        getEncryptedMdocRequest0.e = this.g;
        cqzo cqzo0 = new cqzo(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getEncryptedMdocRequest0);
        wbz.h(parcel0, cqzo0);
        cqxv0.jq(33, parcel0);
    }
}

