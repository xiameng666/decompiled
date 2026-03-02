import com.google.android.gms.wearable.AppTheme;

public final class fdan {
    public final AppTheme a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public fdan() {
        throw null;
    }

    public fdan(AppTheme appTheme0, boolean z, int v, String s, String s1, boolean z1, boolean z2, boolean z3, boolean z4) {
        this.a = appTheme0;
        this.b = z;
        this.c = v;
        this.d = s;
        this.e = s1;
        this.f = z1;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static fdam a() {
        fdam fdam0 = new fdam();
        fdam0.e(false);
        return fdam0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fdan) && this.a.equals(((fdan)object0).a) && this.b == ((fdan)object0).b && this.c == ((fdan)object0).c) {
            String s = this.d;
            if(s != null) {
                if(s.equals(((fdan)object0).d)) {
                label_8:
                    String s1 = this.e;
                    if(s1 == null) {
                        return ((fdan)object0).e == null ? this.f == ((fdan)object0).f && this.g == ((fdan)object0).g && this.h == ((fdan)object0).h && this.i == ((fdan)object0).i : false;
                    }
                    return s1.equals(((fdan)object0).e) ? this.f == ((fdan)object0).f && this.g == ((fdan)object0).g && this.h == ((fdan)object0).h && this.i == ((fdan)object0).i : false;
                }
            }
            else if(((fdan)object0).d == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = 0x4D5;
        int v2 = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ (this.b ? 0x4CF : 0x4D5)) * 1000003 ^ this.c) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003;
        String s = this.e;
        if(s != null) {
            v = s.hashCode();
        }
        int v3 = this.f ? 0x4CF : 0x4D5;
        int v4 = this.g ? 0x4CF : 0x4D5;
        int v5 = this.h ? 0x4CF : 0x4D5;
        if(this.i) {
            v1 = 0x4CF;
        }
        return ((((v2 ^ v) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "ConsentFragmentParams{appTheme=" + this.a + ", isLeDevice=" + this.b + ", termsContext=" + this.c + ", watchNodeId=" + this.d + ", accountName=" + this.e + ", showBackupConsent=" + this.f + ", useConsentPerWatch=" + this.g + ", isWatchConnected=" + this.h + ", isWatchSupervised=" + this.i + "}";
    }
}

