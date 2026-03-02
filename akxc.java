import android.os.Handler;
import java.util.List;

public class akxc {
    final Handler d;

    public akxc(Handler handler0) {
        if(handler0 == null) {
            handler0 = new clht();
        }
        this.d = handler0;
    }

    protected void a() {
    }

    protected void b(byte[] arr_b, List list0) {
    }

    protected final void c(boolean z, byte[] arr_b, List list0) {
        akxb akxb0 = new akxb(this, z, arr_b, list0);
        this.d.post(akxb0);
    }
}

