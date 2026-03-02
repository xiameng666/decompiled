import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public interface gmcg extends ExecutorService {
    gmcd d(Runnable arg1);

    gmcd e(Callable arg1);

    gmcd f(Runnable arg1, Object arg2);

    @Override
    List invokeAll(Collection arg1);

    @Override
    List invokeAll(Collection arg1, long arg2, TimeUnit arg3);
}

