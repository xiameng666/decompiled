import java.util.List;

public final class cywa implements Runnable {
    public final cywc a;
    public final List b;

    public cywa(cywc cywc0, List list0) {
        this.a = cywc0;
        this.b = list0;
    }

    @Override
    public final void run() {
        cywc cywc0 = this.a;
        boolean z = cywc.a(this.b);
        if(z != cywc0.c) {
            cywc0.c = z;
            cywr cywr0 = new cywr(cywc0.d.a);
            cywc0.d.a.g.execute(cywr0);
            cyjh.a.d().S("%s: isMusicActive state changed to %b", "ActivePlaybackMonitor", cywc0.c);
        }
    }
}

