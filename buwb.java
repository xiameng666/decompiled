import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;

public final class buwb extends ibsl implements ibts {
    int a;
    final GoogleSettingsEntryChimeraContentProvider b;
    final long c;

    public buwb(GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, long v, ibrl ibrl0) {
        this.b = googleSettingsEntryChimeraContentProvider0;
        this.c = v;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buwb(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
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
        Object object2 = this.b.g(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

