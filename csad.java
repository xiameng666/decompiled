import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class csad implements Consumer {
    public final ProtoLiteBuilder a;

    public csad(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        qhy qhy0 = (qhy)hftp0.b_message;
        ((String)object0).getClass();
        qhy0.d = (String)object0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

