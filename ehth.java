import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ehth implements Consumer {
    public final ProtoLiteBuilder a;

    public ehth(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwpa gwpa0 = (gwpa)hftp0.b_message;
        ((String)object0).getClass();
        gwpa0.b |= 1;
        gwpa0.d = (String)object0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

