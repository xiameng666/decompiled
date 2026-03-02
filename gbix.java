import java.util.ArrayList;
import java.util.List;

public final class gbix {
    public static final void a(gaym gaym0, List list0, gkwx gkwx0) {
        gkxd gkxd0;
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyk.b).v_newBuilder();
        ibuq.f(hftp0, "builder");
        new hfxu(new hfuh(((gkyk)hftp0.b_message).c, gkyk.a));
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            switch(((Number)object0).intValue()) {
                case 1: {
                    gkxd0 = gkxd.b;
                    break;
                }
                case 2: {
                    gkxd0 = gkxd.c;
                    break;
                }
                case 4: {
                    gkxd0 = gkxd.e;
                    break;
                }
                case 5: {
                    gkxd0 = gkxd.f;
                    break;
                }
                case 6: {
                    gkxd0 = gkxd.g;
                    break;
                }
                case 7: {
                    gkxd0 = gkxd.h;
                    break;
                }
                case 8: {
                    gkxd0 = gkxd.i;
                    break;
                }
                case 3: 
                case 9: {
                    gkxd0 = gkxd.d;
                    break;
                }
                case 10: {
                    gkxd0 = gkxd.j;
                    break;
                }
                default: {
                    gkxd0 = gkxd.a;
                }
            }
            arrayList0.add(gkxd0);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkyk gkyk0 = (gkyk)hftp0.b_message;
        hfuf hfuf0 = gkyk0.c;
        if(!hfuf0.c()) {
            gkyk0.c = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object1: arrayList0) {
            gkyk0.c.i(((gkxd)object1).k);
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkyk)hftv0), "value");
        ProtoLiteBuilder hftp1 = gkyx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp1.b_message;
        ((gkyk)hftv0).getClass();
        gkxt0.d = (gkyk)hftv0;
        gkxt0.c = 28;
        gkxt gkxt1 = gkyx0.a();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt1).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gkxt1));
        ibuq.e(hftp2, "toBuilder(...)");
        gaym0.f(hftp2);
    }
}

