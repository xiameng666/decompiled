import android.accounts.Account;
import j..time.Duration;
import java.util.Iterator;

public final class ffmk implements gful_cronetEngineProvider {
    public final ffml a;

    public ffmk(ffml ffml0) {
        this.a = ffml0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Iterator iterator0 = bbmn.h(this.a.a, "com.google.android.gms").iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fppj fppj0 = new fppj(((Account)object0));
            return Duration.ofMillis(htdc.a.b().a(fppj0));
        }
        return Duration.ofMillis(htdc.a.b().a(fppj.a));
    }
}

