import java.util.concurrent.ThreadFactory;

public final class auyn implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        ibuq.f(runnable0, "r");
        return new Thread(new auym(runnable0), "mirroring-streamer");
    }
}

