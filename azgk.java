import android.content.Context;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import java.util.Arrays;

public final class azgk implements azgg {
    private static final Object a;
    private static int b;
    private static volatile azgk c;
    private final frii d;
    private volatile azfv e;
    private volatile azfv f;

    static {
        azgk.a = new Object();
    }

    private azgk() {
        this.e = null;
        this.f = null;
        frij frij0 = new frij();
        frij0.b(frks.a);
        frij0.a = gmap.a;
        frij0.b = new frbx(Arrays.asList(new frga[]{new frcr()}));
        this.d = frij0.a();
    }

    @Override  // azgg
    public final azge a() {
        boolean z = fhcd.g(AppContextProvider.a());
        this.d();
        if(z) {
            return this.e == null ? null : this.e;
        }
        return this.f;
    }

    @Override  // azgg
    public final gged_interceptors b() {
        this.d();
        ggdy ggdy0 = new ggdy();
        if(this.e != null) {
            ggdy0.i(this.e);
        }
        if(this.f != null) {
            ggdy0.i(this.f);
        }
        return ggdy0.h();
    }

    public static azgk c() {
        synchronized(azgk.a) {
            ++azgk.b;
            if(azgk.c == null) {
                azgk.c = new azgk();
            }
        }
        return azgk.c;
    }

    @Override
    public final void close() {
        synchronized(azgk.a) {
            int v1 = azgk.b;
            if(v1 > 0) {
                --v1;
                azgk.b = v1;
            }
            if(v1 == 0) {
                if(this.e != null) {
                    this.e.close();
                    this.e = null;
                }
                if(this.f != null) {
                    this.f.close();
                    this.f = null;
                }
                azgk.c = null;
            }
        }
    }

    private final void d() {
        Context context0 = AppContextProvider.a();
        synchronized(azgk.a) {
            if(this.e == null) {
                this.e = new azfv(context0.createDeviceProtectedStorageContext(), this.d);
            }
            if(this.f == null && !fhcd.g(context0)) {
                this.f = new azfv(context0, this.d);
            }
        }
    }
}

