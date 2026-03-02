import j..util.Objects;
import java.util.Map;

final class gyfw extends gxum {
    final gyga a;

    public gyfw(gyga gyga0) {
        Objects.requireNonNull(gyga0);
        this.a = gyga0;
        super("FastPairScanner_loseEverything");
    }

    @Override
    public final void run() {
        gyga gyga0 = this.a;
        gxuf gxuf0 = gyga0.b;
        if(gxuf0 != null) {
            gxuf0.h(gyga0.e);
        }
        Map map0 = gyga0.c;
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            gyfy gyfy0 = gyga0.d;
            if(gyfy0 != null) {
                gyfy0.b(s);
            }
        }
        map0.clear();
    }
}

