import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class tfa implements Iterator {
    boolean a;
    private Iterator b;
    private final Stack c;
    private tfe d;
    private final tfg e;

    public tfa(Iterator iterator0, tfg tfg0) {
        this.a = false;
        this.e = tfg0;
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
                tfe tfe0 = null;
                if(this.b == null || !this.b.hasNext()) {
                    return tfe0 != null;
                }
                Object object0 = this.b.next();
                tfe0 = (tfe)object0;
                tfg tfg0 = tfe0.a;
                if(tfg0.a()) {
                    this.c.push(this.b);
                    this.b = tfe0.iterator();
                }
                if(tfg0.equals(this.e)) {
                    this.d = tfe0;
                    this.a = true;
                    return tfe0 != null;
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
            throw new NoSuchElementException("no TlvObject with tag " + tjs.b(this.e.b()));
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

