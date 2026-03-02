import j..util.DesugarCollections;
import java.util.Map.Entry;

public final class azdz implements gfsi {
    public final String a;
    public final ayvu b;

    public azdz(String s, ayvu ayvu0) {
        this.a = s;
        this.b = ayvu0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ayvv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ayvv)object0))));
        for(Object object1: DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ayvv)hftp0.b_message).b)).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(azea.b(((ayvu)map$Entry0.getValue()))) {
                String s = (String)map$Entry0.getKey();
                s.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ayvv)hftp0.b_message).b().remove(s);
            }
        }
        ayvu ayvu0 = this.b;
        ayvu0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ayvv)hftp0.b_message).b().put(this.a, ayvu0);
        return (ayvv)hftp0.N_build();
    }
}

