import java.util.concurrent.atomic.AtomicInteger;

public final class aius implements gfsi {
    public final AtomicInteger a;
    public final String b;

    public aius(AtomicInteger atomicInteger0, String s) {
        this.a = atomicInteger0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ajaz ajaz0 = ((ajba)object0).c;
        if(ajaz0 == null) {
            ajaz0 = ajaz.a;
        }
        String s = this.b;
        s.getClass();
        Integer integer0 = (Integer)ajaz0.b.get(s);
        AtomicInteger atomicInteger0 = this.a;
        atomicInteger0.set((integer0 == null ? 0 : ((int)integer0)) + 1);
        ajaz ajaz1 = ((ajba)object0).c;
        if(ajaz1 == null) {
            ajaz1 = ajaz.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajaz1).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ajaz1));
        int v = atomicInteger0.get();
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajaz)hftp0.b_message).b().put(s, Integer.valueOf(v));
        ajaz ajaz2 = (ajaz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajba)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((ajba)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ajba ajba0 = (ajba)hftp1.b_message;
        ajaz2.getClass();
        ajba0.c = ajaz2;
        ajba0.b |= 1;
        return (ajba)hftp1.N_build();
    }
}

