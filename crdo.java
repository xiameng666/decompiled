import com.google.android.gms.measurement.internal.EventParams;
import j..util.Objects;
import java.util.Iterator;

public final class crdo implements Iterator {
    final Iterator a;
    final EventParams b;

    public crdo(EventParams eventParams0) {
        Objects.requireNonNull(eventParams0);
        this.b = eventParams0;
        super();
        this.a = eventParams0.a.keySet().iterator();
    }

    public final String a() {
        return this.a.next();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

