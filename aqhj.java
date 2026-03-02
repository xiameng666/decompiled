import java.util.Collection;
import java.util.Set;

public final class aqhj {
    private static final ggdp a;
    private static final ggdp b;

    static {
        ggdh ggdh0 = new ggdh();
        ggdh0.put(aqfx.b, "contacts");
        ggdh0.put(aqfx.c, "photos");
        ggdh0.put(aqfx.d, "downloads");
        ggdh0.put(aqfx.e, "documents");
        ggdh0.put(aqfx.f, "music");
        ggdh0.put(aqfx.g, "appdata");
        ggdh0.put(aqfx.h, "apk");
        ggdh0.put(aqfx.i, "mms_attachments");
        ggdh0.put(aqfx.k, "android_messages");
        ggdh0.put(aqfx.j, "wallet");
        Set set0 = ggdh0.entrySet();
        ggdn ggdn0 = new ggdn(((set0 instanceof Collection) ? set0.size() : 4));
        ggdn0.e(set0);
        ggdp ggdp0 = ggdn0.a();
        aqhj.a = ggdp0;
        aqhj.b = ((ggmz)ggdp0).d;
    }

    public static aqfx a(asbk asbk0) {
        if((asbk0.b & 2) != 0) {
            aqfx aqfx0 = aqfx.b(asbk0.d);
            return aqfx0 == null ? aqfx.a : aqfx0;
        }
        return (aqfx)aqhj.b.get(asbk0.c);
    }

    public static ProtoLiteBuilder b(aqfx aqfx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asbk)hftp0.b_message).d = aqfx0.q;
        ((asbk)hftp0.b_message).b |= 2;
        ggdp ggdp0 = aqhj.a;
        if(ggdp0.containsKey(aqfx0)) {
            String s = (String)ggdp0.get(aqfx0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asbk asbk0 = (asbk)hftp0.b_message;
            s.getClass();
            asbk0.b |= 1;
            asbk0.c = s;
        }
        return hftp0;
    }
}

