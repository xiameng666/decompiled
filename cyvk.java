import java.util.List;

public final class cyvk implements kar {
    public final ProtoLiteBuilder a;

    public cyvk(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cyxn)hftp0.b_message).b = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cyxn cyxn0 = (cyxn)hftp0.b_message;
        cyxn0.c();
        hfrj.E(((List)object0), cyxn0.b);
    }
}

