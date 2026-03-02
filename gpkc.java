import j..util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;

public final class gpkc extends gpgz {
    public final gpgx a;
    public final List b;
    private final ConcurrentHashMap c;
    private final ConcurrentHashMap d;

    public gpkc(gpgx gpgx0, List list0) {
        super(gphm.a);
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.a = gpgx0;
        this.b = list0;
    }

    @Override  // gpgz
    public final iakr a(gphn gphn0) {
        String s = gphn0.a().a;
        ConcurrentHashMap concurrentHashMap0 = this.c;
        iakr iakr0 = (iakr)concurrentHashMap0.get(gphn0);
        if(iakr0 == null) {
            ConcurrentHashMap concurrentHashMap1 = this.d;
            iakr iakr1 = (iakr)concurrentHashMap1.get(s);
            if(iakr1 == null) {
                ggdy ggdy0 = new ggdy();
                ggdy0.i(gpky.a(new gpkb(this)));
                gpgx gpgx0 = this.a;
                if(gpgx0.e == null) {
                    ggdy0.i(new gpkd());
                }
                else {
                    ggdy0.i(new gpjt());
                    ggdy0.i(gpky.a(new gpjx()));
                }
                ggdy0.i(new gpjw());
                ggdy0.i(gpky.a(new gpjy()));
                ggdy0.i(gpky.a(new gpjz(this)));
                iakr1 = iala.c(new gpkr(s, gpgx0), ggdy0.h());
                iakr iakr2 = (iakr)concurrentHashMap1.putIfAbsent(s, iakr1);
                if(iakr2 != null) {
                    iakr1 = iakr2;
                }
            }
            iakr iakr3 = iala.c(iakr1, Arrays.asList(new iakw[]{gpky.a(new gpka(gphn0))}));
            iakr iakr4 = (iakr)concurrentHashMap0.putIfAbsent(gphn0, iakr3);
            return iakr4 == null ? iakr3 : iakr4;
        }
        return iakr0;
    }
}

