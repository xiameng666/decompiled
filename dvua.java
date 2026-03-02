import android.content.DialogInterface;
import j..util.Objects;

final class dvua implements ibth {
    final DialogInterface a;
    final dvub b;

    public dvua(dvub dvub0, DialogInterface dialogInterface0) {
        this.a = dialogInterface0;
        Objects.requireNonNull(dvub0);
        this.b = dvub0;
        super();
    }

    @Override  // ibth
    public final Object a() {
        dvub dvub0 = this.b;
        dsio dsio0 = dvub0.aj;
        dsik dsik0 = new dsik("nfc_education_bulletin");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)donh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((donh)hftp0.b_message).c = true;
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        donh donh0 = (donh)hftp0.b_message;
        hfwn0.getClass();
        donh0.d = hfwn0;
        donh0.b |= 1;
        dsio0.b(dsik0, ((donh)hftp0.N_build()));
        String s = dvub0.ag.b;
        dvub0.al.j(29, s, dvub0.ag.R, gged_interceptors.l(s));
        dvub0.ah.onDismiss(this.a);
        return ibom.a;
    }
}

