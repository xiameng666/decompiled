import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

final class bcqw {
    final Context a;
    final ayud b;
    final boolean c;
    final AtomicBoolean d;
    final faik e;

    public bcqw(Context context0, ayud ayud0, faik faik0) {
        boolean z = hrel.a.b().h();
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.a = context0;
        this.b = ayud0;
        this.e = faik0;
        if(z) {
            this.a();
            faik0.ct(() -> {
                evql evql0 = this.e.cp();
                evql0.b(new bcqt(this));
                evql0.A(new bcqu(this));
            });
        }
    }

    // Detected as a lambda impl.
    public final void a() {
        evql evql0 = this.e.cp();
        evql0.b(new bcqt(this));
        evql0.A(new bcqu(this));
    }
}

