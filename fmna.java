import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class fmna implements fmmw {
    public static final gmcg a;
    static final Set b;
    public static final HashMap c;
    public final fmid d;
    public final AccountContext e;
    public final fmnc f;

    static {
        fmna.a = flbh.b().a;
        fmna.b = new HashSet();
        fmna.c = new HashMap();
    }

    public fmna(fmnc fmnc0, fmid fmid0, AccountContext accountContext0) {
        this.f = fmnc0;
        this.d = fmid0;
        this.e = accountContext0;
    }

    public final void a(gmcd gmcd0) {
        gmbu.t(gmcd0, new fmmz(this), fmna.a);
    }
}

