import com.google.android.gms.nearby.sharing.ContactFilter;

public final class dfwf implements Runnable {
    public final dfzz a;
    public final evqp b;
    public final ContactFilter c;

    public dfwf(dfzz dfzz0, evqp evqp0, ContactFilter contactFilter0) {
        this.a = dfzz0;
        this.b = evqp0;
        this.c = contactFilter0;
    }

    @Override
    public final void run() {
        Integer integer0 = this.a.ae.a(this.c);
        this.b.b(integer0);
    }
}

