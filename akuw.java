import android.os.Handler;
import j..util.Objects;
import java.util.List;

final class akuw extends akxc {
    final akvf a;

    public akuw(akvf akvf0, Handler handler0) {
        Objects.requireNonNull(akvf0);
        this.a = akvf0;
        super(handler0);
    }

    @Override  // akxc
    public final void a() {
        akvf.a.m("Error fetching device data.", new Object[0]);
        akvf.j(this.a);
        this.a.b();
    }

    @Override  // akxc
    public final void b(byte[] arr_b, List list0) {
        akvf akvf0 = this.a;
        akvf.j(akvf0);
        if(arr_b == null) {
            akvf.a.m("Received a null public key.", new Object[0]);
            akvf0.b();
            return;
        }
        akvf0.p = arr_b;
        akvf0.d();
    }
}

