import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class etnu {
    private final Map a;
    private final Map b;

    public etnu(hkpi hkpi0) {
        ibuq.f(hkpi0, "registry");
        hkoy hkoy1;
        hjnd hjnd1;
        super();
        hfuo hfuo0 = hkpi0.b;
        ibuq.e(hfuo0, "getNotificationsList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hfuo0) {
            if(((hkpj)object0).b == 1) {
                arrayList0.add(object0);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList0, 10)), 16));
        for(Object object1: arrayList0) {
            hkpj hkpj0 = (hkpj)object1;
            if(hkpj0.b == 1) {
                hjnd hjnd0 = hjnd.b(((Integer)hkpj0.c).intValue());
                hjnd1 = hjnd0 == null ? hjnd.aC : hjnd0;
            }
            else {
                hjnd1 = hjnd.a;
            }
            hkph hkph0 = hkpj0.d == null ? hkph.a : hkpj0.d;
            ibuq.e(hkph0, "getNotificationConfig(...)");
            ibns ibns0 = new ibns(hjnd1, etnu.b(hkph0));
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        this.a = linkedHashMap0;
        hfuo hfuo1 = hkpi0.b;
        ibuq.e(hfuo1, "getNotificationsList(...)");
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: hfuo1) {
            if(((hkpj)object2).b == 2) {
                arrayList1.add(object2);
            }
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList1, 10)), 16));
        for(Object object3: arrayList1) {
            hkpj hkpj1 = (hkpj)object3;
            if(hkpj1.b == 2) {
                hkoy hkoy0 = hkoy.b(((Integer)hkpj1.c).intValue());
                hkoy1 = hkoy0 == null ? hkoy.br : hkoy0;
            }
            else {
                hkoy1 = hkoy.a;
            }
            hkph hkph1 = hkpj1.d == null ? hkph.a : hkpj1.d;
            ibuq.e(hkph1, "getNotificationConfig(...)");
            ibns ibns1 = new ibns(hkoy1, etnu.b(hkph1));
            linkedHashMap1.put(ibns1.a, ibns1.b);
        }
        this.b = linkedHashMap1;
    }

    public final ftbz a(fsxi fsxi0) {
        ibuq.f(fsxi0, "request");
        int v = fsxi0.c;
        if(v == 3) {
            return fsxi0.h == null ? ftbz.a : fsxi0.h;
        }
        if(v == 2) {
            Map map0 = this.a;
            hjnd hjnd0 = hjnd.b(((Integer)fsxi0.d).intValue());
            if(hjnd0 == null) {
                hjnd0 = hjnd.aC;
            }
            return (ftbz)map0.get(hjnd0);
        }
        Map map1 = this.b;
        if(v == 1) {
            hkoy hkoy0 = hkoy.b(((Integer)fsxi0.d).intValue());
            return hkoy0 == null ? ((ftbz)map1.get(hkoy.br)) : ((ftbz)map1.get(hkoy0));
        }
        return (ftbz)map1.get(hkoy.a);
    }

    private static final ftbz b(hkph hkph0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftbz.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        boolean z = hkph0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftbz ftbz0 = (ftbz)hftp0.b_message;
        ftbz0.b |= 1;
        ftbz0.c = z;
        List list0 = DesugarCollections.unmodifiableList(ftbz0.d);
        ibuq.e(list0, "getQuotaGroupNamesList(...)");
        new hfxu(list0);
        hfuo hfuo0 = hkph0.d;
        ibuq.e(hfuo0, "getQuotaGroupNamesList(...)");
        ibuq.f(hfuo0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftbz ftbz1 = (ftbz)hftp0.b_message;
        hfuo hfuo1 = ftbz1.d;
        if(!hfuo1.c()) {
            ftbz1.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(hfuo0, ftbz1.d);
        hkpg hkpg0 = hkpg.b(hkph0.e) == null ? hkpg.e : hkpg.b(hkph0.e);
        ibuq.e(hkpg0, "getSupervisionType(...)");
        ibuq.f(hkpg0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftbz ftbz2 = (ftbz)hftp0.b_message;
        ftbz2.e = hkpg0.a();
        ftbz2.b |= 2;
        if((hkph0.b & 8) != 0) {
            hkpf hkpf0 = hkph0.f == null ? hkpf.a : hkph0.f;
            ibuq.e(hkpf0, "getCountryConfig(...)");
            ibuq.f(hkpf0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftbz ftbz3 = (ftbz)hftp0.b_message;
            hkpf0.getClass();
            ftbz3.f = hkpf0;
            ftbz3.b |= 4;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftbz)hftv0;
    }
}

