import com.google.android.gms.common.Feature;
import java.util.concurrent.Executor;

final class air implements afy {
    private final acik a;
    private final Executor b;

    public air(acik acik0, Executor executor0) {
        this.a = acik0;
        this.b = executor0;
    }

    @Override  // afy
    public final gmcd a() {
        batl.m(((boolean)(this.a.i ^ 1)), "SearchResults has already been closed");
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acii(this.a);
        azzc0.d = 0x759F;
        azzd azzd0 = azzc0.a();
        return ajj.a(this.a.a.iG(azzd0), new aiq(), this.b);
    }

    @Override  // afy
    public final void close() {
        this.a.close();
    }
}

