import j..util.Optional;
import java.util.concurrent.TimeUnit;

public final class fxes implements fxfj {
    public final fxfk a;
    public final Optional b;
    public final fxfo c;
    public final fxfo d;
    public final fxfo e;
    public final gxoj f;
    public final int g;
    public final int h;
    public final baqr i;

    public fxes(fxfk fxfk0, Optional optional0, fxfo fxfo0, fxfo fxfo1, fxfo fxfo2, gxoj gxoj0, int v, int v1, baqr baqr0) {
        this.a = fxfk0;
        this.b = optional0;
        this.c = fxfo0;
        this.d = fxfo1;
        this.e = fxfo2;
        this.f = gxoj0;
        this.g = v;
        this.h = v1;
        this.i = baqr0;
    }

    @Override  // fxfj
    public final void a() {
        fxfk fxfk0 = this.a;
        if(fxfk0.o == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxoz.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = fxfk0.y(this.b, fxfk0.p);
        gxpg gxpg0 = this.c.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxor gxor0 = (gxor)hftp1.b_message;
        gxpg0.getClass();
        gxor0.i = gxpg0;
        gxor0.b |= 16;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoz gxoz0 = (gxoz)hftp0.b_message;
        gxor gxor1 = (gxor)hftp1.N_build();
        gxor1.getClass();
        gxoz0.e = gxor1;
        gxoz0.b |= 4;
        gxpg gxpg1 = this.d.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoz gxoz1 = (gxoz)hftp0.b_message;
        gxpg1.getClass();
        gxoz1.d = gxpg1;
        gxoz1.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxpc.a).v_newBuilder();
        gxpg gxpg2 = this.e.a();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        gxpg2.getClass();
        ((gxpc)hftv0).c = gxpg2;
        ((gxpc)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        gxoj gxoj0 = this.f;
        ProtoLiteMessage hftv1 = hftp2.b_message;
        gxoj0.getClass();
        ((gxpc)hftv1).d = gxoj0;
        ((gxpc)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gxpc)hftv2).e = this.g;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gxpc)hftp2.b_message).f = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoz gxoz2 = (gxoz)hftp0.b_message;
        gxpc gxpc0 = (gxpc)hftp2.N_build();
        gxpc0.getClass();
        gxoz2.c = gxpc0;
        gxoz2.b |= 1;
        ByteString hfsf0 = ((gxoz)hftp0.N_build()).getDefaultInstanceForType();
        gxpa gxpa0 = gxpa.a;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gxpa0).v_newBuilder();
        ByteString hfsf1 = fxfk0.o.a;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        hfsf1.getClass();
        ((gxpa)hftv3).b = hfsf1;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gxpa)hftp3.b_message).c = hfsf0;
        if(huwe.i()) {
            String s = fxfk0.j.a("NodeTriggeringGuarded", hfsf0);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gxpa gxpa1 = (gxpa)hftp3.b_message;
            s.getClass();
            gxpa1.d = s;
        }
        gxpa gxpa2 = (gxpa)hftp3.N_build();
        if(((ProtoLiteMessage)gxoj0).isImmutable()) {
            int v = ((ProtoLiteMessage)gxoj0).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else if((gxoj0.memoizedSerializedSize & 0x7FFFFFFF) == 0x7FFFFFFF) {
            int v1 = ((ProtoLiteMessage)gxoj0).t(null);
            if(v1 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v1);
            }
            gxoj0.memoizedSerializedSize = v1 | gxoj0.memoizedSerializedSize & 0x80000000;
        }
        if(((ProtoLiteMessage)gxpa2).isImmutable()) {
            int v2 = ((ProtoLiteMessage)gxpa2).t(null);
            if(v2 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v2);
            }
        }
        else if((gxpa2.memoizedSerializedSize & 0x7FFFFFFF) == 0x7FFFFFFF) {
            int v3 = ((ProtoLiteMessage)gxpa2).t(null);
            if(v3 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v3);
            }
            gxpa2.memoizedSerializedSize = v3 | gxpa2.memoizedSerializedSize & 0x80000000;
        }
        fxfp fxfp0 = fxfk0.k;
        long v4 = fxfp0.b();
        cnto cnto0 = new cnto(fxfk0.i, cmlp.a, ckdn.b);
        if(cnto.c == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gxpa0));
            ibjh ibjh1 = new ibjh(((MessageLite)gxpb.a));
            cnto.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.android.location.quake.v1.QuakeApiService/NodeTriggering", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        gxpb gxpb0 = (gxpb)cnto0.e.callUnaryWithAuth(cnto.c, this.i, gxpa2, ((long)cnto.a), TimeUnit.MILLISECONDS, cnto0.f);
        fxfp0.e(((int)(fxfp0.b() - v4)), (gxpb0.b == null ? gxph.a : gxpb0.b));
    }
}

