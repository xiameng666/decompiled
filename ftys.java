import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;

public final class ftys implements ibts {
    public final fryg a;
    public final frxt b;
    public final Context c;

    public ftys(fryg fryg0, frxt frxt0, Context context0) {
        this.a = fryg0;
        this.b = frxt0;
        this.c = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((txx)object0), "builder");
        txx txx0 = (txx)((txx)object0).w(false);
        fryg fryg0 = this.a;
        uoq uoq0 = txx0.a(new ftyx(fryg0, this.b));
        Integer integer0 = fryg0.a;
        if(integer0 != null) {
            uoq0 = uoq0.K(integer0.intValue());
        }
        frxy frxy0 = fryg0.c;
        if(frxy0 != null) {
            Context context0 = this.c;
            if((frxy0 instanceof frxx)) {
                return (txx)((txx)uoq0).D(context0.getDrawable(((frxx)frxy0).a));
            }
            if(!(frxy0 instanceof frxw)) {
                throw new ibnq();
            }
            Resources resources0 = context0.getResources();
            ibuq.e(resources0, "getResources(...)");
            return (txx)((txx)uoq0).D(new BitmapDrawable(resources0, ((frxw)frxy0).a));
        }
        return (txx)uoq0;
    }
}

