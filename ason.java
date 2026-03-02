import android.accounts.Account;
import android.os.Build.VERSION;
import java.util.concurrent.Callable;

public final class ason implements Callable {
    public final asop a;

    public ason(asop asop0) {
        this.a = asop0;
    }

    @Override
    public final Object call() {
        if(((long)Build.VERSION.SDK_INT) >= hqii.d()) {
            Account account0 = this.a.b;
            return (account0 == null ? this.a.a.e() : this.a.a.d(account0)) ? ccni.c : ccni.d;
        }
        return ccni.e;
    }
}

