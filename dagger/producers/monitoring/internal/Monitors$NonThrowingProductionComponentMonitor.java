package dagger.producers.monitoring.internal;

import dagger.producers.monitoring.ProducerMonitor;
import dagger.producers.monitoring.ProducerToken;
import dagger.producers.monitoring.ProductionComponentMonitor;

final class Monitors.NonThrowingProductionComponentMonitor extends ProductionComponentMonitor {
    private final ProductionComponentMonitor b;

    public Monitors.NonThrowingProductionComponentMonitor(ProductionComponentMonitor productionComponentMonitor0) {
        this.b = productionComponentMonitor0;
    }

    @Override  // dagger.producers.monitoring.ProductionComponentMonitor
    public final ProducerMonitor a(ProducerToken producerToken0) {
        try {
            return new Monitors.NonThrowingProducerMonitor(this.b.a(producerToken0));
        }
        catch(RuntimeException runtimeException0) {
            Monitors.d(runtimeException0, this.b, producerToken0);
            return ProducerMonitor.a;
        }
    }
}

