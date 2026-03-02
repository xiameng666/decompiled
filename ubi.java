import android.content.res.AssetManager;
import java.io.IOException;

public abstract class ubi implements ubl {
    private final String a;
    private final AssetManager b;
    private Object c;

    public ubi(AssetManager assetManager0, String s) {
        this.b = assetManager0;
        this.a = s;
    }

    protected abstract Object c(AssetManager arg1, String arg2);

    @Override  // ubl
    public final void d() {
    }

    @Override  // ubl
    public final void e() {
        Object object0 = this.c;
        if(object0 == null) {
            return;
        }
        try {
            this.f(object0);
        }
        catch(IOException unused_ex) {
        }
    }

    protected abstract void f(Object arg1);

    @Override  // ubl
    public final uag fw() {
        return uag.a;
    }

    @Override  // ubl
    public final void g(txn txn0, ubk ubk0) {
        try {
            Object object0 = this.c(this.b, this.a);
            this.c = object0;
            ubk0.c(object0);
        }
        catch(IOException iOException0) {
            ubk0.f(iOException0);
        }
    }
}

