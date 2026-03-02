import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class atfz implements Consumer {
    public final ProtoLiteBuilder a;

    public atfz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        int v = (int)(((Integer)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arao arao0 = (arao)hftp0.b_message;
        arao0.b |= 4;
        arao0.e = v;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

