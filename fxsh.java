import android.accounts.Account;
import android.content.Context;
import java.util.Random;

public final class fxsh {
    public final Context a;
    public final fxtr b;
    public final fxso c;
    public final fxtt d;
    public final fxqn e;
    public final fxts f;
    public final Random g;
    public final bbng h;

    public fxsh(Context context0, fxtr fxtr0, fxtt fxtt0, fxso fxso0, fxqn fxqn0, fxts fxts0, Random random0, bbng bbng0) {
        this.a = context0;
        this.b = fxtr0;
        this.f = fxts0;
        this.c = fxso0;
        this.d = fxtt0;
        this.e = fxqn0;
        this.g = random0;
        this.h = bbng0;
    }

    public static final void a(Account account0, Exception exception0) {
        fxqw.c("GCoreUlr", "Batch Location Update failed for account " + cnug.a(account0) + ": " + exception0.toString());
    }
}

