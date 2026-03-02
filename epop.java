import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

public final class epop implements cjeo, cjep {
    public final cjer_LocationSettings a;
    public boolean b;
    public final Set c;
    private final Context d;
    private boolean e;
    private boolean f;

    public epop(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.d = context0;
        this.a = cjer_LocationSettings.b(context0);
        boolean z = true;
        boolean z1 = cjer_LocationSettings.a(context0) == 0;
        this.e = z1;
        if(z1 || !this.f) {
            z = false;
        }
        this.b = z;
        this.c = new LinkedHashSet();
    }

    @Override  // cjep
    public final void a(boolean z) {
        this.f = z;
        this.c();
    }

    @Override  // cjep
    public final void b(boolean z) {
        if(this.f == z) {
            return;
        }
        this.f = z;
        this.c();
    }

    private final void c() {
        boolean z = this.f && !this.e;
        if(z != this.b) {
            this.b = z;
            for(Object object0: this.c) {
                ((eppe)object0).D(this.b);
            }
        }
    }

    @Override  // cjeo
    public final void h(int v, int v1) {
        if(v != 0 && v1 != 0) {
            return;
        }
        this.e = v1 == 0;
        this.c();
    }

    @Override  // cjeo
    public final void i(int v) {
        this.e = v == 0;
        this.c();
    }
}

