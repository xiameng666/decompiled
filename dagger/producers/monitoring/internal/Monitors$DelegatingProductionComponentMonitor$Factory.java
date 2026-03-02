package dagger.producers.monitoring.internal;

import dagger.producers.monitoring.ProductionComponentMonitor.Factory;
import dagger.producers.monitoring.ProductionComponentMonitor;
import ggdy;
import gged_interceptors;
import gggq;
import ggna;

final class Monitors.DelegatingProductionComponentMonitor.Factory extends ProductionComponentMonitor.Factory {
    private final gged_interceptors b;

    public Monitors.DelegatingProductionComponentMonitor.Factory(Iterable iterable0) {
        this.b = gged_interceptors.h(iterable0);
    }

    @Override  // dagger.producers.monitoring.ProductionComponentMonitor$Factory
    public final ProductionComponentMonitor a(Object object0) {
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = this.b;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ProductionComponentMonitor.Factory productionComponentMonitor$Factory0 = (ProductionComponentMonitor.Factory)gged0.get(v1);
            try {
                ggdy0.i(productionComponentMonitor$Factory0.a(object0));
            }
            catch(RuntimeException runtimeException0) {
                Monitors.b(runtimeException0, productionComponentMonitor$Factory0, object0);
            }
        }
        gged_interceptors gged1 = ggdy0.h();
        if(!gged1.isEmpty()) {
            return ((ggna)gged1).c == 1 ? new Monitors.NonThrowingProductionComponentMonitor(((ProductionComponentMonitor)gggq.r(gged1))) : new Monitors.DelegatingProductionComponentMonitor(gged1);
        }
        return ProductionComponentMonitor.a;
    }
}

