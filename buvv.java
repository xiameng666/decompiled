import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;

public final class buvv extends ibsl implements ibts {
    int a;
    final GoogleSettingsEntryChimeraContentProvider b;
    final Bundle c;

    public buvv(GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, Bundle bundle0, ibrl ibrl0) {
        this.b = googleSettingsEntryChimeraContentProvider0;
        this.c = bundle0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buvv(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.d(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Icon)object0) != null) {
            this.c.putParcelable("com.android.settings.icon_raw", ((Icon)object0));
            return ibom.a;
        }
        this.c.putInt("com.android.settings.icon", avyq.a(this.b.getContext(), 0x7F080586));  // drawable:gs_google_vd_24
        this.c.putString("com.android.settings.icon_package", "com.google.android.gms");
        return ibom.a;
    }
}

