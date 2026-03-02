import android.os.Message;
import android.text.TextUtils;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class gpsf implements Runnable {
    final gpsh a;
    private final gprk b;
    private final List c;
    private final List d;
    private final boolean e;
    private final List f;
    private final boolean g;

    public gpsf(gpsh gpsh0, gprk gprk0, Collection collection0, Collection collection1, boolean z, Collection collection2, boolean z1) {
        Objects.requireNonNull(gpsh0);
        this.a = gpsh0;
        super();
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.d = arrayList1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.b = gprk0;
        arrayList0.addAll(collection0);
        arrayList1.addAll(collection1);
        this.e = z;
        arrayList2.addAll(collection2);
        this.g = z1;
    }

    @Override
    public final void run() {
        gpse gpse0;
        try {
            gpse0 = new gpql(this.a.c, this.a.a, this.d, this.b, this.g, this.e, this.c, this.a.f, this.f).a();
        }
        catch(RuntimeException runtimeException0) {
            String s = String.format("Failed to run EnqueueMdnsQueryCallable for subtype: %s", TextUtils.join(",", this.d));
            gpqn.b(this.a.f, s, runtimeException0);
            gpse0 = gpse.a(this.b);
        }
        Message message0 = this.a.g.obtainMessage(2, gpse0);
        this.a.g.sendMessage(message0);
    }
}

