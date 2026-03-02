import android.content.Context;
import com.google.android.gms.mdns.MdnsSearchOptions;
import j..util.Objects;

final class cqsp extends cqsq {
    final MdnsSearchOptions a;
    final cqss b;
    final cqst c;

    public cqsp(cqst cqst0, azug azug0, MdnsSearchOptions mdnsSearchOptions0, cqss cqss0) {
        this.a = mdnsSearchOptions0;
        this.b = cqss0;
        Objects.requireNonNull(cqst0);
        this.c = cqst0;
        super("startOrUpdateSearch", azug0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        this.c.a(this.a).a(this.c.b, this.b, this.a);
    }
}

