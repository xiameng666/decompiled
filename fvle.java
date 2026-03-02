import android.os.SystemClock;
import android.telephony.CellInfo;

final class fvle {
    public static gwtf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwtf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwtf)hftp0.b_message).k = -1;
        ((gwtf)hftp0.b_message).b |= 0x200;
        return (gwtf)hftp0.N_build();
    }

    public static Object b(Object object0, Class class0) {
        return object0 == null || !class0.isInstance(object0) ? null : class0.cast(object0);
    }

    public static void c(ProtoLiteBuilder hftp0, int v, String s, String s1, int v1, int v2, Iterable iterable0, CellInfo cellInfo0) {
        Integer integer0 = fvle.e(s);
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf0 = (gwtf)hftp0.b_message;
            gwtf0.b |= 8;
            gwtf0.f = v3;
        }
        Integer integer1 = fvle.e(s1);
        if(integer1 != null) {
            int v4 = (int)integer1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf1 = (gwtf)hftp0.b_message;
            gwtf1.b |= 4;
            gwtf1.e = v4;
        }
        if(v != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf2 = (gwtf)hftp0.b_message;
            gwtf2.b |= 2;
            gwtf2.d = v;
        }
        if(v1 != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf3 = (gwtf)hftp0.b_message;
            gwtf3.b |= 0x2000;
            gwtf3.o = v1;
        }
        if(v2 != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf4 = (gwtf)hftp0.b_message;
            gwtf4.b |= 16;
            gwtf4.g = v2;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwtf gwtf5 = (gwtf)hftp0.b_message;
        hfuo hfuo0 = gwtf5.p;
        if(!hfuo0.c()) {
            gwtf5.p = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gwtf5.p);
        long v5 = SystemClock.elapsedRealtime() - cellInfo0.getTimestampMillis();
        if(v5 >= 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf6 = (gwtf)hftp0.b_message;
            gwtf6.b |= 0x20;
            gwtf6.h = (int)v5;
        }
    }

    public static void d(ProtoLiteBuilder hftp0, int v, int v1, int v2) {
        if(v != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf0 = (gwtf)hftp0.b_message;
            gwtf0.b |= 0x400;
            gwtf0.l = v;
        }
        if(v1 != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf1 = (gwtf)hftp0.b_message;
            gwtf1.b |= 0x800;
            gwtf1.m = v1;
        }
        if(v2 != 0x7FFFFFFF) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtf gwtf2 = (gwtf)hftp0.b_message;
            gwtf2.b |= 0x40;
            gwtf2.i = v2;
        }
    }

    private static Integer e(String s) {
        if(s == null) {
            return null;
        }
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }
}

