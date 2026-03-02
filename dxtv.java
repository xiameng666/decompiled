import android.content.Context;
import android.content.Intent;

public final class dxtv implements Runnable {
    public final dxuc a;
    public final du b;
    public final Context c;
    public final edtj d;
    public final gfsx e;

    public dxtv(dxuc dxuc0, du du0, Context context0, edtj edtj0, gfsx gfsx0) {
        this.a = dxuc0;
        this.b = du0;
        this.c = context0;
        this.d = edtj0;
        this.e = gfsx0;
    }

    @Override
    public final void run() {
        Intent intent0;
        gtux gtux0 = (gtux)((dxta)this.e.d()).b.d();
        edtj edtj0 = this.d;
        Context context0 = this.c;
        byte[] arr_b = (gtux0.b == 3 ? ((ByteString)gtux0.c) : ByteString.b).toByteArray();
        if(this.a.ar) {
            fbjk fbjk0 = new fbjk(context0, null);
            fbjk0.i(arr_b);
            edtj0.d(context0, fbjk0);
            fbjk0.g(2);
            intent0 = fbjk0.a();
        }
        else {
            intent0 = edtj0.a(context0, arr_b);
        }
        this.b.startActivityForResult(intent0, 0x460);
    }
}

