import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class atyf {
    private static final avjh a;
    private final atyc b;
    private final Map c;

    static {
        atyf.a = new avjh("CastMR2PSAnalytics");
    }

    public atyf(atyc atyc0) {
        this.b = atyc0;
        this.c = new HashMap();
    }

    public final void a(List list0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            long v1 = System.currentTimeMillis();
            for(Object object0: list0) {
                String s = (String)object0;
                Map map0 = this.c;
                if(!map0.containsKey(s)) {
                }
                else if(v1 - ((long)(((Long)map0.get(s)))) <= 86400000L) {
                    continue;
                }
                arrayList0.add(s);
                map0.put(s, Long.valueOf(v1));
            }
            if(arrayList0.isEmpty()) {
                return;
            }
            atyf.a.n("logBindings Report: Package Names = %s", arrayList0.toString());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glaf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glaf glaf0 = (glaf)hftp0.b_message;
            hfuo hfuo0 = glaf0.b;
            if(!hfuo0.c()) {
                glaf0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, glaf0.b);
            glaf glaf1 = (glaf)hftp0.N_build();
            atyc atyc0 = this.b;
            glah glah0 = atyc0.b();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glaf1.getClass();
            glai0.ab = glaf1;
            glai0.c |= 0x4000000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bB);
        }
    }
}

