import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class bwvd extends bwzp {
    private static final bwvc a;
    private final Context b;
    private final bwzn c;
    private final bwuj d;
    private final bwuc e;
    private final bwts f;
    private final bwtl n;
    private final NativeIndex o;
    private final bwqf p;
    private final bwvl q;
    private final String r;
    private final long s;
    private bwvb t;
    private final bwvf u;

    static {
        bwvd.a = new bwvc(2, 0L, false, false);
    }

    public bwvd(Context context0, bwzn bwzn0, bwuj bwuj0, bwuc bwuc0, bwts bwts0, bwtl bwtl0, NativeIndex nativeIndex0, bwqf bwqf0, String s, bwvl bwvl0, String s1, long v, bwvf bwvf0, bwvb bwvb0) {
        bxbi bxbi0 = bxbj.a(context0);
        super(gltq.Q, 2, 3, s, bxbi0);
        this.b = context0;
        this.c = bwzn0;
        this.d = bwuj0;
        this.e = bwuc0;
        this.f = bwts0;
        this.n = bwtl0;
        this.o = nativeIndex0;
        this.p = bwqf0;
        this.q = bwvl0;
        this.r = s1;
        this.s = v;
        this.u = bwvf0;
        this.t = bwvb0;
    }

    @Override  // bwzp
    protected final Object a() {
        bwuj bwuj0 = this.d;
        bwvl bwvl0 = this.q;
        bwnr bwnr0 = bwuj0.b.e(bwvl0);
        String s = bwuj0.b.q(bwvl0);
        if(bwnr0 != null) {
            bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
            if((bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) && (s == null || s.equals(this.r))) {
                bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
                if(!bwur.F(bwnq0)) {
                    bwne.t("Cannot schedule indexing on non-synced corpus %s", bwvl0.c());
                    return bwvd.a;
                }
                String s1 = bwnq0.f;
                bwuc bwuc0 = this.e;
                bwua bwua0 = bwuc0.f(s1);
                if(bwua0 != null && bwua0.s()) {
                    if(this.t == null) {
                        bwne.n("Indexing %s from %s", bwvl0.c(), s1);
                        ContentResolver contentResolver0 = this.b.getContentResolver();
                        Uri uri0 = Uri.parse((bwnr0.c == null ? bwnq.a : bwnr0.c).g);
                        String s2 = (bwnr0.d == null ? bwny.a : bwnr0.d).h;
                        int v = bwnq0.k.size();
                        String[] arr_s = new String[v];
                        for(int v1 = 0; v1 < v; ++v1) {
                            arr_s[v1] = "section_" + ((bwlo)bwnq0.k.get(v1)).d;
                        }
                        this.t = new bwvb(new bwva(contentResolver0, uri0, s2, arr_s));
                    }
                    long v2 = this.s;
                    Object object0 = this.c(bwnr0, this.t.a, v2);
                    if(!((bwvc)object0).a()) {
                        return object0;
                    }
                    bwvd bwvd0 = new bwvd(this.b, this.c, bwuj0, bwuc0, this.f, this.n, this.o, this.p, this.j, bwvl0, this.r, v2, this.u, this.t);
                    this.c.h(bwvd0);
                    return object0;
                }
                bwne.l("Not indexing corpus from package %s as it has never connected", s1);
                return bwvd.a;
            }
        }
        bwne.b("Corpus no longer exists %s", bwvl0.c());
        return bwvd.a;
    }

    final bwvc c(bwnr bwnr0, bwva bwva0, long v) {
        boolean z5;
        int v26;
        int v25;
        int v24;
        boolean z4;
        long v23;
        long v16;
        NativeIndex nativeIndex1;
        bwwk bwwk0;
        byte[] arr_b1;
        bwlc bwlc0;
        Iterator iterator1;
        int v20;
        ProtoLiteBuilder hftp2;
        bwlo bwlo0;
        bwun bwun0;
        String s3;
        Iterator iterator0;
        long v19;
        Integer integer0;
        int v18;
        bwld bwld0;
        bwlb bwlb0;
        int v17;
        bwnq bwnq2;
        bxgk bxgk3;
        byte[] arr_b;
        long v15;
        String s2;
        int v14;
        bxgk bxgk2;
        String s;
        int v13;
        boolean z3;
        long v11;
        bwuz bwuz1;
        long v10;
        long v9;
        bwnq bwnq1;
        long v8;
        bxgk bxgk1;
        int v7;
        long v6;
        int v5;
        Map map0;
        bwnq bwnq0;
        boolean z1;
        bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bwny0));
        NativeIndex nativeIndex0 = this.o;
        boolean z = (bwnr0.c == null ? bwnq.a : bwnr0.c).h;
        int v1 = this.p.h(nativeIndex0.a());
        if(z) {
            z1 = v1 == 2;
            if(!z1) {
                bwne.l("Cannot sync trimmable corpus: %s", bwqf.i(v1));
            }
        }
        else {
            z1 = v1 - 2 <= 1;
            if(!z1) {
                bwne.l("Cannot sync untrimmable corpus: %s", bwqf.i(v1));
            }
        }
        if(!z1) {
            if(!((bwny)((bwnt)hftp0).b_message).e) {
                if(!((bwnt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
                }
                bwny bwny1 = (bwny)((bwnt)hftp0).b_message;
                bwny1.b |= 8;
                bwny1.e = true;
                bwur bwur0 = this.d.a();
                bwny bwny2 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build();
                bwur0.z(this.q, bwny2);
            }
            return bwvd.a;
        }
        if(((bwny)((bwnt)hftp0).b_message).e) {
            if(!((bwnt)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
            }
            bwny bwny3 = (bwny)((bwnt)hftp0).b_message;
            bwny3.b |= 8;
            bwny3.e = false;
            bwur bwur1 = this.d.a();
            bwny bwny4 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build();
            bwur1.z(this.q, bwny4);
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)bwnr0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwnr bwnr1 = (bwnr)hftp1.b_message;
        bwny bwny5 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build();
        bwny5.getClass();
        bwnr1.d = bwny5;
        bwnr1.b |= 2;
        bwnr bwnr2 = (bwnr)hftp1.N_build();
        int v2 = ((bwny)((bwnt)hftp0).b_message).f;
        long v3 = nativeIndex0.f((bwnr2.c == null ? bwnq.a : bwnr2.c).c, false);
        if(v3 < 0L) {
            v3 = 0L;
        }
        bxgk bxgk0 = new bxgk();
        try {
            bwnq0 = bwnr2.c == null ? bwnq.a : bwnr2.c;
            bwva0.b(v3);
            map0 = bwur.t(bwnq0);
            long v4 = SystemClock.uptimeMillis();
            v5 = 0;
            v6 = v3;
        }
        catch(Throwable throwable0) {
            try {
                v7 = v2;
                bxgk1 = bxgk0;
                v8 = v3;
                bwnq1 = bwnq0;
                v9 = v8;
                goto label_399;
            }
            catch(bwvj bwvj0) {
                goto label_410;
            }
            catch(bwvi bwvi0) {
                bwne.t("Content incarnation mismatch: %s", bwvi0.getMessage());
                z5 = true;
                v25 = v7;
                goto label_488;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                goto label_445;
            }
        }
        while(true) {
            bwuz bwuz0 = bwva0.a;
            if(!bwuz0.f() && !bwva0.b.f()) {
                v7 = v2;
                v8 = v3;
                bwnq1 = bwnq0;
                v9 = v6;
                bxgk1 = bxgk0;
            }
            else {
                try {
                    v7 = v2;
                    v10 = bwuz0.a();
                    bwuz1 = bwva0.b;
                    v7 = v2;
                }
                catch(Throwable throwable0) {
                    try {
                        v8 = v3;
                        bwnq1 = bwnq0;
                        v9 = v6;
                        bxgk1 = bxgk0;
                        goto label_399;
                    }
                    catch(bwvj bwvj0) {
                        goto label_410;
                    }
                    catch(bwvi bwvi0) {
                        bwne.t("Content incarnation mismatch: %s", bwvi0.getMessage());
                        z5 = true;
                        v25 = v7;
                        goto label_488;
                    }
                    catch(OutOfMemoryError outOfMemoryError0) {
                        goto label_445;
                    }
                }
                try {
                    v11 = Math.min(v10, bwuz1.a());
                }
                catch(Throwable throwable0) {
                    try {
                        bwnq1 = bwnq0;
                        v8 = v3;
                        v9 = v6;
                        bxgk1 = bxgk0;
                        goto label_399;
                    }
                    catch(bwvj bwvj0) {
                        goto label_410;
                    }
                    catch(bwvi bwvi0) {
                        bwne.t("Content incarnation mismatch: %s", bwvi0.getMessage());
                        z5 = true;
                        v25 = v7;
                        goto label_488;
                    }
                    catch(OutOfMemoryError outOfMemoryError0) {
                        goto label_445;
                    }
                }
                boolean z2 = v10 == v11;
                int v12 = Long.compare(v11, v6);
                if(v12 == 0) {
                    if(z2) {
                        z3 = z2;
                        bwnq1 = bwnq0;
                        v13 = 0;
                        s = "docs";
                    }
                    else {
                        z3 = z2;
                        bwnq1 = bwnq0;
                        v13 = 0;
                        s = "tags";
                    }
                    try {
                        bxgk2 = bxgk0;
                        bwne.c("Dup seqno for %s pkg %s %d last %d", new Object[]{s, bwnq1.f, v11, v6});
                        v14 = v5 + 1;
                    }
                    catch(Throwable throwable0) {
                        v8 = v3;
                        v9 = v6;
                        bxgk1 = bxgk2;
                        goto label_399;
                    }
                }
                else {
                    z3 = z2;
                    bxgk2 = bxgk0;
                    bwnq1 = bwnq0;
                    v13 = v12;
                    v14 = 0;
                }
                if(v13 < 0 || v14 > 10) {
                    break;
                }
                if(z3) {
                    if(v13 > 0) {
                        try {
                            String s1 = bwuz0.c("action");
                            s2 = bwuz0.c("uri");
                            if(s2 == null || bwnb.a("Uri", s2, 0x100) != null) {
                            }
                            else if(TextUtils.equals(s1, "add")) {
                                goto label_128;
                            }
                            else {
                                goto label_279;
                            }
                            goto label_317;
                        }
                        catch(Throwable throwable0) {
                            v15 = v6;
                            bxgk1 = bxgk2;
                            v8 = v3;
                            goto label_398;
                        }
                        try {
                        label_128:
                            arr_b = bwuz0.h("section_thing_proto");
                        }
                        catch(Throwable throwable0) {
                            try {
                                v15 = v6;
                                bxgk3 = bxgk2;
                                v8 = v3;
                            }
                            catch(Throwable throwable0) {
                            }
                            bxgk1 = bxgk3;
                            goto label_398;
                        }
                        if(arr_b == null) {
                            try {
                                bxgk3 = bxgk2;
                                v8 = v3;
                                bwnq2 = bwnr2.c;
                                if(bwnq2 == null) {
                                    goto label_153;
                                }
                                goto label_154;
                            }
                            catch(Throwable throwable0) {
                                v15 = v6;
                                bxgk1 = bxgk3;
                                goto label_398;
                            }
                            try {
                            label_153:
                                bwnq2 = bwnq.a;
                            }
                            catch(Throwable throwable0) {
                                bxgk1 = bxgk3;
                                v9 = v6;
                                goto label_399;
                            }
                            try {
                            label_154:
                                v17 = bwnq2.c;
                                bwlb0 = (bwlb)((ProtoLiteMessage)bwld.a).v_newBuilder();
                                if(!bwlb0.b_message.isImmutable()) {
                                    goto label_157;
                                }
                                goto label_163;
                            }
                            catch(Throwable throwable0) {
                                v15 = v6;
                                bxgk1 = bxgk3;
                                goto label_398;
                            }
                            try {
                            label_157:
                                ((ProtoLiteBuilder)bwlb0).ensureMutable();
                            }
                            catch(Throwable throwable0) {
                                bxgk1 = bxgk3;
                                v9 = v6;
                                goto label_399;
                            }
                            try {
                            label_163:
                                bwld0 = (bwld)bwlb0.b_message;
                                v15 = v6;
                            }
                            catch(Throwable throwable0) {
                                try {
                                    v15 = v6;
                                }
                                catch(Throwable throwable0) {
                                }
                                bxgk1 = bxgk3;
                                goto label_398;
                            }
                            try {
                                bwld0.b |= 2;
                                bwld0.d = s2;
                                if(bwuz0.a == null) {
                                    v18 = 0;
                                }
                                else {
                                    integer0 = (Integer)bwuz0.b.get("doc_score");
                                    if(integer0 == null) {
                                        v18 = 0;
                                        goto label_182;
                                    }
                                    v18 = bwuz0.a.b.getInt(integer0.intValue());
                                }
                                goto label_182;
                            }
                            catch(Throwable throwable0) {
                                bxgk1 = bxgk3;
                                goto label_398;
                            }
                            try {
                                v18 = bwuz0.a.b.getInt(integer0.intValue());
                                goto label_182;
                            }
                            catch(Throwable throwable1) {
                                try {
                                    throw new bwvj(throwable1);
                                label_182:
                                    if(!bwlb0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)bwlb0).ensureMutable();
                                    }
                                    bwld bwld1 = (bwld)bwlb0.b_message;
                                    bwld1.b |= 4;
                                    bwld1.e = v18;
                                    if(!bwlb0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)bwlb0).ensureMutable();
                                    }
                                    bwld bwld2 = (bwld)bwlb0.b_message;
                                    bwld2.b |= 1;
                                    bwld2.c = v17;
                                    if(bwuz0.a != null) {
                                        Integer integer1 = (Integer)bwuz0.b.get("created_timestamp");
                                        if(integer1 != null) {
                                            v19 = bwuz0.a.b(integer1.intValue());
                                            goto label_198;
                                        }
                                    }
                                    v19 = 0L;
                                label_198:
                                    if(!bwlb0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)bwlb0).ensureMutable();
                                    }
                                    bwld bwld3 = (bwld)bwlb0.b_message;
                                    bwld3.b |= 8;
                                    bwld3.g = v19;
                                    iterator0 = map0.entrySet().iterator();
                                    while(true) {
                                    label_204:
                                        if(!iterator0.hasNext()) {
                                            goto label_273;
                                        }
                                        Object object0 = iterator0.next();
                                        s3 = "section_" + ((String)((Map.Entry)object0).getKey());
                                        bwun0 = (bwun)((Map.Entry)object0).getValue();
                                        if(bwuz0.a != null) {
                                            Integer integer2 = (Integer)bwuz0.b.get(s3);
                                            if(integer2 != null) {
                                                break;
                                            }
                                        }
                                        goto label_245;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    bxgk1 = bxgk3;
                                    goto label_398;
                                }
                            }
                            try {
                                if(bwuz0.a.b.getType(integer2.intValue()) == 4) {
                                    goto label_215;
                                }
                                goto label_245;
                            }
                            catch(Throwable throwable2) {
                                try {
                                    throw new bwvj(throwable2);
                                }
                                catch(Throwable throwable0) {
                                    bxgk1 = bxgk3;
                                    goto label_398;
                                }
                            }
                            try {
                            label_215:
                                bwlo0 = bwun0.b;
                                if(bwlo0.e) {
                                    throw new bwvj(new IllegalStateException("Blob section " + bwun0.b.d + " cannot be indexed"));
                                }
                                hftp2 = ((ProtoLiteMessage)bwlc.a).v_newBuilder();
                                v20 = bwun0.a;
                                iterator1 = iterator0;
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp2.b_message;
                                bwlc0 = (bwlc)hftv0;
                                goto label_228;
                            }
                            catch(Throwable throwable0) {
                            }
                            try {
                                bxgk1 = bxgk3;
                                goto label_398;
                            label_228:
                                bwlc0.b |= 1;
                                bwlc0.c = v20;
                                if(!hftv0.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                bwlc bwlc1 = (bwlc)hftp2.b_message;
                                bwlo0.getClass();
                                bwlc1.e = bwlo0;
                                bwlc1.b |= 0x20;
                                ByteString hfsf0 = ByteString.copyFrom(bwuz0.h(s3));
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                bwlc bwlc2 = (bwlc)hftp2.b_message;
                                bwlc2.b |= 4;
                                bwlc2.d = hfsf0;
                                bwlb0.a(((bwlc)hftp2.N_build()));
                                iterator0 = iterator1;
                                goto label_204;
                            label_245:
                                iterator1 = iterator0;
                                String s4 = bwuz0.c(s3);
                                if(!TextUtils.isEmpty(s4)) {
                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)bwlc.a).v_newBuilder();
                                    int v21 = bwun0.a;
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp3.b_message;
                                    ((bwlc)hftv1).b |= 1;
                                    ((bwlc)hftv1).c = v21;
                                    bwlo bwlo1 = bwun0.b;
                                    if(!hftv1.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    bwlc bwlc3 = (bwlc)hftp3.b_message;
                                    bwlo1.getClass();
                                    bwlc3.e = bwlo1;
                                    bwlc3.b |= 0x20;
                                    ByteString hfsf1 = ByteString.A(s4);
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    bwlc bwlc4 = (bwlc)hftp3.b_message;
                                    bwlc4.b |= 4;
                                    bwlc4.d = hfsf1;
                                    bwlb0.a(((bwlc)hftp3.N_build()));
                                    iterator0 = iterator1;
                                    goto label_204;
                                }
                                iterator0 = iterator1;
                                goto label_204;
                            label_273:
                                gloj gloj1 = nativeIndex0.m(v11, ((bwld)((ProtoLiteBuilder)bwlb0).N_build()), bwux.a());
                                bxgk3.b("index " + NativeIndex.t(this.d((bwnr2.c == null ? bwnq.a : bwnr2.c), gloj1)));
                                nativeIndex1 = nativeIndex0;
                                v16 = v11;
                                bxgk1 = bxgk3;
                                goto label_323;
                            label_279:
                                v15 = v6;
                                bxgk3 = bxgk2;
                                v8 = v3;
                                if(TextUtils.equals(s1, "del")) {
                                    glte glte1 = nativeIndex0.q(v11, (bwnr2.c == null ? bwnq.a : bwnr2.c).c, s2);
                                    bxgk3.b("delete " + NativeIndex.t(glte1));
                                    if(glte.a.equals(glte1)) {
                                        bwtl bwtl0 = this.n;
                                        bwnq bwnq3 = bwnr2.c;
                                        String s5 = (bwnq3 == null ? bwnq.a : bwnq3).f;
                                        if(bwnq3 == null) {
                                            bwnq3 = bwnq.a;
                                        }
                                        bwtl0.d(s5, bwnq3.d, s2);
                                    }
                                    nativeIndex1 = nativeIndex0;
                                    v16 = v11;
                                    bxgk1 = bxgk3;
                                    goto label_323;
                                }
                                else {
                                    if(bwvu.c() && TextUtils.equals(s1, "mod")) {
                                        arr_b1 = bwuz0.h("section_thing_proto");
                                        if(arr_b1 == null) {
                                            bxgk3.b("bad section_thing_proto");
                                            nativeIndex1 = nativeIndex0;
                                            v16 = v11;
                                            bxgk1 = bxgk3;
                                            goto label_323;
                                        }
                                        else {
                                            bwwk0 = bwvm.a(bwnr2);
                                            goto label_306;
                                        }
                                    }
                                    goto label_312;
                                }
                                goto label_317;
                            }
                            catch(Throwable throwable0) {
                                bxgk1 = bxgk3;
                                goto label_398;
                            }
                        }
                        else {
                            try {
                                v8 = v3;
                                gloj gloj0 = nativeIndex0.n(v11, arr_b, bwvm.a(bwnr2), (bwnr2.c == null ? bwnq.a : bwnr2.c), bwux.a());
                                glte glte0 = this.d((bwnr2.c == null ? bwnq.a : bwnr2.c), gloj0);
                                bxgk2.b("index " + NativeIndex.t(glte0));
                                bxgk2.b("index-thing " + NativeIndex.t(glte0));
                                bxgk1 = bxgk2;
                                nativeIndex1 = nativeIndex0;
                                v16 = v11;
                                goto label_323;
                            }
                            catch(Throwable throwable0) {
                                v9 = v6;
                                bxgk1 = bxgk2;
                                goto label_399;
                            }
                        }
                        goto label_279;
                        try {
                            bxgk1 = bxgk3;
                            goto label_398;
                        label_306:
                            bxgk1 = bxgk3;
                            gloj gloj2 = nativeIndex0.o(v11, arr_b1, bwwk0, (bwnr2.c == null ? bwnq.a : bwnr2.c), bwux.a());
                            nativeIndex1 = nativeIndex0;
                            v16 = v11;
                            bxgk1.b("modify " + NativeIndex.t(this.d((bwnr2.c == null ? bwnq.a : bwnr2.c), gloj2)));
                            goto label_323;
                        label_312:
                            nativeIndex1 = nativeIndex0;
                            v16 = v11;
                            bxgk1 = bxgk3;
                            bxgk1.b("bad action");
                            goto label_323;
                        label_317:
                            v15 = v6;
                            nativeIndex1 = nativeIndex0;
                            bxgk1 = bxgk2;
                            v16 = v11;
                            v8 = v3;
                            bxgk1.b("bad uri");
                        }
                        catch(Throwable throwable0) {
                            goto label_398;
                        }
                    label_323:
                        v9 = v16;
                    }
                    else {
                        nativeIndex1 = nativeIndex0;
                        bxgk1 = bxgk2;
                        v16 = v11;
                        v8 = v3;
                        v9 = v6;
                    }
                    try {
                        if(!bwuz0.e()) {
                            bwva0.b(v16);
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_399;
                    }
                }
                else {
                    v15 = v6;
                    nativeIndex1 = nativeIndex0;
                    bxgk1 = bxgk2;
                    v8 = v3;
                    if(v13 > 0) {
                        try {
                            int v22 = bwnq1.c;
                            String s6 = bwuz1.c("action");
                            String s7 = bwuz1.c("uri");
                            String s8 = bwuz1.c("tag");
                            String s9 = bwnb.a("Uri", s7, 0x100);
                            if(s7 != null && s9 == null) {
                                String s10 = bwnb.a("Tag", s8, 1000);
                                if(s8 == null || s10 != null) {
                                    v23 = v11;
                                    bwne.g("Invalid tag string: %s", s10);
                                    bxgk1.b("bad tag");
                                }
                                else if(TextUtils.equals(s6, "add")) {
                                    v23 = v11;
                                    bxgk1.b("tag " + NativeIndex.t(NativeIndex.r(NativeIndex.nativeTagDocument(nativeIndex1.b, v11, v22, NativeIndex.B(s7), NativeIndex.B(s8), 0xFFFE, true))));
                                }
                                else if(TextUtils.equals(s6, "del")) {
                                    v23 = v11;
                                    bxgk1.b("tag " + NativeIndex.t(NativeIndex.r(NativeIndex.nativeTagDocument(nativeIndex1.b, v11, v22, NativeIndex.B(s7), NativeIndex.B(s8), 0xFFFE, false))));
                                }
                                else {
                                    v23 = v11;
                                    bxgk1.b("bad action");
                                }
                            }
                            else {
                                v23 = v11;
                                bwne.g("Invalid tag uri: %s", s9);
                                bxgk1.b("bad uri");
                            }
                            v15 = v23;
                            goto label_367;
                        label_366:
                            v23 = v11;
                        label_367:
                            if(!bwuz1.e()) {
                                bwva0.b(v23);
                            }
                            v9 = v15;
                            goto label_370;
                        }
                        catch(Throwable throwable0) {
                            goto label_398;
                        }
                    }
                    else {
                        goto label_366;
                    }
                    goto label_367;
                }
                try {
                label_370:
                    if(SystemClock.uptimeMillis() - v4 < 5000L) {
                        goto label_382;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_399;
                }
            }
            try {
                if(this.o.p(bwnq1.c, v9) != glte.a) {
                    bwne.f("Error advancing the last sequence number");
                    goto label_405;
                }
            }
            catch(bwvj bwvj0) {
                goto label_410;
            }
            catch(bwvi bwvi0) {
                bwne.t("Content incarnation mismatch: %s", bwvi0.getMessage());
                z5 = true;
                v25 = v7;
                goto label_488;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                goto label_445;
            }
            if(v9 > v8) {
                z4 = true;
            }
            else {
                z4 = false;
                v24 = z4;
                v25 = 0;
                z5 = false;
                goto label_489;
            label_382:
                bxgk0 = bxgk1;
                nativeIndex0 = nativeIndex1;
                bwnq0 = bwnq1;
                v6 = v9;
                v2 = v7;
                v5 = v14;
                v3 = v8;
                continue;
            }
            v24 = z4;
            v25 = 0;
            z5 = false;
            goto label_489;
        }
        try {
            v15 = v6;
            v8 = v3;
            bxgk1 = bxgk2;
            bwne.h("Out of order seqno for %s pkg %s %d last %d", new Object[]{(z3 ? "docs" : "tags"), bwnq1.f, v11, v15});
            bxgk1.b("out of order seqno");
            v9 = v15;
            goto label_403;
        }
        catch(Throwable throwable0) {
        }
    label_398:
        v9 = v15;
        try {
        label_399:
            if(this.o.p(bwnq1.c, v9) != glte.a) {
                bwne.f("Error advancing the last sequence number");
                this.f.d("advance_seqno_error");
            }
            throw throwable0;
        label_403:
            if(nativeIndex0.p(bwnq1.c, v9) != glte.a) {
                bwne.f("Error advancing the last sequence number");
            label_405:
                this.f.d("advance_seqno_error");
            }
            z4 = false;
            v24 = z4;
            v25 = 0;
            z5 = false;
            goto label_489;
        }
        catch(bwvj bwvj0) {
        label_410:
            Throwable throwable3 = bwvj0.getCause();
            bwne.g("Cursor call threw an exception: %s", (throwable3 == null ? bwvj0.toString() : throwable3.getMessage()));
            if((throwable3 instanceof DeadObjectException)) {
                bwts bwts0 = this.f;
                bwts0.d("cursor_died_exception");
                bxgk1.b("cursor-died");
                if(v7 == 0) {
                    bwne.g("Indexing content provider failed; will retry %d times", Integer.valueOf(3));
                    v25 = 3;
                }
                else {
                    v25 = v7 - 1;
                    if(v25 == 0) {
                        bwts0.d("cursor_retries_failed");
                        v26 = 0;
                    }
                    else {
                        v26 = v25;
                    }
                    bwne.g("Indexing content provider failed again; %d retries remaining", Integer.valueOf(v26));
                }
            }
            else {
                if((throwable3 instanceof SecurityException)) {
                    this.f.d("cursor_security_exception");
                }
                else {
                    String s11 = (bwnr2.c == null ? bwnq.a : bwnr2.c).d;
                    if(!bwsa.i(s11)) {
                        this.f.d("cursor_other_exception");
                        bwne.g("Indexing content provider failed for legacy corpus %s", s11);
                    }
                }
                bxgk1.b("cursor-exception");
                v25 = 0;
            }
            z5 = 0;
            goto label_488;
        }
        catch(bwvi bwvi0) {
            bwne.t("Content incarnation mismatch: %s", bwvi0.getMessage());
            z5 = true;
            v25 = v7;
            goto label_488;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
        label_445:
            bwne.j(outOfMemoryError0, "Out of memory while indexing content provider.", new Object[0]);
            try {
                bwts bwts1 = this.f;
                bwnq bwnq4 = bwnr2.c;
                String s12 = (bwnq4 == null ? bwnq.a : bwnq4).f;
                if(bwnq4 == null) {
                    bwnq4 = bwnq.a;
                }
                String s13 = bxge.a(bwnq4);
                long v27 = huax.a.g().h();
                if(bwts1.m(v27, false)) {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)glnq.a).v_newBuilder();
                    if(s12 != null) {
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        glnq glnq0 = (glnq)hftp4.b_message;
                        glnq0.b |= 1;
                        glnq0.c = s12;
                    }
                    if(s13 != null) {
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        glnq glnq1 = (glnq)hftp4.b_message;
                        glnq1.b |= 2;
                        glnq1.d = s13;
                    }
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    glnz glnz0 = (glnz)hftp5.b_message;
                    glnq glnq2 = (glnq)hftp4.N_build();
                    glnq2.getClass();
                    glnz0.w = glnq2;
                    glnz0.b |= 0x8000000;
                    if(huae.g()) {
                        bwts1.t(hftp5);
                        bwts1.a.d(cdef.dL, 6006, hftp5);
                    }
                    else {
                        bwts1.s(6006, hftp5, v27);
                    }
                }
                v24 = 2;
                v25 = 0;
                z5 = false;
                goto label_489;
            }
            catch(OutOfMemoryError outOfMemoryError1) {
            }
        }
        bwne.j(outOfMemoryError1, "Out of memory while logging.", new Object[0]);
        v25 = 0;
        z5 = false;
    label_488:
        v24 = 2;
    label_489:
        boolean z6 = v9 > v8 ? true : 0;
        if(z6) {
            bwne.c("Indexed %s from %d to %d", new Object[]{this.q.c(), v8, v9});
        }
        else {
            bwne.b("Query from %s found nothing", this.q.c());
        }
        bwny bwny6 = bwnr2.d == null ? bwny.a : bwnr2.d;
        ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny6).jf(5, null);
        hftp6.X(((ProtoLiteMessage)bwny6));
        List list0 = bxgk1.a(DesugarCollections.unmodifiableList(((bwny)((bwnt)hftp6).b_message).c));
        if(!((bwnt)hftp6).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((bwnt)hftp6))).ensureMutable();
        }
        ((bwny)((bwnt)hftp6).b_message).c = hfvv.a;
        ((bwnt)hftp6).a(list0);
        String s14 = bwva0.c;
        if(s14 != null && !s14.equals(((bwny)((bwnt)hftp6).b_message).h)) {
            bwne.d("Content incarnation changed from %s to %s, saving to prefs now", ((bwny)((bwnt)hftp6).b_message).h, s14);
            if(!((bwnt)hftp6).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((bwnt)hftp6))).ensureMutable();
            }
            bwny bwny7 = (bwny)((bwnt)hftp6).b_message;
            bwny7.b |= 16;
            bwny7.f = v25;
            if(!((bwnt)hftp6).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((bwnt)hftp6))).ensureMutable();
            }
            bwny bwny8 = (bwny)((bwnt)hftp6).b_message;
            bwny8.b |= 0x40;
            bwny8.h = s14;
            bwur bwur2 = this.d.a();
            bwny bwny9 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp6))).N_build();
            bwur2.z(this.q, bwny9);
        }
        else {
            bwur bwur3 = this.d.a();
            List list1 = DesugarCollections.unmodifiableList(((bwny)((bwnt)hftp6).b_message).c);
            bwur3.A(this.q, list1, Integer.valueOf(v25), null);
        }
        batl.l(((boolean)(bxgk1.c() ^ 1)));
        return v25 <= 0 ? new bwvc(v24, 0L, z6, z5) : new bwvc(v24, v, z6, z5);
    }

    final glte d(bwnq bwnq0, gloj gloj0) {
        if(gloj0 == null) {
            return glte.f;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gloi.a).v_newBuilder();
        String s = bwnq0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gloi gloi0 = (gloi)hftp0.b_message;
        s.getClass();
        gloi0.b |= 1;
        gloi0.c = s;
        String s1 = bxge.a(bwnq0);
        if(s1 != null && !TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gloi gloi1 = (gloi)hftp0.b_message;
            gloi1.b |= 2;
            gloi1.d = s1;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gloj0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gloj0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gloj gloj1 = (gloj)hftp1.b_message;
        gloi gloi2 = (gloi)hftp0.N_build();
        gloi2.getClass();
        gloj1.c = gloi2;
        gloj1.b |= 0x40;
        gloj gloj2 = (gloj)hftp1.N_build();
        this.f.g(gloj2);
        glte glte0 = glte.b(gloj0.d);
        return glte0 == null ? glte.a : glte0;
    }

    @Override  // bwzp
    protected final void e(Object object0) {
        Object object1;
        if(!((bwvc)object0).a()) {
            bwne.l("Indexing done %s", this.q.c());
            bwvb bwvb0 = this.t;
            if(bwvb0 != null) {
                try {
                    bwvb0.a.a();
                }
                catch(bwvj bwvj0) {
                    bwne.g("Cursor close call threw an exception: %s", bwvj0.getMessage());
                    this.f.d("cursor_close_exception");
                }
            }
        }
        bwvf bwvf0 = this.u;
        bwvf0.c |= ((bwvc)object0).c;
        if(!((bwvc)object0).a()) {
            if(((bwvc)object0).a == 2) {
                bwne.g("Aborting indexing of corpus %s", bwvf0.d);
                if(((bwvc)object0).d) {
                    bxbi bxbi0 = bxbj.a(bwvf0.e.a);
                    bwve bwve0 = new bwve(bwvf0, gltq.s, bwvf0.a, bxbi0);
                    bwvf0.e.b.h(bwve0);
                }
            }
            long v = ((bwvc)object0).b;
            if(v > 0L) {
                bwne.l("Retrying indexing in %dms", Long.valueOf(v));
                cljp cljp0 = cljp.a(bwvf0.e.a);
                Bundle bundle0 = new Bundle();
                bundle0.putLong("delaySeconds", v);
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.icing.service.IcingGcmTaskChimeraService";
                clkn0.e(v, 3600L + v);
                clkn0.t("IcingIndexRetrySchedule");
                clkn0.p = false;
                clkn0.v(1);
                clkn0.u = bundle0;
                cljp0.f(clkn0.a());
            }
            bwvg bwvg0 = bwvf0.e;
            object1 = bwvg0.f;
            synchronized(object1) {
                if(bwvf0.c) {
                    bwvg0.e.add(bwvf0.b);
                }
                bwvg0.d.remove(bwvf0.b);
            }
        }
    }
}

