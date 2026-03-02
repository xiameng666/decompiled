import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class suq implements svi {
    final sup a;

    public suq(byte[] arr_b) {
        int v5;
        int v4;
        sxi sxi1;
        ArrayList arrayList0 = new ArrayList();
        sxd sxd0 = sxj.a(arr_b, 0);
        if(sxd0.d()) {
            sxg sxg0 = (sxg)sxd0.b();
            int v = sxg0.e;
            if(v == arr_b.length) {
                int v1 = sxg0.a;
                int v2 = -1;
                if(v1 == 92) {
                    if(sxg0.c > 2) {
                        throw sxf.h("Tag cannot be longer than 2 bytes");
                    }
                    sxd sxd1 = sxj.c(arr_b, sxg0.d);
                    if(sxd1.d()) {
                        sxi sxi0 = (sxi)sxd1.b();
                        if(sxi0.c == sxg0.e) {
                            arrayList0.add(new suo(sxi0.a, false));
                            goto label_62;
                        }
                    }
                    throw sxf.h("Incomplete tag");
                }
                if(v1 != 77) {
                    throw sxf.h("Wrong object type for GET DATA command");
                }
                int v3 = sxg0.d;
                while(true) {
                    sxd sxd2 = sxj.c(arr_b, v3);
                    if(!sxd2.d() || ((sxi)sxd2.b()).c >= arr_b.length) {
                        throw sxf.h("Malformed extended header list");
                    }
                    sxi1 = (sxi)sxd2.b();
                    v4 = sxi1.c;
                    v5 = arr_b[v4] & 0xFF;
                    int v6 = arr_b.length - 1;
                    if(!sxi1.b) {
                        goto label_47;
                    }
                    if(v5 == 0x80) {
                        if(v4 < v6) {
                            throw sxf.h("Trailing data after 0x80 length for constructed tag");
                        }
                        arrayList0.add(new suo(sxi1.a, false));
                        goto label_62;
                    }
                    if(v5 == 0) {
                        if(v4 >= v6) {
                            throw sxf.h("Constructed object cannot have terminating 0x00 byte");
                        }
                        arrayList0.add(new suo(sxi1.a, true));
                        v3 = v4 + 1;
                    }
                    else {
                        sxd sxd3 = sxj.b(arr_b, v4);
                        if(!sxd3.d()) {
                            break;
                        }
                        sxh sxh0 = (sxh)sxd3.b();
                        if(sxh0.b + sxh0.a != v) {
                            break;
                        }
                        arrayList0.add(new suo(sxi1.a, false));
                        v3 = sxh0.b;
                    }
                }
                throw sxf.h("Length bytes malformed");
            label_47:
                if(v5 == 0) {
                    if(v4 < v6) {
                        throw sxf.h("Trailing data after full primitive length indicator");
                    }
                    v5 = 0;
                }
                if(v5 != 0 && v5 != 0x80) {
                    sxd sxd4 = sxj.b(arr_b, v4);
                    if(!sxd4.d()) {
                        throw sxf.h("Length bytes malformed");
                    }
                    sxh sxh1 = (sxh)sxd4.b();
                    if(sxh1.b != arr_b.length) {
                        throw sxf.h("Trailing data after primitive tag length");
                    }
                    v2 = sxh1.a;
                }
                arrayList0.add(new suo(sxi1.a, false));
            label_62:
                sup sup0 = new sup(arrayList0, v2);
                this.a = sup0;
                if(!sup0.a.isEmpty()) {
                    return;
                }
                throw sxf.h("No tags specified for GET DATA");
            }
        }
        throw sxf.h("Malformed TLV");
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sxd sxd7;
        svt svt1;
        srp srp0;
        sxd sxd0;
        sup sup0 = this.a;
        List list0 = sup0.a;
        ssy ssy0 = new ssy(((suo)list0.get(0)).a);
        svt svt0 = srb0.b();
        boolean z = srb0.f(svt0) && ssy0.a == ssk.a.a || (ssy0.a == sse.a.a || ssy0.a == ssb.a.a);
        if(!(svt0 instanceof swa) && (!z && !svt0.n(ssy0) || !z && svt0.l(ssy0) < svt0.l(srs.a.c) || !stu.a(srb0, srb0.b(), ssy0, srs.a))) {
            sxd0 = sxd.a;
        }
        else if(z) {
            int v = ssy0.a;
            byte[] arr_b = swv.b;
            if(v == ssk.a.a) {
                swg swg0 = srb0.b;
                sxd sxd1 = swg0.c.a;
                if(sxd1.d()) {
                    ssr ssr0 = (ssr)sxd1.b();
                    if(swg0.c(ssr0.a())) {
                        sxk sxk0 = new sxk();
                        sxk0.d(6, ssr0.a());
                        arr_b = sxk0.b();
                    }
                }
            }
            else if(v == sse.a.a) {
                sxk sxk1 = new sxk();
                sxk1.d(4, arr_b);
                sxk1.d(4, arr_b);
                sxk1.d(4, new byte[]{1});
                sxk sxk2 = new sxk();
                sxk2.g(new byte[]{16, 0x7A});
                sxk2.g(new byte[]{16, 0x7A});
                sxk2.g(new byte[]{16, 0x7A});
                sxk2.g(new byte[]{2, 2});
                sxk2.g(new byte[]{15, -29, -45, -94});
                sxk2.g(new byte[2]);
                sxk2.g(new byte[2]);
                sxk2.g(new byte[2]);
                sxk2.g(new byte[2]);
                sxk2.g(new byte[2]);
                sxk1.c(4, sxk2);
                arr_b = sxk1.b();
            }
            else {
                if(v != ssb.a.a) {
                    throw sxf.g("BUG: Disagreement in synthesized object");
                }
                swe swe0 = srb0.b.c;
                sxd sxd2 = swe0.b.d() ? srb0.b.a(((ssr)swe0.b.b()).a()) : sxd.a;
                byte[] arr_b1 = sto.g(((short)swe0.c));
                sxk sxk3 = new sxk();
                if(sxd2.d()) {
                    sxk3.d(6, ((svt)sxd2.b()).e().a());
                }
                sxk3.d(2, arr_b1);
                if(sxd2.d()) {
                    sxd sxd3 = ((svt)sxd2.b()).m();
                    if(sxd3.d()) {
                        byte[] arr_b2 = (byte[])sxd3.b();
                        sxk3.d(srw.a.a, arr_b2);
                    }
                }
                arr_b = sxk3.b();
            }
            byte[] arr_b3 = suq.c(arr_b, sxc.a(list0), sup0.b);
            sxd0 = arr_b3.length == 0 ? sxd.a : new sxd(arr_b3);
        }
        else {
            int v1 = ssy0.a;
            if(v1 == svw.a.a) {
                sxd sxd4 = svt0.i(ssy0);
                if(sxd4.d()) {
                    svw svw0 = (svw)sxd4.b();
                    if(list0.size() < 2) {
                        throw sxf.h("OTP requires an additional tag");
                    }
                    int v2 = ((suo)list0.get(1)).a;
                    if(v2 == 0x81) {
                        sxd0 = sxd.a;
                    }
                    else if(v2 == 0x8F) {
                        svv svv0 = svw0.b;
                        byte[] arr_b4 = sto.f(swz.d(svt0, svv0));
                        svv svv1 = svw0.c;
                        if(svv1.b()) {
                            svz svz0 = (svz)swz.b(svt0, svv1.c());
                            srp0 = swz.a(svz0.a, svz0.b);
                        }
                        else {
                            srp0 = swz.a(svv1.c(), srb0.b.d);
                        }
                        sxd sxd5 = svw0.d;
                        sxd sxd6 = sxd.a((sxd5.d() ? swz.d(svt0, ((svv)sxd5.b())) : null));
                        int v3 = sxd6.d() ? sto.a(((byte[])sxd6.b())) : 0;
                        if(v3 != 0 && (v3 < 6 || v3 > 9)) {
                            throw sxf.h("Invalid format in HOTP");
                        }
                        byte[] arr_b5 = swz.e(srp0, arr_b4);
                        if(v3 == 0) {
                            svt1 = svt0;
                            sxd7 = sxd5;
                        }
                        else {
                            int v4 = arr_b5[19] & 15;
                            svt1 = svt0;
                            sxd7 = sxd5;
                            int v5 = (int)(((long)(arr_b5[v4 + 3] & 0xFF | ((arr_b5[v4] & 0x7F) << 24 | (arr_b5[v4 + 1] & 0xFF) << 16 | (arr_b5[v4 + 2] & 0xFF) << 8))) % Math.round(Math.pow(10.0, v3)));
                            arr_b5 = new byte[v3];
                            int v6 = v5;
                            for(int v7 = 0; v7 < v3; ++v7) {
                                arr_b5[v3 - v7 - 1] = (byte)(v6 % 10 & 0xFF);
                                v6 /= 10;
                            }
                        }
                        stc stc0 = new stc(new ssy(svv0.a()), arr_b4);
                        if(!svv0.b()) {
                            stc0 = new svw(new svv(stc0), svv1, sxd7, svw0.e);
                        }
                        swz.c(srb0, svt1, stc0);
                        sxd0 = new sxd(arr_b5);
                    }
                    else {
                        sxd0 = new sxd(suq.c(svw0.a(), sxc.a(list0), sup0.b));
                    }
                }
                else {
                    sxd0 = sxd.a;
                }
            }
            else if(v1 == svx.a.a) {
                sxd sxd8 = svt0.i(ssy0);
                if(sxd8.d()) {
                    stb stb0 = (stb)sxd8.b();
                    if((stb0 instanceof svx)) {
                        byte[] arr_b6 = sto.f(((svx)stb0).b);
                        byte[] arr_b7 = swz.e(swz.a(((svx)stb0).c, srb0.b.d), arr_b6);
                        swz.c(srb0, svt0, new svx(arr_b6, ((svx)stb0).c));
                        sxd0 = new sxd(arr_b7);
                    }
                    else {
                        sxd0 = suq.b(svt0, ssy0, sup0);
                    }
                }
                else {
                    sxd0 = sxd.a;
                }
            }
            else {
                sxd0 = suq.b(svt0, ssy0, sup0);
            }
        }
        if(!sxd0.d()) {
            return new swl();
        }
        sxk sxk4 = new sxk();
        byte[] arr_b8 = (byte[])sxd0.b();
        sxk4.d(((suo)list0.get(list0.size() - 1)).a, arr_b8);
        return new swl(sxk4.b(), srg.a);
    }

    public static sxd b(svt svt0, ssy ssy0, sup sup0) {
        sxd sxd0 = svt0.i(ssy0);
        return sxd0.d() ? sxd.a(suq.c(((stb)sxd0.b()).a(), sxc.a(sup0.a), sup0.b)) : sxd.a(null);
    }

    public static byte[] c(byte[] arr_b, List list0, int v) {
        sxd sxd1;
        int v1 = 0;
        if(list0.isEmpty()) {
            return v == -1 ? arr_b : Arrays.copyOfRange(arr_b, 0, Math.min(v, arr_b.length));
        }
        sxg sxg0 = null;
        int v2 = 0;
        while(v1 < list0.size()) {
            suo suo0 = (suo)list0.get(v1);
            for(int v3 = v2; true; v3 = sxg1.e) {
                sxd sxd0 = sxj.a(arr_b, v3);
                if(!sxd0.d()) {
                    sxd1 = sxd.a;
                    break;
                }
                sxg sxg1 = (sxg)sxd0.b();
                if(sxg1.a == suo0.a) {
                    sxd1 = new sxd(sxg1);
                    break;
                }
            }
            if(!sxd1.d()) {
                break;
            }
            sxg0 = (sxg)sxd1.b();
            v2 = suo0.b ? sxg0.e : sxg0.d;
            ++v1;
        }
        return v1 >= list0.size() ? Arrays.copyOfRange(arr_b, v2, (v == -1 ? Math.min(arr_b.length, sxg0.e) : Math.min(v + v2, Math.min(arr_b.length, sxg0.e)))) : swv.b;
    }
}

