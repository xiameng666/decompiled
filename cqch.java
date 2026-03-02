import android.accounts.Account;
import dagger.Component;
import dagger.internal.Preconditions;
import java.util.Map;

@Component(modules = {cqcj.class, cqcl.class, cqcn.class, cqcr.class, cqct.class, bapv.class, cqex.class, cqcw.class, cqap.class, cqdn.class, cqgf.class, cqhj.class})
@ibnh
public abstract class cqch {
    private static final Object a;
    private static volatile cqch b;

    static {
        cqch.a = new Object();
    }

    public abstract cqby a();

    public abstract fiyj b();

    public static cqch c() {
        if(cqch.b == null) {
            Object object0 = cqch.a;
            synchronized(object0) {
                if(cqch.b == null) {
                    cqch.b = new cqcf();
                }
            }
            return cqch.b;
        }
        return cqch.b;
    }

    public final cqcb d(Account account0) {
        cqcb cqcb0;
        cqby cqby0 = this.a();
        synchronized(cqby0.a) {
            Map map0 = cqby0.c;
            if(!map0.containsKey(account0)) {
                cqca cqca0 = ((cqce)cqby0.b).a();
                Preconditions.b(account0);
                cqca0.b = account0;
                Preconditions.a(cqca0.b, Account.class);
                map0.put(account0, new cqcb(cqca0.a, cqca0.b));
            }
            cqcb0 = (cqcb)map0.get(account0);
            gftb.check(cqcb0);
        }
        return cqcb0;
    }
}

