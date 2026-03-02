import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class dvgp implements Consumer {
    public final ProtoLiteBuilder a;

    public dvgp(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guxu guxu0 = (guxu)hftp0.b_message;
        ((gvcd)object0).getClass();
        guxu0.d = (gvcd)object0;
        guxu0.b |= 1;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

