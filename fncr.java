import android.os.Bundle;
import android.os.PersistableBundle;

public final class fncr extends fncs {
    private final String a;
    private final String g;
    private final boolean h;
    private final String i;
    private final String j;

    public fncr(String s, String s1, boolean z, String s2, String s3) {
        ibuq.f(s, "accountName");
        ibuq.f(s1, "accountType");
        Bundle bundle0 = new Bundle();
        bundle0.putString("authAccount", s);
        bundle0.putString("accountType", s1);
        bundle0.putBoolean("new_account_created", z);
        bundle0.putString("restoreAccount", s2);
        bundle0.putString("restoreToken", s3);
        super(-1, bundle0, 2);
        this.a = s;
        this.g = s1;
        this.h = z;
        this.i = s2;
        this.j = s3;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", this.d);
        persistableBundle0.putInt("response_id", this.f);
        persistableBundle0.putString("authAccount", this.a);
        persistableBundle0.putString("accountType", this.g);
        persistableBundle0.putBoolean("new_account_created", this.h);
        persistableBundle0.putString("restoreAccount", this.i);
        persistableBundle0.putString("restoreToken", this.j);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fncr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fncr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.g, ((fncr)object0).g)) {
            return false;
        }
        if(this.h != ((fncr)object0).h) {
            return false;
        }
        return ibuq.m(this.i, ((fncr)object0).i) ? ibuq.m(this.j, ((fncr)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.g.hashCode();
        int v1 = 0;
        int v2 = this.i == null ? 0 : this.i.hashCode();
        int v3 = this.h ? 0x4CF : 0x4D5;
        String s = this.j;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v3) * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SUCCESS_ACCOUNT_ADDED(accountName=" + this.a + ", accountType=" + this.g + ", isNewAccount=" + this.h + ", restoreAccount=" + this.i + ", restoreToken=" + this.j + ")";
    }
}

