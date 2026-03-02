import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import j..util.DesugarCollections;
import java.util.List;

public final class bwst {
    public static int a(Object[] arr_object) {
        return arr_object == null ? 0 : arr_object.length;
    }

    public static bwnr b(bwvl bwvl0, bwuc bwuc0, bwuj bwuj0) {
        bwnr bwnr0 = bwuj0.b.e(bwvl0);
        if(bwnr0 != null) {
            bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
            if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
                if(bwsa.i(bwnq0.d)) {
                    String s = bwnq0.f;
                    bwua bwua0 = bwuc0.f(s);
                    if(bwua0 != null && bwua0.s()) {
                        return bwnr0;
                    }
                    bwne.l("Not indexing corpus from package %s as it has never connected", s);
                    throw new gopm(a.a(s, "Not indexing corpus from package ", " as it has never connected"));
                }
                return null;
            }
        }
        bwne.b("Corpus no longer exists %s", bwvl0.c());
        throw new gopm("Failed to get corpus data.");
    }

    public static gged_interceptors c(String s, bwuc bwuc0, bwuj bwuj0) {
        bwua bwua0 = bwuc0.f(s);
        if(bwua0 == null) {
            bwne.b("Package %s not found in client registry", s);
            return ggna.a;
        }
        return bwuj0.b.m(bwua0);
    }

    public static void d(bwmx bwmx0, String s) {
        if(hubx.b() != -1L) {
            NativeIndex nativeIndex0 = bwmx0.m;
            bwqf bwqf0 = bwmx0.h;
            if(nativeIndex0 == null || bwqf0 == null) {
                bwne.v("Internal error. NativeIndex:%s StorageMonitor:%s", String.valueOf(nativeIndex0), String.valueOf(bwqf0));
                throw new gopm("Internal error.");
            }
            int v = bwqf0.h(nativeIndex0.a());
            if(((long)(v - 2)) > hubx.b()) {
                bwne.v("Device in low storage mode (%s); not accept %s request.", bwqf.i(v), s);
                bwmx0.r.p(14006);
                throw new gopm("Indexable rejected in device low storage condition.");
            }
        }
    }

    public static void e(String s, String s1, hlne hlne0, boolean z, bwmx bwmx0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        bwuj bwuj1;
        bxgk bxgk1;
        bwvl bwvl0 = new bwvl(s, s1);
        bwnr bwnr0 = bwst.b(bwvl0, bwuc0, bwuj0);
        if(bwnr0 != null) {
            long v = bwst.j(bwnr0, nativeIndex0);
            bxgk bxgk0 = new bxgk();
            if(z) {
                if(bwvu.c()) {
                    gloj gloj0 = nativeIndex0.o(v, hlne0.toBytesArray(), bwvm.a(bwnr0), (bwnr0.c == null ? bwnq.a : bwnr0.c), bwux.a());
                    glte glte0 = gloj0 == null ? glte.f : bwst.l(bwnr0, gloj0, bwmx0);
                    bxgk0.b("modify " + NativeIndex.t(glte0));
                    if(bwst.n(glte0)) {
                        bxgk1 = bxgk0;
                        bwuj1 = bwuj0;
                        bwst.m(bwvl0, bxgk1, bwnr0, bwuj1);
                        return;
                    }
                    bwne.g("Failed to patch thing with error code :%s", NativeIndex.t(glte0));
                    throw new bwta("Failed to patch Thing with type: " + hlne0.c + " and url: " + hlne0.d, bwst.k(glte0));
                }
                bxgk0.b("patch disabled");
                throw new bwta("Patch is disabled.", glrs.Y);
            }
            bxgk1 = bxgk0;
            bwst.f(s, hlne0.d, (bwnr0.c == null ? bwnq.a : bwnr0.c).d, bwmx0, nativeIndex0, bwuc0, bwuj0, true);
            bwuj1 = bwuj0;
            gloj gloj1 = nativeIndex0.n(v, hlne0.toBytesArray(), bwvm.a(bwnr0), (bwnr0.c == null ? bwnq.a : bwnr0.c), bwux.a());
            glte glte1 = gloj1 == null ? glte.f : bwst.l(bwnr0, gloj1, bwmx0);
            bxgk1.b("index " + NativeIndex.t(glte1));
            bxgk1.b("index-thing " + NativeIndex.t(glte1));
            if(bwst.n(glte1)) {
                bwst.m(bwvl0, bxgk1, bwnr0, bwuj1);
                return;
            }
            bwne.g("Failed to update thing with error code :%s", NativeIndex.t(glte1));
            throw new bwta("Failed to update Thing with type: " + hlne0.c + " and url: " + hlne0.d, bwst.k(glte1));
        }
        bwne.b("Corpus no longer exists %s", bwvl0.c());
        throw new gopm("Failed to get corpus data.");
    }

    public static void f(String s, String s1, String s2, bwmx bwmx0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0, boolean z) {
        String s3 = s2;
        glte glte0 = glte.a;
        gged_interceptors gged0 = bwst.c(s, bwuc0, bwuj0);
        int v = ((ggna)gged0).c;
        int v1 = 0;
        glte glte1 = glte0;
        while(v1 < v) {
            bwvl bwvl0 = (bwvl)gged0.get(v1);
            bwnr bwnr0 = bwst.b(bwvl0, bwuc0, bwuj0);
            if(bwnr0 != null && !(bwnr0.c == null ? bwnq.a : bwnr0.c).d.equals(s3)) {
                long v2 = bwst.j(bwnr0, nativeIndex0);
                bxgk bxgk0 = new bxgk();
                glte glte2 = nativeIndex0.q(v2, (bwnr0.c == null ? bwnq.a : bwnr0.c).c, s1);
                glte glte3 = glte.g;
                if(!glte3.equals(glte2)) {
                    bxgk0.b("delete " + NativeIndex.t(glte2));
                    if(glte0.equals(glte2)) {
                        bwmx0.q.d(s, (bwnr0.c == null ? bwnq.a : bwnr0.c).d, s1);
                        bwst.m(bwvl0, bxgk0, bwnr0, bwuj0);
                        return;
                    }
                    bwst.m(bwvl0, bxgk0, bwnr0, bwuj0);
                }
                else if(s2 == null) {
                    bxgk0.b("delete " + NativeIndex.t(glte3));
                }
                glte1 = glte2;
            }
            ++v1;
            s3 = s2;
        }
        if(!bwst.n(glte1) && !z) {
            bwne.g("Failed to remove thing with error code :%s", NativeIndex.t(glte1));
            if(glte1 != glte.g) {
                throw new bwta("Failed to remove Thing with url: " + s1, bwst.k(glte1));
            }
            String s4 = hubu.a.b().b();
            if("*".equals(s4) || bbmt.e(s4.split(","), s)) {
                throw new bwta("Failed to remove Thing with url: " + s1, bwst.k(glte1));
            }
        }
    }

    public static void g(bwud bwud0, bwsa bwsa0, bwmx bwmx0) {
        RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = bwtd.a(bwsa0);
        String s = bwnb.m(registerCorpusInfoCall$Request0.c);
        Status status0 = Status.b;
        if(s == null) {
            bwuw bwuw0 = new bwuw(registerCorpusInfoCall$Request0.c, 1, System.currentTimeMillis());
            try {
                bwne.a("IndexManager starting to doRegisterCorpusInfo");
                bwmx0.H(bwud0, bwuw0);
            }
            catch(bwvo | bwvr | SecurityException exception0) {
                status0 = new Status(8, exception0.getMessage(), null);
            }
        }
        else {
            status0 = new Status(8, s, null);
        }
        if(status0.e()) {
            return;
        }
        bwne.i("Failed to register corpus \'%s\':\'%s\'.", bwsa0.c(), status0);
        throw new gopm("Failed to register corpus " + bwsa0.c());
    }

    public static boolean h(bwnq bwnq0, bwsa bwsa0) {
        return bwnq0 == null || bwnq0.e.isEmpty() ? true : !hubu.g() && Integer.parseInt(bwnq0.e) != bwsa0.a.e;
    }

    public static void i(Context context0, bwts bwts0, int v) {
        glnn glnn0 = bxgo.a(context0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glnn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glnn0));
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(((glnn)hftv0).h) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnn glnn1 = (glnn)hftp0.b_message;
            glnn1.c = glre.a(v);
            glnn1.b |= 1;
            bwts0.v(((glnn)hftp0.N_build()));
        }
    }

    private static long j(bwnr bwnr0, NativeIndex nativeIndex0) {
        return nativeIndex0.f((bwnr0.c == null ? bwnq.a : bwnr0.c).c, false);
    }

    private static glrs k(glte glte0) {
        switch(glte0.ordinal()) {
            case 5: {
                return glrs.P;
            }
            case 6: {
                return glrs.Q;
            }
            case 7: {
                return glrs.R;
            }
            case 8: {
                return glrs.S;
            }
            case 9: {
                return glrs.T;
            }
            case 10: {
                return glrs.U;
            }
            case 11: {
                return glrs.V;
            }
            case 12: {
                return glrs.aa;
            }
            case 13: {
                return glrs.ab;
            }
            case 14: {
                return glrs.ac;
            }
            case 15: {
                return glrs.ad;
            }
            case 16: {
                return glrs.W;
            }
            case 17: {
                return glrs.X;
            }
            default: {
                return glrs.Z;
            }
        }
    }

    private static glte l(bwnr bwnr0, gloj gloj0, bwmx bwmx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gloi.a).v_newBuilder();
        String s = (bwnr0.c == null ? bwnq.a : bwnr0.c).f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gloi gloi0 = (gloi)hftp0.b_message;
        s.getClass();
        gloi0.b |= 1;
        gloi0.c = s;
        String s1 = bxge.a((bwnr0.c == null ? bwnq.a : bwnr0.c));
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
        bwmx0.r.g(gloj2);
        glte glte0 = glte.b(gloj0.d);
        return glte0 == null ? glte.a : glte0;
    }

    private static void m(bwvl bwvl0, bxgk bxgk0, bwnr bwnr0, bwuj bwuj0) {
        bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bwny0));
        List list0 = bxgk0.a(DesugarCollections.unmodifiableList(((bwny)((bwnt)hftp0).b_message).c));
        if(!((bwnt)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
        }
        ((bwny)((bwnt)hftp0).b_message).c = hfvv.a;
        ((bwnt)hftp0).a(list0);
        bwuj0.a().z(bwvl0, ((bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build()));
    }

    private static boolean n(glte glte0) {
        return glte0 == glte.a || glte0 == glte.b || glte0 == glte.c || glte0 == glte.d || glte0 == glte.e;
    }
}

