import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

final class aihh {
    private final aild a;
    private final aiii b;
    private static final baun c;

    static {
        aihh.c = new baun(new String[]{"AuthZenRpcEventHandler"});
    }

    public aihh(Context context0, aild aild0) {
        this.a = aild0;
        this.b = new aiii(context0);
    }

    final void a(Context context0, Intent intent0) {
        hhrc hhrc0;
        hhqx hhqx0;
        hhts hhts0;
        try {
            String s = intent0.getStringExtra("syncPayload");
            hhts0 = this.b.a(s);
        }
        catch(hfur | InvalidKeyException | SignatureException | NoSuchAlgorithmException | aiih exception0) {
            aihh.c.g("exception while decoding SyncTx response ", exception0, new Object[0]);
            return;
        }
        if(intent0.hasExtra("txRequest") && hhts0.a.ordinal() == 5) {
            Bundle bundle0 = intent0.getExtras();
            try {
                byte[] arr_b = bundle0.getByteArray("txRequest");
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hhqx0 = (hhqx)hftv0;
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhrc.a), hhts0.b, 0, hhts0.b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hhrc0 = (hhrc)hftv1;
                aild.h(hhqx0.c.toByteArray(), 24, context0);
            }
            catch(hfur hfur0) {
                aihh.c.g("Unable to parse proto ", hfur0, new Object[0]);
                return;
            }
            aild aild0 = this.a;
            if(aild0.a(hhqx0.c.toByteArray()) != null) {
                boolean z = hhrc0 == null || hhrc0.b.size() != 1 ? false : hhrc0.b.g(0);
                if(z) {
                    aihh.c.h("Server trigger was activated", new Object[0]);
                }
                Object[] arr_object = {aild.b(hhqx0.c.toByteArray())};
                aihh.c.h("Showing prompt for TxSync response (transaction id=%s)", arr_object);
                aild0.g(context0, hhqx0, bundle0.getString("account"), bundle0.getByteArray("keyHandle"), z);
            }
        }
    }
}

