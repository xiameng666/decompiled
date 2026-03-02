import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class bvwy {
    private static final bboh a;
    private final Context b;
    private final String c;

    static {
        bvwy.a = bboh.b("UiFlow", bbcu.ff);
    }

    public bvwy(Context context0, String s) {
        ibuq.f(context0, "context");
        ibuq.f(s, "runtimePackageName");
        super();
        this.b = context0;
        this.c = s;
    }

    public final Drawable a(String s) {
        ibuq.f(s, "name");
        Integer integer0 = this.e(s, this.c);
        if(integer0 == null) {
            integer0 = this.e(s, "android");
        }
        if(integer0 != null) {
            int v = integer0.intValue();
            try {
                return this.b.getDrawable(v);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                a.ae(bvwy.a.j(), "Could not load drawable resource", resources$NotFoundException0);
            }
        }
        return null;
    }

    public final View b(String s, View view0) {
        ibuq.f(s, "name");
        ibuq.f(view0, "parent");
        Integer integer0 = this.c(s);
        return integer0 == null ? null : view0.findViewById(integer0.intValue());
    }

    public final Integer c(String s) {
        ibuq.f(s, "name");
        return bvwy.d(this, s, "id");
    }

    public static Integer d(bvwy bvwy0, String s, String s1) {
        return bvwy0.f(s, s1, bvwy0.c);
    }

    private final Integer e(String s, String s1) {
        return this.f(s, "drawable", s1);
    }

    private final Integer f(String s, String s1, String s2) {
        int v = this.b.getResources().getIdentifier(s, s1, s2);
        if(v == 0) {
            ((ggtj)bvwy.a.j()).x("Could not find resource");
            return null;
        }
        return v;
    }
}

