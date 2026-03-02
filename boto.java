import java.util.List;

public final class boto implements gfsi {
    public final boul a;
    public final hfwn b;
    public final List c;

    public boto(boul boul0, hfwn hfwn0, List list0) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqze.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqze fqze0 = (fqze)hftp0.b_message;
        hfuo hfuo0 = fqze0.d;
        if(!hfuo0.c()) {
            fqze0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.c, fqze0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqze fqze1 = (fqze)hftp0.b_message;
        hfwn0.getClass();
        fqze1.c = hfwn0;
        fqze1.b |= 1;
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqze fqze2 = (fqze)hftp0.N_build();
        fqze2.getClass();
        fqzl0.w = fqze2;
        fqzl0.b |= 0x8000;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}

