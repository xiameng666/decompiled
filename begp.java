import android.accounts.Account;
import java.util.ArrayList;

public final class begp {
    public static final bboh a;
    public final blpe b;
    public final boolean c;
    public final Account d;
    public final bdbk e;
    public final lqi f;
    public final lqd g;
    public final icnj h;
    public final icnl i;
    public final aysr j;

    static {
        begp.a = bboh.b("PasskeyDataRepository", bbcu.cX);
    }

    public begp(aysr aysr0, blpe blpe0, boolean z, Account account0, bdbk bdbk0) {
        this.j = aysr0;
        this.b = blpe0;
        this.c = z;
        this.d = account0;
        this.e = bdbk0;
        lqi lqi0 = new lqi();
        this.f = lqi0;
        this.g = lqi0;
        icnl icnl0 = icnm.a(null);
        this.i = icnl0;
        this.h = new icmp(icnl0);
    }

    public final lqd a(String s, evql evql0) {
        lqd lqd0 = new lqi();
        lqd0.l(new bedv(bedu.b, null, null));
        evql0.b(new begm(new begl(((lqi)lqd0))));
        evql0.A(new begn(((lqi)lqd0), s));
        evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
            if(this.c) {
                bedi bedi0 = new bedi(ggna.a, ggna.a);
                bedv bedv0 = new bedv(bedu.a, bedi0, null);
                this.f.l(bedv0);
                return evrg.d(null);
            }
            if(false) {
                bedv bedv1 = new bedv(bedu.b, null, null);
                this.f.l(bedv1);
            }
            ArrayList arrayList0 = new ArrayList();
            bblp bblp0 = new bblp(0x7FFFFFFF, 9);
            return this.b.a(bblp0, this.d, gfqx.a, gfqx.a).e(new begj(arrayList0, this)).c(new begk(this, arrayList0));
        });
        return lqd0;
    }

    public final evql b() {
        return this.c(true);
    }

    // Detected as a lambda impl.
    public final evql c(boolean z) {
        if(this.c) {
            bedi bedi0 = new bedi(ggna.a, ggna.a);
            bedv bedv0 = new bedv(bedu.a, bedi0, null);
            this.f.l(bedv0);
            return evrg.d(null);
        }
        if(z) {
            bedv bedv1 = new bedv(bedu.b, null, null);
            this.f.l(bedv1);
        }
        ArrayList arrayList0 = new ArrayList();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        return this.b.a(bblp0, this.d, gfqx.a, gfqx.a).e(new begj(arrayList0, this)).c(new begk(this, arrayList0));
    }

    public final evql d() {
        return this.c(false);
    }
}

