package dagger.producers.internal;

import glyq;

final class AbstractProducer.NonExternallyCancellableFuture extends glyq {
    @Override  // glyq
    public final boolean cancel(boolean z) {
        return false;
    }

    final void d(boolean z) {
        super.cancel(z);
    }
}

