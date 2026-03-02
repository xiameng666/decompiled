import android.accounts.Account;
import com.google.android.gms.backup.common.util.session.ParcelableSession;

public final class fcmv implements glzn {
    public final fcnm a;
    public final gqtz b;
    public final grnw c;
    public final Integer d;

    public fcmv(fcnm fcnm0, gqtz gqtz0, grnw grnw0, Integer integer0) {
        this.a = fcnm0;
        this.b = gqtz0;
        this.c = grnw0;
        this.d = integer0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gqtz gqtz0 = this.b;
        fcmk.a.d("logBackupDisabled: contextId=%s", new Object[]{gqtz0.sn});
        grkh grkh0 = ParcelableSession.b().c();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp0.b_message;
        this.c.getClass();
        grnk0.t = this.c;
        grnk0.d |= 0x80;
        grnk grnk1 = (grnk)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = grno.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grnp)hftp2.b_message).c = grno0.d;
        ((grnp)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        Integer integer0 = this.d;
        grjl grjl0 = (grjl)hftp1.b_message;
        grnp grnp0 = (grnp)hftp2.N_build();
        grnp0.getClass();
        grjl0.c = grnp0;
        grjl0.b |= 1;
        if(integer0 != null) {
            int v = (int)integer0;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grjl grjl1 = (grjl)hftp1.b_message;
            grjl1.b |= 0x800;
            grjl1.l = v;
        }
        grjl grjl2 = (grjl)hftp1.N_build();
        return this.a.h.a(((Account)object0), grkh0, gqtz0, grnk1, grjl2);
    }
}

