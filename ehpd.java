import android.content.Context;

public final class ehpd extends lsl {
    private final Context a;

    public ehpd(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // lsl
    public final lsb b(Class class0, ltx ltx0) {
        ibuq.f(class0, "modelClass");
        Context context0 = this.a;
        Context context1 = context0.getApplicationContext();
        ibuq.e(context1, "getApplicationContext(...)");
        ehmg ehmg0 = new ehmg(context1);
        bcyf bcyf0 = new bcyf(context0);
        Context context2 = context0.getApplicationContext();
        ibuq.e(context2, "getApplicationContext(...)");
        ehlk.a(context2);
        ehlw ehlw0 = new ehlw(bcyf0);
        ehpn ehpn0 = ehpn.a;
        ehpb ehpb0 = new ehpb(ehpn0);
        Object object0 = ltx0.a(lsl.d);
        ibuq.c(object0);
        ibuq.f(((String)object0), "key");
        hgiq hgiq0 = hgiq.b(Integer.parseInt(((String)object0)));
        if(hgiq0 == null) {
            throw new IllegalArgumentException("Invalid service ID key " + ((String)object0));
        }
        Object object1 = class0.cast(new ehpa(ehmg0, ehlw0, ehpb0, hgiq0, new ehpc(ehpn0), bbpj.a(context0)));
        ibuq.c(object1);
        return (lsb)object1;
    }
}

