import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda10;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda11;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda12;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda13;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda14;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda15;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda16;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda5;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda6;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda7;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda8;
import com.google.android.location.os.real.LegacyRealTimers..ExternalSyntheticLambda9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class fwvn implements futh, fwxt, fwym, fwyz, fwze, fwzo {
    private final fwwt A;
    private final fuvj B;
    private final bbpj C;
    private final fvty D;
    public final Context a;
    public final fvwz b;
    public final fwtu c;
    public final fwuy d;
    public final fwyd e;
    public final fwyj f;
    public final fwxw g;
    public final fwvi h;
    public final fwvx i;
    public final fwyl j;
    public final fwux k;
    public final SensorManager l;
    public final fvsd m;
    public final fwyi n;
    public final fwvo o;
    public final fwyb p;
    public final boolean q;
    public int r;
    public fvtz s;
    public final fwqt t;
    public final fwvc u;
    private final Map v;
    private final fwzv w;
    private final fwzd x;
    private final fwza y;
    private final fwzr z;

    public fwvn(Context context0, gmcg gmcg0, gmcg gmcg1, fvwz fvwz0, fwqt fwqt0) {
        this.a = context0;
        this.v = new HashMap();
        this.b = fvwz0;
        this.t = fwqt0;
        this.p = new fwue();
        this.D = new fvty();
        this.m = new fvsd(ModuleManager.requireSubmoduleContext(context0, "location_accuracy"), true);
        this.h = new fwvi(context0, fvwz0);
        fwwt fwwt0 = new fwwt();
        this.A = fwwt0;
        BluetoothAdapter bluetoothAdapter0 = bahu.a((humo.a.b().d() ? ModuleManager.requireSubmoduleContext(context0, "activity_recognition_provider") : context0));
        File file0 = null;
        this.u = bluetoothAdapter0 == null ? null : new fwvc(bluetoothAdapter0);
        File file1 = context0.getFilesDir();
        if(file1 != null) {
            file0 = hrnt.i() ? new File(ccsb.a.b(file1, "nlp_ck")) : new File(file1, "nlp_ck");
        }
        this.n = new fxbj(file0);
        this.e = new fxbi(context0);
        this.f = new fwyj(gmcg0, gmcg1, new bblp(3, 10));
        fwtu fwtu0 = new fwtu(context0, this, fvwz0, fwwt0);
        this.c = fwtu0;
        fwux fwux0 = new fwux(context0, fwtu0, fvwz0);
        fwux0.e[fwzf.a.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda5(fwux0);
        fwux0.e[fwzf.v.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda8();
        fwux0.e[fwzf.c.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda9(fwux0);
        fwux0.e[fwzf.d.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda10(fwux0);
        fwux0.e[fwzf.g.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda11(fwux0);
        fwux0.e[fwzf.j.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda12(fwux0);
        fwux0.e[fwzf.k.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda13(fwux0);
        fwux0.e[fwzf.h.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda14(fwux0);
        fwux0.e[fwzf.e.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda15(fwux0);
        fwux0.e[fwzf.f.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda16(fwux0);
        if(huve.a.b().a()) {
            fwux0.e[fwzf.i.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda6(fwux0);
        }
        else {
            Intent intent0 = new Intent("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION");
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(fwux0.b, 0, intent0, 0xC000000);
            gfuy.e(pendingIntent0);
            fwux0.d[fwzf.i.ordinal()] = pendingIntent0;
        }
        fwux0.e[fwzf.l.ordinal()] = new LegacyRealTimers..ExternalSyntheticLambda7(fwux0);
        WifiManager wifiManager0 = (WifiManager)fwux0.b.getApplicationContext().getSystemService("wifi");
        fwzf[] arr_fwzf = fwzf.values();
        for(int v = 0; v < arr_fwzf.length; ++v) {
            fwzf fwzf0 = arr_fwzf[v];
            fwux0.a[fwzf0.ordinal()] = new fwwo(fwux0.b, (fwzf0.y & 2) != 0, fwzf0.x, fwwo.a);
        }
        this.k = fwux0;
        this.y = new fxbk();
        fxbl fxbl0 = new fxbl(context0);
        this.x = fxbl0;
        this.z = new fxbn();
        WifiManager wifiManager1 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        fwwn fwwn0 = fwwn.h();
        fwvx fwvx0 = new fwvx(context0, fvwz0, wifiManager1, this.A, this.c, fwwn0, this.p, this.f);
        this.i = fwvx0;
        fwvk fwvk0 = new fwvk(this);
        fwun fwun0 = new fwun(context0, this.p, this.f, fxbl0, fvwz0, ((gful_cronetEngineProvider)fwvk0));
        this.j = fwun0;
        this.w = fwun0;
        this.l = (SensorManager)context0.getSystemService("sensor");
        this.o = new fwvo(context0, this);
        this.C = bbpj.a(context0);
        this.B = new fuvj(this.e);
        boolean z = bbsr.b(context0).h("android.hardware.telephony");
        this.q = z;
        fwvf fwvf0 = new fwvf(z, this.c, fvwz0, this.p, this.f);
        this.g = fwvf0;
        synchronized(heco.class) {
            heco.c = fwvf0;
            heco.b = fwvx0;
            heco.a = this.e;
        }
        this.d = new fwuy(this.c.q, fvwz0, fwun0);
    }

    @Override  // fwxt
    public final long a(boolean z) {
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        return z ? sharedPreferences0.getLong("LAST_SLEEP_SEGMENT_MILLIS", 0L) : sharedPreferences0.getLong("LAST_THIRD_PARTY_SLEEP_SEGMENT_MILLIS", 0L);
    }

    @Override  // fwxt
    public final fuxk b() {
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        return sharedPreferences0.contains("userPreferredSleepStartHour") ? new fuxk(sharedPreferences0.getInt("userPreferredSleepStartHour", 0), sharedPreferences0.getInt("userPreferredSleepStartMinute", 0), sharedPreferences0.getInt("userPreferredSleepEndHour", 0), sharedPreferences0.getInt("userPreferredSleepEndMinute", 0)) : null;
    }

    @Override  // fwxt
    public final fvnb c(boolean z, Set set0, Map map0, long v, fvnx fvnx0, fvlt fvlt0, String s, fwyc fwyc0, String s1, String s2) {
        fwux fwux0 = this.k;
        fvkr fvkr0 = new fvkr(fvlt0, fwux0.a());
        fvnm fvnm0 = new fvnm();
        fvnm0.a = set0;
        fvnm0.q = z ? 3 : 1;
        fvnm0.c = null;
        fvnm0.d = null;
        fvnm0.k = true;
        fvnm0.l = fwyc0;
        fvnm0.n = fvlg.c;
        fvnm0.o = fvlg.b;
        if(v >= 0L) {
            fvnm0.b(v);
        }
        else {
            fvnm0.h = -v;
            fvnm0.i = true;
            fvnm0.j = null;
        }
        if(fvnx0 != null) {
            fvnm0.j = fvnx0;
            fvnm0.i = false;
        }
        RealCollectorConfig realCollectorConfig0 = fvnm0.a();
        for(Object object0: map0.entrySet()) {
            realCollectorConfig0.d(((fvns)((Map.Entry)object0).getKey()), ((Integer)((Map.Entry)object0).getValue()).intValue());
        }
        Context context0 = this.z(s1);
        fybc fybc0 = new fybc(s);
        return new fvoe(fwux0, context0, realCollectorConfig0, this.m, this.i, 0, fvkr0, fybc0, this.b, s2);
    }

    @Override  // fwze
    public final fwxw d() {
        return this.g;
    }

    @Override  // fwze
    public final fwyb e() {
        return this.p;
    }

    @Override  // fwze
    public final fwyd f() {
        return this.e;
    }

    @Override  // fwze
    public final fwyg g() {
        return new fwvj(this);
    }

    @Override  // fwze
    public final fwyi h() {
        return this.n;
    }

    @Override  // fwyz
    public final long i() {
        return this.D.b;
    }

    @Override  // fwyz
    public final long j() {
        return this.D.c;
    }

    @Override  // fwze
    public final fwym k() {
        return this;
    }

    @Override  // fwze
    public final fwyy l() {
        return this.j;
    }

    @Override  // fwze
    public final fwyz m() {
        return this;
    }

    @Override  // fwze
    public final ffsb mG() {
        return bbnp.a(this.a);
    }

    @Override  // fwze
    public final fvwz mH() {
        return this.b;
    }

    @Override  // fwze
    public final fwxt mI() {
        return this;
    }

    @Override  // fwze
    public final fwyj mJ() {
        return this.f;
    }

    @Override  // fwze
    public final fwyk mK() {
        return this.h;
    }

    @Override  // fwxt
    @Deprecated
    public final List mL(boolean z) {
        String s = "PREVIOUS_THIRD_PARTY_SLEEPS_START_END_STATUS_STRING";
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        if(sharedPreferences0.contains((z ? "PREVIOUS_SLEEPS_START_END_STATUS_STRING" : "PREVIOUS_THIRD_PARTY_SLEEPS_START_END_STATUS_STRING"))) {
            if(z) {
                s = "PREVIOUS_SLEEPS_START_END_STATUS_STRING";
            }
            String[] arr_s = sharedPreferences0.getString(s, "").split(";", 0);
            List list0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String[] arr_s1 = arr_s[v].split(",", 0);
                list0.add(new fuxj(Long.parseLong(arr_s1[0]), Long.parseLong(arr_s1[1]), Integer.parseInt(arr_s1[2])));
            }
            if(!list0.isEmpty()) {
                long v1 = System.currentTimeMillis() - ((fuxj)list0.get(0)).b;
                return v1 <= 0L || v1 >= 86400000L ? null : list0;
            }
        }
        return null;
    }

    @Override  // futh
    public final void mM(ActivityRecognitionResult activityRecognitionResult0) {
        this.mN(new fvus(activityRecognitionResult0));
    }

    @Override  // futh
    public final void mN(fvsr fvsr0) {
        for(Object object0: fvsr0.c()) {
            Intent intent0 = bbmq.j(new Intent());
            this.c.t(8, 0, ((ActivityRecognitionResult)object0), true);
            intent0.setAction("com.google.android.location.activity.ACTIVITY_RESULT");
            intent0.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", ((ActivityRecognitionResult)object0));
            lvj.a(this.a).e(intent0);
        }
        this.t.mN(fvsr0);
    }

    @Override  // futh
    public final void mO(List list0, int v) {
        List list4;
        List list1;
        Bundle bundle0 = new Bundle();
        bundle0.putInt("location:key:transition_result_source", v);
        fwvn fwvn0 = this.t.k;
        fwot fwot0 = this.t.m;
        synchronized(fwot0) {
            boolean z = humy.f();
            GoogleLocationChimeraService googleLocationChimeraService0 = this.t.a;
            if(z && (list0.size() <= 1 && ((ActivityTransitionEvent)list0.get(0)).a == 20)) {
                fuvv fuvv0 = ((fwoq)fwot0).g;
                ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)list0.get(0);
                if(activityTransitionEvent0.a != 20) {
                    list1 = null;
                }
                else if(activityTransitionEvent0.b == 0) {
                    list1 = new ArrayList();
                    ActivityTransitionEvent activityTransitionEvent1 = fuvv0.a;
                    if(activityTransitionEvent1 != null) {
                        list1.add(new ActivityTransitionEvent(activityTransitionEvent1.a, 1, activityTransitionEvent0.c));
                    }
                    list1.add(new ActivityTransitionEvent(0, 0, activityTransitionEvent0.c));
                    fuvv0.b = true;
                }
                else if(fuvv0.b && humy.e()) {
                    fuvv0.b = false;
                    list1 = Collections.singletonList(new ActivityTransitionEvent(0, 1, activityTransitionEvent0.c));
                }
                else {
                    list1 = null;
                }
                if(list1 == null) {
                    return;
                }
                boolean z1 = false;
                Iterator iterator0 = ((fwoq)fwot0).k.entrySet().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    fwop fwop0 = (fwop)((Map.Entry)object0).getValue();
                    String s = fwop0.l;
                    String s1 = fwop0.o;
                    if(fwop0.s && (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1))) {
                        if(s.equalsIgnoreCase("com.google.android.gms") && s1 != null) {
                            List list2 = TextUtils.isEmpty(humy.d()) ? null : gfud.e(';').n(humy.d());
                            if(list2 == null || !list2.contains(s1)) {
                                continue;
                            }
                        }
                        else {
                            List list3 = TextUtils.isEmpty(humy.c()) ? null : gfud.e(';').n(humy.c());
                            if(list3 != null && list3.contains(s)) {
                                goto label_44;
                            }
                            continue;
                        }
                    label_44:
                        if(!list1.isEmpty()) {
                            Intent intent0 = new Intent();
                            intent0.putExtra("AR_AUDIO_FUSION_RESULT", (((ActivityTransitionEvent)list1.get(list1.size() - 1)).b == 0 ? 0 : 1));
                            if(fwoq.y(list1, bundle0, fwop0, intent0) && !fwop0.e(googleLocationChimeraService0, intent0, 103)) {
                                cmcp cmcp0 = ((fwoq)fwot0).h;
                                if(cmcp0 != null) {
                                    PendingIntent pendingIntent0 = fwop0.j;
                                    if(pendingIntent0 != null) {
                                        cmcp0.k(pendingIntent0);
                                    }
                                }
                                if(((fwoq)fwot0).i != null) {
                                    ((fwoq)fwot0).t(fwop0);
                                }
                                iterator0.remove();
                                z1 = true;
                            }
                        }
                        if(z1) {
                            ((fwqu)fwot0).B(fwvn0);
                        }
                    }
                }
                return;
            }
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            Iterator iterator1 = ((fwqu)fwot0).k.entrySet().iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    list4 = list0;
                    fvwz fvwz0 = ((fwoq)fwot0).i;
                    if(fvwz0 != null) {
                        fvwz0.k(0x97, v2, v3, v4);
                    }
                    if(v4 <= 0) {
                        break;
                    }
                    ((fwqu)fwot0).B(fwvn0);
                    break;
                }
                Object object1 = iterator1.next();
                PendingIntent pendingIntent1 = (PendingIntent)((Map.Entry)object1).getKey();
                fwpc fwpc0 = (fwpc)((Map.Entry)object1).getValue();
                int v5 = pendingIntent1.getCreatorUid();
                if(!fvac.d(googleLocationChimeraService0, gzwy.a(pendingIntent1), v5, (fwpc0 == null ? null : fwpc0.r))) {
                    list4 = list0;
                    break;
                }
                switch(((fwqu)fwot0).z(googleLocationChimeraService0, list0, bundle0, ((fwpc)((Map.Entry)object1).getValue()), 103)) {
                    case 0: {
                        iterator1.remove();
                        ++v4;
                        break;
                    }
                    case 1: {
                        ++v3;
                        break;
                    }
                    default: {
                        ++v2;
                    }
                }
                list0 = list0;
            }
            if(huoo.c()) {
                for(Object object2: list4) {
                    if(((ActivityTransitionEvent)object2).a == 22) {
                        if(humo.a.b().e()) {
                            int v6 = bbmq.c(googleLocationChimeraService0, "com.google.android.gms");
                            if(v6 != -1) {
                                fvac.a(googleLocationChimeraService0, v6, "com.google.android.gms", "carcrash");
                            }
                        }
                        return;
                    }
                }
            }
            if(!list4.isEmpty()) {
                ActivityTransitionEvent activityTransitionEvent2 = huml.c() ? fuzn.b(fuzn.d(list4)) : ((ActivityTransitionEvent)gggq.p(list4));
                gftb.check(activityTransitionEvent2);
                if(activityTransitionEvent2.b != 0) {
                    return;
                }
                ActivityTransitionEvent activityTransitionEvent3 = ((fwoq)fwot0).a;
                if(activityTransitionEvent3 != null && humr.n()) {
                    fuyt fuyt0 = fuyt.a(googleLocationChimeraService0);
                    int v7 = activityTransitionEvent3.a;
                    int v8 = activityTransitionEvent2.a;
                    long v9 = TimeUnit.NANOSECONDS.toMillis(activityTransitionEvent2.c) - TimeUnit.NANOSECONDS.toMillis(activityTransitionEvent3.c);
                    if(humr.l()) {
                        fuyt0.c.cp().b(new fuyo(fuyt0, v7, v8, v9));
                    }
                    else {
                        fuyt0.e(v7, v8, v9);
                    }
                }
                ((fwoq)fwot0).a = activityTransitionEvent2;
                ((fwoq)fwot0).b = bundle0;
                ((fwoq)fwot0).g.a = ((fwoq)fwot0).a;
            }
        }
    }

    @Override  // fwym
    public final void mP(fwzf fwzf0, boolean z) {
        fwse fwse0 = new fwse(this.b.f(), ((int)z), fwzf0.ordinal(), z, fwzf0);
        this.b.a(fwse0);
        String s = String.valueOf(fwzf0.ordinal());
        fwtu fwtu0 = this.c;
        if(fwtu0.h != null && fwtu0.p != z) {
            fvsd fvsd0 = this.m;
            fwtu0.p = z;
            if(z) {
                fvsd0.e(s, fwtu0.i, fwtu0.j.f.a, false);
                return;
            }
            fvsd0.c(s, fwtu0.i);
            fwtu0.i.a();
        }
    }

    @Override  // fwym
    public final void mQ(fwzf fwzf0, boolean z) {
        fwsd fwsd0 = new fwsd(this.b.f(), ((int)z), fwzf0.ordinal(), z, fwzf0);
        this.b.a(fwsd0);
        String s = String.valueOf(fwzf0.ordinal());
        fwtu fwtu0 = this.c;
        if(fwtu0.o == z) {
            return;
        }
        fvsd fvsd0 = this.m;
        fwtu0.o = z;
        Looper looper0 = Looper.getMainLooper();
        if(z) {
            fvsd0.b(s, false, fwtu0.f.c);
            fvsd0.f(s, "gps", 1000L, fwtu0.g.c, looper0);
            return;
        }
        fvsd0.b(s, true, fwtu0.g.c);
        fvsd0.f(s, "passive", 0L, fwtu0.f.c, looper0);
    }

    @Override  // fwyz
    public final void mR(List list0, hecp hecp0) {
        boolean z;
        fvuu fvuu1;
        fvuu fvuu0;
        int v = fvve.e;
        if(v != this.r) {
            this.r = v;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwty.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwty gwty0 = (gwty)hftp0.b_message;
            gwty0.b |= 1;
            gwty0.c = v;
            gwty gwty1 = (gwty)hftp0.N_build();
            new fvul(this, "wo").b(((MessageLite)gwty1));
        }
        this.t.mR(list0, hecp0);
        if(!list0.isEmpty()) {
            if(huvd.z()) {
                long v1 = SystemClock.elapsedRealtime();
                long v2 = this.D.a;
                for(Object object0: list0) {
                    fvua fvua0 = ((fvuc)object0).a;
                    if(fvua0 != null) {
                        long v3 = fvua0.d;
                        if(v3 <= v2) {
                            fvwy fvwy0 = new fvwy(0x93, v1, "ageOfEarlier=%3$d, ageOfLater=%4$d", null, 0x1F, ((int)(v1 - v2)), ((int)(v1 - v3)));
                            ((fvwz)fvwy0).a(fvwy0);
                        }
                        v2 = v3;
                    }
                }
            }
            fvuc fvuc0 = (fvuc)gggq.p(list0);
            fwtu fwtu0 = this.c;
            fuvj fuvj0 = this.B;
            if(hecp0 == null) {
                fvuu0 = fuvj.a;
            }
            else {
                if(hecp0.d() <= 0) {
                    fvuu0 = fuvj.a;
                    goto label_79;
                }
                fuvi fuvi0 = new fuvi(hecp0, fvuc0);
                List list1 = fuvj0.d;
                if(list1.isEmpty() || fuvi0.a.m() - ((fuvi)list1.get(list1.size() - 1)).a.m() >= 55000L) {
                    list1.add(fuvi0);
                    if(list1.size() > 3) {
                        list1.remove(0);
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                for(int v4 = 0; v4 < list1.size() - 1; ++v4) {
                    arrayList0.add(((fuvi)list1.get(v4)));
                }
                arrayList0.add(fuvi0);
                if(arrayList0.size() < 3) {
                    fvuu0 = fuvj.a;
                    goto label_79;
                }
                if(arrayList0.size() != 3) {
                    throw new IllegalArgumentException(a.S(arrayList0, "Can\'t compute features for history of size: "));
                }
                EnumMap enumMap0 = new EnumMap(fuvg.class);
                long[] arr_v = futx.b(((fuvi)arrayList0.get(0)).a);
                long[] arr_v1 = futx.b(((fuvi)arrayList0.get(1)).a);
                long[] arr_v2 = futx.b(((fuvi)arrayList0.get(2)).a);
                long[] arr_v3 = futx.a(arr_v, arr_v2);
                fuvg fuvg0 = fuvg.a;
                futx.e(enumMap0, fuvg0, futx.d(arr_v, arr_v2, arr_v3));
                fuvg fuvg1 = fuvg.b;
                enumMap0.put(fuvg1, Double.valueOf(arr_v3.length));
                long[] arr_v4 = futx.a(arr_v1, arr_v2);
                fuvg fuvg2 = fuvg.d;
                futx.e(enumMap0, fuvg2, futx.d(arr_v1, arr_v2, arr_v4));
                fuvg fuvg3 = fuvg.e;
                futx.e(enumMap0, fuvg3, futx.c(((fuvi)arrayList0.get(0)), ((fuvi)arrayList0.get(1)), false));
                fuvg fuvg4 = fuvg.f;
                futx.e(enumMap0, fuvg4, futx.c(((fuvi)arrayList0.get(0)), ((fuvi)arrayList0.get(2)), false));
                fuvg fuvg5 = fuvg.g;
                futx.e(enumMap0, fuvg5, futx.c(((fuvi)arrayList0.get(1)), ((fuvi)arrayList0.get(2)), false));
                fuvg fuvg6 = fuvg.h;
                futx.e(enumMap0, fuvg6, futx.c(((fuvi)arrayList0.get(0)), ((fuvi)arrayList0.get(2)), true));
                fuvh fuvh0 = fuvj0.b;
                if(((double)(((Double)enumMap0.get(fuvg2)))) == 1.0 && (fuvh0.a(enumMap0, fuvg.c) > 400.0)) {
                    fvuu0 = fuvj.a;
                }
                else {
                    double f = 1.0 / (Math.exp(-(fuvh0.a(enumMap0, fuvg0) * 1.9996 - 2.0913 + fuvh0.a(enumMap0, fuvg1) * 0.2657 + fuvh0.a(enumMap0, fuvg.c) * -0.0024 + fuvh0.a(enumMap0, fuvg2) * 5.3858 + fuvh0.a(enumMap0, fuvg3) * -0.006 + fuvh0.a(enumMap0, fuvg4) * -0.007 + fuvh0.a(enumMap0, fuvg5) * -0.022 + fuvh0.a(enumMap0, fuvg6) * -0.0005)) + 1.0);
                    fvuu0 = f < 0.5 ? new fvuu(2, 1.0 - f) : new fvuu(1, f);
                }
            }
        label_79:
            futr futr0 = fuvj0.c;
            fvtg fvtg0 = fvuc0 == null ? null : fvuc0.c;
            if(fvtg0 == null) {
                z = true;
                fvuu1 = fuvj.a;
            }
            else {
                fvui fvui0 = fvtg0.c;
                if(fvui0 == null) {
                    z = true;
                    fvuu1 = fuvj.a;
                }
                else {
                    List list2 = futr0.a;
                    if(list2.size() < 4) {
                        futr0.a(fvtg0);
                        fvuu1 = fuvj.a;
                        z = true;
                    }
                    else {
                        boolean z1 = false;
                        for(Object object1: list2) {
                            if(fvtx.a(fvui0, ((fvtg)object1).c) > Math.max(fvui0.c / 1000, 200)) {
                                z1 = true;
                                break;
                            }
                        }
                        futr0.a(fvtg0);
                        if(z1) {
                            fvuu1 = new fvuu(2, 0.5);
                            z = true;
                        }
                        else {
                            z = true;
                            fvuu1 = new fvuu(1, 0.5);
                        }
                    }
                }
            }
            fvuu fvuu2 = fuvj.a;
            if(fvuu0 != fvuu2 || fvuu1 == fvuu2) {
                fvuu1 = fvuu0;
            }
            long v5 = SystemClock.elapsedRealtime();
            if(fvuu1 == fvuu2 && fuvj0.a()) {
                fvuu1 = fuvj0.g;
            }
            else if(fvuu0 == fvuu2 && fuvj0.i && fuvj0.a()) {
                fvuu1 = fuvj0.g;
            }
            else {
                if(fvuu1 != fvuu0) {
                    z = false;
                }
                fuvj0.i = z;
                fuvj0.g = fvuu1;
                fuvj0.h = v5;
            }
            if(fuvj0.k != 0 && fvuu1 != fvuu2 && fuvj0.k != fvuu1.b) {
                if(v5 - fuvj0.j > 50000L) {
                    fuvj0.j = v5;
                }
                else {
                    fvuu1 = fvuu2;
                }
            }
            if(fvuu1 != fvuu2) {
                fuvj0.k = fvuu1.b;
            }
            fwtu0.t(10, 0, fvuu1, false);
            fvty fvty0 = this.D;
            SystemClock.elapsedRealtime();
            fvua fvua1 = fvuc0.a;
            if(fvua1 != null) {
                fvty0.a = fvua1.d;
            }
            long v7 = fvty0.b;
            long v8 = 0x8000000000000000L;
            long v9 = fvuc0.c == null ? 0x8000000000000000L : Math.max(0x8000000000000000L, fvuc0.c.d);
            fvux fvux0 = fvuc0.b;
            if(fvux0 != null) {
                fvvj fvvj0 = fvux0.b;
                if(fvvj0 != null) {
                    for(int v6 = 0; v6 < fvvj0.d(); ++v6) {
                        v8 = Math.max(v8, fvvj0.n(v6));
                    }
                    v9 = Math.max(v9, v8);
                    fvty0.c = Math.max(fvty0.c, v8);
                }
            }
            fvty0.b = Math.max(v7, v9);
        }
    }

    @Override  // fwyz
    public final void mS(fvta fvta0) {
        fvty fvty0 = this.D;
        fvvj fvvj0 = fvta0.a();
        if(fvvj0 != null) {
            long v = Math.max(0x8000000000000000L, fvvj0.m());
            for(int v1 = 0; v1 < fvvj0.d(); ++v1) {
                v = Math.max(v, fvvj0.n(v1));
            }
            fvty0.b = Math.max(fvty0.b, v);
            fvty0.c = Math.max(fvty0.c, v);
        }
        fvty0.b = Math.max(fvty0.b, fvta0.b.f);
    }

    @Override  // fwxt
    public final boolean mT() {
        return this.C.e();
    }

    @Override  // fwym
    public final boolean mU() {
        LocationManager locationManager0 = (LocationManager)this.a.getSystemService("location");
        try {
            return locationManager0.isProviderEnabled("gps");
        }
        catch(SecurityException unused_ex) {
            return false;
        }
        catch(IllegalArgumentException unused_ex) {
            return false;
        }
    }

    @Override  // futh
    public final void mV(fvut fvut0, boolean z) {
        fwqt fwqt0 = this.t;
        fwqw fwqw0 = (fwqw)fwqt0.n;
        SleepSegmentRequest sleepSegmentRequest0 = fwqw0.t();
        if(!huwz.m() || sleepSegmentRequest0 != null && sleepSegmentRequest0.c()) {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("location:key:sleep_segment_with_window", z);
            fwqw0.F(fwqt0.a, fvut0, bundle0, fwqt0.k);
        }
        this.x((z ? "LAST_SLEEP_SEGMENT_MILLIS" : "LAST_THIRD_PARTY_SLEEP_SEGMENT_MILLIS"));
    }

    @Override  // fwzo
    public final fvnb mW(Set set0, Map map0, String s, int v, long v1, fvlt fvlt0, String s1, gwth gwth0) {
        fwux fwux0 = this.k;
        fvkr fvkr0 = new fvkr(fvlt0, fwux0.a());
        fvnm fvnm0 = new fvnm();
        fvnm0.a = set0;
        fvnm0.b = v == 22;
        fvnm0.b(300000L);
        byte[] arr_b = this.n.b();
        fvnm0.q = 2;
        fvnm0.c = s;
        fvnm0.d = arr_b;
        fvnm0.k = false;
        fvnm0.e = v1;
        fvnm0.l = null;
        fvnm0.m = gwth0;
        fvnm0.n = fvlg.c;
        fvnm0.o = fvlg.b;
        fvnm0.f = huwo.a.f().c();
        fvnm0.g = huwo.a.f().b();
        if(huwo.a.f().j()) {
            fvnm0.p = true;
        }
        RealCollectorConfig realCollectorConfig0 = fvnm0.a();
        realCollectorConfig0.v = true;
        for(Object object0: map0.entrySet()) {
            realCollectorConfig0.d(((fvns)((Map.Entry)object0).getKey()), ((Integer)((Map.Entry)object0).getValue()).intValue());
        }
        Context context0 = this.z("location_accuracy");
        fybc fybc0 = new fybc(s1);
        return new fvoe(fwux0, context0, realCollectorConfig0, this.m, this.i, v, fvkr0, fybc0, this.b, "SensorCollector");
    }

    @Override  // fwxt
    public final fwvq mX() {
        return new fwvq(this.l, this.k, this.b);
    }

    @Override  // fwze
    public final fwza n() {
        return this.y;
    }

    @Override  // fwze
    public final fwzd o() {
        return this.x;
    }

    @Override  // fwze
    public final fwzh p(fvtb fvtb0) {
        hedy hedy0 = new hedy(this.a, this, fvtb0);
        fwzh fwzh0 = new heea(hedy0, new heee(this, fvtb0), this, fvtb0);
        fwzh0.h.h = fwzh0;
        ((heea)fwzh0).g(Boolean.valueOf(fwzh0.h.i));
        heeh heeh0 = new heeh(hedy0, this.a);
        this.f.c.execute(heeh0);
        return fwzh0;
    }

    @Override  // fwze
    public final fwzm q() {
        return this.o;
    }

    @Override  // fwze
    public final fwzo r() {
        return this;
    }

    @Override  // fwze
    public final fwzp s() {
        return this.k;
    }

    @Override  // fwze
    public final fwzr t() {
        return this.z;
    }

    @Override  // fwze
    public final fwzv u() {
        return this.w;
    }

    @Override  // fwze
    public final fwzx v() {
        return this.i;
    }

    @Override  // fwze
    public final boolean w() {
        LocationManager locationManager0 = (LocationManager)this.a.getSystemService("location");
        return locationManager0 == null ? true : locationManager0.isLocationEnabled();
    }

    public final void x(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0).edit();
        sharedPreferences$Editor0.putLong(s, this.e.c());
        sharedPreferences$Editor0.commit();
    }

    public final void y() {
        fwtu fwtu0 = this.c;
        if(fwtu0.q.G()) {
            fwtu0.e.g(23);
            fxby fxby0 = fwtu0.q;
            fxby0.F();
            if(fxby0.b != null) {
                fxby0.k();
                fxby0.a.remove(fxby0.b);
                fxcw fxcw0 = fxby0.b;
                if(fxcw0 != null) {
                    fxcw0.s(false);
                }
                fxby0.b = null;
            }
            fyat fyat0 = fwtu0.u;
            if(fyat0 != null) {
                fyat0.a = false;
                fwtu0.u = null;
            }
        }
        this.k.g(true);
    }

    private final Context z(String s) {
        Map map0 = this.v;
        if(map0.containsKey(s)) {
            return (Context)map0.get(s);
        }
        Context context0 = ModuleManager.requireSubmoduleContext(this.a, s);
        map0.put(s, context0);
        return context0;
    }
}

