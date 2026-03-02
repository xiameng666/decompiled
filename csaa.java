import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class csaa implements Consumer {
    public final ProtoLiteBuilder a;

    public csaa(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        qhz qhz0 = (qhz)hftp0.b_message;
        ((String)object0).getClass();
        qhz0.c = (String)object0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

