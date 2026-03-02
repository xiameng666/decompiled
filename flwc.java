import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flwc implements glzm {
    public final flwi a;
    public final AccountContext b;
    public final fmga c;
    public final hnry d;
    public final flqw e;

    public flwc(flwi flwi0, AccountContext accountContext0, fmga fmga0, hnry hnry0, flqw flqw0) {
        this.a = flwi0;
        this.b = accountContext0;
        this.c = fmga0;
        this.d = hnry0;
        this.e = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        UUID uUID0 = UUID.randomUUID();
        flzj flzj0 = new flzj(this.a.b, this.b, this.c, this.d, this.a.f);
        gmcd gmcd0 = this.a.a.d.d();
        return this.a.a.b(uUID0, flzj0, gmcd0, this.b, this.e, true);
    }
}

