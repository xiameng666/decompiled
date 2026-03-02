import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class azor {
    public Account a;
    public boolean b;
    public String c;
    public boolean d;
    public String e;
    public int f;
    public String g;
    public azos h;
    public boolean i;
    public boolean j;
    private ArrayList k;
    private ArrayList l;
    private boolean m;
    private boolean n;

    public azor() {
        this.m = false;
        this.d = false;
        this.f = 0;
        this.n = false;
    }

    public final azot a() {
        boolean z = false;
        if(!this.n) {
            batl.c(this.g == null, "We only support hostedDomain filter for account chip styled account picker");
            batl.c(this.h == null, "Consent is only valid for account chip styled account picker");
        }
        if(this.j) {
            batl.c(this.n, "Excluding the \'Manage accounts\' option is only supported when using the account chip.");
            if(this.f == 1001 || this.f == 1002 || this.f == 1003 || this.f == 1004) {
                z = true;
            }
            batl.c(z, "Excluding the \'Manage accounts\' option is only supported when using the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes.");
        }
        azot azot0 = new azot();
        azot0.d = this.l;
        azot0.c = this.k;
        azot0.e = this.m;
        azot0.l = this.h;
        azot0.j = this.g;
        azot0.g = null;
        azot0.a = this.a;
        azot0.b = this.b;
        azot0.h = this.d;
        azot0.m = this.e;
        azot0.i = this.f;
        azot0.f = this.c;
        azot0.k = this.n;
        azot0.n = this.i;
        azot0.o = this.j;
        return azot0;
    }

    public final void b(List list0) {
        this.k = list0 == null ? null : new ArrayList(list0);
    }

    public final void c(List list0) {
        this.l = list0 == null ? null : new ArrayList(list0);
    }

    public final void d() {
        this.m = true;
    }

    public final void e() {
        this.n = true;
    }
}

