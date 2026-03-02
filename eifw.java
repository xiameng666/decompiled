import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanFilter;

public final class eifw extends eifu {
    @Override  // eifu
    public final int a(eigg eigg0) {
        byte[] arr_b = eigg0.b(eigq.b);
        if(arr_b == null) {
            return 0;
        }
        if(arr_b.length < 6) {
            return 102;
        }
        return arr_b[1] == 1 ? 102 : 101;
    }

    @Override  // eifu
    public final int b(eigg eigg0) {
        return 6;
    }

    @Override  // eifu
    public final ScanFilter c() {
        return new ScanFilter.Builder().setServiceData(eigq.b, new byte[0]).build();
    }

    @Override  // eifu
    public final boolean d() {
        return hrtd.ab();
    }

    @Override  // eifu
    public final boolean e() {
        return hrtd.ad();
    }

    @Override  // eifu
    public final boolean f(eigg eigg0) {
        return eigg0.b(eigq.b) != null;
    }

    @Override  // eifu
    public final boolean g(gwgx gwgx0) {
        return gwgx0.h == 6;
    }
}

