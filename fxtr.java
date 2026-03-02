import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class fxtr implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static boolean a;
    public static final Object b;
    public final fxtw c;
    public final fxtu d;
    public final fvrv e;
    public final fxub f;
    public final Map g;
    public final Map h;
    public final Context i;
    public List j;
    private static WeakReference k;
    private final Random l;
    private final fxup m;
    private final Executor n;

    static {
        fxtr.k = new WeakReference(null);
        fxtr.a = false;
        fxtr.b = new Object();
    }

    private fxtr(fxtw fxtw0, fxtu fxtu0, fxub fxub0, fvrv fvrv0, Random random0, Context context0, fxup fxup0, Executor executor0) {
        this.j = null;
        this.c = fxtw0;
        this.d = fxtu0;
        this.f = fxub0;
        this.e = fvrv0;
        this.l = random0;
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = context0;
        this.m = fxup0;
        this.n = executor0;
        fxtw0.b.registerOnSharedPreferenceChangeListener(this);
        fxtu0.a.registerOnSharedPreferenceChangeListener(this);
        this.j = new ArrayList();
        Account[] arr_account = fvrv0.b();
        for(int v = 0; v < arr_account.length; ++v) {
            this.j.add(new fxtz(arr_account[v], this.d));
        }
        if(this.d.a.getInt("disable_ulr_key", -1) == -1) {
            this.n();
        }
    }

    public final int a(Account account0) {
        Integer integer0;
        this.e(account0);
        synchronized(fxtr.b) {
            fxtu fxtu0 = this.d;
            integer0 = fxtu0.c(account0);
            if(integer0 == null) {
                int v1 = this.l.nextInt();
                Integer integer1 = v1;
                if(fxtr.a) {
                    fxqw.d(0x10001, a.i(integer1, "Create new device tag of ", " after device reboot."));
                    fxtr.a = false;
                }
                else {
                    fxqw.d(0x10002, a.i(integer1, "Create new device tag of ", " without device reboot"));
                }
                integer1.getClass();
                if(fxtu0.c(account0) != null) {
                    fxqw.m(22, "Assigning new device tag to account " + cnug.a(account0) + " with existing device tag.");
                }
                String s = fxtu.g(account0);
                SharedPreferences.Editor sharedPreferences$Editor0 = fxtu0.a.edit();
                sharedPreferences$Editor0.putInt(s, v1);
                sharedPreferences$Editor0.apply();
                this.g(account0);
                if(fxtu0.c(account0) == null) {
                    fxqw.d(0x10000, "GcmId shared preference save error for account " + cnug.a(account0));
                }
                else {
                    int v2 = (int)fxtu0.c(account0);
                    integer1.getClass();
                    if(v2 != v1) {
                        fxqw.d(0x10000, "GcmId shared preference save error for account " + cnug.a(account0));
                    }
                }
                integer0 = integer1;
            }
        }
        return (int)integer0;
    }

    public static fxtr b(Context context0) {
        fxtr fxtr0;
        Context context1;
        synchronized(fxtr.b) {
            fxtr0 = (fxtr)fxtr.k.get();
            if(fxtr0 == null) {
                fxup fxup0 = new fxup(context0);
                fvru fvru0 = fvru.a(context0);
                fxub fxub0 = new fxub(context0);
                fxtw fxtw0 = new fxtw(context0, context0.getSharedPreferences("ULR_USER_PREFS", 0), fxub0, fvru0);
                fxtu fxtu0 = fxtu.a(context0);
                bbll bbll0 = new bbll(1, 10);
                context1 = context0;
                fxtr fxtr1 = new fxtr(fxtw0, fxtu0, fxub0, fvru0, new Random(), context1, fxup0, bbll0);
                fxtr.k = new WeakReference(fxtr1);
                fxtr0 = fxtr1;
            }
            else {
                context1 = context0;
            }
            fxtr0.o(context1);
        }
        return fxtr0;
    }

    public final AccountConfig c(Account account0) {
        AccountConfig accountConfig0;
        this.e(account0);
        int v = this.a(account0);
        synchronized(fxtr.b) {
            Map map0 = this.h;
            Integer integer0 = v;
            accountConfig0 = (AccountConfig)map0.get(integer0);
            if(accountConfig0 == null) {
            label_14:
                fxtx fxtx0 = new fxtx(account0);
                this.c.y(account0, fxtx0);
                String s = fxtu.h(account0);
                SharedPreferences sharedPreferences0 = this.d.a;
                Long long0 = null;
                fxtx0.p = sharedPreferences0.contains(s) ? sharedPreferences0.getLong(s, 0L) : null;
                String s1 = fxtu.j(account0);
                if(sharedPreferences0.contains(s1)) {
                    long0 = sharedPreferences0.getLong(s1, 0L);
                }
                fxtx0.q = long0;
                fxtx0.a(sharedPreferences0.getBoolean(fxtu.f(account0), true));
                fxtx0.b(v);
                AccountConfig accountConfig1 = new AccountConfig(fxtx0);
                map0.put(integer0, accountConfig1);
                accountConfig0 = accountConfig1;
            }
            else {
                fxtw fxtw0 = this.c;
                boolean z = fxtw0.d.d(accountConfig0.a);
                if(accountConfig0.d == z) {
                    Conditions conditions0 = fxtw0.c.a();
                    if(!accountConfig0.m.equals(conditions0)) {
                        goto label_14;
                    }
                }
                else {
                    goto label_14;
                }
            }
        }
        return accountConfig0;
    }

    public final ReportingConfig d() {
        ArrayList arrayList0;
        this.f();
        synchronized(fxtr.b) {
            arrayList0 = new ArrayList();
            Account[] arr_account = this.e.b();
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                arrayList0.add(this.c(arr_account[v1]));
            }
        }
        return new ReportingConfig(arrayList0, this.f.a());
    }

    public final void e(Account account0) {
        Object object0 = fxtr.b;
        synchronized(object0) {
            if(!this.q(account0)) {
                String s = ((fvru)this.e).a.e(account0);
                if(s != null) {
                    Account account1 = new Account(s, account0.type);
                    if(this.q(account1)) {
                        fxqw.j(("Renaming account " + cnug.a(account1) + " to " + cnug.a(account0)));
                        synchronized(object0) {
                            SharedPreferences.Editor sharedPreferences$Editor0 = this.c.b.edit();
                            String s1 = fxtw.h(account1);
                            String s2 = fxtw.h(account0);
                            fxva.i(this.c.b, s1, s2, sharedPreferences$Editor0);
                            String s3 = fxtw.n(account1);
                            String s4 = fxtw.n(account0);
                            fxva.i(this.c.b, s3, s4, sharedPreferences$Editor0);
                            String s5 = fxtw.o(account1);
                            String s6 = fxtw.o(account0);
                            fxva.l(this.c.b, s5, s6, sharedPreferences$Editor0);
                            String s7 = fxtw.k(account1);
                            String s8 = fxtw.k(account0);
                            fxva.i(this.c.b, s7, s8, sharedPreferences$Editor0);
                            String s9 = fxtw.l(account1);
                            String s10 = fxtw.l(account0);
                            fxva.l(this.c.b, s9, s10, sharedPreferences$Editor0);
                            String s11 = fxtw.q(account1);
                            String s12 = fxtw.q(account0);
                            fxva.k(this.c.b, s11, s12, sharedPreferences$Editor0);
                            String s13 = fxtw.r(account1);
                            String s14 = fxtw.r(account0);
                            fxva.k(this.c.b, s13, s14, sharedPreferences$Editor0);
                            String s15 = fxtw.p(account1);
                            String s16 = fxtw.p(account0);
                            fxva.j(this.c.b, s15, s16, sharedPreferences$Editor0);
                            String s17 = fxtw.m(account1);
                            String s18 = fxtw.m(account0);
                            fxva.i(this.c.b, s17, s18, sharedPreferences$Editor0);
                            String s19 = fxtw.c(account1);
                            String s20 = fxtw.c(account0);
                            fxva.j(this.c.b, s19, s20, sharedPreferences$Editor0);
                            sharedPreferences$Editor0.apply();
                            fxtv.c(account1);
                            fxva.h(this.c.b, account1);
                            SharedPreferences.Editor sharedPreferences$Editor1 = this.d.a.edit();
                            String s21 = fxtu.g(account1);
                            String s22 = fxtu.g(account0);
                            fxva.j(this.d.a, s21, s22, sharedPreferences$Editor1);
                            String s23 = fxtu.i(account1);
                            String s24 = fxtu.i(account0);
                            fxva.k(this.d.a, s23, s24, sharedPreferences$Editor1);
                            String s25 = fxtu.h(account1);
                            String s26 = fxtu.h(account0);
                            fxva.k(this.d.a, s25, s26, sharedPreferences$Editor1);
                            String s27 = fxtu.j(account1);
                            String s28 = fxtu.j(account0);
                            fxva.k(this.d.a, s27, s28, sharedPreferences$Editor1);
                            String s29 = fxtu.f(account1);
                            String s30 = fxtu.f(account0);
                            fxva.i(this.d.a, s29, s30, sharedPreferences$Editor1);
                            sharedPreferences$Editor1.apply();
                            fxtv.c(account1);
                            fxva.h(this.d.a, account1);
                        }
                    }
                }
            }
        }
    }

    public final void f() {
        Account[] arr_account = this.e.b();
        for(int v = 0; v < arr_account.length; ++v) {
            this.e(arr_account[v]);
        }
    }

    public final void g(Account account0) {
        synchronized(fxtr.b) {
            String s = fxtu.h(account0);
            SharedPreferences sharedPreferences0 = this.d.a;
            if(sharedPreferences0.contains(s)) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                sharedPreferences$Editor0.remove(s);
                sharedPreferences$Editor0.apply();
                fxqw.c("GCoreUlr", "Cleared GCM upload time for " + cnug.a(account0));
            }
            ReportingSyncChimeraService.b(account0, this.i);
        }
    }

    public final void h(Account account0, boolean z) {
        String s = fxtw.f(account0);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.b.edit();
        sharedPreferences$Editor0.putBoolean(s, z);
        sharedPreferences$Editor0.apply();
    }

    public final void i(Account account0, boolean z) {
        String s = fxtw.g(account0);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.b.edit();
        sharedPreferences$Editor0.putBoolean(s, z);
        sharedPreferences$Editor0.apply();
    }

    public final void j(Account account0, boolean z) {
        String s = fxtw.i(account0);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.b.edit();
        sharedPreferences$Editor0.putBoolean(s, z);
        sharedPreferences$Editor0.apply();
    }

    public final boolean k(Account account0) {
        String s = fxtw.i(account0);
        return this.c.b.getBoolean(s, false);
    }

    public final boolean l(String s, fxue fxue0, String s1) {
        boolean z6;
        boolean z5;
        boolean z2;
        Object object1;
        String s2;
        Long long0;
        Boolean boolean0;
        SharedPreferences.Editor sharedPreferences$Editor0;
        boolean z;
        AccountConfig accountConfig0;
        fxtw fxtw0;
        Account account0 = fxue0.a;
        this.e(account0);
        if(hzek.l() && fxue0.d && (fxue0.f != null || fxue0.g != null)) {
            this.j(account0, true);
        }
        Object object0 = fxtr.b;
        __monitor_enter(object0);
        try {
            fxtw0 = this.c;
            accountConfig0 = fxtw0.b(account0);
            if(!accountConfig0.i()) {
                goto label_88;
            }
            else if(accountConfig0.b && !fxue0.c) {
                batl.t(fxue0.b, "update(" + s + ", " + fxue0.toString() + ") must provide referenceUpdateNumber");
                long v = accountConfig0.c;
                if(((long)fxue0.b) != v) {
                    fxqw.c("GCoreUlr", "UserPreferences.updateEditor(" + fxue0.toString() + "): aborting to preserve local change at " + v);
                    z6 = false;
                    object1 = object0;
                    goto label_95;
                }
                goto label_15;
            }
            else {
            label_15:
                z = fxue0.d;
                if(!z || accountConfig0.s != 2) {
                    sharedPreferences$Editor0 = fxtw0.b.edit();
                    long v1 = fxtw0.a(account0);
                    sharedPreferences$Editor0.putLong(fxtw.r(account0), v1 + 1L);
                    sharedPreferences$Editor0.remove(fxtv.a(account0).l);
                    boolean0 = fxue0.f;
                    if(boolean0 != null || fxue0.g != null) {
                        sharedPreferences$Editor0.putBoolean("defined", true);
                    }
                    sharedPreferences$Editor0.remove(fxtv.a(account0).h);
                    Boolean boolean1 = fxue0.m;
                    if(boolean1 != null) {
                        sharedPreferences$Editor0.putBoolean(fxtw.h(account0), boolean1.booleanValue());
                    }
                    long0 = fxue0.k;
                    if(long0 == null) {
                        goto label_34;
                    }
                    else {
                        s2 = fxtw.q(account0);
                        object1 = object0;
                        goto label_32;
                    }
                    goto label_35;
                }
                else {
                    goto label_84;
                }
            }
            goto label_95;
        }
        catch(Throwable throwable0) {
            object1 = object0;
            goto label_98;
        }
        try {
        label_32:
            sharedPreferences$Editor0.putLong(s2, long0.longValue());
            goto label_35;
        label_34:
            object1 = object0;
        label_35:
            Integer integer0 = fxue0.l;
            if(integer0 != null) {
                sharedPreferences$Editor0.putInt(fxtw.p(account0), integer0.intValue());
            }
            Boolean boolean2 = fxue0.o;
            if(boolean2 != null) {
                sharedPreferences$Editor0.putBoolean(fxtw.m(account0), boolean2.booleanValue());
            }
            Integer integer1 = fxue0.p;
            if(integer1 != null) {
                sharedPreferences$Editor0.putInt(fxtw.c(account0), integer1.intValue());
            }
            if(hzeq.h()) {
                Boolean boolean3 = fxue0.s;
                if(boolean3 != null) {
                    sharedPreferences$Editor0.putBoolean(fxtw.j(account0), boolean3.booleanValue());
                }
            }
            if(hzeq.c()) {
                Boolean boolean4 = fxue0.h;
                if(boolean4 != null) {
                    sharedPreferences$Editor0.putBoolean(fxtw.d(account0), boolean4.booleanValue());
                }
            }
            if(boolean0 == null) {
                z2 = false;
            }
            else {
                boolean z1 = boolean0.booleanValue();
                z2 = !fxtw0.u(account0) || fxtw0.x(account0) != z1;
                sharedPreferences$Editor0.putBoolean(fxtw.n(account0), z1);
            }
            boolean z3 = fxue0.j;
            if(z3) {
                sharedPreferences$Editor0.putString(fxtw.o(account0), "com.google.android.gms+not-dirty");
            }
            else if(z2) {
                sharedPreferences$Editor0.putString(fxtw.o(account0), fxue0.i);
            }
            Boolean boolean5 = fxue0.g;
            if(boolean5 == null) {
                z5 = false;
            }
            else {
                boolean z4 = boolean5.booleanValue();
                z5 = !fxtw0.t(account0) || fxtw0.w(account0) != z4;
                sharedPreferences$Editor0.putBoolean(fxtw.k(account0), z4);
            }
            if(z3) {
                sharedPreferences$Editor0.putString(fxtw.l(account0), "com.google.android.gms+not-dirty");
            }
            else if(z5) {
                sharedPreferences$Editor0.putString(fxtw.l(account0), fxue0.i);
            }
            fxtw0.s(sharedPreferences$Editor0, z, s, s1, fxue0.n);
            if(!fxue0.e && (Boolean.TRUE.equals(boolean1) && fxtw0.d.d(account0))) {
                if(z) {
                    fxva.p(fxtw0.a, fxtb.a(fxtw0.a, s, account0, boolean0, boolean5, fxue0.h, Boolean.valueOf(false), fxue0.q));
                }
                else {
                    ReportingSyncChimeraService.b(account0, fxtw0.a);
                }
            }
            z6 = true;
            goto label_95;
        }
        catch(Throwable throwable0) {
            goto label_98;
        }
        try {
        label_84:
            fxqw.d(25, "Attempted to change settings for Unicorn read-only account: " + fxue0.toString());
            z6 = false;
            object1 = object0;
            goto label_95;
        label_88:
            fxqw.i(24, "Blocking " + s + " (" + s1 + ") " + fxue0.toString() + " for " + accountConfig0.toString());
            object1 = object0;
            z6 = false;
        }
        catch(Throwable throwable0) {
            object1 = object0;
            goto label_98;
        }
        try {
        label_95:
            __monitor_exit(object1);
            goto label_100;
        label_98:
            __monitor_exit(object1);
        }
        catch(Throwable throwable0) {
            goto label_98;
        }
        throw throwable0;
    label_100:
        if(z6 && fxue0.r) {
            fxup fxup0 = this.m;
            Account account1 = fxue0.a;
            String s3 = fxue0.q;
            String s4 = fxue0.i;
            Boolean boolean6 = fxue0.g;
            Boolean boolean7 = fxue0.f;
            byte[] arr_b = null;
            if(!gfta.c(s3)) {
                try {
                    arr_b = Base64.decode(s3, 8);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    if(Log.isLoggable("GCoreUlr", 6)) {
                        Log.e("GCoreUlr", "Failed to parse AuditToken", illegalArgumentException0);
                    }
                }
            }
            grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
            gqub gqub0 = gqub.gY;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grku)hftp0.b_message).c = gqub0.mk;
            ((grku)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grjs.a).v_newBuilder();
            if(boolean6 != null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
                grno grno0 = boolean6.booleanValue() ? grno.b : grno.c;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((grnp)hftp2.b_message).c = grno0.d;
                ((grnp)hftp2.b_message).b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grjs grjs0 = (grjs)hftp1.b_message;
                grnp grnp0 = (grnp)hftp2.N_build();
                grnp0.getClass();
                grjs0.c = grnp0;
                grjs0.b |= 1;
            }
            if(boolean7 != null) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
                grno grno1 = boolean7.booleanValue() ? grno.b : grno.c;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((grnp)hftp3.b_message).c = grno1.d;
                ((grnp)hftp3.b_message).b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grjs grjs1 = (grjs)hftp1.b_message;
                grnp grnp1 = (grnp)hftp3.N_build();
                grnp1.getClass();
                grjs1.d = grnp1;
                grjs1.b |= 2;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grjs grjs2 = (grjs)hftp1.b_message;
            s4.getClass();
            grjs2.b |= 4;
            grjs2.e = s4;
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grkv grkv0 = (grkv)hftp4.b_message;
            grjs grjs3 = (grjs)hftp1.N_build();
            grjs3.getClass();
            grkv0.i = grjs3;
            grkv0.b |= 16;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grku grku0 = (grku)hftp0.b_message;
            grkv grkv1 = (grkv)hftp4.N_build();
            grkv1.getClass();
            grku0.d = grkv1;
            grku0.b |= 2;
            if(!grkf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grkf0).ensureMutable();
            }
            grkg grkg0 = (grkg)grkf0.b_message;
            grku grku1 = (grku)hftp0.N_build();
            grku1.getClass();
            grkg0.f = grku1;
            grkg0.b |= 4;
            evqp evqp0 = new evqp();
            new fxuo(evqp0, fxup0.a, account1).start();
            fxun fxun0 = new fxun(fxup0.a, grkf0, arr_b, account1);
            evqp0.a.e(fxun0).z(new fxum());
            return true;
        }
        return z6;
    }

    public final boolean m(boolean z) {
        return this.d.l(((int)z), "Location_airplane_mode_enabled_key");
    }

    public final boolean n() {
        boolean z = hzek.l();
        return this.d.l(((int)z), "disable_ulr_key");
    }

    public final boolean o(Context context0) {
        int v = cjer_LocationSettings.a(context0);
        return this.d.l(v, "location_enabled_key");
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        FutureTask futureTask0 = new FutureTask(new fxtq(this, sharedPreferences0, s), null);
        this.n.execute(futureTask0);
    }

    public final boolean p(boolean z) {
        return this.d.l(((int)z), "wifi_enabled_key");
    }

    private final boolean q(Account account0) {
        boolean z = true;
        synchronized(fxtr.b) {
            if(!this.c.v(account0)) {
                SharedPreferences sharedPreferences0 = this.d.a;
                if(!sharedPreferences0.contains(fxtu.g(account0)) && !sharedPreferences0.contains(fxtu.i(account0)) && !sharedPreferences0.contains(fxtu.h(account0)) && !sharedPreferences0.contains(fxtu.j(account0))) {
                    z = false;
                }
            }
        }
        return z;
    }
}

