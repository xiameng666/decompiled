import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.concurrent.ExecutionException;

public final class blll extends blhy {
    protected static final Status c;
    protected final String d;
    final blny e;
    private boolean f;

    static {
        blll.c = new Status(34024, "RpId validation is failed.");
    }

    public blll(String s, String s1, bmga bmga0, blny blny0, azug azug0) {
        super(bmga0, s1, 180, "ListCredentials", azug0);
        this.f = false;
        this.d = s;
        this.e = blny0;
        this.f = hsue.c();
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmcd gmcd0;
        String s = this.d;
        if(s.equals("com.google.android.gms")) {
            gmcd0 = gmbu.i(Boolean.valueOf(true));
        }
        else {
            bmio bmio0 = new bmio();
            bmio0.c(this.a);
            bmio0.b(new byte[1]);
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = bmio0.a();
            if(this.f) {
                gmcd0 = this.e.b(publicKeyCredentialRequestOptions0, s);
            }
            else {
                bllk bllk0 = new bllk(this, publicKeyCredentialRequestOptions0);
                gmcd0 = blyn.a.e(bllk0);
            }
        }
        try {
            if(((Boolean)gmcd0.get()).booleanValue()) {
                gfsx gfsx0 = this.b();
                if(gfsx0.i()) {
                    this.b.a(ggia.b(ggch.j(((Iterable)gfsx0.d())).i(new bllj())), cckf.d(bbdp.bv));
                    return;
                }
                this.b.b(Status.d, ApiMetadata.b);
                return;
            }
            this.b.b(blll.c, ApiMetadata.b);
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            this.b.b(Status.d, ApiMetadata.b);
        }
    }
}

