import android.content.Context;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.Iterator;

final class arjc implements gmbg {
    final asbl a;
    final arjh b;

    public arjc(arjh arjh0, asbl asbl0) {
        this.a = asbl0;
        Objects.requireNonNull(arjh0);
        this.b = arjh0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        arjh.p.g("Failed to get data flavor summary list", throwable0, new Object[0]);
        arjh.p.h("Initiating data flavor summary list generation", new Object[0]);
        bbic.a().b(this.b.b, this.b.q);
        arjb arjb0 = new arjb(this, this.a);
        this.b.o(true, arjb0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ProtoLiteBuilder hftp1;
        aree aree0;
        aqql aqql0 = arjh.p;
        aqql0.d("Successfully got data flavor summary list", new Object[0]);
        arjh arjh0 = this.b;
        int v = arjh0.H;
        aqql aqql1 = aree.a;
        aqql1.d("Updating flavor summary list", new Object[0]);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((asbo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((asbo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbl asbl0 = this.a;
        ((asbo)hftp0.b_message).c = hfvv.a;
        ggeo ggeo0 = (ggeo)Collection.-EL.stream(((asbo)object0).c).collect(ggaf.b(new areb(), new arec()));
        Iterator iterator0 = asbl0.b.iterator();
        while(true) {
            aree0 = arjh0.t;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            asbk asbk0 = (asbk)object1;
            arqo arqo0 = aree0.d.a(asbk0);
            if(ggeo0.containsKey((aqfx.b(asbk0.d) == null ? aqfx.a : aqfx.b(asbk0.d)))) {
                asbn asbn0 = (asbn)ggeo0.get((aqfx.b(asbk0.d) == null ? aqfx.a : aqfx.b(asbk0.d)));
                hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)asbn0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)asbn0));
            }
            else {
                hftp1 = ((ProtoLiteMessage)asbn.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbn asbn1 = (asbn)hftp1.b_message;
                asbk0.getClass();
                asbn1.c = asbk0;
                asbn1.b |= 1;
                hftp1.cV(arqo0.c());
            }
            if(aree0.a(asbl0, asbk0, arqo0)) {
                aqql1.h("Updating photos for hybrid media restore", new Object[0]);
                ((arqx)arqo0).h(aree0.c, hftp0, hftp1);
            }
            asbm asbm0 = arqo0.k();
            if(!((ProtoLiteMessage)asbm0).equals(asbm.a)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbn asbn2 = (asbn)hftp1.b_message;
                asbm0.getClass();
                asbn2.e = asbm0;
                asbn2.b |= 4;
            }
            aqql1.j("Final flavor summary %s with %d items", new Object[]{asbk0.c, ((asbn)hftp1.b_message).d.size()});
            hftp0.dk(hftp1);
        }
        aree0.d(hftp0, v);
        asbo asbo0 = (asbo)hftp0.N_build();
        aqql0.j("Sending flavor summary list", new Object[0]);
        arjh0.g(((MessageLite)asbo0));
        Context context0 = arjh0.b;
        bbic.a().b(context0, arjh0.q);
    }
}

