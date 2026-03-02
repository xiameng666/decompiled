import android.accounts.Account;
import com.google.android.gms.pay.DataChangeListenerResponse;

public final class dnon extends lqd implements dmqb, esek {
    public static final bboh a;
    public long h;
    private final Account i;
    private edlu j;
    private edlw k;
    private boolean l;
    private final etgl m;
    private final azts n;

    static {
        dnon.a = bboh.b("Pay", bbcu.cZ);
    }

    public dnon(azts azts0, etgl etgl0, Account account0) {
        this.i = account0;
        this.m = etgl0;
        this.n = azts0;
        this.l = false;
    }

    @Override  // esek
    public final void af() {
        this.b(1);
    }

    private final void b(int v) {
        evql evql0 = this.n.aK(this.i, v);
        evql0.b(new dnok(this));
        evql0.A(new dnol());
    }

    @Override  // lqd
    protected final void c() {
        this.j = new edlu(this);
        this.k = new edlw(this);
        this.h = System.currentTimeMillis();
        this.n.bC(this.i, 5, this.j);
        this.m.dc(this.k);
        if(this.l) {
            this.b(3);
        }
        else {
            this.b(5);
        }
        this.l = true;
    }

    @Override  // lqd
    protected final void d() {
        this.n.bE(5, this.j);
        this.m.dd(this.k);
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        this.b(1);
    }
}

