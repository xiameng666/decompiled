import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;

final class fdpx extends ConcurrentHashMap {
    final fdpy a;

    public fdpx(fdpy fdpy0) {
        Objects.requireNonNull(fdpy0);
        this.a = fdpy0;
        super();
    }

    public final fezj a(Object object0) {
        fezj fezj0;
        synchronized(this) {
            fezj0 = (fezj)super.remove(object0);
            int v1 = this.size();
        }
        if(hzvs.e()) {
            fdpy fdpy0 = this.a;
            if(fdpy0.e != null && fdpy0.e.a()) {
                fetz fetz0 = fdpy0.e;
                if(v1 <= 0) {
                    fetz0.a.set(false);
                    fetz0.b.run();
                    fdpy0.e = null;
                }
            }
        }
        return fezj0;
    }

    @Override  // j$.util.concurrent.ConcurrentHashMap
    public final Object remove(Object object0) {
        return this.a(object0);
    }
}

