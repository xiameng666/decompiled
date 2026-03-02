import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class dxqz {
    public final Context a;
    public final dsgr b;
    private final boolean c;
    private final boolean d;

    public dxqz(Context context0, dsgr dsgr0, boolean z, boolean z1) {
        this.a = context0;
        this.b = dsgr0;
        this.c = z;
        this.d = z1;
    }

    public final gucr a(long v, ftej ftej0, boolean z) {
        ibuq.f(ftej0, "config");
        guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
        guld0.e(gufo.e);
        guld0.n(this.b(v, ftej0, z));
        gubf gubf0 = gube.a(((ProtoLiteMessage)gtzc.a).v_newBuilder());
        gumm gumm0 = guml.a(((ProtoLiteMessage)gtzk.a).v_newBuilder());
        gumm0.b(gtzj.i);
        gtzw gtzw0 = gtzv.a(((ProtoLiteMessage)gtyy.a).v_newBuilder());
        gtnz gtnz0 = gtny.a(((ProtoLiteMessage)gtlg.a).v_newBuilder());
        String s = ftej0.g;
        ibuq.e(s, "getCurrencyCode(...)");
        gtnz0.b(s);
        gtnz0.c(v);
        gtzw0.c(gtnz0.a());
        gtzw0.b(z);
        gumm0.c(gtzw0.a());
        gubf0.e(gumm0.a());
        guld0.d(gubf0.a());
        return guld0.a();
    }

    public final guis b(long v, ftej ftej0, boolean z) {
        ibuq.f(ftej0, "config");
        gumb gumb0 = guma.a(((ProtoLiteMessage)guis.a).v_newBuilder());
        String s = fscd.e(v, ftej0.g);
        ibuq.e(s, "toDisplayableString(...)");
        gumb0.e(dsgr.l(s));
        if(z) {
            gumb0.c(this.b.b(0x7F15224E));  // string:pay_top_up_last_amount_subtitle "Previously added"
        }
        guom guom0 = guol.a(((ProtoLiteMessage)gujv.a).v_newBuilder());
        guom0.b(guju.e);
        gubf gubf0 = gube.a(((ProtoLiteMessage)gtzc.a).v_newBuilder());
        gumm gumm0 = guml.a(((ProtoLiteMessage)gtzk.a).v_newBuilder());
        gumm0.b(gtzj.i);
        gtzw gtzw0 = gtzv.a(((ProtoLiteMessage)gtyy.a).v_newBuilder());
        gtnz gtnz0 = gtny.a(((ProtoLiteMessage)gtlg.a).v_newBuilder());
        String s1 = ftej0.g;
        ibuq.e(s1, "getCurrencyCode(...)");
        gtnz0.b(s1);
        gtnz0.c(v);
        gtzw0.c(gtnz0.a());
        gtzw0.b(z);
        gumm0.c(gtzw0.a());
        gubf0.e(gumm0.a());
        guom0.c(gubf0.a());
        gumb0.d(guom0.a());
        return gumb0.a();
    }

    public final List c(ftej ftej0, String s) {
        if(this.d && this.c && hwev.c()) {
            return dsgr.m(s, this.i(ftej0));
        }
        if((ftej0.b & 0x20000) != 0 && ((ftej0.s == null ? fteg.a : ftej0.s).b & 1) == 0) {
            throw new IllegalArgumentException("SE card art not set in the config.");
        }
        String s1 = this.i(ftej0);
        return this.b.e(s, s1, (ftej0.o == null ? ftei.a : ftej0.o).o, (ftej0.s == null ? fteg.a : ftej0.s).c);
    }

    public final List d(ftej ftej0, String s) {
        if((ftej0.b & 0x20000) != 0 && ((ftej0.s == null ? fteg.a : ftej0.s).b & 1) == 0) {
            throw new IllegalArgumentException("SE card art not set in the config.");
        }
        List list0 = dsgr.f(this.b, s, (ftej0.o == null ? ftei.a : ftej0.o).o, (ftej0.s == null ? fteg.a : ftej0.s).c);
        guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
        guld0.e(gufo.e);
        guld0.h(dsgr.k(this.i(ftej0), gujx.h));
        return ibpo.al(list0, guld0.a());
    }

    public final List e(ftej ftej0) {
        hfui hfui0 = ftej0.i;
        ibuq.e(hfui0, "getPaymentAmountMicrosList(...)");
        List list0 = new ArrayList();
        for(Object object0: hfui0) {
            ibuq.c(((Long)object0));
            if(dxqz.j(((Long)object0).longValue(), ftej0)) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public final boolean f(ftix ftix0, ftej ftej0) {
        return ftix0 == null ? false : dxqz.j(ftix0.b, ftej0);
    }

    public static final long g(ftej ftej0) {
        return (ftej0.p == null ? fteb.a : ftej0.p).d <= 0L ? 10000L : (ftej0.p == null ? fteb.a : ftej0.p).d;
    }

    public static final Long h(ftej ftej0) {
        long v = 0L;
        if(!hwue.a.b().b()) {
            long v1 = (ftej0.p == null ? fteb.a : ftej0.p).c;
            long v2 = ftej0.t - ftej0.f;
            int v3 = Long.compare(v1, 0L);
            if(v3 > 0 && v2 > 0L) {
                return Math.min(v1, v2);
            }
            if(v3 > 0) {
                return v1;
            }
            return v2 <= 0L ? null : v2;
        }
        long v4 = (ftej0.p == null ? fteb.a : ftej0.p).c;
        long v5 = ftej0.t;
        int v6 = Long.compare(v4, 0L);
        if(v6 <= 0 && v5 <= 0L) {
            return null;
        }
        long v7 = dxqz.g(ftej0);
        if(v5 <= 0L) {
            Long long0 = v4;
            return long0.longValue() <= v7 ? null : long0;
        }
        long v8 = ftej0.f;
        if(v5 > v8) {
            v = v5 - v8;
        }
        if(v6 <= 0) {
            Long long1 = v;
            return long1.longValue() <= v7 ? null : long1;
        }
        Long long2 = Math.min(v4, v);
        return long2.longValue() <= v7 ? null : long2;
    }

    private final String i(ftej ftej0) {
        Long long0 = dxqz.h(ftej0);
        if(long0 != null) {
            Object[] arr_object = {fscd.e(ftej0.f, ftej0.g), fscd.e(long0.longValue(), ftej0.g)};
            String s = this.a.getString(0x7F151CCF, arr_object);  // string:pay_current_balance_with_max_amount_label "Current balance: %1$s\nYou can 
                                                                  // only add %2$s more to your card"
            ibuq.c(s);
            return s;
        }
        Object[] arr_object1 = {fscd.e(ftej0.f, ftej0.g)};
        String s1 = this.a.getString(0x7F151CCE, arr_object1);  // string:pay_current_balance_label "Current balance: %1$s"
        ibuq.c(s1);
        return s1;
    }

    private static final boolean j(long v, ftej ftej0) {
        if(Long.compare(v, dxqz.g(ftej0)) < 0) {
            return false;
        }
        Long long0 = dxqz.h(ftej0);
        return long0 == null ? true : v <= ((long)long0);
    }
}

