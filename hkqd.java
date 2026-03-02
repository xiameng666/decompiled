import java.util.List;
import java.util.Locale;

public final class hkqd {
    public final gged_interceptors a;
    private static final ggqo b;

    static {
        hkqd.b = new ggqo(ggqq.a);
    }

    private hkqd(List list0) {
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "targetOriginStrings should be non empty.");
        ggqn ggqn0;
        boolean z;
        ggrb ggrb0;
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            gftb.b(((boolean)(((String)object0).isEmpty() ^ 1)), "Target origin string shouldn\'t be empty.");
            String s = ((String)object0).toLowerCase(Locale.getDefault());
            gged_interceptors gged0 = gged_interceptors.l(s);
            ggqp ggqp0 = new ggqp(((ggqq)hkqd.b.a));
            ggra ggra0 = new ggra(ggqp0);
            ggqk ggqk1 = gged0.E();
        alab1:
            while(true) {
                ggrb0 = null;
                z = false;
                if(!ggqk1.hasNext()) {
                    break;
                }
                Object object1 = ggqk1.next();
                Object object2 = ggqp0.apply(object1);
                int v = 0;
                while(v < ((glww)object2).c()) {
                    if((((glww)object2).a(v) & 0xFFFFFF80) == 0) {
                        ++v;
                        continue;
                    }
                    else {
                        ggra0 = null;
                        break alab1;
                    }
                    break;
                }
            }
            if(ggra0 == null) {
                int[] arr_v = new int[0x100];
                arr_v[0] = 1;
                ggqk ggqk2 = gged0.E();
            alab2:
                while(true) {
                    if(!ggqk2.hasNext()) {
                        ggrb0 = new ggrb(arr_v, ggqp0);
                        break;
                    }
                    Object object3 = ggqk2.next();
                    Object object4 = ggqp0.apply(object3);
                    for(int v1 = 0; v1 < ((glww)object4).c(); ++v1) {
                        int v2 = ((glww)object4).a(v1);
                        int v3 = v2 & 0xFF;
                        int v4 = arr_v[v3];
                        if(v4 != v2) {
                            if((v4 & 0xFF) == v3) {
                                break alab2;
                            }
                            else {
                                arr_v[v3] = v2;
                            }
                        }
                    }
                }
                if(ggrb0 == null) {
                    ggqv ggqv0 = new ggqv(ggqp0);
                    ggdj ggdj0 = new ggdj(3);
                    ggqw ggqw0 = new ggqw(ggdj0);
                    ggqk ggqk3 = gged0.E();
                    while(ggqk3.hasNext()) {
                        Object object5 = ggqk3.next();
                        ggqv0.a(object5, ggqw0);
                    }
                    ggra0 = new ggqy(new ggmg(ggdj0), ggqv0);
                }
                else {
                    ggra0 = ggrb0;
                }
            }
            glww glww0 = ggra0.b(s);
            int v5 = ggra0.a();
            switch(glww0.c()) {
                case 0: {
                    ggqn0 = ggqn.a;
                    break;
                }
                case 1: {
                    if(glww0.c() == 1) {
                        z = true;
                    }
                    gftb.f(z, "Expected seq of length 1, found ", glww0);
                    ggqn0 = new ggqm(glww0);
                    break;
                }
                default: {
                    ggqn0 = new ggqu(glww0, v5);
                }
            }
            ggdy0.i(new ggqs(ggra0, ggqn0));
        }
        this.a = ggdy0.h();
    }

    public static hkqd a(String s) {
        return new hkqd(gged_interceptors.l(s));
    }
}

