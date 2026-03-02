import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface gmch extends gmcg, ScheduledExecutorService {
    gmcf a(Runnable arg1, long arg2, long arg3, TimeUnit arg4);

    gmcf b(Runnable arg1, long arg2, long arg3, TimeUnit arg4);

    gmcf g(Runnable arg1, long arg2, TimeUnit arg3);

    gmcf h(Callable arg1, long arg2, TimeUnit arg3);
}

