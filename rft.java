import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

public final class rft {
    public static final rfz a(idph idph0) {
        rfy rfy0 = rfz.a;
        if(!(idph0 instanceof idpx)) {
            throw new IllegalStateException("Must be an ASN1Integer, was " + new ibuk(rfy0.getClass()).c());
        }
        String s = ((idpx)idph0).m().toString();
        ibuq.e(s, "toString(...)");
        return rfy.a(s);
    }

    public static final ByteString b(idph idph0) {
        return ByteString.copyFrom(rft.h(idph0));
    }

    public static final String c(idph idph0) {
        CharsetDecoder charsetDecoder0 = ibyo.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(rft.h(idph0));
        ibuq.e(byteBuffer0, "wrap(...)");
        String s = charsetDecoder0.decode(byteBuffer0).toString();
        ibuq.e(s, "toString(...)");
        return s;
    }

    public static final BigInteger d(idph idph0) {
        if((idph0 instanceof idpx)) {
            return ((idpx)idph0).m();
        }
        throw new IllegalStateException("Must be an ASN1Integer, was " + new ibuk(idph0.getClass()).c());
    }

    public static final idpk e(idph idph0) {
        if((idph0 instanceof idpk)) {
            return (idpk)idph0;
        }
        throw new IllegalStateException("Must be an ASN1Enumerated, was " + new ibuk(idph0.getClass()).c());
    }

    static rfr f(idph idph0) {
        rfp rfp0;
        rgb rgb0;
        ByteString hfsf1;
        BigInteger bigInteger16;
        BigInteger bigInteger15;
        BigInteger bigInteger14;
        BigInteger bigInteger13;
        Set set7;
        rfw rfw0;
        Set set6;
        BigInteger bigInteger10;
        Set set5;
        Set set3;
        Set set1;
        rfv rfv0;
        if(!(idph0 instanceof idqt)) {
            throw new IllegalStateException("Object must be an ASN1Sequence, was " + new ibuk(idph0.getClass()).c());
        }
        ibuq.f(((idqt)idph0), "seq");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(((idqt)idph0), 10)), 16));
        for(Object object0: ((idqt)idph0)) {
            idph idph1 = (idph)object0;
            if(!(idph1 instanceof idrc)) {
                throw new IllegalArgumentException("Must be an ASN1TaggedObject, was " + new ibuk(idph1.getClass()).c());
            }
            int v = ((idrc)idph1).c;
            rfv[] arr_rfv = rfv.values();
            int v1 = 0;
            while(true) {
                rfv0 = null;
                if(v1 < arr_rfv.length) {
                    rfv rfv1 = arr_rfv[v1];
                    if(rfv1.J == v) {
                        rfv0 = rfv1;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                break;
            }
            if(rfv0 == null) {
                throw new IllegalArgumentException("unknown tag number: " + v);
            }
            ibns ibns0 = new ibns(rfv0, ((idrc)idph1).f());
            linkedHashMap0.put(ibns0.a, ibns0.b);
            continue;
        }
        idqb idqb0 = (idqb)linkedHashMap0.get(rfv.a);
        if(idqb0 == null) {
            set1 = null;
        }
        else {
            if(!(idqb0 instanceof idqy)) {
                throw new IllegalStateException("Object must be an ASN1Set, was " + new ibuk(idqb0.getClass()).c());
            }
            ArrayList arrayList0 = new ArrayList(ibpo.q(((Iterable)idqb0), 10));
            for(Object object1: ((Iterable)idqb0)) {
                if(!(((idph)object1) instanceof idpx)) {
                    throw new IllegalStateException("Object must be a " + new ibuk(idpx.class).c() + ", was " + new ibuk(idqb0.getClass()).c());
                }
                arrayList0.add(((idph)object1));
                continue;
            }
            Set set0 = ibpo.ay(arrayList0);
            if(set0 == null) {
                set1 = null;
            }
            else {
                ArrayList arrayList1 = new ArrayList(ibpo.q(set0, 10));
                for(Object object2: set0) {
                    arrayList1.add(((idpx)object2).m());
                }
                set1 = ibpo.ay(arrayList1);
            }
        }
        idqb idqb1 = (idqb)linkedHashMap0.get(rfv.b);
        BigInteger bigInteger0 = idqb1 == null ? null : rft.d(idqb1);
        idqb idqb2 = (idqb)linkedHashMap0.get(rfv.c);
        BigInteger bigInteger1 = idqb2 == null ? null : rft.d(idqb2);
        idqb idqb3 = (idqb)linkedHashMap0.get(rfv.d);
        if(idqb3 == null) {
            set3 = null;
        }
        else {
            if(!(idqb3 instanceof idqy)) {
                throw new IllegalStateException("Object must be an ASN1Set, was " + new ibuk(idqb3.getClass()).c());
            }
            ArrayList arrayList2 = new ArrayList(ibpo.q(((Iterable)idqb3), 10));
            for(Object object3: ((Iterable)idqb3)) {
                if(!(((idph)object3) instanceof idpx)) {
                    throw new IllegalStateException("Object must be a " + new ibuk(idpx.class).c() + ", was " + new ibuk(idqb3.getClass()).c());
                }
                arrayList2.add(((idph)object3));
                continue;
            }
            Set set2 = ibpo.ay(arrayList2);
            if(set2 == null) {
                set3 = null;
            }
            else {
                ArrayList arrayList3 = new ArrayList(ibpo.q(set2, 10));
                for(Object object4: set2) {
                    arrayList3.add(((idpx)object4).m());
                }
                set3 = ibpo.ay(arrayList3);
            }
        }
        idqb idqb4 = (idqb)linkedHashMap0.get(rfv.e);
        if(idqb4 == null) {
            set5 = null;
        }
        else {
            if(!(idqb4 instanceof idqy)) {
                throw new IllegalStateException("Object must be an ASN1Set, was " + new ibuk(idqb4.getClass()).c());
            }
            ArrayList arrayList4 = new ArrayList(ibpo.q(((Iterable)idqb4), 10));
            for(Object object5: ((Iterable)idqb4)) {
                if(!(((idph)object5) instanceof idpx)) {
                    throw new IllegalStateException("Object must be a " + new ibuk(idpx.class).c() + ", was " + new ibuk(idqb4.getClass()).c());
                }
                arrayList4.add(((idph)object5));
                continue;
            }
            Set set4 = ibpo.ay(arrayList4);
            if(set4 == null) {
                set5 = null;
            }
            else {
                ArrayList arrayList5 = new ArrayList(ibpo.q(set4, 10));
                for(Object object6: set4) {
                    arrayList5.add(((idpx)object6).m());
                }
                set5 = ibpo.ay(arrayList5);
            }
        }
        idqb idqb5 = (idqb)linkedHashMap0.get(rfv.f);
        BigInteger bigInteger2 = idqb5 == null ? null : rft.d(idqb5);
        idqb idqb6 = (idqb)linkedHashMap0.get(rfv.g);
        BigInteger bigInteger3 = idqb6 == null ? null : rft.d(idqb6);
        idqb idqb7 = (idqb)linkedHashMap0.get(rfv.h);
        BigInteger bigInteger4 = idqb7 == null ? null : rft.d(idqb7);
        idqb idqb8 = (idqb)linkedHashMap0.get(rfv.i);
        BigInteger bigInteger5 = idqb8 == null ? null : rft.d(idqb8);
        idqb idqb9 = (idqb)linkedHashMap0.get(rfv.j);
        BigInteger bigInteger6 = idqb9 == null ? null : rft.d(idqb9);
        Boolean boolean0 = linkedHashMap0.containsKey(rfv.k) ? Boolean.valueOf(true) : null;
        idqb idqb10 = (idqb)linkedHashMap0.get(rfv.l);
        BigInteger bigInteger7 = idqb10 == null ? null : rft.d(idqb10);
        idqb idqb11 = (idqb)linkedHashMap0.get(rfv.m);
        BigInteger bigInteger8 = idqb11 == null ? null : rft.d(idqb11);
        Boolean boolean1 = linkedHashMap0.containsKey(rfv.o) ? Boolean.valueOf(true) : null;
        Boolean boolean2 = linkedHashMap0.containsKey(rfv.p) ? Boolean.valueOf(true) : null;
        idqb idqb12 = (idqb)linkedHashMap0.get(rfv.q);
        BigInteger bigInteger9 = idqb12 == null ? null : rft.d(idqb12);
        idqb idqb13 = (idqb)linkedHashMap0.get(rfv.r);
        if(idqb13 == null) {
            bigInteger10 = bigInteger6;
            set6 = set5;
            set7 = set3;
            rfw0 = null;
        }
        else {
            bigInteger10 = bigInteger6;
            rfw[] arr_rfw = rfw.values();
            set6 = set5;
            int v2 = arr_rfw.length;
            int v3 = 0;
            while(true) {
                if(v3 >= v2) {
                    set7 = set3;
                    rfw0 = null;
                    break;
                }
                rfw0 = arr_rfw[v3];
                set7 = set3;
                BigInteger bigInteger11 = BigInteger.valueOf(rfw0.f);
                ibuq.e(bigInteger11, "valueOf(...)");
                if(ibuq.m(bigInteger11, rft.d(idqb13))) {
                    break;
                }
                ++v3;
                set3 = set7;
                v2 = v2;
            }
            if(rfw0 == null) {
                BigInteger bigInteger12 = rft.d(idqb13);
                Objects.toString(bigInteger12);
                throw new IllegalStateException("unknown value: " + bigInteger12.toString());
            }
        }
        Boolean boolean3 = linkedHashMap0.containsKey(rfv.s) ? Boolean.valueOf(true) : null;
        idqb idqb14 = (idqb)linkedHashMap0.get(rfv.t);
        if(idqb14 == null) {
            bigInteger13 = bigInteger0;
            bigInteger14 = bigInteger1;
            bigInteger15 = bigInteger2;
            bigInteger16 = bigInteger3;
            rgb0 = null;
        }
        else {
            bigInteger13 = bigInteger0;
            if((idqb14 instanceof idqt)) {
                switch(((idqt)idqb14).b()) {
                    case 3: 
                    case 4: {
                        idph idph2 = ((idqt)idqb14).h(2);
                        ibuq.e(idph2, "getObjectAt(...)");
                        idpk idpk0 = rft.e(idph2);
                        bigInteger14 = bigInteger1;
                        bigInteger15 = bigInteger2;
                        idph idph3 = ((idqt)idqb14).h(0);
                        ibuq.e(idph3, "getObjectAt(...)");
                        ByteString hfsf0 = rft.b(idph3);
                        bigInteger16 = bigInteger3;
                        idph idph4 = ((idqt)idqb14).h(1);
                        ibuq.e(idph4, "getObjectAt(...)");
                        if(!(idph4 instanceof idpf)) {
                            throw new IllegalStateException("Must be an ASN1Boolean, was " + new ibuk(idph4.getClass()).c());
                        }
                        int v4 = 0;
                        boolean z = ((idpf)idph4).h();
                        ibuq.f(idpk0, "value");
                        int[] arr_v = rgk.c();
                        int v5 = 0;
                        while(v5 < 4) {
                            int v6 = arr_v[v5];
                            if(v6 == 0) {
                                throw null;
                            }
                            if(v6 - 1 == idpk0.b()) {
                                v4 = v6;
                                break;
                            }
                            ++v5;
                            continue;
                        }
                        if(v4 == 0) {
                            throw new IllegalArgumentException("unknown value: " + idpk0.b());
                        }
                        if(((idqt)idqb14).b() > 3) {
                            idph idph5 = ((idqt)idqb14).h(3);
                            ibuq.e(idph5, "getObjectAt(...)");
                            hfsf1 = rft.b(idph5);
                        }
                        else {
                            hfsf1 = null;
                        }
                        rgb0 = new rgb(hfsf0, z, v4, hfsf1);
                        goto label_202;
                    }
                    default: {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            throw new IllegalStateException("Object must be an ASN1Sequence, was " + new ibuk(idqb14.getClass()).c());
        }
    label_202:
        idqb idqb15 = (idqb)linkedHashMap0.get(rfv.u);
        BigInteger bigInteger17 = idqb15 == null ? null : rft.d(idqb15);
        idqb idqb16 = (idqb)linkedHashMap0.get(rfv.v);
        rfz rfz0 = idqb16 == null ? null : rft.a(idqb16);
        idqb idqb17 = (idqb)linkedHashMap0.get(rfv.w);
        if(idqb17 == null) {
            rfp0 = null;
        }
        else {
            if(!(idqb17 instanceof idqi)) {
                throw new IllegalArgumentException("Object must be an ASN1OctetString, was " + new ibuk(idqb17.getClass()).c());
            }
            idqt idqt0 = idqt.m(((idqi)idqb17).b);
            ibuq.e(idqt0, "getInstance(...)");
            ibuq.f(idqt0, "seq");
            if(idqt0.b() != 2) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            idph idph6 = idqt0.h(0);
            ibuq.e(idph6, "getObjectAt(...)");
            if(!(idph6 instanceof idqy)) {
                throw new IllegalStateException("Object must be an ASN1Set, was " + new ibuk(idph6.getClass()).c());
            }
            ArrayList arrayList6 = new ArrayList(ibpo.q(((Iterable)idph6), 10));
            for(Object object7: ((Iterable)idph6)) {
                if(!(((idph)object7) instanceof idqt)) {
                    throw new IllegalStateException("Object must be a " + new ibuk(idqt.class).c() + ", was " + new ibuk(idph6.getClass()).c());
                }
                arrayList6.add(((idph)object7));
                continue;
            }
            Set set8 = ibpo.ay(arrayList6);
            idph idph7 = idqt0.h(1);
            ibuq.e(idph7, "getObjectAt(...)");
            if(!(idph7 instanceof idqy)) {
                throw new IllegalStateException("Object must be an ASN1Set, was " + new ibuk(idph7.getClass()).c());
            }
            ArrayList arrayList7 = new ArrayList(ibpo.q(((Iterable)idph7), 10));
            for(Object object8: ((Iterable)idph7)) {
                if(!(((idph)object8) instanceof idqi)) {
                    throw new IllegalStateException("Object must be a " + new ibuk(idqi.class).c() + ", was " + new ibuk(idph7.getClass()).c());
                }
                arrayList7.add(((idph)object8));
                continue;
            }
            Set set9 = ibpo.ay(arrayList7);
            ArrayList arrayList8 = new ArrayList(ibpo.q(set8, 10));
            for(Object object9: set8) {
                idqt idqt1 = (idqt)object9;
                ibuq.f(idqt1, "attestationPackageInfo");
                if(idqt1.b() != 2) {
                    throw new IllegalArgumentException(a.R(idqt1, "AttestationPackageInfo sequence must have 2 elements, had "));
                }
                idph idph8 = idqt1.h(0);
                ibuq.e(idph8, "getObjectAt(...)");
                String s = rft.c(idph8);
                idph idph9 = idqt1.h(1);
                ibuq.e(idph9, "getObjectAt(...)");
                arrayList8.add(new rfq(s, rft.d(idph9)));
                continue;
            }
            Set set10 = ibpo.ay(arrayList8);
            ArrayList arrayList9 = new ArrayList(ibpo.q(set9, 10));
            for(Object object10: set9) {
                arrayList9.add(rft.b(((idqi)object10)));
            }
            rfp0 = new rfp(set10, ibpo.ay(arrayList9));
        }
        idqb idqb18 = (idqb)linkedHashMap0.get(rfv.x);
        String s1 = idqb18 == null ? null : rft.c(idqb18);
        idqb idqb19 = (idqb)linkedHashMap0.get(rfv.y);
        String s2 = idqb19 == null ? null : rft.c(idqb19);
        idqb idqb20 = (idqb)linkedHashMap0.get(rfv.z);
        String s3 = idqb20 == null ? null : rft.c(idqb20);
        idqb idqb21 = (idqb)linkedHashMap0.get(rfv.A);
        String s4 = idqb21 == null ? null : rft.c(idqb21);
        idqb idqb22 = (idqb)linkedHashMap0.get(rfv.B);
        String s5 = idqb22 == null ? null : rft.c(idqb22);
        idqb idqb23 = (idqb)linkedHashMap0.get(rfv.C);
        String s6 = idqb23 == null ? null : rft.c(idqb23);
        idqb idqb24 = (idqb)linkedHashMap0.get(rfv.D);
        String s7 = idqb24 == null ? null : rft.c(idqb24);
        idqb idqb25 = (idqb)linkedHashMap0.get(rfv.E);
        String s8 = idqb25 == null ? null : rft.c(idqb25);
        idqb idqb26 = (idqb)linkedHashMap0.get(rfv.F);
        rfz rfz1 = idqb26 == null ? null : rft.a(idqb26);
        idqb idqb27 = (idqb)linkedHashMap0.get(rfv.G);
        rfz rfz2 = idqb27 == null ? null : rft.a(idqb27);
        idqb idqb28 = (idqb)linkedHashMap0.get(rfv.H);
        String s9 = idqb28 == null ? null : rft.c(idqb28);
        idqb idqb29 = (idqb)linkedHashMap0.get(rfv.I);
        return idqb29 == null ? new rfr(set1, bigInteger14, bigInteger13, set7, set6, bigInteger15, bigInteger16, bigInteger4, bigInteger5, bigInteger10, boolean0, bigInteger7, bigInteger8, boolean1, boolean2, bigInteger9, rfw0, boolean3, rgb0, bigInteger17, rfz0, rfp0, s1, s2, s3, s4, s5, s6, s7, s8, rfz1, rfz2, s9, null) : new rfr(set1, bigInteger14, bigInteger13, set7, set6, bigInteger15, bigInteger16, bigInteger4, bigInteger5, bigInteger10, boolean0, bigInteger7, bigInteger8, boolean1, boolean2, bigInteger9, rfw0, boolean3, rgb0, bigInteger17, rfz0, rfp0, s1, s2, s3, s4, s5, s6, s7, s8, rfz1, rfz2, s9, rft.b(idqb29));
    }

    public static final int g(idph idph0) {
        int[] arr_v = rgc.c();
        int v = 0;
        int v1 = 0;
        while(v1 < 3) {
            int v2 = arr_v[v1];
            if(v2 == 0) {
                throw null;
            }
            BigInteger bigInteger0 = BigInteger.valueOf(v2 - 1);
            ibuq.e(bigInteger0, "valueOf(...)");
            if(ibuq.m(bigInteger0, rft.e(idph0).f())) {
                v = v2;
                break;
            }
            ++v1;
            continue;
        }
        if(v != 0) {
            return v;
        }
        BigInteger bigInteger1 = rft.e(idph0).f();
        Objects.toString(bigInteger1);
        throw new IllegalStateException("unknown value: " + bigInteger1.toString());
    }

    private static final byte[] h(idph idph0) {
        if(!(idph0 instanceof idqi)) {
            throw new IllegalStateException("Must be an ASN1OctetString, was " + new ibuk(idph0.getClass()).c());
        }
        byte[] arr_b = ((idqi)idph0).b;
        ibuq.e(arr_b, "getOctets(...)");
        return arr_b;
    }
}

