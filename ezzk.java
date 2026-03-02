import android.content.Context;
import android.content.Intent;
import android.os.RecoverySystem;
import android.os.SystemClock;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;

public final class ezzk extends ezyn {
    public static final fagu g;
    public static final fagf h;
    public static final fagp i;
    public static final fagf j;
    public final Context k;
    private static final baun l;
    private static final ggfp m;
    private static final fagu n;
    private static final fagu o;
    private static final fagf p;
    private final ezxc q;
    private final ezxl r;
    private final ezxs s;
    private final ezyd t;
    private final fabj u;

    static {
        ezzk.l = fabk.e("NonAbRebootAction");
        ezzk.m = ggfp.K(Integer.valueOf(20), Integer.valueOf(23));
        ezzk.g = new fagu("file_path", "");
        Boolean boolean0 = Boolean.valueOf(false);
        ezzk.h = new fagf("package_processed", boolean0);
        ezzk.n = new fagu("installation_success_message", "");
        ezzk.o = new fagu("installation_failure_message", "");
        ezzk.p = new fagf("install_in_progress", boolean0);
        ezzk.i = new fagp("boot_token", ((long)-1L));
        ezzk.j = new fagf("reboot_prepared", boolean0);
    }

    public ezzk(Context context0, fagj fagj0) {
        super("non-ab-reboot", fagj0);
        this.k = context0;
        this.q = (ezxc)ezxc.c.b();
        this.r = (ezxl)ezxl.h.b();
        this.s = (ezxs)ezxs.l.b();
        this.t = (ezyd)ezyd.b.b();
        this.u = new fabj(context0);
    }

    @Override  // ezyj
    public final ezyi a() {
        ezwb ezwb0;
        ezwb ezwb1;
        this.q.e();
        ezxs ezxs0 = this.s;
        if(((Boolean)ezxs0.n.b(ezxs.k)).booleanValue()) {
            ezxs0.u(0x407, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        hlnn hlnn0 = faaa.c();
        if(ezwj.a().booleanValue() && ezwr.h(hlnn0) && !this.j()) {
            ezzk.l.h("Bypassing the self-update check.", new Object[0]);
        }
        else if(ezwr.h(hlnn0)) {
            fagu fagu0 = ezzk.n;
            if(!((String)this.c(fagu0)).isEmpty()) {
                Intent intent0 = ezxa.c(((String)this.c(fagu0)), true);
                this.k.startActivity(intent0);
            }
            gfsx gfsx0 = ezzk.g();
            if(gfsx0.i()) {
                this.h(((Map)gfsx0.d()));
            }
            ezxs0.u(5, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        if(this.j() && !ezwr.h(hlnn0)) {
            gfsx gfsx1 = ezzk.g();
            if(!gfsx1.i()) {
                goto label_25;
            }
            this.h(((Map)gfsx1.d()));
            Long long0 = (Long)((Map)gfsx1.d()).get("error");
            if(long0 == null || !ezzk.m.contains(Integer.valueOf(long0.intValue()))) {
            label_25:
                ezxs0.u(0x307, -1.0);
                fagu fagu1 = ezzk.o;
                if(!((String)this.c(fagu1)).isEmpty()) {
                    Intent intent1 = ezxa.c(((String)this.c(fagu1)), false);
                    this.k.startActivity(intent1);
                }
                return new ezyi("finished-execution", fagj.b(new fagh[0]));
            }
        }
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        if(gfta.c(systemUpdateStatus0.a)) {
            ezxs0.u(0, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        try {
            Context context0 = this.k;
            long v = this.r.c();
            long v1 = System.currentTimeMillis();
            long v2 = SystemClock.elapsedRealtime();
            long v3 = systemUpdateStatus0.n;
            ezwv ezwv0 = ezwv.a(context0, v3);
            int v4 = ezwv0.a;
            if(v4 == 3 || v4 == 4) {
                ezwb1 = new ezwb(0x610, ezwv0.b, true);
                goto label_76;
            }
            else if(ezwc.a(context0) >= ezwq.a(context0)) {
                ezww ezww0 = ezwq.g();
                if(!ezwu.c(systemUpdateStatus0) && !ezww0.g(v1) && !systemUpdateStatus0.h.b && v4 != 1 && (!hwcb.f() || ((long)ezwj.j()) != 4L || v1 - v3 < hwcb.b())) {
                    ezwb1 = new ezwb(0x510, ezww0.c(v1), true);
                    goto label_76;
                }
                else if(hwcb.f() && ((long)ezwj.j()) == 4L && !ezwu.c(systemUpdateStatus0) && v4 == 0 && !systemUpdateStatus0.h.a && !ezwq.d(context0, systemUpdateStatus0, v1, v2, v)) {
                    ezwb0 = new ezwb(0x710, ezwq.b(context0, systemUpdateStatus0, v1, v2, v));
                }
                else if(ezwq.f(context0, systemUpdateStatus0)) {
                    ezwb0 = new ezwb(1041, hvzz.c());
                }
                else {
                    if(hvzq.d() && ((long)ezwi.c()) > 0L) {
                        try {
                            try {
                                ezwb0 = ezwc.b(context0, "/data", true) < ((long)ezwi.c()) ? new ezwb(0x810, hvzq.b()) : new ezwb(0x310, 0L);
                                goto label_77;
                            }
                            catch(IOException iOException0) {
                                ezwq.a.g("Unable to determine post-reboot free space.", iOException0, new Object[0]);
                            }
                        }
                        catch(Throwable unused_ex) {
                            ezwb0 = new ezwb(0x810, hvzq.b());
                            goto label_77;
                        }
                        ezwb0 = new ezwb(0x810, hvzq.b());
                        goto label_77;
                    }
                    ezwb0 = new ezwb(0x310, 0L);
                }
            }
            else {
                ezwb0 = new ezwb(1040, (ezwc.h(context0) ? hvzz.b() : ((long)ezwk.d())));
            }
            goto label_77;
        }
        catch(ezwa ezwa0) {
            ezzk.l.g("Unable to continue due to invalid config.", ezwa0, new Object[0]);
            this.s.u(0x207, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
    label_76:
        ezwb0 = ezwb1;
    label_77:
        Callable callable0 = null;
        int v5 = ezwb0.a;
        if(v5 != 0x310) {
            ezxs ezxs1 = this.s;
            ezxs1.u(v5, -1.0);
            this.q.b();
            if(v5 == 0x710) {
                this.r.n(this.k);
                this.r.j();
                v5 = 0x710;
            }
            SystemUpdateStatus systemUpdateStatus1 = ezxs1.b();
            long v6 = ezwb0.b;
            this.t.a(systemUpdateStatus1, Long.valueOf(v6));
            boolean z = ((Boolean)this.c(ezzk.h)).booleanValue();
            if(ezwq.e() && (v5 == 0x510 || v5 == 0x710) && ezwy.a(this.k, systemUpdateStatus0, z)) {
                long v7 = hwcb.a.e().d();
                if(systemUpdateStatus0.n + v7 <= System.currentTimeMillis()) {
                    this.i();
                    ezze ezze0 = new ezze();
                    ezze0.f(v6);
                    fagi fagi0 = this.b().a();
                    Long long1 = this.r.b();
                    fagi0.e(ezzk.i, long1);
                    fagi0.e(ezzk.j, Boolean.valueOf(true));
                    ezze0.d("non-ab-reboot", fagi0.a());
                    ezze0.g(ezwb0.c);
                    return ezze0.a();
                }
            }
            ezze ezze1 = new ezze();
            ezze1.f(v6);
            fagi fagi1 = this.b().a();
            Boolean boolean0 = (Boolean)this.c(ezzk.j);
            fagi1.e(ezzk.j, boolean0);
            ezze1.d("non-ab-reboot", fagi1.a());
            ezze1.g(ezwb0.c);
            return ezze1.a();
        }
        if(!systemUpdateStatus0.j) {
            Context context1 = this.k;
            fagf fagf0 = ezzk.h;
            if(ezwy.f(context1, systemUpdateStatus0, ((Boolean)this.c(fagf0)).booleanValue())) {
                this.i();
                this.s.u(0x210, -1.0);
                SystemUpdateStatus systemUpdateStatus2 = this.s.b();
                this.t.b(systemUpdateStatus2);
                fagi fagi2 = this.b().a();
                Long long2 = this.r.b();
                fagi2.e(ezzk.i, long2);
                String s = ezwj.m();
                fagi2.e(ezzk.n, s);
                String s1 = ezwj.l();
                fagi2.e(ezzk.o, s1);
                fagi2.e(ezzk.j, Boolean.valueOf(true));
                return new ezyi("non-ab-reboot", fagi2.a(), null);
            }
            if(ezwy.e(context1, systemUpdateStatus0, ((Boolean)this.c(fagf0)).booleanValue())) {
                this.s.u(0x110, -1.0);
                SystemUpdateStatus systemUpdateStatus3 = this.s.b();
                this.t.b(systemUpdateStatus3);
                ezze ezze2 = new ezze();
                ezze2.f(hvzz.a.d().a());
                fagi fagi3 = this.b().a();
                Boolean boolean1 = (Boolean)this.c(ezzk.j);
                fagi3.e(ezzk.j, boolean1);
                ezze2.d("non-ab-reboot", fagi3.a());
                return ezze2.a();
            }
        }
        fagf fagf1 = ezzk.p;
        if(((Boolean)this.c(fagf1)).booleanValue()) {
            ezzk.l.m("A reboot is already in progress, so the current execution is a no-op.", new Object[0]);
        }
        else if(((Boolean)this.c(ezzk.h)).booleanValue()) {
            callable0 = new ezzi(this);
        }
        else {
            callable0 = new ezzj(this);
        }
        this.s.u(0x310, -1.0);
        fagi fagi4 = this.b().a();
        Long long3 = this.r.b();
        fagi4.e(ezzk.i, long3);
        String s2 = ezwj.m();
        fagi4.e(ezzk.n, s2);
        String s3 = ezwj.l();
        fagi4.e(ezzk.o, s3);
        Boolean boolean2 = Boolean.valueOf(true);
        fagi4.e(ezzk.j, boolean2);
        fagi4.e(fagf1, boolean2);
        return new ezyi("non-ab-reboot", fagi4.a(), true, callable0);
    }

    public final void f(Exception exception0) {
        if(!(exception0 instanceof IOException) && !(exception0 instanceof GeneralSecurityException)) {
            ezzk.l.p("Failed to execute RecoverySystem.installPackage() with unexpected exception.", exception0, new Object[0]);
            throw exception0;
        }
        ezzk.l.g("Failed to execute RecoverySystem.installPackage().", exception0, new Object[0]);
        this.s.n.e(new fagh[]{new fagh(ezxs.k, Boolean.valueOf(true))});
        this.s.n.c(new fagn[]{ezxs.d});
        this.s.u(0x407, -1.0);
    }

    private static gfsx g() {
        try {
            String s = ghju.a((hrnt.i() ? new File(ccsb.a.a("/cache/recovery/last_install")) : new File("/cache/recovery/last_install")), StandardCharsets.UTF_8).b();
        }
        catch(IOException unused_ex) {
            ezzk.l.f("Failed to read installation status in %s.", new Object[]{"/cache/recovery/last_install"});
            return gfqx.a;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: gfud.e('\n').i().d().l(s)) {
            String s1 = (String)object0;
            String[] arr_s = s1.split(":");
            if(arr_s.length == 2) {
                goto label_11;
            }
            continue;
            try {
            label_11:
                hashMap0.put(arr_s[0].trim(), Long.valueOf(Long.parseLong(arr_s[1].trim())));
            }
            catch(NumberFormatException numberFormatException0) {
                ezzk.l.f("Failed to parse numbers in %s", new Object[]{s1, numberFormatException0});
            }
        }
        return gfsx.m(hashMap0);
    }

    private final void h(Map map0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihe.a).v_newBuilder();
        long v = 0L;
        long v1 = 0L;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((String)map$Entry0.getKey()).startsWith("bytes_stashed")) {
                v += (long)(((Long)map$Entry0.getValue()));
            }
            else if(((String)map$Entry0.getKey()).startsWith("bytes_written")) {
                v1 += (long)(((Long)map$Entry0.getValue()));
            }
            else if(((long)(((Long)map$Entry0.getValue()))) > 0x7FFFFFFFL) {
                Object[] arr_object = {map$Entry0.getKey(), map$Entry0.getValue()};
                ezzk.l.f("Number overflow: %s = %d.", arr_object);
            }
            else {
                String s = (String)map$Entry0.getKey();
                int v2 = ((Long)map$Entry0.getValue()).intValue();
                switch(s) {
                    case "cause": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe1 = (gihe)hftp0.b_message;
                        gihe1.b |= 0x40;
                        gihe1.i = v2;
                        break;
                    }
                    case "error": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe2 = (gihe)hftp0.b_message;
                        gihe2.b |= 0x80;
                        gihe2.j = v2;
                        break;
                    }
                    case "source_build": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe5 = (gihe)hftp0.b_message;
                        gihe5.b |= 0x100;
                        gihe5.k = v2;
                        break;
                    }
                    case "temperature_end": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe6 = (gihe)hftp0.b_message;
                        gihe6.b |= 4;
                        gihe6.e = v2;
                        break;
                    }
                    case "temperature_max": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe7 = (gihe)hftp0.b_message;
                        gihe7.b |= 8;
                        gihe7.f = v2;
                        break;
                    }
                    case "temperature_start": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe0 = (gihe)hftp0.b_message;
                        gihe0.b |= 2;
                        gihe0.d = v2;
                        break;
                    }
                    case "time_total": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe4 = (gihe)hftp0.b_message;
                        gihe4.b |= 16;
                        gihe4.g = v2;
                        break;
                    }
                    case "uncrypt_time": {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gihe gihe3 = (gihe)hftp0.b_message;
                        gihe3.b |= 0x200;
                        gihe3.l = v2;
                        break;
                    }
                    default: {
                        ezzk.l.m("Unrecognized proto name: %s", new Object[]{s});
                    }
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gihe)hftv0).b |= 1;
        ((gihe)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gihe gihe8 = (gihe)hftp0.b_message;
        gihe8.b |= 0x20;
        gihe8.h = v1;
        fabj fabj0 = this.u;
        gihe gihe9 = (gihe)hftp0.N_build();
        ProtoLiteBuilder hftp1 = fabj0.g(6);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gigw gigw0 = (gigw)hftp1.b_message;
        gihe9.getClass();
        gigw0.j = gihe9;
        gigw0.b |= 0x80;
        fabj0.f(((gigw)hftp1.N_build()));
    }

    private final void i() {
        try {
            File file0 = hrnt.i() ? new File(ccsb.a.a(((String)this.c(ezzk.g)))) : new File(((String)this.c(ezzk.g)));
            faah.a.h("scheduleUpdateOnBoot()", new Object[0]);
            ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.k, Boolean.valueOf(true))});
            try {
                RecoverySystem.scheduleUpdateOnBoot(this.k, file0);
            }
            catch(Exception exception0) {
                throw new IOException(exception0);
            }
        }
        catch(IOException iOException0) {
            ezzk.l.g("Failed to execute RecoverySystemDelegate.scheduleUpdateOnBoot().", iOException0, new Object[0]);
        }
    }

    private final boolean j() {
        return ((Boolean)this.c(ezzk.j)).booleanValue() && ((long)(((Long)this.c(ezzk.i)))) != this.r.b();
    }
}

