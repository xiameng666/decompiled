import j..util.Optional;
import java.util.concurrent.TimeUnit;

public final class fxfa implements fxfj {
    public final fxfk a;
    public final Optional b;
    public final fxpi c;
    public final fxfo d;
    public final baqr e;

    public fxfa(fxfk fxfk0, Optional optional0, fxpi fxpi0, fxfo fxfo0, baqr baqr0) {
        this.a = fxfk0;
        this.b = optional0;
        this.c = fxpi0;
        this.d = fxfo0;
        this.e = baqr0;
    }

    @Override  // fxfj
    public final void a() {
        fxfk fxfk0 = this.a;
        if(fxfk0.o == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxos.a).v_newBuilder();
        fxdu fxdu0 = ((fxdv)fxfk0.n).a();
        ProtoLiteBuilder hftp1 = fxfk0.y(this.b, fxdu0);
        gxpd gxpd0 = fxfk0.v(this.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxor gxor0 = (gxor)hftp1.b_message;
        gxpd0.getClass();
        gxor0.m = gxpd0;
        gxor0.b |= 0x100;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxos gxos0 = (gxos)hftp0.b_message;
        gxor gxor1 = (gxor)hftp1.N_build();
        gxor1.getClass();
        gxos0.d = gxor1;
        gxos0.b |= 2;
        gxpg gxpg0 = this.d.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxos gxos1 = (gxos)hftp0.b_message;
        gxpg0.getClass();
        gxos1.c = gxpg0;
        gxos1.b |= 1;
        ByteString hfsf0 = ((gxos)hftp0.N_build()).getDefaultInstanceForType();
        gxot gxot0 = gxot.a;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxot0).v_newBuilder();
        ByteString hfsf1 = fxfk0.o.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        hfsf1.getClass();
        ((gxot)hftv0).b = hfsf1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gxot)hftp2.b_message).c = hfsf0;
        if(huwe.g()) {
            String s = fxfk0.j.a("NodeOfflineGuarded", hfsf0);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gxot gxot1 = (gxot)hftp2.b_message;
            s.getClass();
            gxot1.d = s;
        }
        gxot gxot2 = (gxot)hftp2.N_build();
        if(((ProtoLiteMessage)gxot2).isImmutable()) {
            int v = ((ProtoLiteMessage)gxot2).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else if((gxot2.memoizedSerializedSize & 0x7FFFFFFF) == 0x7FFFFFFF) {
            int v1 = ((ProtoLiteMessage)gxot2).t(null);
            if(v1 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v1);
            }
            gxot2.memoizedSerializedSize = v1 | gxot2.memoizedSerializedSize & 0x80000000;
        }
        fxfk0.o = null;
        fxfk0.x();
        cnto cnto0 = new cnto(fxfk0.i, cmlp.a, ckdl.b);
        if(cnto.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gxot0));
            ibjh ibjh1 = new ibjh(((MessageLite)gxou.a));
            cnto.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.android.location.quake.v1.QuakeApiService/NodeOffline", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        gxou gxou0 = (gxou)cnto0.e.callUnaryWithAuth(cnto.d, this.e, gxot2, ((long)cnto.a), TimeUnit.MILLISECONDS, cnto0.f);
    }
}

