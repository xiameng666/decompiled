import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;

final class aihg {
    static final void a(Context context0, Intent intent0, hhqj hhqj0) {
        String s = intent0.getStringExtra("account");
        byte[] arr_b = intent0.getByteArrayExtra("encryption_key_handle");
        hhqx hhqx0 = aiko.o(intent0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhqy)hftp0.b_message).c = hhqj0.j;
        ((hhqy)hftp0.b_message).b |= 1;
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhqy hhqy0 = (hhqy)hftp0.b_message;
        hhqy0.b |= 4;
        hhqy0.e = v;
        hhqy hhqy1 = (hhqy)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hhqx0.getClass();
        ((hhqu)hftv0).c = hhqx0;
        ((hhqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhqu hhqu0 = (hhqu)hftp1.b_message;
        hhqy1.getClass();
        hhqu0.d = hhqy1;
        hhqu0.b |= 2;
        byte[] arr_b1 = ((hhqu)hftp1.N_build()).toBytesArray();
        context0.startService(TransactionReplyIntentOperation.b(s, arr_b, hhqx0, new hhts(hhtt.d, arr_b1)));
    }
}

