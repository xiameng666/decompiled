import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aleb extends cjtm {
    public static final bboh a;
    private final azxs b;
    private final Account c;
    private alem d;
    private final ajes e;

    static {
        aleb.a = alis.a("BatchSetFeatureSupported");
    }

    public aleb(azxs azxs0, String s, ajes ajes0, alem alem0, azug azug0) {
        super(0x8E, "SetFeatureSupported", azug0);
        this.b = azxs0;
        this.c = new Account(s, "com.google");
        this.e = ajes0;
        this.d = alem0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v1;
        List list0;
        int v;
        akww akww0 = new akww(context0);
        aliu aliu0 = new aliu();
        Account account0 = this.c;
        if(bbmn.m(context0, account0)) {
            try {
                if(hpyz.h()) {
                    evql evql0 = this.e.e("DeviceSync:BetterTogether", account0);
                    evrg.o(evql0, hpyz.b(), TimeUnit.SECONDS);
                    v = ((Boolean)evql0.j()).booleanValue() ^ 1;
                }
                else {
                    v = 0;
                }
                try {
                    if(cpje.c()) {
                        evql evql1 = akww0.a().d(new bblp(1, 10), new akwt(akww0, account0));
                        evrg.o(evql1, hpyt.a.c().a(), TimeUnit.SECONDS);
                        list0 = (List)evql1.j();
                    }
                    else {
                        list0 = akww0.c(account0, akww0.f());
                    }
                }
                catch(IOException iOException0) {
                    a.ae(aleb.a.j(), "Failed to check if feature support changed", iOException0);
                    this.b.a(Status.d);
                    return;
                }
                if(list0.isEmpty()) {
                    if(v == 0) {
                        this.b.a(Status.b);
                        return;
                    }
                    v = 1;
                }
                for(Object object0: list0) {
                    if(alae.b(((gqus)object0).name())) {
                        this.d = alem.b;
                        break;
                    }
                }
                ((ggtj)aleb.a.h()).X("Requesting Cryptauth enrollment. Toggled features count: %d Needs key enrollment: %s Enrollment mode: %s", Integer.valueOf(list0.size()), Boolean.valueOf(((boolean)v)), this.d);
                alem alem0 = this.d;
                aliu0.b("batch_set_feature_supported_enrollment_count");
                if(alem0 == alem.b) {
                    aliu0.b("batch_set_feature_supported_immediate_enrollment_count");
                }
                aliu0.c();
                if(v == 0) {
                    v1 = hpyt.f() ? 3 : 1;
                }
                else {
                    v1 = 2;
                }
                akws akws0 = akwr.a(context0);
                evql evql2 = new akwa(this.e, akww0, akws0).a(this.c, this.d, v1);
                evrg.o(evql2, hpyt.b(), TimeUnit.SECONDS);
                Status status0 = ((KeyRegistrationResult)evql2.j()).b;
                this.b.a(status0);
            }
            catch(ExecutionException | InterruptedException | TimeoutException | akvz exception0) {
                int v2 = 8;
                if((exception0 instanceof ExecutionException)) {
                    if((exception0.getCause() instanceof ajet)) {
                        int v3 = ((ajet)exception0.getCause()).b();
                        if(ajev.b(v3)) {
                            aliu0.d(9);
                            this.b.a(Status.b);
                            return;
                        }
                        v2 = v3;
                    }
                    aliu0.d(5);
                }
                else if((exception0 instanceof InterruptedException)) {
                    aliu0.d(6);
                }
                else if((exception0 instanceof TimeoutException)) {
                    aliu0.d(7);
                }
                else {
                    aliu0.d(8);
                }
                throw new cjuh(v2, "Failed to enroll for new feature", null, exception0);
            }
            Account account1 = this.c;
            if(cpje.c()) {
                akww0.a().y(new bblp(1, 10), new akwu(akww0, account1));
            }
            else {
                List list1 = akww0.f();
                akww0.a.c(account1, list1);
            }
            aliu0.d(0);
            return;
        }
        aliu0.d(4);
        throw new cjuh(102, "Account not found: " + account0.name);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

