import android.content.Context;
import java.util.Set;

public final class gydl extends gyjc {
    private final Context a;

    public gydl(Context context0) {
        this.a = context0;
    }

    @Override  // gyjc
    protected final gyjp a(gyhn gyhn0) {
        if((gyhn0.b & 16) != 0) {
            String s = gyin.a((gyhn0.f == null ? gyho.a : gyhn0.f).c.toByteArray());
            return new gydk(this.a, s);
        }
        return null;
    }

    @Override  // gyjc
    protected final gyjp b(gyhn gyhn0, Set set0) {
        if(((gyhn0.f == null ? gyho.a : gyhn0.f).b & 1) != 0) {
            String s = gyin.a((gyhn0.f == null ? gyho.a : gyhn0.f).c.toByteArray());
            for(Object object0: set0) {
                gyjp gyjp0 = (gydk)object0;
                if(gyjp0.a.equals(s)) {
                    return gyjp0;
                }
            }
            return null;
        }
        if(((gyhn0.d == null ? gyhr.a : gyhn0.d).b & 1) != 0) {
            for(Object object1: set0) {
                gyjp gyjp1 = (gydk)object1;
                if(((ProtoLiteMessage)(gyhn0.d == null ? gyhr.a : gyhn0.d)).equals(((gydk)gyjp1).b())) {
                    return gyjp1;
                }
            }
        }
        return null;
    }
}

