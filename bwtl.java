import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.CacheSpec;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public final class bwtl {
    public final bwtn a;
    public final Object b;
    public final Map c;
    public final ggla d;
    public final Queue e;
    public static final int f;
    private static final long g;
    private final Context h;

    static {
        bwtl.g = TimeUnit.HOURS.toSeconds(24L);
    }

    public bwtl(Context context0) {
        this.b = new Object();
        this.c = new HashMap();
        this.d = new gfza();
        this.e = new PriorityQueue(1, new bwtk());
        this.h = context0;
        this.a = new bwtn(context0);
    }

    public static String a(String s, String s1) {
        return TextUtils.join(":", Arrays.asList(new String[]{s, s1}));
    }

    public final void b() {
        if(hubu.e() && !this.e()) {
            Object object0 = this.b;
            synchronized(object0) {
                Map map0 = this.c;
                for(Object object1: map0.values()) {
                    String s = ((bwky)object1).c;
                    bwne.b("Sending directed broadcast event to %s to invalidate everything", s);
                    Intent intent0 = new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(s).putExtra("com.google.android.gms.icing.extra.invalidate_all_caches", true);
                    this.h.sendBroadcast(intent0);
                }
                map0.clear();
                this.d.s();
                this.e.clear();
                try {
                    this.a.a(ggna.a);
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    public final void c(String s, String s1) {
        if(hubu.e() && !this.e()) {
            Object object0 = this.b;
            synchronized(object0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwkz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((bwkz)hftv0).b = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwkz bwkz0 = (bwkz)hftp0.b_message;
                s1.getClass();
                bwkz0.c = s1;
                bwkz bwkz1 = (bwkz)hftp0.N_build();
                ggla ggla0 = this.d;
                if(!ggla0.u(bwkz1)) {
                    return;
                }
                gfza gfza0 = new gfza();
                for(Object object1: ((gfxo)ggla0).g(bwkz1)) {
                    gfza0.v(((bwky)object1).c, ((bwky)object1));
                }
                for(Object object2: gfza0.x()) {
                    this.g(((bwky)object2).c, ((bwky)object2).b);
                    this.h(((bwky)object2));
                }
            }
        }
    }

    public final void d(String s, String s1, String s2) {
        if(hubu.e() && !this.e()) {
            Object object0 = this.b;
            long v = SystemClock.elapsedRealtime();
            synchronized(object0) {
                while(true) {
                    bwky bwky0 = (bwky)this.e.peek();
                    if(bwky0 == null || v < bwky0.e) {
                        break;
                    }
                    this.g(bwky0.c, bwky0.b);
                    this.h(bwky0);
                }
            }
            synchronized(object0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwkz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((bwkz)hftv0).b = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwkz bwkz0 = (bwkz)hftp0.b_message;
                s1.getClass();
                bwkz0.c = s1;
                bwkz bwkz1 = (bwkz)hftp0.N_build();
                ggla ggla0 = this.d;
                if(ggla0.u(bwkz1)) {
                    HashSet hashSet0 = new HashSet();
                    for(Object object1: ((gfxo)ggla0).g(bwkz1)) {
                        hashSet0.add(((bwky)object1).c);
                    }
                    ghga ghga0 = ghhb.b.h();
                    ghga0.m(s, Charset.defaultCharset());
                    ghga0.m(s2, Charset.defaultCharset());
                    String s3 = String.valueOf(new elaz(((ghfw)ghga0.s()).a).a);
                    Iterator iterator1 = hashSet0.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            return;
                        }
                        Object object2 = iterator1.next();
                        bwne.d("Sending directed broadcast event to %s to invalidate document ID: %s", ((String)object2), s3);
                        Intent intent0 = new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(((String)object2)).putStringArrayListExtra("com.google.android.gms.icing.extra.document_ids", new ArrayList(gged_interceptors.l(s3)));
                        this.h.sendBroadcast(intent0);
                    }
                }
                goto label_50;
            }
            return;
        label_50:
        }
    }

    final boolean e() {
        synchronized(this.b) {
        }
        return this.c.isEmpty();
    }

    public final boolean f(String s, gged_interceptors gged0, CacheSpec cacheSpec0) {
        if(!hubu.e()) {
            bwne.s("Failed to register cache: feature isn\'t enabled");
            return false;
        }
        if(!gged0.isEmpty()) {
            String s1 = cacheSpec0.a;
            if(TextUtils.isEmpty(s1)) {
                bwne.s("Failed to register cache: name is null or empty");
                return false;
            }
            hubg hubg0 = hubg.a;
            if(!hubg0.j().D().b.contains(s)) {
                bwne.t("Failed to register cache: \"%s\" isn\'t whitelisted", s);
                return false;
            }
            ArrayList arrayList0 = new ArrayList();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                bwnq bwnq0 = (bwnq)gged0.get(v1);
                String s2 = bwsa.g(bwnq0.d);
                if(!hubg0.j().C().b.contains(s2)) {
                    bwne.t("Failed to register cache: indexable type \"%s\" isn\'t whitelisted", s2);
                    return false;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwkz.a).v_newBuilder();
                String s3 = bwnq0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s3.getClass();
                ((bwkz)hftv0).b = s3;
                String s4 = bwnq0.d;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwkz bwkz0 = (bwkz)hftp0.b_message;
                s4.getClass();
                bwkz0.c = s4;
                arrayList0.add(((bwkz)hftp0.N_build()));
            }
            long v2 = bwtl.g;
            long v3 = (long)cacheSpec0.b;
            if(v3 > v2) {
                bwne.t("Capping cache TTL to %d seconds", Long.valueOf(v2));
            }
            else {
                v2 = v3;
            }
            long v4 = SystemClock.elapsedRealtime() + v2 * 1000L;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwky.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s1.getClass();
            ((bwky)hftv1).b = s1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((bwky)hftv2).c = s;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            bwky bwky0 = (bwky)hftp1.b_message;
            hfuo hfuo0 = bwky0.d;
            if(!hfuo0.c()) {
                bwky0.d = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, bwky0.d);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((bwky)hftp1.b_message).e = v4;
            bwky bwky1 = (bwky)hftp1.N_build();
            String s5 = bwtl.a(s, s1);
            synchronized(this.b) {
                Map map0 = this.c;
                bwky bwky2 = (bwky)map0.get(s5);
                if(bwky2 != null) {
                    if(!arrayList0.containsAll(bwky2.d)) {
                        this.g(bwky2.c, bwky2.b);
                    }
                    this.h(bwky2);
                }
                map0.put(s5, bwky1);
                for(Object object1: arrayList0) {
                    this.d.v(((bwkz)object1), bwky1);
                }
                this.e.add(bwky1);
                try {
                    ArrayList arrayList1 = new ArrayList(map0.values());
                    this.a.a(arrayList1);
                }
                catch(IOException iOException0) {
                    bwne.t("Failed to persist client cache records, error:%s", iOException0);
                    this.b();
                    return false;
                }
            }
            bwne.c("Registered cache \"%s\" for client %s with corpora %s", new Object[]{cacheSpec0.a, s, arrayList0.toString()});
            return true;
        }
        bwne.s("Failed to register cache: no corpora specified");
        return false;
    }

    private final void g(String s, String s1) {
        bwne.d("Sending directed broadcast event to %s to invalidate cache: %s", s, s1);
        Intent intent0 = new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(s).putStringArrayListExtra("com.google.android.gms.icing.extra.cache_names", new ArrayList(gged_interceptors.l(s1)));
        this.h.sendBroadcast(intent0);
    }

    private final void h(bwky bwky0) {
        String s = bwtl.a(bwky0.c, bwky0.b);
        synchronized(this.b) {
            Map map0 = this.c;
            map0.remove(s);
            for(Object object1: bwky0.d) {
                this.d.E(((bwkz)object1), bwky0);
            }
            this.e.remove(bwky0);
            try {
                ArrayList arrayList0 = new ArrayList(map0.values());
                this.a.a(arrayList0);
            }
            catch(IOException iOException0) {
                bwne.t("Failed to persist client cache records, error:%s", iOException0);
                this.b();
            }
        }
    }
}

