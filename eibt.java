import android.graphics.Bitmap;
import android.os.Looper;
import androidx.preference.Preference;
import j..util.Objects;

final class eibt implements ohi {
    final eibv a;

    public eibt(eibv eibv0) {
        Objects.requireNonNull(eibv0);
        this.a = eibv0;
        super();
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        alm alm1;
        boolean z = ((Boolean)object0).booleanValue();
        eibv eibv0 = this.a;
        if(eibv0.g == 0) {
            throw null;
        }
        if(!z) {
            eibv0.c(((Boolean)object0).booleanValue());
            cjbx cjbx0 = eibv0.e;
            ohv ohv0 = eibv0.a;
            if(cjbx.h(ohv0.requireContext())) {
                all all0 = cjbx.a(ohv0.requireContext());
                alm alm0 = eibv0.d;
                int v = alm0.a;
                if(v != -1 && v != 0) {
                    all0.a = v;
                }
                Bitmap bitmap0 = alm0.b;
                if(bitmap0 != null) {
                    all0.b = bitmap0;
                }
                String s = alm0.c;
                if(s != null) {
                    all0.c = s;
                }
                alm1 = all0.a();
            }
            else {
                alm1 = eibv0.d;
            }
            if(cjbx0 != null) {
                new clht(Looper.getMainLooper()).post(new eibr(cjbx0, alm1));
            }
            return false;
        }
        return eibv0.c.a(true);
    }
}

