import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqra implements Consumer {
    public final ProtoLiteBuilder a;

    public cqra(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzi hgzi0 = (hgzi)hftp0.b_message;
        ((hgzc)object0).getClass();
        hgzi0.f = (hgzc)object0;
        hgzi0.b |= 16;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

