import android.accounts.Account;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.SeServiceProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.Lazy;
import dagger.internal.Preconditions;
import j..time.Duration;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class ebjb implements dnqb {
    public static final TimeZone a;
    public dycb b;
    public dypo c;
    public dypz d;
    public dytd e;
    public bbng f;
    public gmcg g;
    public fhwb h;
    public fich i;
    public Lazy j;
    public Account k;
    private static final String l;
    private static final hkoy m;
    private static final hkoy n;
    private static final bboh o;

    static {
        TimeZone timeZone0 = DesugarTimeZone.getTimeZone("Asia/Tokyo");
        ibuq.e(timeZone0, "getTimeZone(...)");
        ebjb.a = timeZone0;
        ebjb.l = fsdw.j.r;
        ebjb.m = hkoy.bo;
        ebjb.n = hkoy.bp;
        ebjb.o = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        int v5;
        Instant instant2;
        gmcg gmcg0;
        dycb dycb0;
        hfwn hfwn2;
        Notification notification1;
        String s2;
        dyna dyna1;
        hkoy hkoy0;
        dylc dylc4;
        long v3;
        Instant instant1;
        AccountInfo accountInfo1;
        long v2;
        LocalDate localDate0;
        hfwn hfwn1;
        String s;
        hfwn hfwn0;
        int v;
        dymk dymk0;
        dylc dylc3;
        LinkedHashSet linkedHashSet0;
        dylf dylf1;
        Iterator iterator2;
        dytd dytd1;
        dymo dymo0;
        ArrayList arrayList0;
        ibvd ibvd0;
        if(!hwsd.M()) {
            return 0;
        }
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebjb.o.j()).x("Active account not found, skipping dagger injection.");
            return 2;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        this.i(accountInfo0, context0);
        fich fich0 = this.i;
        if(fich0 == null) {
            ibuq.j("veSloManager");
            fich0 = null;
        }
        ficj ficj0 = fich0.a(1L, TimeUnit.MINUTES);
        fhwb fhwb0 = this.e();
        fhvz fhvz0 = fhwa.a(0x41720);
        fhvz0.c(fhwp.b(accountInfo0.b));
        fhvz0.b(ficj0.a());
        fhwb0.a(fhvz0.a());
        this.h();
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant0, "ofEpochMilli(...)");
        try {
            try {
                ibvd0 = new ibvd();
                ibvd0.a = this.g(this.d());
                if(!((List)ibvd0.a).isEmpty()) {
                    arrayList0 = new ArrayList();
                    Object object0 = this.c().a().get();
                    ibuq.e(object0, "get(...)");
                    dymo0 = (dymo)object0;
                    boolean z = false;
                    Iterator iterator0 = ((List)ibvd0.a).iterator();
                label_30:
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        dylf dylf0 = (dylf)object1;
                        dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
                        ibuq.e(dylc0, "getSePrepaidCardData(...)");
                        Iterator iterator1 = ebja.a(dylc0).iterator();
                        do {
                            if(!iterator1.hasNext()) {
                                continue label_30;
                            }
                            Object object2 = iterator1.next();
                            arrayList0.add(((dymk)object2));
                        }
                        while(ebjb.k(((dymk)object2), dymo0, instant0) == 1);
                        dytd dytd0 = this.e;
                        if(dytd0 == null) {
                            ibuq.j("sePrepaidCardManager");
                            dytd1 = null;
                        }
                        else {
                            dytd1 = dytd0;
                        }
                        dylc dylc1 = dylf0.d;
                        dylc dylc2 = dylc1 == null ? dylc.a : dylc1;
                        dyna dyna0 = dyna.b(dylc2.c) == null ? dyna.k : dyna.b(dylc2.c);
                        if(dylc1 == null) {
                            dylc1 = dylc.a;
                        }
                        evrg.n(dytd1.h(dyna0, (dylc1.i == null ? dyih.a : dylc1.i).c, 5, 1, 1));
                        z = true;
                    }
                    if(z) {
                        goto label_55;
                    }
                    else {
                        goto label_187;
                    }
                    goto label_201;
                }
                goto label_209;
            }
            catch(ExecutionException executionException0) {
                goto label_213;
            }
            catch(InterruptedException interruptedException0) {
                goto label_219;
            }
            try {
            label_55:
                arrayList0.clear();
                ibvd0.a = this.g(this.d());
                iterator2 = ((List)ibvd0.a).iterator();
                while(true) {
                label_58:
                    if(!iterator2.hasNext()) {
                        goto label_187;
                    }
                    Object object3 = iterator2.next();
                    dylf1 = (dylf)object3;
                    linkedHashSet0 = new LinkedHashSet();
                    dylc3 = dylf1.d;
                    if(dylc3 == null) {
                        break;
                    }
                    goto label_65;
                }
            }
            catch(ExecutionException executionException0) {
                goto label_87;
            }
            catch(InterruptedException interruptedException0) {
                goto label_91;
            }
            try {
                dylc3 = dylc.a;
            }
            catch(ExecutionException executionException0) {
                goto label_213;
            }
            catch(InterruptedException interruptedException0) {
                goto label_219;
            }
            try {
            label_65:
                ibuq.e(dylc3, "getSePrepaidCardData(...)");
                Iterator iterator3 = ebja.a(dylc3).iterator();
                while(true) {
                label_67:
                    if(!iterator3.hasNext()) {
                        goto label_186;
                    }
                    Object object4 = iterator3.next();
                    dymk0 = (dymk)object4;
                    arrayList0.add(dymk0);
                    v = ebjb.k(dymk0, dymo0, instant0);
                    if(v != 1) {
                        hfwn0 = dymk0.f;
                        if(hfwn0 == null) {
                            break;
                        }
                        goto label_76;
                    }
                    goto label_184;
                }
            }
            catch(ExecutionException executionException0) {
                goto label_87;
            }
            catch(InterruptedException interruptedException0) {
                goto label_91;
            }
            try {
                hfwn0 = hfwn.a;
            }
            catch(ExecutionException executionException0) {
                goto label_213;
            }
            catch(InterruptedException interruptedException0) {
                goto label_219;
            }
            try {
            label_76:
                long v1 = hfyn.b(hfwn0);
                s = new edmp().b().d().g(context0, v1);
                ibuq.e(s, "format(...)");
                hfwn1 = dymk0.f;
                if(hfwn1 == null) {
                    goto label_81;
                }
                goto label_82;
            }
            catch(ExecutionException executionException0) {
                goto label_87;
            }
            catch(InterruptedException interruptedException0) {
                goto label_91;
            }
            try {
            label_81:
                hfwn1 = hfwn.a;
            }
            catch(ExecutionException executionException0) {
                goto label_213;
            }
            catch(InterruptedException interruptedException0) {
                goto label_219;
            }
            try {
            label_82:
                localDate0 = Instant.ofEpochMilli(hfyn.b(hfwn1)).atZone(DesugarTimeZone.a(ebjb.a)).toLocalDate();
                v2 = hwsd.b();
                accountInfo1 = accountInfo0;
                goto label_94;
            }
            catch(ExecutionException executionException0) {
            }
            catch(InterruptedException interruptedException0) {
                goto label_91;
            }
            try {
            label_87:
                instant1 = instant0;
                accountInfo1 = accountInfo0;
                goto label_196;
            label_91:
                instant1 = instant0;
                accountInfo1 = accountInfo0;
                goto label_199;
            }
            catch(ExecutionException executionException0) {
                goto label_196;
            }
            catch(InterruptedException interruptedException0) {
                goto label_199;
            }
            try {
            label_94:
                v3 = Duration.between(instant0, localDate0.atTime(((int)v2), ((int)hwsd.c())).atZone(DesugarTimeZone.a(ebjb.a)).toInstant()).toSeconds();
                if(linkedHashSet0.contains(s)) {
                    goto label_178;
                }
                else {
                    linkedHashSet0.add(s);
                    dylc4 = dylf1.d;
                    if(dylc4 == null) {
                        dylc4 = dylc.a;
                    }
                    ibuq.e(dylc4, "getSePrepaidCardData(...)");
                    hkoy0 = v == 2 ? ebjb.m : ebjb.n;
                    dyna1 = dyna.b(dylc4.c);
                    if(dyna1 == null) {
                        dyna1 = dyna.k;
                    }
                    instant1 = instant0;
                    goto label_116;
                }
                goto label_184;
            }
            catch(ExecutionException executionException0) {
            }
            catch(InterruptedException interruptedException0) {
                goto label_114;
            }
            try {
                instant1 = instant0;
                goto label_196;
            label_114:
                instant1 = instant0;
                goto label_199;
            label_116:
                int v4 = (dyna1.name() + dylc4.d + s).hashCode();
                String s1 = ebjb.l;
                juo juo0 = new juo(context0, s1);
                juo0.s(0x7F080C5D);  // drawable:quantum_gm_ic_wallet_vd_theme_24
                dyna dyna2 = dyna.b(dylc4.c) == null ? dyna.k : dyna.b(dylc4.c);
                ibuq.e(dyna2, "getServiceProvider(...)");
                switch(dyna2.ordinal()) {
                    case 4: {
                        s2 = context0.getString(dzdm.c.m);
                        ibuq.e(s2, "getString(...)");
                        break;
                    }
                    case 7: {
                        s2 = context0.getString(dzdm.e.m);
                        ibuq.e(s2, "getString(...)");
                        break;
                    }
                    default: {
                        s2 = "";
                    }
                }
                juo0.D(context0.getString(0x7F152116, new Object[]{s2}));  // string:pay_se_commuter_pass_renewal_notification_title "%1$s commuter pass expires 
                                                                           // soon"
                juo0.k(context0.getString(0x7F152115, new Object[]{s}));  // string:pay_se_commuter_pass_renewal_notification_content "Renew before %1$s"
                SeServiceProvider seServiceProvider0 = dypl.a((dyna.b(dylc4.c) == null ? dyna.k : dyna.b(dylc4.c)));
                String s3 = (dylc4.i == null ? dyih.a : dylc4.i).c;
                ibuq.e(s3, "getCid(...)");
                dmqz dmqz0 = new dmqz();
                Account account0 = this.k;
                if(account0 == null) {
                    ibuq.j("account");
                    account0 = null;
                }
                dmqz0.d(account0);
                dmqz0.i(seServiceProvider0);
                dmqz0.h(s3);
                dmqz0.e(0x2F);
                Intent intent0 = dmqz0.c();
                gkbx gkbx0 = gkbw.a(((ProtoLiteMessage)gjdg.a).v_newBuilder());
                gkbx0.c(hkoy0);
                gkbx0.e("commuter_pass_renewal");
                gkbx0.d(v4);
                gkbx0.b(s1);
                gjdg gjdg0 = gkbx0.a();
                ibuq.c(intent0);
                fsdz.a(intent0, 0, gjdg0, new fsef(fsee.a));
                juo0.h = intent0 == null ? null : fqaw.a(context0, 0, intent0, 0xC000000);
                juo0.h(true);
                juo0.S = true;
                juo0.N = v3;
                if(hwnj.r()) {
                    Notification notification0 = juo0.a();
                    ibuq.e(notification0, "build(...)");
                    notification1 = fsdy.a(context0, notification0);
                }
                else {
                    notification1 = juo0.a();
                    ibuq.c(notification1);
                }
                fsdx fsdx0 = hwnj.v() ? new fsdx(notification1, null) : new fsdx(notification1, gfny.c);
                Lazy lazy0 = this.j;
                if(lazy0 == null) {
                    ibuq.j("walletNotificationDelegateStarterLazy");
                    lazy0 = null;
                }
                ((cjlv)lazy0.get()).i("commuter_pass_renewal", v4, fsdx0, hkoy0);
                arrayList0 = arrayList0;
                ibvd0 = ibvd0;
                dymo0 = dymo0;
                instant0 = instant1;
                accountInfo0 = accountInfo1;
                iterator2 = iterator2;
                dylf1 = dylf1;
                goto label_67;
            label_178:
                iterator2 = iterator2;
                arrayList0 = arrayList0;
                ibvd0 = ibvd0;
                dymo0 = dymo0;
                accountInfo0 = accountInfo1;
                goto label_67;
            label_184:
                arrayList0 = arrayList0;
                goto label_67;
            }
            catch(ExecutionException executionException0) {
                goto label_196;
            }
            catch(InterruptedException interruptedException0) {
                goto label_199;
            }
        }
        catch(Throwable throwable0) {
            goto label_229;
        }
    label_186:
        goto label_58;
        try {
        label_187:
            instant1 = instant0;
            accountInfo1 = accountInfo0;
            hfwn2 = hfyn.h(instant1.toEpochMilli() - Duration.ofHours(hwsd.a.E().b()).toMillis());
            ibuq.e(hfwn2, "fromMillis(...)");
            dycb0 = this.c();
            gmcg0 = this.f();
            instant2 = instant1;
            goto label_201;
        }
        catch(ExecutionException executionException0) {
        label_196:
            instant2 = instant1;
            goto label_215;
        }
        catch(InterruptedException interruptedException0) {
        label_199:
            instant2 = instant1;
            goto label_221;
            try {
            label_201:
                ((glyq)dycb0.b(gmcg0, new ebiy(instant2, arrayList0, ibvd0, hfwn2, context0))).u();
                ficj0.c(0);
                v5 = 0;
                goto label_224;
            }
            catch(ExecutionException executionException0) {
            }
            catch(InterruptedException interruptedException0) {
                goto label_208;
            }
            catch(Throwable throwable0) {
                goto label_229;
            }
            goto label_215;
        label_208:
            goto label_221;
            try {
                try {
                label_209:
                    ((glyq)this.c().b(this.f(), new ebix(instant0))).u();
                    ficj0.c(5);
                    goto label_231;
                }
                catch(ExecutionException executionException0) {
                label_213:
                    instant2 = instant0;
                    accountInfo1 = accountInfo0;
                label_215:
                    ficj0.c(13);
                    ((ggtj)((ggtj)ebjb.o.j()).s(executionException0)).x("Failed to check and notify for commuter pass renewal.");
                    goto label_223;
                }
                catch(InterruptedException interruptedException0) {
                label_219:
                    instant2 = instant0;
                    accountInfo1 = accountInfo0;
                }
            label_221:
                ficj0.c(10);
                ((ggtj)((ggtj)ebjb.o.j()).s(interruptedException0)).x("Interrupted while checking and notifying for commuter pass renewal.");
            }
            catch(Throwable throwable0) {
                goto label_229;
            }
        label_223:
            v5 = 2;
        label_224:
            ficj0.close();
            ibuq.e(accountInfo1.b, "getAccountName(...)");
            this.j(context0, instant2, accountInfo1.b, true);
            return v5;
        }
        catch(Throwable throwable0) {
        label_229:
            TWR.safeClose$NT(ficj0, throwable0);
            throw throwable0;
        }
    label_231:
        ficj0.close();
        return 0;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        if(!hwsd.M()) {
            return;
        }
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebjb.o.j()).x("Active account not found, skipping dagger injection.");
            return;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        this.i(accountInfo0, context0);
        ibvc ibvc0 = new ibvc();
        this.h();
        ibvc0.a = System.currentTimeMillis();
        if(this.g(this.d()).isEmpty()) {
            ((glyq)this.c().b(this.f(), new ebiz(ibvc0))).u();
            return;
        }
        Instant instant0 = Instant.ofEpochMilli(ibvc0.a);
        ibuq.e(instant0, "ofEpochMilli(...)");
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        this.j(context0, instant0, accountInfo0.b, false);
    }

    public final dycb c() {
        dycb dycb0 = this.b;
        if(dycb0 != null) {
            return dycb0;
        }
        ibuq.j("secureElementMyCommuteDataStore");
        return null;
    }

    public final dypo d() {
        dypo dypo0 = this.c;
        if(dypo0 != null) {
            return dypo0;
        }
        ibuq.j("sePrepaidCardDataStore");
        return null;
    }

    public final fhwb e() {
        fhwb fhwb0 = this.h;
        if(fhwb0 != null) {
            return fhwb0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final gmcg f() {
        gmcg gmcg0 = this.g;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final List g(dypo dypo0) {
        ibuq.f(dypo0, "<this>");
        List list0 = ibpo.g(new dyna[]{dyna.e, dyna.h});
        List list1 = new ArrayList();
        for(Object object0: list0) {
            dypz dypz0 = this.d;
            if(dypz0 == null) {
                ibuq.j("seTosAcceptanceDatastore");
                dypz0 = null;
            }
            ggeo ggeo0 = dypz0.a(((dyna)object0));
            gged_interceptors gged0 = dypo0.b(((dyna)object0));
            ibuq.e(gged0, "getAllSePrepaidCardData(...)");
            ArrayList arrayList0 = new ArrayList();
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object1 = ggqk0.next();
                dylc dylc0 = ((dylf)object1).d;
                if(dylc0 == null) {
                    dylc0 = dylc.a;
                }
                dylm dylm0 = (dylm)ggeo0.get(dylc0.d);
                if(dylm0 != null && dyln.b(dylm0.d) == 4) {
                    arrayList0.add(object1);
                }
            }
            ibpo.D(list1, arrayList0);
        }
        return list1;
    }

    public final void h() {
        if(this.f != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void i(AccountInfo accountInfo0, Context context0) {
        done done0 = new done();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        edop edop0 = new edop();
        Context context1 = AppContextProvider.a();
        ibuq.e(context1, "getApplicationContext(...)");
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        ibuq.e(accountInfo0.a, "getAccountId(...)");
        new ebju(dlmg.a(context1, accountInfo0.b, accountInfo0.a), new dmgr("com.google.android.gms"), done0, domv0, edop0).inject(this);
    }

    private final void j(Context context0, Instant instant0, String s, boolean z) {
        LocalDateTime localDateTime0 = instant0.atZone(DesugarTimeZone.a(ebjb.a)).toLocalDate().atStartOfDay();
        ibuq.e(localDateTime0, "atStartOfDay(...)");
        Instant instant1 = localDateTime0.plusHours(hwsd.d()).plusMinutes(hwsd.e()).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant1, "toInstant(...)");
        Instant instant2 = localDateTime0.plusHours(hwsd.b()).plusMinutes(hwsd.c()).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant2, "toInstant(...)");
        if(z || instant0.isAfter(instant2)) {
            instant1 = instant1.plus(Duration.ofDays(1L));
            ibuq.e(instant1, "plus(...)");
            instant2 = instant2.plus(Duration.ofDays(1L));
            ibuq.e(instant2, "plus(...)");
        }
        long v = Math.max(0L, Duration.between(instant0, instant1).toSeconds());
        long v1 = Duration.between(instant0, instant2).toSeconds();
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("felica.emoney.commuterpass.renewal.notification");
        clkn0.e(v, v1);
        clkn0.y(0, 1);
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
        fhwb fhwb0 = this.e();
        fhvz fhvz0 = fhwa.a(0x418E6);
        fhvz0.c(fhwp.b(s));
        fhwb0.a(fhvz0.a());
    }

    private static final int k(dymk dymk0, dymo dymo0, Instant instant0) {
        long v;
        Instant instant1 = dymo0.d.contains(dymk0) ? Instant.ofEpochMilli(hfyn.b((dymo0.c == null ? hfwn.a : dymo0.c))) : Instant.ofEpochMilli(0L);
        ibuq.c(instant1);
        Instant instant2 = Instant.ofEpochMilli(hfyn.b((dymk0.f == null ? hfwn.a : dymk0.f))).atZone(DesugarTimeZone.a(ebjb.a)).toLocalDate().atTime(((int)hwsd.d()), ((int)hwsd.e())).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant2, "toInstant(...)");
        Instant instant3 = Instant.ofEpochMilli(hfyn.b((dymk0.f == null ? hfwn.a : dymk0.f))).atZone(DesugarTimeZone.a(ebjb.a)).toLocalDate().atTime(((int)hwsd.b()), ((int)hwsd.c())).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant3, "toInstant(...)");
        if(instant0.isAfter(instant3)) {
            return 1;
        }
        if(instant1.isBefore(instant2) && instant2.isBefore(instant0)) {
            return 3;
        }
        switch((dyna.b(dymk0.c) == null ? dyna.k : dyna.b(dymk0.c)).ordinal()) {
            case 4: {
                v = hwsd.B();
                break;
            }
            case 7: {
                v = hwsd.o();
                break;
            }
            default: {
                v = 1L;
            }
        }
        Instant instant4 = instant2.minus(Duration.ofDays(v - 1L));
        ibuq.e(instant4, "minus(...)");
        return !instant1.isBefore(instant4) || !instant4.isBefore(instant0) ? 1 : 2;
    }
}

