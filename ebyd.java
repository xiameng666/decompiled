import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import j..util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class ebyd implements dnqb {
    public dytd a;
    public dypj b;
    public fhwb c;
    public fich d;
    public String e;
    private static final bboh f;

    static {
        ebyd.f = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        dytd dytd1;
        gfsx gfsx0 = dlmj.a(context0);
        int v = 2;
        if(!gfsx0.i()) {
            ((ggtj)ebyd.f.j()).x("Active account not found, skipping dagger injection.");
            return 2;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        done done0 = new done();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        edop edop0 = new edop();
        Context context1 = AppContextProvider.a();
        ibuq.e(context1, "getApplicationContext(...)");
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        ibuq.e(accountInfo0.a, "getAccountId(...)");
        new ebpf(dlmg.a(context1, accountInfo0.b, accountInfo0.a), new dmgr("com.google.android.gms"), done0, domv0, edop0).inject(this);
        fich fich0 = this.d;
        if(fich0 == null) {
            ibuq.j("veSloManager");
            fich0 = null;
        }
        ficj ficj0 = fich0.a(1L, TimeUnit.MINUTES);
        fhwb fhwb0 = this.c;
        if(fhwb0 == null) {
            ibuq.j("semanticLogger");
            fhwb0 = null;
        }
        fhvz fhvz0 = fhwa.a(0x4171F);
        String s = this.e;
        if(s == null) {
            ibuq.j("accountName");
            s = null;
        }
        fhvz0.c(fhwp.b(s));
        fhvz0.b(ficj0.a());
        fhwb0.a(fhvz0.a());
        try {
            try {
                String s1 = cllr0.b == null ? null : cllr0.b.getString("cid");
                Integer integer0 = cllr0.b == null ? null : cllr0.b.getInt("service_provider_number");
                if(s1 == null) {
                    ((ggtj)ebyd.f.j()).x("CID or service provider number is not set in the task params.");
                    ficj0.c(3);
                }
                else {
                    dytd dytd0 = this.a;
                    if(dytd0 == null) {
                        ibuq.j("sePrepaidCardManager");
                        dytd1 = null;
                    }
                    else {
                        dytd1 = dytd0;
                    }
                    Optional optional0 = (Optional)evrg.n(dytd1.h(dyna.b(integer0.intValue()), s1, 5, 1, 1));
                    ficj0.c(0);
                    v = 0;
                }
            }
            catch(ExecutionException executionException0) {
                ficj0.c(13);
                ((ggtj)((ggtj)ebyd.f.j()).s(executionException0)).x("Failed to refresh commuter pass data.");
            }
            catch(InterruptedException interruptedException0) {
                ficj0.c(1);
                ((ggtj)((ggtj)ebyd.f.j()).s(interruptedException0)).x("Interrupted while refreshing commuter pass data.");
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(ficj0, throwable0);
            throw throwable0;
        }
        ficj0.close();
        return v;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
    }
}

