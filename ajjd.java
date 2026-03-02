import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ajjd {
    public static final gfud a;
    public final List b;
    public final String c;
    public final Account d;
    public final List e;
    public final byte[] f;
    public final ajfq g;
    public final ajje h;
    public final ajfy i;
    public final baun j;
    private final Context k;
    private final int l;
    private final byte[] m;
    private final byte[] n;
    private final List o;
    private final ajji p;
    private final ajjf q;
    private final ajfk r;
    private final esaa s;

    static {
        ajjd.a = gfud.e(',');
    }

    public ajjd(Context context0, int v, List list0, String s, Account account0, List list1, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, List list2) {
        this.j = new baun(new String[]{"EnrollKeyName"}, null);
        this.k = context0;
        this.l = v;
        this.b = list0;
        this.c = s;
        this.d = account0;
        this.e = list1;
        this.m = arr_b1;
        this.n = arr_b2;
        this.o = list2;
        this.f = arr_b;
        this.g = new ajfq(context0);
        this.p = ajjh.a(context0);
        this.h = new ajje(context0);
        this.i = new ajfy(context0);
        this.r = new ajfk(context0, account0);
        this.q = new ajjf(s, context0);
        this.s = new esaa(context0, 1, "CryptauthEnroller", null, "com.google.android.gms");
    }

    public final ygm a(List list0) {
        ygm ygm0;
        ajjb ajjb0;
        boolean z;
        List list1;
        if(list0.isEmpty()) {
            ygk ygk0 = new ygk();
            ygk0.a = ygl.c;
            return ygk0.a();
        }
        Context context0 = this.k;
        ajit ajit0 = new ajit(context0, 0, 5);
        if(hpta.a.g().n()) {
            list1 = this.g.c(this.d.name);
        }
        else {
            list1 = new ArrayList();
            list1.add(this.f);
        }
        this.s.c(30000L);
        ajjc ajjc0 = new ajjc(context0, this.d, ajit0);
        long v = SystemClock.elapsedRealtime();
        try {
            ygh ygh0 = new ygh();
            ygh0.d(list0);
            ygh0.b(this.d.name);
            ygh0.c();
            ygh0.c = this.p.a(list1).toBytesArray();
            ygh0.i = ajjc0;
            ygh0.j = new ajfn(context0);
            ygh0.d = this.m;
            ygh0.e = this.n;
            ygh0.f = this.e == null || this.e.isEmpty() ? null : ((byte[])this.e.get(0));
            ygh0.g = this.o;
            ygh0.b = this.n != null;
            ygh0.h = this.g;
            ygh0.k = this.r;
            ygh0.a = ajjl.a(this.l);
            ajjf ajjf0 = this.q;
            String s = this.d.name;
            if(ajjd.a.d().n(hpsu.a.b().a()).contains(ajjf0.a)) {
                ajit0.d = 3;
                goto label_55;
            }
            else if(hptw.a.b().b()) {
                ajit0.d = 2;
                z = false;
            }
            else {
                try {
                    ajjb0 = ajjf0.b.i("authzen", s);
                }
                catch(ajiv ajiv0) {
                    ajjf0.c.n("No authzen symmetric key found", ajiv0, new Object[0]);
                    ajit0.d = 7;
                    goto label_55;
                }
                ajja ajja0 = ajjb0.b;
                long v2 = System.currentTimeMillis();
                if(ajja0.c >= v2) {
                    ajit0.d = 5;
                label_55:
                    z = true;
                }
                else if(ajja0.d <= v2) {
                    ajit0.d = 4;
                    goto label_55;
                }
                else {
                    ajit0.d = 2;
                    z = false;
                }
            }
            ygh0.e(z);
            blro blro0 = new blro(this.k, 5000L);
            ygh0.l = new ajfm(this.m, this.n, blro0, this.k, this.j);
            ygh0.m = new baun(new String[]{"EnrollCryptauthFramework"}, null);
            ygm0 = ajjg.a(ygh0.a());
            long v3 = SystemClock.elapsedRealtime() - v;
            ajit0.b = ygm0.a.p;
            ajit0.a(2, v3);
        }
        catch(ygj ygj0) {
            this.j.n("Enrollment run failed: ", ygj0, new Object[0]);
            ygl ygl0 = ygj0.a;
            ajit0.b = ygl0.p;
            ajit0.a(2, SystemClock.elapsedRealtime() - v);
            if(ygl0.q) {
                this.c(list0);
                ygk ygk1 = new ygk();
                ygk1.a = ygl0;
                return ygk1.a();
            }
            this.c(list0);
            throw ygj0;
        }
        catch(ajgo unused_ex) {
            this.c(list0);
            ygk ygk2 = new ygk();
            ygk2.a = ygl.l;
            ygm0 = ygk2.a();
        }
        finally {
            esaa esaa0 = this.s;
            if(esaa0.l()) {
                esaa0.g();
            }
            ajjc0.b();
        }
        return ygm0;
    }

    public final ygm b() {
        this.j.h("ClientName requesting CustomKey is %s", new Object[]{this.c});
        return this.a(this.b);
    }

    private final void c(List list0) {
        if(this.m != null) {
            return;
        }
        this.i.a(this.d.name, list0);
        ajje ajje0 = new ajje(this.k);
        long v = hpta.d();
        String s = String.valueOf(this.d.name);
        long v1 = v + TimeUnit.DAYS.toMillis(1L);
        ajje0.b.d("schedule OneTime directive : start=%d, end=%d", new Object[]{v, v1});
        ajje0.b("OneTimeTag_" + s, this.d.name, ajje.a, v, v1, false);
    }
}

