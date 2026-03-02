import java.util.List;
import java.util.concurrent.Executor;

public final class acfv implements azys {
    public final acgm a;
    public final Executor b;
    public final String c;
    public final acip d;
    public final List e;
    public final List f;
    public final long g;
    public final long h;

    public acfv(acgm acgm0, Executor executor0, String s, acip acip0, List list0, List list1, long v, long v1) {
        this.a = acgm0;
        this.b = executor0;
        this.c = s;
        this.d = acip0;
        this.e = list0;
        this.f = list1;
        this.g = v;
        this.h = v1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acfs acfs0 = new acfs(this.a, this.c, ((acjz)object0), ((evqp)object1), this.d, this.e, this.f, this.g, this.h);
        this.b.execute(acfs0);
        this.a.d = true;
    }
}

