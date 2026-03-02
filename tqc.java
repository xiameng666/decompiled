import java.io.ByteArrayOutputStream;

public final class tqc extends twf {
    @Override  // twf
    public final sxm a(sxm sxm0) {
        return new sxt(sxm0.f());
    }

    @Override  // twf
    public final sxn b(ttv ttv0, sxm sxm0) {
        byte[] arr_b5;
        tnx tnx1;
        tog tog0;
        sxt sxt0;
        ((sxt)sxm0).h();
        if(!ttv0.g || ttv0.h || ttv0.d()) {
            throw new sxp("Invalid state - SELECT must be performed", sxr.c);
        }
        if(((sxt)sxm0).a() != 0 || ((sxt)sxm0).b() != 0) {
            throw new sxp("incorrect P1/P2", sxr.f);
        }
        if(!((sxt)sxm0).e()) {
            throw new sxp("Le absent", sxr.k);
        }
        if(((sxt)sxm0).d() != 0x100) {
            throw new sxp("Le required and is non-zero", sxr.k);
        }
        tvv tvv0 = new tvv(twz.e("0000"));
        tvu tvu0 = new tvu(twz.e("000000000000"));
        tvx tvx0 = new tvx(twz.e("0000000000"));
        twa twa0 = new twa(twz.e("00"));
        tvz tvz0 = new tvz(twz.e("000000"));
        ttv0.k.d(tvv0);
        ttv0.k.d(tvu0);
        ttv0.k.d(tvx0);
        ttv0.k.d(twa0);
        ttv0.k.d(tvz0);
        tus tus0 = new tus(((tpf)ttv0.d.b().f(tpf.a)).k(tus.a));
        tus0.fu();
        byte[] arr_b = ((sxt)sxm0).c.d();
        igmf igmf0 = sxt.b;
        if(igmf0.g()) {
            igmf0.b("getDOLBytes() - Returning the value: {}", twz.d(arr_b));
        }
        int v = 0;
        for(Object object0: tus0.c) {
            v += ((sya)object0).a;
        }
        if(arr_b.length != v) {
            throw new sxp(sxr.j);
        }
        syc syc0 = tus0.b(arr_b);
        syd syd0 = syc0.b(new syf(tvt.a));
        if(syd0 != null) {
            syd0.d();
            try {
                Long.parseLong(twz.c(syd0.d(), false));
            }
            catch(NumberFormatException unused_ex) {
                throw new sxp(sxr.j);
            }
        }
        ttt ttt0 = ttv0.k;
        ttt0.e(syc0);
        ttt ttt1 = ttv0.l;
        tny tny0 = ttt1.z();
        tpz tpz0 = ttt0.r();
        if(!tpz0.q(0, 4)) {
            tny0.f();
        }
        if(!tpz0.q(0, 3)) {
            tny0.f();
        }
        tvw tvw0 = ttt0.j(tvw.a) ? new tvw(ttt0.k(tvw.a)) : null;
        if(tvw0 != null) {
            tvw0.toString();
            if((tvw0.i(0) & 15) == 3 || (tvw0.i(0) & 15) == 6) {
                tny0.l(0, 7, true);
            }
        }
        ttt1.d(tny0);
        tto tto0 = ttv0.d;
        ttm ttm0 = tto0.b();
        tvi tvi0 = tor.a;
        tor tor0 = (tor)ttm0.f(tvi0);
        tpg tpg0 = (tpg)ttm0.f(tpg.a);
        tny tny1 = ttt1.z();
        tnx tnx0 = ttt1.y();
        tof tof0 = ttt1.B();
        tns tns0 = ((tnn)ttm0).c();
        toc toc0 = tpg0.p(new syf(toc.a)) ? new toc(tpg0.k(toc.a)) : null;
        tpz tpz1 = ttt0.r();
        tor0.g();
        tvt tvt0 = ttt0.g();
        tor0.m();
        if(tvt0 != null && !tvt0.b()) {
            tvt0.toString();
            tny1.e();
            tny1.f();
            tnt tnt0 = tpg0.a();
            tvy tvy0 = ttt0.m();
            tuq tuq0 = tpg0.b();
            tvv tvv1 = ttt0.i();
            tnt0.toString();
            tvy0.toString();
            tuq0.toString();
            tvv1.toString();
            String s = new tww(tnt0.r()).toString();
            sxt0 = (sxt)sxm0;
            String s1 = new tww(tvy0.r()).toString();
            String s2 = new tww(tuq0.r()).toString();
            String s3 = new tww(tvv1.r()).toString();
            if(!s.equals(s1)) {
                tny1.a();
                if(s2.equals(s3)) {
                    tny1.b();
                }
                else {
                    tny1.c();
                }
            }
            else if(!s2.equals(s3)) {
                tny1.d();
            }
            tny1.toString();
            long v1 = 0L;
            if(!tny1.q(0, 2)) {
                switch(ttt0.q().r()[0]) {
                    case 1: {
                        tog0 = tor0.f();
                        break;
                    }
                    case 2: {
                        tog0 = new toh(tor0.k(toh.a));
                        break;
                    }
                    case 3: {
                        tog0 = new toi(tor0.k(toi.a));
                        break;
                    }
                    case 4: {
                        tog0 = new toj(tor0.k(toj.a));
                        break;
                    }
                    case 5: {
                        tog0 = new tok(tor0.k(tok.a));
                        break;
                    }
                    default: {
                        tog0 = tor0.f();
                    }
                }
                long v5 = Long.parseLong(twz.b(tvt0.r()));
                long v6 = Long.parseLong(twz.b(tog0.t(0)));
                long v7 = Long.parseLong(twz.b(tog0.t(6)));
                ((tnp)ttv0).c().a();
                tof tof1 = ttt1.B();
                if(v5 > v6) {
                    tny1.l(3, 0, true);
                }
                else if(v5 > v7 && !tof1.e()) {
                    tny1.l(3, 1, true);
                    tnx0.d();
                }
                if(!ttt0.s().b()) {
                    if(ttt1.B().e()) {
                        tnx1 = tnx0;
                    }
                    else if(!tor0.i()) {
                        ton ton0 = ((tnp)ttv0).c();
                        long v8 = ton0.a() + Long.parseLong(twz.b(tvt0.r()));
                        if(v8 < 0L) {
                            throw new tkg(tkf.e);
                        }
                        long v9 = v8;
                        int v10 = 0;
                        while(Long.compare(v9, 0L) != 0) {
                            ++v10;
                            v9 /= 10L;
                        }
                        int v11 = v10 % 2 == 0 ? v10 / 2 : (v10 + 1) / 2;
                        long v12 = v8;
                        if(v11 > 6) {
                            throw new tkg(tkf.e);
                        }
                        byte[] arr_b3 = new byte[v11];
                        int v13 = 0;
                        while(v13 < v10) {
                            byte b = (byte)(((int)(v12 % 10L)));
                            if(v13 == v10 - 1 && v10 % 2 != 0) {
                                arr_b3[v13 / 2] = b;
                            }
                            else if(v13 % 2 == 0) {
                                arr_b3[v13 / 2] = b;
                            }
                            else {
                                arr_b3[v13 / 2] = (byte)(((byte)(((int)(v12 % 10L)) << 4)) | arr_b3[v13 / 2]);
                            }
                            v12 /= 10L;
                            ++v13;
                            tnx0 = tnx0;
                            v10 = v10;
                            arr_b3 = arr_b3;
                        }
                        tnx1 = tnx0;
                        for(int v14 = 0; v14 < v11 / 2; ++v14) {
                            byte b1 = arr_b3[v14];
                            int v15 = v11 - v14 - 1;
                            arr_b3[v14] = arr_b3[v15];
                            arr_b3[v15] = b1;
                        }
                        byte[] arr_b4 = new byte[6];
                        for(int v16 = 0; v16 < v11; ++v16) {
                            arr_b4[5 - v16] = arr_b3[v11 - 1 - v16];
                        }
                        ton0.m(arr_b4);
                        ((tnp)ttv0).a.d(ton0);
                        tto0.c.a(((tnp)ttv0).a.c());
                    }
                    else {
                        tnx1 = tnx0;
                        tny1.g();
                        tnx1.d();
                    }
                    tor tor2 = (tor)tto0.b().f(tvi0);
                    long v17 = ((tnp)ttv0).a.b().a();
                    too too0 = tor2.h();
                    try {
                        long v18 = 0L;
                        v18 = Long.parseLong(twz.b(too0.r()));
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    if(v17 <= v18) {
                        goto label_225;
                    }
                    tny1.g();
                    tnx1.d();
                    goto label_225;
                }
            }
            else if(!ttv0.k.s().b()) {
                if(!tof0.e()) {
                    tom tom0 = ((tnp)ttv0).a.a();
                    long v2 = tom0.a();
                    tom0.r();
                    try {
                        if(v2 + 1L < 0L) {
                            throw new tkg(tkf.n);
                        }
                        String s4 = Long.toHexString(v2 + 1L);
                        byte[] arr_b1 = twz.e((s4.length() % 2 == 1 ? "0" + s4 : Long.toHexString(v2 + 1L)));
                        if(arr_b1.length > 2) {
                            throw new tkg(tkf.n);
                        }
                        byte[] arr_b2 = new byte[2];
                        for(int v3 = 0; v3 < arr_b1.length && v3 < 2; ++v3) {
                            arr_b2[1 - v3] = arr_b1[arr_b1.length - 1 - v3];
                        }
                        tom0.m(arr_b2);
                    }
                    catch(tkg tkg0) {
                        tkg0.printStackTrace();
                    }
                    ((tnp)ttv0).a.d(tom0);
                }
                tor tor1 = (tor)ttv0.d.b().f(tor.a);
                tom tom1 = ((tnp)ttv0).a.a();
                tol tol0 = tor1.g();
                if(tol0 != null) {
                    long v4 = tom1.a();
                    try {
                        v1 = Long.parseLong(twz.b(tol0.r()));
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    if(v4 > v1) {
                        tny1.l(1, 5, true);
                        tnx0.d();
                    }
                }
            }
            tnx1 = tnx0;
            goto label_225;
        }
        sxt0 = (sxt)sxm0;
        tnx1 = tnx0;
        tny1.l(3, 2, true);
        if(tor0.c().q(0, 3)) {
            tny1.f();
            if(tor0.i() && !tof0.e()) {
                tny1.g();
                tnx1.d();
            }
        label_225:
            if(tof0.e()) {
                tnx1.c();
            }
            if(tnx1.f()) {
                tpz1.b();
                if(!tns0.q(0, 4) || toc0 == null) {
                    goto label_240;
                }
                for(Object object1: toc0.a()) {
                    ((toe)object1).r();
                }
                toc0.b(tod.a);
                if((!toc0.b(tod.a) || !tpz1.b()) && toc0.b(tod.c)) {
                    tny1.l(2, 2, true);
                    tof0.b();
                    goto label_245;
                label_240:
                    tof0.b();
                    ttv0.l.d(tny1);
                    ttv0.l.d(tnx1);
                    ttv0.l.d(tof0);
                    throw new sxp(sxr.c);
                }
            }
        label_245:
            ttt ttt2 = ttv0.l;
            ttt2.d(tny1);
            ttt2.d(tnx1);
            ttt2.d(tof0);
            ((tnp)ttv0).a().toString();
            if(ttt2.y().f() && ((tnp)ttv0).a().a() && ttt2.z().q(2, 2) && ttt2.B().q(1, 1)) {
                tnz tnz0 = ((tnp)ttv0).a;
                ttt2.y().toString();
                ttt2.z().toString();
                ttt2.B().toString();
                if(ttt2.z().q(3, 1)) {
                    throw new tkg(tkf.j);
                }
                if(ttt2.z().q(1, 5)) {
                    tnz0.a().toString();
                    throw new tkg(tkf.r);
                }
                tnz0.b().toString();
                throw new tkg(tkf.q);
            }
            ttv0.getClass();
            tto tto1 = ttv0.d;
            ttv0.j = ((tka)tto1.c).b();
            tnm tnm0 = ttv0.e();
            if(tnm0 != null) {
                ttt2.d((tnm0.a == null ? null : new ttx(tnm0.a)));
            }
            tkj tkj0 = ttv0.b;
            if((tkj0 instanceof tkk)) {
                tkk tkk0 = (tkk)tkj0;
            }
            toy toy0 = (toy)tto1.b().f(toy.a);
            tns tns1 = toy0.a();
            tnr tnr0 = new tnr(toy0.k(tnr.a));
            tnx tnx2 = ttt2.y();
            ttt2.d(tns1);
            ttt2.d(tnr0);
            ttk[] arr_ttk = {tns1, tnr0, tnx2};
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(int v19 = 0; v19 < 3; ++v19) {
                    arr_ttk[v19].s().b(byteArrayOutputStream0);
                }
                arr_b5 = byteArrayOutputStream0.toByteArray();
            }
            catch(sxu sxu0) {
                throw new RuntimeException(sxu0);
            }
            sxn sxn0 = new sxn(new ttk(arr_b5, tuv.b).s().c(), sxr.g);
            byte[] arr_b6 = new byte[sxt0.g().length - 2];
            System.arraycopy(sxt0.g(), 2, arr_b6, 0, sxt0.g().length - 2);
            ttv0.h = true;
            return sxn0;
        }
        ttt1.d(tny1);
        ttt1.d(tnx1);
        throw new sxp("Zero dollar transaction not allowed", sxr.c);
    }

    @Override
    public final String toString() {
        return this.getClass().getName();
    }
}

