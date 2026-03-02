import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class czak extends czfy {
    final czbf a;
    private final azvd b;
    private final String c;

    public czak(czbf czbf0, azvd azvd0, String s) {
        Objects.requireNonNull(czbf0);
        this.a = czbf0;
        super();
        this.b = azvd0;
        this.c = s;
    }

    @Override  // czfz
    public final void a(int v) {
        Status status0 = czbf.s(v);
        if(status0.e()) {
            this.b.b(status0);
            this.a.b = this.c;
            return;
        }
        this.b.a(status0);
    }
}

