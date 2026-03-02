import android.accounts.Account;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class eguj implements Callable {
    public final eguv a;
    public final Account b;

    public eguj(eguv eguv0, Account account0) {
        this.a = eguv0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        String s = hwyp.e();
        actb actb0 = new actb(this.a.f.a);
        Object object0 = this.b;
        if(!actb0.b(((Account)object0), new String[]{s}).isEmpty()) {
            return object0;
        }
        throw new IOException("Account not logged in");
    }
}

