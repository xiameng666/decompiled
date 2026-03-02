import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class fxey implements Consumer {
    public final ProtoLiteBuilder a;

    public fxey(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        hfst hfst0 = (hfst)((Supplier)object0).get();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxor gxor0 = (gxor)hftp0.b_message;
        hfst0.getClass();
        gxor0.p = hfst0;
        gxor0.b |= 0x800;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

