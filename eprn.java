import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprn implements gfsi {
    public final ConsentChimeraActivity a;

    public eprn(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        consentChimeraActivity0.n.d(Integer.valueOf(500));
        int v = ((bxki)object0).a;
        if(v != 0) {
            switch(v) {
                case 3: {
                    consentChimeraActivity0.a(3, "Network error");
                    return gfqx.a;
                }
                case 4: {
                    consentChimeraActivity0.a(3, "App installation failure");
                    return gfqx.a;
                }
                case 2: 
                case 7: 
                case 8: {
                    consentChimeraActivity0.a(5, "Unexpected server error");
                    return gfqx.a;
                }
                case 5: 
                case 9: {
                    consentChimeraActivity0.a(6, "Device management not supported");
                    return gfqx.a;
                }
                case 6: 
                case 10: {
                    consentChimeraActivity0.a(4, "User canceled");
                    return gfqx.a;
                }
                default: {
                    return gfsx.m(Integer.valueOf(0));
                }
            }
        }
        if(hyer.a.b().b()) {
            consentChimeraActivity0.a(4, "user canceled");
            return gfqx.a;
        }
        return gfsx.m(Integer.valueOf(0));
    }
}

