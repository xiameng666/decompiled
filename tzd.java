import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

final class tzd implements icih {
    final tzh a;

    public tzd(tzh tzh0) {
        this.a = tzh0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(((lpf)object0).a(lpf.d)) {
            Drawable drawable0 = (Drawable)this.a.e.a();
            if(drawable0 != null && (drawable0 instanceof Animatable)) {
                ((Animatable)drawable0).start();
                return ibom.a;
            }
        }
        else {
            Drawable drawable1 = (Drawable)this.a.e.a();
            if(drawable1 != null && (drawable1 instanceof Animatable)) {
                ((Animatable)drawable1).stop();
            }
        }
        return ibom.a;
    }
}

