import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

@ibnh
public final class bwbs {
    public static final bboh a;
    private final bvwu b;
    private final bvww c;
    private final bvpc d;

    static {
        bwbs.a = bboh.b("UiFlow", bbcu.ff);
    }

    public bwbs(bvwu bvwu0, bvww bvww0, bvpc bvpc0) {
        this.b = bvwu0;
        this.c = bvww0;
        this.d = bvpc0;
    }

    public final void a(List list0) {
        bwbq bwbq0 = new bwbq();
        for(Object object0: list0) {
            hgmq hgmq0 = ((hgni)object0).d;
            if(hgmq0 == null) {
                hgmq0 = hgmq.a;
            }
            this.b(hgmq0, bwbq0);
            hgmq hgmq1 = ((hgni)object0).e;
            if(hgmq1 == null) {
                hgmq1 = hgmq.a;
            }
            this.b(hgmq1, bwbq0);
        }
        Set set0 = bwbq0.a;
        CountDownLatch countDownLatch0 = new CountDownLatch(bwbq0.b.size() + set0.size());
        for(Object object1: bwbq0.b) {
            bwbr bwbr0 = new bwbr(this.d, bvwg.b, ((String)object1));
            gmbu.t(tzt.a(txc.d(this.c.a).a(File.class).b(tyb.a).h(((String)object1))), new bwbp(this, ((String)object1), bwbr0, countDownLatch0), gmap.a);
        }
        for(Object object2: set0) {
            bwbr bwbr1 = new bwbr(this.d, bvwg.a, ((String)object2));
            qli qli0 = qkm.l(this.b.a, ((String)object2));
            qli0.d(new bwbn(bwbr1, countDownLatch0));
            qli0.c(new bwbo(((String)object2), bwbr1, countDownLatch0));
        }
    }

    private final void b(hgmq hgmq0, bwbq bwbq0) {
    alab1:
        switch(hgmp.a(hgmq0.e).ordinal()) {
            case 0: {
                for(Object object0: (hgmq0.e == 10 ? ((hgmk)hgmq0.f) : hgmk.a).d) {
                    this.b(((hgmq)object0), bwbq0);
                }
                return;
            }
            case 2: {
                if(!(hgmq0.e == 12 ? ((hgnm)hgmq0.f) : hgnm.a).d.isEmpty()) {
                    bwbq0.b.add((hgmq0.e == 12 ? ((hgnm)hgmq0.f) : hgnm.a).d);
                    return;
                }
                break;
            }
            case 3: {
                hgnh hgnh0 = hgmq0.e == 13 ? ((hgnh)hgmq0.f) : hgnh.a;
                switch((hgnf.a(hgnh0.b) == 0 ? 1 : hgnf.a(hgnh0.b)) - 2) {
                    case 1: {
                        bwbq0.b.add(hgnh0.c);
                        return;
                    }
                    case 3: {
                        bwbq0.a.add(hgnh0.c);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 5: {
                Iterator iterator1 = (hgmq0.e == 16 ? ((hgne)hgmq0.f) : hgne.a).b.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break alab1;
                    }
                    Object object1 = iterator1.next();
                    this.b(((hgmq)object1), bwbq0);
                }
            }
        }
    }
}

