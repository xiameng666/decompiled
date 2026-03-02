import j..util.Objects;
import java.util.HashSet;
import java.util.Iterator;

final class gyjr implements Runnable {
    final gyjz a;

    public gyjr(gyjz gyjz0) {
        Objects.requireNonNull(gyjz0);
        this.a = gyjz0;
        super();
    }

    @Override
    public final void run() {
        HashSet hashSet0 = new HashSet(this.a.f);
        Iterator iterator0 = this.a.e.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            gyjy gyjy0 = (gyjy)object0;
            for(Object object1: hashSet0) {
                gyjv gyjv0 = (gyjv)object1;
                if(gyjy0.c(gyjv0)) {
                    goto label_20;
                }
                synchronized(gyjy0.d.c) {
                    gyjy gyjy1 = (gyjy)gyjy0.d.c.get(gyjv0);
                }
                if(gyjy1 == null || !gyjy1.c(gyjv0)) {
                    continue;
                }
                goto label_20;
            }
            iterator0.remove();
            gyjy0.run();
        label_20:
            hashSet0.add(gyjy0.a);
        }
    }
}

