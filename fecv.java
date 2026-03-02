import j..util.function.Consumer.-CC;
import java.util.Set;
import java.util.function.Consumer;

public final class fecv implements Consumer {
    public final fecw a;
    public final String b;

    public fecv(fecw fecw0, String s) {
        this.a = fecw0;
        this.b = s;
    }

    @Override
    public final void accept(Object object0) {
        fecw fecw0 = this.a;
        fecw0.e.lock();
        String s = this.b;
        try {
            Set set0 = fecw0.d(s);
            if(set0.remove(((fdpl)object0))) {
                fecw0.f(s, set0);
            }
        }
        finally {
            fecw0.e.unlock();
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

