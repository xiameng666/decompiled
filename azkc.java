import j..time.Instant;
import j..util.Optional;
import java.util.function.Supplier;

public final class azkc implements Supplier {
    public final azke a;
    public final azkp b;
    public final Instant c;

    public azkc(azke azke0, azkp azkp0, Instant instant0) {
        this.a = azke0;
        this.b = azkp0;
        this.c = instant0;
    }

    @Override
    public final Object get() {
        azju azju0 = this.a.a;
        azkn azkn0 = azju0.f();
        azkp azkp0 = this.b;
        Optional optional0 = azkn0.a(azkp0);
        Object object0 = this.c;
        if(optional0.isEmpty()) {
            azju0.f().b(new azko(azkp0, Optional.empty(), Optional.of(object0)));
            return object0;
        }
        Optional optional1 = ((azko)optional0.get()).c;
        if(optional1.isEmpty()) {
            azju0.f().c(new azko(azkp0, ((azko)optional0.get()).b, Optional.of(object0)));
            return object0;
        }
        return optional1.get();
    }
}

