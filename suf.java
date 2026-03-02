import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class suf implements svi {
    private final ste a;
    private final boolean b;
    private final sxd c;

    public suf(sxd sxd0, boolean z, byte[] arr_b) {
        this.c = sxd0;
        this.b = z;
        try {
            this.a = ste.a(arr_b);
        }
        catch(IllegalArgumentException unused_ex) {
            throw sxf.h("Invalid authentication template");
        }
    }

    @Override  // svi
    public final swj a(srb srb0) {
        svt svt2;
        boolean z7;
        svu svu3;
        boolean z6;
        srp srp8;
        srp srp7;
        sxd sxd5;
        sxd sxd4;
        ieev ieev0;
        svk svk1;
        srn srn0;
        sxd sxd3;
        sxd sxd2;
        svt svt1;
        byte[] arr_b15;
        byte[] arr_b14;
        sxd sxd1;
        boolean z4;
        boolean z3;
        ssg ssg0 = (ssg)this.c.c(ssg.a);
        ssc ssc0 = new ssc(new byte[]{(byte)0x80, 0});
        srk srk0 = srk.b;
        byte[] arr_b = new byte[srk0.e];
        sxd sxd0 = sxd.a;
        svu svu0 = new svu(ssg0, ssc0, srk0, arr_b, arr_b, sxd0, sxd0, arr_b, srb0.e.a);
        sud sud0 = new sud();
        boolean z = this.b;
        swr swr0 = sws.a(srb0, ssg0, z, sud0, svu0);
        swr swr1 = new swr(srb0.e, svu0);
        if(!this.c.d()) {
            swr0 = swr1;
        }
        ste ste0 = this.a;
        svu svu1 = (svu)swr0.b;
        ssy ssy0 = ste.b;
        if(ste0.b(ssy0)) {
            ssc ssc1 = (ssc)svu1.m;
            byte[] arr_b1 = ssc1.e() ? stm.a(suf.b(ssc1.b(), svu1.f(), svu1.i()).a) : swx.a(8);
            srb0.c.c();
            srb0.c.a = new sxd(ssg0);
            srb0.c.b = z;
            srb0.c.e = new sxd(arr_b1);
            srb0.c.i = sqw.b;
            return new swl(new ste(ssy0, arr_b1).d(), srg.a, true);
        }
        ssy ssy1 = ste.c;
        if(!ste0.b(ssy1)) {
            throw sxf.h("Incorrect authentication data");
        }
        svt svt0 = swr0.a;
        sqx sqx0 = srb0.c;
        ssg ssg1 = svu1.l;
        if(sqx0.a.b != ssg1) {
            throw sxf.a("General authenticate (2) received without (1), or with mismatching key refs");
        }
        byte[] arr_b2 = swx.a(40);
        byte[] arr_b3 = Arrays.copyOf(arr_b2, arr_b2.length - 8);
        byte[] arr_b4 = ste0.c(ssy1);
        if(arr_b4.length >= 40) {
            arr_b2 = arr_b4;
        }
        byte[] arr_b5 = Arrays.copyOfRange(arr_b2, arr_b2.length - 8, arr_b2.length);
        byte[] arr_b6 = Arrays.copyOf(arr_b2, arr_b2.length - 8);
        srp srp0 = svu1.i();
        boolean z1 = sto.c(arr_b5, stf.b(srp0.e(arr_b6)));
        if(z1) {
            arr_b3 = arr_b6;
        }
        srp srp1 = svu1.f();
        byte[] arr_b7 = srp1.g(arr_b3, new byte[srp1.a.d], false);
        byte[] arr_b8 = Arrays.copyOfRange(arr_b7, 0, 8);
        byte[] arr_b9 = Arrays.copyOfRange(arr_b7, 8, 16);
        byte[] arr_b10 = Arrays.copyOfRange(arr_b7, 16, 0x20);
        ssc ssc2 = (ssc)svu1.m;
        byte[] arr_b11 = ssc2.e() ? stm.a(suf.b(ssc2.b(), srp1, srp0).b) : swx.a(16);
        sqv sqv0 = new sqv(new ssh(ssg1, z, ssc2.d()), ssc2);
        boolean z2 = svt0.r();
        if(sqx0.i == sqw.b) {
            if(sto.c(arr_b9, ((byte[])sqx0.e.b())) && z1) {
                z3 = z2;
                z4 = sqx0.a.b() == sqv0.a.a && sqx0.b == sqv0.a.b;
            }
            else {
                z3 = z2;
                z4 = false;
            }
            byte[] arr_b12 = swx.a(16);
            byte[] arr_b13 = swx.a(16);
            if(z4) {
                sxd1 = new sxd(sqv0);
                arr_b14 = arr_b11;
                arr_b15 = arr_b10;
            }
            else {
                arr_b14 = arr_b13;
                arr_b15 = arr_b12;
                sxd1 = sxd0;
            }
            svu svu2 = z4 ? svu1 : svu0;
            srl srl0 = srl.b;
            svk svk0 = new svk(arr_b8, ((byte[])sqx0.e.b()), arr_b15, arr_b14);
            int v = 4;
            if(z3) {
                srp srp2 = svu2.i();
                srp srp3 = new srp(srk0, svp.a(srp2, svk0, 4));
                srp srp4 = new srp(srk0, svp.a(srp2, svk0, 6));
                int v1 = ((ssc)svu2.m).i() - 1;
                if(v1 == 0) {
                    svt1 = svt0;
                    sxd2 = new sxd(svu2.g());
                    sxd3 = new sxd(svu2.h());
                }
                else {
                    svt1 = svt0;
                    if(v1 == 1) {
                        sxd2 = new sxd(new srp(srk0, svp.a(srp2, svk0, 5)));
                        sxd3 = new sxd(new srp(srk0, svp.a(srp2, svk0, 7)));
                    }
                    else {
                        sxd2 = sxd0;
                        sxd3 = sxd2;
                    }
                }
                srn0 = new srn(srp3, srp4, ((srp)sxd2.b), ((srp)sxd3.b));
                svk1 = svk0;
            }
            else {
                svt1 = svt0;
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                ssc ssc3 = (ssc)svu2.m;
                if(ssc3.i() != 2) {
                    v = 2;
                }
                int v2 = 1;
                while(byteArrayOutputStream0.size() < v * 16) {
                    sxk sxk0 = new sxk();
                    sxk0.g(svp.a);
                    sxk0.e(((byte)v2));
                    sxk0.g(Arrays.copyOf(svk0.b(), 8));
                    sxk0.g(Arrays.copyOf(svk0.a(), 8));
                    sxk0.e(srk0.c);
                    sxk0.e(srk0.c);
                    sxk0.g(svk0.c());
                    sxk0.g(svk0.d());
                    byte[] arr_b16 = sxk0.b();
                    switch(srl0.ordinal()) {
                        case 0: {
                            ieev0 = new ieev();
                            break;
                        }
                        case 1: {
                            ieev0 = new ieex();
                            break;
                        }
                        default: {
                            throw new stt("Hash algorithm not supported: " + srl0);
                        }
                    }
                    ieev0.update(arr_b16, 0, arr_b16.length);
                    int v3 = ieev0.getDigestSize();
                    byte[] arr_b17 = new byte[v3];
                    ieev0.doFinal(arr_b17, 0);
                    byteArrayOutputStream0.write(arr_b17, 0, v3);
                    v2 = (byte)(v2 + 1);
                    v = v;
                    ssc3 = ssc3;
                    svk0 = svk0;
                }
                svk1 = svk0;
                byte[] arr_b18 = byteArrayOutputStream0.toByteArray();
                srp srp5 = new srp(srk0, Arrays.copyOfRange(arr_b18, 0, 16));
                srp srp6 = new srp(srk0, Arrays.copyOfRange(arr_b18, 16, 0x20));
                switch(ssc3.i() - 1) {
                    case 0: {
                        sxd5 = new sxd(svu2.g());
                        sxd4 = new sxd(svu2.h());
                        break;
                    }
                    case 1: {
                        sxd5 = new sxd(new srp(srk0, Arrays.copyOfRange(arr_b18, 0x20, 0x30)));
                        sxd4 = new sxd(new srp(srk0, Arrays.copyOfRange(arr_b18, 0x30, 0x40)));
                        break;
                    }
                    default: {
                        sxd4 = sxd0;
                        sxd5 = sxd4;
                    }
                }
                srn0 = new srn(srp5, srp6, ((srp)sxd5.b), ((srp)sxd4.b));
            }
            sxk sxk1 = new sxk();
            sxk1.g(Arrays.copyOf(svk1.c(), srk0.d >> 1));
            sxk1.g(Arrays.copyOf(svk1.d(), srk0.d >> 1));
            sqx0.b(new sro(srk0, srn0, sxk1.b()).a(), sxd1);
            if(z4) {
                srp7 = srp1;
                srp8 = srp0;
            }
            else {
                srp7 = svu0.f();
                srp8 = svu0.i();
            }
            srq srq0 = new srq(srp7, srp8);
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            stq.a(arr_b9, byteArrayOutputStream1);
            stq.a(arr_b8, byteArrayOutputStream1);
            stq.a(arr_b11, byteArrayOutputStream1);
            byte[] arr_b19 = byteArrayOutputStream1.toByteArray();
            byte[] arr_b20 = srq0.a.h(arr_b19, new byte[srq0.a.a.d], false);
            byte[] arr_b21 = stf.b(srq0.b.e(arr_b20));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            stq.a(arr_b20, byteArrayOutputStream2);
            stq.a(arr_b21, byteArrayOutputStream2);
            ste ste1 = new ste(ssy1, byteArrayOutputStream2.toByteArray());
            boolean z5 = ssc2.e() && z4;
            int v4 = svu1.c();
            if(v4 == 0) {
                z6 = !z4;
            }
            else if(z4) {
                z6 = true;
            }
            else if(v4 == 15) {
                z6 = false;
            }
            else {
                z6 = !z4;
            }
            swh swh0 = new swh();
            if(z5) {
            label_179:
                if(z5) {
                    byte[] arr_b22 = ssc2.h();
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b22);
                    byteBuffer0.position(arr_b22.length - 2);
                    byteBuffer0.putShort(((short)(ssc2.b() + 1)));
                    svu3 = new svu(ssg1, ssc.a(byteBuffer0.array()), svu1.a, svu1.b, svu1.c, svu1.f, svu1.g, svu1.d, svu1.e);
                }
                else {
                    svu3 = svu1;
                }
                if(z6) {
                    byte[] arr_b23 = ((ssc)svu3.m).h();
                    int v5 = svu3.b();
                    int v6 = arr_b23.length - v5;
                    int v7 = arr_b23[v6];
                    if((v7 & 15) != 0) {
                        z7 = z4;
                    label_197:
                        if((v7 & 15) != 15) {
                        label_200:
                            ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b23);
                            byteBuffer1.position(v6);
                            byteBuffer1.put(((byte)(v7 & 0xF0 | (z7 ? 0 : (v7 & 15) + 1))));
                            ssc ssc4 = ssc.a(byteBuffer1.array());
                            svu3 = new svu(svu3.l, ssc4, svu3.a, svu3.b, svu3.c, svu3.f, svu3.g, svu3.d, svu3.e);
                        }
                        else if(z7) {
                            z7 = true;
                            goto label_200;
                        }
                    }
                    else if(!z4) {
                        z7 = false;
                        goto label_197;
                    }
                }
                if(svu1 == svu0) {
                    svt2 = svt1;
                }
                else {
                    svt2 = svt1;
                    swh0.a(svt2, svu3);
                    svu1 = svu3;
                }
            }
            else if(z6) {
                z6 = true;
                goto label_179;
            }
            else {
                svt2 = svt1;
            }
            int v8 = svu1.c();
            if(v8 > 0) {
                int v9 = (int)Math.pow(2.0, v8);
                for(int v10 = 0; v10 < v9; ++v10) {
                    try {
                        Thread.sleep(110L);
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            sws.b(srb0, swh0, svt2, svu1, this.b, z4);
            srb0.c(swh0);
            return new swl(ste1.d());
        }
        sqx0.c();
        throw sxf.a("General authenticate (2) received without (1)");
    }

    private static stg b(short v, srp srp0, srp srp1) {
        srq srq0 = new srq(srp0, srp1);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(int v1 = 1; byteArrayOutputStream0.size() < 22; v1 = (byte)(v1 + 1)) {
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            stq.a(sto.g(v), byteArrayOutputStream1);
            stq.a(sth.a, byteArrayOutputStream1);
            stq.a(sto.g(((short)0xB0)), byteArrayOutputStream1);
            byteArrayOutputStream1.write(v1);
            byte[] arr_b = byteArrayOutputStream1.toByteArray();
            stq.a(srq0.b.e(arr_b), byteArrayOutputStream0);
        }
        byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        stq.a(sto.g(v), byteArrayOutputStream2);
        stq.a(Arrays.copyOfRange(arr_b1, 0, 6), byteArrayOutputStream2);
        return new stg(byteArrayOutputStream2.toByteArray(), Arrays.copyOfRange(arr_b1, 6, 22));
    }
}

