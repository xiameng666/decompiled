package dagger.producers.monitoring;

import gmap;
import gmbu;
import gmcd;

public abstract class ProducerMonitor {
    public static final ProducerMonitor a;

    static {
        ProducerMonitor.a = new ProducerMonitor.2();
    }

    public void a(gmcd gmcd0) {
        gmbu.t(gmcd0, new ProducerMonitor.1(this), gmap.a);
    }

    public void b(Throwable throwable0) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g(Object object0) {
    }
}

