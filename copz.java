import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class copz implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((gfsx)object0).i()) {
            return new HashSet();
        }
        Map map0 = DesugarCollections.unmodifiableMap(((cogp)((gfsx)object0).d()).b);
        Object object1 = new HashSet();
        for(Object object2: map0.values()) {
            coga coga0 = ((cogs)object2).e;
            if(coga0 == null) {
                coga0 = coga.a;
            }
            int v = cofz.a(coga0.d) == 0 ? 1 : cofz.a(coga0.d);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hiqo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hiqo)hftp0.b_message).c = (v - 1 == 1 ? 24 : 1) - 1;
            ((hiqo)hftp0.b_message).b |= 1;
            ((Set)object1).add(((hiqo)hftp0.N_build()));
        }
        return object1;
    }
}

