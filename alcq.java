import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.UserHandle;
import j..time.Instant;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.Comparator.-EL;
import j..util.List.-EL;
import j..util.stream.Collectors;
import j..util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class alcq {
    public static final baun a;
    public final almg b;
    private final Context c;

    static {
        alcq.a = new baun("ProximityAuth", new String[]{"RecentAppsManager"});
    }

    public alcq(almg almg0, Context context0) {
        this.b = almg0;
        this.c = context0;
    }

    public final List a() {
        Set set0 = this.f();
        Map map0 = this.e();
        UserHandle userHandle0 = Process.myUserHandle();
        if(map0 == null) {
            return null;
        }
        HashSet hashSet0 = alcq.g();
        List list0 = (List)((Stream)Collection.-EL.stream(set0).sequential()).map(new alcm(this, userHandle0, hashSet0, map0)).filter(new alch()).map(new alci()).collect(Collectors.toList());
        List.-EL.sort(list0, Comparator.-EL.reversed(Comparator.-CC.comparingLong(new alcn())));
        return list0;
    }

    public final List b() {
        Set set0 = this.f();
        UserHandle userHandle0 = Process.myUserHandle();
        hpzm hpzm0 = hpzm.a;
        HashSet hashSet0 = new HashSet(hpzm0.f().s().b);
        HashSet hashSet1 = alcq.g();
        Map map0 = this.e();
        if(map0 == null) {
            return null;
        }
        List list0 = (List)Collection.-EL.stream(map0.entrySet()).map(new alcj()).filter(new alck(hashSet0, hashSet1, set0)).collect(Collectors.toList());
        List.-EL.sort(list0, Comparator.-EL.reversed(Comparator.-CC.comparingLong(new alcl())));
        List list1 = (List)((Stream)Collection.-EL.stream(list0).sequential()).limit(hpzm0.f().h()).collect(Collectors.toList());
        return list1 == null ? null : ((List)((Stream)Collection.-EL.stream(list1).sequential()).map(new alcg(this, userHandle0)).filter(new alch()).map(new alci()).collect(Collectors.toList()));
    }

    public final void c(alsw alsw0) {
        String s = alsw0.c;
        if(this.f().contains(s)) {
            Map map0 = alpa.b().a;
            synchronized(map0) {
                for(Object object0: map0.values()) {
                    aloz aloz0 = (aloz)object0;
                    aloz0.p(true);
                    if(aloz0.u(alsw0)) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsx.a).v_newBuilder();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alvg.a).v_newBuilder();
                        hftp1.ce(alsw0);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        alsx alsx0 = (alsx)hftp0.b_message;
                        alvg alvg0 = (alvg)hftp1.N_build();
                        alvg0.getClass();
                        alsx0.d = alvg0;
                        alsx0.b |= 2;
                        aloz0.l(((MessageLite)hftp0.N_build()));
                    }
                }
            }
        }
    }

    public static final void d(alsw alsw0) {
        Map map0 = alpa.b().a;
        synchronized(map0) {
            for(Object object0: map0.values()) {
                aloz aloz0 = (aloz)object0;
                aloz0.p(true);
                if(aloz0.u(alsw0)) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsx.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alvg.a).v_newBuilder();
                    hftp1.ce(alsw0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    alsx alsx0 = (alsx)hftp0.b_message;
                    alvg alvg0 = (alvg)hftp1.N_build();
                    alvg0.getClass();
                    alsx0.c = alvg0;
                    alsx0.b |= 1;
                    aloz0.l(((MessageLite)hftp0.N_build()));
                }
            }
        }
    }

    private final Map e() {
        UsageStatsManager usageStatsManager0 = (UsageStatsManager)this.c.getSystemService("usagestats");
        if(usageStatsManager0 == null) {
            alcq.a.f("UsageStatsManager is not available.", new Object[0]);
            return null;
        }
        return usageStatsManager0.queryAndAggregateUsageStats(0L, Instant.now().toEpochMilli());
    }

    private final Set f() {
        PackageManager packageManager0 = this.c.getPackageManager();
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.addCategory("android.intent.category.LAUNCHER");
        return (Set)Collection.-EL.stream(packageManager0.queryIntentActivities(intent0, 0)).map(new alcf()).collect(Collectors.toSet());
    }

    private static final HashSet g() {
        return hpzm.o() ? new HashSet(hpzm.e().b) : new HashSet();
    }
}

