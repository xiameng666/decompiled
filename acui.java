import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;

public final class acui {
    public final grib a;
    private final Context b;

    public acui(Context context0) {
        iakr iakr0 = acui.b(context0).a(grix.j);
        grib grib0 = (grib)grib.k(new grhz(), iakr0);
        String s = howe.c();
        grib grib1 = (grib)grib0.q(gpho.a, s);
        iakr iakr1 = acui.b(context0).a(grix.j);
        gric gric0 = (gric)gric.f(new gria(), iakr1);
        String s1 = howe.c();
        gric gric1 = (gric)gric0.q(gpho.a, s1);
        super();
        this.b = context0;
        this.a = grib1;
    }

    public final grhy a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grhx.a).v_newBuilder();
        String s = Build.FINGERPRINT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grhx grhx0 = (grhx)hftp0.b_message;
        s.getClass();
        grhx0.e = s;
        String s1 = Build.BRAND;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grhx grhx1 = (grhx)hftp0.b_message;
        s1.getClass();
        grhx1.f = s1;
        String s2 = Build.PRODUCT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grhx grhx2 = (grhx)hftp0.b_message;
        s2.getClass();
        grhx2.g = s2;
        String s3 = Build.DEVICE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grhx grhx3 = (grhx)hftp0.b_message;
        s3.getClass();
        grhx3.h = s3;
        int v = Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((grhx)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grhx)hftp0.b_message).c = 0xF1B18ADL;
        long v1 = bbmq.f(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grhx)hftp0.b_message).b = v1;
        grhx grhx4 = (grhx)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grhy.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grhy grhy0 = (grhy)hftp1.b_message;
        grhx4.getClass();
        grhy0.c = grhx4;
        grhy0.b |= 2;
        return (grhy)hftp1.N_build();
    }

    private static gpgz b(Context context0) {
        akss akss0 = new akss();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(akss0);
        fhad fhad0 = fhae.a();
        fhad0.b(context0);
        return cmma.g(0x9000, -1, fhad0.a(), fhbw0);
    }
}

