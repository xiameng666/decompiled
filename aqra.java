import android.os.UserHandle;
import java.util.Random;

public final class aqra {
    public static int a() {
        return new Random().nextInt(0x7FFFFFFE) + 1;
    }

    public static ProtoLiteBuilder b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(hqmr.a.b().d()) {
            int v = UserHandle.myUserId();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            ghys0.b |= 2;
            ghys0.f = v;
        }
        return hftp0;
    }
}

