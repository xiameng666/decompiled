import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ekeq implements ekep {
    public static final bboh a;
    private final Context b;
    private final azts c;

    static {
        ekeq.a = bboh.b("DCU_DeviceUsageSettings", bbcu.bN);
    }

    public ekeq(Context context0) {
        this.b = context0;
        this.c = new azts(context0, null);
    }

    @Override  // ekep
    public final List a() {
        Account[] arr_account = cchj.b(this.b).p("com.google");
        if(arr_account != null && arr_account.length != 0) {
            fpgc fpgc0 = this.c();
            List list0 = Arrays.asList(arr_account);
            ggek ggek0 = new ggek();
            for(Object object0: list0) {
                ggek0.i(((Account)object0), fpgc0.a(((Account)object0)).i(11));
            }
            ggeo ggeo0 = ggek0.b();
            return (List)((glyq)gdtf.a(ggeo0.g()).a(new fpfo(ggeo0), gmap.a)).u();
        }
        return new ArrayList();
    }

    public final gfsx b() {
        azzc azzc0 = new azzc();
        azzc0.a = new cowd();
        azzd azzd0 = azzc0.a();
        evql evql0 = this.c.iG(azzd0);
        try {
            return gfsx.m(((azui)evrg.o(evql0, 500L, TimeUnit.MILLISECONDS)));
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            ((ggtj)ekeq.a.j()).x("Failed to get Lockbox signed-in status");
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            return gfqx.a;
        }
    }

    public final fpgc c() {
        return eker.a(this.b);
    }
}

