import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fxer implements Consumer {
    public final fxfk a;
    public final long b;
    public final ProtoLiteBuilder c;

    public fxer(fxfk fxfk0, ProtoLiteBuilder hftp0, long v) {
        this.a = fxfk0;
        this.c = hftp0;
        this.b = v;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.c;
        hfst hfst0 = hfyf.k(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxpj gxpj0 = (gxpj)hftp0.b_message;
        hfst0.getClass();
        gxpj0.d = hfst0;
        gxpj0.b |= 2;
        gxpd gxpd0 = this.a.v(((fxpi)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxpj gxpj1 = (gxpj)hftp0.b_message;
        gxpd0.getClass();
        gxpj1.c = gxpd0;
        gxpj1.b |= 1;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

