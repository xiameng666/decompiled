import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class bxsy extends gmbf {
    public final bxsx a;

    private bxsy(gmcd gmcd0, bxsx bxsx0) {
        super(gmcd0);
        this.a = bxsx0;
    }

    public final bxsy e(bxmg bxmg0) {
        bxsp bxsp0 = new bxsp(this, bxmg0);
        Executor executor0 = (Executor)this.a.a.mr();
        return new bxsy(glyi.f(this.b, Throwable.class, bxsp0, executor0), this.a);
    }

    public final bxsy f(bxmg bxmg0) {
        bxsq bxsq0 = new bxsq(this, bxmg0);
        Executor executor0 = (Executor)this.a.a.mr();
        return new bxsy(glyi.g(this.b, Throwable.class, bxsq0, executor0), this.a);
    }

    public static bxsy g(evql evql0) {
        return bxsy.h(fhra.b(evql0));
    }

    public static bxsy h(gmcd gmcd0) {
        return new bxsy(gmcd0, bxsw.a(((gful_cronetEngineProvider)new bxsv()), null));
    }

    public final bxsy i(bboh bboh0) {
        bxsx bxsx0 = bxsw.a(this.a.a, bboh0);
        return new bxsy(this.b, bxsx0);
    }

    public final bxsy j() {
        bxsx bxsx0 = bxsw.a(this.a.a, null);
        return new bxsy(this.b, bxsx0);
    }

    public final bxsy k(bxto bxto0) {
        bxsr bxsr0 = new bxsr(bxto0);
        Executor executor0 = (Executor)this.a.a.mr();
        return new bxsy(glzd.f(this.b, bxsr0, executor0), this.a);
    }

    public static bxsy l(Iterable iterable0, gfsi gfsi0) {
        return bxsy.h(gmbu.e(ggch.j(iterable0).l(gfsi0).n()));
    }

    public final bxsy m(glzn glzn0) {
        Executor executor0 = (Executor)this.a.a.mr();
        return new bxsy(glzd.g(this.b, glzn0, executor0), this.a);
    }

    public final bxsy n(bxso bxso0) {
        return this.m(new bxsu(bxso0));
    }

    public final bxsy o(Executor executor0) {
        bxsx bxsx0 = bxsw.a(((gful_cronetEngineProvider)new bxss(executor0)), this.a.b);
        return new bxsy(this.b, bxsx0);
    }

    public final bxsy p(long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        return new bxsy(gmbu.q(this.b, v, timeUnit0, scheduledExecutorService0), this.a);
    }
}

