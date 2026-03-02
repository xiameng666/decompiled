import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import j..util.Objects;

public final class arde extends bbln {
    final D2dSourceChimeraService a;

    public arde(D2dSourceChimeraService d2dSourceChimeraService0) {
        Objects.requireNonNull(d2dSourceChimeraService0);
        this.a = d2dSourceChimeraService0;
        super(10);
    }

    @Override
    public final void run() {
        this.a.d.b();
    }
}

