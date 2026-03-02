import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class dvgo implements Consumer {
    public final ProtoLiteBuilder a;

    public dvgo(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guxu guxu0 = (guxu)hftp0.b_message;
        ((String)object0).getClass();
        guxu0.b |= 4;
        guxu0.g = (String)object0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

