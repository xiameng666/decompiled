import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flei implements glzm {
    public final flen a;
    public final AccountContext b;
    public final fmeo c;
    public final flqw d;

    public flei(flen flen0, AccountContext accountContext0, fmeo fmeo0, flqw flqw0) {
        this.a = flen0;
        this.b = accountContext0;
        this.c = fmeo0;
        this.d = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        UUID uUID0 = UUID.randomUUID();
        flyk flyk0 = new flyk(this.a.h.b, this.b, this.c.a);
        gmcd gmcd0 = this.a.h.a.d.d();
        return this.a.h.a.b(uUID0, flyk0, gmcd0, this.b, this.d, true);
    }
}

