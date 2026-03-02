import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

public final class flmd implements Callable {
    public final flmu a;
    public final ContactId b;

    public flmd(flmu flmu0, ContactId contactId0) {
        this.a = flmu0;
        this.b = contactId0;
    }

    @Override
    public final Object call() {
        flmu flmu0 = this.a;
        ContactId contactId0 = this.b;
        long v = flmu0.c(contactId0);
        if(v == -1L) {
            fmen fmen0 = fmeo.a();
            fmen0.c(contactId0);
            fmen0.d(-1L);
            fmen0.i(ggna.a);
            v = flmu0.h(fmen0.a());
        }
        return v;
    }
}

