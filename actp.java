import android.net.Network;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.List;

public final class actp {
    public GoogleAccount a;
    public String b;
    public List c;
    public List d;
    public List e;
    public List f;
    public String g;
    public String h;
    public Network i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private byte n;

    public final GetTokenRequest a() {
        GoogleAccount googleAccount0 = this.a;
        if(googleAccount0 == null && this.b == null) {
            throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
        }
        if(googleAccount0 != null && this.b != null) {
            throw new IllegalArgumentException("Both setObfuscatedGaiaId and setAccount cannot be called.");
        }
        List list0 = this.c;
        if(list0 == null && this.d == null && this.e == null && this.f == null) {
            throw new IllegalArgumentException("A token type must be specified.");
        }
        int v = list0 == null ? 0 : 1;
        if(this.d != null) {
            ++v;
        }
        if(this.e != null) {
            ++v;
        }
        if(this.f != null) {
            ++v;
        }
        if(v == 0) {
            throw new IllegalArgumentException("No auth token type specified. Please specify exactly one type of auth token.");
        }
        if(v > 1) {
            throw new IllegalArgumentException("GetTokenRequest supports only one token type per request. Please call only one of setOauth2Scopes(), setWebLoginUrls(), setClientLoginScopes(), setOauth2TokenIdScopes()");
        }
        if(this.g != null && this.b() == 0) {
            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if(this.b() == 1 && this.g == null) {
            throw new IllegalArgumentException("Please provide a delegatee user ID.");
        }
        if(this.n != 15) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((1 & this.n) == 0) {
                stringBuilder0.append(" delegationType");
            }
            if((this.n & 2) == 0) {
                stringBuilder0.append(" handleNotification");
            }
            if((this.n & 4) == 0) {
                stringBuilder0.append(" suppressProgressScreen");
            }
            if((this.n & 8) == 0) {
                stringBuilder0.append(" useNewExceptions");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new GetTokenRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.j, this.g, this.k, null, this.h, this.l, this.i, this.m);
    }

    public final int b() {
        if((this.n & 1) != 0) {
            return this.j;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void c(int v) {
        this.j = v;
        this.n = (byte)(this.n | 1);
    }

    public final void d(boolean z) {
        this.k = z;
        this.n = (byte)(this.n | 2);
    }

    public final void e(boolean z) {
        this.l = z;
        this.n = (byte)(this.n | 4);
    }

    public final void f(boolean z) {
        this.m = z;
        this.n = (byte)(this.n | 8);
    }
}

