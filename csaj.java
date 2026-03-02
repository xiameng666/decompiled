import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class csaj implements Consumer {
    public final ProtoLiteBuilder a;

    public csaj(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        qhv qhv0 = (qhv)hftp0.b_message;
        ((String)object0).getClass();
        qhv0.e = (String)object0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

