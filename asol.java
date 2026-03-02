import java.util.concurrent.Callable;

public final class asol implements Callable {
    public final asom a;

    public asol(asom asom0) {
        this.a = asom0;
    }

    @Override
    public final Object call() {
        int v = ((asxl)this.a.a).h(this.a.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccnn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ccnn)hftp0.b_message).c = v - 2;
        ccnn ccnn0 = (ccnn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ccnw.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ccnw ccnw0 = (ccnw)hftp1.b_message;
        ccnn0.getClass();
        ccnw0.c = ccnn0;
        ccnw0.b = 2;
        return (ccnw)hftp1.N_build();
    }
}

