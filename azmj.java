import j..util.DesugarCollections;
import j..util.Map.-EL;
import j..util.Optional;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class azmj implements azmc, azmd {
    private final Map a;

    public azmj() {
        this.a = new HashMap();
    }

    public azmj(int v) {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put(Integer.valueOf(v), Long.valueOf(1L));
    }

    @Override  // azmc
    public final azii a() {
        gftb.r(((boolean)(this.a.isEmpty() ^ 1)), "Log time aggregation requires this class be constructed with at least one bucket.");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azii.a).v_newBuilder();
        azik azik0 = (azik)((ProtoLiteMessage)azil.a).v_newBuilder();
        azik0.a(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azii azii0 = (azii)hftp0.b_message;
        azil azil0 = (azil)((ProtoLiteBuilder)azik0).N_build();
        azil0.getClass();
        azii0.c = azil0;
        azii0.b = 2;
        return (azii)hftp0.N_build();
    }

    @Override  // azmc
    public final Optional b(azii azii0) {
        gftb.r(((boolean)(this.a.isEmpty() ^ 1)), "Log time aggregation requires this class be constructed with at least one bucket.");
        HashMap hashMap0 = new HashMap(DesugarCollections.unmodifiableMap((azii0.b == 2 ? ((azil)azii0.c) : azil.a).b));
        for(Object object0: this.a.entrySet()) {
            Map.-EL.merge(hashMap0, ((Integer)((Map.Entry)object0).getKey()), ((Long)((Map.Entry)object0).getValue()), new azmi());
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)azii0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)azii0));
        azik azik0 = (azik)((ProtoLiteMessage)azil.a).v_newBuilder();
        azik0.a(hashMap0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azii azii1 = (azii)hftp0.b_message;
        azil azil0 = (azil)((ProtoLiteBuilder)azik0).N_build();
        azil0.getClass();
        azii1.c = azil0;
        azii1.b = 2;
        return Optional.of(((azii)hftp0.N_build()));
    }

    @Override  // azmd
    public final azii c(azii azii0, azii azii1) {
        HashMap hashMap0 = new HashMap(DesugarCollections.unmodifiableMap((azii0.b == 2 ? ((azil)azii0.c) : azil.a).b));
        for(Object object0: DesugarCollections.unmodifiableMap((azii1.b == 2 ? ((azil)azii1.c) : azil.a).b).entrySet()) {
            Map.-EL.merge(hashMap0, ((Integer)((Map.Entry)object0).getKey()), ((Long)((Map.Entry)object0).getValue()), new azmh());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azii.a).v_newBuilder();
        azik azik0 = (azik)((ProtoLiteMessage)azil.a).v_newBuilder();
        azik0.a(hashMap0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azii azii2 = (azii)hftp0.b_message;
        azil azil0 = (azil)((ProtoLiteBuilder)azik0).N_build();
        azil0.getClass();
        azii2.c = azil0;
        azii2.b = 2;
        return (azii)hftp0.N_build();
    }
}

