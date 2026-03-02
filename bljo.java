import android.content.Context;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bljo extends cjtm {
    public static final bboh a;
    public final bnba b;
    public final bljz c;
    public final blps d;
    public final ajes e;
    public final bmde f;
    public final byte[] g;
    public final gfsx h;
    public final foeg i;
    private final String j;

    static {
        bljo.a = bnaa.d("GetKeyOperation");
    }

    public bljo(bmde bmde0, String s, byte[] arr_b, azug azug0) {
        super(0xD6, "GetKey", azug0);
        gftb.z(s, "rpId cannot be null");
        gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "rpId cannot be empty");
        gftb.z(arr_b, "keyHandle cannot be null");
        this.f = bmde0;
        this.j = s;
        this.g = arr_b;
        this.b = (bnba)bnba.e.b();
        this.c = new bljz(AppContextProvider.a());
        this.d = new blps(AppContextProvider.a());
        this.e = new ajes(AppContextProvider.a());
        this.h = (gfsx)blir.b.b();
        this.i = fofa.a();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0;
        byte[] arr_b = this.g;
        bbmu.c(arr_b);
        String s = this.j;
        if(s.equals("google.com")) {
            ajdu ajdu0 = new ajdu(this.e, arr_b);
            gmcd0 = fhra.b(this.e.iG(ajdu0));
        }
        else {
            gmcd0 = gmbu.i(Boolean.valueOf(false));
        }
        bljj bljj0 = new bljj(this, arr_b, s);
        gmap gmap0 = gmap.a;
        gmcd gmcd1 = glzd.g(gmcd0, bljj0, gmap0);
        if(this.h.i()) {
            gmcd1 = glzd.g(gmcd1, new bljk(this, s, arr_b), gmap0);
        }
        gmbu.t(gmcd1, new bljn(this), gmap0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.f.a(status0, null, ApiMetadata.b);
    }
}

