import android.os.IBinder;
import java.util.concurrent.Executor;

final class iask extends iasm {
    private final ibfe d;

    public iask(IBinder iBinder0, Executor executor0) {
        super(iBinder0);
        this.d = new ibfe(executor0);
    }

    @Override  // iasm
    public final void a(int v, iasp iasp0) {
        iasj iasj0 = new iasj(this, v, iasp0.a());
        this.d.execute(iasj0);
        iasp0.b();
    }
}

