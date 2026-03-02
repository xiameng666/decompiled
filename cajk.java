import java.util.List;

public final class cajk implements evqf {
    public final List a;
    public final ProtoLiteBuilder b;

    public cajk(ProtoLiteBuilder hftp0, List list0) {
        this.b = hftp0;
        this.a = list0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        ProtoLiteBuilder hftp0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).i = 1;
        int v = this.a.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).h = v;
    }
}

