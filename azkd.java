import j..time.Duration;
import j..time.Instant;
import j..time.temporal.Temporal;
import j..util.Optional;
import java.util.function.Supplier;

public final class azkd implements Supplier {
    public final azke a;
    public final azkp b;
    public final Instant c;

    public azkd(azke azke0, azkp azkp0, Instant instant0) {
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
            azju0.f().b(azko.b(azkp0, ((Instant)object0)));
            return object0;
        }
        Optional optional1 = ((azko)optional0.get()).b;
        Optional optional2 = ((azko)optional0.get()).c;
        if(optional2.isPresent()) {
            if(Duration.between(((Temporal)optional2.get()), ((Temporal)object0)).compareTo(hfyg.c(hrcb.a.c().d())) > 0) {
                azju0.f().c(azko.b(azkp0, ((Instant)object0)));
                return object0;
            }
            azju0.f().c(azko.b(azkp0, ((Instant)optional1.orElse(object0))));
            return (Instant)optional1.orElse(object0);
        }
        if(optional1.isEmpty()) {
            azju0.f().c(azko.b(azkp0, ((Instant)object0)));
            return object0;
        }
        return optional1.get();
    }
}

