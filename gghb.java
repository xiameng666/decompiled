import java.util.Iterator;

public final class gghb implements Iterator {
    private final Iterator a;
    private boolean b;
    private Object c;

    public gghb(Iterator iterator0) {
        gftb.check(iterator0);
        this.a = iterator0;
    }

    public final Object a() {
        if(!this.b) {
            Object object0 = this.a.next();
            this.c = object0;
            this.b = true;
        }
        return this.c;
    }

    @Override
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.b) {
            return this.a.next();
        }
        Object object1 = this.c;
        this.b = false;
        this.c = null;
        return object1;
    }

    @Override
    public final void remove() {
        gftb.r(((boolean)(this.b ^ 1)), "Can\'t remove after you\'ve peeked at next");
        this.a.remove();
    }
}

