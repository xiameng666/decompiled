import android.accounts.Account;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class cqfn {
    public static final ggtl a;
    public final Map b;
    public final gfsi c;
    public final gful_cronetEngineProvider d;
    private final Executor e;
    private final cqel f;
    private final cmbm g;

    static {
        cqfn.a = cqek.b();
    }

    public cqfn(Map map0, gfsi gfsi0, cmbm cmbm0, Executor executor0, gful_cronetEngineProvider gful0, cqel cqel0) {
        this.b = map0;
        this.c = gfsi0;
        this.g = cmbm0;
        this.e = executor0;
        this.d = gful0;
        this.f = cqel0;
    }

    public static int a(int v, int v1) {
        if(v == 0 && v1 == 0) {
            return 0;
        }
        return v == 2 || v1 == 2 ? 2 : 1;
    }

    public final int b(cqgz cqgz0, cqgt cqgt0, Account account0) {
        cqgx cqgx0;
        try {
            cqgx0 = cqgz0.a;
            gmcd gmcd0 = (account0 == null ? this.g.l(cqgx0) : this.g.m(cqgx0, account0)).c(new cqfm(cqgt0, cqgz0), (cqgz0.b == cqgy.a ? 3 : 2), this.e);
            try {
                ((glyq)gmcd0).u();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                gftb.z(throwable0, "Failed task must have a cause!");
                gfut.d(throwable0, InterruptedException.class);
                gfut.d(throwable0, cqgv.class);
                gfut.d(throwable0, cqgu.class);
                gfut.d(throwable0, fktt.class);
                gfut.d(throwable0, fktq.class);
                gfut.e(throwable0);
                throw new IllegalStateException("Task failed with an unknown checked exception!", throwable0);
            }
            this.f.b(2, cqgx0);
            return 0;
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            this.f.b(6, cqgx0);
            return 1;
        }
        catch(fktt unused_ex) {
            this.f.b(11, cqgx0);
            cqek.b().j().ar(7101).B("Task \'%s\' failed with disabled!", cqgz0);
            return 2;
        }
        catch(fktq unused_ex) {
            this.f.b(10, cqgx0);
            cqek.b().j().ar(7102).B("Task \'%s\' failed with sync constraints not met!", cqgz0);
            return 1;
        }
        catch(cqgv cqgv0) {
            this.f.b(9, cqgx0);
            cqek.a().j().p(((int)hvem.c())).s(cqgv0).ar(7103).B("Task \'%s\' failed with a recoverable error!", cqgz0);
            return 1;
        }
        catch(cqgu cqgu0) {
            this.f.b(5, cqgx0);
            cqek.a().j().p(((int)hvem.c())).s(cqgu0).ar(7104).B("Task \'%s\' failed with an internal error!", cqgz0);
            return 2;
        }
        catch(RuntimeException runtimeException0) {
            this.f.b(12, cqgx0);
            cqek.a().j().p(((int)hvem.b())).s(runtimeException0).ar(7105).B("Task \'%s\' failed with an unexpected error!", cqgz0);
            return 2;
        }
    }
}

