import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ebig implements Consumer {
    public final ProtoLiteBuilder a;

    public ebig(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftdj ftdj0 = (ftdj)hftp0.b_message;
        ((hkay)object0).getClass();
        ftdj0.b();
        ftdj0.c.add(((hkay)object0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

