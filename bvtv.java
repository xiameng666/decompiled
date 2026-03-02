import android.widget.Toast;

public final class bvtv implements Runnable {
    public final bvtz a;
    public final String b;
    public final boolean c;

    public bvtv(bvtz bvtz0, String s, boolean z) {
        this.a = bvtz0;
        this.b = s;
        this.c = z;
    }

    @Override
    public final void run() {
        Toast.makeText(this.a.b, this.b, ((int)this.c)).show();
    }
}

