import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class fxeu implements Consumer {
    public final fxfk a;
    public final ProtoLiteBuilder b;

    public fxeu(fxfk fxfk0, ProtoLiteBuilder hftp0) {
        this.a = fxfk0;
        this.b = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        int v1;
        long v = ((long)(((Long)this.a.m.b.get()))) - ((fwqy)object0).c;
        this.a.m.b.get();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxpl.a).v_newBuilder();
        Supplier supplier0 = this.a.m.c;
        supplier0.get();
        Supplier supplier1 = this.a.m.d;
        supplier1.get();
        boolean z = ((fwqy)object0).e;
        if(((fwqy)object0).f) {
            v1 = 9;
        }
        else if(z) {
            v1 = 3;
        }
        else if(v < 0L) {
            v1 = 8;
        }
        else if(v < ((long)(((Long)supplier0.get())))) {
            v1 = 6;
        }
        else if(v < ((long)(((Long)supplier1.get())))) {
            v1 = 4;
        }
        else {
            v1 = v >= fxhe.a ? 7 : 5;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxpl)hftp0.b_message).d = v1 - 2;
        if(v < huwe.b()) {
            gxoq gxoq0 = ((fwqy)object0).d;
            if(gxoq0 == null) {
                gxoq0 = gxoq.a;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxpl gxpl0 = (gxpl)hftp0.b_message;
            gxoq0.getClass();
            gxpl0.c = gxoq0;
            gxpl0.b |= 1;
        }
        ProtoLiteBuilder hftp1 = this.b;
        gxpl gxpl1 = (gxpl)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxpj gxpj0 = (gxpj)hftp1.b_message;
        gxpl1.getClass();
        gxpj0.e = gxpl1;
        gxpj0.b |= 4;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

