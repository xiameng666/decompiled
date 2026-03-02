import android.content.Context;
import android.graphics.drawable.Icon;

public final class ctwd {
    private final gfvb a;

    public ctwd() {
        this.a = new gfvh().b();
    }

    public final ByteString a(Icon icon0, Context context0) {
        ibuq.f(icon0, "icon");
        ibuq.f(context0, "context");
        if(ctwd.b(icon0)) {
            String s = icon0.getResPackage();
            ibuq.e(s, "getResPackage(...)");
            ctwc ctwc0 = new ctwc(s, icon0.getResId());
            ByteString hfsf0 = (ByteString)this.a.d(ctwc0);
            if(hfsf0 != null) {
                return hfsf0;
            }
        }
        ByteString hfsf1 = ctwb.a(icon0.loadDrawable(context0), 0xC0, 0xC0);
        if(ctwd.b(icon0)) {
            String s1 = icon0.getResPackage();
            ibuq.e(s1, "getResPackage(...)");
            ctwc ctwc1 = new ctwc(s1, icon0.getResId());
            this.a.h(ctwc1, hfsf1);
        }
        return hfsf1;
    }

    private static final boolean b(Icon icon0) {
        return icon0.getType() == 2;
    }
}

