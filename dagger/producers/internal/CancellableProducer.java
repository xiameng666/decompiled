package dagger.producers.internal;

import dagger.producers.Producer;

public interface CancellableProducer extends Producer {
    void cancel(boolean arg1);

    Producer newDependencyView();

    Producer newEntryPointView(CancellationListener arg1);
}

