import android.accounts.Account;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class dvlp {
    public static final int a;
    private static final bboh b;
    private final Account c;
    private final fhwb d;
    private final dmgi e;
    private final ibtx f;

    static {
        dvlp.b = bboh.b("Pay", bbcu.cZ);
    }

    public dvlp(Account account0, fhwb fhwb0, dmgi dmgi0) {
        ibuq.f(account0, "account");
        ibuq.f(fhwb0, "semanticLogger");
        super();
        this.c = account0;
        this.d = fhwb0;
        this.e = dmgi0;
        this.f = new dvlo();
    }

    public final byte[] a(byte[] arr_b) {
        Bitmap bitmap1;
        ibuq.f(arr_b, "imageBytes");
        bboh bboh0 = dvlp.b;
        ((ggtj)bboh0.h()).z("Start to compress image with byte size %d", arr_b.length);
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        ibuq.c(bitmap0);
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int v2 = Math.max(v, v1);
        hwvf hwvf0 = hwvf.a;
        int v3 = (int)hwvf0.b().d();
        if(v2 <= v3) {
            ((ggtj)bboh0.h()).x("Skip to scale image");
            bitmap1 = bitmap0;
        }
        else {
            ((ggtj)bboh0.h()).x("Start to scale image");
            bitmap1 = Bitmap.createScaledBitmap(bitmap0, ((int)(((long)v) * ((long)v3) / ((long)v2))), ((int)(((long)v1) * ((long)v3) / ((long)v2))), false);
            ibuq.e(bitmap1, "createScaledBitmap(...)");
        }
        int v4 = (int)hwvf0.b().e();
        ((ggtj)bboh0.h()).x("Start to reduce image quality");
        Object object0 = this.f.a(bitmap1, Bitmap.CompressFormat.JPEG, Integer.valueOf(v4));
        ((ggtj)bboh0.h()).z("Image is compressed to byte size %d", ((byte[])object0).length);
        dmgi dmgi0 = this.e;
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)harm.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((harm)hftp0.b_message).b = arr_b.length;
        int v5 = bitmap0.getWidth();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((harm)hftp0.b_message).c = v5;
        int v6 = bitmap0.getHeight();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((harm)hftp0.b_message).d = v6;
        int v7 = bitmap1.getWidth();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((harm)hftp0.b_message).e = v7;
        int v8 = bitmap1.getHeight();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((harm)hftv0).f = v8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((harm)hftv1).g = v4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((harm)hftp0.b_message).h = ((byte[])object0).length;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((harm)hftv2), "value");
        ProtoLiteBuilder hftp1 = hafk0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        ((harm)hftv2).getClass();
        hapr0.bT = (harm)hftv2;
        hapr0.g |= 0x4000000;
        dmgi0.b(hafk0.a());
        fhwb fhwb0 = this.d;
        fhvz fhvz0 = fhwa.a(205422);
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjcm.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjcm gjcm0 = (gjcm)hftp2.b_message;
        gjcm0.b |= 1;
        gjcm0.c = arr_b.length;
        int v9 = bitmap0.getWidth();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjcm gjcm1 = (gjcm)hftp2.b_message;
        gjcm1.b |= 2;
        gjcm1.d = v9;
        int v10 = bitmap0.getHeight();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjcm gjcm2 = (gjcm)hftp2.b_message;
        gjcm2.b |= 4;
        gjcm2.e = v10;
        int v11 = bitmap1.getWidth();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjcm gjcm3 = (gjcm)hftp2.b_message;
        gjcm3.b |= 8;
        gjcm3.f = v11;
        int v12 = bitmap1.getHeight();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gjcm)hftv3).b |= 16;
        ((gjcm)hftv3).g = v12;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        ((gjcm)hftv4).b |= 0x20;
        ((gjcm)hftv4).h = v4;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjcm gjcm4 = (gjcm)hftp2.b_message;
        gjcm4.b |= 0x40;
        gjcm4.i = ((byte[])object0).length;
        ProtoLiteMessage hftv5 = hftp2.N_build();
        ibuq.e(hftv5, "build(...)");
        ibuq.f(((gjcm)hftv5), "value");
        gjcd gjcd0 = gjca0.a;
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        ((gjcm)hftv5).getClass();
        gjce0.f = (gjcm)hftv5;
        gjce0.b |= 0x40;
        fhvz0.b(douc.a(gjca0.a()));
        fhvz0.c(fhwp.b(this.c.name));
        fhwb0.a(fhvz0.a());
        return (byte[])object0;
    }
}

