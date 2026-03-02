package dagger.producers.monitoring.internal;

import a;
import dagger.internal.InstanceFactory;
import dagger.producers.monitoring.ProducerMonitor;
import dagger.producers.monitoring.ProducerToken;
import dagger.producers.monitoring.ProductionComponentMonitor.Factory;
import dagger.producers.monitoring.ProductionComponentMonitor;
import gggq;
import ibnf;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Monitors {
    private static final Logger a;

    static {
        Monitors.a = Logger.getLogger(Monitors.class.getName());
    }

    public static ProductionComponentMonitor a(ibnf ibnf0, ibnf ibnf1) {
        ProductionComponentMonitor.Factory productionComponentMonitor$Factory0;
        try {
            Collection collection0 = (Collection)((InstanceFactory)ibnf1).a;
            if(collection0.isEmpty()) {
                productionComponentMonitor$Factory0 = ProductionComponentMonitor.Factory.a;
            }
            else {
                Monitors.NonThrowingProductionComponentMonitor.Factory monitors$NonThrowingProductionComponentMonitor$Factory0 = collection0.size() == 1 ? new Monitors.NonThrowingProductionComponentMonitor.Factory(((ProductionComponentMonitor.Factory)gggq.r(collection0))) : new Monitors.DelegatingProductionComponentMonitor.Factory(collection0);
                productionComponentMonitor$Factory0 = monitors$NonThrowingProductionComponentMonitor$Factory0;
            }
            return productionComponentMonitor$Factory0.a(((InstanceFactory)ibnf0).a);
        }
        catch(RuntimeException runtimeException0) {
            Monitors.a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", runtimeException0);
            return ProductionComponentMonitor.a;
        }
    }

    public static void b(RuntimeException runtimeException0, ProductionComponentMonitor.Factory productionComponentMonitor$Factory0, Object object0) {
        Monitors.a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logCreateException", a.m(object0, productionComponentMonitor$Factory0, "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ", " with component "), runtimeException0);
    }

    public static void c(RuntimeException runtimeException0, ProducerMonitor producerMonitor0, String s, Object object0) {
        Monitors.a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + s + " on monitor " + producerMonitor0 + " with " + object0, runtimeException0);
    }

    public static void d(RuntimeException runtimeException0, ProductionComponentMonitor productionComponentMonitor0, ProducerToken producerToken0) {
        Monitors.a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", a.m(producerToken0, productionComponentMonitor0, "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ", " with token "), runtimeException0);
    }

    public static void e(RuntimeException runtimeException0, ProducerMonitor producerMonitor0, String s) {
        Monitors.a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", a.L(producerMonitor0, s, "RuntimeException while calling ProducerMonitor.", " on monitor "), runtimeException0);
    }
}

