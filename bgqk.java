import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgqk implements Consumer {
    public final bgqs a;

    public bgqk(bgqs bgqs0) {
        this.a = bgqs0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxog)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxog)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxog)hftp0.b_message).e = true;
        gxog gxog0 = (gxog)hftp0.N_build();
        this.a.b(gxog0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

