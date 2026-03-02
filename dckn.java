import android.widget.Toast;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService;

public final class dckn implements Runnable {
    public final ReceiveSurfaceChimeraService a;
    public final int b;
    public final String[] c;
    public final int d;

    public dckn(ReceiveSurfaceChimeraService receiveSurfaceChimeraService0, int v, String[] arr_s, int v1) {
        this.a = receiveSurfaceChimeraService0;
        this.b = v;
        this.c = arr_s;
        this.d = v1;
    }

    @Override
    public final void run() {
        Toast.makeText(this.a.b, this.a.b.getString(this.b, this.c), this.d).show();
    }
}

