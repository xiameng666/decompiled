import java.util.Iterator;

public final class bqpg implements glzn {
    @Override  // glzn
    public final gmcd a(Object object0) {
        ggdy ggdy0 = new ggdy();
        ggdy ggdy1 = new ggdy();
        Iterator iterator0 = ((hlgb)object0).b.iterator();
        while(iterator0.hasNext()) {
            int v = 3;
            Object object1 = iterator0.next();
            hlfg hlfg0 = (hlfg)object1;
            int v1 = hlfg0.b;
            switch(v1) {
                case 0: {
                    v = 4;
                    break;
                }
                case 1: {
                    v = 1;
                    break;
                }
                case 2: {
                    v = 2;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    v = 0;
                }
            }
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 0: {
                    ggdy0.i((v1 == 1 ? ((hldp)hlfg0.c) : hldp.a));
                    continue;
                }
                case 1: {
                    ggdy1.i(bqwb.c((v1 == 2 ? ((String)hlfg0.c) : "")));
                    continue;
                }
                case 2: {
                    return gmbu.h(new brqw());
                }
            }
            continue;
        }
        bqon bqon0 = new bqon();
        bqon0.a = ggdy0.h();
        bqon0.c = ggdy1.h();
        bqon0.f = ((hlgb)object0).c;
        bqon0.g = ((hlgb)object0).d ^ 1;
        return gmbu.i(new bqoo(bqon0));
    }
}

