import java.util.List;

public final class gxvb implements Runnable {
    public final List a;
    public final gxvn b;

    public gxvb(gxvn gxvn0, List list0) {
        this.b = gxvn0;
        this.a = list0;
    }

    @Override
    public final void run() {
        gxvn gxvn0 = this.b;
        if(gxvn0.a == null) {
            return;
        }
        gxvn0.b.a(this.a);
    }
}

