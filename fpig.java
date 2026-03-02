import java.util.concurrent.ThreadFactory;

public final class fpig implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "ProcessStablePhenotypeFlag");
    }
}

