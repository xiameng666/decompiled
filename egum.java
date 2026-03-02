import android.os.Bundle;
import java.util.List;

public final class egum implements evqf {
    public final eguv a;
    public final List b;

    public egum(eguv eguv0, List list0) {
        this.a = eguv0;
        this.b = list0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((Bundle)object0) != null) {
            this.a.m.ii(((Bundle)object0));
            List list0 = eguv.x(this.b);
            this.a.l.ii(list0);
            return;
        }
        ((ggtj)eguv.a.i()).x("Fetch backup entity for single device backup suggestion failed.");
    }
}

