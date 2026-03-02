import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajjo {
    azts a;
    private final Context b;
    private static final baun c;

    static {
        ajjo.c = new baun(new String[]{"TrustAgentHelper"}, null);
    }

    public ajjo(Context context0) {
        this.b = context0;
    }

    public final ajjn a() {
        if(this.a == null) {
            this.a = new azts(this.b, null);
        }
        if(!azts.ci(this.b)) {
            return new ajjn(false, false);
        }
        try {
            return new ajjn(true, ((ezco)evrg.o(this.a.cg(), 10L, TimeUnit.SECONDS)).b);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            ajjo.c.g("Exception fetching truststate", exception0, new Object[0]);
            return new ajjn(true, false);
        }
    }
}

