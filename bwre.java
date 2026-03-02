import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.GetOptions;
import com.google.firebase.appindexing.internal.Thing;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bwre extends bwsu {
    final String a;
    final GetOptions b;
    final bwqt c;
    final String[] d;
    final goqo e;
    final goqq f;

    public bwre(goqq goqq0, bwtu bwtu0, bwry bwry0, bwts bwts0, bwsx bwsx0, String s, GetOptions getOptions0, bwqt bwqt0, String[] arr_s, goqo goqo0) {
        this.a = s;
        this.b = getOptions0;
        this.c = bwqt0;
        this.d = arr_s;
        this.e = goqo0;
        Objects.requireNonNull(goqq0);
        this.f = goqq0;
        super(bwry0, bwts0, bwsx0, true);
    }

    @Override  // bwsu
    protected final Object a() {
        goqq goqq0 = this.f;
        String s = this.a;
        List list0 = goqq0.e(s);
        if(this.b.b) {
            Thing thing0 = goqq0.d(this.c, list0, s, this.d[0]);
            if(thing0 != null) {
                return Arrays.asList(new Thing[]{thing0});
            }
        }
        Object object0 = goqq0.f(list0, this.d);
        return ((List)object0).isEmpty() ? Collections.EMPTY_LIST : object0;
    }

    @Override  // bwsu
    protected final void b(Status status0, Object object0) {
        this.e.a(status0, ((List)object0));
    }
}

