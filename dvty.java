import android.content.DialogInterface;
import j..util.Objects;

final class dvty implements ibth {
    final DialogInterface a;
    final dvub b;

    public dvty(dvub dvub0, DialogInterface dialogInterface0) {
        this.a = dialogInterface0;
        Objects.requireNonNull(dvub0);
        this.b = dvub0;
        super();
    }

    @Override  // ibth
    public final Object a() {
        this.b.ah.onDismiss(this.a);
        return ibom.a;
    }
}

