import android.accounts.Account;
import android.icu.util.ULocale;
import java.util.List;

public final class cahe {
    public static final cahe a;
    public final ibtw b;
    public final ibts c;
    public final List d;
    public final ULocale e;
    public final Account f;
    public final ibth g;
    public final caje h;
    private final ibth i;
    private final acp j;

    static {
        cahe.a = new cahe(null, null, null, null, null, null, null, 0x1FF);
    }

    public cahe() {
        this(null, null, null, null, null, null, null, 0x1FF);
    }

    public cahe(ibth ibth0, ibtw ibtw0, ibts ibts0, List list0, Account account0, caje caje0, ibth ibth1, int v) {
        if((v & 1) != 0) {
            ibth0 = new caha();
        }
        if((v & 2) != 0) {
            ibtw0 = new cahd(null);
        }
        if((v & 4) != 0) {
            ibts0 = new cahb();
        }
        if((v & 8) != 0) {
            list0 = ibps.a;
        }
        ULocale uLocale0 = (v & 16) == 0 ? null : ULocale.getDefault();
        if((v & 0x20) != 0) {
            account0 = null;
        }
        if((v & 0x40) != 0) {
            caje0 = null;
        }
        if((v & 0x100) != 0) {
            ibth1 = new cahc();
        }
        ibuq.f(ibth0, "onNavigate");
        ibuq.f(ibtw0, "downloadButtonClick");
        ibuq.f(ibts0, "changeAccountButtonClick");
        ibuq.f(list0, "deviceCards");
        ibuq.f(uLocale0, "userLocale");
        ibuq.f(ibth1, "onVisitResourcesClick");
        super();
        this.i = ibth0;
        this.b = ibtw0;
        this.c = ibts0;
        this.d = list0;
        this.e = uLocale0;
        this.f = account0;
        this.h = caje0;
        this.j = null;
        this.g = ibth1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cahe)) {
            return false;
        }
        if(!ibuq.m(this.i, ((cahe)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.b, ((cahe)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((cahe)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((cahe)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((cahe)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((cahe)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.h, ((cahe)object0).h)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.g, ((cahe)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.i.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        caje caje0 = this.h;
        if(caje0 != null) {
            v1 = caje0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v1) * 961 + this.g.hashCode();
    }

    @Override
    public final String toString() {
        return "IntrusionDetectionRetrievalScreenUiModel(onNavigate=" + this.i + ", downloadButtonClick=" + this.b + ", changeAccountButtonClick=" + this.c + ", deviceCards=" + this.d + ", userLocale=" + this.e + ", currentUserAccount=" + this.f + ", gmsKeyRetrievalClient=" + this.h + ", keychainActivityResultLauncher=null, onVisitResourcesClick=" + this.g + ")";
    }
}

