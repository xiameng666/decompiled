import android.os.PersistableBundle;
import j..util.Base64;
import java.util.Arrays;

public final class fnck implements scz {
    public static final fncj a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final fnct l;
    public final boolean m;
    private final boolean n;

    static {
        fnck.a = new fncj();
    }

    public fnck() {
        this(null, false, false, false, null, false, null, false, false, false, null, false);
    }

    public fnck(String s, boolean z, boolean z1, boolean z2, byte[] arr_b, boolean z3, String s1, boolean z4, boolean z5, boolean z6, fnct fnct0, boolean z7) {
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = arr_b;
        this.g = z3;
        this.h = s1;
        this.i = z4;
        this.j = z5;
        this.n = z6;
        this.l = fnct0;
        this.m = z7;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("accountname", this.b);
        persistableBundle0.putBoolean("isSetupFlow", this.d);
        persistableBundle0.putBoolean("com.google.android.setupwizard/setupwizard", this.c);
        persistableBundle0.putString("d2d_options", (this.f == null ? null : Base64.getEncoder().encodeToString(this.f)));
        persistableBundle0.putBoolean("suppressD2D", this.e);
        persistableBundle0.putBoolean("resolveFrpOnly", this.g);
        persistableBundle0.putString("packageName", this.h);
        persistableBundle0.putBoolean("useImmersiveMode", this.i);
        persistableBundle0.putBoolean("suppressGoogleServices", this.j);
        persistableBundle0.putBoolean("firstRun", this.n);
        fnct fnct0 = this.l;
        if(fnct0 != null) {
            persistableBundle0.putPersistableBundle("enterpriseFlowArgs", fnct0.a());
        }
        persistableBundle0.putBoolean("allow_skip", this.m);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fnck)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fnck)object0).b)) {
            return false;
        }
        if(this.c != ((fnck)object0).c) {
            return false;
        }
        if(this.d != ((fnck)object0).d) {
            return false;
        }
        if(this.e != ((fnck)object0).e) {
            return false;
        }
        byte[] arr_b = this.f;
        if(arr_b != null) {
            byte[] arr_b1 = ((fnck)object0).f;
            if(arr_b1 == null) {
                return false;
            }
            if(!Arrays.equals(arr_b, arr_b1)) {
                return false;
            }
        }
        else if(((fnck)object0).f != null) {
            return false;
        }
        if(this.g != ((fnck)object0).g) {
            return false;
        }
        if(!ibuq.m(this.h, ((fnck)object0).h)) {
            return false;
        }
        if(this.i != ((fnck)object0).i) {
            return false;
        }
        if(this.j != ((fnck)object0).j) {
            return false;
        }
        if(this.n != ((fnck)object0).n) {
            return false;
        }
        return ibuq.m(this.l, ((fnck)object0).l) ? this.m == ((fnck)object0).m : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : Arrays.hashCode(this.f);
        int v2 = ((((((((((this.b == null ? 0 : this.b.hashCode()) * 0x1F + fnci.a(this.d)) * 0x1F + fnci.a(this.c)) * 0x1F + fnci.a(this.e)) * 0x1F + v1) * 0x1F + fnci.a(this.g)) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + fnci.a(this.i)) * 0x1F + fnci.a(this.j)) * 0x1F + fnci.a(this.n)) * 0x1F;
        fnct fnct0 = this.l;
        if(fnct0 != null) {
            v = fnct0.hashCode();
        }
        return (v2 + v) * 0x1F + fnci.a(this.m);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.f);
        return "AddAccountRequest(accountName=" + this.b + ", isSetupWizard=" + this.c + ", isSetupFlow=" + this.d + ", suppressD2d=" + this.e + ", d2dOptions=" + s + ", resolveFrpOnly=" + this.g + ", packageName=" + this.h + ", useImmersiveMode=" + this.i + ", suppressGoogleServices=" + this.j + ", isFirstRun=" + this.n + ", enterpriseArguments=" + this.l + ", allowSkip=" + this.m + ")";
    }
}

