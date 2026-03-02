import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class foej implements gful_cronetEngineProvider {
    public final foek a;
    public final fobz b;

    public foej(foek foek0, fobz fobz0) {
        this.a = foek0;
        this.b = fobz0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Context context0 = this.a.a.getApplicationContext();
        ExecutorService executorService0 = this.a.b;
        gftb.check(context0);
        gftb.check(executorService0);
        efol efol0 = new efol();
        efol0.a = 641;
        efom efom0 = efol0.a();
        return new fogy(new fogr(context0, new azts(context0, efom0), new efoi(context0, efom0), new azts(context0, efom0, null), new fodz(context0, executorService0), executorService0, azpm.a), 2, this.b, "com.google.android.gms");
    }
}

