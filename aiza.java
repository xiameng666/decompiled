import j..util.DesugarCollections;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class aiza implements gfsi {
    public final ajak a;
    public final ajbz b;
    public final ajal c;
    public final int d;

    public aiza(ajak ajak0, int v, ajbz ajbz0, ajal ajal0) {
        this.a = ajak0;
        this.d = v;
        this.b = ajbz0;
        this.c = ajal0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ajak ajak0 = this.a;
        ajbz ajbz0 = this.b;
        Object object1 = (ajbz)object0;
        int v = this.d;
        try {
            int v1 = 1 == ajak0.a ? 2 : 3;
            ajbu ajbu0 = object1.j == null ? ajbu.a : object1.j;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ajbu0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ajbg.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ajbg)hftp1.b_message).c = v1 - 1;
            ((ajbg)hftp1.b_message).b |= 1;
            long v2 = System.currentTimeMillis();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ajbg ajbg0 = (ajbg)hftp1.b_message;
            ajbg0.b |= 2;
            ajbg0.d = v2;
            ajbg ajbg1 = (ajbg)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ajbu ajbu1 = (ajbu)hftp0.b_message;
            ajbg1.getClass();
            ajbu1.c = ajbg1;
            ajbu1.b |= 1;
            ajbu ajbu2 = (ajbu)hftp0.N_build();
            ajbz ajbz1 = aizr.m(((ajbz)object1), v);
            ajbz ajbz2 = aizr.m(ajbz0, v);
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbz1).jf(5, null);
            hftp2.X(((ProtoLiteMessage)ajbz1));
            hftp2.X(((ProtoLiteMessage)ajbz2));
            long v3 = System.currentTimeMillis();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ajbz ajbz3 = (ajbz)hftp2.b_message;
            ajbz3.b |= 2;
            ajbz3.c = v3;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ajbz ajbz4 = (ajbz)hftp2.b_message;
            ajbu2.getClass();
            ajbz4.j = ajbu2;
            ajbz4.b |= 0x20;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((ajbz)hftp2.b_message).b().clear();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((ajbz)hftp2.b_message).d().clear();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((ajbz)hftp2.b_message).c().clear();
        alab1:
            switch(ajak0.b.ordinal()) {
                case 0: {
                    long v4 = hpsa.b();
                    HashMap hashMap0 = new HashMap();
                    hashMap0.putAll(DesugarCollections.unmodifiableMap(ajbz1.f));
                    hashMap0.putAll(DesugarCollections.unmodifiableMap(ajbz2.f));
                    hftp2.bJ(hashMap0);
                    HashMap hashMap1 = new HashMap();
                    hashMap1.putAll(DesugarCollections.unmodifiableMap(ajbz1.g));
                    hashMap1.putAll(DesugarCollections.unmodifiableMap(ajbz2.g));
                    hftp2.bL(hashMap1);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(DesugarCollections.unmodifiableMap(ajbz1.e));
                    for(Object object2: DesugarCollections.unmodifiableMap(ajbz2.e).entrySet()) {
                        HashMap hashMap3 = new HashMap();
                        String s = (String)((Map.Entry)object2).getKey();
                        ajbw ajbw0 = ajbw.a;
                        s.getClass();
                        ajbw ajbw1 = (ajbw)ajbz1.e.get(s);
                        if(ajbw1 == null) {
                            ajbw1 = ajbw0;
                        }
                        hashMap3.putAll(DesugarCollections.unmodifiableMap(ajbw1.c));
                        hashMap3.putAll(DesugarCollections.unmodifiableMap(((ajbw)((Map.Entry)object2).getValue()).c));
                        String s1 = (String)((Map.Entry)object2).getKey();
                        ajbw ajbw2 = (ajbw)((Map.Entry)object2).getValue();
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw2).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)ajbw2));
                        hftp3.bT(hashMap3);
                        hashMap2.put(s1, ((ajbw)hftp3.N_build()));
                    }
                    hftp2.bK(hashMap2);
                    Iterator iterator1 = aizr.h(ajbz1).iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            break alab1;
                        }
                        Object object3 = iterator1.next();
                        String s2 = (String)object3;
                        if(hpsk.d()) {
                            ajbw ajbw3 = ajbw.a;
                            s2.getClass();
                            ajbw ajbw4 = (ajbw)ajbz1.e.get(s2);
                            if(ajbw4 != null) {
                                ajbw3 = ajbw4;
                            }
                            if(!Objects.equals(ajbw3.d, "com.google.android.gms")) {
                                goto label_97;
                            }
                            continue;
                        }
                    label_97:
                        HashSet hashSet0 = new HashSet();
                        ajbw ajbw5 = ajbw.a;
                        s2.getClass();
                        ajbw ajbw6 = (ajbw)ajbz1.e.get(s2);
                        if(ajbw6 == null) {
                            ajbw6 = ajbw5;
                        }
                        hashSet0.addAll(DesugarCollections.unmodifiableMap(ajbw6.c).keySet());
                        s2.getClass();
                        ajbw ajbw7 = (ajbw)ajbz2.e.get(s2);
                        if(ajbw7 != null) {
                            ajbw5 = ajbw7;
                        }
                        hashSet0.addAll(DesugarCollections.unmodifiableMap(ajbw5.c).keySet());
                        if(((long)(hashSet0.size() + (ajbz1.f(s2) || ajbz2.f(s2) ? 1 : 0))) <= v4) {
                            continue;
                        }
                        hftp2.bR(s2);
                        hftp2.bQ(s2);
                        hftp2.bS(s2);
                        if(ajbz2.f(s2)) {
                            s2.getClass();
                            ByteString hfsf0 = (ByteString)ajbz2.f.get(s2);
                            if(hfsf0 == null) {
                                throw new IllegalArgumentException();
                            }
                            hftp2.bM(s2, hfsf0);
                        }
                        if(ajbz2.h(s2)) {
                            s2.getClass();
                            ajbp ajbp0 = (ajbp)ajbz2.g.get(s2);
                            if(ajbp0 == null) {
                                throw new IllegalArgumentException();
                            }
                            hftp2.bO(s2, ajbp0);
                        }
                        if(!ajbz2.g(s2)) {
                            continue;
                        }
                        s2.getClass();
                        ajbw ajbw8 = (ajbw)ajbz2.e.get(s2);
                        if(ajbw8 == null) {
                            throw new IllegalArgumentException();
                        }
                        hftp2.bN(s2, ajbw8);
                        continue;
                    }
                }
                case 1: {
                    hftp2.bJ(DesugarCollections.unmodifiableMap(ajbz2.f));
                    hftp2.bL(DesugarCollections.unmodifiableMap(ajbz2.g));
                    hftp2.bK(DesugarCollections.unmodifiableMap(ajbz2.e));
                }
            }
            for(Object object4: DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajbz)hftp2.b_message).k)).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object4;
                ajbb ajbb0 = ((ajbc)map$Entry0.getValue()).c;
                if(ajbb0 == null) {
                    ajbb0 = ajbb.a;
                }
                int v5 = ajbn.a(ajbb0.c) == 0 ? 1 : ajbn.a(ajbb0.c);
                if(v5 != 1) {
                    String s3 = (String)map$Entry0.getKey();
                    aizr.u(hftp2, ((ajbz)hftp2.N_build()), s3, v5, false);
                }
            }
            return (ajbz)hftp2.N_build();
        }
        catch(aizu aizu0) {
            a.ae(aizo.a.i(), "Unable to write Blockstore data!", aizu0);
            this.c.a = 3;
            return object1;
        }
    }
}

