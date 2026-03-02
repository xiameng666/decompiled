import android.text.TextUtils;

public final class ehik {
    public static giru a(egzx egzx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giru.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = egzx0.m;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giru)hftv0).b |= 8;
        ((giru)hftv0).f = egzx0.e;
        int v = s == null ? 0 : s.length();
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giru)hftv1).b |= 0x20;
        ((giru)hftv1).h = v;
        boolean z = egzx0.f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giru)hftv2).b |= 0x80;
        ((giru)hftv2).j = z;
        boolean z1 = egzx0.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((giru)hftv3).b |= 0x100;
        ((giru)hftv3).k = z1;
        boolean z2 = egzx0.d;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((giru)hftv4).b |= 0x400;
        ((giru)hftv4).l = z2;
        boolean z3 = egzx0.a;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((giru)hftv5).b |= 0x800;
        ((giru)hftv5).m = z3;
        boolean z4 = egzx0.c;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        giru giru0 = (giru)hftp0.b_message;
        giru0.b |= 0x1000;
        giru0.n = z4;
        Long long0 = egzx0.h;
        if(long0 != null) {
            int v1 = (int)(((long)long0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru1 = (giru)hftp0.b_message;
            giru1.b |= 1;
            giru1.c = v1;
        }
        String s1 = egzx0.k;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru2 = (giru)hftp0.b_message;
            giru2.b |= 2;
            giru2.d = s1;
        }
        Long long1 = egzx0.j;
        if(long1 != null) {
            String s2 = Long.toString(long1.longValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru3 = (giru)hftp0.b_message;
            s2.getClass();
            giru3.b |= 0x8000;
            giru3.p = s2;
        }
        String s3 = egzx0.n;
        if(s3 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru4 = (giru)hftp0.b_message;
            giru4.b |= 0x4000;
            giru4.o = s3;
        }
        Long long2 = egzx0.i;
        if(long2 != null) {
            int v2 = (int)(((long)long2));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru5 = (giru)hftp0.b_message;
            giru5.b |= 4;
            giru5.e = v2;
        }
        String s4 = egzx0.l;
        if(s4 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru8 = (giru)hftp0.b_message;
            giru8.b |= 0x40;
            giru8.i = s4;
            if(!TextUtils.isEmpty(s)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giru giru9 = (giru)hftp0.b_message;
                s.getClass();
                giru9.b |= 16;
                giru9.g = s;
            }
        }
        else if(!TextUtils.isEmpty(s1)) {
            try {
                long v3 = Long.parseLong(s1, 16);
                if(v3 >= 0L && v3 < 10000L && !TextUtils.isEmpty(s)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giru giru6 = (giru)hftp0.b_message;
                    s.getClass();
                    giru6.b |= 16;
                    giru6.g = s;
                }
            }
            catch(NumberFormatException unused_ex) {
                String s5 = egzx0.m;
                if(!TextUtils.isEmpty(s5)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giru giru7 = (giru)hftp0.b_message;
                    s5.getClass();
                    giru7.b |= 16;
                    giru7.g = s5;
                }
            }
        }
        if("Starred in Android".equals(egzx0.m)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giru giru10 = (giru)hftp0.b_message;
            giru10.b |= 16;
            giru10.g = "Starred in Android";
        }
        return (giru)hftp0.N_build();
    }
}

