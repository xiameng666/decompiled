import android.accounts.Account;
import j..util.Objects;

public final class ermm {
    public final Account a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ermm(Account account0, int v, int v1, int v2, boolean z, boolean z1) {
        this.a = account0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ermm) && this.b == ((ermm)object0).b && this.c == ((ermm)object0).c && this.d == ((ermm)object0).d && this.e == ((ermm)object0).e && this.f == ((ermm)object0).f && Objects.equals(this.a, ((ermm)object0).a);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b), ((int)this.c), ((int)this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }
}

