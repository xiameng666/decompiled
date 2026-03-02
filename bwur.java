import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import jeb.synthetic.FIN;

public final class bwur implements bwut {
    public static final Map a;
    public static final int b;
    public final bwuc c;
    public final bxgi d;
    public final bwts e;
    public final Map f;
    public boolean g;
    public final bwvn h;
    private static final Map i;
    private final Context j;
    private SecureRandom k;

    static {
        HashMap hashMap0 = new HashMap();
        bwur.i = hashMap0;
        hashMap0.put(null, bwll.a);
        hashMap0.put("plain", bwll.a);
        hashMap0.put("html", bwll.b);
        hashMap0.put("rfc822", bwll.c);
        hashMap0.put("url", bwll.d);
        hashMap0.put("blob", bwll.e);
        hashMap0.put("date", bwll.e);
        hashMap0.put("location", bwll.e);
        hashMap0.put("verbatim", bwll.f);
        HashMap hashMap1 = new HashMap(hashMap0.size());
        bwur.a = hashMap1;
        hashMap1.put(bwll.a, "plain");
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null && !((bwll)map$Entry0.getValue()).equals(bwll.a)) {
                bwll bwll0 = (bwll)map$Entry0.getValue();
                String s = (String)map$Entry0.getKey();
                bwur.a.put(bwll0, s);
            }
        }
        bwur.b = (int)TimeUnit.DAYS.toSeconds(90L);
    }

    public bwur(bwuc bwuc0, Context context0, String s, File file0, bwts bwts0) {
        HashMap hashMap0 = new HashMap();
        bxgi bxgi0 = new bxgi(context0);
        super();
        this.g = false;
        this.j = context0;
        this.f = hashMap0;
        this.c = bwuc0;
        this.d = bxgi0;
        this.e = bwts0;
        bwvn bwvn0 = new bwvn(context0, s, file0);
        this.h = bwvn0;
        for(Object object0: bwvn0.b()) {
            this.w(bwur.K(((bwnr)object0)));
        }
        this.g = false;
    }

    public final void A(bwvl bwvl0, List list0, Integer integer0, bwnv bwnv0) {
        synchronized(this.p()) {
            bwny bwny0 = this.g(bwvl0, null);
            if(bwny0 == null) {
                bwne.g("Cannot set status for non-existent key: %s", bwvl0.c());
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwny0));
            if(list0 != null && !list0.equals(bwny0.c)) {
                this.g = true;
                if(!((bwnt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
                }
                ((bwny)((bwnt)hftp0).b_message).c = hfvv.a;
                ((bwnt)hftp0).a(list0);
            }
            if(integer0 != null && bwny0.f != ((int)integer0)) {
                this.g = true;
                int v1 = (int)integer0;
                if(!((bwnt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
                }
                bwny bwny1 = (bwny)((bwnt)hftp0).b_message;
                bwny1.b |= 16;
                bwny1.f = v1;
            }
            if(bwnv0 != null && !((ProtoLiteMessage)bwnv0).equals((bwny0.g == null ? bwnv.a : bwny0.g))) {
                this.g = true;
                if(!((bwnt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
                }
                ((bwny)((bwnt)hftp0).b_message).g = bwnv0;
                ((bwny)((bwnt)hftp0).b_message).b |= 0x20;
            }
            this.x(bwvl0, ((bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build()));
        }
    }

    public final boolean B(bwud bwud0, bwnq bwnq0) {
        boolean z = true;
        if(!"com.google.android.gms".equals(bwnq0.f)) {
            return true;
        }
        if(bwud0 == null) {
            return false;
        }
        bxgi bxgi0 = this.d;
        String s = bwnq0.d;
        String s1 = bwyr.b(s, bwud0.h);
        if(s1 == null) {
            return true;
        }
        Set set0 = bwud0.i;
        String s2 = bwud0.e;
        if(set0.contains(s1)) {
            bwne.q("Package:%s already has %s permission to access corpus:%s", new Object[]{s2, s1, s});
            return true;
        }
        Set set1 = bwud0.j;
        if(set1.contains(s1)) {
            bwne.q("Package:%s already doesn\'t have %s permission to access corpus:%s", new Object[]{s2, s1, s});
            return false;
        }
        if(cjmf.c(bxgi0.d, s1, -1, bwud0.a, s2, bwud0.g) != 0) {
            z = false;
        }
        if(z) {
            set0.add(s1);
            bwne.q("Package:%s has %s permission to access corpus:%s", new Object[]{s2, s1, s});
            return z;
        }
        set1.add(s1);
        bwne.q("Package:%s doesn\'t have %s permission to access corpus:%s", new Object[]{s2, s1, s});
        return z;
    }

    public static boolean C(bwnq bwnq0) {
        return bwsa.i(bwnq0.d);
    }

    public static boolean D(bwnq bwnq0) {
        return bwnq0.d.startsWith(".implicit:");
    }

    public static boolean E(bwnq bwnq0) {
        Iterator iterator0 = bwnq0.k.iterator();
    label_1:
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            switch(bwlh.a(((bwlo)object0).p)) {
                case 0: 
                case 1: {
                    goto label_1;
                }
                default: {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean F(bwnq bwnq0) {
        return !bwnq0.g.isEmpty();
    }

    public static Feature[] G(bwnq bwnq0) {
        return bwnq0.n ? new Feature[]{new Feature(1)} : new Feature[0];
    }

    @Override  // bwut
    public final String[] H(bwud bwud0, int v) {
        gged_interceptors gged0 = this.J(bwud0, v);
        int v1 = ((ggna)gged0).c;
        String[] arr_s = new String[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            bwnq bwnq0 = ((bwnr)gged0.get(v2)).c;
            if(bwnq0 == null) {
                bwnq0 = bwnq.a;
            }
            arr_s[v2] = bwnq0.d;
        }
        return arr_s;
    }

    public final void I(bwvl bwvl0, bwuw bwuw0, bwmq bwmq0) {
        bwuw bwuw1;
        long v2;
        int v1;
        Object object0 = this.p();
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        bwne.b("Setting config for %s", bwvl0.c());
        Map map0 = this.f;
        bwnr bwnr0 = (bwnr)map0.get(bwvl0);
        if(bwnr0 == null) {
            BitSet bitSet0 = new BitSet();
            for(Object object1: map0.values()) {
                bwnq bwnq0 = ((bwnr)object1).c;
                if(bwnq0 == null) {
                    bwnq0 = bwnq.a;
                }
                bitSet0.set(bwnq0.c);
            }
            if(bitSet0.length() == bitSet0.cardinality()) {
                v1 = bitSet0.length();
            }
            else {
                for(v1 = 0; v1 < bitSet0.length() && bitSet0.get(v1); ++v1) {
                }
            }
            if(v1 <= 0xFFFE) {
                if(this.k == null) {
                    this.k = new SecureRandom();
                }
                v2 = this.k.nextLong();
                bwuw1 = bwuw.c(0, bwnr.a, 0L);
                goto label_38;
            }
            throw new bwvo("Too many corpora");
        }
        else {
            v1 = (bwnr0.c == null ? bwnq.a : bwnr0.c).c;
            bwnq bwnq1 = bwnr0.c;
            long v3 = (bwnq1 == null ? bwnq.a : bwnq1).i;
            int v4 = (bwnq1 == null ? bwnq.a : bwnq1).m;
            if(bwnq1 == null) {
                bwnq1 = bwnq.a;
            }
            bwuw1 = bwuw.c(v4, bwnr0, bwnq1.o);
            v2 = v3;
        }
    label_38:
        if(bwuw1.j(bwuw0)) {
            if(!((bwnq)bwuw0.e()).d.isEmpty() && !((bwnq)bwuw0.e()).f.isEmpty()) {
                bwnr bwnr1 = (bwnr)bwuw1.e();
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr1).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwnr1));
                bwnq bwnq2 = (bwnq)bwuw0.e();
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq2).jf(5, null);
                hftp1.X(((ProtoLiteMessage)bwnq2));
                int v5 = bwuw0.a();
                if(!((bwnp)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnp)hftp1))).ensureMutable();
                }
                bwnq bwnq3 = (bwnq)((bwnp)hftp1).b_message;
                bwnq3.b |= 0x100;
                bwnq3.m = v5;
                long v6 = bwuw0.b();
                if(!((bwnp)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnp)hftp1))).ensureMutable();
                }
                bwnq bwnq4 = (bwnq)((bwnp)hftp1).b_message;
                bwnq4.b |= 0x400;
                bwnq4.o = v6;
                if(!((bwnp)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnp)hftp1))).ensureMutable();
                }
                bwnq bwnq5 = (bwnq)((bwnp)hftp1).b_message;
                bwnq5.b |= 1;
                bwnq5.c = v1;
                if(!((bwnp)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnp)hftp1))).ensureMutable();
                }
                bwnq bwnq6 = (bwnq)((bwnp)hftp1).b_message;
                bwnq6.b |= 0x40;
                bwnq6.i = v2;
                String s = ((bwnq)bwuw0.e()).f;
                String s1 = ((bwnq)bwuw0.e()).d;
                String s2 = ((bwnq)bwuw0.e()).e;
                Object object2 = this.p();
                __monitor_enter(object2);
                int v7 = FIN.finallyOpen$NT();
                Mac mac0 = this.h.c;
                mac0.reset();
                mac0.update(s1.getBytes(Charset.defaultCharset()));
                mac0.update(45);
                mac0.update(s.getBytes(Charset.defaultCharset()));
                mac0.update(45);
                mac0.update(s2.getBytes(Charset.defaultCharset()));
                byte[] arr_b = mac0.doFinal();
                long v8 = (long)(arr_b[7] & 0x7F);
                for(int v9 = 6; v9 >= 0; --v9) {
                    v8 = (v8 << 8) + ((long)(arr_b[v9] & 0xFF));
                }
                FIN.finallyCodeBegin$NT(v7);
                __monitor_exit(object2);
                FIN.finallyCodeEnd$NT(v7);
                if(!((bwnp)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnp)hftp1))).ensureMutable();
                }
                bwnq bwnq7 = (bwnq)((bwnp)hftp1).b_message;
                bwnq7.b |= 0x80;
                bwnq7.j = v8;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwnr bwnr2 = (bwnr)hftp0.b_message;
                bwnq bwnq8 = (bwnq)((ProtoLiteBuilder)(((bwnp)hftp1))).N_build();
                bwnq8.getClass();
                bwnr2.c = bwnq8;
                bwnr2.b |= 1;
                bwnr bwnr3 = (bwnr)hftp0.N_build();
                if(bwmq0 != null) {
                    bwnq bwnq9 = bwnr3.c == null ? bwnq.a : bwnr3.c;
                    bwog bwog0 = bwmx.b(bwur.E(bwnq9));
                    bwmx bwmx0 = bwmq0.a;
                    if(bwmx0.m == null || !bwmx0.m.x(bwnq9.j, bwnq9.c, bwog0)) {
                        bwmx0.r.d("pre_corpus_config_committed_add_corpus_failed");
                        throw new bwvr("Could not add new corpus");
                    }
                }
                bwnr bwnr4 = bwur.K(bwnr3);
                this.w(bwnr4);
                if(!this.h.d(bwnr4)) {
                    this.e.d("metadata_union_writeMetadata_err");
                }
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new bwvo("Need name and package name");
        }
        throw new bwvo("CorpusConfig: cannot " + bwuw0.g() + " when previously " + bwuw1.g());
    }

    @Override  // bwut
    public final gged_interceptors J(bwud bwud0, int v) {
        ggdy ggdy0;
        synchronized(this.p()) {
            ggdy0 = new ggdy();
            String s = bwud0.e;
            for(Object object1: this.v(bwud0, null, false, s)) {
                bwuw bwuw0 = this.k(((bwvl)object1));
                if(bwuw0 != null) {
                    bwnq bwnq0 = ((bwnr)bwuw0.e()).c;
                    if(bwnq0 == null) {
                        bwnq0 = bwnq.a;
                    }
                    if(bwnq0.f.equals(s) && (v == -1 || v == bwuw0.a())) {
                        ggdy0.i(((bwnr)bwuw0.e()));
                    }
                }
            }
        }
        return ggdy0.h();
    }

    public static final bwnr K(bwnr bwnr0) {
        if("com.google.android.gm".equals((bwnr0.c == null ? bwnq.a : bwnr0.c).f) && (bwnr0.c == null ? bwnq.a : bwnr0.c).d.startsWith("messages") && (bwnr0.c == null ? bwnq.a : bwnr0.c).l.isEmpty()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwnr0));
            bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)bwnq0));
            ((bwnp)hftp1).a(Arrays.asList(new bwpw[]{bwvy.b(0, new bwpu[]{bwvy.a(0)}), bwvy.b(1, new bwpu[]{bwvy.a(2)}), bwvy.b(3, new bwpu[]{bwvy.e()}), bwvy.b(4, new bwpu[]{bwvy.a(6)})}));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwnr bwnr1 = (bwnr)hftp0.b_message;
            bwnq bwnq1 = (bwnq)((ProtoLiteBuilder)(((bwnp)hftp1))).N_build();
            bwnq1.getClass();
            bwnr1.c = bwnq1;
            bwnr1.b |= 1;
            return (bwnr)hftp0.N_build();
        }
        return bwnr0;
    }

    public final SparseIntArray a() {
        SparseIntArray sparseIntArray0;
        synchronized(this.p()) {
            sparseIntArray0 = new SparseIntArray(this.f.size());
            for(Object object1: this.f.values()) {
                bwnq bwnq0 = ((bwnr)object1).c;
                if(bwnq0 == null) {
                    bwnq0 = bwnq.a;
                }
                if(hubg.a.j().O()) {
                    int v1 = bwnq0.s;
                    if(v1 > 0) {
                        Integer integer0 = v1;
                        if(bwur.C(bwnq0) && hubg.b() > 0L) {
                            if(bwtj.f(bwnq0.f)) {
                                continue;
                            }
                            bwsa bwsa0 = bwsa.a(bwnq0.d, bwnq0.f, bwtc.d(this.j));
                            if(bwsa0 == null) {
                                continue;
                            }
                            int v2 = bwsa0.a.c;
                            integer0.getClass();
                            integer0 = Math.min(v2, Math.min(v1, ((int)hubg.b())));
                        }
                        sparseIntArray0.put(bwnq0.c, integer0.intValue());
                        continue;
                    }
                }
                if(bwur.D(bwnq0)) {
                    int v3 = bwnq0.c;
                    Integer.valueOf(bwur.b).getClass();
                    sparseIntArray0.put(v3, bwur.b);
                }
            }
        }
        return sparseIntArray0;
    }

    public static bwlo b(RegisterSectionInfo registerSectionInfo0) {
        String s = registerSectionInfo0.b;
        bwll bwll0 = (bwll)bwur.i.get(s);
        if(bwll0 == null) {
            bwll0 = bwll.a;
        }
        String s1 = registerSectionInfo0.f == null ? "" : registerSectionInfo0.f;
        bwlf bwlf0 = (bwlf)((ProtoLiteMessage)bwlo.b).v_newBuilder();
        String s2 = registerSectionInfo0.a;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        bwlo bwlo0 = (bwlo)bwlf0.b_message;
        s2.getClass();
        int v = 1;
        bwlo0.c |= 1;
        bwlo0.d = s2;
        int v1 = registerSectionInfo0.c ^ 1;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).c |= 2;
        ((bwlo)bwlf0.b_message).e = v1;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).f = bwll0.g;
        ((bwlo)bwlf0.b_message).c |= 4;
        int v2 = registerSectionInfo0.d;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).c |= 8;
        ((bwlo)bwlf0.b_message).g = v2;
        boolean z = registerSectionInfo0.e;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).c |= 16;
        ((bwlo)bwlf0.b_message).h = z;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).c |= 0x20;
        ((bwlo)bwlf0.b_message).i = s1;
        boolean z1 = registerSectionInfo0.i != null && registerSectionInfo0.i.a;
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).c |= 0x1000;
        ((bwlo)bwlf0.b_message).r = z1;
        ArrayList arrayList0 = new ArrayList();
        if(registerSectionInfo0.a(1) != null) {
            arrayList0.add(bwln.a);
        }
        if(registerSectionInfo0.a(6) != null) {
            arrayList0.add(bwln.c);
            Feature feature0 = registerSectionInfo0.a(6);
            Object[] arr_object = null;
            if(feature0 != null) {
                String s3 = feature0.b("annotators");
                if(s3 != null) {
                    arr_object = TextUtils.split(s3, ",");
                }
            }
            bwlf0.a(Arrays.asList(arr_object));
        }
        bwlf0.k(arrayList0);
        double f = abwy.a(registerSectionInfo0);
        if((f < 1.0)) {
            int v3 = NativeIndex.b(f);
            if(!bwlf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwlf0).ensureMutable();
            }
            ((bwlo)bwlf0.b_message).c |= 0x40;
            ((bwlo)bwlf0.b_message).l = v3;
        }
        double f1 = abwy.b(registerSectionInfo0);
        if((f1 < 1.0)) {
            int v4 = NativeIndex.b(f1);
            if(!bwlf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwlf0).ensureMutable();
            }
            ((bwlo)bwlf0.b_message).c |= 0x80;
            ((bwlo)bwlf0.b_message).m = v4;
        }
        if("url".equals(s) && abwy.d(registerSectionInfo0)) {
            if(!bwlf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwlf0).ensureMutable();
            }
            ((bwlo)bwlf0.b_message).p = 1;
            ((bwlo)bwlf0.b_message).c |= 0x400;
        }
        else if(registerSectionInfo0.a(5) != null) {
            if(!bwlf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwlf0).ensureMutable();
            }
            ((bwlo)bwlf0.b_message).p = 2;
            ((bwlo)bwlf0.b_message).c |= 0x400;
        }
        String s4 = registerSectionInfo0.h;
        if(s4 != null) {
            if(!bwlf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwlf0).ensureMutable();
            }
            ((bwlo)bwlf0.b_message).c |= 0x100;
            ((bwlo)bwlf0.b_message).n = s4;
        }
        if("date".equals(s)) {
            v = 2;
        }
        else if("location".equals(s)) {
            v = 3;
        }
        if(!bwlf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwlf0).ensureMutable();
        }
        ((bwlo)bwlf0.b_message).q = v - 1;
        ((bwlo)bwlf0.b_message).c |= 0x800;
        return (bwlo)((ProtoLiteBuilder)bwlf0).N_build();
    }

    @Override  // bwut
    public final bwnq c(bwvl bwvl0) {
        bwnq bwnq0;
        synchronized(this.p()) {
            bwnr bwnr0 = (bwnr)this.f.get(bwvl0);
            if(bwnr0 == null) {
                return null;
            }
            bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
        }
        return bwnq0;
    }

    public static bwnq d(String s, bwld bwld0) {
        bwnp bwnp0 = (bwnp)((ProtoLiteMessage)bwnq.a).v_newBuilder();
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq0 = (bwnq)bwnp0.b_message;
        bwnq0.b |= 2;
        bwnq0.d = ".implicit:";
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq1 = (bwnq)bwnp0.b_message;
        s.getClass();
        bwnq1.b |= 8;
        bwnq1.f = s;
        for(int v = 0; v < bwld0.f.size(); ++v) {
            bwlo bwlo0 = ((bwlc)bwld0.f.get(v)).e;
            if(bwlo0 == null) {
                bwlo0 = bwlo.b;
            }
            int v1 = bwlo0.o;
            bwnp0.k(bwlo0);
            if(v1 != DocumentSection.a) {
                bwpw bwpw0 = bwvy.b(v1, new bwpu[]{bwvy.a(v)});
                if(!bwnp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwnp0).ensureMutable();
                }
                bwnq bwnq2 = (bwnq)bwnp0.b_message;
                bwpw0.getClass();
                bwnq2.c();
                bwnq2.l.add(bwpw0);
            }
        }
        return (bwnq)((ProtoLiteBuilder)bwnp0).N_build();
    }

    @Override  // bwut
    public final bwnr e(bwvl bwvl0) {
        bwnr bwnr0;
        synchronized(this.p()) {
            bwnr0 = (bwnr)this.f.get(bwvl0);
            if(bwnr0 == null) {
                bwnr0 = null;
            }
        }
        return bwnr0;
    }

    public final bwny f(bwvl bwvl0) {
        synchronized(this.p()) {
        }
        return this.g(bwvl0, bwny.a);
    }

    public final bwny g(bwvl bwvl0, bwny bwny0) {
        bwnr bwnr0 = (bwnr)this.f.get(bwvl0);
        if(bwnr0 == null) {
            return bwny0;
        }
        return bwnr0.d == null ? bwny.a : bwnr0.d;
    }

    public final bwus h(bwul bwul0) {
        ggfn ggfn1;
        ggfn ggfn0;
        synchronized(this.p()) {
            ggfn0 = new ggfn();
            ggfn1 = new ggfn();
            for(Object object1: this.f.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                bwnr bwnr0 = (bwnr)map$Entry0.getValue();
                bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                    int v1 = bwul0.a(bwnr0);
                    if(v1 == 1) {
                        ggfn0.i(((bwvl)map$Entry0.getKey()));
                    }
                    else {
                        if(v1 == 2) {
                            continue;
                        }
                        ggfn1.i(((bwvl)map$Entry0.getKey()));
                    }
                }
            }
        }
        return new bwus(ggfn0.h(), ggfn1.h());
    }

    @Override  // bwut
    public final bwus i(bwud bwud0, String[] arr_s, boolean z, String s) {
        HashSet hashSet0 = null;
        HashSet hashSet1 = arr_s == null ? null : new HashSet(Arrays.asList(arr_s));
        if(!bwud0.b) {
            hashSet0 = new HashSet();
            for(Object object0: this.c.m(bwud0)) {
                synchronized(this.p()) {
                    for(Object object2: ((bwua)object0).i()) {
                        bwnr bwnr0 = (bwnr)this.f.get(((bwvl)object2));
                        if(bwnr0 != null) {
                            hashSet0.add(bwnr0);
                        }
                    }
                }
            }
        }
        return this.h(new bwuh(this, hashSet1, s, hashSet0, bwud0, z));
    }

    public final bwuw j(bwvl bwvl0) {
        bwuw bwuw0 = this.k(bwvl0);
        if(bwuw0 == null) {
            return null;
        }
        bwnq bwnq0 = ((bwnr)bwuw0.e()).c;
        if(bwnq0 == null) {
            bwnq0 = bwnq.a;
        }
        return bwuw0.d(bwnq0);
    }

    @Override  // bwut
    public final bwuw k(bwvl bwvl0) {
        bwnr bwnr0 = this.e(bwvl0);
        return bwnr0 == null ? null : bwuw.c((bwnr0.c == null ? bwnq.a : bwnr0.c).m, bwnr0, (bwnr0.c == null ? bwnq.a : bwnr0.c).o);
    }

    @Override  // bwut
    public final gged_interceptors l() {
        ggdy ggdy0;
        synchronized(this.p()) {
            ggdy0 = gged_interceptors.e(this.f.size());
            for(Object object1: this.f.values()) {
                bwnr bwnr0 = (bwnr)object1;
                bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                    ggdy0.i((bwnr0.c == null ? bwnq.a : bwnr0.c));
                }
            }
        }
        return ggdy0.h();
    }

    @Override  // bwut
    public final gged_interceptors m(bwua bwua0) {
        ggdy ggdy0;
        synchronized(this.p()) {
            Set set0 = bwua0.i();
            ggdy0 = gged_interceptors.e(set0.size());
            for(Object object1: set0) {
                bwvl bwvl0 = (bwvl)object1;
                bwnr bwnr0 = (bwnr)this.f.get(bwvl0);
                if(bwnr0 != null) {
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                        ggdy0.i(bwvl0);
                    }
                }
            }
        }
        return ggdy0.h();
    }

    public final ggfp n() {
        return this.h(bwul.g).a;
    }

    @Override  // bwut
    public final ggfp o() {
        synchronized(this.p()) {
        }
        return this.h(new bwue()).a;
    }

    @Override  // bwut
    public final Object p() {
        return this.c.a.a.h;
    }

    @Override  // bwut
    public final String q(bwvl bwvl0) {
        String s1;
        String s;
        synchronized(this.p()) {
            bwnq bwnq0 = this.c(bwvl0);
            if(bwnq0 == null) {
                return null;
            }
            byte[] arr_b = bwnq0.f.getBytes(Charset.defaultCharset());
            byte[] arr_b1 = bwnq0.d.getBytes(Charset.defaultCharset());
            Mac mac0 = this.h.c;
            mac0.reset();
            mac0.update(arr_b);
            mac0.update(45);
            mac0.update(arr_b1);
            s = bboy.e(mac0.doFinal());
            s1 = Long.toHexString(bwnq0.i);
        }
        return s + "-" + s1;
    }

    @Override  // bwut
    public final List r(bwud bwud0, GlobalSearchQuerySpecification globalSearchQuerySpecification0, boolean z) {
        bwum bwum0;
        batl.l(Thread.holdsLock(this.p()));
        gged_interceptors gged0 = this.l();
        boolean z1 = bwub.d();
        int v = 0;
        batl.b(z || bwud0 != null);
        int v1 = ((ggna)gged0).c;
        List list0 = new ArrayList(v1);
        while(v < v1) {
            bwnq bwnq0 = (bwnq)gged0.get(v);
            if(bwnq0.l.isEmpty()) {
                bwum0 = bwum.b;
            }
            else {
                if(globalSearchQuerySpecification0 != null) {
                    String s = bwnq0.f;
                    String s1 = bwnq0.d;
                    Map map0 = globalSearchQuerySpecification0.r;
                    if(map0 != null) {
                        Set set0 = (Set)map0.get(s);
                        if(set0 == null || !set0.isEmpty() && !set0.contains(s1)) {
                            bwum0 = bwum.c;
                            goto label_39;
                        }
                    }
                    if(globalSearchQuerySpecification0.e == 3 && !bwur.E(bwnq0)) {
                        bwum0 = bwum.d;
                        goto label_39;
                    }
                }
                if(!z && !this.B(bwud0, bwnq0)) {
                    bwum0 = bwum.e;
                }
                else {
                    bwuc bwuc0 = this.c;
                    if(bwuc0.q(bwnq0.f)) {
                        bwua bwua0 = bwuc0.f(bwnq0.f);
                        if(bwua0 == null) {
                            bwum0 = bwum.h;
                        }
                        else if(bwur.C(bwnq0) && !bwtj.d(this.j, bwnq0.f)) {
                            bwum0 = bwum.g;
                        }
                        else {
                            bwum0 = z || bwua0.u(bwnq0.d, z1) ? bwum.a : bwum.i;
                        }
                    }
                    else {
                        bwum0 = bwum.f;
                    }
                }
            }
        label_39:
            if(bwum0.equals(bwum.a)) {
                list0.add(bwnq0);
            }
            else {
                bwne.q("CorpusConfig package name : %s, Corpus name : %s is not active for global search due to %s.", new Object[]{bwnq0.f, bwnq0.d, bwum0});
            }
            ++v;
        }
        return list0;
    }

    public static List s(List list0) {
        List list1 = new ArrayList(list0);
        list1.remove(bwln.c);
        return list1;
    }

    public static Map t(bwnq bwnq0) {
        return bwur.u(bwnq0, bwuq.a);
    }

    public static Map u(bwnq bwnq0, bwuq bwuq0) {
        int v = bwnq0.k.size();
        Map map0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            bwlo bwlo0 = (bwlo)bwnq0.k.get(v1);
            String s = bwuq0.a(bwnq0, bwlo0);
            if(!TextUtils.isEmpty(s)) {
                map0.put(s, new bwun(v1, bwlo0));
            }
        }
        return map0;
    }

    @Override  // bwut
    public final Set v(bwud bwud0, String[] arr_s, boolean z, String s) {
        return this.i(bwud0, arr_s, z, s).a;
    }

    public final void w(bwnr bwnr0) {
        bwvl bwvl0 = new bwvl(bwnr0);
        this.f.put(bwvl0, bwnr0);
        this.g = true;
        bwua bwua0 = this.c.e((bwnr0.c == null ? bwnq.a : bwnr0.c).f);
        synchronized(bwua0.e) {
            bwua0.f.add(bwvl0);
        }
    }

    public final void x(bwvl bwvl0, bwny bwny0) {
        Map map0 = this.f;
        bwnr bwnr0 = (bwnr)map0.get(bwvl0);
        if(bwnr0 == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bwnr0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwnr bwnr1 = (bwnr)hftp0.b_message;
        bwny0.getClass();
        bwnr1.d = bwny0;
        bwnr1.b |= 2;
        map0.put(bwvl0, ((bwnr)hftp0.N_build()));
    }

    public final void y(bwvl bwvl0, bwuw bwuw0) {
        try {
            this.I(bwvl0, bwuw0, null);
        }
        catch(bwvr unused_ex) {
        }
    }

    public final void z(bwvl bwvl0, bwny bwny0) {
        synchronized(this.p()) {
            Map map0 = this.f;
            bwnr bwnr0 = (bwnr)map0.get(bwvl0);
            if(bwnr0 == null) {
                bwne.g("Cannot set status for non-existent key: %s", bwvl0.c());
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)bwnr0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwnr bwnr1 = (bwnr)hftp0.b_message;
            bwny0.getClass();
            bwnr1.d = bwny0;
            bwnr1.b |= 2;
            bwnr bwnr2 = (bwnr)hftp0.N_build();
            map0.put(bwvl0, bwnr2);
            this.g = true;
            bwvl bwvl1 = new bwvl(bwnr2);
            String s = "corpuskey:" + this.h.a(bwvl1);
            this.h.a.edit().putString(s, bwwh.g(((MessageLite)bwnr2))).apply();
        }
    }
}

