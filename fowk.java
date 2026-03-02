import java.util.concurrent.atomic.AtomicReference;

public final class fowk {
    static final gdqd a;
    public final AtomicReference b;
    final AtomicReference c;

    static {
        fowk.a = new gdqd();
    }

    fowk() {
        this.b = new AtomicReference();
        this.c = new AtomicReference();
    }

    public static fowk a(gged_interceptors gged0) {
        fowk fowk0;
        int v = 0;
        do {
            fowk0 = null;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            gdqg gdqg0 = (gdqg)gged0.get(v);
            gdqc gdqc0 = gdqg.b(fowk.a, gdqg0, gdsq.a);
            if(gdqc0.b()) {
                fowk0 = (fowk)gdqc0.a();
            }
            ++v;
        }
        while(fowk0 == null);
        return fowk0;
    }
}

