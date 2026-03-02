import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class algi extends cjtm {
    public static final bboh a;
    private final azxs b;
    private final String c;
    private final Account d;
    private final boolean e;
    private alem f;
    private final ajes g;

    static {
        algi.a = alis.a("SetFeatureSupported");
    }

    public algi(azxs azxs0, String s, boolean z, String s1, ajes ajes0, alem alem0, azug azug0) {
        super(0x8E, "SetFeatureSupported", azug0);
        this.b = azxs0;
        this.e = z;
        this.c = s;
        this.d = new Account(s1, "com.google");
        this.g = ajes0;
        this.f = alem0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v2;
        int v1;
        gqus gqus0;
        aliu aliu0 = new aliu();
        akww akww0 = new akww(context0);
        int v = 3;
        try {
            gqus0 = gqus.b(this.c);
            batl.b(gqus0 != gqus.a);
        }
        catch(IllegalArgumentException unused_ex) {
            aliu0.N(3);
            throw new cjuh(101, "Invalid feature name: " + this.c);
        }
        Account account0 = this.d;
        if(bbmn.m(context0, account0)) {
            try {
                if(hpyz.h()) {
                    evql evql0 = this.g.e("DeviceSync:BetterTogether", account0);
                    evrg.o(evql0, hpyz.b(), TimeUnit.SECONDS);
                    v1 = ((Boolean)evql0.j()).booleanValue() ^ 1;
                }
                else {
                    v1 = 0;
                }
                boolean z = this.e;
                boolean z1 = akww0.h(account0, gqus0, z);
                if(!z1 && v1 == 0) {
                    this.b.a(Status.b);
                    return;
                }
                akws akws0 = akwr.a(context0);
                akwa akwa0 = new akwa(this.g, akww0, akws0);
                String s = this.c;
                if(alae.b(s)) {
                    this.f = alem.b;
                }
                ((ggtj)algi.a.h()).Z("Setting feature %s supported state to %s. Did value change: %s Needs key enrollment: %s Enrollment mode: %s", s, Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(((boolean)v1)), this.f);
                new aliu().M(this.f == alem.b);
                if(v1 != 0) {
                    v = 2;
                }
                else if(!hpyt.f()) {
                    v = 1;
                }
                evql evql1 = akwa0.a(account0, this.f, v);
                evrg.o(evql1, hpyt.b(), TimeUnit.SECONDS);
                Status status0 = ((KeyRegistrationResult)evql1.j()).b;
                this.b.a(status0);
            }
            catch(ExecutionException | InterruptedException | TimeoutException | akvz exception0) {
                if(!(exception0 instanceof ExecutionException)) {
                    v2 = 8;
                }
                else if((exception0.getCause() instanceof ajet)) {
                    v2 = ((ajet)exception0.getCause()).b();
                    if(ajev.b(v2)) {
                        aliu0.N(9);
                        this.b.a(Status.b);
                        return;
                    }
                }
                else {
                    v2 = 8;
                }
                akww0.h(this.d, gqus0, ((boolean)(this.e ^ 1)));
                a.ae(algi.a.j(), "SetFeatureSupportedOperation failed", exception0);
                if((exception0 instanceof ExecutionException)) {
                    aliu0.N(5);
                }
                else if((exception0 instanceof InterruptedException)) {
                    aliu0.N(6);
                }
                else if((exception0 instanceof TimeoutException)) {
                    aliu0.N(7);
                }
                else {
                    aliu0.N(8);
                }
                throw new cjuh(v2, "Failed to enroll for new feature");
            }
            aliu0.N(0);
            return;
        }
        aliu0.N(4);
        throw new cjuh(102, "Account not found: " + account0.name);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

