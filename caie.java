import android.accounts.Account;

public final class caie {
    public static final caie a;
    public final boolean b;
    public final ibth c;
    public final Account d;
    public final ibth e;
    public final caje f;
    private final clyi g;
    private final caif h;
    private final String i;
    private final clwn j;

    static {
        caie.a = new caie(false, null, null, null, null, 0x1FF);
    }

    public caie() {
        this(false, null, null, null, null, 0x1FF);
    }

    public caie(boolean z, ibth ibth0, Account account0, caje caje0, ibth ibth1, int v) {
        if((v & 0x20) != 0) {
            ibth0 = new caic();
        }
        if((v & 0x40) != 0) {
            account0 = null;
        }
        if((v & 0x80) != 0) {
            caje0 = null;
        }
        if((v & 0x100) != 0) {
            ibth1 = new caid();
        }
        ibuq.f(ibth0, "onVisitResourcesClick");
        ibuq.f(ibth1, "onEnrollmentFlowComplete");
        super();
        this.b = 1 == (((int)z) & (v & 1 ^ 1));
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.c = ibth0;
        this.d = account0;
        this.f = caje0;
        this.e = ibth1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof caie)) {
            return false;
        }
        if(this.b != ((caie)object0).b) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.c, ((caie)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((caie)object0).d)) {
            return false;
        }
        return ibuq.m(this.f, ((caie)object0).f) ? ibuq.m(this.e, ((caie)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.c.hashCode();
        int v1 = this.b ? 0x4CF : 0x4D5;
        int v2 = 0;
        int v3 = this.d == null ? 0 : this.d.hashCode();
        caje caje0 = this.f;
        if(caje0 != null) {
            v2 = caje0.hashCode();
        }
        return (((v1 * 0x1B4D89F + v) * 0x1F + v3) * 0x1F + v2) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "IntrusionDetectionSettingsScreenUiModel(isLoading=" + this.b + ", errorCard=null, alertCard=null, errorMessage=null, warningCard=null, onVisitResourcesClick=" + this.c + ", currentUserAccount=" + this.d + ", gmsKeyRetrievalClient=" + this.f + ", onEnrollmentFlowComplete=" + this.e + ")";
    }
}

