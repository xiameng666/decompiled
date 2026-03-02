import java.util.ArrayList;
import java.util.Set;

public final class fecu implements gfsi {
    public final Set a;
    public final String b;

    public fecu(Set set0, String s) {
        this.a = set0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fexe)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fexe)object0))));
        String s = this.b;
        Set set0 = this.a;
        if(set0.isEmpty()) {
            s.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fexe)hftp0.b_message).b().remove(s);
            return (fexe)hftp0.N_build();
        }
        fexf fexf0 = (fexf)((ProtoLiteMessage)fexg.a).v_newBuilder();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: set0) {
            arrayList0.add(fedq.c(((fdpl)object1)));
        }
        fexf0.a(arrayList0);
        fexg fexg0 = (fexg)((ProtoLiteBuilder)fexf0).N_build();
        s.getClass();
        fexg0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fexe)hftp0.b_message).b().put(s, fexg0);
        return (fexe)hftp0.N_build();
    }
}

