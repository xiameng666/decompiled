import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bwuc {
    public final bwub a;
    public final Object b;
    public final Map c;

    public bwuc(bwub bwub0) {
        this.c = new HashMap();
        this.a = bwub0;
        Object object0 = bwub0.a.h;
        this.b = object0;
        synchronized(object0) {
            synchronized(bwub0.a.h) {
                Set set0 = bwub0.a.d.keySet();
            }
            for(Object object1: set0) {
                String s = (String)object1;
                if(((bwua)this.c.get(s)) == null) {
                    bwua bwua0 = new bwua(s, this.a);
                    this.c.put(s, bwua0);
                }
            }
        }
    }

    public final int a() {
        int v = (int)(((Integer)this.a.a.g("com.google.android.googlequicksearchbox").a));
        return v == 0 ? ((int)(((Integer)this.a.a("com.google.android.googlequicksearchbox").a))) : v;
    }

    final int b(int v) {
        return avyq.a(this.a.b, v);
    }

    final GlobalSearchApplicationInfo c(String s) {
        return new GlobalSearchApplicationInfo("com.google.android.gms", s, this.b(0x7F15151F), this.b(0x7F15151E), this.b(0x7F080CE3), "android.intent.action.MAIN", null, null);  // string:icing_contacts_corpus_label "Device Contacts"
    }

    public final bwua d(bwud bwud0) {
        return this.e(bwud0.e);
    }

    public final bwua e(String s) {
        bwua bwua0;
        synchronized(this.b) {
            bwua0 = this.f(s);
            if(bwua0 == null) {
                bwua0 = new bwua(s, this.a);
                this.c.put(s, bwua0);
            }
        }
        return bwua0;
    }

    public final bwua f(String s) {
        synchronized(this.b) {
        }
        return (bwua)this.c.get(s);
    }

    public final bwud g(ApplicationInfo applicationInfo0) {
        return this.i(applicationInfo0.uid, applicationInfo0.packageName, -1);
    }

    public final bwud h(String s) {
        int v = Binder.getCallingUid();
        batl.t(s, "Package name");
        bbmq.M(this.a.b, s);
        return this.i(v, s, -1);
    }

    public final bwud i(int v, String s, int v1) {
        return this.j(v, s, v1, null, null);
    }

    public final bwud j(int v, String s, int v1, String s1, String s2) {
        boolean z = this.a.b(s);
        int v2 = this.a.b.getApplicationInfo().uid;
        boolean z1 = z && Arrays.asList(TextUtils.split(hubg.l(), ",")).contains(s);
        boolean z2 = z && ("com.google.android.apps.icing.ui".equals(s) || !bbnp.p() && Arrays.asList(TextUtils.split(hual.a.b().a(), ",")).contains(s));
        if(z) {
            bwtj.a().contains(s);
        }
        bwne.q("Creating ClientRequest for %s. Client SDK Version:%d, Target SDK Version:%d", new Object[]{s, v1, ((int)36)});
        return v2 == v || z2 ? new bwud(v, true, z1, z, s, 36, v1, s1, s2) : new bwud(v, false, z1, z, s, 36, v1, s1, s2);
    }

    public final Set k() {
        Set set0;
        synchronized(this.b) {
            set0 = new HashSet(this.c.size());
            for(Object object1: this.c.values()) {
                bwua bwua0 = (bwua)object1;
                if(bwua0.a() > 0) {
                    ((HashSet)set0).add(bwua0);
                }
            }
        }
        return set0;
    }

    public final Set l() {
        synchronized(this.b) {
        }
        return new HashSet(this.c.keySet());
    }

    public final Set m(bwud bwud0) {
        int v = bwud0.a;
        String[] arr_s = this.a.c.getPackagesForUid(v);
        if(arr_s != null && arr_s.length != 0) {
            Set set0 = new HashSet(arr_s.length);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                ((HashSet)set0).add(this.e(arr_s[v1]));
            }
            return set0;
        }
        bwne.g("No packages found for UID %d", Integer.valueOf(v));
        return Collections.EMPTY_SET;
    }

    public final void n(String s) {
        bwua bwua0;
        synchronized(this.b) {
            bwua0 = this.f(s);
            if(bwua0 != null) {
                try {
                    if("com.google.android.gms".equals(s)) {
                        bwua0.n(new HashSet());
                    }
                    else {
                        bwua0.m(bwuw.a);
                    }
                }
                catch(bwvo bwvo0) {
                    throw new bwvq(bwvo0);
                }
                this.a.a.v(s);
                bwua0.r();
            }
        }
        if(bwua0 != null) {
            bwmx bwmx0 = this.a.d.a;
            bwmx0.c.c(2);
            bwur bwur0 = bwmx0.e();
            for(Object object1: bwua0.i()) {
                bwvl bwvl0 = (bwvl)object1;
                bwuw bwuw0 = bwur0.k(bwvl0);
                if(bwuw0 != null) {
                    bwnr bwnr0 = (bwnr)bwuw0.e();
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    if((bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) && !bwur.D((bwnr0.c == null ? bwnq.a : bwnr0.c)) && !bwur.C((bwnr0.c == null ? bwnq.a : bwnr0.c))) {
                        bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bwnq0));
                        bwnp bwnp0 = (bwnp)hftp0;
                        if(!bwnp0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)bwnp0).ensureMutable();
                        }
                        ((bwnq)bwnp0.b_message).l = hfvv.a;
                        bwnq bwnq1 = (bwnq)((ProtoLiteBuilder)bwnp0).N_build();
                        try {
                            bwur0.y(bwvl0, bwuw0.d(bwnq1));
                        }
                        catch(bwvo bwvo1) {
                            bwne.j(bwvo1, "Failed to set corpus config on reparse", new Object[0]);
                            bwmx0.r.d("reparse_sourcecheck_failed");
                        }
                    }
                }
            }
            bwut bwut0 = this.a.d.a.f();
            synchronized(((bwur)bwut0).p()) {
                for(Object object3: bwua0.i()) {
                    bwnr bwnr1 = (bwnr)((bwur)bwut0).f.get(((bwvl)object3));
                    if(bwnr1 != null) {
                        bwny bwny1 = bwnr1.d == null ? bwny.a : bwnr1.d;
                        if((bwnx.a(bwny1.d) == 0 || bwnx.a(bwny1.d) == 1) && (bwur.D((bwnr1.c == null ? bwnq.a : bwnr1.c)) || bwur.C((bwnr1.c == null ? bwnq.a : bwnr1.c)))) {
                            bwua0.B(System.currentTimeMillis());
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void o() {
        bwne.a("maybeUpdateGmailGlobalSearchInfo");
        synchronized(this.b) {
            bwua bwua0 = this.f("com.google.android.gm");
            if(bwua0 == null) {
                return;
            }
            if(bwua0.e().e() == null) {
                bwua0.B(System.currentTimeMillis());
            }
        }
    }

    public final void p() {
        try {
            bwne.a("maybeUpdateGmsCoreGlobalSearchInfo");
            Object object0 = this.b;
            synchronized(object0) {
                bwua bwua0 = this.f("com.google.android.gms");
                if(bwua0 == null) {
                    bwne.a("No client found for GMSCore");
                    return;
                }
                HashSet hashSet0 = new HashSet();
                if(bwwy.g()) {
                    hashSet0.add(new GlobalSearchApplicationInfo("com.google.android.gms", "apps", this.b(0x7F15151D), this.b(0x7F15151C), this.b(0x7F080DAF), "android.intent.action.MAIN", null, null));  // string:icing_apps_corpus_label "Apps"
                }
                hashSet0.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MobileApplication", this.b(0x7F15151D), this.b(0x7F15151C), this.b(0x7F080DAF), "android.intent.action.MAIN", null, null));  // string:icing_apps_corpus_label "Apps"
                if(bwyp.e()) {
                    hashSet0.add(this.c("contacts_contact_id"));
                }
                hashSet0.add(this.c("internal.3p:Contact"));
                hashSet0.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Photograph", this.b(0x7F151525), this.b(0x7F151524), this.b(0x7F080D4B), "android.intent.action.MAIN", null, null));  // string:icing_photograph_corpus_label "Images"
                hashSet0.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:DigitalDocument", this.b(0x7F151521), this.b(0x7F151520), this.b(0x7F080D0A), "android.intent.action.MAIN", null, null));  // string:icing_digital_document_corpus_label "Documents"
                hashSet0.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MusicRecording", this.b(0x7F151523), this.b(0x7F151522), this.b(0x7F080D8D), "android.intent.action.MAIN", null, null));  // string:icing_music_recording_corpus_label "External Media"
                bwua0.n(hashSet0);
            }
        }
        catch(bwvo bwvo0) {
            bwne.j(bwvo0, "ClientIcingException", new Object[0]);
        }
    }

    public final boolean q(String s) {
        bwua bwua0 = this.f(s);
        if(bwua0 == null) {
            return false;
        }
        if("com.google.android.gms".equals(s)) {
            return !bwua0.j().isEmpty();
        }
        bwuw bwuw0 = bwua0.e();
        if(bwuw0.e() != null) {
            long v = bwuw0.b();
            try {
                if(v < this.a.a.a.getPackageManager().getPackageInfo(s, 0).lastUpdateTime) {
                    bwne.t("GSAI from package %s is stale.", s);
                    return false;
                }
                return true;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                bwne.w(packageManager$NameNotFoundException0, "Cannot find package %s", new Object[]{s});
            }
        }
        return false;
    }

    public final boolean r(String s) {
        return "com.google.android.googlequicksearchbox".equals(s) && this.a.c();
    }
}

