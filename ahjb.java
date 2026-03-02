import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;

public final class ahjb implements aerh {
    public final String a;
    public final Credential b;
    private final String c;
    private final bxod d;

    public ahjb(String s, Credential credential0, String s1, bxod bxod0) {
        this.a = s;
        this.b = credential0;
        this.c = s1;
        this.d = bxod0;
    }

    @Override  // aerh
    public final bxnj b() {
        return bxnj.aD;
    }

    @Override  // aerh
    public final gmcd c(aerq aerq0) {
        Credential credential0 = this.b;
        String s = credential0.e;
        if(s == null) {
            throw bxma.e(0x6F19);
        }
        SavePasswordRequest savePasswordRequest0 = new SavePasswordRequest(new SignInPassword(credential0.a, s), this.c, 0);
        bxrz bxrz0 = (bxrz)aesd.a.mr();
        String s1 = axzh.b(this.a);
        bxsy bxsy0 = bxrz0.Q(savePasswordRequest0, this.a, this.c, this.d, s1).c();
        bxsy bxsy1 = ((agmz)agna.a.mr()).ar(this.a).c().m(new ahiy(this)).k(new ahiz(this));
        return gmbu.d(new gmcd[]{bxsy0, bxsy1}).a(new ahja(bxsy1, bxsy0), gmap.a);
    }
}

