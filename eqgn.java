import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class eqgn {
    static final long a;
    public static final baun b;
    CountDownLatch c;
    private static volatile eqgn d;
    private long e;
    private final ajes f;
    private final cchj g;
    private final Map h;

    static {
        eqgn.a = TimeUnit.MINUTES.toMillis(10L);
        eqgn.b = new erqc(new String[]{"D2D", "EnrollmentChecker"});
    }

    private eqgn(Context context0) {
        ajes ajes0 = new ajes(context0.getApplicationContext());
        cchj cchj0 = cchj.b(context0.getApplicationContext());
        super();
        batl.s(context0);
        this.f = ajes0;
        this.g = cchj0;
        this.h = new HashMap();
    }

    final long a() {
        long v2;
        long v1;
        synchronized(this) {
            v1 = System.currentTimeMillis() - this.e;
            v2 = hyim.a.e().d();
            if(v1 >= ((long)(((int)v2)))) {
                return 0L;
            }
        }
        return ((long)(((int)v2))) - v1;
    }

    public static eqgn b(Context context0) {
        if(eqgn.d == null) {
            Class class0 = eqgn.class;
            synchronized(class0) {
                if(eqgn.d == null) {
                    eqgn.d = new eqgn(context0);
                }
            }
            return eqgn.d;
        }
        return eqgn.d;
    }

    public final void c() {
        batl.k("Should not await on main thread!");
        CountDownLatch countDownLatch0 = this.c;
        if(countDownLatch0 != null) {
            try {
                if(!countDownLatch0.await(this.a(), TimeUnit.MILLISECONDS)) {
                    eqgn.b.f("Timed out waiting Cryptauth", new Object[0]);
                }
            }
            catch(InterruptedException interruptedException0) {
                eqgn.b.l(interruptedException0);
            }
        }
        this.c = null;
    }

    public final void d() {
        List list0 = Arrays.asList(this.g.p("com.google"));
        this.e(list0);
        this.f(list0);
    }

    public final boolean e(List list0) {
        boolean z;
        synchronized(this) {
            baun baun0 = eqgn.b;
            baun0.j("Enrolling accounts", new Object[0]);
            CountDownLatch countDownLatch0 = new CountDownLatch(list0.size());
            long v1 = System.currentTimeMillis();
            z = false;
            for(Object object0: list0) {
                Account account0 = (Account)object0;
                if("com.google".equals(account0.type)) {
                    Map map0 = this.h;
                    if(map0.containsKey(account0.name) && v1 - ((long)(((Long)map0.get(account0.name)))) < eqgn.a) {
                        countDownLatch0.countDown();
                    }
                    else {
                        baun0.j("Enrolling %s", new Object[]{account0.name});
                        map0.put(account0.name, Long.valueOf(v1));
                        this.g(countDownLatch0, account0, false);
                        z = true;
                    }
                }
                else {
                    countDownLatch0.countDown();
                }
            }
            this.e = System.currentTimeMillis();
            this.c = countDownLatch0;
        }
        return z;
    }

    public final boolean f(List list0) {
        boolean z = false;
        synchronized(this) {
            if(hyhp.j()) {
                return false;
            }
            baun baun0 = eqgn.b;
            baun0.j("Enrolling accounts for Fido", new Object[0]);
            CountDownLatch countDownLatch0 = new CountDownLatch(list0.size());
            for(Object object0: list0) {
                Account account0 = (Account)object0;
                if("com.google".equals(account0.type)) {
                    baun0.j("Enrolling %s", new Object[]{account0.name});
                    z = true;
                    this.g(countDownLatch0, account0, true);
                }
                else {
                    countDownLatch0.countDown();
                }
            }
            this.e = System.currentTimeMillis();
            this.c = countDownLatch0;
        }
        return z;
    }

    private final void g(CountDownLatch countDownLatch0, Account account0, boolean z) {
        ArrayList arrayList0 = ggia.d(new String[]{"PublicKey", "authzen"});
        if(z) {
            arrayList0 = ggia.d(new String[]{"fido:android_software_key", "fido:android_software_key_cable_lk", "fido:android_software_key_cable_irk"});
        }
        this.f.i(4, arrayList0, "ForceRegistration", account0, null).z(new eqgm(this, account0, countDownLatch0));
    }
}

