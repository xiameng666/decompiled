import android.content.Context;
import java.util.Set;
import java.util.UUID;

public final class gyea extends gyjc {
    public static final UUID a;
    private final bsaq b;

    static {
        gyea.a = UUID.fromString("87a0a8a8-a12b-4d0e-bd8c-97c9eba167cd");
    }

    public gyea(Context context0) {
        this.b = cumz.e(context0, "BluetoothRfcommConnectionFactory");
    }

    @Override  // gyjc
    protected final gyjp a(gyhn gyhn0) {
        if((gyhn0.b & 4) != 0) {
            batl.s(this.b);
            return new gydz(new gyeb(this.b, gyin.a((gyhn0.e == null ? gyhp.a : gyhn0.e).c.toByteArray()), gyea.a));
        }
        return null;
    }

    @Override  // gyjc
    protected final gyjp b(gyhn gyhn0, Set set0) {
        if(((gyhn0.e == null ? gyhp.a : gyhn0.e).b & 1) != 0) {
            String s = gyin.a((gyhn0.e == null ? gyhp.a : gyhn0.e).c.toByteArray());
            for(Object object0: set0) {
                gyjp gyjp0 = (gydz)object0;
                if(((gydz)gyjp0).i().equals(s)) {
                    return gyjp0;
                }
            }
            return null;
        }
        if(((gyhn0.d == null ? gyhr.a : gyhn0.d).b & 1) != 0) {
            for(Object object1: set0) {
                gyjp gyjp1 = (gydz)object1;
                if(((ProtoLiteMessage)(gyhn0.d == null ? gyhr.a : gyhn0.d)).equals(((gydz)gyjp1).b())) {
                    return gyjp1;
                }
            }
        }
        return null;
    }
}

