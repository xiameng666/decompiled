import android.net.Network;
import java.util.concurrent.TimeUnit;

public final class fvah implements glzm {
    public final fvao a;
    public final gxsw b;
    public final String c;
    public final int d;

    public fvah(fvao fvao0, gxsw gxsw0, int v, String s) {
        this.a = fvao0;
        this.b = gxsw0;
        this.d = v;
        this.c = s;
    }

    @Override  // glzm
    public final gmcd a() {
        ckcq ckcq0;
        gmcd gmcd0;
        gful_cronetEngineProvider gful0;
        gxsw gxsw2;
        gxsw gxsw0 = this.b;
        fvao fvao0 = this.a;
        if((gxsw0.b & 1) == 0) {
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gxsw0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)gxsw0));
            ProtoLiteBuilder hftp3 = fvao.c();
            if(!((gxsv)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gxsv)hftp2))).ensureMutable();
            }
            gxsw gxsw3 = (gxsw)((gxsv)hftp2).b_message;
            gxsr gxsr1 = (gxsr)hftp3.N_build();
            gxsr1.getClass();
            gxsw3.c = gxsr1;
            gxsw3.b |= 1;
            gxsw2 = (gxsw)((ProtoLiteBuilder)(((gxsv)hftp2))).N_build();
        }
        else {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gxsw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gxsw0));
            ProtoLiteBuilder hftp1 = fvao.c();
            hftp1.X(((ProtoLiteMessage)(gxsw0.c == null ? gxsr.a : gxsw0.c)));
            if(!((gxsv)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gxsv)hftp0))).ensureMutable();
            }
            gxsw gxsw1 = (gxsw)((gxsv)hftp0).b_message;
            gxsr gxsr0 = (gxsr)hftp1.N_build();
            gxsr0.getClass();
            gxsw1.c = gxsr0;
            gxsw1.b |= 1;
            gxsw2 = (gxsw)((ProtoLiteBuilder)(((gxsv)hftp0))).N_build();
        }
        try {
            if(fvao0.e) {
                fvao0.a(gxsw2);
            }
            gful0 = fvao0.f;
            switch(this.d - 1) {
                case 1: {
                    ckcq0 = ckig.b;
                    goto label_52;
                }
                case 2: {
                    goto label_51;
                }
            }
        }
        catch(acse acse0) {
            gmcd0 = gmbu.h(new iapl(iapk.j.e(acse0)));
            goto label_73;
        }
        Network network0 = (Network)fvao0.g.mr();
        if(network0 == null) {
            fvao0.h = null;
            fvao0.i = null;
        }
        else if(network0.equals(fvao0.h)) {
            gful0 = new fvam(fvao0);
        }
        else {
            fvao0.h = network0;
            gfsx gfsx0 = gfsx.m(network0);
            fvao0.i = fvap.a(fvao0.c, fvao0.d, gfsx0).b();
            gful0 = new fvan(fvao0);
        }
        ckcq0 = ckii.b;
        goto label_52;
    label_51:
        ckcq0 = ckij.b;
    label_52:
        gxto gxto0 = (gxto)((gxto)((gxto)gful0.mr()).q(cmlp.a, ckcq0)).o(30L, TimeUnit.SECONDS);
        iakr iakr0 = gxto0.a;
        gRPCMethodDescriptor iaoj0 = gxtp.a;
        if(iaoj0 == null) {
            synchronized(gxtp.class) {
                iaoj0 = gxtp.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.location.voilatile.v1.VoilaTileService", "FindTiles");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gxsw.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gxsx.a));
                    iaoj0 = iaog0.build();
                    gxtp.a = iaoj0;
                }
            }
        }
        gmcd0 = ibjw.a(iakr0.a(iaoj0, gxto0.b), gxsw2);
    label_73:
        fvag fvag0 = new fvag(fvao0, this.c);
        return glyi.f(gmcd0, iapn.class, fvag0, gmap.a);
    }
}

