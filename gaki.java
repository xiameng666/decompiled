import java.util.concurrent.ThreadFactory;

public final class gaki implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "LoggingStore");
    }
}

