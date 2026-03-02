import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;

public final class ebyw implements dnqb {
    public Context a;
    public String b;
    public ebwn c;
    public ebst d;
    public static final int e;
    private static final bboh f;

    static {
        ebyw.f = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebqj(domv0).inject(this);
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebyw.f.j()).x("Active account not found!");
            return 2;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        String s = accountInfo0.a;
        ibuq.e(s, "getAccountId(...)");
        String s1 = this.b;
        ebst ebst0 = null;
        if(s1 == null) {
            ibuq.j("environment");
            s1 = null;
        }
        dycl dycl0 = new dycl(s, s1);
        Object object0 = dycl0.b().get();
        ibuq.e(object0, "get(...)");
        switch(((dymw)object0).b) {
            case 1: 
            case 2: {
                dymv dymv0 = dymv.b(((dymw)object0).e);
                if(dymv0 == null) {
                    dymv0 = dymv.f;
                }
                if(dymv0 == dymv.d && !ebss.d(this.c())) {
                    ((glyq)dycl0.c(dymv.c)).u();
                    ebwn ebwn0 = this.c;
                    if(ebwn0 == null) {
                        ibuq.j("notificationManager");
                        ebwn0 = null;
                    }
                    ibuq.e("You need to complete a step before you can add your transit card", "getString(...)");
                    ebwn0.c("You need to complete a step before you can add your transit card", "Tap to view details");
                    ebst ebst1 = this.d;
                    if(ebst1 == null) {
                        ibuq.j("emoneyOperationUtils");
                    }
                    else {
                        ebst0 = ebst1;
                    }
                    ibuq.e(accountInfo0.b, "getAccountName(...)");
                    ebst0.a(accountInfo0.b, 0x319FB);
                }
                return 0;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
    }

    public final Context c() {
        Context context0 = this.a;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("appContext");
        return null;
    }
}

