import java.util.concurrent.atomic.AtomicBoolean;

public class bxox extends lqi {
    public final AtomicBoolean a;

    public bxox() {
        this.a = new AtomicBoolean(false);
    }

    @Override  // lqd
    public final void g(lps lps0, lqj lqj0) {
        super.g(lps0, new bxow(this, lqj0));
    }

    @Override  // lqd
    public final void l(Object object0) {
        this.a.set(true);
        super.l(object0);
    }
}

