import android.graphics.PorterDuff.Mode;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;

public class byk {
    public int a;
    public final cab b;
    public int c;
    public int d;
    public int e;
    private final cac f;
    private int g;
    private int h;
    private int i;

    public byk() {
        this(1);
    }

    public byk(int v) {
        this.a = v;
        if(v <= 0) {
            cad.a("maxSize <= 0");
        }
        this.f = new cac(0);
        this.b = new cab();
    }

    public final int a() {
        synchronized(this.b) {
        }
        return this.g;
    }

    protected int b(Object object0, Object object1) {
        ibuq.f(object0, "key");
        ibuq.f(object1, "value");
        return 1;
    }

    protected Object c(Object object0) {
        ibuq.f(object0, "key");
        return null;
    }

    public final Object d(Object object0) {
        Object object3;
        ibuq.f(object0, "key");
        synchronized(this.b) {
            ibuq.f(object0, "key");
            Object object1 = this.f.a.get(object0);
            if(object1 != null) {
                ++this.d;
                return object1;
            }
            ++this.e;
        }
        Object object2 = this.c(object0);
        if(object2 == null) {
            return null;
        }
        synchronized(this.b) {
            ++this.i;
            cac cac0 = this.f;
            object3 = cac0.a(object0, object2);
            if(object3 == null) {
                this.g += this.l(object0, object2);
            }
            else {
                cac0.a(object0, object3);
            }
        }
        if(object3 != null) {
            this.k(object0, object2, object3);
            return object3;
        }
        this.i(this.a);
        return object2;
    }

    public final Object e(Object object0, Object object1) {
        Object object2;
        ibuq.f(object0, "key");
        ibuq.f(object1, "value");
        synchronized(this.b) {
            ++this.h;
            this.g += this.l(object0, object1);
            object2 = this.f.a(object0, object1);
            if(object2 != null) {
                this.g -= this.l(object0, object2);
            }
        }
        if(object2 != null) {
            this.k(object0, object2, object1);
        }
        this.i(this.a);
        return object2;
    }

    public final Object f(Object object0) {
        Object object1;
        ibuq.f(object0, "key");
        synchronized(this.b) {
            object1 = this.f.b(object0);
            if(object1 != null) {
                this.g -= this.l(object0, object1);
            }
        }
        if(object1 != null) {
            this.k(object0, object1, null);
        }
        return object1;
    }

    public final Map g() {
        Map map0;
        synchronized(this.b) {
            map0 = new LinkedHashMap(this.f.c().size());
            for(Object object0: this.f.c()) {
                map0.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            }
        }
        return map0;
    }

    public final void h() {
        this.i(-1);
    }

    public final void i(int v) {
        Object object1;
        Object object0;
        int v1;
        while(true) {
            synchronized(this.b) {
                v1 = FIN.finallyOpen$NT();
                if(this.g < 0 || this.f.d() && this.g != 0) {
                    cad.b("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if(this.g <= v) {
                    break;
                }
                cac cac0 = this.f;
                if(cac0.d()) {
                    break;
                }
                Map.Entry map$Entry0 = (Map.Entry)ibpo.S(cac0.c());
                if(map$Entry0 == null) {
                    FIN.finallyExec$NT(v1);
                    return;
                }
                object0 = map$Entry0.getKey();
                object1 = map$Entry0.getValue();
                cac0.b(object0);
                this.g -= this.l(object0, object1);
                ++this.c;
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
            this.k(object0, object1, null);
        }
        FIN.finallyExec$NT(v1);
    }

    public static int j(int v, PorterDuff.Mode porterDuff$Mode0) {
        return (v + 0x1F) * 0x1F + porterDuff$Mode0.hashCode();
    }

    protected void k(Object object0, Object object1, Object object2) {
        ibuq.f(object0, "key");
        ibuq.f(object1, "oldValue");
    }

    private final int l(Object object0, Object object1) {
        int v = this.b(object0, object1);
        if(v < 0) {
            cad.b(("Negative size: " + object0 + '=' + object1));
        }
        return v;
    }

    @Override
    public final String toString() {
        int v2;
        synchronized(this.b) {
            int v1 = this.e + this.d;
            v2 = v1 == 0 ? 0 : this.d * 100 / v1;
        }
        return "LruCache[maxSize=" + this.a + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + v2 + "%]";
    }
}

