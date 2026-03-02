import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class bghw implements evpo {
    public final bgia a;
    public final CredentialManagerAccount b;

    public bghw(bgia bgia0, CredentialManagerAccount credentialManagerAccount0) {
        this.a = bgia0;
        this.b = credentialManagerAccount0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.i() == null && evql0.j() != null) {
            CredentialManagerAccount credentialManagerAccount0 = this.b;
            bdij bdij0 = (bdij)evql0.j();
            if(bdij0.equals(bdij.b) && credentialManagerAccount0.b()) {
                bgia bgia0 = this.a;
                bayn bayn0 = bgia0.c.c;
                if(bayn0 != null && bayn0.z()) {
                    int v = bgmu.a(credentialManagerAccount0.a);
                    CredentialManagerAccount credentialManagerAccount1 = CredentialManagerAccount.a(credentialManagerAccount0.a);
                    azzc azzc0 = new azzc();
                    azzc0.d = 26802;
                    azzc0.a = new bgom(credentialManagerAccount1, v);
                    azzd azzd0 = azzc0.a();
                    return ((azts)bgia0.b).iG(azzd0).e(new bghu(bgia0, credentialManagerAccount0.a, v));
                }
                return evrg.d(bdij.c);
            }
            return evrg.d(bdij0);
        }
        return evrg.d(bdij.e);
    }
}

