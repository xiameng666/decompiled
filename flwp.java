import android.graphics.Color;

public final class flwp {
    public static int a(hjie hjie0) {
        int v = flwp.d(hjie0.c);
        int v1 = flwp.d(hjie0.d);
        int v2 = flwp.d(hjie0.e);
        return (hjie0.b & 1) == 0 ? Color.rgb(v, v1, v2) : Color.argb(flwp.d((hjie0.f == null ? hftk.a : hjie0.f).b), v, v1, v2);
    }

    public static hjie b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjie.a).v_newBuilder();
        float f = flwp.c(Color.red(v));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjie)hftp0.b_message).c = f;
        float f1 = flwp.c(Color.green(v));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjie)hftp0.b_message).d = f1;
        float f2 = flwp.c(Color.blue(v));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjie)hftp0.b_message).e = f2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hftk.a).v_newBuilder();
        float f3 = flwp.c(Color.alpha(v));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hftk)hftp1.b_message).b = f3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjie hjie0 = (hjie)hftp0.b_message;
        hftk hftk0 = (hftk)hftp1.N_build();
        hftk0.getClass();
        hjie0.f = hftk0;
        hjie0.b |= 1;
        return (hjie)hftp0.N_build();
    }

    private static float c(int v) {
        return ((float)v) / 255.0f;
    }

    private static int d(float f) {
        if((f <= 1.0f)) {
            f *= 255.0f;
        }
        if(((int)f) < 0) {
            return 0;
        }
        return ((int)f) <= 0xFF ? ((int)f) : 0xFF;
    }
}

