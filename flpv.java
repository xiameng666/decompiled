import android.database.Cursor;
import java.util.concurrent.Callable;

public final class flpv implements Callable {
    public final flqa a;

    public flpv(flqa flqa0) {
        this.a = flqa0;
    }

    @Override
    public final Object call() {
        try(Cursor cursor0 = this.a.d.h(this.a.c.c, this.a.c.d, this.a.c.e, this.a.c.f, this.a.c.g, this.a.c.i)) {
            return this.a.c.a.apply(cursor0);
        }
    }
}

