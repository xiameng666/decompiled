import android.os.PersistableBundle;
import java.util.List;

public final class erbm implements scz {
    public static final erbl a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;

    static {
        erbm.a = new erbl();
    }

    public erbm(List list0, List list1, String s, String s1) {
        this.b = list0;
        this.c = list1;
        this.d = s;
        this.e = s1;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sde.d(persistableBundle0, "sourceAccounts", this.b);
        persistableBundle0.putStringArray("transferredAccounts", ((String[])this.c.toArray(new String[0])));
        String s = this.d;
        if(s != null && s.length() == 0) {
            throw new IllegalArgumentException("restoreAccount must be non-empty if it\'s not null");
        }
        persistableBundle0.putString("restoreAccount", s);
        persistableBundle0.putString("restoreToken", this.e);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof erbm)) {
            return false;
        }
        if(!ibuq.m(this.b, ((erbm)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((erbm)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((erbm)object0).d) ? ibuq.m(this.e, ((erbm)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F + this.c.hashCode();
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "AccountTransferState(sourceAccounts=" + this.b + ", transferredAccounts=" + this.c + ", restoreAccount=" + this.d + ", restoreToken=" + this.e + ")";
    }
}

