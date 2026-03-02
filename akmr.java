import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Locale;

public final class akmr extends bagl {
    private final akrd c;
    private final int d;
    private final akqv e;
    private final Account f;
    private final aksd g;

    public akmr(Context context0, Account account0, int v, aksd aksd0) {
        akqv akqv0 = akqv.f();
        akrd akrd0 = akrd.a(context0);
        super(context0);
        batl.s(account0);
        this.f = account0;
        this.e = akqv0;
        this.c = akrd0;
        this.d = v;
        this.g = aksd0;
    }

    public final akro c(ryw ryw0) {
        akrd akrd0 = this.c;
        aksd aksd0 = this.g;
        akrd0.h(aksd0, 2);
        akqv akqv0 = this.e;
        Account account0 = this.f;
        akqs akqs0 = akqv0.d(this.getContext(), account0, this.d);
        boolean z = akqv0.l(this.getContext(), account0);
        if(aksd0 == null) {
            akrd0.j(9, akqv0.g(akqs0.b));
        }
        else {
            akrd0.h(aksd0.a(akqv0.g(akqs0.b)), 9);
        }
        hlxd hlxd0 = akqv0.g(akqs0.b);
        boolean z1 = true;
        Boolean boolean0 = null;
        String s = hlxd0 == null || (hlxd0.b & 1) == 0 ? null : hlxd0.c;
        if(hpwf.c()) {
            Context context0 = this.getContext();
            String s1 = hpwx.a.b().d();
            try {
                akqv.q();
                if(TextUtils.isEmpty(akqr.a(context0, account0, s1, new Bundle()))) {
                    Log.e("Auth", "[AuthManaged, AuthManagedHelper] Empty or null access token.");
                }
                else {
                    Log.i("Auth", "[AuthManaged, AuthManagedHelper] GetToken success.");
                }
            }
            catch(acse acse0) {
                String s2 = acse0.getMessage();
                Log.i("Auth", "[AuthManaged, AuthManagedHelper] GetToken failed with " + s2);
                if(!hpwx.a.b().c().b.contains(s2)) {
                    goto label_31;
                }
                goto label_32;
            }
            catch(IOException iOException0) {
                Log.e("Auth", "[AuthManaged, AuthManagedHelper] GetToken transient error.", iOException0);
            }
        label_31:
            z1 = false;
        label_32:
            boolean0 = Boolean.valueOf(z1);
        }
        boolean z2 = akqs0.c;
        akro akro0 = new akro(akqs0.b, z, z2, boolean0);
        if(ryw0 != null) {
            ryw0.a(new akia(z2, s), new sci(akro0));
        }
        return akro0;
    }

    @Override  // luw
    public final Object loadInBackground() {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, FetchManagingAppInfoLoader] loadInBackground"));
        if(hpyb.d()) {
            akmq akmq0 = new akmq(this);
            return (akro)ryx.a(akhz.d, ibom.a, akmq0);
        }
        return this.c(null);
    }
}

