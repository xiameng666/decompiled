import java.util.ArrayDeque;

public final class ehud {
    public boolean a;
    public gxbe b;
    public ehuc c;
    public final ehub d;
    private static ehud e;

    private ehud() {
        this.a = false;
        this.b = null;
        this.d = ehub.a();
    }

    public static ehud a() {
        synchronized(ehud.class) {
            if(ehud.e == null) {
                ehud.e = new ehud();
            }
        }
        return ehud.e;
    }

    public final void b(ehuc ehuc0) {
        synchronized(this) {
            this.c = ehuc0;
            this.d.g(this);
        }
    }

    public final void c(int v) {
        ehuc ehuc0 = this.c;
        int v1 = 3;
        switch(v - 1) {
            case 0: {
                bboh bboh0 = eicd.a;
                ((ggtj)bboh0.h()).x("CHRE and NN are available. Starting CHRE scan.");
                eicb eicb0 = ((eifs)ehuc0).h;
                eicb0.p(14, 0L, 2);
                ((eifs)ehuc0).k = false;
                ehud ehud1 = ((eifs)ehuc0).i;
                if(ehud1 == null) {
                    ((ggtj)bboh0.i()).x("ChreScanner is null. Starting CHRE scan by connecting to CHRE and Nearby nanoapp.");
                    ((eifs)ehuc0).e();
                    return;
                }
                if(!ehud1.a) {
                    ((eifs)ehuc0).m();
                    ((eifs)ehuc0).o = 0L;
                    ((eifs)ehuc0).p = 0L;
                    ehud ehud2 = ((eifs)ehuc0).i;
                    gftb.check(ehud2);
                    ((ggtj)bboh0.h()).B("[%s] Start CHRE scan.", "ChreScanner");
                    ehub ehub0 = ehud2.d;
                    if(ehub0.c()) {
                        gxbf gxbf0 = ehud.e(true);
                        if(ehub0.d(gxbf0)) {
                            ehud2.a = true;
                            ehud2.b = gxbf0.c == 4 ? ((gxbe)gxbf0.d) : gxbe.a;
                            ((eifs)ehuc0).u(2);
                            v1 = 2;
                        }
                        else {
                        label_38:
                            ((ggtj)bboh0.i()).x("Failed to start CHRE BLS. Falling back to AP scan.");
                            ArrayDeque arrayDeque0 = ((eifs)ehuc0).u;
                            eica.a(arrayDeque0, "Failed to start CHRE BLS. Falling back to AP scan.");
                            eigi eigi0 = ((eifs)ehuc0).j;
                            if(eigi0 == null) {
                                ((ggtj)bboh0.i()).x("Scan config is null. Cannot start AP scan.");
                                eica.a(arrayDeque0, "Scan config is null. Cannot start AP scan.");
                            }
                            else {
                                ((eifs)ehuc0).k(eigi0);
                            }
                        }
                    }
                    else {
                        ((ggtj)bboh0.i()).B("[%s] ChreCommunication is not connected. Cannot start a CHRE scan.", "ChreScanner");
                        goto label_38;
                    }
                    eicb0.p(13, 0L, v1);
                }
                return;
            }
            case 1: {
                eica.a(((eifs)ehuc0).u, "CHRE Offload not available");
                bboh bboh1 = eicd.a;
                ((ggtj)bboh1.h()).x("CHRE offload not available on this device. Falling back to AP scan.");
                ((eifs)ehuc0).h.p(14, 0L, 3);
                eigi eigi1 = ((eifs)ehuc0).j;
                if(eigi1 == null) {
                    ((ggtj)bboh1.i()).x("Scan config is null. Cannot start AP scan.");
                    return;
                }
                ((eifs)ehuc0).k(eigi1);
                return;
            }
            default: {
                ((ggtj)eicd.a.h()).x("CHRE offload restart required. Restarting CHRE scan.");
                if(((eifs)ehuc0).s()) {
                    eica.a(((eifs)ehuc0).u, "CHRE Offload restart required");
                    ehud ehud0 = ((eifs)ehuc0).i;
                    gftb.check(ehud0);
                    ehud0.b(ehuc0);
                }
            }
        }
    }

    public final boolean d(int v) {
        String s;
        bboh bboh0 = eicd.a;
        ggtj ggtj0 = (ggtj)bboh0.h();
        switch(v) {
            case 2: {
                s = "LOCATION_UPDATE";
                break;
            }
            case 3: {
                s = "STOP_SCAN";
                break;
            }
            default: {
                s = "STORAGE_FULL";
            }
        }
        ggtj0.R("[%s] Flushing CHRE reports. Trigger: %s", "ChreScanner", s);
        ehub ehub0 = this.d;
        if(ehub0.c()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxbf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxbf gxbf0 = (gxbf)hftp0.b_message;
            gxbf0.b |= 1;
            gxbf0.e = 2;
            gxbb gxbb0 = gxbb.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxbf gxbf1 = (gxbf)hftp0.b_message;
            gxbb0.getClass();
            gxbf1.d = gxbb0;
            gxbf1.c = 5;
            return ehub0.d(((gxbf)hftp0.N_build()));
        }
        ((ggtj)bboh0.i()).B("[%s] ChreScanner is not initialized. Cannot flush reports.", "ChreScanner");
        return false;
    }

    public static final gxbf e(boolean z) {
        byte[] arr_b = new byte[29];
        ehuf.b(((short)-342), arr_b);
        ehuf.c(ehue.c, 1, arr_b);
        byte[] arr_b1 = new byte[29];
        arr_b1[0] = -1;
        arr_b1[1] = -1;
        arr_b1[2] = -16;
        gxaz gxaz0 = gxaz.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxaz0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gxaz)hftv0).c = 22;
        ((gxaz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxaz gxaz1 = (gxaz)hftp0.b_message;
        gxaz1.b |= 2;
        gxaz1.d = 3;
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxaz gxaz2 = (gxaz)hftp0.b_message;
        gxaz2.b |= 4;
        gxaz2.e = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxaz gxaz3 = (gxaz)hftp0.b_message;
        gxaz3.b |= 8;
        gxaz3.f = hfsf1;
        gxaz gxaz4 = (gxaz)hftp0.N_build();
        byte[] arr_b2 = new byte[29];
        arr_b2[0] = 76;
        arr_b2[1] = 0;
        byte[] arr_b3 = ehue.b;
        for(int v = 0; v < 2; ++v) {
            arr_b2[v + 2] = arr_b3[v];
        }
        byte[] arr_b4 = new byte[29];
        arr_b4[0] = -1;
        arr_b4[1] = -1;
        arr_b4[2] = -1;
        arr_b4[3] = -1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxaz0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gxaz)hftv1).c = 0xFF;
        ((gxaz)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxaz gxaz5 = (gxaz)hftp1.b_message;
        gxaz5.b |= 2;
        gxaz5.d = 4;
        ByteString hfsf2 = ByteString.copyFrom(arr_b2);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxaz gxaz6 = (gxaz)hftp1.b_message;
        gxaz6.b |= 4;
        gxaz6.e = hfsf2;
        ByteString hfsf3 = ByteString.copyFrom(arr_b4);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxaz gxaz7 = (gxaz)hftp1.b_message;
        gxaz7.b |= 8;
        gxaz7.f = hfsf3;
        gxaz gxaz8 = (gxaz)hftp1.N_build();
        byte[] arr_b5 = new byte[29];
        ehuf.b(((short)-846), arr_b5);
        ehuf.c(ehue.a, 2, arr_b5);
        byte[] arr_b6 = new byte[29];
        arr_b6[0] = -1;
        arr_b6[1] = -1;
        arr_b6[2] = 0;
        arr_b6[3] = -1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxaz0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gxaz)hftv2).c = 22;
        ((gxaz)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gxaz gxaz9 = (gxaz)hftp2.b_message;
        gxaz9.b |= 2;
        gxaz9.d = 4;
        ByteString hfsf4 = ByteString.copyFrom(arr_b5);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gxaz gxaz10 = (gxaz)hftp2.b_message;
        gxaz10.b |= 4;
        gxaz10.e = hfsf4;
        ByteString hfsf5 = ByteString.copyFrom(arr_b6);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gxaz gxaz11 = (gxaz)hftp2.b_message;
        gxaz11.b |= 8;
        gxaz11.f = hfsf5;
        gxaz gxaz12 = (gxaz)hftp2.N_build();
        if(z) {
            gxbd gxbd0 = (gxbd)((ProtoLiteMessage)gxbe.a).v_newBuilder();
            gxbd0.a(gxaz4);
            gxbd0.a(gxaz8);
            gxbd0.a(gxaz12);
            int v1 = (int)hrtd.h();
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe0 = (gxbe)gxbd0.b_message;
            gxbe0.b |= 2;
            gxbe0.d = v1;
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe1 = (gxbe)gxbd0.b_message;
            gxbe1.b |= 4;
            gxbe1.e = 30;
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe2 = (gxbe)gxbd0.b_message;
            gxbe2.b |= 8;
            gxbe2.f = 28;
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe3 = (gxbe)gxbd0.b_message;
            gxbe3.b |= 16;
            gxbe3.g = 20;
            int v2 = (int)hrtd.g();
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe4 = (gxbe)gxbd0.b_message;
            gxbe4.b |= 0x20;
            gxbe4.h = v2;
            hrtd hrtd0 = hrtd.a;
            int v3 = (int)hrtd0.I().s();
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe5 = (gxbe)gxbd0.b_message;
            gxbe5.b |= 0x40;
            gxbe5.i = v3;
            int v4 = (int)hrtd0.I().p();
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe6 = (gxbe)gxbd0.b_message;
            gxbe6.b |= 0x80;
            gxbe6.j = v4;
            int v5 = (int)hrtd0.I().q();
            if(!gxbd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxbd0).ensureMutable();
            }
            gxbe gxbe7 = (gxbe)gxbd0.b_message;
            gxbe7.b |= 0x100;
            gxbe7.k = v5;
            gxbe gxbe8 = (gxbe)((ProtoLiteBuilder)gxbd0).N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gxbf.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp3.b_message;
            ((gxbf)hftv3).b |= 1;
            ((gxbf)hftv3).e = 1;
            if(!hftv3.isImmutable()) {
                hftp3.ensureMutable();
            }
            gxbf gxbf0 = (gxbf)hftp3.b_message;
            gxbe8.getClass();
            gxbf0.d = gxbe8;
            gxbf0.c = 4;
            return (gxbf)hftp3.N_build();
        }
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gxbf.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gxbf gxbf1 = (gxbf)hftp4.b_message;
        gxbf1.b |= 1;
        gxbf1.e = 1;
        gxbe gxbe9 = gxbe.a;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gxbf gxbf2 = (gxbf)hftp4.b_message;
        gxbe9.getClass();
        gxbf2.d = gxbe9;
        gxbf2.c = 4;
        return (gxbf)hftp4.N_build();
    }
}

