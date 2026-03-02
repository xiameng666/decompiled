import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;

public abstract class eznd extends cjtm {
    private long a;
    protected final Context c;
    protected final ezpn d;
    protected final baqr e;
    protected final String f;
    protected final Account g;
    protected final String h;
    protected boolean i;
    protected final ezts j;

    public eznd(Context context0, ezpn ezpn0, baqr baqr0, String s, String s1) {
        super(35, s1);
        batl.s(context0);
        this.c = context0;
        batl.s(ezpn0);
        this.d = ezpn0;
        batl.s(baqr0);
        this.e = baqr0;
        this.g = baqr0.b;
        ezts ezts0 = null;
        String s2 = baqr0.b == null ? null : baqr0.b.name;
        this.f = s2;
        this.h = s;
        if(s2 != null) {
            ezts0 = new ezts(context0, s2);
        }
        this.j = ezts0;
        this.i = false;
    }

    @Override  // cjtm
    protected void f(Context context0) {
        if(this.g != null && this.f != null) {
            return;
        }
        throw new cjuh(8, "No account provided");
    }

    protected final void h() {
        this.a = SystemClock.elapsedRealtime();
    }

    protected final void i(int v) {
        ezts ezts0 = this.j;
        if(ezts0 != null && (!this.i || Math.random() < hzcw.a.b().a())) {
            long v1 = SystemClock.elapsedRealtime() - this.a;
            if(v <= 0) {
                ezts0.a(this.h, this.q(), v1, v, true);
                return;
            }
            ezts0.a(this.h, this.q(), v1, v, false);
        }
    }

    protected final String k() {
        return acso.e(this.c, this.f);
    }
}

