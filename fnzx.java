import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class fnzx {
    public final foag a;
    public final fnjd b;
    public final fngf c;
    public final fobh d;
    public final fodo e;
    public final fnxq f;
    private final ExecutorService g;
    private final ficq h;
    private final gfsx i;

    public fnzx() {
        throw null;
    }

    public fnzx(foag foag0, fnjd fnjd0, ExecutorService executorService0, fngf fngf0, fobh fobh0, ficq ficq0, fodo fodo0, fnxq fnxq0, gfsx gfsx0) {
        this.a = foag0;
        this.b = fnjd0;
        this.g = executorService0;
        this.c = fngf0;
        this.d = fobh0;
        this.h = ficq0;
        this.e = fodo0;
        this.f = fnxq0;
        this.i = gfsx0;
    }

    public static fnzw a(Context context0) {
        fnzw fnzw0 = new fnzw(null);
        fnzw0.b = new fnzv();
        fnzw0.a = context0.getApplicationContext();
        return fnzw0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fnzx) && this.a.equals(((fnzx)object0).a) && this.b.equals(((fnzx)object0).b) && this.g.equals(((fnzx)object0).g) && this.c.equals(((fnzx)object0).c) && this.d.equals(((fnzx)object0).d) && this.h.equals(((fnzx)object0).h) && this.e.equals(((fnzx)object0).e) && this.f.equals(((fnzx)object0).f) && this.i.equals(((fnzx)object0).i);
    }

    @Override
    public final int hashCode() {
        return (this.f.hashCode() ^ (((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003) * 1000003 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "ExpressSignInManager{limitedAvailableAccountsModel=" + this.a + ", internalAccountsModel=" + this.b + ", backgroundExecutor=" + this.g + ", avatarImageLoader=" + this.c + ", oneGoogleEventLogger=" + this.d + ", vePrimitives=" + this.h + ", visualElements=" + this.e + ", accountLayer=" + this.f + ", appIdentifier=" + this.i + "}";
    }
}

