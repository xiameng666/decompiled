import j..time.Instant;
import j..time.temporal.ChronoUnit;

public final class gxws implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return Instant.now().truncatedTo(ChronoUnit.MILLIS).toEpochMilli();
    }
}

