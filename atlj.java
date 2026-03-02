import android.content.Context;
import java.util.HashSet;
import java.util.List;

public final class atlj implements Runnable {
    public final Context a;
    public final List b;
    public final List c;
    public final atmb d;
    public final wpm e;

    public atlj(Context context0, List list0, List list1, atmb atmb0, wpm wpm0) {
        this.a = context0;
        this.b = list0;
        this.c = list1;
        this.d = atmb0;
        this.e = wpm0;
    }

    @Override
    public final void run() {
        atmd atmd0 = atmc.a(this.a);
        HashSet hashSet0 = new HashSet(hqlt.m().b);
        for(Object object0: this.b) {
            String s = (String)object0;
            if(hashSet0.contains(s)) {
                boolean z = this.c.contains(s);
                atmd0.e(s, z);
                this.d.c(s, gifh.j, z);
            }
        }
        atll.d(atmd0.c(), this.e);
    }
}

