import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import j..time.Instant;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class fljw {
    public final flsl a;
    public final List b;
    public final Random c;
    public final Object d;
    public final Object e;
    final Map f;
    final Map g;
    public final Map h;
    public final gmcg i;
    public final flwm j;
    public final flna k;
    public final fiei l;
    public final fiej m;
    public flit n;
    public fleb o;
    private final Map p;

    public fljw(Map map0, flwm flwm0, flna flna0, fiei fiei0, fiej fiej0, flsl flsl0, fier fier0) {
        this.d = new Object();
        this.e = new Object();
        this.f = new HashMap();
        this.g = new HashMap();
        this.i = flbs.b().a;
        this.h = map0;
        this.j = flwm0;
        this.k = flna0;
        this.l = fiei0;
        this.m = fiej0;
        this.a = flsl0;
        this.b = ggia.d(new fier[]{fier0});
        this.p = new HashMap();
        this.c = new Random();
    }

    // Detected as a lambda impl.
    public final gmcd a(AccountContext accountContext0, fmbl fmbl0, int v) {
        gmcd gmcd0;
        gmcd gmcd2;
        gmcd gmcd1;
        AccountContext accountContext1 = accountContext0;
        synchronized(this.e) {
            gmcd0 = (gmcd)this.g.get(accountContext1);
            if(gmcd0 != null && !gmcd0.isDone()) {
                flbj.a("TyRegController", "RegisterRefresh already pending");
            }
            else {
                flsl flsl0 = this.a;
                fmai fmai0 = fmaj.a();
                fmai0.g(12);
                fmai0.f(v);
                fmai0.n(accountContext1.c().f());
                fmai0.o(accountContext1.d().toStringUtf8());
                flsl0.b(fmai0.a());
                if(fmbl0.c() == 1) {
                    flbj.a("TyRegController", "User has no key.");
                    fmai fmai1 = fmaj.a();
                    fmai1.g(14);
                    fmai1.f(v);
                    fmai1.n(accountContext1.c().f());
                    fmai1.o(accountContext1.d().toStringUtf8());
                    flsl0.b(fmai1.a());
                    fmai fmai2 = fmaj.a();
                    fmai2.g(10016);
                    fmai2.n(accountContext1.c().f());
                    fmai2.o(accountContext1.d().toStringUtf8());
                    flsl0.b(fmai2.a());
                    this.e(accountContext1.c().f());
                    synchronized(this.d) {
                        Long long0 = accountContext1.a();
                        this.f.remove(long0);
                    }
                    flks flks0 = flkt.a();
                    flks0.d = 3;
                    gmcd1 = gmbu.i(flks0.a());
                }
                else {
                    flqv flqv0 = flqw.a();
                    flqv0.a = "register refresh";
                    flqv0.b(flra.c);
                    flqw flqw0 = flqv0.a();
                    flwm flwm0 = this.j;
                    fiei fiei0 = this.l;
                    flba.a();
                    Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
                    ContactId contactId0 = accountContext1.c().f();
                    if(fmbl0.c() == 2) {
                        UUID uUID0 = UUID.randomUUID();
                        KeyPair keyPair0 = fmbl0.b();
                        flzd flzd0 = new flzd(accountContext1, flwm0.c, fiei0, "com.google.android.gms", keyPair0, instant0);
                        gmcd gmcd3 = flwm0.b.d.f();
                        gmcd gmcd4 = flwm0.b.g(uUID0, flzd0, gmcd3, accountContext0, fmbl0, flqw0);
                        accountContext1 = accountContext0;
                        gmcd gmcd5 = gmbu.d(new gmcd[]{gmcd4}).b(new flwk(flwm0, gmcd4, accountContext0, fiei0, fmbl0, flqw0), gmap.a);
                        gmcd2 = flwm0.b.h(gmcd5, contactId0, 7);
                    }
                    else {
                        flks flks1 = flkt.a();
                        flks1.d = 3;
                        gmcd2 = gmbu.i(flks1.a());
                    }
                    gmcd gmcd6 = glzd.f(gmcd2, new fljs(this, v, accountContext1), gmap.a);
                    gmbl gmbl0 = gmbu.b(new gmcd[]{gmcd6});
                    fljt fljt0 = new fljt(this, gmcd2, v, accountContext1, gmcd6);
                    accountContext1 = accountContext1;
                    gmcd1 = gmbl0.a(fljt0, gmap.a);
                }
                gmcd0 = gmcd1;
                this.g.put(accountContext1, gmcd0);
            }
        }
        return gmcd0;
    }

    public final gmcd b(ContactId contactId0) {
        return gmbu.n(new fljp(this, contactId0), this.i);
    }

    public final gmcd c() {
        fljg fljg0 = new fljg(this);
        return this.i.e(fljg0);
    }

    public final gmcd d(AccountContext accountContext0, boolean z) {
        gfsx gfsx0;
        synchronized(this.d) {
            Map map0 = this.f;
            gfsx0 = (gfsx)map0.get(Long.valueOf(accountContext0.a()));
            if(gfsx0 == null || !gfsx0.i()) {
                gfsx0 = this.k.g(accountContext0);
                map0.put(Long.valueOf(accountContext0.a()), gfsx0);
            }
        }
        if(!gfsx0.i()) {
            return gmbu.h(new RuntimeException("Missing Auth Token"));
        }
        fmbl fmbl0 = (fmbl)gfsx0.d();
        if(!z) {
            flba.a();
            long v1 = iadr.a.b().b();
            if(fmbl0.c() != 1 && fmbl0.c.compareTo(Instant.ofEpochMilli(System.currentTimeMillis()).plusMillis(v1)) > 0) {
                if(fljw.h(fmbl0)) {
                    gmbu.n(() -> {
                        gmcd gmcd0;
                        gmcd gmcd2;
                        gmcd gmcd1;
                        AccountContext accountContext1 = accountContext0;
                        synchronized(this.e) {
                            gmcd0 = (gmcd)this.g.get(accountContext1);
                            if(gmcd0 != null && !gmcd0.isDone()) {
                                flbj.a("TyRegController", "RegisterRefresh already pending");
                            }
                            else {
                                flsl flsl0 = this.a;
                                fmai fmai0 = fmaj.a();
                                fmai0.g(12);
                                fmai0.f(109);
                                fmai0.n(accountContext1.c().f());
                                fmai0.o(accountContext1.d().toStringUtf8());
                                flsl0.b(fmai0.a());
                                if(fmbl0.c() == 1) {
                                    flbj.a("TyRegController", "User has no key.");
                                    fmai fmai1 = fmaj.a();
                                    fmai1.g(14);
                                    fmai1.f(109);
                                    fmai1.n(accountContext1.c().f());
                                    fmai1.o(accountContext1.d().toStringUtf8());
                                    flsl0.b(fmai1.a());
                                    fmai fmai2 = fmaj.a();
                                    fmai2.g(10016);
                                    fmai2.n(accountContext1.c().f());
                                    fmai2.o(accountContext1.d().toStringUtf8());
                                    flsl0.b(fmai2.a());
                                    this.e(accountContext1.c().f());
                                    synchronized(this.d) {
                                        Long long0 = accountContext1.a();
                                        this.f.remove(long0);
                                    }
                                    flks flks0 = flkt.a();
                                    flks0.d = 3;
                                    gmcd1 = gmbu.i(flks0.a());
                                }
                                else {
                                    flqv flqv0 = flqw.a();
                                    flqv0.a = "register refresh";
                                    flqv0.b(flra.c);
                                    flqw flqw0 = flqv0.a();
                                    flwm flwm0 = this.j;
                                    fiei fiei0 = this.l;
                                    flba.a();
                                    Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
                                    ContactId contactId0 = accountContext1.c().f();
                                    if(fmbl0.c() == 2) {
                                        UUID uUID0 = UUID.randomUUID();
                                        KeyPair keyPair0 = fmbl0.b();
                                        flzd flzd0 = new flzd(accountContext1, flwm0.c, fiei0, "com.google.android.gms", keyPair0, instant0);
                                        gmcd gmcd3 = flwm0.b.d.f();
                                        gmcd gmcd4 = flwm0.b.g(uUID0, flzd0, gmcd3, accountContext0, fmbl0, flqw0);
                                        accountContext1 = accountContext0;
                                        gmcd gmcd5 = gmbu.d(new gmcd[]{gmcd4}).b(new flwk(flwm0, gmcd4, accountContext0, fiei0, fmbl0, flqw0), gmap.a);
                                        gmcd2 = flwm0.b.h(gmcd5, contactId0, 7);
                                    }
                                    else {
                                        flks flks1 = flkt.a();
                                        flks1.d = 3;
                                        gmcd2 = gmbu.i(flks1.a());
                                    }
                                    gmcd gmcd6 = glzd.f(gmcd2, new fljs(this, 109, accountContext1), gmap.a);
                                    gmbl gmbl0 = gmbu.b(new gmcd[]{gmcd6});
                                    fljt fljt0 = new fljt(this, gmcd2, 109, accountContext1, gmcd6);
                                    accountContext1 = accountContext1;
                                    gmcd1 = gmbl0.a(fljt0, gmap.a);
                                }
                                gmcd0 = gmcd1;
                                this.g.put(accountContext1, gmcd0);
                            }
                        }
                        return gmcd0;
                    }, this.i);
                    return gmbu.i(fmbl0);
                }
                return gmbu.i(fmbl0);
            }
        }
        return glzd.f(this.a(accountContext0, fmbl0, 110), new fljq(this, accountContext0), gmap.a);
    }

    public final void e(ContactId contactId0) {
        fljf fljf0 = new fljf(this, contactId0);
        this.i.d(fljf0);
    }

    public final void f(ContactId contactId0) {
        Map map0 = this.p;
        if(!map0.containsKey(contactId0)) {
            map0.put(contactId0, gmcq.b(0.01));
        }
        gmcq gmcq0 = (gmcq)map0.get(contactId0);
        long v = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        gmcq.e();
        synchronized(gmcq0.c()) {
            long v2 = gmcq0.a.a();
            if(gmcq0.e - v <= v2) {
                long v3 = gmcq0.f(v2);
                gmcp.b(v3);
                for(Object object1: this.b) {
                    SilentRegisterIntentOperation.d(new Intent("com.google.android.gms.matchstick.check_registration_with_lighter_action"), ((fier)object1).a);
                }
            }
        }
    }

    public final void g(AccountContext accountContext0, fmbl fmbl0) {
        flmz flmz0 = new flmz(this.k, accountContext0, fmbl0);
        Long long0 = (Long)flng.a(this.k.a, flmz0);
        synchronized(this.d) {
            gfsx gfsx0 = gfsx.m(fmbl0);
            this.f.put(long0, gfsx0);
        }
    }

    public static final boolean h(fmbl fmbl0) {
        flba.a();
        long v = iadr.a.b().a();
        return fmbl0.d.compareTo(Instant.ofEpochMilli(System.currentTimeMillis()).minusMillis(v)) <= 0;
    }
}

