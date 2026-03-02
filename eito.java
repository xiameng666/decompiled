import android.accounts.Account;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class eito extends eiud {
    public static final int a;
    private static final bboh e;
    private static actv f;
    private static final gful_cronetEngineProvider g;

    static {
        eito.e = bboh.b("GmsHeterodyneSyncer", bbcu.al);
        eito.g = gfus.a(((gful_cronetEngineProvider)new eitn()));
    }

    public eito(Context context0, eiox eiox0, eiox eiox1, eiuo eiuo0, fpjt fpjt0) {
        super(context0, eiox0, eiox1, eiuo0, fpjt0, 2, new eitm());
    }

    @Override  // eiud
    protected final hlph b() {
        return eitl.a(this.b);
    }

    @Override  // eiud
    protected final String c(String s) {
        if(s != null) {
            try {
                Context context0 = this.b;
                adgg adgg0 = new adgg(context0);
                String s1 = hxly.g();
                return adgg0.d(context0, new Account(s, "com.google"), s1, null);
            }
            catch(IOException iOException0) {
                a.ae(eito.e.i(), "IOException on getting auth token", iOException0);
                throw new eipa(0x7340, "Failed getting auth token due to a transient error.");
            }
            catch(acse acse0) {
                a.ae(eito.e.i(), "Failed getting auth token", acse0);
                return null;
            }
        }
        ((ggtj)eito.e.j()).x("No account for auth token provided");
        return null;
    }

    @Override  // eiud
    protected final String d() {
        return (String)eipv.b.b();
    }

    @Override  // eiud
    protected final void e(String s) {
        try {
            Context context0 = this.b;
            if(!adgh.c(context0)) {
                acso.j(this.b, s);
                return;
            }
            if(eito.f == null) {
                eito.f = new adfy(context0.getApplicationContext());
            }
            try {
                evrg.n(eito.f.b(s));
            }
            catch(ExecutionException executionException0) {
                if((executionException0.getCause() instanceof acse)) {
                    throw (acse)executionException0.getCause();
                }
                a.ae(eito.e.j(), "Unexpected exception while clearing token", executionException0);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IOException(interruptedException0);
            }
        }
        catch(acse | IOException exception0) {
            a.ae(eito.e.i(), "Problem clearing auth token", exception0);
        }
    }

    @Override  // eiud
    protected final void f(long v) {
        hlsc hlsc0 = (hlsc)((ProtoLiteMessage)hlsf.a).v_newBuilder();
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        hlrh0.b |= 0x40;
        hlrh0.h = v;
        hlrh hlrh1 = (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
        if(!hlsc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlsc0).ensureMutable();
        }
        hlsf hlsf0 = (hlsf)hlsc0.b_message;
        hlrh1.getClass();
        hlsf0.c = hlrh1;
        hlsf0.b |= 2;
        Context context0 = this.b;
        if(eisa.a().b(context0)) {
            if(!hlsc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlsc0).ensureMutable();
            }
            hlsf.d(((hlsf)hlsc0.b_message));
        }
        cczb cczb0 = chlr.v().c(((ProtoLiteMessage)(((hlsf)((ProtoLiteBuilder)hlsc0).N_build()))));
        cczb0.c = (int)16;
        cczb0.a();
        long v1 = hxly.a.f().f();
        eitp.d(context0, v1, v1 + v1, "PhenotypeSyncAfterRetry", gnzv.f, null);
    }

    @Override  // eiud
    protected final void g(int v) {
        if(((long)v) < hxly.d()) {
            v = (int)hxly.d();
        }
        else if(((long)v) > hxly.c()) {
            v = (int)hxly.c();
        }
        Context context0 = this.b;
        ((ggtj)eitp.a.h()).z("Handling Retry-After: scheduling Phenotype for one-off execution %d from now", v);
        clkn clkn0 = new clkn();
        clkn0.e(((long)v), ((long)(v + 60)));
        clkn0.j = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        clkn0.v(1);
        clkn0.p = true;
        clkn0.t("PhenotypeRetryAfter");
        clkn0.u = eitp.a(gnzv.l);
        clkn0.y(0, 1);
        clkn0.x(0, 0);
        clkn0.i(false);
        eitp.e(context0, clkn0.a());
    }

    @Override  // eiud
    public final String[] h() {
        return eipt.b(this.b);
    }

    @Override  // eiud
    protected final void hA(gnzv gnzv0, ggfp ggfp0, hlrv hlrv0) {
        Set set1;
        List list1;
        HashSet hashSet1;
        Map map0;
        HashSet hashSet0;
        hashSet0 = new HashSet(ggfp0);
        try(eiog eiog0 = this.c.a().a()) {
            map0 = eiue.a(eiog0, ggfp0);
        }
        if(((Set)eito.g.mr()).contains(gnzv0) && hlrv0 != null && (hlrv0.b & 8) == 0 && map0.containsKey(hlrv0.f)) {
            List list0 = (List)map0.get(hlrv0.f);
            PackageUpdateTaskChimeraService.d(this.b, new HashSet(list0), Collections.singletonMap(hlrv0.f, list0), gnzv0);
            return;
        }
        Set set0 = map0.keySet();
        if(set0.isEmpty()) {
            hashSet1 = new HashSet();
        }
        else {
            HashSet hashSet2 = new HashSet();
            ActivityManager activityManager0 = (ActivityManager)this.b.getSystemService("activity");
            if(activityManager0 == null) {
                ((ggtj)eito.e.i()).x("activityManager is null.");
                list1 = null;
            }
            else {
                list1 = activityManager0.getRunningAppProcesses();
            }
            if(list1 != null) {
                hashSet2 = ggog.i(list1.size());
                for(Object object0: list1) {
                    Collections.addAll(hashSet2, ((ActivityManager.RunningAppProcessInfo)object0).pkgList);
                }
            }
            hashSet2.retainAll(set0);
            hashSet1 = hashSet2;
        }
        hxlu hxlu0 = hxlu.a;
        hashSet1.addAll(hxlu0.b().c().b);
        if(hashSet1.isEmpty()) {
            set1 = Collections.EMPTY_SET;
        }
        else {
            set1 = new HashSet();
            for(Object object1: hashSet1) {
                List list2 = (List)map0.get(((String)object1));
                if(list2 != null) {
                    set1.addAll(list2);
                }
            }
        }
        Context context0 = this.b;
        PackageUpdateTaskChimeraService.d(context0, set1, map0, gnzv0);
        hashSet0.removeAll(set1);
        if(!hashSet0.isEmpty()) {
            long v = hxlu0.b().b();
            long v1 = hxlu0.b().a();
            if(v >= 0L) {
                long v2 = v >= v1 ? v : v1;
                ((ggtj)PackageUpdateTaskChimeraService.a.h()).K("Scheduling Phenotype config package catchup updates to be %d seconds from now (%d)", v2, System.currentTimeMillis());
                clkn clkn0 = new clkn();
                clkn0.e(0L, v2);
                clkn0.j = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                clkn0.p = true;
                clkn0.t("PhenotypeCatchupPackageUpdate-OnChargerAndIdle");
                clkn0.x(1, 1);
                clkn0.v(0);
                clkn0.i(true);
                clkn0.y(2, 2);
                cljp.a(context0).d("PhenotypeCatchupPackageUpdate-OnCharger", "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
                PackageUpdateTaskChimeraService.e(context0, clkn0.a());
                clkn clkn1 = new clkn();
                clkn1.e(v2 - TimeUnit.HOURS.toSeconds(1L), v2);
                clkn1.j = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                clkn1.p = true;
                clkn1.t("PhenotypeCatchupPackageUpdate-Timeout");
                clkn1.x(0, 0);
                clkn1.i(false);
                clkn1.v(0);
                clkn1.y(2, 2);
                PackageUpdateTaskChimeraService.e(context0, clkn1.a());
            }
        }
    }

    @Override  // eiud
    protected final void i() {
        bbfj.a();
    }

    @Override  // eiud
    protected final void j() {
        bbfj.b(0x1203);
    }
}

