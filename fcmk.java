import android.accounts.Account;
import android.content.Context;

final class fcmk {
    public static final baun a;
    public final Context b;

    static {
        fcmk.a = new fcgf(new String[]{"AuditRecordLogger"});
    }

    public fcmk(Context context0) {
        this.b = context0;
    }

    public final gmcd a(Account account0, grkh grkh0, gqtz gqtz0, grnk grnk0, grjl grjl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns0 = (grns)hftp0.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns1 = (grns)hftp0.b_message;
        grnk0.getClass();
        grns1.f = grnk0;
        grns1.b |= 8;
        grns grns2 = (grns)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.t;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grku)hftp1.b_message).c = gqub0.mk;
        ((grku)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp2.b_message;
        grjl0.getClass();
        grkv0.h = grjl0;
        grkv0.b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grku grku0 = (grku)hftp1.b_message;
        grkv grkv1 = (grkv)hftp2.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grns2.getClass();
        grkg0.g = grns2;
        grkg0.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grku grku1 = (grku)hftp1.N_build();
        grku1.getClass();
        grkg1.f = grku1;
        grkg1.b |= 4;
        return fhra.b(aqrn.d(this.b, grkf0, account0, grkh0));
    }
}

