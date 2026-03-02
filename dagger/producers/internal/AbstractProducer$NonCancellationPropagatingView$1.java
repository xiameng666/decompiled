package dagger.producers.internal;

import gmcd;
import j..util.Objects;

class AbstractProducer.NonCancellationPropagatingView.1 implements Runnable {
    final CancellationListener a;
    final AbstractProducer.NonCancellationPropagatingView b;

    public AbstractProducer.NonCancellationPropagatingView.1(AbstractProducer.NonCancellationPropagatingView abstractProducer$NonCancellationPropagatingView0, CancellationListener cancellationListener0) {
        this.a = cancellationListener0;
        Objects.requireNonNull(abstractProducer$NonCancellationPropagatingView0);
        this.b = abstractProducer$NonCancellationPropagatingView0;
        super();
    }

    @Override
    public final void run() {
        boolean z = false;
        gmcd gmcd0 = this.b.a;
        if(gmcd0.isCancelled()) {
            if((gmcd0 instanceof AbstractProducer.NonCancellationPropagatingFuture) && ((AbstractProducer.NonCancellationPropagatingFuture)gmcd0).d()) {
                z = true;
            }
            this.a.onProducerFutureCancelled(z);
        }
    }
}

