import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.PersistableBundle;
import com.android.onboarding.utils.persistable.PersistableIntent;
import java.util.Set;

public final class sdm implements Parcelable.Creator, sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return sdm.e(persistableBundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "source");
        Object object0 = Intent.CREATOR.createFromParcel(parcel0);
        ibuq.e(object0, "createFromParcel(...)");
        return new PersistableIntent(((Intent)object0));
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "value");
        return new PersistableIntent(intent0).a();
    }

    public static final PersistableIntent e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("ACTION");
        String s1 = persistableBundle0.getString("TYPE");
        String s2 = persistableBundle0.getString("PACKAGE");
        String s3 = persistableBundle0.getString("COMPONENT_NAME");
        Set set0 = null;
        ComponentName componentName0 = s3 == null ? null : ComponentName.unflattenFromString(s3);
        int v = persistableBundle0.getInt("FLAGS");
        String s4 = persistableBundle0.getString("DATA");
        Uri uri0 = s4 == null ? null : Uri.parse(s4);
        String[] arr_s = persistableBundle0.getStringArray("CATEGORIES");
        if(arr_s != null) {
            set0 = ibpg.Q(arr_s);
        }
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("EXTRAS");
        if(persistableBundle1 == null) {
            persistableBundle1 = new PersistableBundle();
        }
        return new PersistableIntent(s, s1, persistableBundle1, s2, componentName0, set0, v, uri0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PersistableIntent[v];
    }
}

