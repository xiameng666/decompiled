import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class bwua {
    public static final ggeo a;
    public final String b;
    public final bwub c;
    public final bxax d;
    public final Object e;
    public final Set f;
    public String g;

    static {
        ggek ggek0 = new ggek();
        ggek0.i("internal.3p:MusicPlaylist", "internal.3p:MusicRecording");
        ggek0.i("internal.3p:MusicGroup", "internal.3p:MusicRecording");
        ggek0.i("internal.3p:MusicAlbum", "internal.3p:MusicRecording");
        bwua.a = ggek0.b();
    }

    public bwua(String s, bwub bwub0) {
        this.e = new Object();
        this.f = new HashSet();
        batl.s(s);
        this.b = s;
        this.c = bwub0;
        this.d = bwub0.a;
    }

    public final boolean A(bwvl bwvl0) {
        synchronized(this.e) {
        }
        return this.f.contains(bwvl0);
    }

    public final boolean B(long v) {
        ApplicationInfo applicationInfo0;
        synchronized(this.d.h) {
            bwpo bwpo0 = this.d.k(this.b);
            boolean z = bwpo0 != null && (bwpo0.b & 4) != 0;
        }
        if(!z) {
            try {
                applicationInfo0 = this.c.c.getApplicationInfo(this.b, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                bwne.t("Could not find app %s", this.b);
                return false;
            }
            GlobalSearchApplicationInfo globalSearchApplicationInfo0 = new GlobalSearchApplicationInfo(this.b, null, applicationInfo0.labelRes, 0, applicationInfo0.icon, null, null, null);
            try {
                this.m(new bwuw(globalSearchApplicationInfo0, 1, v));
            }
            catch(bwvo unused_ex) {
                bwne.t("Implicit gsai conflict with explicit for %s", this.b);
            }
            return true;
        }
        return true;
    }

    private final void C(bwuw bwuw0) {
        GlobalSearchApplicationInfo globalSearchApplicationInfo0 = (GlobalSearchApplicationInfo)bwuw0.e();
        if(globalSearchApplicationInfo0 != null) {
            bxax bxax0 = this.d;
            int v = bwuw0.a();
            long v1 = bwuw0.b();
            String s = globalSearchApplicationInfo0.a;
            if(s == null) {
                return;
            }
            synchronized(bxax0.h) {
                bwpo bwpo0 = bxax0.l(s);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwpo0));
                bwod bwod0 = bwwh.c(globalSearchApplicationInfo0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo bwpo1 = (bwpo)hftp0.b_message;
                bwod0.getClass();
                bwpo1.e = bwod0;
                bwpo1.b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((bwpo)hftv0).b |= 8;
                ((bwpo)hftv0).f = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo bwpo2 = (bwpo)hftp0.b_message;
                bwpo2.b |= 0x40;
                bwpo2.i = v1;
                bxax0.A(s, ((bwpo)hftp0.N_build()));
            }
            return;
        }
        bxax bxax1 = this.d;
        String s1 = this.b;
        synchronized(bxax1.h) {
            bwpo bwpo3 = bxax1.k(s1);
            if(bwpo3 != null) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo3).jf(5, null);
                hftp1.X(((ProtoLiteMessage)bwpo3));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((bwpo)hftv1).e = null;
                ((bwpo)hftv1).b &= -5;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((bwpo)hftv2).b &= -9;
                ((bwpo)hftv2).f = 0;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwpo bwpo4 = (bwpo)hftp1.b_message;
                bwpo4.b &= -65;
                bwpo4.i = 0L;
                bxax1.A(s1, ((bwpo)hftp1.N_build()));
            }
        }
    }

    private final boolean D() {
        return azql.c(this.c.b).g(this.b);
    }

    public final int a() {
        synchronized(this.e) {
        }
        return this.f.size();
    }

    public final int b(boolean z) {
        String s2;
        String s;
        bxax bxax0 = this.d;
        Object object0 = bxax0.h;
        synchronized(object0) {
            s = this.b;
            String s1 = bxax0.o(s);
            s2 = this.f();
            if(s2 != null) {
                if(TextUtils.isEmpty(s1)) {
                    if(!z || this.D()) {
                        __monitor_enter(object0);
                        goto label_10;
                    }
                    __monitor_exit(object0);
                    return 1;
                }
                else {
                    goto label_27;
                }
                goto label_34;
            }
            __monitor_exit(object0);
            return 3;
        }
        try {
        label_10:
            bwpo bwpo0 = bxax0.l(s);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwpo0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwpo bwpo1 = (bwpo)hftp0.b_message;
            bwpo1.b |= 1;
            bwpo1.c = s2;
            bxax0.A(s, ((bwpo)hftp0.N_build()));
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        goto label_34;
        try {
        label_27:
            if(!TextUtils.equals(s1, s2)) {
                goto label_32;
            }
            goto label_34;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_32:
        __monitor_exit(object0);
        return 2;
    label_34:
        __monitor_exit(object0);
        return 0;
    }

    static Intent c(String s, GlobalSearchApplication globalSearchApplication0) {
        Intent intent0 = new Intent(s);
        Parcel parcel0 = Parcel.obtain();
        try {
            abvs.a(globalSearchApplication0, parcel0, 0);
            intent0.putExtra("App", parcel0.marshall());
        }
        finally {
            parcel0.recycle();
        }
        return intent0;
    }

    public final Resources d() {
        try {
            return "com.google.android.gms".equals(this.b) ? this.c.b.getResources() : this.c.c.getResourcesForApplication(this.b);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            bwne.g("Failed to get resources for client %s", this.b);
            return null;
        }
    }

    public final bwuw e() {
        synchronized(this.d.h) {
        }
        return new bwuw(this.d.h(this.b), this.d.a(this.b), this.d.c(this.b));
    }

    public final String f() {
        try {
            PackageInfo packageInfo0 = this.c.c.getPackageInfo(this.b, 0);
            return azql.c(this.c.b).g(this.b) ? "install-time-" + packageInfo0.firstInstallTime : "install-time-" + packageInfo0.firstInstallTime + "-3p";
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    protected final String g() {
        try {
            PackageInfo packageInfo0 = this.c.c.getPackageInfo(this.b, 0);
            return ((Boolean)bwvu.r.b()).booleanValue() ? "last-update-" + packageInfo0.lastUpdateTime + "-version-3" : "last-update-" + packageInfo0.lastUpdateTime;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    final Map h() {
        bwut bwut0 = this.c.d.a.f();
        HashMap hashMap0 = new HashMap();
        synchronized(((bwur)bwut0).p()) {
            for(Object object1: this.i()) {
                bwnr bwnr0 = (bwnr)((bwur)bwut0).f.get(((bwvl)object1));
                if(bwnr0 != null) {
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                        hashMap0.put((bwnr0.c == null ? bwnq.a : bwnr0.c).d, bwur.G((bwnr0.c == null ? bwnq.a : bwnr0.c)));
                    }
                }
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    public final Set i() {
        synchronized(this.e) {
        }
        return DesugarCollections.unmodifiableSet(new HashSet(this.f));
    }

    public final Set j() {
        synchronized(this.d.h) {
        }
        return this.d.q();
    }

    public final void k() {
        bxax bxax0 = this.d;
        Object object0 = bxax0.h;
        String s = this.b;
        synchronized(object0) {
            bwpo bwpo0 = bxax0.l(s);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwpo0));
            ProtoLiteMessage hftv0 = hftp0.b_message;
            if(!((bwpo)hftv0).h) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo.c(((bwpo)hftp0.b_message));
                bxax0.A(s, ((bwpo)hftp0.N_build()));
            }
        }
    }

    public final void l(bwvl bwvl0) {
        synchronized(this.e) {
            this.f.remove(bwvl0);
        }
    }

    public final void m(bwuw bwuw0) {
        GlobalSearchApplicationInfo globalSearchApplicationInfo0 = (GlobalSearchApplicationInfo)bwuw0.e();
        batl.b(globalSearchApplicationInfo0 == null || this.b.equals(globalSearchApplicationInfo0.a));
        bwne.a("setGlobalSearchInfo");
        Object object0 = this.d.h;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        String s = this.b;
        bwuw bwuw1 = new bwuw(this.d.h(s), this.d.a(s), this.d.c(s));
        if(bwuw1.j(bwuw0)) {
            if(!bata.b(bwuw1.e(), bwuw0.e())) {
                bwne.b("setGlobalSearchInfo info changed for %s", s);
                bwuw1.h(bwuw0.e(), bwuw0.a(), bwuw0.b());
                this.C(bwuw1);
                FIN.finallyCodeBegin$NT(v1);
                ArrayList arrayList0 = new ArrayList(2);
                GlobalSearchApplicationInfo globalSearchApplicationInfo1 = (GlobalSearchApplicationInfo)bwuw1.e();
                if(globalSearchApplicationInfo1 == null) {
                    Intent intent1 = new Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
                    intent1.putExtra("AppPackageName", s);
                    arrayList0.add(intent1);
                }
                else {
                    boolean z = this.v(bwub.d());
                    GlobalSearchApplication globalSearchApplication0 = new GlobalSearchApplication(globalSearchApplicationInfo1, z, this.h());
                    if(z) {
                        Intent intent0 = new Intent("com.google.android.gms.icing.GlobalSearchAppRegistered");
                        intent0.putExtra("AppInfo", globalSearchApplication0.a);
                        arrayList0.add(intent0);
                        arrayList0.add(bwua.c("com.google.android.gms.icing.GlobalSearchAppRegistered2", globalSearchApplication0));
                    }
                    arrayList0.add(bwua.c("com.google.android.gms.icing.GlobalSearchAppRegistered3", globalSearchApplication0));
                }
                bwub bwub0 = this.c;
                boolean z1 = bwub0.c();
                bwne.b("gsaSigned= %b", Boolean.valueOf(z1));
                if(z1) {
                    int v2 = arrayList0.size();
                    for(int v = 0; v < v2; ++v) {
                        Intent intent2 = (Intent)arrayList0.get(v);
                        intent2.setPackage("com.google.android.googlequicksearchbox");
                        bwne.b("Sending intent: %s", intent2);
                        bwub0.b.sendBroadcast(intent2);
                    }
                    return;
                }
                bwne.k("Not sending global search app notification. Search app not installed or not signed properly.");
                return;
            }
            bwne.d("setGlobalSearchInfo info unchanged for %s; updating timestamp to %d", s, Long.valueOf(bwuw0.b()));
            bwuw1.i(bwuw0.b());
            this.C(bwuw1);
            FIN.finallyExec$NT(v1);
            return;
        }
        throw new bwvo("GlobalSearchApplicationInfo: cannot " + bwuw0.g() + " when previously " + bwuw1.g());
    }

    public final void n(Set set0) {
        bwne.b("setGlobalSearchInfoForGmsCore gsaiSet of size:%d", Integer.valueOf(set0.size()));
        bxax bxax0 = this.d;
        Object object0 = bxax0.h;
        synchronized(object0) {
            Set set1 = bxax0.q();
            if(!bata.b(set1, set0)) {
                if(hubu.k() && set0.isEmpty()) {
                    for(Object object1: set1) {
                        set0.add(new GlobalSearchApplicationInfo(((GlobalSearchApplicationInfo)object1).a, ((GlobalSearchApplicationInfo)object1).b, 0, 0, 0, null, null, null));
                    }
                }
                bwne.a("setGlobalSearchInfoForGmsCore gsai changed");
                if(set0.isEmpty()) {
                    synchronized(this.d.h) {
                        this.d.z(null);
                        this.d.e = null;
                    }
                }
                else {
                    __monitor_enter(object0);
                    goto label_23;
                }
                goto label_52;
            }
            goto label_81;
        }
        try {
        label_23:
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwpn.a).v_newBuilder();
            for(Object object2: set0) {
                bwof bwof0 = hubu.k() ? bxax0.j(((GlobalSearchApplicationInfo)object2).b) : bwof.a;
                bwod bwod0 = bwwh.c(((GlobalSearchApplicationInfo)object2));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpn bwpn0 = (bwpn)hftp0.b_message;
                bwod0.getClass();
                hfuo hfuo0 = bwpn0.b;
                if(!hfuo0.c()) {
                    bwpn0.b = ProtoLiteMessage.E(hfuo0);
                }
                bwpn0.b.add(bwod0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpn bwpn1 = (bwpn)hftp0.b_message;
                bwof0.getClass();
                bwpn1.b();
                bwpn1.c.i(bwof0.d);
            }
            bwpn bwpn2 = (bwpn)hftp0.N_build();
            bxax0.z(bwpn2);
            bxax0.e = bwpn2;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
    label_52:
        __monitor_exit(object0);
        bwub bwub0 = this.c;
        boolean z = bwub0.c();
        bwne.b("gsaSigned= %b", Boolean.valueOf(z));
        if(!z) {
            bwne.k("Not sending global search app notification. Search app not installed or not signed properly.");
            return;
        }
        ArrayList arrayList0 = new ArrayList(2);
        if(set0.isEmpty()) {
            Intent intent0 = new Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
            intent0.setPackage("com.google.android.googlequicksearchbox");
            intent0.putExtra("AppPackageName", this.b);
            arrayList0.add(intent0);
        }
        else {
            for(Object object3: set0) {
                arrayList0.add(bwua.c("com.google.android.gms.icing.GlobalSearchAppRegistered3", new GlobalSearchApplication(((GlobalSearchApplicationInfo)object3), this.w(((GlobalSearchApplicationInfo)object3).b), this.h())));
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Intent intent1 = (Intent)arrayList0.get(v2);
            intent1.setPackage("com.google.android.googlequicksearchbox");
            bwne.b("Sending intent: %s", intent1);
            bwub0.b.sendBroadcast(intent1);
        }
        return;
        try {
        label_81:
            bwne.a("setGlobalSearchInfoForGmsCore gsai unchanged");
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    public final void o(String s) {
        synchronized(this.e) {
            this.g = s;
        }
    }

    public final void p() {
        String s;
        bxax bxax0 = this.d;
        Object object0 = bxax0.h;
        synchronized(object0) {
            s = this.b;
            bwne.b("Unregistering package %s", s);
            __monitor_enter(object0);
        }
        try {
            bwpo bwpo0 = bxax0.k(s);
            if(bwpo0 != null) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwpo0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo bwpo1 = (bwpo)hftp0.b_message;
                bwpo1.b &= -2;
                bwpo1.c = bwpo.a.c;
                bxax0.A(s, ((bwpo)hftp0.N_build()));
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
            bxax bxax1 = this.d;
            String s1 = this.b;
            synchronized(bxax1.h) {
                bwpo bwpo2 = bxax1.l(s1);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo2).jf(5, null);
                hftp1.X(((ProtoLiteMessage)bwpo2));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwpo bwpo3 = (bwpo)hftp1.b_message;
                bwpo3.b &= -33;
                bwpo3.h = false;
                bxax1.A(s1, ((bwpo)hftp1.N_build()));
            }
            bxax bxax2 = this.d;
            String s2 = this.b;
            bxax2.v(s2);
            synchronized(bxax2.h) {
                bwpo bwpo4 = bxax2.l(s2);
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo4).jf(5, null);
                hftp2.X(((ProtoLiteMessage)bwpo4));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                bwpo bwpo5 = (bwpo)hftp2.b_message;
                bwpo5.b &= 0xFFFFFF7F;
                bwpo5.j = 0;
                bxax2.A(s2, ((bwpo)hftp2.N_build()));
            }
            bxax bxax3 = this.d;
            String s3 = this.b;
            bxax3.u(s3);
            synchronized(bxax3.h) {
                bwpo bwpo6 = bxax3.l(s3);
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo6).jf(5, null);
                hftp3.X(((ProtoLiteMessage)bwpo6));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                bwpo bwpo7 = (bwpo)hftp3.b_message;
                bwpo7.b &= 0xFFFFF7FF;
                bwpo7.n = 0L;
                bxax3.A(s3, ((bwpo)hftp3.N_build()));
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    protected final void q() {
        String s = this.g();
        if(s == null) {
            this.d.v(this.b);
        }
        else {
            bxax bxax0 = this.d;
            String s1 = this.b;
            synchronized(bxax0.h) {
                bwpo bwpo0 = bxax0.l(s1);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwpo0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwpo bwpo1 = (bwpo)hftp0.b_message;
                bwpo1.b |= 16;
                bwpo1.g = s;
                bxax0.A(s1, ((bwpo)hftp0.N_build()));
            }
        }
        this.r();
    }

    final void r() {
        String s = this.b;
        kau kau0 = this.c.a(s);
        int v = kau0.a == null ? 0 : ((int)(((Integer)kau0.a)));
        if(v != 0) {
            Object object0 = kau0.b;
            if(!TextUtils.isEmpty(((CharSequence)object0))) {
                bxax bxax0 = this.d;
                synchronized(bxax0.h) {
                    bwpo bwpo0 = bxax0.l(s);
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)bwpo0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bwpo bwpo1 = (bwpo)hftp0.b_message;
                    bwpo1.b |= 0x100;
                    bwpo1.k = v;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bwpo bwpo2 = (bwpo)hftp0.b_message;
                    ((String)object0).getClass();
                    bwpo2.b |= 0x200;
                    bwpo2.l = (String)object0;
                    bxax0.A(s, ((bwpo)hftp0.N_build()));
                }
                return;
            }
        }
        this.d.u(s);
    }

    public final boolean s() {
        boolean z;
        synchronized(this.d.h) {
            bwpo bwpo0 = this.d.k(this.b);
            z = bwpo0 != null && bwpo0.h;
        }
        return z;
    }

    public final boolean t() {
        boolean z;
        synchronized(this.d.h) {
            bwpo bwpo0 = this.d.k(this.b);
            z = bwpo0 != null && bwpo0.m;
        }
        return z;
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + "{" + this.b + "}";
    }

    public final boolean u(String s, boolean z) {
        if("com.google.android.gms".equals(this.b)) {
            ggeo ggeo0 = bwua.a;
            if(ggeo0.containsKey(s)) {
                s = (String)ggeo0.get(s);
            }
            return this.w(s);
        }
        return this.v(z);
    }

    public final boolean v(boolean z) {
        bwof bwof0 = this.d.i(this.b);
        return z || this.y() ? bwof0 != bwof.b : bwof0 == bwof.c;
    }

    public final boolean w(String s) {
        return s == null ? false : this.d.j(s) != bwof.b;
    }

    public final boolean x() {
        return this.d.E(this.b);
    }

    public final boolean y() {
        String s = this.d.o(this.b);
        return s == null ? this.D() : !s.endsWith("-3p");
    }

    public final boolean z() {
        String s = this.d.p(this.b);
        return s == null || !TextUtils.equals(this.g(), s);
    }
}

