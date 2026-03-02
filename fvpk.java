import java.io.File;
import java.io.IOException;
import java.util.BitSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class fvpk implements fvmz {
    public boolean a;
    public final fwyg b;
    public final fwyy c;
    public final fybc d;
    public final Executor e;
    public final Executor f;
    public final fxbh g;
    public final byte[] h;
    public final String i;
    public final fvpl j;
    public final fxcz k;

    public fvpk(fwyy fwyy0, Executor executor0, Executor executor1, fwyg fwyg0, String s, byte[] arr_b, fxcz fxcz0, fybc fybc0) {
        this.c = fwyy0;
        this.e = executor0;
        this.f = executor1;
        this.b = fwyg0;
        this.i = s;
        this.k = fxcz0;
        this.d = fybc0;
        this.h = arr_b;
        this.j = new fvpl();
        this.g = new fxbh();
    }

    @Override  // fvmz
    public final void a() {
        fvoy fvoy0 = new fvoy(this);
        this.f.execute(fvoy0);
    }

    @Override  // fvmz
    public final void b() {
        synchronized(this) {
            this.a = false;
        }
    }

    public final void c() {
        if(this.j.e > 0) {
            return;
        }
        fvox fvox0 = new fvox(this);
        this.f.execute(fvox0);
    }

    // Detected as a lambda impl.
    public final void d(Iterator iterator0, BitSet bitSet0, String s, fvsw fvsw0) {
        if(!iterator0.hasNext()) {
            this.c();
            this.f();
            return;
        }
        Object object0 = iterator0.next();
        fvkf fvkf0 = new fvkf(new File(new File(this.i), ((String)object0)).getAbsolutePath(), fvsw0);
        ++this.j.a;
        fvow fvow0 = () -> {
            boolean z;
            byte[] arr_b;
            synchronized(this) {
            }
            if(!this.a) {
                this.f();
                return;
            }
            try {
                arr_b = fvkf0.b();
                z = false;
            }
            catch(fvke | IOException unused_ex) {
                arr_b = null;
                z = true;
            }
            if(arr_b != null) {
                fvph fvph0 = new fvph(this, iterator0, bitSet0, s, fvsw0, fvkf0, 0, arr_b);
                this.f.execute(fvph0);
                return;
            }
            if(z) {
                try {
                    ++this.j.c;
                    fvkf0.a();
                }
                catch(IOException unused_ex) {
                }
                fvpi fvpi0 = new fvpi(this, iterator0, bitSet0, s, fvsw0);
                this.f.execute(fvpi0);
                return;
            }
            try {
                fvkf0.a();
            }
            catch(IOException unused_ex) {
            }
            fvpe fvpe0 = new fvpe(this);
            this.e.execute(fvpe0);
            fvov fvov0 = new fvov(this, iterator0, bitSet0, s, fvsw0);
            this.f.execute(fvov0);
        };
        this.f.execute(fvow0);
    }

    // Detected as a lambda impl.
    public final void e(Iterator iterator0, BitSet bitSet0, String s, fvsw fvsw0, int v, fvkf fvkf0) {
        boolean z;
        byte[] arr_b;
        synchronized(this) {
        }
        if(!this.a) {
            this.f();
            return;
        }
        try {
            arr_b = fvkf0.b();
            z = false;
        }
        catch(fvke | IOException unused_ex) {
            arr_b = null;
            z = true;
        }
        if(arr_b != null) {
            fvph fvph0 = new fvph(this, iterator0, bitSet0, s, fvsw0, fvkf0, v, arr_b);
            this.f.execute(fvph0);
            return;
        }
        if(z) {
            try {
                ++this.j.c;
                fvkf0.a();
            }
            catch(IOException unused_ex) {
            }
            fvpi fvpi0 = () -> {
                if(!iterator0.hasNext()) {
                    this.c();
                    this.f();
                    return;
                }
                Object object0 = iterator0.next();
                fvkf fvkf0 = new fvkf(new File(new File(this.i), ((String)object0)).getAbsolutePath(), fvsw0);
                ++this.j.a;
                fvow fvow0 = new fvow(this, iterator0, bitSet0, s, fvsw0, fvkf0);
                this.f.execute(fvow0);
            };
            this.f.execute(fvpi0);
            return;
        }
        try {
            fvkf0.a();
        }
        catch(IOException unused_ex) {
        }
        fvpe fvpe0 = new fvpe(this);
        this.e.execute(fvpe0);
        fvov fvov0 = () -> {
            if(!iterator0.hasNext()) {
                this.c();
                this.f();
                return;
            }
            Object object0 = iterator0.next();
            fvkf fvkf0 = new fvkf(new File(new File(this.i), ((String)object0)).getAbsolutePath(), fvsw0);
            ++this.j.a;
            fvow fvow0 = new fvow(this, iterator0, bitSet0, s, fvsw0, fvkf0);
            this.f.execute(fvow0);
        };
        this.f.execute(fvov0);
    }

    public final void f() {
        fvoz fvoz0 = new fvoz(this);
        this.e.execute(fvoz0);
    }
}

