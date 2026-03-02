import android.content.Context;
import android.content.Intent;

public final class dxtw implements Runnable {
    public final du a;
    public final edtj b;
    public final Context c;
    public final gtur d;

    public dxtw(du du0, edtj edtj0, Context context0, gtur gtur0) {
        this.a = du0;
        this.b = edtj0;
        this.c = context0;
        this.d = gtur0;
    }

    @Override
    public final void run() {
        byte[] arr_b = (this.d.h == null ? geom.a : this.d.h).c.toByteArray();
        Intent intent0 = this.b.b(this.c, arr_b);
        this.a.startActivityForResult(intent0, 0x462);
    }
}

