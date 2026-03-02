import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.Objects;

public final class bwmi extends bwzp {
    final bwmx a;

    public bwmi(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final Object a() {
        bwmx bwmx0 = this.a;
        Object object0 = Boolean.valueOf(false);
        if(!bwmx0.F()) {
            bwne.f("UpdateNativeConfig skipped because init failed");
            return object0;
        }
        NativeIndex nativeIndex0 = bwmx0.m;
        if(nativeIndex0 == null) {
            bwne.f("Null \'index\' while calling updateNativeConfig.");
            return object0;
        }
        if(!nativeIndex0.A(bwmx0.c())) {
            bwne.f("Failed while calling updateNativeConfig.");
            return object0;
        }
        return Boolean.valueOf(true);
    }
}

