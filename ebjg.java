import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.CheckReadinessForEmoneyRequest;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import j..util.Optional;

public final class ebjg extends ebav {
    public edse a;
    public edqy b;
    public bbng c;
    public ebst d;
    public boolean e;
    private static final bboh f;
    private final CheckReadinessForEmoneyRequest g;
    private final donp h;
    private long n;
    private Optional o;

    static {
        ebjg.f = bboh.b("Pay", bbcu.cZ);
    }

    public ebjg(CheckReadinessForEmoneyRequest checkReadinessForEmoneyRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(checkReadinessForEmoneyRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("CheckReadinessForEmoney", s, azug0);
        this.g = checkReadinessForEmoneyRequest0;
        this.h = donp0;
        this.e = true;
        Optional optional0 = Optional.empty();
        ibuq.e(optional0, "empty(...)");
        this.o = optional0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebka(domv0).inject(this);
        this.d();
        this.n = System.currentTimeMillis();
        Optional optional0 = dlmj.a(context0).n();
        ibuq.e(optional0, "toJavaUtil(...)");
        this.o = optional0;
        hfuo hfuo0 = this.e ? hwnm.d().b : hwnm.e().b;
        ibuq.c(hfuo0);
        int v = 1;
        edse edse0 = null;
        if(!hwnm.o() && !(azqx.a(context0) ? ebza.k(context0, this.j) : ebza.j(context0, this.j, hfuo0))) {
            this.e(1);
            Status status0 = new Status(8, "Caller not authorized");
            this.h.e(status0, null);
            return;
        }
        CheckReadinessForEmoneyRequest checkReadinessForEmoneyRequest0 = this.g;
        if(ibuq.m(checkReadinessForEmoneyRequest0.a, "SERVICE_PROVIDER_OCTOPUS")) {
            edqy edqy0 = this.b;
            if(edqy0 == null) {
                ibuq.j("octopusCardEligibility");
                edqy0 = null;
            }
            if(!edqy0.b) {
                this.e(4);
                v = 0;
                goto label_65;
            }
            boolean z = TextUtils.isEmpty(checkReadinessForEmoneyRequest0.b);
            if(!hwnm.a.f().G() || !z) {
                if(!this.o.isPresent()) {
                    ((ggtj)ebjg.f.h()).B("%s: Active account not found.", "CheckReadinessForEmoneyOperation");
                    this.e(5);
                    v = 4;
                    goto label_65;
                }
                if(!z && !ibzk.K(checkReadinessForEmoneyRequest0.b, ((AccountInfo)this.o.get()).b)) {
                    ((ggtj)ebjg.f.h()).B("%s: provided account does not match the active account.", "CheckReadinessForEmoneyOperation");
                    this.e(7);
                    v = 5;
                    goto label_65;
                }
            }
            else if(bbmn.y(bbmn.h(context0, "com.google.android.gms")).length == 0) {
                ((ggtj)ebjg.f.h()).B("%s: Active account not found.", "CheckReadinessForEmoneyOperation");
                this.e(5);
                v = 4;
                goto label_65;
            }
            edse edse1 = this.a;
            if(edse1 == null) {
                ibuq.j("walletInstallManager");
            }
            else {
                edse0 = edse1;
            }
            edsd edsd0 = edse0.e();
            if(edsd0 != null) {
                int v1 = edsd0.ordinal();
                if(v1 == 1) {
                    this.e(0);
                }
                else {
                    v = 2;
                    switch(v1) {
                        case 2: {
                            ((ggtj)ebjg.f.h()).B("%s: Wallet app not installed.", "CheckReadinessForEmoneyOperation");
                            this.e(8);
                            break;
                        }
                        case 3: {
                            ((ggtj)ebjg.f.h()).B("%s: Wallet app needs upgrade.", "CheckReadinessForEmoneyOperation");
                            this.e(9);
                            v = 3;
                            break;
                        }
                        default: {
                            ((ggtj)ebjg.f.j()).B("%s: failed to get Wallet app install state.", "CheckReadinessForEmoneyOperation");
                            this.e(6);
                            throw new cjuh(13, "Failed to get Wallet app install state");
                        }
                    }
                }
            label_65:
                EmoneyReadiness emoneyReadiness0 = new EmoneyReadiness(v);
                this.h.e(Status.b, emoneyReadiness0);
                return;
            }
            ((ggtj)ebjg.f.j()).B("%s: failed to get Wallet app install state.", "CheckReadinessForEmoneyOperation");
            this.e(6);
            throw new cjuh(13, "Failed to get Wallet app install state");
        }
        this.e(3);
        throw new cjuh(13, "Unsupported service provider");
    }

    public final ebst c() {
        ebst ebst0 = this.d;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final void d() {
        if(this.c != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void e(int v) {
        int v1 = TextUtils.isEmpty(this.g.b) ? 0x33307 : 0x351DF;
        if(this.o.isPresent()) {
            ebst ebst0 = this.c();
            String s = ((AccountInfo)this.o.get()).b;
            ibuq.e(s, "getAccountName(...)");
            this.d();
            ebst.e(ebst0, s, v1, System.currentTimeMillis() - this.n, v, 16);
            return;
        }
        ebst ebst1 = this.c();
        this.d();
        ebst.f(ebst1, v1, System.currentTimeMillis() - this.n, v);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.h.e(Status.d, null);
    }
}

