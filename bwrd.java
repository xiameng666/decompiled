import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;
import j..util.Objects;
import java.util.List;

public final class bwrd extends bwsu {
    final GetIndexableRequest a;
    final bwqt b;
    final goqo c;
    final goqq d;

    public bwrd(goqq goqq0, bwtu bwtu0, bwry bwry0, bwts bwts0, bwsx bwsx0, GetIndexableRequest getIndexableRequest0, bwqt bwqt0, goqo goqo0) {
        this.a = getIndexableRequest0;
        this.b = bwqt0;
        this.c = goqo0;
        Objects.requireNonNull(goqq0);
        this.d = goqq0;
        super(bwry0, bwts0, bwsx0, true);
    }

    @Override  // bwsu
    protected final Object a() {
        goqq goqq0 = this.d;
        List list0 = goqq0.e(this.a.b);
        String s = this.a.a;
        Object object0 = goqq0.d(this.b, list0, this.a.b, s);
        if(object0 != null) {
            return object0;
        }
        List list1 = goqq0.f(list0, new String[]{s});
        return list1.isEmpty() ? null : ((Thing)list1.get(0));
    }

    @Override  // bwsu
    protected final void b(Status status0, Object object0) {
        GetIndexableResponse getIndexableResponse0 = new GetIndexableResponse(status0, ((Thing)object0));
        this.c.c(getIndexableResponse0);
    }
}

