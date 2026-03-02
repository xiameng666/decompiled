import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class aalt implements zha {
    public final aamn a;

    public aalt(aamn aamn0) {
        this.a = aamn0;
    }

    @Override  // zha
    public final Object a(Object object0, Object object1, Object object2) {
        Object object3 = new ArrayList();
        for(Object object4: ((List)object0)) {
            grxr grxr0 = (grxr)object4;
            if((grxr0.e == null ? grxw.a : grxr0.e).c != 0) {
                switch(grxr0.c) {
                    case 8: {
                        grvb grvb0 = (grvb)grxr0.d;
                        if(grvb0.b == 2) {
                            grxm grxm0 = (grxm)grvb0.c;
                            ggdy ggdy0 = new ggdy();
                            for(Object object5: grxm0.c) {
                                grxr grxr1 = (grxr)((Map)object1).get(((grxw)object5));
                                if(grxr1 != null) {
                                    switch(grxr1.c) {
                                        case 17: {
                                            zjo zjo0 = (zjo)((ggeo)object2).get((grxr1.e == null ? grxw.a : grxr1.e));
                                            if(zjo0 == null) {
                                                if(!grxr1.g) {
                                                    ggdy0.i(grxr1);
                                                    continue;
                                                }
                                                continue;
                                            }
                                            else if(zjo0.d != 2) {
                                                continue;
                                            }
                                            ggdy0.i(grxr1);
                                            continue;
                                        }
                                        case 1000: {
                                            break;
                                        }
                                        default: {
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            gged_interceptors gged0 = ggdy0.h();
                            if(gged0.isEmpty()) {
                                continue;
                            }
                            aamn aamn0 = this.a;
                            ((List)object3).add(new aamh((grxr0.e == null ? grxw.a : grxr0.e), (grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a), gged_interceptors.i(gged0)));
                            if(aamn0.o) {
                                continue;
                            }
                            aamn0.o = true;
                            int v = ((ggna)gged0).c;
                            for(int v1 = 0; v1 < v; ++v1) {
                                grxr grxr2 = (grxr)gged0.get(v1);
                                aauf aauf0 = aamn0.b.l;
                                grxw grxw0 = grxr2.e == null ? grxw.a : grxr2.e;
                                hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
                                gqsp gqsp0 = gqsp.fI;
                                if(!hftr0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                                }
                                ((gqxs)hftr0.b_message).c = gqsp0.fJ;
                                ((gqxs)hftr0.b_message).b |= 1;
                                int v2 = grxw0.c;
                                if(!hftr0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                                }
                                gqxs gqxs0 = (gqxs)hftr0.b_message;
                                gqxs0.b |= 16;
                                gqxs0.g = v2;
                                gqvx gqvx0 = aauf0.a();
                                if(!hftr0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                                }
                                gqxs gqxs1 = (gqxs)hftr0.b_message;
                                gqvx0.getClass();
                                gqxs1.i = gqvx0;
                                gqxs1.b |= 0x80;
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqsn.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gqsn)hftp0.b_message).c = (int)0x7F1;
                                ((gqsn)hftp0.b_message).b = 5;
                                if(!hftr0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                                }
                                gqxs gqxs2 = (gqxs)hftr0.b_message;
                                gqsn gqsn0 = (gqsn)hftp0.N_build();
                                gqsn0.getClass();
                                gqxs2.d = gqsn0;
                                gqxs2.b |= 2;
                                gqxs gqxs3 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
                                int v3 = aamn0.a.a.c;
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gqxt gqxt0 = (gqxt)hftp1.b_message;
                                gqxs3.getClass();
                                gqxt0.c = gqxs3;
                                gqxt0.b |= 1;
                                aauf0.e(v3, ((gqxt)hftp1.N_build()));
                            }
                        }
                        else {
                            if((grvb0.b == 1 ? ((grzs)grvb0.c) : grzs.a).c.size() == 0 && (grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a).b != 10 && (!hoju.j() || (grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a).b != 12)) {
                                continue;
                            }
                            ((List)object3).add(new aamh((grxr0.e == null ? grxw.a : grxr0.e), (grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a), ggna.a));
                        }
                        continue;
                    }
                    case 1000: {
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                break;
            }
        }
        return object3;
    }
}

