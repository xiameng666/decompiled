import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class augf {
    public final avjh a;
    public final augl b;
    public augk c;
    public final aufx d;
    private static final gful_cronetEngineProvider e;
    private final gful_cronetEngineProvider f;
    private final Context g;
    private final auhn h;
    private final auum i;
    private final avaa j;
    private final auiz k;
    private final avij l;
    private final avip m;
    private final atxy n;
    private final gful_cronetEngineProvider o;
    private final gful_cronetEngineProvider p;
    private final ausg q;

    static {
        augf.e = gfus.a(((gful_cronetEngineProvider)new auga()));
    }

    public augf(augl augl0, Context context0, auhn auhn0, auum auum0, ausg ausg0, avaa avaa0, auiz auiz0, atxp atxp0) {
        this.f = gfus.a(((gful_cronetEngineProvider)new augb()));
        avjh avjh0 = new avjh("DatabaseProcessor");
        this.a = avjh0;
        this.o = gfus.a(((gful_cronetEngineProvider)new augc()));
        this.p = gfus.a(((gful_cronetEngineProvider)new augd()));
        this.b = augl0;
        this.g = context0;
        this.h = auhn0;
        this.i = auum0;
        this.q = ausg0;
        this.j = avaa0;
        this.k = auiz0;
        avij avij0 = avij.e();
        this.l = avij0;
        avip avip0 = avip.a();
        this.m = avip0;
        this.n = new atxy(context0, atxp0);
        aufx aufx0 = avij0.p() || !avip0.c(context0) ? null : aufx.i(context0);
        if(aufx0 != null) {
            avjh0.m("Self-device filtering is enabled: Initializing Cast Auth client for self-device Id.");
            aufx0.c();
        }
        this.d = aufx0;
    }

    final aujj a(aujd aujd0) {
        return this.b(aujd0, false);
    }

    final aujj b(aujd aujd0, boolean z) {
        List list1;
        aujj aujj0 = this.h.c(aujd0.c.f());
        List list0 = null;
        aujj aujj1 = aujj0 == null || !aujj0.g() ? null : aujj0;
        if(aujj0 == null && !aujd0.m()) {
            this.a.c("buildPublishedDeviceEntry: failed to build the published entry for device %s. isDeviceOnline(%b). publishedDeviceEntry (%s)", new Object[]{aujd0.c, Boolean.valueOf(false), "null"});
            return null;
        }
        aujd0.i = System.currentTimeMillis();
        if(z) {
            list1 = this.f();
        }
        else {
            if(aujj1 != null) {
                list0 = aujj1.f;
            }
            list1 = new ArrayList();
            list1.add(aufy.a);
            boolean z1 = false;
            ggqj ggqj0 = ggeo.k(this.b.k).v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                String s = (String)((Map.Entry)object0).getKey();
                Set set0 = (Set)((Map.Entry)object0).getValue();
                if(this.m.c(this.g) && !auuv.k(s, "com.google.android.gms.cast.CATEGORY_CAST_GHA") && !auuv.k(s, "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION_GHA")) {
                    CastDevice castDevice0 = aujd0.c;
                    if((this.d == null ? castDevice0.r() : this.d.h(castDevice0))) {
                        String s1 = auuv.f(s);
                        if(s1 == null) {
                            this.a.c("Blocking route with no appId for self-device %s", new Object[]{castDevice0.f()});
                        }
                        else {
                            hfuo hfuo0 = ((hqph)this.o.mr()).b;
                            int v = 0;
                            while(v < hfuo0.size()) {
                                if(((hqpg)hfuo0.get(v)).b.equals(s1)) {
                                    this.a.c("AppId %s is allow-listed for route to self-device %s", new Object[]{s1, castDevice0.f()});
                                    atxy atxy0 = this.n;
                                    if(avip.a().c(atxy0.a)) {
                                        cjpa cjpa0 = atxy0.c.c();
                                        cjpa0.g(atxy0.b(s1), System.currentTimeMillis());
                                        cjpd.g(cjpa0);
                                        atxy0.d.add(s1);
                                        atxy0.c();
                                    }
                                    goto label_43;
                                }
                                ++v;
                            }
                        }
                        continue;
                    }
                }
            label_43:
                hqqp hqqp0 = hqqp.a;
                if(!hqqp0.b().l() && aujd0.c.j()) {
                    if(!((Boolean)this.f.mr()).booleanValue()) {
                        this.a.g("No control filters for %s because category does not allow Ipv6", new Object[]{aujd0.c});
                        continue;
                    }
                    else if(!hqqp0.b().o() || auuv.k(s, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK") || auuv.m(s) || auuv.n(s)) {
                        String[] arr_s = TextUtils.split(s, "/");
                        if(arr_s.length != 5 || TextUtils.isEmpty(arr_s[4]) || !arr_s[4].equals("ALLOW_IPV6")) {
                            this.a.g("No control filters for %s because category does not allow Ipv6", new Object[]{aujd0.c});
                            continue;
                        }
                    }
                }
                if(auuv.k(s, "android.media.intent.category.REMOTE_PLAYBACK")) {
                    if(!aujd0.k(set0)) {
                        continue;
                    }
                    z1 = true;
                }
                else if(!auuv.k(s, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
                    if(!aujd0.k(set0)) {
                        continue;
                    }
                    IntentFilter intentFilter1 = new IntentFilter();
                    intentFilter1.addCategory(s);
                    list1.add(intentFilter1);
                }
                else if(set0.isEmpty() || aujd0.k(set0)) {
                    if(!set0.isEmpty()) {
                        IntentFilter intentFilter0 = new IntentFilter();
                        intentFilter0.addCategory(s);
                        list1.add(intentFilter0);
                    }
                    z1 = true;
                }
            }
            if(z1) {
                list1.addAll(aufy.b);
            }
            if(list0 != null) {
                for(Object object1: list0) {
                    IntentFilter intentFilter2 = (IntentFilter)object1;
                    if(!avjn.o(list1, intentFilter2)) {
                        list1.add(intentFilter2);
                    }
                }
            }
        }
        int v1 = aujj0 == null ? -1 : aujj0.j;
        Set set1 = this.b.n;
        Set set2 = aujd.q(aujd0.c(), set1);
        Set set3 = this.b.n;
        return new aujj(aujd0, set2, aujd.q(aujd0.b(), set3), list1, v1);
    }

    // Detected as a lambda impl.
    final void c(boolean z) {
        HashMap hashMap0 = new HashMap();
        augl augl0 = this.b;
        auiz auiz0 = augl0.e;
        synchronized(auiz0) {
            if(((Boolean)this.p.mr()).booleanValue()) {
                List list0 = this.q.c();
                if(list0 == null) {
                    this.d(hashMap0);
                }
                else {
                    Iterator iterator0 = list0.iterator();
                    while(iterator0.hasNext()) {
                        String s = "null";
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        auju auju0 = auiz0.e(s1);
                        if(auju0 == null) {
                            if(s1 != null) {
                                s = "non-null";
                            }
                            this.a.g("processLocalDevices: failed to get the network info with %s networkId.", new Object[]{s});
                        }
                        else {
                            long v1 = System.currentTimeMillis();
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object1: auju0.a(auiz0)) {
                                aujd aujd0 = (aujd)object1;
                                if(aujd0.n()) {
                                    this.a.c("processLocalDevices: removed endpoint device %s", new Object[]{aujd0.c});
                                    if(!aujd0.l(v1, 70000L)) {
                                        continue;
                                    }
                                    arrayList0.add(aujd0.b);
                                }
                                else {
                                    if(!this.g(aujd0)) {
                                        continue;
                                    }
                                    aujj aujj0 = this.a(aujd0);
                                    if(aujj0 == null) {
                                        continue;
                                    }
                                    hashMap0.put(aujd0.c.f(), aujj0);
                                }
                            }
                            int v2 = arrayList0.size();
                            for(int v3 = 0; v3 < v2; ++v3) {
                                auiz0.q(((String)arrayList0.get(v3)));
                            }
                        }
                    }
                }
            }
            else {
                this.d(hashMap0);
            }
            auha auha0 = augl0.r;
            if(auha0 != null) {
                aulc aulc0 = this.k.b;
                if(auha0.k != null && auha0.k.k.l != 1) {
                    for(Object object2: aulc0.d().values()) {
                        aukm aukm0 = (aukm)object2;
                        if(aukm0.b() && aukm0.a() && !TextUtils.isEmpty(aukm0.e)) {
                            atrq atrq0 = new atrq(aukm0.e);
                            atrq0.c = aukm0.c.c;
                            atrq0.r = true;
                            gqfq gqfq0 = aukm0.c.f == null ? gqfq.a : aukm0.c.f;
                            int v4 = gqfq0.c ? 0x1801 : 0x1800;
                            if(gqfq0.b) {
                                v4 |= 4;
                            }
                            atrq0.i = v4;
                            CastDevice castDevice0 = atrq0.a();
                            aujj aujj1 = this.h.c(castDevice0.f());
                            if(aujj1 == null || !aujj1.g()) {
                                aujj1 = null;
                            }
                            hashMap0.put(castDevice0.f(), new aujj(castDevice0, augl0.n, new HashSet(), this.f(), "", (aujj1 == null ? -1 : aujj1.j), (aujj1 == null ? 0 : aujj1.c()), 0.0, new HashSet(), 0));
                        }
                    }
                }
            }
            avij avij0 = this.l;
            if(avij0.r() && avij0.r()) {
                Map map0 = auiz0.k();
                if(!map0.isEmpty()) {
                    Set set0 = hashMap0.keySet();
                    ggoe ggoe0 = ggog.d(map0.keySet(), set0);
                    avaa avaa0 = this.j;
                    if(avaa0.c() != null) {
                        ggqj ggqj0 = ((ggny)ggoe0).c();
                        while(ggqj0.hasNext()) {
                            Object object3 = ggqj0.next();
                            String s2 = (String)object3;
                            avjh avjh0 = this.a;
                            avjh0.n("Found asleep device to check for publishing: %s", s2);
                            aujd aujd1 = (aujd)map0.get(s2);
                            if(aujd1 != null) {
                                aunj aunj0 = aujd1.d;
                                if(aunj0 == null) {
                                }
                                else if(aunj0.a()) {
                                    avjh0.c("Not publishing expired WoL device", new Object[0]);
                                }
                                else if(avaa0.c() != null && !TextUtils.equals(avaa0.c(), aunj0.c)) {
                                    avjh0.c("Network ID of wake-on-lan device does not match, not publishing", new Object[0]);
                                }
                                else {
                                    aujj aujj2 = this.b(aujd1, true);
                                    if(aujj2 == null) {
                                        avjh0.g("Published device entry not created for wake-on-lan device", new Object[0]);
                                    }
                                    else {
                                        hfuo hfuo0 = ((hgfj)avij0.i.mr()).b;
                                        List list1 = auuv.i(aujj2.f, hfuo0);
                                        if(list1.size() != aujj2.f.size()) {
                                            aujj2 = new aujj(aujd1, aujj2.d, aujj2.e, list1, aujj2.j);
                                        }
                                        hashMap0.put(s2, aujj2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.h.j(hashMap0, z);
    }

    final void d(Map map0) {
        auiz auiz0 = this.b.e;
        String s = this.q.b(null);
        auju auju0 = auiz0.e(s);
        if(auju0 == null) {
            this.a.g("processLocalDevices: failed to get the network info with %s networkId.", new Object[]{(s == null ? "null" : "non-null")});
            return;
        }
        long v = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: auju0.a(auiz0)) {
            aujd aujd0 = (aujd)object0;
            if(aujd0.n()) {
                this.a.c("processLocalDevices: removed endpoint device %s", new Object[]{aujd0.c});
                if(!aujd0.l(v, 70000L)) {
                    continue;
                }
                arrayList0.add(aujd0.b);
            }
            else {
                if(!this.g(aujd0)) {
                    continue;
                }
                aujj aujj0 = this.a(aujd0);
                if(aujj0 == null) {
                    continue;
                }
                map0.put(aujd0.c.f(), aujj0);
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            auiz0.q(((String)arrayList0.get(v2)));
        }
    }

    public final void e(boolean z) {
        atzn.a().execute(() -> {
            HashMap hashMap0 = new HashMap();
            augl augl0 = this.b;
            auiz auiz0 = augl0.e;
            synchronized(auiz0) {
                if(((Boolean)this.p.mr()).booleanValue()) {
                    List list0 = this.q.c();
                    if(list0 == null) {
                        this.d(hashMap0);
                    }
                    else {
                        Iterator iterator0 = list0.iterator();
                        while(iterator0.hasNext()) {
                            String s = "null";
                            Object object0 = iterator0.next();
                            String s1 = (String)object0;
                            auju auju0 = auiz0.e(s1);
                            if(auju0 == null) {
                                if(s1 != null) {
                                    s = "non-null";
                                }
                                this.a.g("processLocalDevices: failed to get the network info with %s networkId.", new Object[]{s});
                            }
                            else {
                                long v1 = System.currentTimeMillis();
                                ArrayList arrayList0 = new ArrayList();
                                for(Object object1: auju0.a(auiz0)) {
                                    aujd aujd0 = (aujd)object1;
                                    if(aujd0.n()) {
                                        this.a.c("processLocalDevices: removed endpoint device %s", new Object[]{aujd0.c});
                                        if(!aujd0.l(v1, 70000L)) {
                                            continue;
                                        }
                                        arrayList0.add(aujd0.b);
                                    }
                                    else {
                                        if(!this.g(aujd0)) {
                                            continue;
                                        }
                                        aujj aujj0 = this.a(aujd0);
                                        if(aujj0 == null) {
                                            continue;
                                        }
                                        hashMap0.put(aujd0.c.f(), aujj0);
                                    }
                                }
                                int v2 = arrayList0.size();
                                for(int v3 = 0; v3 < v2; ++v3) {
                                    auiz0.q(((String)arrayList0.get(v3)));
                                }
                            }
                        }
                    }
                }
                else {
                    this.d(hashMap0);
                }
                auha auha0 = augl0.r;
                if(auha0 != null) {
                    aulc aulc0 = this.k.b;
                    if(auha0.k != null && auha0.k.k.l != 1) {
                        for(Object object2: aulc0.d().values()) {
                            aukm aukm0 = (aukm)object2;
                            if(aukm0.b() && aukm0.a() && !TextUtils.isEmpty(aukm0.e)) {
                                atrq atrq0 = new atrq(aukm0.e);
                                atrq0.c = aukm0.c.c;
                                atrq0.r = true;
                                gqfq gqfq0 = aukm0.c.f == null ? gqfq.a : aukm0.c.f;
                                int v4 = gqfq0.c ? 0x1801 : 0x1800;
                                if(gqfq0.b) {
                                    v4 |= 4;
                                }
                                atrq0.i = v4;
                                CastDevice castDevice0 = atrq0.a();
                                aujj aujj1 = this.h.c(castDevice0.f());
                                if(aujj1 == null || !aujj1.g()) {
                                    aujj1 = null;
                                }
                                hashMap0.put(castDevice0.f(), new aujj(castDevice0, augl0.n, new HashSet(), this.f(), "", (aujj1 == null ? -1 : aujj1.j), (aujj1 == null ? 0 : aujj1.c()), 0.0, new HashSet(), 0));
                            }
                        }
                    }
                }
                avij avij0 = this.l;
                if(avij0.r() && avij0.r()) {
                    Map map0 = auiz0.k();
                    if(!map0.isEmpty()) {
                        Set set0 = hashMap0.keySet();
                        ggoe ggoe0 = ggog.d(map0.keySet(), set0);
                        avaa avaa0 = this.j;
                        if(avaa0.c() != null) {
                            ggqj ggqj0 = ((ggny)ggoe0).c();
                            while(ggqj0.hasNext()) {
                                Object object3 = ggqj0.next();
                                String s2 = (String)object3;
                                avjh avjh0 = this.a;
                                avjh0.n("Found asleep device to check for publishing: %s", s2);
                                aujd aujd1 = (aujd)map0.get(s2);
                                if(aujd1 != null) {
                                    aunj aunj0 = aujd1.d;
                                    if(aunj0 == null) {
                                    }
                                    else if(aunj0.a()) {
                                        avjh0.c("Not publishing expired WoL device", new Object[0]);
                                    }
                                    else if(avaa0.c() != null && !TextUtils.equals(avaa0.c(), aunj0.c)) {
                                        avjh0.c("Network ID of wake-on-lan device does not match, not publishing", new Object[0]);
                                    }
                                    else {
                                        aujj aujj2 = this.b(aujd1, true);
                                        if(aujj2 == null) {
                                            avjh0.g("Published device entry not created for wake-on-lan device", new Object[0]);
                                        }
                                        else {
                                            hfuo hfuo0 = ((hgfj)avij0.i.mr()).b;
                                            List list1 = auuv.i(aujj2.f, hfuo0);
                                            if(list1.size() != aujj2.f.size()) {
                                                aujj2 = new aujj(aujd1, aujj2.d, aujj2.e, list1, aujj2.j);
                                            }
                                            hashMap0.put(s2, aujj2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.h.j(hashMap0, z);
        });
    }

    private final List f() {
        List list0 = new ArrayList();
        list0.add(aufy.a);
        for(Object object0: this.b.k.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            if(!auuv.k(s, "android.media.intent.category.REMOTE_PLAYBACK") && !auuv.k(s, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK") && (s == null || !s.contains("urn:x-cast:"))) {
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addCategory(s);
                list0.add(intentFilter0);
            }
        }
        return list0;
    }

    private final boolean g(aujd aujd0) {
        boolean z2;
        long v = System.currentTimeMillis();
        CastDevice castDevice0 = aujd0.c;
        boolean z = true;
        if(aujd0.p == 2) {
            if(castDevice0.k() && !this.i.b(aujd0.b)) {
                z = false;
            }
            if(!z) {
                this.a.n("processLocalDevices: device %s connection state is incorrect", castDevice0);
                String s = String.format(Locale.ROOT, "Device %s connection state is incorrect", castDevice0.d);
                avjj.a().c(this.g, s);
                aujd0.g(0, null, null, null);
                aujd0.h = v;
                aujd0.w = 3;
            }
            return z;
        }
        if(aujd0.f != null && !aujd0.f.a) {
            this.a.c("processLocalDevices: Device %s is marked offline by mDNS.", new Object[]{castDevice0});
            return false;
        }
        boolean z1 = aujd0.l(v, ((Long)augf.e.mr()).longValue());
        if(hque.a.d().j() && (aujd0.c.i(0x20) || aujd0.c.i(0x40) || aujd0.c.i(0x80) || aujd0.c.i(0x100))) {
            z2 = false;
        }
        else {
            z2 = aujd0.o == null ? true : aujd.p(aujd0.a(), v);
        }
        boolean z3 = aujd0.o();
        if(!castDevice0.n()) {
            if(z1 || z2 || z3) {
                gkfz gkfz0 = z1 || z2 ? gkfz.b : gkfz.k;
                if(z2) {
                    this.a.c("Relay access token needs to be fetched for %s, token timestamp=%d, currentTime=%d", new Object[]{castDevice0.f(), aujd0.a(), System.currentTimeMillis()});
                }
                this.a.c("need TCP probing [%s] device: %s", new Object[]{(z1 ? "expired" : "not expired"), castDevice0});
                this.b.m.a(aujd0, gkfz0, false, z2);
                return !z1;
            }
            return true;
        }
        return !z1;
    }
}

