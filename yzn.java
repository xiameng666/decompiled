import java.util.concurrent.ThreadFactory;

public final class yzn implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "GoogleAuthProtoLiteRequest");
    }
}

