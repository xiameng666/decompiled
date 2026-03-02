import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class sxz implements Iterator {
    boolean a;
    private Iterator b;
    private final Stack c;
    private syd d;
    private final syf e;

    public sxz(Iterator iterator0, syf syf0) {
        this.a = false;
        this.e = syf0;
        this.b = iterator0;
        this.c = new Stack();
    }

    @Override
    public final boolean hasNext() {
        Stack stack1;
        while(this.b != null && !this.b.hasNext()) {
            Stack stack0 = this.c;
            if(stack0.empty()) {
                break;
            }
            this.b = (Iterator)stack0.pop();
        }
        do {
            do {
                syd syd0 = null;
                if(this.b == null || !this.b.hasNext()) {
                    return syd0 != null;
                }
                Object object0 = this.b.next();
                syd0 = (syd)object0;
                syf syf0 = syd0.a;
                if(syf0.a()) {
                    this.c.push(this.b);
                    this.b = syd0.iterator();
                }
                if(syf0.equals(this.e)) {
                    this.d = syd0;
                    this.a = true;
                    return syd0 != null;
                }
            label_14:
            }
            while(this.b.hasNext());
            stack1 = this.c;
        }
        while(stack1.empty());
        this.b = (Iterator)stack1.pop();
        goto label_14;
    }

    @Override
    public final Object next() {
        if(this.d == null) {
            this.hasNext();
        }
        Object object0 = this.d;
        if(object0 == null) {
            throw new NoSuchElementException("no TlvObject with tag " + twz.b(this.e.b()));
        }
        this.a = true;
        this.d = null;
        return object0;
    }

    @Override
    public final void remove() {
        if(!this.a) {
            throw new IllegalStateException("Iterator is pointing to nonexistent or already removed element.");
        }
        this.b.remove();
        this.d = null;
        this.a = false;
    }
}

