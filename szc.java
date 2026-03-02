import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public final class szc implements Iterator {
    boolean a;
    private Iterator b;
    private final Stack c;
    private szg d;
    private final szi e;

    public szc(Iterator iterator0, szi szi0) {
        this.a = false;
        this.e = szi0;
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
                szg szg0 = null;
                if(this.b == null || !this.b.hasNext()) {
                    return szg0 != null;
                }
                Object object0 = this.b.next();
                szg0 = (szg)object0;
                szi szi0 = szg0.a;
                if(szi0.a()) {
                    this.c.push(this.b);
                    this.b = szg0.iterator();
                }
                if(szi0.equals(this.e)) {
                    this.d = szg0;
                    this.a = true;
                    return szg0 != null;
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
            throw new NoSuchElementException("no TlvObject with tag " + tek.b(this.e.b()));
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

