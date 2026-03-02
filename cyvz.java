import java.util.List;

public final class cyvz implements Runnable {
    public final cywc a;

    public cyvz(cywc cywc0) {
        this.a = cywc0;
    }

    @Override
    public final void run() {
        List list0 = this.a.a.getActivePlaybackConfigurations();
        ibuq.e(list0, "getActivePlaybackConfigurations(...)");
        this.a.c = cywc.a(list0);
    }
}

