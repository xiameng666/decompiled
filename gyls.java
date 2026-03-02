import android.util.SparseArray;
import j..util.Objects;

public final class gyls extends gxum {
    final gyhu a;
    final gylt b;

    public gyls(gylt gylt0, String s, gyhu gyhu0) {
        this.a = gyhu0;
        Objects.requireNonNull(gylt0);
        this.b = gylt0;
        super(s);
    }

    @Override
    public final void run() {
        this.b.c.g(this.a.c);
        SparseArray sparseArray0 = this.b.c.a;
        synchronized(sparseArray0) {
            boolean z = false;
            int v1 = 0;
            while(v1 < sparseArray0.size()) {
                gykk gykk0 = (gykk)sparseArray0.valueAt(v1);
                if((gykk0 instanceof gykz)) {
                    gykt gykt0 = ((gykz)gykk0).a;
                    if((gykt0 instanceof gydy) || (gykt0 instanceof gydw)) {
                        z = true;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                else if((gykk0 instanceof gyjj)) {
                    gyjd gyjd0 = ((gyjj)gykk0).a;
                    if((gyjd0 instanceof gycx) || (gyjd0 instanceof gydq) || (gyjd0 instanceof gyds) || (gyjd0 instanceof gydu)) {
                        z = true;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                else {
                    ++v1;
                    continue;
                }
                break;
            }
        }
        if(!z) {
            this.b.c.e.c(null);
        }
    }
}

