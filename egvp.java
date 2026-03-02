import java.util.concurrent.TimeUnit;

public final class egvp implements Runnable {
    public final egvq a;

    public egvp(egvq egvq0) {
        this.a = egvq0;
    }

    @Override
    public final void run() {
        egvq egvq0 = this.a;
        if(egvq0.i.m()) {
            egvq0.o();
            return;
        }
        if(egvq0.j != null && !egvq0.j.m()) {
            return;
        }
        gfug gfug0 = gfug.c(gfqs.a);
        egvq0.j = egvq0.a.g(egvq0.h);
        egvq0.j.m();
        gfug0.a(TimeUnit.MILLISECONDS);
        egvq0.j.z(egvq0);
    }
}

