import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fxet implements Consumer {
    public final fxfk a;
    public final ProtoLiteBuilder b;

    public fxet(fxfk fxfk0, ProtoLiteBuilder hftp0) {
        this.a = fxfk0;
        this.b = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxoy.a).v_newBuilder();
        double f = ((gxnv)object0).e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gxoy)hftv0).b = f;
        double f1 = ((gxnv)object0).f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gxoy)hftv1).c = f1;
        double f2 = ((gxnv)object0).g;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gxoy)hftv2).d = f2;
        double f3 = ((gxnv)object0).h;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteBuilder hftp1 = this.b;
        ((gxoy)hftp0.b_message).e = f3;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxor gxor0 = (gxor)hftp1.b_message;
        gxoy gxoy0 = (gxoy)hftp0.N_build();
        gxoy0.getClass();
        gxor0.g = gxoy0;
        int v = 4;
        gxor0.b |= 4;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxop.a).v_newBuilder();
        gxnr gxnr0 = ((gxnv)object0).i;
        float f4 = (float)gxnr0.h;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gxop)hftv3).b = f4;
        float f5 = (float)gxnr0.i;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gxop)hftp2.b_message).c = f5;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxor gxor1 = (gxor)hftp1.b_message;
        gxop gxop0 = (gxop)hftp2.N_build();
        gxop0.getClass();
        gxor1.h = gxop0;
        gxor1.b |= 8;
        if(huwd.a.n().aB()) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gxpk.a).v_newBuilder();
            boolean z = ((gxnv)object0).b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp3.b_message;
            ((gxpk)hftv4).b = z;
            boolean z1 = ((gxnv)object0).c;
            if(!hftv4.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp3.b_message;
            ((gxpk)hftv5).c = z1;
            boolean z2 = ((gxnv)object0).j.h;
            if(!hftv5.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gxpk)hftp3.b_message).d = z2;
            switch(((int)(((Integer)this.a.l.get())))) {
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    v = 5;
                }
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp3.b_message;
            ((gxpk)hftv6).e = v - 2;
            boolean z3 = ((gxnv)object0).d;
            if(!hftv6.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gxpk)hftp3.b_message).f = z3;
            gxpk gxpk0 = (gxpk)hftp3.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gxor gxor2 = (gxor)hftp1.b_message;
            gxpk0.getClass();
            gxor2.r = gxpk0;
            gxor2.b |= 0x2000;
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

