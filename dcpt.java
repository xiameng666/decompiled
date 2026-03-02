import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import j..time.Duration;
import java.util.List;

public final class dcpt {
    public static dcou A(gzax gzax0, int v, int v1, String s, gyzc gyzc0, boolean z, long v2, long v3, int v4) {
        dcvz.a.b().k("[ClearcutLog] ADVERTISE_DEVICE_PRESENCE_START sessionId=%s flowId=%s sessionStatus: %s, visibility: %s", Long.valueOf(v2), Long.valueOf(v3), gzar.a(v), gzax0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(8);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqg)hftv0).g = gyzc0.g;
        ((gyqg)hftv0).b |= 0x40;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyqg)hftv1).c = gzax0.g;
        ((gyqg)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyqg)hftv2).d = v - 1;
        ((gyqg)hftv2).b |= 4;
        int v5 = dcpt.J(v1);
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyqg)hftv3).e = v5 - 1;
        ((gyqg)hftv3).b |= 8;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gyqg)hftv4).b |= 0x80;
        ((gyqg)hftv4).h = z;
        if(s != null) {
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqg gyqg0 = (gyqg)hftp1.b_message;
            gyqg0.b |= 0x20;
            gyqg0.f = s;
        }
        gyqg gyqg1 = (gyqg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqg1.getClass();
        gysp0.k = gyqg1;
        gysp0.b |= 0x100;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((gyqv)hftv5).b |= 0x20;
        ((gyqv)hftv5).h = v2;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp2.b_message;
        ((gyqv)hftv6).b |= 16;
        ((gyqv)hftv6).g = v3;
        if(!hftv6.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v4;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou B(long v, int v1, ShareTarget shareTarget0, long v2, int v3, Duration duration0) {
        dcvz.a.b().k("[ClearcutLog] ESTABLISH_CONNECTION sessionId=%s flowId=%s status: %s shareTarget: %s", Long.valueOf(v), Long.valueOf(v2), gyzt.c(v1), shareTarget0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(49);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).e = 0x30;
        ((gysp)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqu)hftv0).b |= 2;
        ((gyqu)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyqu)hftp1.b_message).c = v1 - 1;
        ((gyqu)hftp1.b_message).b |= 1;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        gysc0.getClass();
        ((gyqu)hftv1).h = gysc0;
        ((gyqu)hftv1).b |= 0x20;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyqu gyqu0 = (gyqu)hftp1.b_message;
        gyqu0.b |= 0x100;
        gyqu0.j = true;
        if(duration0 != null) {
            hfst hfst0 = hfyg.a(duration0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqu gyqu1 = (gyqu)hftp1.b_message;
            hfst0.getClass();
            gyqu1.k = hfst0;
            gyqu1.b |= 0x200;
        }
        gyqu gyqu2 = (gyqu)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqu2.getClass();
        gysp0.W = gyqu2;
        gysp0.c |= 0x200000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyqv)hftv2).b |= 0x20;
        ((gyqv)hftv2).h = v;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gyqv)hftv3).b |= 16;
        ((gyqv)hftv3).g = v2;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v3;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou C(int v, int v1) {
        dcvz.a.b().i("[ClearcutLog] INSTALL_APK status: %s, source: %s", Integer.toString(v - 1), gyze.a(v1));
        ProtoLiteBuilder hftp0 = dcpt.L(41);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrc gyrc0 = (gyrc)hftp1.b_message;
        hfuf hfuf0 = gyrc0.b;
        if(!hfuf0.c()) {
            gyrc0.b = ProtoLiteMessage.C(hfuf0);
        }
        gyrc0.b.i(v - 1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrc gyrc1 = (gyrc)hftp1.b_message;
        hfuf hfuf1 = gyrc1.c;
        if(!hfuf1.c()) {
            gyrc1.c = ProtoLiteMessage.C(hfuf1);
        }
        gyrc1.c.i(v1 - 1);
        gyrc gyrc2 = (gyrc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrc2.getClass();
        gysp0.N = gyrc2;
        gysp0.c |= 0x800;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou D(int v, long v1, boolean z, long v2, int v3) {
        dcvz.a.b().j("[ClearcutLog] RESPOND_TO_INTRODUCTION sessionId=%s flowId=%s action: %s", Long.valueOf(v1), Long.valueOf(v2), Integer.toString(v - 1));
        ProtoLiteBuilder hftp0 = dcpt.L(15);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrq)hftv0).c = v - 1;
        ((gyrq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrq)hftv1).b |= 2;
        ((gyrq)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrq gyrq0 = (gyrq)hftp1.b_message;
        gyrq0.b |= 4;
        gyrq0.e = z;
        gyrq gyrq1 = (gyrq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrq1.getClass();
        gysp0.r = gyrq1;
        gysp0.b |= 0x8000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyqv)hftv2).b |= 0x20;
        ((gyqv)hftv2).h = v1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gyqv)hftv3).b |= 16;
        ((gyqv)hftv3).g = v2;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v3;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou E(int v, int v1) {
        dcvz.a.b().i("[ClearcutLog] VERIFY_APK status: %s, source: %s", Integer.toString(v - 1), gyze.a(v1));
        ProtoLiteBuilder hftp0 = dcpt.L(42);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gysn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysn gysn0 = (gysn)hftp1.b_message;
        hfuf hfuf0 = gysn0.b;
        if(!hfuf0.c()) {
            gysn0.b = ProtoLiteMessage.C(hfuf0);
        }
        gysn0.b.i(v - 1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysn gysn1 = (gysn)hftp1.b_message;
        hfuf hfuf1 = gysn1.c;
        if(!hfuf1.c()) {
            gysn1.c = ProtoLiteMessage.C(hfuf1);
        }
        gysn1.c.i(v1 - 1);
        gysn gysn2 = (gysn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysn2.getClass();
        gysp0.O = gysn2;
        gysp0.c |= 0x1000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcov F(long v, int v1, ShareTarget shareTarget0, int v2, int v3, long v4, String s, gyqv gyqv0) {
        dcvz.a.b().l("[ClearcutLog] ESTABLISH_CONNECTION sessionId=%s status: %s shareTarget: %s referrer: %s durationMillis: %d", Long.valueOf(v), gyzt.c(v1), shareTarget0.toString(), s, Long.valueOf(v4));
        ProtoLiteBuilder hftp0 = dcpt.L(49);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).e = 0x30;
        ((gysp)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqu)hftv0).b |= 2;
        ((gyqu)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyqu)hftp1.b_message).c = v1 - 1;
        ((gyqu)hftp1.b_message).b |= 1;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        gysc0.getClass();
        ((gyqu)hftv1).h = gysc0;
        ((gyqu)hftv1).b |= 0x20;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyqu)hftv2).b |= 4;
        ((gyqu)hftv2).e = v2;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyqu)hftv3).b |= 8;
        ((gyqu)hftv3).f = v3;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gyqu)hftv4).b |= 16;
        ((gyqu)hftv4).g = v4;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        ((gyqu)hftv5).b |= 0x100;
        ((gyqu)hftv5).j = false;
        if(s != null) {
            if(!hftv5.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqu gyqu0 = (gyqu)hftp1.b_message;
            gyqu0.b |= 0x40;
            gyqu0.i = s;
        }
        gyqu gyqu1 = (gyqu)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        gyqu1.getClass();
        ((gysp)hftv6).W = gyqu1;
        ((gysp)hftv6).c |= 0x200000;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp0.Y = gyqv0;
        gysp0.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov G(long v, int v1, dcoz dcoz0, long v2, String s, gyqv gyqv0, boolean z, boolean z1) {
        dcvz.a.b().k("[ClearcutLog] SCAN_FOR_SHARE_TARGETS_START sessionId=%s flowId=%s status=%s referrer=%s", Long.valueOf(v), Long.valueOf(v2), gzar.a(v1), s);
        ProtoLiteBuilder hftp0 = dcpt.L(6);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrs.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrs)hftv0).b |= 1;
        ((gyrs)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrs)hftv1).d = v1 - 1;
        ((gyrs)hftv1).b |= 2;
        int v3 = z ? 5 : dcpt.P(dcoz0.a);
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyrs)hftv2).e = v3 - 1;
        ((gyrs)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyrs)hftv3).b |= 0x20;
        ((gyrs)hftv3).g = z1;
        if(s != null) {
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrs gyrs0 = (gyrs)hftp1.b_message;
            gyrs0.b |= 16;
            gyrs0.f = s;
        }
        gyrs gyrs1 = (gyrs)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrs1.getClass();
        gysp0.i = gyrs1;
        gysp0.b |= 0x40;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcow H(int v) {
        ProtoLiteBuilder hftp0 = dcpt.L(65);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyql.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyql)hftp1.b_message).c = v - 1;
        ((gyql)hftp1.b_message).b |= 1;
        gyql gyql0 = (gyql)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyql0.getClass();
        gysp0.af = gyql0;
        gysp0.d |= 0x100;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static dcow I(gzah gzah0, int v) {
        ProtoLiteBuilder hftp0 = dcpt.L(0x30);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrp)hftv0).c = gzah0.g;
        ((gyrp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyrp)hftp1.b_message).d = v - 1;
        ((gyrp)hftp1.b_message).b |= 2;
        gyrp gyrp0 = (gyrp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrp0.getClass();
        gysp0.U = gyrp0;
        gysp0.c |= 0x80000;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static int J(int v) {
        switch(v) {
            case 1: {
                return 4;
            }
            case 2: {
                return 2;
            }
            default: {
                return v == 3 ? 2 : 1;
            }
        }
    }

    public static int K() {
        switch(((int)hvqs.a.aT().w())) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            case 7: {
                return 8;
            }
            case 8: {
                return 9;
            }
            case 9: {
                return 10;
            }
            default: {
                return 1;
            }
        }
    }

    public static ProtoLiteBuilder L(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gysp.a).v_newBuilder();
        int v1 = dcpt.K();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gysp)hftv0).A = v1 - 1;
        ((gysp)hftv0).b |= 0x4000000;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).e = v - 1;
        ((gysp)hftp0.b_message).b |= 1;
        String s = hvqz.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysp0.b |= 0x80000000;
        gysp0.E = s;
        String s1 = hvqs.a.aT().dj();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).c |= 0x20000;
        ((gysp)hftp0.b_message).S = s1;
        return hftp0;
    }

    private static int M(int v) {
        return Math.min(v, 11);
    }

    private static gysc N(ShareTarget shareTarget0) {
        int v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gysc.a).v_newBuilder();
        if(shareTarget0.n) {
            v = 2;
        }
        else {
            v = shareTarget0.h ? 3 : 4;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gysc)hftv0).e = v - 1;
        ((gysc)hftv0).b |= 4;
        int v1 = shareTarget0.d;
        int v2 = dcpt.O(v1);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gysc)hftv1).c = v2 - 1;
        ((gysc)hftv1).b |= 1;
        gzad gzad0 = v1 == 3 ? gzad.c : gzad.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gysc)hftv2).d = gzad0.g;
        ((gysc)hftv2).b |= 2;
        boolean z = shareTarget0.q;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gysc)hftv3).b |= 8;
        ((gysc)hftv3).f = z;
        boolean z1 = shareTarget0.k;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysc gysc0 = (gysc)hftp0.b_message;
        gysc0.b |= 16;
        gysc0.g = z1;
        return (gysc)hftp0.N_build();
    }

    private static int O(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return v == 6 ? 7 : 1;
            }
        }
    }

    private static int P(int v) {
        if(v != 0) {
            switch(v) {
                case 2: {
                    return 4;
                }
                case 3: {
                    return 3;
                }
                case 1: 
                case 5: {
                    return 2;
                }
                default: {
                    return v == 6 ? 3 : 1;
                }
            }
        }
        return 5;
    }

    public static dcou a(long v, long v1, int v2) {
        dcvz.a.b().i("[ClearcutLog] ADVERTISE_DEVICE_PRESENCE_END sessionId=%s flowId=%s ", Long.valueOf(v), Long.valueOf(v1));
        ProtoLiteBuilder hftp0 = dcpt.L(9);
        gyqf gyqf0 = (gyqf)((ProtoLiteMessage)gyqf.a).v_newBuilder().N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqf0.getClass();
        gysp0.l = gyqf0;
        gysp0.b |= 0x200;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqv)hftv0).b |= 0x20;
        ((gyqv)hftv0).h = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyqv)hftv1).b |= 16;
        ((gyqv)hftv1).g = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp1.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v2;
        gyqv gyqv1 = (gyqv)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou b(long v, List list0, long v1, int v2) {
        dcvz.a.b().i("[ClearcutLog] OPEN_RECEIVE_ATTACHMENTS sessionId=%s flowId=%s ", Long.valueOf(v), Long.valueOf(v1));
        ProtoLiteBuilder hftp0 = dcpt.L(22);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrf.a).v_newBuilder();
        gyqi gyqi0 = dcpt.v(list0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gyqi0.getClass();
        ((gyrf)hftv0).c = gyqi0;
        ((gyrf)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrf gyrf0 = (gyrf)hftp1.b_message;
        gyrf0.b |= 2;
        gyrf0.d = v;
        gyrf gyrf1 = (gyrf)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrf1.getClass();
        gysp0.w = gyrf1;
        gysp0.b |= 0x400000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gyqv)hftv1).b |= 0x20;
        ((gyqv)hftv1).h = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyqv)hftv2).b |= 16;
        ((gyqv)hftv2).g = v1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v2;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou c(long v, gzaj gzaj0, long v1, int v2) {
        dcvz.a.b().i("[ClearcutLog] PROCESS_RECEIVED_ATTACHMENTS_END sessionId=%s flowId=%s ", Long.valueOf(v), Long.valueOf(v1));
        ProtoLiteBuilder hftp0 = dcpt.L(44);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrh.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrh)hftv0).b |= 1;
        ((gyrh)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyrh)hftp1.b_message).d = gzaj0.g;
        ((gyrh)hftp1.b_message).b |= 2;
        gyrh gyrh0 = (gyrh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrh0.getClass();
        gysp0.Q = gyrh0;
        gysp0.c |= 0x4000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gyqv)hftv1).b |= 0x20;
        ((gyqv)hftv1).h = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyqv)hftv2).b |= 16;
        ((gyqv)hftv2).g = v1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v2;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou d(long v, long v1, gyzg gyzg0, String s, ShareTarget shareTarget0, long v2, int v3, ddkk ddkk0, int v4, int v5) {
        dcvz.a.b().k("[ClearcutLog] RECEIVE_ATTACHMENTS_END sessionId=%s flowId=%s, isExternal=%s referrer=%s", Long.valueOf(v), Long.valueOf(v2), Boolean.valueOf(shareTarget0.k), s);
        ProtoLiteBuilder hftp0 = dcpt.L(19);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyri.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyri)hftv0).b |= 1;
        ((gyri)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyri)hftv1).b |= 2;
        ((gyri)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyri)hftp1.b_message).e = gyzg0.F;
        ((gyri)hftp1.b_message).b |= 4;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        gysc0.getClass();
        ((gyri)hftv2).g = gysc0;
        ((gyri)hftv2).b |= 16;
        if(s != null) {
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyri gyri0 = (gyri)hftp1.b_message;
            gyri0.b |= 8;
            gyri0.f = s;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyri)hftv3).b |= 0x100;
        ((gyri)hftv3).k = v4;
        int v6 = dcpt.J(v5);
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyri)hftp1.b_message).l = v6 - 1;
        ((gyri)hftp1.b_message).b |= 0x200;
        gyri gyri1 = (gyri)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyri1.getClass();
        gysp0.v = gyri1;
        gysp0.b |= 0x80000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        ((gyqv)hftv4).b |= 0x20;
        ((gyqv)hftv4).h = v;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((gyqv)hftv5).b |= 16;
        ((gyqv)hftv5).g = v2;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v3;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        int v7 = ddkk0.d;
        if(v7 > 0) {
            int v8 = ddkk0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp1.b_message;
            ((gyri)hftv6).b |= 0x40;
            ((gyri)hftv6).i = v8;
            int v9 = ddkk0.b;
            if(!hftv6.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyri gyri2 = (gyri)hftp1.b_message;
            gyri2.b |= 0x20;
            gyri2.h = v9;
            int v10 = dcpt.M(v7);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyri gyri3 = (gyri)hftp1.b_message;
            gyri3.b |= 0x80;
            gyri3.j = v10;
        }
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou e(long v, ShareTarget shareTarget0, List list0, long v1, int v2) {
        ProtoLiteBuilder hftp0 = dcpt.L(18);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrj gyrj0 = (gyrj)hftp1.b_message;
        gyrj0.b |= 1;
        gyrj0.c = v;
        gyqi gyqi0 = dcpt.v(list0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrj gyrj1 = (gyrj)hftp1.b_message;
        gyqi0.getClass();
        gyrj1.d = gyqi0;
        gyrj1.b |= 2;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrj gyrj2 = (gyrj)hftp1.b_message;
        gysc0.getClass();
        gyrj2.e = gysc0;
        gyrj2.b |= 4;
        gyrj gyrj3 = (gyrj)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrj3.getClass();
        gysp0.u = gyrj3;
        gysp0.b |= 0x40000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gyqv)hftv0).b |= 0x20;
        ((gyqv)hftv0).h = v;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gyqv)hftv1).b |= 16;
        ((gyqv)hftv1).g = v1;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v2;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcou f(long v, ShareTarget shareTarget0, String s, long v1, int v2) {
        dcvz.a.b().j("[ClearcutLog] RECEIVE_INTRODUCTION sessionId=%s flowId=%s shareTarget: %s", Long.valueOf(v), Long.valueOf(v1), shareTarget0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(14);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrl gyrl0 = (gyrl)hftp1.b_message;
        gyrl0.b |= 1;
        gyrl0.c = v;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gysc0.getClass();
        ((gyrl)hftv0).d = gysc0;
        ((gyrl)hftv0).b |= 2;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrl gyrl1 = (gyrl)hftp1.b_message;
            gyrl1.b |= 4;
            gyrl1.e = s;
        }
        gyrl gyrl2 = (gyrl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrl2.getClass();
        gysp0.q = gyrl2;
        gysp0.b |= 0x4000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gyqv)hftv1).b |= 0x20;
        ((gyqv)hftv1).h = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyqv)hftv2).b |= 16;
        ((gyqv)hftv2).g = v1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp2.b_message;
        gyqv0.b |= 0x40;
        gyqv0.i = v2;
        gyqv gyqv1 = (gyqv)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv1.getClass();
        gysp1.Y = gyqv1;
        gysp1.c |= 0x800000;
        return new dcou(((gysp)hftp0.N_build()));
    }

    public static dcov g(ShareTarget shareTarget0, long v, long v1, long v2, String s, gyqv gyqv0, long v3, boolean z, dcoz dcoz0) {
        cunf cunf0 = dcvz.a;
        cunf0.b().j("[ClearcutLog] DISCOVER_SHARE_TARGET sessionId=%s flowId=%s, isExternal=%s ", Long.valueOf(v), Long.valueOf(v2), Boolean.valueOf(shareTarget0.k));
        ProtoLiteBuilder hftp0 = dcpt.L(12);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqp.a).v_newBuilder();
        int v4 = 2;
        if(Long.compare(v1, 0L) >= 0) {
            hfst hfst0 = hfyf.k(v1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqp gyqp0 = (gyqp)hftp1.b_message;
            hfst0.getClass();
            gyqp0.d = hfst0;
            gyqp0.b |= 2;
        }
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gysc0.getClass();
        ((gyqp)hftv0).c = gysc0;
        ((gyqp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyqp)hftv1).b |= 4;
        ((gyqp)hftv1).e = v;
        int v5 = 5;
        if(dcoz0 == null) {
            if(z) {
                v4 = 5;
            }
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gyqp)hftp1.b_message).h = v4 - 1;
        }
        else {
            if(!z) {
                v5 = dcpt.P(dcoz0.a);
            }
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gyqp)hftp1.b_message).h = v5 - 1;
        }
        ((gyqp)hftp1.b_message).b |= 0x40;
        if(s != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqp gyqp1 = (gyqp)hftp1.b_message;
            gyqp1.b |= 16;
            gyqp1.f = s;
        }
        if(v3 >= 0L) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqp gyqp2 = (gyqp)hftp1.b_message;
            gyqp2.b |= 0x20;
            gyqp2.g = v3;
        }
        gyqp gyqp3 = (gyqp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqp3.getClass();
        gysp0.o = gyqp3;
        gysp0.b |= 0x1000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        cunf0.b().h("A new share target was discovered with latencyFromActivityStart: %s", Long.valueOf(v3));
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov h(ShareTarget shareTarget0, long v, long v1, int v2, int v3, int v4, int v5, boolean z) {
        dcvz.a.b().m("[ClearcutLog] HIGH_QUALITY_MEDIUM_SETUP duration: %d, oritinal quality: %d, medium: %d, connectionMode: %d, instantConnectionTriedCount: %d, timeout: %b", Long.valueOf(v1), Integer.valueOf(v2), Integer.valueOf(v3), Integer.valueOf(v4), Integer.valueOf(v5), Boolean.valueOf(z));
        ProtoLiteBuilder hftp0 = dcpt.L(69);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrb.a).v_newBuilder();
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gysc0.getClass();
        ((gyrb)hftv0).c = gysc0;
        ((gyrb)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrb)hftv1).b |= 2;
        ((gyrb)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyrb)hftv2).b |= 4;
        ((gyrb)hftv2).e = v1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyrb)hftv3).b |= 8;
        ((gyrb)hftv3).f = z;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gyrb)hftv4).b |= 16;
        ((gyrb)hftv4).g = v2;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        ((gyrb)hftv5).b |= 0x20;
        ((gyrb)hftv5).h = v3;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp1.b_message;
        ((gyrb)hftv6).b |= 0x40;
        ((gyrb)hftv6).i = v4;
        if(!hftv6.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrb gyrb0 = (gyrb)hftp1.b_message;
        gyrb0.b |= 0x80;
        gyrb0.j = v5;
        gyrb gyrb1 = (gyrb)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrb1.getClass();
        gysp0.ai = gyrb1;
        gysp0.d |= 0x800;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov i(gyza gyza0, long v, String s, gyqv gyqv0, boolean z) {
        dcvz.a.b().i("[ClearcutLog] Activity= %s, referrer= %s", gyza0, s);
        ProtoLiteBuilder hftp0 = dcpt.L(0x20);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrd)hftv0).c = gyza0.n;
        ((gyrd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrd)hftv1).b |= 2;
        ((gyrd)hftv1).d = v;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrd gyrd0 = (gyrd)hftp1.b_message;
            gyrd0.b |= 4;
            gyrd0.e = s;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrd gyrd1 = (gyrd)hftp1.b_message;
        gyrd1.b |= 0x40;
        gyrd1.h = z;
        gyrd gyrd2 = (gyrd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrd2.getClass();
        gysp0.x = gyrd2;
        gysp0.b |= 0x800000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov j(dcps dcps0) {
        cunf cunf0 = dcvz.a;
        cunf cunf1 = cunf0.b();
        long v = dcps0.b;
        cunf1.i("[ClearcutLog] PARSING_FAILED_ENDPOINT_ID sessionId=%s flowId=%s ", Long.valueOf(v), Long.valueOf(dcps0.d));
        ProtoLiteBuilder hftp0 = dcpt.L(61);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrg.a).v_newBuilder();
        long v1 = dcps0.c;
        int v2 = 2;
        if(Long.compare(v1, 0L) >= 0) {
            hfst hfst0 = hfyf.k(v1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrg gyrg0 = (gyrg)hftp1.b_message;
            hfst0.getClass();
            gyrg0.d = hfst0;
            gyrg0.b |= 2;
        }
        String s = dcps0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gyrg)hftv0).b |= 1;
        ((gyrg)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrg)hftv1).b |= 4;
        ((gyrg)hftv1).e = v;
        if(dcps0.h) {
            v2 = 5;
        }
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyrg)hftv2).h = v2 - 1;
        ((gyrg)hftv2).b |= 0x40;
        String s1 = dcps0.e;
        if(s1 != null) {
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrg gyrg1 = (gyrg)hftp1.b_message;
            gyrg1.b |= 16;
            gyrg1.f = s1;
        }
        long v3 = dcps0.g;
        if(v3 >= 0L) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrg gyrg2 = (gyrg)hftp1.b_message;
            gyrg2.b |= 0x20;
            gyrg2.g = v3;
        }
        long v4 = dcps0.i;
        if(v4 > 0L) {
            hfst hfst1 = hfyf.k(v4);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrg gyrg3 = (gyrg)hftp1.b_message;
            hfst1.getClass();
            gyrg3.i = hfst1;
            gyrg3.b |= 0x80;
        }
        int v5 = dcps0.j;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        if(v5 == 0) {
            throw null;
        }
        ((gyrg)hftv3).j = v5 - 1;
        ((gyrg)hftv3).b |= 0x100;
        int v6 = dcps0.k;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrg gyrg4 = (gyrg)hftp1.b_message;
        if(v6 == 0) {
            throw null;
        }
        gyrg4.k = v6 - 1;
        gyrg4.b |= 0x200;
        gyrg gyrg5 = (gyrg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrg5.getClass();
        gysp0.ad = gyrg5;
        gysp0.d |= 8;
        gyqv gyqv0 = dcps0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        cunf0.d().h("A new endpoint id was discovered with latencyFromActivityStart: %s, but it failed to parse", Long.valueOf(v3));
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov k(long v, gyqv gyqv0) {
        dcvz.a.b().h("[ClearcutLog] SCAN_FOR_SHARE_TARGETS_END sessionId=%s", Long.valueOf(v));
        ProtoLiteBuilder hftp0 = dcpt.L(7);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrr gyrr0 = (gyrr)hftp1.b_message;
        gyrr0.b |= 1;
        gyrr0.c = v;
        gyrr gyrr1 = (gyrr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrr1.getClass();
        gysp0.j = gyrr1;
        gysp0.b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov l(long v, long v1, ShareTarget shareTarget0, gyzg gyzg0, int v2, int v3, long v4, String s, gyqv gyqv0, ddkk ddkk0, int v5, int v6) {
        dcvz.a.b().k("[ClearcutLog] SEND_ATTACHMENTS_END sessionId=%s shareTarget: %s referrer: %s durationMillis: %d", Long.valueOf(v), shareTarget0.toString(), s, Long.valueOf(v4));
        ProtoLiteBuilder hftp0 = dcpt.L(17);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrt)hftv0).b |= 1;
        ((gyrt)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrt)hftv1).b |= 2;
        ((gyrt)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyrt)hftv2).e = gyzg0.F;
        ((gyrt)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gyrt)hftv3).b |= 16;
        ((gyrt)hftv3).g = v3;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gyrt)hftv4).b |= 8;
        ((gyrt)hftv4).f = v2;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrt gyrt0 = (gyrt)hftp1.b_message;
        gyrt0.b |= 0x40;
        gyrt0.i = v4;
        gyqi gyqi0 = dcpt.v(shareTarget0.e());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrt gyrt1 = (gyrt)hftp1.b_message;
        gyqi0.getClass();
        gyrt1.h = gyqi0;
        gyrt1.b |= 0x20;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        gysc0.getClass();
        ((gyrt)hftv5).j = gysc0;
        ((gyrt)hftv5).b |= 0x80;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp1.b_message;
        ((gyrt)hftv6).b |= 0x2000;
        ((gyrt)hftv6).o = v5;
        int v7 = dcpt.J(v6);
        if(!hftv6.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp1.b_message;
        ((gyrt)hftv7).p = v7 - 1;
        ((gyrt)hftv7).b |= 0x4000;
        if(s != null) {
            if(!hftv7.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrt gyrt2 = (gyrt)hftp1.b_message;
            gyrt2.b |= 0x100;
            gyrt2.k = s;
        }
        int v8 = ddkk0.d;
        if(v8 > 0) {
            int v9 = ddkk0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp1.b_message;
            ((gyrt)hftv8).b |= 0x800;
            ((gyrt)hftv8).m = v9;
            int v10 = ddkk0.b;
            if(!hftv8.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrt gyrt3 = (gyrt)hftp1.b_message;
            gyrt3.b |= 0x400;
            gyrt3.l = v10;
            int v11 = dcpt.M(v8);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyrt gyrt4 = (gyrt)hftp1.b_message;
            gyrt4.b |= 0x1000;
            gyrt4.n = v11;
        }
        gyrt gyrt5 = (gyrt)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrt5.getClass();
        gysp0.t = gyrt5;
        gysp0.b |= 0x20000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov m(long v, ShareTarget shareTarget0, int v1, int v2, gyqv gyqv0) {
        dcvz.a.b().i("[ClearcutLog] SEND_ATTACHMENTS_START sessionId=%s shareTarget: %s", Long.valueOf(v), shareTarget0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(16);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyru.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyru gyru0 = (gyru)hftp1.b_message;
        gyru0.b |= 1;
        gyru0.c = v;
        gyqi gyqi0 = dcpt.v(shareTarget0.e());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gyqi0.getClass();
        ((gyru)hftv0).d = gyqi0;
        ((gyru)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyru)hftv1).b |= 8;
        ((gyru)hftv1).f = v2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyru gyru1 = (gyru)hftp1.b_message;
        gyru1.b |= 4;
        gyru1.e = v1;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyru gyru2 = (gyru)hftp1.b_message;
        gysc0.getClass();
        gyru2.g = gysc0;
        gyru2.b |= 0x20;
        gyru gyru3 = (gyru)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyru3.getClass();
        gysp0.s = gyru3;
        gysp0.b |= 0x10000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov n(long v, ShareTarget shareTarget0, int v1, int v2, gyqv gyqv0) {
        dcvz.a.b().i("[ClearcutLog] SEND_INTRODUCTION sessionId=%s shareTarget: %s", Long.valueOf(v), shareTarget0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(13);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrw.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrw gyrw0 = (gyrw)hftp1.b_message;
        gyrw0.b |= 2;
        gyrw0.d = v;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gysc0.getClass();
        ((gyrw)hftv0).c = gysc0;
        ((gyrw)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrw)hftv1).b |= 8;
        ((gyrw)hftv1).f = v2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrw gyrw1 = (gyrw)hftp1.b_message;
        gyrw1.b |= 4;
        gyrw1.e = v1;
        gyrw gyrw2 = (gyrw)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrw2.getClass();
        gysp0.p = gyrw2;
        gysp0.b |= 0x2000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov o(long v, int v1, int v2, ShareTarget shareTarget0, gyqv gyqv0) {
        dcvz.a.b().i("[ClearcutLog] SEND_START sessionId=%s shareTarget: %s", Long.valueOf(v), shareTarget0.toString());
        ProtoLiteBuilder hftp0 = dcpt.L(27);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrx.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrx)hftv0).b |= 1;
        ((gyrx)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrx)hftv1).b |= 4;
        ((gyrx)hftv1).e = v2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrx gyrx0 = (gyrx)hftp1.b_message;
        gyrx0.b |= 2;
        gyrx0.d = v1;
        gysc gysc0 = dcpt.N(shareTarget0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrx gyrx1 = (gyrx)hftp1.b_message;
        gysc0.getClass();
        gyrx1.f = gysc0;
        gyrx1.b |= 8;
        gyrx gyrx2 = (gyrx)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrx2.getClass();
        gysp0.C = gyrx2;
        gysp0.b |= 0x10000000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcov p(gyza gyza0, boolean z, boolean z1, boolean z2) {
        ProtoLiteBuilder hftp0 = dcpt.L(66);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gysd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gysd)hftv0).c = gyza0.n;
        ((gysd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gysd)hftv1).b |= 2;
        ((gysd)hftv1).d = z;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gysd)hftv2).b |= 4;
        ((gysd)hftv2).e = z1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysd gysd0 = (gysd)hftp1.b_message;
        gysd0.b |= 8;
        gysd0.f = z2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysd gysd1 = (gysd)hftp1.N_build();
        gysd1.getClass();
        gysp0.ag = gysd1;
        gysp0.d |= 0x200;
        return new dcov(((gysp)hftp0.N_build()));
    }

    public static dcow q() {
        ProtoLiteBuilder hftp0 = dcpt.L(0x2F);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).e = 46;
        ((gysp)hftp0.b_message).b |= 1;
        gyqk gyqk0 = gyqk.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqk0.getClass();
        gysp0.T = gyqk0;
        gysp0.c |= 0x40000;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static dcow r() {
        ProtoLiteBuilder hftp0 = dcpt.L(57);
        gyqm gyqm0 = gyqm.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqm0.getClass();
        gysp0.aa = gyqm0;
        gysp0.c |= 0x80000000;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static dcow s(gzan gzan0, gzap gzap0, long v, dcpv dcpv0, int v1) {
        ProtoLiteBuilder hftp0 = dcpt.L(26);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqx.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqx)hftv0).d = gzan0.n;
        ((gyqx)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyqx)hftv1).c = gzap0.l;
        ((gyqx)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gyqx)hftv2).b |= 4;
        ((gyqx)hftv2).e = v;
        int v2 = dcpv0.a;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        if(v2 == 0) {
            throw null;
        }
        ((gyqx)hftv3).f = v2 - 1;
        ((gyqx)hftv3).b |= 8;
        int v3 = dcpv0.b;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        if(v3 == 0) {
            throw null;
        }
        ((gyqx)hftv4).g = v3 - 1;
        ((gyqx)hftv4).b |= 16;
        int v4 = dcpt.O(v1);
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyqx)hftp1.b_message).h = v4 - 1;
        ((gyqx)hftp1.b_message).b |= 0x20;
        gyqx gyqx0 = (gyqx)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqx0.getClass();
        gysp0.B = gyqx0;
        gysp0.b |= 0x8000000;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static dcow t(int v, int v1) {
        ProtoLiteBuilder hftp0 = dcpt.L(58);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gysb.a).v_newBuilder();
        gzax gzax0 = djan.a(v);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gysb)hftp1.b_message).c = gzax0.g;
        ((gysb)hftp1.b_message).b |= 1;
        if(hvqz.h()) {
            gzax gzax1 = djan.a(v1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gysb)hftp1.b_message).d = gzax1.g;
            ((gysb)hftp1.b_message).b |= 2;
        }
        gysb gysb0 = (gysb)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysb0.getClass();
        gysp0.ab = gysb0;
        gysp0.d |= 1;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static dcow u() {
        ProtoLiteBuilder hftp0 = dcpt.L(35);
        gysi gysi0 = gysi.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysi0.getClass();
        gysp0.I = gysi0;
        gysp0.c |= 0x20;
        return new dcow(((gysp)hftp0.N_build()));
    }

    public static gyqi v(List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyqi.a).v_newBuilder();
        for(Object object0: list0) {
            Attachment attachment0 = (Attachment)object0;
            long v = attachment0.c();
            int v1 = 4;
            int v2 = 3;
            if(attachment0.l()) {
                switch(attachment0.a()) {
                    case 1: {
                        v1 = 2;
                        break;
                    }
                    case 2: {
                        v1 = 3;
                        break;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gysm.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gysm)hftv0).c = v1 - 1;
                ((gysm)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gysm gysm0 = (gysm)hftp1.b_message;
                gysm0.b |= 2;
                gysm0.d = v;
                gysm gysm1 = (gysm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqi gyqi0 = (gyqi)hftp0.b_message;
                gysm1.getClass();
                hfuo hfuo0 = gyqi0.b;
                if(!hfuo0.c()) {
                    gyqi0.b = ProtoLiteMessage.E(hfuo0);
                }
                gyqi0.b.add(gysm1);
            }
            else if(attachment0.j()) {
                int v3 = attachment0.a();
                switch(v3) {
                    case 0: {
                        v2 = 1;
                        break;
                    }
                    case 1: {
                        v2 = 2;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        v2 = 5;
                        if(v3 == 3) {
                            v2 = 4;
                        }
                        else {
                            switch(v3) {
                                case 4: {
                                    break;
                                }
                                case 5: {
                                    v2 = 6;
                                    break;
                                }
                                default: {
                                    v2 = 1;
                                }
                            }
                        }
                    }
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqz.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((gyqz)hftv1).c = v2 - 1;
                ((gyqz)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((gyqz)hftv2).b |= 2;
                ((gyqz)hftv2).d = v;
                long v4 = ((FileAttachment)attachment0).i;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gyqz gyqz0 = (gyqz)hftp2.b_message;
                gyqz0.b |= 4;
                gyqz0.e = v4;
                gyqz gyqz1 = (gyqz)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqi gyqi1 = (gyqi)hftp0.b_message;
                gyqz1.getClass();
                hfuo hfuo1 = gyqi1.c;
                if(!hfuo1.c()) {
                    gyqi1.c = ProtoLiteMessage.E(hfuo1);
                }
                gyqi1.c.add(gyqz1);
            }
            else if(attachment0.m()) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gyso.a).v_newBuilder();
                int v5 = ((WifiCredentialsAttachment)attachment0).b;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gyso gyso0 = (gyso)hftp3.b_message;
                gyso0.b |= 1;
                gyso0.c = v5;
                gyso gyso1 = (gyso)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqi gyqi2 = (gyqi)hftp0.b_message;
                gyso1.getClass();
                hfuo hfuo2 = gyqi2.d;
                if(!hfuo2.c()) {
                    gyqi2.d = ProtoLiteMessage.E(hfuo2);
                }
                gyqi2.d.add(gyso1);
            }
            else if(attachment0.i()) {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gyqh.a).v_newBuilder();
                String s = ((AppAttachment)attachment0).h;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp4.b_message;
                s.getClass();
                ((gyqh)hftv3).b |= 1;
                ((gyqh)hftv3).c = s;
                long v6 = ((AppAttachment)attachment0).b;
                if(!hftv3.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gyqh gyqh0 = (gyqh)hftp4.b_message;
                gyqh0.b |= 2;
                gyqh0.d = v6;
                gyqh gyqh1 = (gyqh)hftp4.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqi gyqi3 = (gyqi)hftp0.b_message;
                gyqh1.getClass();
                hfuo hfuo3 = gyqi3.e;
                if(!hfuo3.c()) {
                    gyqi3.e = ProtoLiteMessage.E(hfuo3);
                }
                gyqi3.e.add(gyqh1);
            }
            else if(hvqz.L() && attachment0.k()) {
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gysg.a).v_newBuilder();
                String s1 = ((StreamAttachment)attachment0).e;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gysg gysg0 = (gysg)hftp5.b_message;
                s1.getClass();
                gysg0.b |= 1;
                gysg0.c = s1;
                gysg gysg1 = (gysg)hftp5.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqi gyqi4 = (gyqi)hftp0.b_message;
                gysg1.getClass();
                hfuo hfuo4 = gyqi4.f;
                if(!hfuo4.c()) {
                    gyqi4.f = ProtoLiteMessage.E(hfuo4);
                }
                gyqi4.f.add(gysg1);
            }
            else {
                dcvz.a.e().h("Unable to create event for attachment info. Unknown attachment %s", attachment0);
            }
        }
        if(((gyqi)hftp0.b_message).c.size() == 0 && ((gyqi)hftp0.b_message).b.size() == 0 && ((gyqi)hftp0.b_message).d.size() == 0 && ((gyqi)hftp0.b_message).e.size() == 0 && ((gyqi)hftp0.b_message).f.size() == 0) {
            dcvz.a.e().i("attachmentInfo is empty, attachment size=%s, type=%s", Integer.valueOf(list0.size()), (list0.isEmpty() ? "NULL" : String.valueOf(((Attachment)list0.get(0)).a())));
        }
        return (gyqi)hftp0.N_build();
    }

    public static gyqv w(Context context0, gzat gzat0, Intent intent0, long v, long v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyqv)hftp0.b_message).c = gzat0.j;
        ((gyqv)hftp0.b_message).b |= 1;
        boolean z = djat.c(context0);
        if(!hvrc.g()) {
            if(intent0 != null && intent0.hasExtra("initial_opt_in")) {
                boolean z1 = intent0.getBooleanExtra("initial_opt_in", false);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqv gyqv0 = (gyqv)hftp0.b_message;
                gyqv0.b |= 2;
                gyqv0.d = z1;
            }
            if(intent0 != null && intent0.hasExtra("initial_enable_status")) {
                boolean z2 = intent0.getBooleanExtra("initial_enable_status", false);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyqv gyqv1 = (gyqv)hftp0.b_message;
                gyqv1.b |= 8;
                gyqv1.f = z2;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyqv gyqv2 = (gyqv)hftp0.b_message;
            gyqv2.b |= 4;
            gyqv2.e = z;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyqv)hftv0).b |= 16;
        ((gyqv)hftv0).g = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gyqv)hftv1).b |= 0x20;
        ((gyqv)hftv1).h = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv3 = (gyqv)hftp0.b_message;
        gyqv3.b |= 0x40;
        gyqv3.i = v2;
        return (gyqv)hftp0.N_build();
    }

    public static gyza x(String s) {
        switch(s.hashCode()) {
            case 0x8B347424: {
                return s.equals("com.google.android.gms.nearby.sharing.SettingsCollapsingToolbarActivity") ? gyza.c : gyza.a;
            }
            case -1420410492: {
                return s.equals("com.google.android.gms.nearby.sharing.ShareSheetActivityV2") ? gyza.b : gyza.a;
            }
            case -1309265013: {
                return s.equals("com.google.android.gms.nearby.sharing.SettingsActivity") ? gyza.c : gyza.a;
            }
            case -1303567668: {
                return s.equals("com.google.android.gms.nearby.sharing.SettingsFragment") ? gyza.c : gyza.a;
            }
            case -1243687909: {
                return s.equals("data_usage_dialog") ? gyza.i : gyza.a;
            }
            case -1229240045: {
                return s.equals("device_name_dialog") ? gyza.h : gyza.a;
            }
            case -1177362810: {
                return s.equals("com.google.android.gms.nearby.sharing.SettingsPreferenceActivity") ? gyza.c : gyza.a;
            }
            case 0xD5936A03: {
                return s.equals("com.google.android.gms.nearby.sharing.SettingsReviewActivity") ? gyza.m : gyza.a;
            }
            case 0xED67EDF2: {
                return s.equals("com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity") ? gyza.d : gyza.a;
            }
            case 0xFCC16370: {
                return s.equals("com.google.android.gms.nearby.sharing.DeviceVisibilityActivity") ? gyza.f : gyza.a;
            }
            case 0x1C6D0E8: {
                return s.equals("com.google.android.gms.nearby.sharing.ShareSheetActivity") ? gyza.b : gyza.a;
            }
            case 0x1C374413: {
                return s.equals("com.google.android.gms.nearby.sharing.SetupActivity") ? gyza.e : gyza.a;
            }
            case 0x1D77D685: {
                return s.equals("com.google.android.gms.nearby.sharing.send.SendChimeraActivity") ? gyza.b : gyza.a;
            }
            case 0x23E6CB05: {
                return s.equals("com.google.android.gms.nearby.sharing.suw.SetupWizardActivity") ? gyza.l : gyza.a;
            }
            case 0x2AA8E501: {
                return s.equals("com.google.android.gms.nearby.sharing.ConsentsActivity") ? gyza.g : gyza.a;
            }
            case 881562083: {
                return s.equals("com.google.android.gms.nearby.sharing.RemoteCopyShareSheetActivity") ? gyza.k : gyza.a;
            }
            case 0x5CAA58C6: {
                return s.equals("com.google.android.gms.nearby.sharing.QuickSettingsActivity") ? gyza.j : gyza.a;
            }
            default: {
                return gyza.a;
            }
        }
    }

    public static gzat y(int v) {
        switch(v) {
            case 0: {
                return gzat.b;
            }
            case 1: {
                return gzat.c;
            }
            case 2: {
                return gzat.d;
            }
            case 3: {
                return gzat.e;
            }
            case 4: {
                return gzat.f;
            }
            case 5: {
                return gzat.g;
            }
            case 6: {
                return gzat.h;
            }
            case 7: {
                return gzat.i;
            }
            default: {
                return gzat.a;
            }
        }
    }

    public static dcov z(String s, long v, gzat gzat0, boolean z) {
        ProtoLiteBuilder hftp0 = dcpt.L(0x20);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrd.a).v_newBuilder();
        gyza gyza0 = dcpt.x(s);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyrd)hftv0).c = gyza0.n;
        ((gyrd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gyrd)hftv1).b |= 2;
        ((gyrd)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrd gyrd0 = (gyrd)hftp1.b_message;
        gyrd0.b |= 0x40;
        gyrd0.h = z;
        gyrd gyrd1 = (gyrd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrd1.getClass();
        gysp0.x = gyrd1;
        gysp0.b |= 0x800000;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gyqv)hftp2.b_message).c = gzat0.j;
        ((gyqv)hftp2.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv gyqv0 = (gyqv)hftp2.N_build();
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        return new dcov(((gysp)hftp0.N_build()));
    }
}

