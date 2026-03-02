import java.util.Map;

public final class fekq implements Runnable {
    public final felm a;
    public final fczq b;
    public final int c;

    public fekq(felm felm0, fczq fczq0, int v) {
        this.a = felm0;
        this.b = fczq0;
        this.c = v;
    }

    @Override
    public final void run() {
        fejn fejn0 = this.a.m;
        if(fejn0 != null) {
            Map map0 = fejn0.a;
            String s = this.b.c;
            fczq fczq0 = (fczq)map0.get(s);
            if(fczq0 != null) {
                fekb fekb0 = (fekb)fejn0.b.get(s);
                if(fekb0 != null && (fejn0.c != null && fejn0.c.isEnabled())) {
                    fczq0.l = this.c;
                    map0.put(fczq0.c, fczq0);
                    fekb0.f(this.c);
                }
            }
        }
    }
}

