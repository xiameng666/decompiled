import android.accounts.Account;
import java.util.List;
import java.util.concurrent.Callable;

public final class alkc implements Callable {
    public final alkl a;
    public final Account b;

    public alkc(alkl alkl0, Account account0) {
        this.a = alkl0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        Object object0 = Boolean.valueOf(false);
        if(this.b == null) {
            return object0;
        }
        List list0 = alft.b(this.a.d, false, null);
        return list0 == null ? object0 : Boolean.valueOf(gggq.v(list0, new alju()));
    }
}

