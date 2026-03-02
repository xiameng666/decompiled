import android.text.TextUtils;
import j..util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class augt implements Runnable {
    public final auha a;
    public final Set b;
    public final int c;
    public final Map d;

    public augt(auha auha0, Set set0, int v, Map map0) {
        this.a = auha0;
        this.b = set0;
        this.c = v;
        this.d = map0;
    }

    @Override
    public final void run() {
        Set set0 = this.b;
        String s = set0 == null ? null : TextUtils.join(",", set0);
        auha auha0 = this.a;
        auha0.a.f("Filter criteria(%s) scannerFlags(%d)", new Object[]{s, ((int)this.c)});
        auha0.m = this.c;
        auha0.j.clear();
        auha0.j.putAll(this.d);
        boolean z = true;
        if(set0 == null && auha0.l != null) {
            auha0.l = null;
            auha0.c();
        }
        else if(set0 != null && auha0.l == null) {
            auha0.l = ggog.m(set0);
            Objects.requireNonNull(auha0.i);
            augw augw0 = new augw(auha0.i);
            long v = (long)(((Long)auha0.b.mr()));
            long v1 = (long)(((Long)auha0.b.mr()));
            auha0.o = auha0.f.scheduleWithFixedDelay(augw0, v, v1, TimeUnit.MILLISECONDS);
        }
        else if(set0 != null && (auha0.l != null && !set0.equals(auha0.l))) {
            auha0.l.clear();
            auha0.l.addAll(set0);
        }
        else {
            z = false;
        }
        auha0.e(z);
    }
}

