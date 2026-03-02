import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class fldi implements glzm {
    public final fldt a;
    public final AccountContext b;
    public final String c;
    public final int d;
    public final flqw e;

    public fldi(fldt fldt0, AccountContext accountContext0, String s, int v, flqw flqw0) {
        this.a = fldt0;
        this.b = accountContext0;
        this.c = s;
        this.d = v;
        this.e = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        UUID uUID0 = UUID.randomUUID();
        flyi flyi0 = new flyi(this.b, this.d, this.c);
        gmcd gmcd0 = this.a.e.a.d.b();
        return this.a.e.a.b(uUID0, flyi0, gmcd0, this.b, this.e, true);
    }
}

