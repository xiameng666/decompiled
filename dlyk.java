import android.accounts.Account;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlyk implements dmba {
    private static final bboh a;
    private final Account b;
    private final dxzw c;

    static {
        dlyk.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyk(Account account0, dxzw dxzw0) {
        this.b = account0;
        this.c = dxzw0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 17, "Cannot evaluate filter that is not GP2 migration status filter");
        frli frli0 = this.c.a(this.b);
        try {
            boolean z = ((dpzc)frli0.a().get(10L, TimeUnit.SECONDS)).d;
            return hjwe0.b == 17 ? z == ((hjtp)hjwe0.c).b : z == hjtp.a.b;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            a.ae(dlyk.a.i(), "Failed to get the GP2 migration status, assuming false", exception0);
            return false;
        }
    }
}

