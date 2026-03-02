import java.util.List;

public final class ekto implements ibts {
    public final List a;

    public ekto(List list0) {
        this.a = list0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ekuk ekuk0 = (ekuk)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ekuk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ekuk ekuk1 = (ekuk)hftp0.b_message;
        hfuo hfuo0 = ekuk1.b;
        if(!hfuo0.c()) {
            ekuk1.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, ekuk1.b);
        return (ekuk)hftp0.N_build();
    }
}

