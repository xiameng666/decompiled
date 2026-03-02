import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class dmts implements Consumer {
    public final ProtoLiteBuilder a;

    public dmts(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dxeo dxeo0 = (dxeo)hftp0.b_message;
        ((dxev)object0).getClass();
        dxeo0.b();
        dxeo0.b.add(((dxev)object0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

