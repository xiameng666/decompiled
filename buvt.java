import android.os.Bundle;
import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;

public final class buvt extends ibsl implements ibts {
    Object a;
    Object b;
    int c;
    final Bundle d;
    final GoogleSettingsEntryChimeraContentProvider e;

    public buvt(Bundle bundle0, GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, ibrl ibrl0) {
        this.d = bundle0;
        this.e = googleSettingsEntryChimeraContentProvider0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buvt(this.d, this.e, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            ((Bundle)object3).putString(((String)object2), ((String)object0));
            return ibom.a;
        }
        ibnx.b(object0);
        Bundle bundle0 = this.d;
        this.a = bundle0;
        this.b = "com.android.settings.title";
        this.c = 1;
        Object object4 = this.e.f(this);
        if(object4 != object1) {
            object0 = object4;
            object3 = bundle0;
            object2 = "com.android.settings.title";
            ((Bundle)object3).putString(((String)object2), ((String)object0));
            return ibom.a;
        }
        return object1;
    }
}

