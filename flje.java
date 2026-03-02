import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flje implements gfsi {
    public final fljw a;
    public final AccountContext b;
    public final flqw c;

    public flje(fljw fljw0, AccountContext accountContext0, flqw flqw0) {
        this.a = fljw0;
        this.b = accountContext0;
        this.c = flqw0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(Boolean.TRUE.equals(((Boolean)object0))) {
            UUID uUID0 = UUID.randomUUID();
            flzs flzs0 = new flzs(this.b);
            gmcd gmcd0 = this.a.j.b.d.f();
            this.a.j.b.b(uUID0, flzs0, gmcd0, this.b, this.c, false).hB(new fljh(this.a, this.b), gmap.a);
            return new flcc(1);
        }
        return new flcc(2);
    }
}

