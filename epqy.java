import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqy implements gfsi {
    public final ConsentChimeraActivity a;

    public epqy(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        consentChimeraActivity0.n.d(Integer.valueOf(0));
        ConsentChimeraActivity.p(new epqo(((TokenResponse)object0)));
        consentChimeraActivity0.s = (TokenResponse)object0;
        switch(((TokenResponse)object0).a().ordinal()) {
            case 2: {
                consentChimeraActivity0.g(((TokenResponse)object0).d);
                return gfqx.a;
            }
            case 4: {
                consentChimeraActivity0.a(3, "Network error");
                return gfqx.a;
            }
            case 5: {
                consentChimeraActivity0.a(4, "Service unavailable");
                return gfqx.a;
            }
            case 6: {
                consentChimeraActivity0.a(4, "Internal error");
                return gfqx.a;
            }
            case 8: {
                return gfsx.m(Integer.valueOf(100));
            }
            case 22: {
                return gfsx.m(Integer.valueOf(300));
            }
            case 23: {
                return gfsx.m(Integer.valueOf(200));
            }
            case 37: {
                return gfsx.m(Integer.valueOf(501));
            }
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 38: 
            case 39: {
                return gfsx.m(Integer.valueOf(500));
            }
            default: {
                consentChimeraActivity0.a(4, "Unknown error");
                return gfqx.a;
            }
        }
    }
}

