import java.util.concurrent.Executor;

public final class babg implements Executor {
    @Override
    public final void execute(Runnable runnable0) {
        babf.a.post(runnable0);
    }
}

