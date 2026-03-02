import android.accounts.Account;

public final class ddav implements ibtw {
    public final Account a;
    public final float b;
    public final boolean c;
    public final int d;
    public final int e;

    public ddav(Account account0, float f, boolean z, int v, int v1) {
        this.a = account0;
        this.b = f;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.f(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1), this.e);
        return ibom.a;
    }
}

