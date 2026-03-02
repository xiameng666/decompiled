import android.accounts.Account;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.Callable;

public final class alkf implements Callable {
    final alkl a;

    public alkf(alkl alkl0) {
        Objects.requireNonNull(alkl0);
        this.a = alkl0;
        super();
    }

    @Override
    public final Object call() {
        alkl alkl0 = this.a;
        List list0 = bbmn.h(alkl0.d, "com.google.android.gms");
        Object object0 = null;
        if(!list0.isEmpty()) {
            for(Object object1: list0) {
                Account account0 = (Account)object1;
                if(object0 == null && alkl0.e.d(account0, gqus.b)) {
                    object0 = account0;
                }
            }
        }
        return object0;
    }
}

