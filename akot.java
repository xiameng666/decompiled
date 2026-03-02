import android.content.ServiceConnection;
import android.os.Handler;
import j..util.Objects;
import java.util.function.Consumer;

public final class akot {
    public boolean a;
    public int b;
    public final Handler c;
    public final akok d;
    public Consumer e;
    public final ServiceConnection f;
    final akou g;
    public yxh h;

    public akot(akou akou0) {
        Objects.requireNonNull(akou0);
        this.g = akou0;
        super();
        this.b = 0;
        clht clht0 = new clht();
        this.c = clht0;
        this.d = new akok(new lqi(((int)-4)), clht0);
        this.f = new akos(this);
    }
}

