import android.os.PersistableBundle;
import java.util.List;

public final class sdq implements sdv {
    public static final sdq a;
    private final scx b;

    static {
        sdq.a = new sdq(scz.k);
    }

    public sdq() {
        this(new sdp());
    }

    public sdq(scx scx0) {
        this.b = scx0;
    }

    public final PersistableBundle a(List list0) {
        ibuq.f(list0, "value");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("size", list0.size());
        int v = 0;
        for(Object object0: list0) {
            if(v < 0) {
                ibpo.m();
            }
            sde.c(persistableBundle0, "item_" + v, object0, this.b);
            ++v;
        }
        return persistableBundle0;
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return this.a(((List)object0));
    }
}

