import j..util.Objects;
import java.io.IOException;
import java.util.Locale;

final class aubb implements auad {
    final aubc a;

    public aubb(aubc aubc0) {
        Objects.requireNonNull(aubc0);
        this.a = aubc0;
        super();
    }

    @Override  // auad
    public final void a() {
    }

    @Override  // auad
    public final void b() {
        String s = avjg.a;
        aubc aubc0 = this.a;
        String s1 = String.format(Locale.ROOT, "{\"type\":\"CONNECT\",\"package\":\"%s\",\"origin\":{}}", aubc0.b);
        gehl gehl0 = auav.a(s, aubc0.c, s1);
        if(gehl0 != null) {
            aubc0.a.p("Send wakeup message to (ns=%s): %s", s, s1);
            try {
                aubc0.d.j(gehl0);
            }
            catch(IOException | IllegalStateException exception0) {
                aubc0.a.d("Failed to send wakeup message.", new Object[]{exception0});
                aubc0.a(2);
            }
        }
        this.a.a.m("wakeup socket connection success");
        this.a.e = 3;
        aual aual0 = this.a.f.a;
        aual0.a.m("onWakeupSocketConnectionSuccess");
        if(aual0.f == 2) {
            aual0.f(aual0.e);
        }
    }

    @Override  // auad
    public final void c(int v) {
        this.a.a(v);
    }

    @Override  // auad
    public final void d(int v) {
        aubc aubc0 = this.a;
        int v1 = aubc0.e;
        if(v1 == 3) {
            aubc0.a.m("wakeup socket disconnected");
            aubc0.e = 5;
            aual aual0 = aubc0.f.a;
            aual0.a.m("onWakeupSocketDisconnected");
            if(aual0.f == 2) {
                aual0.e(aual0.e);
            }
        }
        else if(v1 == 2) {
            aubc0.a(v);
        }
    }

    @Override  // auad
    public final void e(gehl gehl0) {
    }
}

