import android.os.Build;

public final class fugo {
    public static final grx a;

    static {
        fugc fugc0 = new fugc();
        fugo.a = new gqc(gul.a, fugc0);
    }

    public static final void a(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0xDE8433E1);
        if(v != 0) {
            gdh.b("b/413447752: Developer error logging VEs.", dla.d(cqx.c(hfc.e, hll.f), 8.0f), hll.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, goz1, 438, 0, 0x3FFF8);
            v1 = v;
        }
        else if(!goz1.ac()) {
            gdh.b("b/413447752: Developer error logging VEs.", dla.d(cqx.c(hfc.e, hll.f), 8.0f), hll.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, goz1, 438, 0, 0x3FFF8);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuge(v1);
        }
    }

    public static final void b(int v, fhvp[] arr_fhvp, ibth ibth0, ibtw ibtw0, goz goz0, int v1, int v2) {
        Object object0;
        fhvp[] arr_fhvp4;
        ibth ibth3;
        int v8;
        fhvp[] arr_fhvp3;
        int v7;
        ibth ibth2;
        fhvp[] arr_fhvp2;
        int v6;
        ibth ibth1;
        fhvp[] arr_fhvp1;
        int v4;
        int v3;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x9441FC9A);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            v4 = v;
        }
        else if((v1 & 6) == 0) {
            v4 = v;
            v3 = (goz1.V(v4) ? 4 : 2) | v1;
        }
        else {
            v4 = v;
            v3 = v1;
        }
        int v5 = 16;
        if((v1 & 0x30) == 0) {
            if((v2 & 2) == 0) {
                arr_fhvp1 = arr_fhvp;
                if(goz1.Z(arr_fhvp1)) {
                    v5 = 0x20;
                }
            }
            else {
                arr_fhvp1 = arr_fhvp;
            }
            v3 |= v5;
        }
        else {
            arr_fhvp1 = arr_fhvp;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            ibth1 = ibth0;
        }
        else if((v1 & 0x180) == 0) {
            ibth1 = ibth0;
            v3 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        else {
            ibth1 = ibth0;
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            v6 = v4;
            arr_fhvp2 = arr_fhvp1;
            ibth2 = ibth1;
            goto label_98;
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                v7 = v3;
                arr_fhvp3 = arr_fhvp1;
                v8 = v4;
                ibth3 = ibth1;
            }
            else {
                if(1 == (v2 & 1)) {
                    v4 = 0;
                }
                if((v2 & 2) == 0) {
                    arr_fhvp4 = arr_fhvp1;
                }
                else {
                    v3 &= 0xFFFFFF8F;
                    arr_fhvp4 = new fhvp[0];
                }
                if((v2 & 4) == 0) {
                    arr_fhvp3 = arr_fhvp4;
                    v8 = v4;
                    v7 = v3;
                    ibth3 = ibth1;
                }
                else {
                    v8 = v4;
                    v7 = v3;
                    ibth3 = null;
                    arr_fhvp3 = arr_fhvp4;
                }
            }
            goz1.w();
            if(v8 == 0) {
                goz1.M(0xEB09F2EE);
                ibtw0.a(goz1, Integer.valueOf(v7 >> 9 & 14));
                goz1.x();
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new fuga(arr_fhvp3, ibth3, ibtw0, v1, v2);
                }
            }
            else {
                goz1.M(0xEAF69025);
                goz1.M(-1951048116);
                try {
                    fhxi fhxi0 = (fhxi)goz1.h(fsdq.a);
                    gze gze0 = gzf.e(0x2CE043B0, new fugh(ibth3, ibtw0), goz1);
                    try {
                        fhxi0.c(v8, arr_fhvp3, null, null, gze0, goz1, v7 & 14 | 0xC00000 | v7 & 0x70, 0x7C);
                    }
                    catch(Throwable throwable0) {
                        arr_fhvp3 = arr_fhvp3;
                        goto label_81;
                    }
                    object0 = ibom.a;
                    goto label_82;
                }
                catch(Throwable throwable0) {
                }
            label_81:
                object0 = ibnx.a(throwable0);
            label_82:
                goz1.x();
                if(ibnw.a(object0) != null) {
                    String s = Build.TYPE;
                    ibuq.e(s, "TYPE");
                    if(ibzk.G(s, "userdebug")) {
                        goz1.M(0x44D573E7);
                        fugo.a(goz1, 0);
                    }
                    else {
                        goz1.M(1155092301);
                        ibtw0.a(goz1, Integer.valueOf(v7 >> 9 & 14));
                    }
                    goz1.x();
                }
                goz1.x();
                ibth2 = ibth3;
                arr_fhvp2 = arr_fhvp3;
                v6 = v8;
            label_98:
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new fugb(v6, arr_fhvp2, ibth2, ibtw0, v1, v2);
                }
            }
        }
    }

    public static final void c(int v, int v1, long v2, ibtw ibtw0, goz goz0, int v3) {
        Object object1;
        int v5;
        gze gze0;
        fhvp[] arr_fhvp;
        fhxi fhxi0;
        Object object0;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0xA41A085A);
        int v4 = (v3 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v4 |= (goz1.V(v1) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v4 |= (goz1.W(v2) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            v4 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v4 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v != 0) {
                goz1.M(0xB17D49D3);
                goz1.M(96039891);
                try {
                    ((fhxi)goz1.h(fsdq.a)).c(v, null, null, null, gzf.e(305829709, new fugk(ibtw0), goz1), goz1, v4 & 14 | 0xC00000, 0x7E);
                    object0 = ibom.a;
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                goz1.x();
                if(ibnw.a(object0) != null) {
                    String s = Build.TYPE;
                    ibuq.e(s, "TYPE");
                    if(ibzk.G(s, "userdebug")) {
                        goz1.M(0x96FF67A0);
                        fugo.a(goz1, 0);
                    }
                    else {
                        goz1.M(0x97036988);
                        ibtw0.a(goz1, Integer.valueOf(v4 >> 9 & 14));
                    }
                    goz1.x();
                }
            }
            else if(v2 == 0L) {
                goz1.M(0x5BA8D03);
                ibtw0.a(goz1, Integer.valueOf(v4 >> 9 & 14));
            }
            else {
                goz1.M(0xB18F8353);
                goz1.M(0x5B9FE18);
                try {
                    fhxi0 = (fhxi)goz1.h(fsdq.a);
                    arr_fhvp = new fhvp[1];
                    gjdt gjdt0 = gjds.a(((ProtoLiteMessage)gjdw.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjed.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjed gjed0 = (gjed)hftp0.b_message;
                    gjed0.b |= 1;
                    gjed0.c = v2;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((gjed)hftv0), "value");
                    ProtoLiteBuilder hftp1 = gjdt0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gjdw gjdw0 = (gjdw)hftp1.b_message;
                    ((gjed)hftv0).getClass();
                    gjdw0.o = (gjed)hftv0;
                    gjdw0.b |= 0x200000;
                    gjdw gjdw1 = gjdt0.a();
                    ibuq.f(gjdw1, "paymentsConsumerCoreVisualElementMetadata");
                    arr_fhvp[0] = new fhvp(gjdr.a, gjdw1);
                    gze0 = gzf.e(0xEB386C76, new fugn(ibtw0), goz1);
                    v5 = v4;
                }
                catch(Throwable throwable1) {
                    v5 = v4;
                    goto label_71;
                }
                try {
                    fhxi0.c(v1, arr_fhvp, null, null, gze0, goz1, v4 >> 3 & 14 | 0xC00000, 0x7C);
                    object1 = ibom.a;
                    goto label_72;
                }
                catch(Throwable throwable1) {
                    goz1 = goz1;
                }
            label_71:
                object1 = ibnx.a(throwable1);
            label_72:
                goz1.x();
                if(ibnw.a(object1) != null) {
                    String s1 = Build.TYPE;
                    ibuq.e(s1, "TYPE");
                    if(ibzk.G(s1, "userdebug")) {
                        goz1.M(991071639);
                        fugo.a(goz1, 0);
                    }
                    else {
                        goz1.M(0x3B168F7F);
                        ibtw0.a(goz1, Integer.valueOf(v5 >> 9 & 14));
                    }
                    goz1.x();
                }
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fugd(v, v1, v2, ibtw0, v3);
        }
    }
}

