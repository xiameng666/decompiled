import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

public final class ssv implements Closeable {
    public final idpv a;
    private final sxd b;
    private final sxd c;
    private final int d;

    public ssv(byte[] arr_b) {
        this(arr_b, 0, arr_b.length, 2, sxd.a, sxd.a);
    }

    public ssv(byte[] arr_b, int v, int v1, int v2, sxd sxd0, sxd sxd1) {
        this.b = sxd0;
        this.c = sxd1;
        this.a = new sst((arr_b == null ? null : Arrays.copyOfRange(arr_b, v, v1)));
        this.d = v2;
    }

    public final ssw a() {
        ssf ssf1;
        ssf ssf0;
        String s5;
        String s4;
        String s3;
        String s2;
        Calendar calendar1;
        Calendar calendar0;
        String s1;
        String s;
        byte[] arr_b8;
        ssm ssm1;
        idpv idpv1;
        byte[] arr_b7;
        ArrayList arrayList2;
        ArrayList arrayList0;
        idqm idqm0 = this.a.b();
        idpv idpv0 = null;
        if(idqm0 == null) {
            return null;
        }
        sxd sxd0 = this.c;
        byte[] arr_b = ((idqi)idqm0).b;
        ssy ssy0 = ((ssu)idqm0).a();
        int v = sxd0.d();
        if(v && ssg.d(ssy0)) {
            swc swc0 = (swc)sxd0.b();
            if(ssi.o(arr_b) == 2) {
                sxa sxa0 = sxb.a(ssy0, arr_b, ssc.a(arr_b));
                ssc ssc0 = (ssc)sxa0.b;
                int v1 = ssc0.f() ? 4 : 2;
                byte[] arr_b1 = sxa0.d;
                srk srk0 = sxa0.c;
                int v2 = srk0.e;
                if(arr_b1.length != v1 * v2) {
                    throw sxf.h("Invalid key data");
                }
                sxd sxd1 = this.b;
                if(sxd1.d()) {
                    if(!sxa0.a(((srq)sxd1.b()).b)) {
                        throw sxf.f("Incorrect CMAC for KEK protected keys");
                    }
                    arrayList0 = new ArrayList();
                    for(Object object0: ((srq)sxd1.b()).a.k(arr_b1)) {
                        arrayList0.add(((srp)object0).i());
                    }
                    if(arrayList0.size() != 2 && arrayList0.size() != 4) {
                        throw sxf.h("Malformed key data");
                    }
                    if(arrayList0.size() == 2) {
                        arrayList0.add(0, null);
                        arrayList0.add(0, null);
                    }
                }
                else {
                    ArrayList arrayList1 = new ArrayList(Arrays.asList(new byte[][]{0, 0, 0, 0}));
                    int v3 = 4 - v1;
                    for(int v4 = 0; v3 < 4; v4 = v5) {
                        int v5 = v4 + v2;
                        arrayList1.set(v3, Arrays.copyOfRange(arr_b1, v4, v5));
                        ++v3;
                    }
                    arrayList0 = arrayList1;
                }
                byte[] arr_b2 = (byte[])arrayList0.get(2);
                byte[] arr_b3 = (byte[])arrayList0.get(3);
                sxd sxd2 = sxd.a(((byte[])arrayList0.get(0)));
                sxd sxd3 = sxd.a(((byte[])arrayList0.get(1)));
                return new svu(sxa0.a, ssc0, srk0, arr_b2, arr_b3, sxd2, sxd3, sxa0.e, swc0);
            }
            switch(ssi.o(arr_b)) {
                case 1: {
                    sxa sxa1 = sxb.a(ssy0, arr_b, new ssi(Arrays.copyOf(arr_b, 1)));
                    byte[] arr_b4 = sxa1.d;
                    srk srk1 = sxa1.c;
                    int v6 = srk1.e;
                    if(arr_b4.length != v6 + v6) {
                        throw sxf.h("Invalid key data");
                    }
                    sxd sxd4 = this.b;
                    if(sxd4.d()) {
                        if(!sxa1.a(((srq)sxd4.b()).b)) {
                            throw sxf.f("Incorrect CMAC for KEK protected keys");
                        }
                        arrayList2 = new ArrayList();
                        for(Object object1: ((srq)sxd4.b()).a.k(arr_b4)) {
                            arrayList2.add(((srp)object1).i());
                        }
                        if(arrayList2.size() != 2) {
                            throw sxf.h("Malformed key data");
                        }
                    }
                    else {
                        arrayList2 = new ArrayList(2);
                        int v8 = 0;
                        for(int v7 = 0; v8 < 2; v7 = v9) {
                            int v9 = v7 + v6;
                            arrayList2.add(Arrays.copyOfRange(arr_b4, v7, v9));
                            ++v8;
                        }
                    }
                    byte[] arr_b5 = (byte[])arrayList2.get(0);
                    byte[] arr_b6 = (byte[])arrayList2.get(1);
                    return new svy(sxa1.a, sxa1.b, srk1, arr_b5, arr_b6, sxa1.e, swc0);
                }
                case 4: {
                    sxa sxa2 = sxb.a(ssy0, arr_b, new ssi(Arrays.copyOf(arr_b, 2)));
                    sxd sxd5 = this.b;
                    if(sxd5.d()) {
                        if(!sxa2.a(((srq)sxd5.b()).b)) {
                            throw sxf.f("Incorrect CMAC for KEK protected keys");
                        }
                        arr_b7 = ((srq)sxd5.b()).a.j(sxa2.d);
                    }
                    else {
                        arr_b7 = sxa2.d;
                    }
                    if(arr_b7.length >= 16 && arr_b7.length <= 0x40) {
                        return new svz(sxa2.a, sxa2.b, arr_b7, sxa2.e, swc0);
                    }
                    throw sxf.h(("Shared key length not between 16 and 64. Actual size: " + arr_b7.length));
                }
            }
        }
        int v10 = ssy0.a;
        if(v10 == ssn.a.a) {
            sso sso0 = sso.b;
            ssm ssm0 = ssm.a;
            HashMap hashMap0 = new HashMap();
            try {
                idpv1 = new idpv(arr_b);
                ssm1 = ssm0;
                arr_b8 = null;
                s = null;
                s1 = null;
                calendar0 = null;
                calendar1 = null;
                s2 = null;
                s3 = null;
                s4 = null;
                s5 = null;
                goto label_112;
            }
            catch(IOException iOException0) {
                throw new stt(a.v(str.b(arr_b), "Failed to read metadata from stream, data: "), iOException0);
                while(true) {
                    try {
                    label_112:
                        idrc idrc0 = (idrc)idpv1.b();
                        if(idrc0 == null) {
                            goto label_171;
                        }
                        idsd idsd0 = (idsd)idri.c(idrc0, idrc0.c, false, 4);
                        int v11 = idrc0.c - sso0.d;
                        switch(v11) {
                            case 0: {
                                arr_b8 = idsd0.b;
                                goto label_112;
                            }
                            case 1: {
                                byte[] arr_b10 = idsd0.b;
                                if(arr_b10.length != 1) {
                                    throw new IllegalArgumentException("Invalid octet length");
                                }
                                int v12 = arr_b10[0];
                                ssm[] arr_ssm = ssm.values();
                                int v13 = 0;
                                while(v13 < arr_ssm.length) {
                                    ssm ssm2 = arr_ssm[v13];
                                    if(ssm2.d != v12) {
                                        ++v13;
                                        continue;
                                    }
                                    ssm1 = ssm2;
                                    goto label_112;
                                }
                                ssm1 = ssm0;
                                goto label_112;
                            }
                            case 2: {
                                s = sso0.a(idsd0);
                                goto label_112;
                            }
                            case 3: {
                                s1 = sso0.a(idsd0);
                                goto label_112;
                            }
                            case 4: {
                                calendar0 = sso0.b(idsd0);
                                goto label_112;
                            }
                            case 5: {
                                calendar1 = sso0.b(idsd0);
                                goto label_112;
                            }
                            case 6: {
                                s2 = ifuf.a(idsd0.b);
                                goto label_112;
                            }
                            case 7: {
                                s3 = sso0.a(idsd0);
                                goto label_112;
                            }
                            case 8: {
                                s4 = sso0.a(idsd0);
                                goto label_112;
                            }
                            case 9: {
                                s5 = sso0.a(idsd0);
                                goto label_112;
                            }
                            default: {
                                byte[] arr_b9 = idsd0.b;
                                if(v11 > 0x1F) {
                                    throw new IllegalArgumentException("Tag number must not be higher than 0x1F");
                                }
                                Integer integer0 = v11;
                                if(sso.c.contains(integer0)) {
                                    throw new IllegalArgumentException("Tag " + Integer.toHexString(v11) + " is reserved");
                                }
                                if(hashMap0.containsKey(integer0)) {
                                    throw new IllegalArgumentException("Tag " + Integer.toHexString(v11) + " is already defined");
                                }
                                hashMap0.put(integer0, arr_b9);
                                goto label_112;
                            }
                        }
                    }
                    catch(IOException iOException0) {
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                    idpv0 = idpv1;
                    try {
                        throw new stt(a.v(str.b(arr_b), "Failed to read metadata from stream, data: "), iOException0);
                    }
                    catch(Throwable throwable0) {
                        goto label_167;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_167;
            }
            idpv0 = idpv1;
        label_167:
            if(idpv0 != null) {
                try {
                    idpv0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
            try {
            label_171:
                idpv1.close();
            }
            catch(IOException unused_ex) {
            }
            return new ssn(sso0, arr_b8, ssm1, s, s1, calendar0, calendar1, s2, s3, s4, s5, hashMap0);
        }
        int v14 = ssr.c.a;
        if(v10 != v14 && v10 != ssr.a.a && v10 != ssr.d.a) {
            if(v10 == ssd.a.a) {
                return new ssd(arr_b);
            }
            if(v10 == sse.a.a) {
                return new sse(arr_b);
            }
            if(v10 == ssb.a.a) {
                return new ssb(arr_b);
            }
            int v15 = svx.a.a;
            if(v10 == v15 && arr_b.length >= 9 && arr_b.length <= 72) {
                return new svx(Arrays.copyOfRange(arr_b, 0, 8), Arrays.copyOfRange(arr_b, 8, arr_b.length));
            }
            if(v10 == v15 && (arr_b.length < 9 || arr_b.length > 72)) {
                return new stc(ssy0, arr_b, null);
            }
            if(v10 != srs.a.c.a && v10 != srs.b.c.a) {
                if(ssg.d(ssy0) && ssi.o(arr_b) == 3) {
                    ssg ssg0 = ssg.b(ssy0);
                    ssc ssc1 = ssc.a(arr_b);
                    try {
                        ssv ssv0 = new ssv(new ssv(Arrays.copyOfRange(arr_b, ssc1.j(), arr_b.length)).a().a());
                        ssw ssw0 = ssv0.a();
                        ssw ssw1 = ssv0.a();
                        ssw ssw2 = ssv0.a();
                        if(Arrays.equals(ssw1.d().e(), sry.b)) {
                            return new sry(ssg0, ssc1, new sri(ssw0.a()), srx.a(ssw1.a()), new srj(ssw2.a()));
                        }
                        if(Arrays.equals(ssw1.d().e(), sry.d)) {
                            return new sry(ssg0, ssc1, new sri(ssw0.a()), new ssy(Integer.parseInt(str.b(ssw1.a()), 16)), new ssy(Integer.parseInt(str.b(ssw2.a()), 16)));
                        }
                        throw new IOException();
                    }
                    catch(IOException unused_ex) {
                        throw new stt("Failed to parse AKE keyset object");
                    }
                }
                if(v10 == ssk.a.a) {
                    if(arr_b != null) {
                        ssv ssv1 = new ssv(arr_b);
                        try {
                            return new ssk(((ssr)ssv1.a()));
                        }
                        catch(IOException iOException1) {
                            throw new stt("Failed to parse OID", iOException1);
                        }
                    }
                    return new ssk(null);
                }
                if(v10 == ssl.a.a) {
                    return new ssl(ByteBuffer.wrap(sto.e(new byte[][]{new byte[4 - arr_b.length], arr_b})).getInt());
                }
                if(v10 == srw.a.a) {
                    stp.b(arr_b, "Data");
                    if(arr_b.length == 1) {
                        return arr_b[0] == 0 ? new srw(false) : new srw(true);
                    }
                    throw new IllegalArgumentException("Data must be 1 bytes");
                }
                if(!ssy0.c()) {
                    return new stc(ssy0, arr_b, this.d);
                }
                if(v10 == svw.a.a) {
                    try(ssv ssv2 = new ssv(arr_b)) {
                        svv svv0 = ssv.c(0x80, ssv2.a());
                        svv svv1 = ssv.c(0x81, ssv2.a());
                        sxd sxd6 = sxd.a;
                        sxd sxd7 = sxd6;
                        ssw ssw3;
                        while((ssw3 = ssv2.a()) != null) {
                            int v16 = ssv.b(ssw3.d().a);
                            sxd sxd8 = new sxd(new svv(ssw3));
                            if(v16 == 130) {
                                sxd6 = sxd8;
                                continue;
                            }
                            if(v16 != 0x83) {
                                throw sxf.h("Unexpected tag in HOTP object");
                            }
                            sxd7 = sxd8;
                            continue;
                        }
                        return new svw(svv0, svv1, sxd6, sxd7);
                    }
                    catch(IOException unused_ex) {
                        throw sxf.h("HOTP structure invalid");
                    }
                }
                return v10 == ssz.a.a ? new ssz() : new ssx(ssy0, arr_b);
            }
            ssv ssv3 = new ssv(arr_b);
            ArrayList arrayList3 = new ArrayList();
            try {
                while(true) {
                    idqm idqm1 = ssv3.a.b();
                    ssx ssx0 = idqm1 == null ? null : new ssx(((ssu)idqm1).a(), ((idqi)idqm1).b);
                    if(ssx0 == null) {
                        break;
                    }
                    if(v != 0 && ssx0.n.b()) {
                        throw new stt("Access list object cannot contain construted objects");
                    }
                    byte[] arr_b11 = ssx0.a();
                    ArrayList arrayList4 = new ArrayList();
                    int v17 = 0;
                label_257:
                    if(v17 >= arr_b11.length) {
                        arrayList3.add(new srv(ssx0.n, arrayList4));
                        continue;
                    }
                    int v18 = arr_b11[v17];
                    try {
                        ssf[] arr_ssf = ssf.values();
                        int v19 = arr_ssf.length;
                        for(int v20 = 0; true; ++v20) {
                            if(v20 >= v19) {
                                throw new EnumConstantNotPresentException(ssf.class, "Missing permission with data reference qualifier: " + v18);
                            }
                            ssf0 = arr_ssf[v20];
                            if(ssf0.d == v18) {
                                break;
                            }
                        }
                    }
                    catch(EnumConstantNotPresentException unused_ex) {
                        ssf1 = new ssh(ssg.a(((byte)(v18 & 0x1F))), stn.e(((byte)v18), ((byte)7)), stn.e(((byte)v18), ((byte)6)));
                        arrayList4.add(ssf1);
                        ++v17;
                        goto label_257;
                    }
                    ssf1 = ssf0;
                    arrayList4.add(ssf1);
                    ++v17;
                    goto label_257;
                }
            }
            catch(IOException iOException2) {
                throw new stt("Failed to parse access rules", iOException2);
            }
            return new srt((v10 == srs.a.c.a ? srs.a : srs.b), arrayList3, ((boolean)(v ^ 1)));
        }
        if(v10 == ssr.a.a) {
            return new ssr(arr_b);
        }
        return v10 == v14 ? new ssr(ssq.a, arr_b, ssp.c) : new ssr(ssq.a, arr_b, ssp.b);
    }

    private static int b(int v) {
        return v & -17;
    }

    private static svv c(int v, ssw ssw0) {
        if(ssv.b(ssw0.d().a) == v) {
            return new svv(ssw0);
        }
        throw sxf.h("Unexpected tag found in HOTP object");
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

