import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanFilter;

public final class eife extends eifu {
    @Override  // eifu
    public final int a(eigg eigg0) {
        byte[] arr_b = eigg0.c();
        if(arr_b != null && arr_b.length >= 2 && arr_b[0] == 18) {
            int v = arr_b[1];
            if(v == 2) {
                return 102;
            }
            return v == 25 ? 101 : 0;
        }
        return 0;
    }

    @Override  // eifu
    public final int b(eigg eigg0) {
        byte[] arr_b = eigg0.c();
        if(arr_b != null && arr_b.length >= 3 && arr_b[0] == 18) {
            switch(arr_b[2] & 0x30) {
                case 0: {
                    return 3;
                }
                case 16: {
                    return 1;
                }
                case 0x20: {
                    return 4;
                }
                case 0x30: {
                    return 2;
                }
                default: {
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override  // eifu
    public final ScanFilter c() {
        return new ScanFilter.Builder().setManufacturerData(76, new byte[]{18}).build();
    }

    @Override  // eifu
    public final boolean d() {
        return true;
    }

    @Override  // eifu
    public final boolean e() {
        return true;
    }

    @Override  // eifu
    public final boolean f(eigg eigg0) {
        byte[] arr_b = eigg0.c();
        if(arr_b != null && arr_b.length >= 3 && arr_b[0] == 18) {
            switch(arr_b[1]) {
                case 2: 
                case 25: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // eifu
    public final boolean g(gwgx gwgx0) {
        return gwgx0.h == 1;
    }
}

