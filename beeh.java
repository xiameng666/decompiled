import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import java.util.List;

public final class beeh implements evqk {
    public final evql a;
    public final ggeo b;

    public beeh(evql evql0, ggeo ggeo0) {
        this.a = evql0;
        this.b = ggeo0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        List list0 = (List)object0;
        gfsx gfsx0 = (gfsx)this.a.j();
        gfsx gfsx1 = gfqx.a;
        evql evql0 = evrg.d(gfsx1);
        ggeo ggeo0 = this.b;
        gfsx gfsx2 = (gfsx)((evql)ggeo0.getOrDefault(bdhr.a, evql0)).j();
        if(gfsx0.i() && gfsx2.i()) {
            gfsx1 = gfsx.m(Boolean.valueOf(((boolean)(((CredentialManagerAccount)gfsx0.d()).equals(gfsx2.d()) ^ 1))));
        }
        return evrg.d(new bect(gfsx1, ggch.j(ggeo0.g()).i(new beee()).l(new beef()).p().size(), ggch.j(ggeo0.g()).i(new beei()).a()));
    }
}

