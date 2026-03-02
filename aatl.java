import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class aatl {
    public static final baun a;
    public final zec b;
    public final aavk c;
    public final Executor d;

    static {
        aatl.a = new baun("AccountSettings", new String[]{"AccountSettingsRpcWrapper"});
    }

    public aatl(zec zec0, aavk aavk0, ExecutorService executorService0) {
        this.b = zec0;
        this.c = aavk0;
        this.d = executorService0;
    }

    public final gged_interceptors a(gged_interceptors gged0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            Account account0 = (Account)gged0.get(v);
            arrayList0.add(glzd.g(this.b(account0, 13001), new aati(this, account0), this.d));
        }
        try {
            ggdy ggdy0 = new ggdy();
            Iterator iterator0 = ((List)((glyq)gmbu.e(arrayList0)).u()).iterator();
            while(true) {
            label_9:
                if(!iterator0.hasNext()) {
                    return ggdy0.h();
                }
                Object object0 = iterator0.next();
                for(Object object1: ((List)object0)) {
                    gfsx gfsx0 = (gfsx)object1;
                    if(gfsx0.i()) {
                        ggdy0.i(((aath)gfsx0.d()));
                    }
                }
            }
        }
        catch(InterruptedException | ExecutionException | CancellationException exception0) {
            throw new clix("Failed to get account settings data via RPCs", exception0);
        }
        goto label_9;
    }

    public final gmcd b(Account account0, int v) {
        return gmbu.m(new aatj(this, account0, v), this.d);
    }
}

