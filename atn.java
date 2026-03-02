import java.util.LinkedHashSet;

public final class atn implements Runnable {
    public final LinkedHashSet a;
    public final int b;

    public atn(LinkedHashSet linkedHashSet0, int v) {
        this.a = linkedHashSet0;
        this.b = v;
    }

    @Override
    public final void run() {
        for(Object object0: this.a) {
            ((avp)object0).p(this.b);
        }
    }
}

