import j..util.Objects;
import java.util.ArrayList;

final class iayz implements Runnable {
    final iapk a;
    final iazk b;

    public iayz(iazk iazk0, iapk iapk0) {
        this.a = iapk0;
        Objects.requireNonNull(iazk0);
        this.b = iazk0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList(this.b.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ibbs)arrayList0.get(v1)).q(this.a);
        }
    }
}

