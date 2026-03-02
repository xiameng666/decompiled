import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;

public final class buwd extends ibsl implements ibts {
    int a;
    final GoogleSettingsEntryChimeraContentProvider b;

    public buwd(GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, ibrl ibrl0) {
        this.b = googleSettingsEntryChimeraContentProvider0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buwd(this.b, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        long v1 = htvb.b();
        this.a = 1;
        Object object2 = this.b.b(v1, this);
        return object2 == object1 ? object1 : object2;
    }
}

