import android.os.Handler;
import android.util.Log;
import j..util.Optional;

public final class fcyw implements fyxl {
    public Optional a;
    public Optional b;
    public final Handler c;

    public fcyw() {
        this.a = Optional.empty();
        this.c = new clht();
    }

    @Override  // fyxl
    public final void a(int v, int v1) {
        Log.d("SnackbarHandlerProvider", "animateContentIn");
        this.b.ifPresent(new fcyt(v1, v));
    }

    @Override  // fyxl
    public final void b(int v) {
        Log.d("SnackbarHandlerProvider", "animateContentOut");
        this.b.ifPresent(new fcyv(v));
    }
}

