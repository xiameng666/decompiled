import java.util.LinkedHashSet;

public final class atm implements Runnable {
    public final LinkedHashSet a;

    public atm(LinkedHashSet linkedHashSet0) {
        this.a = linkedHashSet0;
    }

    @Override
    public final void run() {
        for(Object object0: this.a) {
            avp avp0 = (avp)object0;
            avp0.g(avp0);
        }
    }
}

