import android.accounts.Account;
import android.content.Context;
import android.security.advancedprotection.AdvancedProtectionManager;

public final class cahq implements ibth {
    public final caie a;
    public final bboh b;
    public final icck c;
    public final gra d;
    public final Context e;
    public final AdvancedProtectionManager f;
    public final aca g;
    public final caje h;

    public cahq(caie caie0, bboh bboh0, caje caje0, icck icck0, gra gra0, Context context0, AdvancedProtectionManager advancedProtectionManager0, aca aca0) {
        this.a = caie0;
        this.b = bboh0;
        this.h = caje0;
        this.c = icck0;
        this.d = gra0;
        this.e = context0;
        this.f = advancedProtectionManager0;
        this.g = aca0;
    }

    @Override  // ibth
    public final Object a() {
        String s1;
        gra gra0 = this.d;
        if(caib.d(gra0)) {
            return ibom.a;
        }
        caib.c(gra0, true);
        Account account0 = this.a.d;
        if(account0 == null) {
            s1 = null;
        }
        else {
            String s = account0.name;
            s1 = s == null ? null : s;
        }
        bboh bboh0 = this.b;
        if(s1 == null) {
            ((ggtj)bboh0.j()).x("Account name is null, cannot get sync status.");
            return ibom.a;
        }
        caje caje0 = this.h;
        if(caje0 == null) {
            ((ggtj)bboh0.j()).x("gmsKeyRetrievalClient is null, cannot get sync status.");
            return ibom.a;
        }
        cahx cahx0 = new cahx(bboh0, s1, caje0, this.e, this.f, this.g, gra0, null);
        icbb.b(this.c, null, null, cahx0, 3);
        return ibom.a;
    }
}

