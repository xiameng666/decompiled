import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Set;

public class baw implements bcn {
    protected final bcn a;
    private final Object b;
    private final Set c;

    protected baw(bcn bcn0) {
        this.b = new Object();
        this.c = new HashSet();
        this.a = bcn0;
    }

    @Override  // bcn
    public final int a() {
        return this.a.a();
    }

    @Override  // bcn
    public int b() {
        return this.a.b();
    }

    @Override  // bcn
    public int c() {
        return this.a.c();
    }

    @Override  // bcn
    public void close() {
        this.a.close();
        synchronized(this.b) {
            HashSet hashSet0 = new HashSet(this.c);
        }
        for(Object object0: hashSet0) {
            ((bav)object0).k(this);
        }
    }

    @Override  // bcn
    public final Image d() {
        return this.a.d();
    }

    @Override  // bcn
    public bcg e() {
        return this.a.e();
    }

    @Override  // bcn
    public void f(Rect rect0) {
        throw null;
    }

    @Override  // bcn
    public bcm[] g() {
        return this.a.g();
    }

    public final void h(bav bav0) {
        synchronized(this.b) {
            this.c.add(bav0);
        }
    }
}

