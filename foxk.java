import android.app.Activity;

final class foxk {
    public final fokg a;

    public foxk() {
        throw null;
    }

    public foxk(fokg fokg0) {
        this.a = fokg0;
    }

    static foxk a(Activity activity0) {
        return new foxk(new fokg(activity0.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof foxk) && this.b().equals(((foxk)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode() * 0x1F ^ 0x4CF;
    }

    @Override
    public final String toString() {
        return a.a(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }
}

