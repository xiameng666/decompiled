import android.os.Handler;
import java.util.Map;

public class akzg {
    final Handler b;

    public akzg(Handler handler0) {
        this.b = handler0;
    }

    protected void a(Map map0) {
    }

    protected void b() {
    }

    public final void c(Map map0) {
        akzf akzf0 = new akzf(this, map0);
        this.b.post(akzf0);
    }
}

