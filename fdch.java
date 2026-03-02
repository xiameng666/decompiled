import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.wearable.consent.ConsentSyncTaskService;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public final class fdch implements fduo {
    public static fdch a;
    public final bblg b;
    public final bblf c;
    public ExecutorService d;
    public final fdpl e;
    public final fdab f;
    public OnAccountsUpdateListener g;
    public cchj h;
    public final Context i;
    public TracingBroadcastReceiver j;
    public final List k;
    public final fdqk l;
    public final fced m;
    public final fdye n;
    public fffh o;
    private final fdvl p;
    private final fciy q;
    private final felm r;

    public fdch(Context context0, fdvl fdvl0, fdye fdye0, fdpl fdpl0, fdab fdab0, fciy fciy0, felm felm0, fced fced0, fdqk fdqk0) {
        bblg bblg0 = new bblg(10);
        this.b = bblg0;
        this.c = new bblf(bblg0);
        this.j = null;
        this.i = context0;
        this.p = fdvl0;
        this.n = fdye0;
        this.e = fdpl0;
        this.f = fdab0;
        this.q = fciy0;
        this.k = new ArrayList();
        this.r = felm0;
        this.m = fced0;
        this.l = fdqk0;
    }

    public final evql a(int v, List list0, String s, String s1, String s2, String s3, List list1, boolean z, boolean z1) {
        evql evql0;
        int v3;
        String s6;
        String s5;
        String s4 = s1;
        if(ffgp.m()) {
            return evrg.c(new IllegalStateException("Terms not available on watch"));
        }
        if(fdci.a(ffgp.m()) && z1) {
            if(s2 != null) {
                s5 = s;
                s6 = s2;
                goto label_11;
            }
            return evrg.c(new IllegalStateException("Node ID not provided for consents per watch."));
        }
        else {
            s5 = s;
            s6 = null;
        }
    label_11:
        if(!fddg.e(v, s5, s4)) {
            return evrg.c(new IllegalStateException("Consent requires parent and child Gaia Id: " + v));
        }
        Context context0 = this.i;
        gged_interceptors gged0 = fddj.e(v, context0, z);
        if(gged0 == null) {
            return evrg.c(new IllegalArgumentException("Invalid TermsContext " + v));
        }
        if(!fddg.d(gged0, list0)) {
            return evrg.c(new IllegalStateException("Accepted terms contains invalid term type for termsContext " + v));
        }
        gqtz gqtz0 = gqtz.WK;
        ArrayList arrayList0 = new ArrayList();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        grjx0.a(fddg.c(gged0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp0.b_message;
        grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy0.getClass();
        grnk0.j = grjy0;
        grnk0.b |= 0x200;
        grnk grnk1 = (grnk)hftp0.N_build();
        int v1 = ((ggna)gged0).c;
        int v2 = 0;
        while(v2 < v1) {
            fddf fddf0 = (fddf)gged0.get(v2);
            gqub gqub0 = fddf0.e;
            if(gqub0 == null) {
                if(Log.isLoggable("wearable.ARI", 2)) {
                    Log.v("wearable.ARI", "ARI event name is null in term type " + fddf0.f);
                }
                v3 = v2;
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grku.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((grku)hftp1.b_message).c = gqub0.mk;
                ((grku)hftp1.b_message).b |= 1;
                grkv grkv0 = fdab.a(list0.contains(Integer.valueOf(fddf0.f)));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grku grku0 = (grku)hftp1.b_message;
                grkv0.getClass();
                grku0.d = grkv0;
                grku0.b |= 2;
                v3 = v2;
                arrayList0.add(fdab.e(gqtz0, grnk1, hftp1, s5, s4, s2));
            }
            v2 = v3 + 1;
            s5 = s;
            s4 = s1;
            gqtz0 = gqtz0;
        }
        if(!arrayList0.isEmpty()) {
            if(s1 == null) {
                fdab.f(context0, arrayList0);
            }
            else {
                fdab.c(context0, arrayList0, gqtt.er.eR);
            }
        }
        else if(Log.isLoggable("wearable.ARI", 4)) {
            Log.i("wearable.ARI", "No termInfos passed in with ARI event name");
        }
        Integer integer0 = (int)5;
        if(!list0.contains(integer0)) {
            if(list1 != null && list1.contains(integer0) && !gfta.c(s2)) {
                evql0 = this.q.d(s2, gico.p);
                ffnc.c("wearable.Consents", "enableBackupSkipped", evql0);
            }
            else {
                evql0 = evrg.d(null);
            }
        }
        else if(!gfta.c(s2) && !gfta.c(s3)) {
            evql0 = this.q.c(s2, s3);
            ffnc.c("wearable.Consents", "enableBackupInSetup", evql0);
        }
        else {
            Log.w("wearable.Consents", "acceptTerms called with TermType.BACKUP but missing nodeId or accountName.");
            evql0 = evrg.d(null);
        }
        ArrayList arrayList1 = new ArrayList();
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            arrayList1.add(Integer.valueOf(((fddf)object0).f));
        }
        ffco ffco0 = !fdci.a(ffgp.m()) || s6 == null ? this.h() : this.j(s6);
        fdco fdco0 = fdco.a();
        if(ffco0 != null) {
            fdco0.e(ffco0);
        }
        Integer integer1 = (int)1;
        if(arrayList1.contains(integer1)) {
            boolean z2 = list0.contains(integer1);
            fdco0.f(fdcn.a, z2);
        }
        Integer integer2 = (int)3;
        if(arrayList1.contains(integer2)) {
            boolean z3 = list0.contains(integer2);
            fdco0.f(fdcn.c, z3);
        }
        Integer integer3 = (int)2;
        if(arrayList1.contains(integer3)) {
            boolean z4 = list0.contains(integer3);
            fdco0.f(fdcn.b, z4);
        }
        ffco ffco1 = !fdci.a(ffgp.m()) || s6 == null ? fdco0.b() : fdco0.d(s6, hfyn.l());
        fdby fdby0 = fdci.a(ffgp.m()) && z1 ? new fdbr(this, ffco1) : new fdby(this, ffco1);
        evql evql1 = ffnc.a(3, this.d, ((gful_cronetEngineProvider)fdby0));
        evql1.b(new fdbz(this));
        return hzwh.c() ? evql1 : evrg.f(new evql[]{evql1, evql0});
    }

    public final evql b(String s, String s1, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return evrg.d(null);
        }
        evql evql0 = this.d(s);
        evql0.b(new fdbs(this, s1, z));
        return evql0.g(new fdbt());
    }

    final evql c(boolean z) {
        if(hzvd.f()) {
            if(Log.isLoggable("wearable.Consents", 3)) {
                Log.d("wearable.Consents", "using capability service to get connected nodes");
            }
            return evrg.d(((ggfp)Collection.-EL.stream(this.l.v(this.e, "consents_per_watch", 0)).filter(new fdbu(z)).map(new fdbv()).collect(ggaf.b)));
        }
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "using capability client to get connected nodes");
        }
        evql evql0 = this.m.g("consents_per_watch", 0).g(new fdbw());
        evql0.A(new fdbx());
        return evql0;
    }

    public final evql d(String s) {
        evqp evqp0 = new evqp();
        this.d.execute(new fdcc(this, evqp0, s));
        return evqp0.a;
    }

    public final evql e(String s, fdcn fdcn0, boolean z, String s1) {
        ffco ffco1;
        ffco ffco0 = !fdci.a(ffgp.m()) || s == null ? this.h() : this.j(s);
        fdco fdco0 = fdco.a();
        if(ffco0 == null) {
            IllegalStateException illegalStateException0 = new IllegalStateException("Consent not available");
            if(!hzvd.a.c().d()) {
                return evrg.c(illegalStateException0);
            }
            Log.w("wearable.Consents", "Expected to have consent data item from TOS, but it is missing. Defaulting to empty consents.", illegalStateException0);
        }
        else {
            fdco0.e(ffco0);
        }
        fdco0.f(fdcn0, z);
        if(fdci.a(ffgp.m()) && s != null) {
            if(hzvd.d()) {
                ffco1 = fdco0.c(s, s1);
                return fdbf.i(this.i).e(ffco1);
            }
            ffco1 = fdco0.d(s, hfyn.l());
            return fdbf.i(this.i).e(ffco1);
        }
        ffco ffco2 = hzvd.d() ? fdco0.c(null, s1) : fdco0.b();
        evqp evqp0 = new evqp();
        this.s(ffco2, evqp0);
        return evqp0.a;
    }

    public final evql f() {
        gged_interceptors gged0;
        if(!hzyz.c()) {
            if(Log.isLoggable("wearable.Consents", 3)) {
                Log.d("wearable.Consents", "sWAADL feature Disabled");
            }
            return evrg.c(new IllegalStateException("Feature disabled"));
        }
        ffco ffco0 = this.h();
        if(ffco0 == null) {
            return evrg.c(new IllegalStateException("Consent record not available"));
        }
        try {
            gged0 = this.l();
        }
        catch(Exception exception0) {
            if(Log.isLoggable("wearable.Consents", 5)) {
                Log.w("wearable.Consents", "Unable to retrieve accounts", exception0);
            }
            return evrg.c(exception0);
        }
        HashMap hashMap0 = new HashMap();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            Account account0 = (Account)gged0.get(v1);
            hashMap0.put(account0.name, fdck.b(this.i).a(account0).i(4));
        }
        evqp evqp0 = new evqp();
        gmbu.a(hashMap0.values()).c(() -> {
            boolean z;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffco0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffco0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffco)hftp0.b_message).f = hfvv.a;
            for(Object object0: hashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    z = ((Boolean)((gmcd)map$Entry0.getValue()).get()).booleanValue();
                }
                catch(CancellationException | ExecutionException | InterruptedException exception0) {
                    if(Log.isLoggable("wearable.Consents", 5)) {
                        Log.w("wearable.Consents", "Couldn\'t retrieve account consents", exception0);
                    }
                    z = false;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fewv.a).v_newBuilder();
                String s = (String)map$Entry0.getKey();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((fewv)hftv0).b |= 1;
                ((fewv)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fewv fewv0 = (fewv)hftp1.b_message;
                fewv0.b |= 2;
                fewv0.d = z;
                fewv fewv1 = (fewv)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffco ffco1 = (ffco)hftp0.b_message;
                fewv1.getClass();
                hfuo hfuo0 = ffco1.f;
                if(!hfuo0.c()) {
                    ffco1.f = ProtoLiteMessage.E(hfuo0);
                }
                ffco1.f.add(fewv1);
            }
            if(Log.isLoggable("wearable.Consents", 3)) {
                Log.d("wearable.Consents", "Writing sWAADL consent");
            }
            this.s(((ffco)hftp0.N_build()), evqp0);
        }, this.d);
        return evqp0.a;
    }

    public final evql g(int v, int v1, boolean z, String s, String s1, boolean z1, String s2) {
        String s3 = s1;
        if(ffgp.m()) {
            return evrg.c(new IllegalStateException("Terms not available on watch"));
        }
        String s4 = s;
        if(!fddg.e(v, s4, s3)) {
            return evrg.c(new IllegalStateException("Consent requires parent and child Gaia Id: " + v));
        }
        Context context0 = this.i;
        gged_interceptors gged0 = fddj.e(v, context0, z1);
        if(gged0 == null) {
            return evrg.c(new IllegalArgumentException("Invalid TermsContext " + v));
        }
        Integer integer0 = v1;
        if(!fddg.d(gged0, gged_interceptors.l(integer0))) {
            return evrg.c(new IllegalStateException(a.z(v, v1, "Invalid termType ", " for termsContext ")));
        }
        Boolean boolean0 = Boolean.valueOf(z);
        gqtz gqtz0 = gqtz.WJ;
        ArrayList arrayList0 = new ArrayList();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        grjx0.a(fddg.c(gged0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp0.b_message;
        grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy0.getClass();
        grnk0.j = grjy0;
        grnk0.b |= 0x200;
        grnk grnk1 = (grnk)hftp0.N_build();
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            fddf fddf0 = (fddf)object0;
            int v2 = fddf0.f;
            if(integer0.equals(Integer.valueOf(v2))) {
                gqub gqub0 = fddf0.e;
                if(gqub0 == null) {
                    if(!Log.isLoggable("wearable.ARI", 3)) {
                        continue;
                    }
                    Log.d("wearable.ARI", "ARI event name is null in term type " + v2);
                }
                else {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grku.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((grku)hftp1.b_message).c = gqub0.mk;
                    ((grku)hftp1.b_message).b |= 1;
                    boolean0.getClass();
                    grkv grkv0 = fdab.a(z);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grku grku0 = (grku)hftp1.b_message;
                    grkv0.getClass();
                    grku0.d = grkv0;
                    grku0.b |= 2;
                    arrayList0.add(fdab.e(gqtz0, grnk1, hftp1, s4, s3, s2));
                    s4 = s;
                    s3 = s1;
                    grnk1 = grnk1;
                }
            }
            else {
                s4 = s;
                s3 = s1;
            }
        }
        if(!arrayList0.isEmpty()) {
            if(s1 == null) {
                fdab.f(context0, arrayList0);
            }
            else {
                fdab.c(context0, arrayList0, gqtt.er.eR);
            }
        }
        else if(Log.isLoggable("wearable.ARI", 4)) {
            Log.i("wearable.ARI", String.format("Term Type %d does not have a corresponding TermInfo with a non-null ARI event name", integer0));
        }
        switch(v1) {
            case 1: {
                return this.e(s2, fdcn.a, z, null);
            }
            case 2: {
                return this.e(s2, fdcn.b, z, null);
            }
            case 3: {
                return this.e(s2, fdcn.c, z, null);
            }
            default: {
                return evrg.c(new IllegalStateException("Invalid term type for recordTermConsent"));
            }
        }
    }

    public final ffco h() {
        fduq fduq0 = fdur.e(this.p, "*", "/privacy_settings");
        if(fduq0 == null) {
            if(Log.isLoggable("wearable.Consents", 5)) {
                Log.w("wearable.Consents", "Global consent not available");
            }
            return null;
        }
        return fdch.t(fduq0);
    }

    public final ffco i() {
        if(ffgp.m() && fdci.a(true)) {
            return this.j(this.n.a().a);
        }
        fdny.a(fdnq.c);
        return this.h();
    }

    public final ffco j(String s) {
        ffco ffco0 = this.k(s);
        if(ffco0 == null) {
            fdny.a(fdnq.c);
            return this.h();
        }
        fdny.a(fdnq.d);
        return ffco0;
    }

    public final ffco k(String s) {
        fduq fduq0 = fdur.e(this.p, "*", "/privacy_settings/" + s);
        if(fduq0 == null) {
            if(Log.isLoggable("wearable.Consents", 4)) {
                Log.i("wearable.Consents", "Consent data item does not exist for " + s);
            }
            return null;
        }
        return fdch.t(fduq0);
    }

    public final gged_interceptors l() {
        gged_interceptors gged0 = gged_interceptors.k(acso.m(this.i));
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "Got " + ((ggna)gged0).c + " accounts");
        }
        return gged0;
    }

    public final void m(fduq fduq0, String s, String s1, String s2) {
        String s3;
        if(Log.isLoggable("wearable.Consents", 3)) {
            s3 = s;
            Log.d("wearable.Consents", a.ai(s3, s2, s1, "Propagating ", " consent to listeners. Reason: ", " nodeIdOverride: "));
        }
        else {
            s3 = s;
        }
        ffco ffco0 = fdch.t(fduq0);
        if(s3 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffco0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffco0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffco ffco1 = (ffco)hftp0.b_message;
            ffco1.b |= 16;
            ffco1.g = s3;
            ffco0 = (ffco)hftp0.N_build();
        }
        if(hzvd.e() && ffgp.m()) {
            ConsentSyncTaskService.d(this.i, ffco0);
        }
        fffh fffh0 = this.o;
        if(fffh0 != null) {
            fffh0.a(ffco0);
        }
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(ffgp.a.equals(fduq0.a) || Objects.equals(fduq0.a, ffgp.b)) {
                if(fdci.a(ffgp.m())) {
                    String s = fduq0.b.b;
                    if(!s.startsWith("/privacy_settings/")) {
                        if(s.equals("/privacy_settings")) {
                            if(Log.isLoggable("wearable.Consents", 3)) {
                                Log.d("wearable.Consents", "Received global consent update checking to see if should alert listeners.");
                            }
                            if(ffgp.m()) {
                                fdye fdye0 = this.n;
                                String s1 = fdye0.a().a;
                                if(this.r(s1)) {
                                    evql evql0 = this.c(true);
                                    evql0.b(new fdbl(this, s1, fduq0));
                                    evql0.A(new fdbm(this, fduq0));
                                }
                                else {
                                    this.m(fduq0, fdye0.a().a, "global", "Watch specific consents do not exist");
                                }
                            }
                            else {
                                fczq[] arr_fczq = this.r.v("");
                                HashSet hashSet0 = new HashSet();
                                this.c(false).z(new fdbg(this, hashSet0, arr_fczq, fduq0));
                            }
                        }
                    }
                    else if(!ffgp.m() || s.equals("/privacy_settings/" + this.n.a().a)) {
                        this.m(fduq0, null, "watch specific", "Received updated consent data item: " + s);
                    }
                }
                else if(Objects.equals(fduq0.b.b, "/privacy_settings")) {
                    if(Log.isLoggable("wearable.Consents", 3)) {
                        Log.d("wearable.Consents", "Consent changed");
                    }
                    ffco ffco0 = fdch.t(fduq0);
                    if(hzvd.e() && ffgp.m()) {
                        ConsentSyncTaskService.d(this.i, ffco0);
                    }
                    fffh fffh0 = this.o;
                    if(fffh0 != null) {
                        fffh0.a(ffco0);
                    }
                }
            }
        }
    }

    public final void p() {
        ffnc.c("wearable.Consents", "recordSwaadlOptIn", this.f());
    }

    public final void q(fduq fduq0) {
        if(Log.isLoggable("wearable.Consents", 5)) {
            Log.w("wearable.Consents", "Unable to delete consents per watch, so replacing it with global consents to keep them aligned.");
        }
        fdbf fdbf0 = fdbf.i(this.i);
        ffco ffco0 = fdch.t(fduq0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffco0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ffco0));
        String s = this.n.a().a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco1 = (ffco)hftp0.b_message;
        s.getClass();
        ffco1.b |= 16;
        ffco1.g = s;
        ffnc.c("wearable.Consents", "updateOptInConsent", fdbf0.f(((ffco)hftp0.N_build()), false));
    }

    public final boolean r(String s) {
        fdpl fdpl0;
        if(ffgp.k()) {
            fdpl0 = ffgp.b;
            if(fdpl0 == null) {
                return false;
            }
        }
        else {
            fdpl0 = ffgp.a;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("wear").authority("*");
        try(Cursor cursor0 = this.p.c(fdpl0, uri$Builder0.path("/privacy_settings/" + s).build())) {
            return cursor0.getCount() > 0;
        }
        return true;
    }

    private final void s(ffco ffco0, evqp evqp0) {
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", "Saving wearable consent to record");
        }
        fdun fdun0 = new fdun(this.n.a().a, "/privacy_settings");
        fdun0.e = ffco0.toBytesArray();
        gmbu.t(this.p.o(this.e, fdun0), new fdcf(this, evqp0), this.d);
    }

    private static final ffco t(fduq fduq0) {
        try {
            byte[] arr_b = fduq0.b.c();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffco.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (ffco)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalStateException("Failed to parse consent record from dataitem", hfur0);
        }
    }
}

