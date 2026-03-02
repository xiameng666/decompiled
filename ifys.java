import java.nio.channels.Channels;

public final class ifys implements igad {
    public final ifyw a;

    public ifys(ifyw ifyw0) {
        this.a = ifyw0;
    }

    @Override  // igad
    public final void a() {
        ifyw ifyw0 = this.a;
        if(ifyw0.i == null) {
            ifyw0.k.l = 10;
            ifyw0.h.setDoOutput(true);
            ifyw0.h.connect();
            ifyw0.k.l = 12;
            ifyw0.j = ifyw0.h.getOutputStream();
            ifyw0.i = Channels.newChannel(ifyw0.j);
        }
        ifyw0.a.set(0);
        ifyw0.b();
    }
}

