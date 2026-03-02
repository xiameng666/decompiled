import android.accounts.Account;
import android.content.Context;

public final class eiur {
    final ayud a;
    private final chlu b;
    private final Context c;

    public eiur(Context context0) {
        Account[] arr_account = cchj.b(context0).p("com.google");
        this.a = new ayud(context0, "PHONESKY_RECOVERY", (arr_account.length <= 0 ? null : arr_account[0].name));
        this.b = chlu.v();
        this.c = context0;
    }

    public final void a(int v) {
        this.d(v, "", 2, 0);
    }

    public final void b(int v, int v1) {
        this.d(v, "", v1, 0);
    }

    public final void c(int v, String s) {
        this.d(v, s, 2, 0);
    }

    public final void d(int v, String s, int v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hadn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hadn)hftv0).c = v - 1;
        ((hadn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hadn)hftv1).d = v1 - 1;
        ((hadn)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hadn)hftv2).b |= 4;
        ((hadn)hftv2).e = v2;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadn hadn0 = (hadn)hftp0.b_message;
        hadn0.b |= 8;
        hadn0.f = s;
        if(hxmt.a.e().g()) {
            hadn hadn1 = (hadn)hftp0.N_build();
            this.b.j(((ProtoLiteMessage)hadn1));
            return;
        }
        icwm icwm0 = new icwm();
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ayvm ayvm0 = fhbe.b(this.c, icwm0);
        this.a.j(((MessageLite)hftv3), ayvm0).d();
    }
}

