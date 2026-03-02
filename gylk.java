import android.os.SystemClock;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class gylk {
    public final int a;
    public final gxuf b;
    public final LinkedList c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public final gxum h;
    public final gylj i;
    final gyey j;

    public gylk(gyey gyey0, gxuf gxuf0, gylj gylj0) {
        Objects.requireNonNull(gyey0);
        this.j = gyey0;
        super();
        this.d = 0;
        this.e = 0L;
        this.g = true;
        this.h = new gyli(this);
        batl.s(gxuf0);
        this.b = gxuf0;
        this.i = gylj0;
        this.c = new LinkedList();
        this.a = 3;
        this.f = SystemClock.elapsedRealtime();
    }

    public final void a(gyll[] arr_gyll) {
        Collections.addAll(this.c, arr_gyll);
        this.e();
    }

    public final void b(gyll[] arr_gyll) {
        if(hvow.g()) {
            this.b.b();
        }
        gyll gyll0 = (gyll)this.c.peek();
        List list0 = Arrays.asList(arr_gyll);
        this.c.removeAll(list0);
        if(gyll0 == this.c.peek()) {
            this.e();
            return;
        }
        this.c();
    }

    public final void c() {
        this.g = true;
        this.d = 0;
        this.e = 0L;
        this.f = SystemClock.elapsedRealtime();
        this.e();
    }

    public final long d() {
        hiep hiep0 = this.j.j.a().h;
        if(hiep0 == null) {
            hiep0 = hiep.a;
        }
        return hiep0.i;
    }

    private final void e() {
        this.b.f(this.h);
    }
}

