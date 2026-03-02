import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class ahed implements bxto {
    public final aheo a;

    public ahed(aheo aheo0) {
        this.a = aheo0;
    }

    @Override  // bxto
    public final Object a(Object object0) {
        gged_interceptors gged0 = gged_interceptors.i(((GetAccountsResponse)object0).a);
        aheo aheo0 = this.a;
        aheo0.j = gged0;
        if(aheo0.j.size() > 0) {
            aheo0.f = bxoc.a(AppContextProvider.a(), ((GoogleAccount)aheo0.j.get(0)).c);
        }
        return gfsx.m(bxre.c);
    }
}

