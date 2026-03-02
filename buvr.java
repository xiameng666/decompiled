import android.os.Bundle;
import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;

final class buvr extends ibsl implements ibtw {
    int a;
    final GoogleSettingsEntryChimeraContentProvider b;
    final String c;
    final String d;
    final Bundle e;

    public buvr(GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, String s, String s1, Bundle bundle0, ibrl ibrl0) {
        this.b = googleSettingsEntryChimeraContentProvider0;
        this.c = s;
        this.d = s1;
        this.e = bundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buvr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buvr(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.j(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

