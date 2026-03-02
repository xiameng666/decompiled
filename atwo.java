import java.util.Set;

public final class atwo implements Runnable {
    public final atxp a;
    public final int b;
    public final Set c;

    public atwo(atxp atxp0, int v, Set set0) {
        this.a = atxp0;
        this.b = v;
        this.c = set0;
    }

    @Override
    public final void run() {
        atxp atxp0 = this.a;
        boolean z = ((Boolean)atxp0.b.mr()).booleanValue();
        int v = this.b;
        if(z && avjg.a(v)) {
            atxp0.d.c();
        }
        else {
            atxp0.d.b();
        }
        atxp0.i.c(this.c, v);
    }
}

