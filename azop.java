import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class azop implements Consumer {
    public final ProtoLiteBuilder a;

    public azop(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        int v = (int)(((Integer)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((genu)hftp0.b_message).k = v;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

