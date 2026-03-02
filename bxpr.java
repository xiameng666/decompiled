import android.accounts.Account;
import java.util.function.Consumer;

public final class bxpr {
    public final boolean a;
    public final String b;
    public final Account c;
    public final Consumer d;
    public final Runnable e;
    public final gged_interceptors f;
    public final String g;
    public final ggfp h;

    public bxpr() {
        throw null;
    }

    public bxpr(boolean z, String s, Account account0, Consumer consumer0, Runnable runnable0, gged_interceptors gged0, String s1, ggfp ggfp0) {
        this.a = z;
        this.b = s;
        this.c = account0;
        this.d = consumer0;
        this.e = runnable0;
        this.f = gged0;
        this.g = s1;
        this.h = ggfp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bxpr) && this.a == ((bxpr)object0).a && this.b.equals(((bxpr)object0).b)) {
            Account account0 = this.c;
            if(account0 == null) {
                return ((bxpr)object0).c == null ? this.d.equals(((bxpr)object0).d) && this.e.equals(((bxpr)object0).e) && ggia.i(this.f, ((bxpr)object0).f) && this.g.equals(((bxpr)object0).g) && this.h.equals(((bxpr)object0).h) : false;
            }
            return account0.equals(((bxpr)object0).c) ? this.d.equals(((bxpr)object0).d) && this.e.equals(((bxpr)object0).e) && ggia.i(this.f, ((bxpr)object0).f) && this.g.equals(((bxpr)object0).g) && this.h.equals(((bxpr)object0).h) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ this.b.hashCode();
        return this.c == null ? this.h.hashCode() ^ ((((v * 1000003 * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 : this.h.hashCode() ^ (((((v * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Request{enableFilePicker=" + this.a + ", url=" + this.b + ", account=" + this.c + ", errorCallback=" + this.d + ", successCallback=" + this.e + ", cookies=" + this.f + ", allowlistedRegex=" + this.g + ", allowlistedPermissions=" + this.h + "}";
    }
}

