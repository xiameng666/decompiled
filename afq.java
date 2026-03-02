import androidx.appsearch.safeparcel.PackageIdentifierParcel;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class afq {
    private List a;
    private List b;
    private PackageIdentifierParcel c;
    private boolean d;

    public afq() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final afr a() {
        this.d = true;
        return new afr(this.a, this.b, this.c);
    }

    public final void b(afj afj0) {
        Objects.requireNonNull(afj0);
        this.e();
        this.a.add(afj0.a);
    }

    public final void c(Set set0) {
        Objects.requireNonNull(set0);
        this.e();
        this.b.add(new agg(set0));
    }

    public final void d(afj afj0) {
        this.e();
        this.c = afj0 == null ? null : afj0.a;
    }

    private final void e() {
        if(this.d) {
            this.a = new ArrayList(this.a);
            this.b = new ArrayList(this.b);
            this.d = false;
        }
    }
}

