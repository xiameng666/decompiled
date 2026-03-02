import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;

final class epli extends ibsl implements ibtw {
    int a;
    final eplj b;

    public epli(eplj eplj0, ibrl ibrl0) {
        this.b = eplj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epli)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epli(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Preference preference0 = this.b.iO("account_list");
            ibuq.c(preference0);
            this.a = 1;
            if(this.b.K(((PreferenceCategory)preference0), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

