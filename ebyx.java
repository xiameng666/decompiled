import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;

public final class ebyx implements dnqb {
    public static final bboh a;
    public Context b;
    public String c;
    public ebwn d;
    public ebst e;

    static {
        ebyx.a = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        ebst ebst1;
        if(hwsd.N()) {
            ((ggtj)ebyx.a.h()).x("ProvisionTimeout: onRunTask called!");
        }
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebql(domv0).inject(this);
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebyx.a.j()).x("ProvisionTimeout: Active account not found!");
            return 2;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        String s = accountInfo0.a;
        ibuq.e(s, "getAccountId(...)");
        String s1 = this.c;
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
                if(dymv0 != dymv.b) {
                    if(hwsd.N()) {
                        ((ggtj)ebyx.a.h()).x("ProvisionTimeout: handle provision timeout!");
                    }
                    ((glyq)dycl0.a()).u();
                    ebwn ebwn0 = this.d;
                    if(ebwn0 == null) {
                        ibuq.j("notificationManager");
                        ebwn0 = null;
                    }
                    ibuq.e("Your transit card could not be added", "getString(...)");
                    ebwn.e(ebwn0, "Your transit card could not be added");
                    ebst ebst0 = this.e;
                    if(ebst0 == null) {
                        ibuq.j("emoneyOperationUtils");
                        ebst1 = null;
                    }
                    else {
                        ebst1 = ebst0;
                    }
                    String s2 = accountInfo0.b;
                    ibuq.e(s2, "getAccountName(...)");
                    Context context1 = this.c();
                    String s3 = "";
                    for(Object object1: ebst.a) {
                        String s4 = (String)object1;
                        if(!bbmq.af(context1, s4)) {
                            s3 = a.r(s4, s3, ",");
                        }
                    }
                    if(!ebss.b(context1)) {
                        s3 = s3 + ",com.google.android.apps.walletnfcrel";
                    }
                    ebst1.b(s2, 0x319FE, 0L, 0, s3);
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
        if(hwsd.N()) {
            ((ggtj)ebyx.a.h()).x("ProvisionTimeout: onInitializeTasks called!");
        }
    }

    public final Context c() {
        Context context0 = this.b;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("appContext");
        return null;
    }
}

