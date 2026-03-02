import android.accounts.Account;
import java.util.Arrays;

public final class aqcr implements azsu, azsw {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final Account f;
    public String g;

    public aqcr(String s, int v, String s1, String s2, int v1, Account account0) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = v1;
        this.f = account0;
    }

    public static aqcr a(String s, Account account0) {
        batl.q(s);
        return new aqcr(s, 0, null, null, -1, account0);
    }

    public final void b(String s) {
        if(this.g == null) {
            this.g = s;
        }
    }

    public static aqcr c(Account account0) {
        batl.q("com.google.android.gms.udc");
        return new aqcr("com.google.android.gms.udc", 1, null, null, -1, account0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.b == ((aqcr)object0).b && this.e == ((aqcr)object0).e && bata.b(this.a, ((aqcr)object0).a) && bata.b(this.c, ((aqcr)object0).c) && bata.b(this.d, ((aqcr)object0).d) && bata.b(this.f, ((aqcr)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, this.d, ((int)this.e), this.f});
    }
}

