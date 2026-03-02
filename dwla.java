import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class dwla extends dvze {
    public domj an;
    public dvfu ao;
    public fhwb ap;
    public dmkl aq;

    @Override  // dvze
    public final void L() {
        this.Z();
    }

    public final domj T() {
        domj domj0 = this.an;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }

    public final fhwb U() {
        fhwb fhwb0 = this.ap;
        if(fhwb0 != null) {
            return fhwb0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final gjce V(gvcd gvcd0, gvcd gvcd1, int v) {
        boolean z2;
        boolean z1;
        gkao gkao1;
        boolean z = false;
        ibuq.f(gvcd0, "updatedInputForm");
        ibuq.f(gvcd1, "originalInputForm");
        hfuo hfuo0 = gvcd0.h;
        ibuq.e(hfuo0, "getInputFieldList(...)");
        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
            for(Object object0: hfuo0) {
                int v1 = ((gvcc)object0).i;
                if((gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.b || (gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.c) {
                    z = true;
                    break;
                }
            }
        }
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkai.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        int v2 = gvcd0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkai gkai0 = (gkai)hftp0.b_message;
        gkai0.b |= 1;
        gkai0.d = v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkai gkai1 = (gkai)hftp0.b_message;
        gkai1.b |= 2;
        gkai1.e = v;
        if(!z) {
            ginl.b(hftp0);
            giog giog0 = giof.a(((ProtoLiteMessage)gkas.a).v_newBuilder());
            giog0.b(gkaq.b);
            giok giok0 = gioj.a(((ProtoLiteMessage)gkar.a).v_newBuilder());
            String s = gvcd1.e;
            ibuq.e(s, "getCardTitle(...)");
            giok0.b(s.length() == 0);
            giog0.g(giok0.a());
            gioi gioi0 = gioh.a(((ProtoLiteMessage)gkao.a).v_newBuilder());
            String s1 = gvcd0.e;
            ibuq.e(s1, "getCardTitle(...)");
            gioi0.b(s1.length() == 0);
            gioi0.c(((boolean)(ibuq.m(gvcd0.e, gvcd1.e) ^ 1)));
            giog0.f(gioi0.a());
            ginl.a(giog0.a(), hftp0);
            ginl.b(hftp0);
            giog giog1 = giof.a(((ProtoLiteMessage)gkas.a).v_newBuilder());
            giog1.b(gkaq.c);
            giok giok1 = gioj.a(((ProtoLiteMessage)gkar.a).v_newBuilder());
            String s2 = gvcd1.f;
            ibuq.e(s2, "getCardDescription(...)");
            giok1.b(s2.length() == 0);
            giog1.g(giok1.a());
            gioi gioi1 = gioh.a(((ProtoLiteMessage)gkao.a).v_newBuilder());
            String s3 = gvcd0.f;
            ibuq.e(s3, "getCardDescription(...)");
            gioi1.b(s3.length() == 0);
            gioi1.c(((boolean)(ibuq.m(gvcd0.f, gvcd1.f) ^ 1)));
            giog1.f(gioi1.a());
            ginl.a(giog1.a(), hftp0);
        }
        ginl.b(hftp0);
        hfuo hfuo1 = gvcd0.h;
        ibuq.e(hfuo1, "getInputFieldList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo1) {
            if(((gvcc)object1).e != 0x20) {
                arrayList0.add(object1);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList0, 10)), 16));
        for(Object object2: arrayList0) {
            linkedHashMap0.put(Integer.valueOf(((gvcc)object2).e), object2);
        }
        ArrayList arrayList1 = new ArrayList();
        hfuo hfuo2 = gvcd1.h;
        ibuq.e(hfuo2, "getInputFieldList(...)");
        ArrayList arrayList2 = new ArrayList();
        for(Object object3: hfuo2) {
            if(((gvcc)object3).e != 0x20) {
                arrayList2.add(object3);
            }
        }
        ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
        for(Object object4: arrayList2) {
            gvcc gvcc0 = (gvcc)linkedHashMap0.get(Integer.valueOf(((gvcc)object4).e));
            giog giog2 = giof.a(((ProtoLiteMessage)gkas.a).v_newBuilder());
            giog2.b(gkaq.d);
            giog2.e(((gvcc)object4).e);
            giok giok2 = gioj.a(((ProtoLiteMessage)gkar.a).v_newBuilder());
            gkar gkar0 = gkar.a;
            String s4 = ((gvcc)object4).f;
            ibuq.e(s4, "getLabel(...)");
            giok2.b(s4.length() == 0);
            giog2.d(giok2.a());
            gkao gkao0 = gkao.a;
            gioi gioi2 = gioh.a(((ProtoLiteMessage)gkao0).v_newBuilder());
            if(gvcc0 == null) {
                gkao1 = gkao0;
            }
            else {
                gkao1 = gkao0;
                String s5 = gvcc0.f;
                ibuq.e(s5, "getLabel(...)");
                if(s5.length() != 0) {
                    z1 = false;
                    goto label_109;
                }
            }
            z1 = true;
        label_109:
            gioi2.b(z1);
            gioi2.c(gvcc0 != null && !ibuq.m(gvcc0.f, ((gvcc)object4).f));
            giog2.c(gioi2.a());
            giok giok3 = gioj.a(((ProtoLiteMessage)gkar0).v_newBuilder());
            String s6 = ((gvcc)object4).g;
            ibuq.e(s6, "getValue(...)");
            giok3.b(s6.length() == 0);
            giog2.g(giok3.a());
            gioi gioi3 = gioh.a(((ProtoLiteMessage)gkao1).v_newBuilder());
            if(gvcc0 != null) {
                String s7 = gvcc0.g;
                ibuq.e(s7, "getValue(...)");
                if(s7.length() != 0) {
                    z2 = false;
                    goto label_125;
                }
            }
            z2 = true;
        label_125:
            gioi3.b(z2);
            gioi3.c(gvcc0 != null && !ibuq.m(gvcc0.g, ((gvcc)object4).g));
            giog2.f(gioi3.a());
            arrayList3.add(giog2.a());
        }
        arrayList1.addAll(arrayList3);
        hfuo hfuo3 = gvcd0.h;
        ibuq.e(hfuo3, "getInputFieldList(...)");
        ArrayList arrayList4 = new ArrayList();
        for(Object object5: hfuo3) {
            if(((gvcc)object5).e == 0x20) {
                arrayList4.add(object5);
            }
        }
        ArrayList arrayList5 = new ArrayList(ibpo.q(arrayList4, 10));
        for(Object object6: arrayList4) {
            giog giog3 = giof.a(((ProtoLiteMessage)gkas.a).v_newBuilder());
            giog3.b(gkaq.d);
            giog3.e(((gvcc)object6).e);
            giok giok4 = gioj.a(((ProtoLiteMessage)gkar.a).v_newBuilder());
            giok4.b(true);
            giog3.d(giok4.a());
            gioi gioi4 = gioh.a(((ProtoLiteMessage)gkao.a).v_newBuilder());
            String s8 = ((gvcc)object6).f;
            ibuq.e(s8, "getLabel(...)");
            gioi4.b(s8.length() == 0);
            String s9 = ((gvcc)object6).f;
            ibuq.e(s9, "getLabel(...)");
            gioi4.c(s9.length() > 0);
            giog3.c(gioi4.a());
            giok giok5 = gioj.a(((ProtoLiteMessage)gkar.a).v_newBuilder());
            giok5.b(true);
            giog3.g(giok5.a());
            gioi gioi5 = gioh.a(((ProtoLiteMessage)gkao.a).v_newBuilder());
            String s10 = ((gvcc)object6).g;
            ibuq.e(s10, "getValue(...)");
            gioi5.b(s10.length() == 0);
            String s11 = ((gvcc)object6).g;
            ibuq.e(s11, "getValue(...)");
            gioi5.c(s11.length() > 0);
            giog3.f(gioi5.a());
            arrayList5.add(giog3.a());
        }
        arrayList1.addAll(arrayList5);
        List list0 = ibpo.ar(arrayList1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkai gkai2 = (gkai)hftp0.b_message;
        gkai2.b();
        hfrj.E(list0, gkai2.c);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkai)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp1.b_message;
        ((gkai)hftv0).getClass();
        gkbe0.g = (gkai)hftv0;
        gkbe0.b |= 16;
        gjca0.f(gjzs0.a());
        String s12 = this.T().a();
        gjca0.b(ghfs.a.c(s12, StandardCharsets.UTF_8).c());
        return gjca0.a();
    }

    public final void W(Valuable valuable0, int v, List list0) {
        ibuq.f(valuable0, "valuable");
        ibuq.f(list0, "detectedLanguages");
        Object object0 = valuable0.k().i() ? valuable0.k().d() : ((int)0);
        int v1 = ((Number)object0).intValue();
        fhwb fhwb0 = this.U();
        fhvz fhvz0 = fhwa.a(0x33D1F);
        fhvz0.c(fhwp.b(this.y().name));
        String s = valuable0.b;
        ibuq.e(s, "id");
        ibuq.f(s, "createdValuableId");
        ibuq.f(list0, "detectedLanguages");
        gjce gjce0 = gjce.a;
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce0).v_newBuilder()));
        gkbe gkbe0 = gkbe.a;
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe0).v_newBuilder());
        if(hwfk.w()) {
            gjzn gjzn0 = gjzm.a(((ProtoLiteMessage)gkbd.a).v_newBuilder());
            gjzn0.b(v1);
            gjzn0.c(v);
            gjzs0.e(gjzn0.a());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkan.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gkan)hftv0).b |= 1;
        ((gkan)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkan)hftv1).b |= 2;
        ((gkan)hftv1).e = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkan gkan0 = (gkan)hftp0.b_message;
        gkan0.b |= 4;
        gkan0.f = v;
        if(!list0.isEmpty()) {
            List list1 = DesugarCollections.unmodifiableList(((gkan)hftp0.b_message).c);
            ibuq.e(list1, "getResourceLanguagesList(...)");
            new hfxu(list1);
            ibuq.f(list0, "values");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkan gkan1 = (gkan)hftp0.b_message;
            hfuo hfuo0 = gkan1.c;
            if(!hfuo0.c()) {
                gkan1.c = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, gkan1.c);
        }
        dvfu dvfu0 = null;
        if(hwfk.a.b().J()) {
            dmkl dmkl0 = this.aq;
            if(dmkl0 == null) {
                ibuq.j("deviceUtil");
                dmkl0 = null;
            }
            String s1 = dmkl0.c();
            ibuq.e(s1, "getGServicesDeviceCountry(...)");
            ibuq.f(s1, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkan gkan2 = (gkan)hftp0.b_message;
            s1.getClass();
            gkan2.b |= 8;
            gkan2.g = s1;
        }
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((gkan)hftv2), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe1 = (gkbe)hftp1.b_message;
        ((gkan)hftv2).getClass();
        gkbe1.h = (gkan)hftv2;
        gkbe1.b |= 0x20;
        gjca0.f(gjzs0.a());
        ghfz ghfz0 = ghfs.a;
        gjca0.b(ghfz0.c(this.T().a(), StandardCharsets.UTF_8).c());
        fhvz0.b(douc.a(gjca0.a()));
        fhwb0.a(fhvz0.a());
        fhwb fhwb1 = this.U();
        fhvz fhvz1 = fhwa.a(0x34CF6);
        fhvz1.c(fhwp.b(this.y().name));
        gjca gjca1 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce0).v_newBuilder()));
        gjzs gjzs1 = gjzr.a(((ProtoLiteMessage)gkbe0).v_newBuilder());
        gjzn gjzn1 = gjzm.a(((ProtoLiteMessage)gkbd.a).v_newBuilder());
        gjzn1.b(v1);
        String s2 = (String)valuable0.l().f("");
        ProtoLiteBuilder hftp2 = gjzn1.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkbd gkbd0 = (gkbd)hftp2.b_message;
        gkbd0.b |= 2;
        gkbd0.d = s2;
        String s3 = (String)valuable0.j().f("");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkbd gkbd1 = (gkbd)hftp2.b_message;
        gkbd1.b |= 4;
        gkbd1.e = s3;
        gjzn1.c(v);
        gjzs1.e(gjzn1.a());
        gjca1.f(gjzs1.a());
        gjca1.b(ghfz0.c(this.T().a(), StandardCharsets.UTF_8).c());
        fhvz1.b(douc.a(gjca1.a()));
        fhwb1.a(fhvz1.a());
        dvfu dvfu1 = this.ao;
        if(dvfu1 == null) {
            ibuq.j("analyticsUtil");
        }
        else {
            dvfu0 = dvfu1;
        }
        dvfu0.d(3, 17, valuable0.R);
    }

    public final void X(gkal gkal0) {
        ibuq.f(gkal0, "encounteredSaveFailure");
        fhwb fhwb0 = this.U();
        fhvz fhvz0 = fhwa.a(0x3826C);
        fhvz0.c(fhwp.b(this.y().name));
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkam.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gkal0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkam)hftp0.b_message).c = gkal0.g;
        ((gkam)hftp0.b_message).b |= 2;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkam)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp1.b_message;
        ((gkam)hftv0).getClass();
        gkbe0.o = (gkam)hftv0;
        gkbe0.b |= 0x1000;
        gjca0.f(gjzs0.a());
        String s = this.T().a();
        gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        fhvz0.b(douc.a(gjca0.a()));
        fhwb0.a(fhvz0.a());
    }

    public void Z() {
    }
}

