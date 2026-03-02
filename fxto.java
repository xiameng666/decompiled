import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public final class fxto {
    private final Context a;
    private final fxts b;
    private final fxtr c;
    private final fxtt d;
    private final fxsw e;
    private final fxqn f;
    private final WifiManager g;
    private final ContentResolver h;
    private final PowerManager i;
    private final fxsz j;

    public fxto(Context context0, fxts fxts0, fxtr fxtr0, fxtt fxtt0, fxsw fxsw0, fxqn fxqn0) {
        fxva.g(context0);
        this.a = context0;
        this.b = fxts0;
        this.c = fxtr0;
        this.d = fxtt0;
        this.e = fxsw0;
        this.f = fxqn0;
        this.g = (WifiManager)context0.getSystemService("wifi");
        this.i = (PowerManager)context0.getSystemService("power");
        this.h = context0.getContentResolver();
        this.j = fxsz.a(context0, fxtr0, bbnk.a);
    }

    public static Intent a(Context context0) {
        return fxtk.a(context0, "com.google.android.location.reporting.ACTION_UPDATE_WORLD");
    }

    public final void b(Intent intent0) {
        fxue fxue0;
        Boolean boolean0;
        int v6;
        ArrayList arrayList1;
        String s = intent0.getStringExtra("receiverAction");
        if(s == null) {
            s = "NO_RECEIVER_ACTION";
        }
        fxqn fxqn0 = this.f;
        fxtr fxtr0 = this.c;
        fxqn0.a(fxtr0.d());
        batl.k(null);
        synchronized(fxtr.b) {
            Account[] arr_account = fxtr0.e.b();
            SharedPreferences sharedPreferences0 = fxtr0.d.a;
            Set set0 = fxtv.b(sharedPreferences0, arr_account);
            if(!set0.isEmpty()) {
                cnug.c(arr_account);
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                for(Object object1: set0) {
                    String s1 = (String)object1;
                    if(s1 == null || !s1.startsWith("deviceTag_")) {
                        sharedPreferences$Editor0.remove(s1);
                    }
                }
                sharedPreferences$Editor0.apply();
            }
            Conditions conditions0 = fxtr0.f.a();
            fxtw fxtw0 = fxtr0.c;
            SharedPreferences sharedPreferences1 = fxtw0.b;
            if(!sharedPreferences1.getAll().isEmpty() && !conditions0.d()) {
                List list0 = conditions0.c();
                TreeSet treeSet0 = new TreeSet();
                for(Object object2: list0) {
                    treeSet0.add(((InactiveReason)object2).c);
                }
                String s2 = "clear:" + TextUtils.join("_", treeSet0);
                if(InactiveReason.a(list0, 3)) {
                    String s3 = fxva.c(fxtr0.i);
                    if(s3 == null) {
                        s3 = "unknown-country";
                    }
                    s2 = a.r(s3, s2, "_");
                }
                SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences1.edit();
                sharedPreferences$Editor1.clear();
                fxtw0.s(sharedPreferences$Editor1, false, "cleanup()", s2, false);
            }
            else {
                Set set1 = fxtv.b(sharedPreferences1, arr_account);
                if(!set1.isEmpty()) {
                    fxqw.c("GCoreUlr", "Dropping " + set1.size() + " UserPref keys; " + cnug.c(arr_account));
                    SharedPreferences.Editor sharedPreferences$Editor2 = sharedPreferences1.edit();
                    for(Object object3: set1) {
                        sharedPreferences$Editor2.remove(((String)object3));
                    }
                    fxtw0.s(sharedPreferences$Editor2, false, "restrictTo()", "restrictTo", false);
                }
            }
        }
        Context context0 = this.a;
        fxva.g(context0);
        ReportingConfig reportingConfig0 = fxtr0.d();
        boolean z = true;
        int v1 = 0;
        switch(s.hashCode()) {
            case 0xB96098BD: {
                if(s.equals("android.location.PROVIDERS_CHANGED")) {
                    fxtr0.o(context0);
                }
                z = false;
                break;
            }
            case 0xE1869F52: {
                if(s.equals("android.location.MODE_CHANGED")) {
                    fxtr0.o(context0);
                }
                z = false;
                break;
            }
            case -177095062: {
                if(s.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    ArrayList arrayList0 = intent0.getParcelableArrayListExtra("accountsAdded");
                    if(arrayList0 != null) {
                        int v2 = arrayList0.size();
                        while(v1 < v2) {
                            Account account0 = (Account)arrayList0.get(v1);
                            fxsz fxsz0 = this.j;
                            if(fxsz0.d(account0)) {
                                if(hzeq.e() && fxsz0.d == -1L) {
                                    fxra.k("UlrAutoEnableEvents", 9);
                                }
                                long v3 = fxsz0.d;
                                if(Long.compare(v3, -1L) == 0) {
                                label_105:
                                    long v7 = SystemClock.elapsedRealtime();
                                    long v8 = fxsz0.b;
                                    v6 = v1;
                                    long v9 = v7 - v8;
                                    if(v9 < hzek.c()) {
                                        arrayList1 = arrayList0;
                                        fxqw.c("GCoreUlr", "AutoEnableManager detected cleared data. currentElapsed: " + v7 + " creationTimeMillis: " + v8 + " " + v9 + " < " + hzek.c());
                                        fxsz0.b(account0);
                                        if(hzeq.d()) {
                                            fxra.k("UlrAutoEnableEvents", 2);
                                            fxra.k("UlrCreationTimeSecondAutoEnableIneligibleSetNewAccount", ((int)(v8 / 1000L)));
                                            fxra.k("UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccount", ((int)(v7 / 1000L)));
                                            fxra.k("UlrDurationSecondAutoEnableIneligibleSetNewAccount", ((int)(v9 / 1000L)));
                                        }
                                    }
                                    else {
                                    label_119:
                                        arrayList1 = arrayList0;
                                        fxsz0.a.i(account0, true);
                                        fxsz0.c(account0);
                                    }
                                }
                                else {
                                    long v4 = System.currentTimeMillis();
                                    long v5 = v4 - v3;
                                    if(Math.abs(v5) < hzek.c()) {
                                        fxqw.c("GCoreUlr", a.J(v3, v4, "AutoEnableManager detected cleared data. currentTimeMillis: ", " reportingAutoEnableManagerInitTimeMillis: "));
                                        fxsz0.b(account0);
                                        if(hzeq.e()) {
                                            fxra.k("UlrAutoEnableEvents", 8);
                                            fxra.k("UlrCreationTimeSecondAutoEnableIneligibleSetNewAccountStoragePath", ((int)(v3 / 1000L)));
                                            fxra.k("UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccountStoragePath", ((int)(v4 / 1000L)));
                                            fxra.k("UlrDurationSecondAutoEnableIneligibleSetNewAccountStoragePath", ((int)(v5 / 1000L)));
                                        }
                                        arrayList1 = arrayList0;
                                        v6 = v1;
                                        goto label_125;
                                    }
                                    else {
                                        v6 = v1;
                                        goto label_119;
                                    }
                                    goto label_105;
                                }
                            }
                            else {
                                arrayList1 = arrayList0;
                                v6 = v1;
                            }
                        label_125:
                            v1 = v6 + 1;
                            arrayList0 = arrayList1;
                        }
                    }
                }
                else {
                    z = false;
                }
                break;
            }
            case 0x316510: {
                if(s.equals("init") && intent0.getBooleanExtra("is_boot", false)) {
                    fxtr.a = true;
                    fxtt fxtt0 = this.d;
                    long v10 = SystemClock.elapsedRealtime();
                    Object object4 = fxtt.a;
                    synchronized(object4) {
                        List list1 = fxtt0.e();
                        if(!Thread.holdsLock(object4)) {
                            fxqw.o(17, new IllegalStateException("Caller must grab lock before calling"));
                        }
                        fxtt0.g();
                        for(Object object5: list1) {
                            fxtt0.b(((fxuf)object5).c, Long.valueOf(((fxuf)object5).a), v10, ((fxuf)object5).d);
                            fxtt0 = fxtt0;
                        }
                    }
                    boolean z1 = bbpg.c(context0);
                    frce frce0 = new frce(context0);
                    frce0.d("semanticlocation");
                    frce0.e("semanticlocation_settings.pb");
                    Uri uri0 = frce0.a();
                    frie frie0 = frif.a();
                    frie0.f(uri0);
                    frie0.e(((MessageLite)emls.a));
                    frie0.h(new frjp(cjtd.a));
                    frif frif0 = frie0.a();
                    bbmq.G(context0, "com.google.android.location.reporting.service.LocationHistoryInjectorService", z1 && elyv.a(context0, cjtb.a.a(frif0)));
                    PackageManager packageManager0 = context0.getPackageManager();
                    List list2 = this.j();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object6: list2) {
                        arrayList2.add(new Pair(((Account)object6), fxtr0.a(((Account)object6))));
                    }
                    this.e(arrayList2);
                    if(packageManager0.hasSystemFeature("android.hardware.wifi")) {
                        this.g(arrayList2);
                    }
                    this.c(arrayList2);
                    this.d(arrayList2);
                    boolean z2 = Settings.Global.getInt(context0.getContentResolver(), "airplane_mode_on", 0) != 0;
                    if(fxtr0.m(z2) && !list2.isEmpty()) {
                        fxqn0.n(list2, fxvb.b(z2, System.currentTimeMillis()), "AirplaneModeMetaData");
                        fxra.g("UlrAirplaneModeChange");
                        fxrc.b(Boolean.valueOf(z2), arrayList2);
                    }
                    WifiManager wifiManager0 = this.g;
                    if(wifiManager0 == null) {
                    label_192:
                        ArrayList arrayList3 = new ArrayList(fxtr0.d().d());
                        ArrayList arrayList4 = new ArrayList();
                        int v13 = arrayList3.size();
                        for(int v14 = 0; v14 < v13; ++v14) {
                            Account account1 = (Account)arrayList3.get(v14);
                            arrayList4.add(new Pair(account1, fxtr0.a(account1)));
                        }
                        this.f(arrayList4);
                    }
                    else {
                        int v12 = wifiManager0.getWifiState();
                        if(v12 == 3) {
                            boolean0 = Boolean.valueOf(true);
                            goto label_188;
                        }
                        else if(v12 == 1) {
                            boolean0 = Boolean.valueOf(false);
                        label_188:
                            if(fxtr0.p(boolean0.booleanValue()) && !list2.isEmpty()) {
                                fxqn0.n(list2, fxvb.e(boolean0.booleanValue(), System.currentTimeMillis()), "WifiStateMetaData");
                                fxra.g("UlrWifiStateChange");
                                fxrc.o(boolean0, arrayList2);
                            }
                            goto label_192;
                        }
                    }
                }
                z = false;
                break;
            }
            case 0xC992283: {
                if(s.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                    fxvd.b();
                    this.i(s);
                    if(fxtr0.n()) {
                        for(Object object7: reportingConfig0.a) {
                            AccountConfig accountConfig0 = (AccountConfig)object7;
                            if(accountConfig0.i()) {
                                Account account2 = accountConfig0.a;
                                if(hzek.l() && !this.l(accountConfig0)) {
                                    fxud fxud0 = new fxud(account2, "com.google.android.gms+disable-flag");
                                    fxud0.b(accountConfig0.c);
                                    fxud0.f = Boolean.valueOf(false);
                                    fxud0.f();
                                    fxue0 = new fxue(fxud0);
                                    fxtr0.l("DisableUlrFlagEnabled", fxue0, "disable_ulr_flag");
                                }
                                else {
                                    if(hzek.l() && this.l(accountConfig0)) {
                                        fxtr0.j(account2, true);
                                    }
                                    else if(!hzek.l()) {
                                        if(!fxtr0.k(account2) && !accountConfig0.e) {
                                            fxud fxud1 = new fxud(account2, "com.google.android.gms+disable-flag");
                                            fxud1.b(accountConfig0.c);
                                            fxud1.f = Boolean.valueOf(true);
                                            fxud1.f();
                                            fxue0 = new fxue(fxud1);
                                            fxtr0.l("DisableUlrFlagDisabled", fxue0, "disable_ulr_flag");
                                        }
                                        else {
                                            fxue0 = null;
                                        }
                                        fxtr0.j(account2, false);
                                        goto label_238;
                                    }
                                    fxue0 = null;
                                }
                            label_238:
                                if(fxue0 != null) {
                                    Objects.toString(fxue0.f);
                                    Objects.toString(fxue0.g);
                                }
                            }
                        }
                    }
                }
                z = false;
                break;
            }
            default: {
                z = false;
            }
        }
        for(Object object8: reportingConfig0.a) {
            AccountConfig accountConfig1 = (AccountConfig)object8;
            Account account3 = accountConfig1.a;
            if(account3 == null) {
                fxqw.n(16, "", new IllegalStateException("null account in " + accountConfig1));
            }
            else {
                long v15 = hzek.a.i().M();
                try {
                    ReportingSyncChimeraService.a(account3, this.a);
                    this.a.getContentResolver();
                    bajz.a(account3, "com.google.android.location.reporting", Bundle.EMPTY, v15);
                }
                catch(RuntimeException runtimeException0) {
                    fxqw.g(("account: " + cnug.a(account3) + ", period: " + v15), runtimeException0);
                }
                if(!z || accountConfig1.k) {
                    continue;
                }
                ReportingSyncChimeraService.b(account3, this.a);
            }
        }
        this.e.f(reportingConfig0, "WorldUpdater:" + s);
        fxts fxts0 = this.b;
        gzuh gzuh0 = fxts0.i();
        if(gzuh0 != null && fxts0.j() != null && (gzuh0.b & 2) != 0) {
            long v16 = gzuh0.d;
            long v17 = fxts0.a;
            long v18 = fxts0.d;
            long v19 = SystemClock.elapsedRealtime() - v16 - hzek.a.i().e();
            if(v19 > 0L && v17 < v19 && v18 < v19) {
                fxra.j(8);
                return;
            }
            fxra.g("UlrFlpLocationNotMissing");
        }
    }

    final void c(List list0) {
        int v = Settings.Global.getInt(this.h, "low_power", 0) == 0 ? 0 : 1;
        if(this.c.d.l(v, "Location_battery_saver_enabled_key")) {
            Boolean boolean0 = Boolean.valueOf(((boolean)v));
            Objects.toString(boolean0);
            if(fxrc.s()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
                boolean0.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzlq gzlq0 = (gzlq)hftp0.b_message;
                gzlq0.b |= 16;
                gzlq0.f = v;
                gzlq gzlq1 = (gzlq)hftp0.N_build();
                fxrb fxrb0 = fxrc.a;
                boolean0.getClass();
                fxrb0.f(gzlq1, (v == 0 ? gzww.dl : gzww.dk), list0);
            }
        }
    }

    final void d(List list0) {
        int v = Settings.Global.getInt(this.h, "low_power_trigger_level", 0);
        if(this.c.d.l(v, "Location_battery_saver_mode_threshold_key") && fxrc.s()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzlq gzlq0 = (gzlq)hftp0.b_message;
            gzlq0.b |= 0x20;
            gzlq0.g = v;
            gzlq gzlq1 = (gzlq)hftp0.N_build();
            fxrc.a.f(gzlq1, gzww.dm, list0);
        }
    }

    final void e(List list0) {
        Context context0 = this.a;
        boolean z = fxva.o(context0);
        if(this.c.d.l(((int)z), "geo_supported_key")) {
            boolean z1 = fxva.o(context0);
            Boolean boolean0 = Boolean.valueOf(z1);
            Objects.toString(boolean0);
            if(fxrc.s()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
                boolean0.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzlq gzlq0 = (gzlq)hftp0.b_message;
                gzlq0.b |= 1;
                gzlq0.c = z1;
                gzlq gzlq1 = (gzlq)hftp0.N_build();
                fxrb fxrb0 = fxrc.a;
                boolean0.getClass();
                fxrb0.f(gzlq1, (z1 ? gzww.dc : gzww.dd), list0);
            }
        }
    }

    final void f(List list0) {
        Context context0 = this.a;
        if(this.c.o(context0)) {
            int v = cjer_LocationSettings.a(context0);
            ArrayList arrayList0 = new ArrayList(Arrays.asList(new gzwr[]{gzwr.b, gzwr.d, gzwr.c, gzwr.e}));
            ggek ggek0 = new ggek();
            ggek0.i(gzwr.a, gzww.dp);
            ggek0.i(gzwr.b, gzww.dq);
            ggek0.i(gzwr.c, gzww.dr);
            ggek0.i(gzwr.d, gzww.ds);
            ggek0.i(gzwr.e, gzww.dt);
            ggeo ggeo0 = ggek0.b();
            gzwr gzwr0 = (gzwr)arrayList0.get(v);
            if(fxrc.s()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gzlq)hftp0.b_message).i = gzwr0.f;
                ((gzlq)hftp0.b_message).b |= 0x80;
                gzlq gzlq0 = (gzlq)hftp0.N_build();
                fxrc.a.f(gzlq0, ((gzww)ggeo0.get(gzwr0)), list0);
            }
        }
        boolean z = cjer_LocationSettings.p(context0);
        if(!fxra.q()) {
            return;
        }
        fxra.a.b(z);
    }

    final void g(List list0) {
        boolean z = bbpg.b(this.a);
        if(this.c.d.l(((int)z), "Location_wifi_scan_enabled_key")) {
            Boolean boolean0 = Boolean.valueOf(z);
            Objects.toString(boolean0);
            if(fxrc.s()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
                boolean0.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzlq gzlq0 = (gzlq)hftp0.b_message;
                gzlq0.b |= 4;
                gzlq0.e = z;
                gzlq gzlq1 = (gzlq)hftp0.N_build();
                fxrb fxrb0 = fxrc.a;
                boolean0.getClass();
                fxrb0.f(gzlq1, (z ? gzww.dg : gzww.dh), list0);
            }
        }
    }

    public static void h(Context context0, Intent intent0) {
        Context context1 = context0.getApplicationContext();
        Intent intent1 = fxto.a(context1);
        if(intent0 != null) {
            intent1.putExtra("receiverAction", intent0.getAction());
            switch(intent0.getAction()) {
                case "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE": {
                    List list0 = adqe.a(intent0);
                    if(!list0.isEmpty()) {
                        intent1.putParcelableArrayListExtra("accountsAdded", new ArrayList(list0));
                    }
                    break;
                }
                case "com.google.android.gms.phenotype.COMMITTED": 
                case "com.google.android.gms.phenotype.com.google.android.gms.beacon.COMMITTED": 
                case "com.google.android.gms.phenotype.com.google.android.gms.ulr.COMMITTED": 
                case "com.google.android.gms.phenotype.com.google.android.location.COMMITTED": {
                    if(fxto.k("com.google.android.location", intent0)) {
                        fxqs fxqs0 = fxvd.c;
                        if(fxqs0 != null) {
                            fxqs0.d(context1);
                            return;
                        }
                    }
                    else if(fxto.k("com.google.android.gms.beacon", intent0)) {
                        fxqs fxqs1 = fxvd.d;
                        if(fxqs1 != null) {
                            fxqs1.d(context1);
                            return;
                        }
                    }
                    else {
                        if(fxto.k("com.google.android.gms.ulr", intent0)) {
                            fxqs fxqs2 = fxvd.b;
                            if(fxqs2 != null) {
                                fxqs2.d(context1);
                            }
                            intent1.putExtra("receiverAction", "com.google.gservices.intent.action.GSERVICES_CHANGED");
                            fxva.p(context1, intent1);
                            return;
                        }
                        if(fxto.k("com.google.android.gms.semanticlocation", intent0)) {
                            fxqs fxqs3 = fxvd.e;
                            if(fxqs3 != null) {
                                fxqs3.d(context1);
                            }
                        }
                    }
                    return;
                }
                case "init": {
                    if(intent0.getBooleanExtra("is_boot", false)) {
                        intent1.putExtra("is_boot", true);
                    }
                    if(intent0.getBooleanExtra("is_module_updated", false)) {
                        intent1.putExtra("is_module_updated", true);
                    }
                }
            }
            fxva.p(context1, intent1);
            return;
        }
        fxqw.g("", new IllegalStateException("Missing receiver intent"));
    }

    final void i(String s) {
        Boolean boolean0;
        if(hzeb.c()) {
            List list0 = this.j();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(Pair.create(((Account)object0), Integer.valueOf(this.c.a(((Account)object0)))));
            }
            boolean z = true;
            int v = 0;
            switch(s.hashCode()) {
                case 0x8DA6360E: {
                    if(!s.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD")) {
                        goto label_129;
                    }
                    this.d(arrayList0);
                    return;
                }
                case 0x90329445: {
                    if(!s.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        goto label_129;
                    }
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object1: arrayList0) {
                        arrayList1.add(((Account)((Pair)object1).first));
                    }
                    WifiManager wifiManager0 = this.g;
                    if(wifiManager0 != null) {
                        int v1 = wifiManager0.getWifiState();
                        if(v1 == 3) {
                            boolean0 = Boolean.valueOf(true);
                            goto label_30;
                        }
                        else if(v1 == 1) {
                            boolean0 = Boolean.valueOf(false);
                        label_30:
                            if(this.c.p(boolean0.booleanValue())) {
                                wifiManager0.getWifiState();
                                if(!arrayList1.isEmpty()) {
                                    if(!hzee.c()) {
                                        this.f.n(arrayList1, fxvb.e(boolean0.booleanValue(), System.currentTimeMillis()), "WifiStateMetaData");
                                    }
                                    fxra.g("UlrWifiStateChange");
                                }
                                fxrc.o(boolean0, arrayList0);
                                return;
                            }
                        }
                    }
                    break;
                }
                case 0xB96098BD: {
                    if(!s.equals("android.location.PROVIDERS_CHANGED")) {
                        goto label_129;
                    }
                    goto label_57;
                }
                case 0xBFD4BDCB: {
                    if(!s.equals("android.intent.action.AIRPLANE_MODE")) {
                        goto label_129;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: arrayList0) {
                        arrayList2.add(((Account)((Pair)object2).first));
                    }
                    if(Settings.Global.getInt(this.a.getContentResolver(), "airplane_mode_on", 0) == 0) {
                        z = false;
                    }
                    if(this.c.m(z)) {
                        if(!arrayList2.isEmpty()) {
                            if(!hzee.c()) {
                                this.f.n(arrayList2, fxvb.b(z, System.currentTimeMillis()), "AirplaneModeMetaData");
                            }
                            fxra.g("UlrAirplaneModeChange");
                        }
                        fxrc.b(Boolean.valueOf(z), arrayList0);
                        return;
                    }
                    break;
                }
                case 0xE1869F52: {
                    if(!s.equals("android.location.MODE_CHANGED")) {
                        goto label_129;
                    }
                label_57:
                    fxtr fxtr0 = this.c;
                    ArrayList arrayList3 = new ArrayList(fxtr0.d().d());
                    ArrayList arrayList4 = new ArrayList();
                    int v2 = arrayList3.size();
                    while(v < v2) {
                        Account account0 = (Account)arrayList3.get(v);
                        arrayList4.add(Pair.create(account0, Integer.valueOf(fxtr0.a(account0))));
                        ++v;
                    }
                    this.f(arrayList4);
                    return;
                }
                case 0xC992283: {
                    if(!s.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                        goto label_129;
                    }
                    this.e(arrayList0);
                    return;
                }
                case 0xF7D11C2: {
                    if(!s.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE")) {
                        goto label_129;
                    }
                    this.c(arrayList0);
                    return;
                }
                case 870701415: {
                    if(!s.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                        goto label_129;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for(Object object3: arrayList0) {
                        arrayList5.add(((Account)((Pair)object3).first));
                    }
                    PowerManager powerManager0 = this.i;
                    if(powerManager0 == null) {
                        fxqw.f("Can not obtain Power Manager");
                    }
                    else {
                        v = powerManager0.isDeviceIdleMode();
                    }
                    if(!arrayList5.isEmpty()) {
                        if(!hzee.c()) {
                            long v3 = System.currentTimeMillis();
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzsz.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gzsz gzsz0 = (gzsz)hftp0.b_message;
                            gzsz0.b |= 4;
                            gzsz0.e = v;
                            gzsz gzsz1 = (gzsz)hftp0.N_build();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            gzsz1.getClass();
                            ((gzty)hftv0).j = gzsz1;
                            ((gzty)hftv0).b |= 0x200;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gzty gzty0 = (gzty)hftp1.b_message;
                            gzty0.b |= 1;
                            gzty0.c = v3;
                            gzty gzty1 = (gzty)hftp1.N_build();
                            this.f.n(arrayList5, gzty1, "DozeModeMetaData");
                        }
                        fxra.g("UlrDozeModeChange");
                    }
                    Boolean boolean1 = Boolean.valueOf(((boolean)v));
                    Objects.toString(boolean1);
                    if(fxrc.s()) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
                        boolean1.getClass();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzlq gzlq0 = (gzlq)hftp2.b_message;
                        gzlq0.b |= 0x200;
                        gzlq0.k = v;
                        gzlq gzlq1 = (gzlq)hftp2.N_build();
                        fxrb fxrb0 = fxrc.a;
                        boolean1.getClass();
                        fxrb0.f(gzlq1, (v == 0 ? gzww.dx : gzww.dw), arrayList0);
                        return;
                    }
                    break;
                }
                case 0x57D609FC: {
                    if(s.equals("com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE")) {
                        this.g(arrayList0);
                        return;
                    }
                label_129:
                }
            }
        }
    }

    private final List j() {
        List list0 = new ArrayList();
        fxtr fxtr0 = this.c;
        bxe bxe0 = new bxe(((bxf)fxtr0.d().d()));
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            Account account0 = (Account)object0;
            AccountConfig accountConfig0 = fxtr0.c(account0);
            if(accountConfig0.e && accountConfig0.g) {
                list0.add(account0);
            }
        }
        return list0;
    }

    private static boolean k(String s, Intent intent0) {
        return s.equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
    }

    private final boolean l(AccountConfig accountConfig0) {
        return this.c.k(accountConfig0.a) || !accountConfig0.e;
    }
}

