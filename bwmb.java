import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.Objects;

final class bwmb extends bwzp {
    final bwmx a;

    public bwmb(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        NativeIndex nativeIndex0 = this.a.m;
        if(nativeIndex0 != null) {
            nativeIndex0.v();
        }
    }
}

