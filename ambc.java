import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ambc implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        SafeParcelable safeParcelable0 = bauc.a(Base64.decode(persistableBundle0.getString("frpSnapshot", null), 1), FrpSnapshot.CREATOR);
        ibuq.e(safeParcelable0, "deserializeFromBytes(...)");
        return new ambd(((FrpSnapshot)safeParcelable0));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

