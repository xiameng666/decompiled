import j..util.DesugarCollections;
import java.util.Map;

public final class gqgv {
    public static final void a(gqhn gqhn0, ggeo ggeo0) {
        if(ggeo0.containsKey(((gqhr)gqhn0.b_message).c)) {
            gqic gqic0 = (gqic)ggeo0.get(((gqhr)gqhn0.b_message).c);
            Map map0 = DesugarCollections.unmodifiableMap(gqic0.b);
            if(!gqhn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gqhn0).ensureMutable();
            }
            gqhr gqhr0 = (gqhr)gqhn0.b_message;
            hfvh hfvh0 = gqhr0.g;
            if(!hfvh0.b) {
                gqhr0.g = hfvh0.a();
            }
            gqhr0.g.putAll(map0);
            gqhl gqhl0 = gqic0.c == null ? gqhl.a : gqic0.c;
            if(!gqhn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gqhn0).ensureMutable();
            }
            gqhr gqhr1 = (gqhr)gqhn0.b_message;
            gqhl0.getClass();
            gqhr1.h = gqhl0;
            gqhr1.b |= 1;
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqhl.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqhi.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqhx.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gqhx)hftp2.b_message).b = 0;
        float f = (float)huli.b();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqhx gqhx0 = (gqhx)hftp2.b_message;
        hfue hfue0 = gqhx0.c;
        if(!hfue0.c()) {
            gqhx0.c = ProtoLiteMessage.B(hfue0);
        }
        gqhx0.c.h(f);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqhi gqhi0 = (gqhi)hftp1.b_message;
        gqhx gqhx1 = (gqhx)hftp2.N_build();
        gqhx1.getClass();
        gqhi0.c = gqhx1;
        gqhi0.b = 2;
        gqhi gqhi1 = (gqhi)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqhl gqhl1 = (gqhl)hftp0.b_message;
        gqhi1.getClass();
        gqhl1.e = gqhi1;
        gqhl1.b |= 1;
        if(!gqhn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhn0).ensureMutable();
        }
        gqhr gqhr2 = (gqhr)gqhn0.b_message;
        gqhl gqhl2 = (gqhl)hftp0.N_build();
        gqhl2.getClass();
        gqhr2.h = gqhl2;
        gqhr2.b |= 1;
        if(!gqhn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhn0).ensureMutable();
        }
        ((gqhr)gqhn0.b_message).i = true;
    }

    public static final int[] b(int v) {
        float f = (float)huli.a.e().e();
        float f1 = (float)huli.a.e().h();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = Math.round(((float)(((double)f1) * (Math.pow(f, v1) * ((double)(1.0f - f)) / (1.0 - Math.pow(f, v))))));
        }
        return arr_v;
    }
}

