import android.accounts.Account;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class cqax implements Callable {
    public final cqbd a;
    public final String b;

    public cqax(cqbd cqbd0, String s) {
        this.a = cqbd0;
        this.b = s;
    }

    @Override
    public final Object call() {
        cqbs cqbs0 = this.a.d;
        Iterator iterator0 = ((List)cqbs0.a.mr()).iterator();
        while(true) {
            Object object0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            Account account0 = (Account)object1;
            cqbt cqbt0 = cqbs0.b;
            try {
                object0 = acso.e(cqbt0.a, account0.name);
            }
            catch(acse | IOException exception0) {
                cqbt0.b.d().s(exception0).ar(7088).x("Failed to convert account to obfuscated Gaia id!");
            }
            catch(RuntimeException runtimeException0) {
                cqbt0.b.c().s(runtimeException0).ar(7089).x("Failed to convert account to obfuscated Gaia id!");
            }
            if(this.b.equals(object0)) {
                return account0;
            }
        }
        return null;
    }
}

