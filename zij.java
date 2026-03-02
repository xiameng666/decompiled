import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@ibnh
public final class zij {
    public final ExecutorService a;
    public final Context b;
    private final Map c;

    public zij(ExecutorService executorService0, Context context0) {
        this.a = executorService0;
        this.b = context0;
        this.c = new HashMap();
    }

    public final lqi a(zii zii0) {
        Map map0 = this.c;
        if(map0.containsKey(zii0)) {
            return (lqi)map0.get(zii0);
        }
        lqi lqi0 = new lqi(gfqx.a);
        map0.put(zii0, lqi0);
        return lqi0;
    }
}

