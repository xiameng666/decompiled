import android.content.Context;
import android.util.Log;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map.Entry;

public final class fdab {
    private final EnumMap a;

    public fdab() {
        EnumMap enumMap0 = new EnumMap(fdcn.class);
        this.a = enumMap0;
        enumMap0.put(fdcn.a, gqub.kH);
        enumMap0.put(fdcn.b, gqub.kG);
    }

    public static grkv a(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnx.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grnp)hftp2.b_message).c = grno0.d;
        ((grnp)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grnx grnx0 = (grnx)hftp1.b_message;
        grnp grnp0 = (grnp)hftp2.N_build();
        grnp0.getClass();
        grnx0.c = grnp0;
        grnx0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp0.b_message;
        grnx grnx1 = (grnx)hftp1.N_build();
        grnx1.getClass();
        grkv0.A = grnx1;
        grkv0.e |= 0x200;
        return (grkv)hftp0.N_build();
    }

    public final void b(Context context0, gqtz gqtz0, gged_interceptors gged0, fdco fdco0, String s, String s1, String s2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        grjx0.a(gged0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp0.b_message;
        grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy0.getClass();
        grnk0.j = grjy0;
        grnk0.b |= 0x200;
        grnk grnk1 = (grnk)hftp0.N_build();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.entrySet()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grku.a).v_newBuilder();
            gqub gqub0 = (gqub)((Map.Entry)object0).getValue();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((grku)hftp1.b_message).c = gqub0.mk;
            ((grku)hftp1.b_message).b |= 1;
            grkv grkv0 = fdab.a(fdco0.g(((fdcn)((Map.Entry)object0).getKey())));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grku grku0 = (grku)hftp1.b_message;
            grkv0.getClass();
            grku0.d = grkv0;
            grku0.b |= 2;
            arrayList0.add(fdab.e(gqtz0, grnk1, hftp1, s, s1, s2));
            gqtz0 = gqtz0;
        }
        fdab.f(context0, arrayList0);
    }

    public static final evql c(Context context0, List list0, int v) {
        acqo acqo0 = new acqo();
        acqo0.b = v;
        acqo0.a = 2;
        acqo0.c(list0);
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        evql evql0 = new acqn(context0).b(logAuditRecordsRequest0);
        evql0.b(new fczy());
        evql0.A(new fczz());
        return evql0.e(new fdaa());
    }

    public static final grkn d() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        String s = Long.toHexString(((Long)bbmq.c.i()).longValue());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp0.b_message;
        s.getClass();
        grkn0.b |= 1;
        grkn0.c = s;
        return (grkn)hftp0.N_build();
    }

    public static final byte[] e(gqtz gqtz0, grnk grnk0, ProtoLiteBuilder hftp0, String s, String s1, String s2) {
        grkn grkn0 = fdab.d();
        grkr grkr0 = grkr.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkr grkr1 = (grkr)hftp1.b_message;
        grkn0.getClass();
        grkr1.d = grkn0;
        grkr1.b |= 4;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkr0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkr grkr2 = (grkr)hftp2.b_message;
        grkn0.getClass();
        grkr2.d = grkn0;
        grkr2.b |= 4;
        if(s2 != null) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkq.a).v_newBuilder();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grkp.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            grkp grkp0 = (grkp)hftp4.b_message;
            grkp0.b |= 1;
            grkp0.c = s2;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            grkq grkq0 = (grkq)hftp3.b_message;
            grkp grkp1 = (grkp)hftp4.N_build();
            grkp1.getClass();
            grkq0.c = grkp1;
            grkq0.b |= 2;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grkr grkr3 = (grkr)hftp2.b_message;
            grkq grkq1 = (grkq)hftp3.N_build();
            grkq1.getClass();
            grkr3.e = grkq1;
            grkr3.b |= 0x200;
        }
        if(hzwn.c()) {
            if(s != null) {
                fdab.h(hftp1, s);
            }
            if(s1 != null) {
                fdab.h(hftp2, s1);
            }
        }
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        grku grku0 = (grku)hftp0.N_build();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grns grns0 = (grns)hftp5.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grns grns1 = (grns)hftp5.b_message;
        grnk0.getClass();
        grns1.f = grnk0;
        grns1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns grns2 = (grns)hftp5.N_build();
        grns2.getClass();
        grkg1.g = grns2;
        grkg1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr grkr4 = (grkr)hftp1.N_build();
        grkr4.getClass();
        grkg2.d = grkr4;
        grkg2.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg3 = (grkg)grkf0.b_message;
        grkr grkr5 = (grkr)hftp2.N_build();
        grkr5.getClass();
        grkg3.e = grkr5;
        grkg3.b |= 2;
        return ((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray();
    }

    public static final evql f(Context context0, List list0) {
        return fdab.c(context0, list0, gqtt.eu.eR);
    }

    public static final void g(Context context0, String s, String s1, boolean z, int v, gqub gqub0) {
        if(Log.isLoggable("wearable.ARI", 3)) {
            Log.d("wearable.ARI", "recordAccountSynced " + z);
        }
        grkr grkr0 = fdab.i(s);
        grkr grkr1 = fdab.i(s1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        grku grku0 = (grku)hftp0.N_build();
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = z ? gqtz.WK : gqtz.WJ;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grns grns0 = (grns)hftp1.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns grns1 = (grns)hftp1.N_build();
        grns1.getClass();
        grkg1.g = grns1;
        grkg1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr1.getClass();
        grkg2.d = grkr1;
        grkg2.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg3 = (grkg)grkf0.b_message;
        grkr0.getClass();
        grkg3.e = grkr0;
        grkg3.b |= 2;
        fdab.c(context0, gged_interceptors.l(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray()), v);
    }

    private static final void h(ProtoLiteBuilder hftp0, String s) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grko.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grko grko0 = (grko)hftp1.b_message;
        s.getClass();
        grko0.b = 1;
        grko0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp0.b_message;
        grko grko1 = (grko)hftp1.N_build();
        grko1.getClass();
        grkr0.c = grko1;
        grkr0.b |= 1;
    }

    private static final grkr i(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        fdab.h(hftp0, s);
        grkn grkn0 = fdab.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp0.b_message;
        grkn0.getClass();
        grkr0.d = grkn0;
        grkr0.b |= 4;
        return (grkr)hftp0.N_build();
    }
}

