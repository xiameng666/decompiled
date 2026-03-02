import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

public final class esco implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlna.a).v_newBuilder();
        int v = (int)(((Integer)((Map.Entry)object0).getKey()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlna hlna0 = (hlna)hftp0.b_message;
        hlna0.b |= 1;
        hlna0.c = v;
        int v1 = ((AtomicLong)((Map.Entry)object0).getValue()).intValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlna hlna1 = (hlna)hftp0.b_message;
        hlna1.b |= 2;
        hlna1.d = v1;
        return (hlna)hftp0.N_build();
    }
}

