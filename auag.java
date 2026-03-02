import android.net.Network;
import java.net.InetAddress;

public final class auag {
    public InetAddress a;
    public int b;
    public Integer c;
    public Network d;
    public byte e;

    public final auah a() {
        if(this.e == 1) {
            InetAddress inetAddress0 = this.a;
            if(inetAddress0 != null) {
                return new auah(inetAddress0, this.b, this.c, this.d);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" inetAddress");
        }
        if(this.e == 0) {
            stringBuilder0.append(" port");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

