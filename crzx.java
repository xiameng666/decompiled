import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class crzx implements Consumer {
    public final String a;
    public final ProtoLiteBuilder b;

    public crzx(ProtoLiteBuilder hftp0, String s) {
        this.b = hftp0;
        this.a = s;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)qib.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((qib)hftv0).b = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteBuilder hftp1 = this.b;
        qib qib0 = (qib)hftp0.b_message;
        ((String)object0).getClass();
        qib0.c = (String)object0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        qhx qhx0 = (qhx)hftp1.b_message;
        qib qib1 = (qib)hftp0.N_build();
        qib1.getClass();
        hfuo hfuo0 = qhx0.e;
        if(!hfuo0.c()) {
            qhx0.e = ProtoLiteMessage.E(hfuo0);
        }
        qhx0.e.add(qib1);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

