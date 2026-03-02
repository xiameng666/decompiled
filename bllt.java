import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bllt extends cjtm {
    public static final bboh a;
    public final bmfy b;
    private final String c;
    private final String d;
    private final byte[] e;
    private final blpe f;

    static {
        bllt.a = bnaa.d("NativeAppIsUserVerifyingPlatformAuthenticatorAvailableForCredentialOperation");
    }

    public bllt(bmfy bmfy0, String s, String s1, byte[] arr_b, azug azug0) {
        super(0x94, "NativeAppIsUserVerifyingPlatformAuthenticatorAvailableForCredential", azug0);
        this.b = bmfy0;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        this.f = (blpe)blpe.b.b();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!"com.google.android.gms".equals(this.c)) {
            Status status0 = new Status(10);
            this.b.c(status0, ApiMetadata.b);
            return;
        }
        if(!hpkt.a.c().h()) {
            gmbu.t(this.f.d(this.d, this.e), new bllr(this), gmap.a);
            return;
        }
        ahmb ahmb0 = ahlz.a(context0);
        ByteString hfsf0 = ByteString.copyFrom(this.e);
        String s = bxol.a();
        gmbu.t(fhra.b(ahmb0.b(this.d, hfsf0, 14, s)), new blls(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.c(status0, ApiMetadata.b);
    }
}

