import android.content.Context;
import java.util.Objects;

public final class ehom implements lsk {
    private final Context a;
    private final hgiq b;

    public ehom(Context context0, hgiq hgiq0) {
        ibuq.f(context0, "context");
        ibuq.f(hgiq0, "userServiceId");
        super();
        this.a = context0;
        this.b = hgiq0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        ibuq.f(class0, "modelClass");
        Context context0 = this.a.getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        ehmg ehmg0 = new ehmg(context0);
        Context context1 = this.a.getApplicationContext();
        ibuq.e(context1, "getApplicationContext(...)");
        ehmc ehmc0 = new ehmc(context1, bbds.a(context1));
        bcyf bcyf0 = new bcyf(this.a);
        Context context2 = this.a.getApplicationContext();
        ibuq.e(context2, "getApplicationContext(...)");
        ehlk.a(context2);
        ehlw ehlw0 = new ehlw(bcyf0);
        ehok ehok0 = new ehok(ehpn.a);
        ehol ehol0 = new ehol(ehpn.a);
        lsb lsb0 = (lsb)class0.cast(new ehoq(this.a, ehmg0, ehmc0, ehlw0, this.b, ehok0, ehol0));
        if(lsb0 != null) {
            return lsb0;
        }
        Objects.toString(class0);
        throw new IllegalArgumentException("Illegal ViewModel class: " + class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return lsi.c(this, class0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

