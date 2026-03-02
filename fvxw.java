import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.DetectedActivity;
import j..time.Instant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class fvxw {
    public final Context a;
    public final Executor b;
    public cnxm c;
    public final gpuy d;
    public final List e;
    private static final DetectedActivity f;
    private static final DetectedActivity g;
    private static final long[] h;
    private static final SimpleDateFormat i;
    private final cnvz j;
    private final cmry k;
    private cczf l;
    private final List m;
    private long n;

    static {
        fvxw.f = new DetectedActivity(3, 100);
        fvxw.g = new DetectedActivity(0, 100);
        fvxw.h = new long[]{0x606E62L};
        fvxw.i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    }

    public fvxw(Context context0) {
        bbll bbll0 = new bbll(1, 9);
        super();
        this.e = new ArrayList();
        this.m = new ArrayList();
        this.n = 0L;
        this.a = context0;
        if(huqy_phenotype.B()) {
            this.l = cgcs.v();
        }
        this.j = cnvz.c();
        this.b = bbll0;
        this.k = !huvv.f() || !bbqa.a() ? null : new cmry();
        this.d = new gpuy();
    }

    public final void a() {
        int v10;
        boolean z1;
        boolean z;
        DetectedActivity detectedActivity2;
        synchronized(this) {
            List list0 = this.m;
            if(list0.size() >= 2) {
                int v1 = 1;
                while(v1 < list0.size()) {
                    DetectedActivity detectedActivity0 = fvxw.f;
                    long v2 = jyg.c(((fvxv)list0.get(v1)).a);
                    long v3 = jyg.c(((fvxv)list0.get(v1 - 1)).a);
                    int v4 = 0;
                    for(Object object0: this.e) {
                        long v5 = ((fuxg)object0).c;
                        DetectedActivity detectedActivity1 = fuxd.a(((fuxg)object0).b());
                        if(Math.abs(v5 - v2) >= 240000L && (v5 <= v3 || v5 >= v2)) {
                            v4 = v4;
                        }
                        else {
                            if(fyac.a(detectedActivity1) > fyac.a(detectedActivity0)) {
                                detectedActivity0 = detectedActivity1;
                            }
                            v4 = 1;
                        }
                    }
                    if(v4 == 0) {
                        detectedActivity2 = fvxw.g;
                        z = true;
                    }
                    else {
                        detectedActivity2 = detectedActivity0;
                        z = false;
                    }
                    int v6 = (int)huvv.b();
                    if(bbqa.a()) {
                        cmry cmry0 = this.k;
                        if(cmry0 != null) {
                            Long long0 = cmry0.a(((fvxv)list0.get(v1)).a.getLatitude(), ((fvxv)list0.get(v1)).a.getLongitude());
                            if(long0 != null) {
                                v6 = new ggym(((long)long0)).j();
                            }
                        }
                    }
                    Location location0 = ((fvxv)list0.get(v1)).a;
                    Location location1 = ((fvxv)list0.get(v1 - 1)).a;
                    long v7 = Math.abs(jyg.c(location0) - jyg.c(location1));
                    int v8 = cmol.a(location0);
                    int v9 = cmol.a(location1);
                    if(v8 == 2) {
                        if(fyac.c(location0)) {
                            if(v9 == 2) {
                                v8 = 2;
                                v9 = 2;
                                goto label_49;
                            }
                            else {
                                v8 = 2;
                                goto label_52;
                            }
                            goto label_48;
                        }
                        else {
                        label_48:
                            v8 = 2;
                        }
                    }
                label_49:
                    if(v8 == 2 || !fyac.c(location1) || v9 != 2) {
                        z1 = true;
                    }
                    else {
                    label_52:
                        z1 = false;
                    }
                    fyab fyab0 = fyac.b(v8 == 2, v9 == 2, location0.distanceTo(location1), location1.getAccuracy(), location0.getAccuracy(), z1, v7, detectedActivity2, v6);
                    fvxv fvxv0 = (fvxv)list0.get(v1);
                    fvxv fvxv1 = (fvxv)list0.get(v1 - 1);
                    if(!fyab0.d) {
                        v10 = 2;
                    }
                    else if(fvxv0.a() && !fvxv1.a()) {
                        v10 = fvxv0.d ? 8 : 6;
                    }
                    else if(fvxv0.b) {
                        v10 = 4;
                    }
                    else if(fvxv0.c) {
                        v10 = fvxv0.b() == 3 ? 5 : 7;
                    }
                    else {
                        v10 = 3;
                    }
                    cczf cczf0 = this.l;
                    if(cczf0 != null) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cmyc.a).v_newBuilder();
                        float f = fyab0.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((cmyc)hftv0).b |= 1;
                        ((cmyc)hftv0).c = (long)f;
                        float f1 = fyab0.b;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((cmyc)hftv1).b |= 2;
                        ((cmyc)hftv1).d = (long)f1;
                        long v11 = (long)detectedActivity2.a();
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cmyc cmyc0 = (cmyc)hftp1.b_message;
                        cmyc0.b |= 4;
                        cmyc0.e = v11;
                        long v12 = (long)((fvxv)list0.get(v1)).a.getAccuracy();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cmyc cmyc1 = (cmyc)hftp1.b_message;
                        cmyc1.b |= 0x20;
                        cmyc1.h = v12;
                        int v13 = ((fvxv)list0.get(v1)).b();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp1.b_message;
                        ((cmyc)hftv2).i = v13 - 1;
                        ((cmyc)hftv2).b |= 0x40;
                        float f2 = fyab0.c;
                        if(!hftv2.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp1.b_message;
                        ((cmyc)hftv3).b |= 16;
                        ((cmyc)hftv3).g = (long)f2;
                        if(!hftv3.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((cmyc)hftp1.b_message).f = v10 - 1;
                        ((cmyc)hftp1.b_message).b |= 8;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gixy gixy0 = (gixy)hftp0.b_message;
                        cmyc cmyc2 = (cmyc)hftp1.N_build();
                        cmyc2.getClass();
                        gixy0.I = cmyc2;
                        gixy0.b |= 0x80000000;
                        ((cdgb)cczf0).j(((ProtoLiteMessage)(((gixy)hftp0.N_build()))));
                    }
                    fvxv fvxv2 = (fvxv)list0.get(v1);
                    fvxv fvxv3 = (fvxv)list0.get(v1 - 1);
                    if(huqy_phenotype.q()) {
                        boolean z2 = (v10 == 3 || v10 == 4) && Math.abs(fvxv2.a.distanceTo(fvxv3.a)) > 100000.0f;
                        if((this.l == null ? v10 != 2 : z2 || v10 != 2 && v10 != 3 && v10 != 4 && v10 != 8)) {
                            boolean z3 = fyab0.e;
                            float f3 = fyab0.a;
                            float f4 = fyab0.b;
                            float f5 = f3 / Math.max(fyab0.c, 1.0f);
                            Location location2 = ((fvxv)list0.get(v1)).a;
                            Location location3 = ((fvxv)list0.get(v1 - 1)).a;
                            Context context0 = this.a;
                            if(bbmn.x(context0) && !this.d(location2.getTime())) {
                                StringBuilder stringBuilder0 = new StringBuilder();
                                stringBuilder0.append("\nLocation Time: ");
                                Long long1 = location2.getTime();
                                stringBuilder0.append(fvxw.i.format(long1));
                                stringBuilder0.append(" (elapsedRealtimeMs: ");
                                stringBuilder0.append(jyg.c(location2));
                                stringBuilder0.append(")\nPrevious Location Time: ");
                                Long long2 = location3.getTime();
                                stringBuilder0.append(fvxw.i.format(long2));
                                stringBuilder0.append(" (elapsedRealtimeMs: ");
                                stringBuilder0.append(jyg.c(location3));
                                stringBuilder0.append(")\nspeed (m/s): ");
                                stringBuilder0.append(f4);
                                stringBuilder0.append("\ndistance (m): ");
                                stringBuilder0.append(f3);
                                stringBuilder0.append("\nactivity: ");
                                stringBuilder0.append(DetectedActivity.b(detectedActivity2.a()));
                                stringBuilder0.append("\nprovider transition: ");
                                stringBuilder0.append(fvxw.c(location3));
                                stringBuilder0.append(" -> ");
                                stringBuilder0.append(fvxw.c(location2));
                                stringBuilder0.append("\nz-score: " + f5);
                                if(z) {
                                    stringBuilder0.append("\nnoActivityFound");
                                }
                                cnwr.a(context0, (z3 ? "Poor Location Accuracy" : "Unexpected Location Jump"), Instant.now().toEpochMilli(), "background-location-bug-triage@google.com", stringBuilder0.toString(), fvxw.h, cnwq.e);
                                __monitor_enter(this);
                                try {
                                    cnvq cnvq0 = new cnvq(gged_interceptors.m(Long.valueOf(this.n), Long.valueOf(location2.getTime())));
                                    ((glyq)this.j.f(cnvq0)).u();
                                }
                                catch(ExecutionException throwable0) {
                                    __monitor_exit(this);
                                    throw throwable0;
                                }
                                catch(InterruptedException | Throwable unused_ex) {
                                }
                            }
                        }
                        else {
                            ++v1;
                            continue;
                        }
                        break;
                    }
                    ++v1;
                }
                fvxv fvxv4 = (fvxv)gggq.p(this.m);
                this.m.clear();
                this.m.add(fvxv4);
                ArrayList arrayList0 = new ArrayList();
                List list1 = this.e;
                for(Object object1: list1) {
                    fuxg fuxg0 = (fuxg)object1;
                    if(jyg.c(fvxv4.a) - fuxg0.c > 240000L) {
                        arrayList0.add(fuxg0);
                    }
                }
                list1.removeAll(arrayList0);
            }
        }
    }

    public final void b(fvxv fvxv0) {
        synchronized(this) {
            gptu_Position gptu0 = fvxs.a(fvxv0.a);
            if(gptu0 != null) {
                this.d.c(gptu0);
            }
            this.m.add(fvxv0);
        }
    }

    private static String c(Location location0) {
        int v = cmol.a(location0);
        switch(v) {
            case 0: {
                return "unknown";
            }
            case 1: {
                return "GPS";
            }
            case 2: {
                return "Cell";
            }
            case 3: {
                return "Wifi";
            }
            default: {
                return Integer.toString(v);
            }
        }
    }

    private final boolean d(long v) {
        synchronized(this) {
            cnvr cnvr0 = new cnvr();
            int v2 = 0;
            for(Object object0: ((List)cnvz.i(this.j.d(cnvr0, ggna.a), ggna.a))) {
                long v3 = (long)(((Long)object0));
                if(v3 > this.n) {
                    this.n = v3;
                }
                long v4 = v - v3;
                if(Long.compare(v4, 86400000L) < 0) {
                    return true;
                }
                if(v4 < 604800000L) {
                    ++v2;
                    if(v2 > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

