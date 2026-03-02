import androidx.preference.PreferenceCategory;
import com.google.android.gms.significantplaces.settings.DeletablePlacePreference;
import java.util.List;

final class epmf extends ibsl implements ibtw {
    Object a;
    final epmi b;

    public epmf(epmi epmi0, ibrl ibrl0) {
        this.b = epmi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmf)this.c(((List)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epmf(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        List list0 = (List)this.a;
        epmi epmi0 = this.b;
        PreferenceCategory preferenceCategory0 = epmi0.d;
        if(preferenceCategory0 == null) {
            ibuq.j("trustedPlacesListPreference");
            preferenceCategory0 = null;
        }
        preferenceCategory0.ah();
        for(Object object1: list0) {
            PreferenceCategory preferenceCategory1 = epmi0.d;
            if(preferenceCategory1 == null) {
                ibuq.j("trustedPlacesListPreference");
                preferenceCategory1 = null;
            }
            preferenceCategory1.am(new DeletablePlacePreference(epmi0.requireContext(), ((epng)object1)));
        }
        return ibom.a;
    }
}

