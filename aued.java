import android.content.Context;
import android.media.session.MediaController;

public final class aued implements ibts {
    public final Context a;
    public final aueg b;

    public aued(Context context0, aueg aueg0) {
        this.a = context0;
        this.b = aueg0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((MediaController)object0), "it");
        ibuq.c(this.a);
        String s = ((MediaController)object0).getPackageName();
        ibuq.e(s, "getPackageName(...)");
        boolean z = true;
        if(aufd.f(this.a, s)) {
            if(!riq.a()) {
                String s1 = ((MediaController)object0).getPackageName();
                ibuq.e(s1, "getPackageName(...)");
                return this.b.c(s1) ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

