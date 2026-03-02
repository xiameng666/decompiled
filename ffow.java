import java.util.Map.Entry;
import java.util.Map;

public final class ffow implements gfsi {
    public final Map a;

    public ffow(Map map0) {
        this.a = map0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((igyu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((igyu)object0))));
        for(Object object1: this.a.entrySet()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)igyt.a).v_newBuilder();
            long v = (long)(((Long)((Map.Entry)object1).getKey()));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            igyt igyt0 = (igyt)hftp1.b_message;
            igyt0.b |= 1;
            igyt0.c = v;
            Iterable iterable0 = (Iterable)((Map.Entry)object1).getValue();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            igyt igyt1 = (igyt)hftp1.b_message;
            hfui hfui0 = igyt1.d;
            if(!hfui0.c()) {
                igyt1.d = ProtoLiteMessage.D(hfui0);
            }
            hfrj.E(iterable0, igyt1.d);
            igyt igyt2 = (igyt)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            igyu igyu0 = (igyu)hftp0.b_message;
            igyt2.getClass();
            hfuo hfuo0 = igyu0.g;
            if(!hfuo0.c()) {
                igyu0.g = ProtoLiteMessage.E(hfuo0);
            }
            igyu0.g.add(igyt2);
        }
        return (igyu)hftp0.N_build();
    }
}

