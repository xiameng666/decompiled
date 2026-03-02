public final class fffk implements Runnable {
    @Override
    public final void run() {
        throw new IllegalStateException("Wearable service startup timed out. Restarting GMS Core.");
    }
}

