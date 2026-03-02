import android.accounts.Account;
import java.util.Collection;
import java.util.concurrent.Executor;

public final class bnla {
    public final gtdj a;
    public final Account b;
    public final Executor c;
    public final bnlr d;

    public bnla(gtdj gtdj0, Account account0, Executor executor0, bnlr bnlr0) {
        this.a = gtdj0;
        this.b = account0;
        this.c = executor0;
        this.d = bnlr0;
    }

    public final gmcd a(gsyz gsyz0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfd.b);
        gszm gszm0 = gszm.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gszm0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gszm gszm1 = (gszm)hftp0.b_message;
        gsyz0.getClass();
        gszm1.c = gsyz0;
        gszm1.b |= 1;
        gszm gszm2 = (gszm)hftp0.N_build();
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.l;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.l;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "DeleteBleDevice");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gszm0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gszn.a));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    gtdk.l = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
        }
        gdta gdta0 = gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gszm2), "deleteDevice")).h(new bnku(), gmap.a);
        bnkv bnkv0 = new bnkv();
        return gdta0.f(bnlq.class, bnkv0, gmap.a);
    }

    public final gmcd b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtbl)hftv0).b = 0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtbl)hftp0.b_message).c = 3;
        return this.p(((gtbl)hftp0.N_build()));
    }

    public final gmcd c() {
        gted gted0 = null;
        bnlr bnlr0 = this.d;
        synchronized(bnlr0.b) {
            if(this.b.equals(bnlr0.c)) {
                if(bnlr0.a.a() - bnlr0.e > hsxv.a.y().aw()) {
                    bnlr0.c = null;
                    bnlr0.d = null;
                }
                else {
                    gted0 = bnlr0.d;
                }
            }
        }
        return gted0 == null ? this.d(gszk.a) : gmbu.i(gted0);
    }

    public final gmcd d(gszk gszk0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfp.b);
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.a;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "CreateUser");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gszk.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gszl.a));
                    iaoj0 = iaog0.build();
                    gtdk.a = iaoj0;
                }
            }
            return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gszk0), "getOrCreateUser")).h(new bnkl(this), gmap.a);
        }
        return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gszk0), "getOrCreateUser")).h(new bnkl(this), gmap.a);
    }

    public final gmcd e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtbl)hftv0).b = 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtbl)hftp0.b_message).c = 3;
        return this.p(((gtbl)hftp0.N_build()));
    }

    public final gmcd f() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtbl)hftv0).b = 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtbl)hftp0.b_message).c = 3;
        return this.p(((gtbl)hftp0.N_build()));
    }

    public final gmcd g(int v, boolean z) {
        gtax gtax0 = gtax.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtax0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtax)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtax)hftp0.b_message).c = ((int)z) ^ 1;
        gtax gtax1 = (gtax)hftp0.N_build();
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfm.b);
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.g;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.g;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "GetEidInfoForE2eeDevices");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gtax0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gtbc.b));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    gtdk.g = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
            return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtax1), "getSpotDevicesSync");
        }
        return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtax1), "getSpotDevicesSync");
    }

    public final gmcd h(gtbl gtbl0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfi.b);
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.f;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.f;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "ListBleDevices");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gtbl.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gtbn.a));
                    iaoj0 = iaog0.build();
                    gtdk.f = iaoj0;
                }
            }
            return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbl0), "listBleDevices");
        }
        return bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gtbl0), "listBleDevices");
    }

    public final gmcd i(fqsi fqsi0, fqsk fqsk0) {
        gszh gszh0 = gszh.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gszh0).v_newBuilder();
        gszf gszf0 = (gszf)((gftm)fqsi0.d).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gszh)hftv0).d = gszf0;
        ((gszh)hftv0).c = 16;
        gtaa gtaa0 = fqsk0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gtaa0.getClass();
        ((gszh)hftv1).k = gtaa0;
        ((gszh)hftv1).b |= 1;
        gszs gszs0 = fqsk0.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        gszs0.getClass();
        ((gszh)hftv2).l = gszs0;
        ((gszh)hftv2).b |= 2;
        gged_interceptors gged0 = fqsk0.g;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gszh gszh1 = (gszh)hftp0.b_message;
        hfuf hfuf0 = gszh1.m;
        if(!hfuf0.c()) {
            gszh1.m = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(gged0, gszh1.m);
        int v = fqsk0.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gszh gszh2 = (gszh)hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        gszh2.n = v - 2;
        gfsx gfsx0 = fqsi0.a;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).e = (ByteString)object0;
        }
        gfsx gfsx1 = fqsi0.b;
        if(gfsx1.i()) {
            Object object1 = gfsx1.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).f = (ByteString)object1;
        }
        gfsx gfsx2 = fqsi0.c;
        if(gfsx2.i()) {
            Object object2 = gfsx2.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).g = (ByteString)object2;
        }
        gfsx gfsx3 = fqsk0.c;
        if(gfsx3.i()) {
            String s = (String)gfsx3.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).h = s;
        }
        gfsx gfsx4 = fqsk0.d;
        if(gfsx4.i()) {
            String s1 = (String)gfsx4.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).i = s1;
        }
        gfsx gfsx5 = fqsk0.e;
        if(gfsx5.i()) {
            String s2 = (String)gfsx5.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).j = s2;
        }
        if(fqsk0.h) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gszh)hftp0.b_message).o = true;
        }
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, (fqso.c((gszv.b(gtaa0.g) == null ? gszv.h : gszv.b(gtaa0.g))) ? ckfc.c : ckfc.b));
        gszh gszh3 = (gszh)hftp0.N_build();
        iakr iakr0 = gtdj0.a;
        gRPCMethodDescriptor iaoj0 = gtdk.d;
        if(iaoj0 == null) {
            synchronized(gtdk.class) {
                iaoj0 = gtdk.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotService", "CreateBleDevice");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gszh0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gszi.a));
                    iaoj0 = iaog0.build();
                    gtdk.d = iaoj0;
                }
            }
            return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gszh3), "registerDevice"));
        }
        return gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtdj0.b), gszh3), "registerDevice"));
    }

    public final gmcd j(gsyz gsyz0, gszv gszv0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfk.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdn.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gszo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gszo gszo0 = (gszo)hftp1.b_message;
        gsyz0.getClass();
        gszo0.c = gsyz0;
        gszo0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtaa.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtaa gtaa0 = (gtaa)hftp2.b_message;
        gtaa0.g = gszv0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gszo gszo1 = (gszo)hftp1.b_message;
        gtaa gtaa1 = (gtaa)hftp2.N_build();
        gtaa1.getClass();
        gszo1.d = gtaa1;
        gszo1.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn0 = (gtdn)hftp0.b_message;
        gszo gszo2 = (gszo)hftp1.N_build();
        gszo2.getClass();
        gtdn0.c = gszo2;
        gtdn0.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.k("description.beacon_type");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn1 = (gtdn)hftp0.b_message;
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        hftg0.getClass();
        gtdn1.d = hftg0;
        gtdn1.b |= 2;
        return gdta.g(bnka.a(gtdj0.b(((gtdn)hftp0.N_build())), "updateBeaconType")).h(new bnkt(), gmap.a);
    }

    public final gmcd k(gsyz gsyz0, long v, long v1, gtbr gtbr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdx.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtdw.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gsyz0.getClass();
        ((gtdw)hftv0).c = gsyz0;
        ((gtdw)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        gtbr0.getClass();
        ((gtdw)hftv1).d = gtbr0;
        ((gtdw)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtdw)hftp1.b_message).e = v;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtdv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gtdv)hftv2).b = true;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gtdv)hftp2.b_message).c = v1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtdw gtdw0 = (gtdw)hftp1.b_message;
        gtdv gtdv0 = (gtdv)hftp2.N_build();
        gtdv0.getClass();
        gtdw0.f = gtdv0;
        gtdw0.b |= 4;
        gtdw gtdw1 = (gtdw)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdx gtdx0 = (gtdx)hftp0.b_message;
        gtdw1.getClass();
        gtdx0.b();
        gtdx0.b.add(gtdw1);
        gtdx gtdx1 = (gtdx)hftp0.N_build();
        return gdta.g(bnka.a(((gtdj)this.a.q(cmlp.a, ckfk.c)).e(gtdx1), "updateDeviceClock")).h(new bnkq(), gmap.a);
    }

    public final gmcd l(gsyz gsyz0, gtaa gtaa0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfk.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdn.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gszo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gsyz0.getClass();
        ((gszo)hftv0).c = gsyz0;
        ((gszo)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gszo gszo0 = (gszo)hftp1.b_message;
        gtaa0.getClass();
        gszo0.d = gtaa0;
        gszo0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn0 = (gtdn)hftp0.b_message;
        gszo gszo1 = (gszo)hftp1.N_build();
        gszo1.getClass();
        gtdn0.c = gszo1;
        gtdn0.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.k("description");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn1 = (gtdn)hftp0.b_message;
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        hftg0.getClass();
        gtdn1.d = hftg0;
        gtdn1.b |= 2;
        return gdta.g(bnka.a(gtdj0.b(((gtdn)hftp0.N_build())), "updateDeviceDescription")).h(new bnkz(), gmap.a);
    }

    public final gmcd m(Iterable iterable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdp.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gted.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gted gted0 = (gted)hftp1.b_message;
        hfuo hfuo0 = gted0.d;
        if(!hfuo0.c()) {
            gted0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gted0.d);
        gted gted1 = (gted)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdp gtdp0 = (gtdp)hftp0.b_message;
        gted1.getClass();
        gtdp0.c = gted1;
        gtdp0.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.k("encrypted_owner_keys");
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdp gtdp1 = (gtdp)hftp0.b_message;
        hftg0.getClass();
        gtdp1.d = hftg0;
        gtdp1.b |= 2;
        gtdp gtdp2 = (gtdp)hftp0.N_build();
        return gdta.g(bnka.a(((gtdj)this.a.q(cmlp.a, ckfr.b)).c(gtdp2), "updateEncryptedOwnerKeys:updateUser")).h(new bnkw(this), gmap.a);
    }

    public final gmcd n(gsyz gsyz0, gtap gtap0) {
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfk.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdn.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gszo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gsyz0.getClass();
        ((gszo)hftv0).c = gsyz0;
        ((gszo)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gszo gszo0 = (gszo)hftp1.b_message;
        gtap0.getClass();
        gszo0.f = gtap0;
        gszo0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn0 = (gtdn)hftp0.b_message;
        gszo gszo1 = (gszo)hftp1.N_build();
        gszo1.getClass();
        gtdn0.c = gszo1;
        gtdn0.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.k("encrypted_user_secrets");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdn gtdn1 = (gtdn)hftp0.b_message;
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        hftg0.getClass();
        gtdn1.d = hftg0;
        gtdn1.b |= 2;
        return gdta.g(bnka.a(gtdj0.b(((gtdn)hftp0.N_build())), "updateEncryptedUserSecrets")).h(new bnkn(), gmap.a);
    }

    public final gmcd o(Collection collection0) {
        if(collection0.isEmpty()) {
            return gmbx.a;
        }
        gtdj gtdj0 = (gtdj)this.a.q(cmlp.a, ckfn.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtdx gtdx0 = (gtdx)hftp0.b_message;
        gtdx0.b();
        hfrj.E(collection0, gtdx0.b);
        return gdta.g(bnka.a(gtdj0.e(((gtdx)hftp0.N_build())), "uploadE2eePublicKeyIds")).h(new bnky(), gmap.a);
    }

    private final gmcd p(gtbl gtbl0) {
        return gdta.g(this.h(gtbl0)).h(new bnks(), this.c);
    }
}

