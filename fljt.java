import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class fljt implements Callable {
    public final fljw a;
    public final gmcd b;
    public final int c;
    public final AccountContext d;
    public final gmcd e;

    public fljt(fljw fljw0, gmcd gmcd0, int v, AccountContext accountContext0, gmcd gmcd1) {
        this.a = fljw0;
        this.b = gmcd0;
        this.c = v;
        this.d = accountContext0;
        this.e = gmcd1;
    }

    @Override
    public final Object call() {
        fljw fljw0;
        int v;
        AccountContext accountContext0;
        try {
            accountContext0 = this.d;
            v = this.c;
            fljw0 = this.a;
            gmbu.r(this.b);
        }
        catch(ExecutionException executionException0) {
            flbj.g("TyRegController", "Failed to register refresh", executionException0);
            fmai fmai0 = fmaj.a();
            fmai0.g(14);
            fmai0.f(v);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            fmaj fmaj0 = fmai0.a();
            fljw0.a.b(fmaj0);
            flks flks0 = flkt.a();
            flks0.d = 3;
            return flks0.a();
        }
        try {
            gmbu.r(this.e);
            return (flkt)gmbu.r(this.b);
        }
        catch(ExecutionException executionException1) {
            flbj.g("TyRegController", "Failed to store registration into registration store", executionException1);
            fmai fmai1 = fmaj.a();
            fmai1.g(14);
            fmai1.f(v);
            fmai1.n(accountContext0.c().f());
            fmai1.o(accountContext0.d().toStringUtf8());
            fmaj fmaj1 = fmai1.a();
            fljw0.a.b(fmaj1);
            flks flks1 = flkt.a();
            flks1.d = 3;
            return flks1.a();
        }
    }
}

