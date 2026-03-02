import android.accounts.Account;
import android.content.Context;

public final class fxun implements evpo {
    final Context a;
    final grkf b;
    final byte[] c;
    final Account d;

    public fxun(Context context0, grkf grkf0, byte[] arr_b, Account account0) {
        this.a = context0;
        this.b = grkf0;
        this.c = arr_b;
        this.d = account0;
        super();
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        String s = (String)evql0.j();
        Context context0 = this.a;
        String s1 = Long.toHexString(bbmq.d(context0));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp0.b_message;
        s1.getClass();
        grkn0.b |= 1;
        grkn0.c = s1;
        grkn grkn1 = (grkn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp1.b_message;
        grkn1.getClass();
        grkr0.d = grkn1;
        grkr0.b |= 4;
        if(s != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grko grko0 = (grko)hftp2.b_message;
            grko0.b = 1;
            grko0.c = s;
            grko grko1 = (grko)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp1.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        grkt grkt0 = grkt.a;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkt0).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((grkt)hftv0).c = 1;
        ((grkt)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkf grkf0 = this.b;
        grkt grkt1 = (grkt)hftp3.b_message;
        grkr grkr2 = (grkr)hftp1.N_build();
        grkr2.getClass();
        grkt1.d = grkr2;
        grkt1.b |= 2;
        grkf0.k(hftp3);
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grkt0).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp4.b_message;
        ((grkt)hftv1).c = 2;
        ((grkt)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp4.ensureMutable();
        }
        grkt grkt2 = (grkt)hftp4.b_message;
        grkr grkr3 = (grkr)hftp1.N_build();
        grkr3.getClass();
        grkt2.d = grkr3;
        grkt2.b |= 2;
        grkf0.k(hftp4);
        acqo acqo0 = new acqo();
        acqo0.b = 20;
        acqo0.a = 2;
        acqo0.b(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray());
        byte[] arr_b = this.c;
        if(arr_b != null) {
            acqo0.d = arr_b;
        }
        acqo0.c = this.d.name;
        return new acqn(context0).b(acqo0.a());
    }
}

