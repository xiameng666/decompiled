import com.google.android.gms.auth.api.credentials.nextgen.ui.GetVerifiableCredentialChimeraActivity;

public final class ahez implements lqj {
    public final GetVerifiableCredentialChimeraActivity a;

    public ahez(GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity0) {
        this.a = getVerifiableCredentialChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity0 = this.a;
        switch(((int)(((Integer)object0)))) {
            case 1: {
                fm fm0 = getVerifiableCredentialChimeraActivity0.getSupportFragmentManager();
                if(fm0.h("GetVerifiableCredentialLoadingFragment") == null) {
                    getVerifiableCredentialChimeraActivity0.l = new ahfa();
                    getVerifiableCredentialChimeraActivity0.l.show(fm0, "GetVerifiableCredentialLoadingFragment");
                    return;
                }
                break;
            }
            case 2: {
                fm fm1 = getVerifiableCredentialChimeraActivity0.getSupportFragmentManager();
                if(fm1.h("GetVerifiableCredentialBiometricFragment") == null) {
                    ahew ahew0 = new ahew();
                    ca ca0 = new ca(fm1);
                    ca0.v(ahew0, "GetVerifiableCredentialBiometricFragment");
                    ca0.f();
                    return;
                }
                break;
            }
        }
    }
}

