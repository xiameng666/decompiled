import android.content.Context;
import j..util.Objects;

final class cqsr extends cqsq {
    final cqss a;

    public cqsr(cqss cqss0, azug azug0) {
        Objects.requireNonNull(cqss0);
        this.a = cqss0;
        super("stopSearch", azug0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        this.a.a.b(this.a.b.b, this.a);
    }
}

