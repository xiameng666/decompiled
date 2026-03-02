import java.util.List;

public final class fndy {
    public static final gkct a(List list0) {
        ibuq.f(list0, "metadata");
        gkcq gkcq0 = (gkcq)((ProtoLiteMessage)gkct.a).v_newBuilder();
        for(Object object0: list0) {
            rno rno0 = (rno)object0;
            if((rno0 instanceof rnk)) {
                String s = ((rnk)rno0).a.a;
                boolean z = ((rnk)rno0).b;
                Boolean.valueOf(z).getClass();
                if(!gkcq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gkcq0).ensureMutable();
                }
                gkct gkct0 = (gkct)gkcq0.b_message;
                hfvh hfvh0 = gkct0.c;
                if(!hfvh0.b) {
                    gkct0.c = hfvh0.a();
                }
                gkct0.c.put(s, Boolean.valueOf(z));
                continue;
            }
            if((rno0 instanceof rnl)) {
                gkcq0.a(((rnl)rno0).a.a, ((rnl)rno0).b.name());
                continue;
            }
            if((rno0 instanceof rnj)) {
                String s1 = ((rnj)rno0).a.a;
                long v = ((rnj)rno0).b;
                Long.valueOf(v).getClass();
                if(!gkcq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gkcq0).ensureMutable();
                }
                gkct gkct1 = (gkct)gkcq0.b_message;
                hfvh hfvh1 = gkct1.d;
                if(!hfvh1.b) {
                    gkct1.d = hfvh1.a();
                }
                gkct1.d.put(s1, Long.valueOf(v));
                continue;
            }
            if(!(rno0 instanceof rnm)) {
                if(!(rno0 instanceof rnn)) {
                    throw new ibnq();
                }
                gkcq0.a(((rnn)rno0).a.a, ((rnn)rno0).b);
                continue;
            }
            rnm rnm0 = (rnm)rno0;
            throw null;
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gkcq0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkct)hftv0;
    }
}

