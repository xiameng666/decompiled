import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutionException;

public final class ebjh {
    public String a;
    public dmkl b;
    public dxyu c;
    public ebst d;
    public fsis e;
    private static final bboh f;
    private final donp g;
    private final Context h;

    static {
        ebjh.f = bboh.b("Pay", bbcu.cZ);
    }

    public ebjh(donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.g = donp0;
        this.h = context0;
    }

    public final ebst a() {
        ebst ebst0 = this.d;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final void b() {
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebkb(domv0).inject(this);
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        dmkl dmkl0 = this.b;
        dygb dygb0 = null;
        if(dmkl0 == null) {
            ibuq.j("deviceUtil");
            dmkl0 = null;
        }
        boolean z = false;
        if(dmkl0.h()) {
            fsis fsis0 = this.e;
            if(fsis0 == null) {
                ibuq.j("seDeviceUtil");
                fsis0 = null;
            }
            Context context0 = this.h;
            if(fsis0.c(context0)) {
                gfsx gfsx0 = dlmj.a(context0);
                if(gfsx0.i()) {
                    String s = ((AccountInfo)gfsx0.d()).b;
                    ebst ebst0 = this.a();
                    ibuq.c(s);
                    ebst0.a(s, 0x32F12);
                    dxyu dxyu0 = this.c;
                    if(dxyu0 == null) {
                        ibuq.j("dataStoreProvider");
                        dxyu0 = null;
                    }
                    Account account0 = new Account(s, "com.google");
                    String s1 = this.a;
                    if(s1 == null) {
                        ibuq.j("environment");
                        s1 = null;
                    }
                    frli frli0 = dxyu0.a(account0, s1);
                    try {
                        switch(((dygc)frli0.a().get()).b) {
                            case 0: {
                                dygb0 = dygb.a;
                                break;
                            }
                            case 1: {
                                dygb0 = dygb.b;
                                break;
                            }
                            case 2: {
                                dygb0 = dygb.c;
                            }
                        }
                        if(dygb0 == null) {
                            dygb0 = dygb.d;
                        }
                        int v = dygb0.ordinal();
                        switch(v) {
                            case 0: {
                                this.a().a(s, 0x32F13);
                                z = true;
                                break;
                            }
                            case 1: {
                                this.a().a(s, 209964);
                                z = true;
                                break;
                            }
                            case 2: {
                                this.a().a(s, 209965);
                                break;
                            }
                            default: {
                                if(v != 3) {
                                    throw new ibnq();
                                }
                                this.a().a(s, 0x32F13);
                                z = true;
                                break;
                            }
                        }
                    }
                    catch(InterruptedException interruptedException0) {
                        a.ae(ebjh.f.j(), "Failed to checkTransitCardPresence from cache", interruptedException0);
                    }
                    catch(ExecutionException executionException0) {
                        a.ae(ebjh.f.j(), "Failed to checkTransitCardPresence from cache", executionException0);
                    }
                }
            }
        }
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        dyfy0.b = 17;
        dyfy0.c = Boolean.valueOf(z);
        byte[] arr_b = dyga0.a().toBytesArray();
        this.g.b(status0, arr_b);
    }
}

