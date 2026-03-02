import com.google.android.gms.wearable.internal.MessageEventParcelable;

final class aikn implements fcfc {
    public aikm a;
    private final hhqx b;

    public aikn(hhqx hhqx0, aikm aikm0) {
        this.b = hhqx0;
        this.a = aikm0;
    }

    @Override  // fcfc
    public final void a(MessageEventParcelable messageEventParcelable0) {
        hhqy hhqy0;
        hhqx hhqx0;
        aikm aikm0 = this.a;
        aiko.x.h("onMessageReceived : %s", new Object[]{messageEventParcelable0});
        if("/send-tx-response".equals(messageEventParcelable0.b)) {
            fcez fcez0 = fcez.b(messageEventParcelable0.c);
            try {
                byte[] arr_b = fcez0.x("tx_request");
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hhqx0 = (hhqx)hftv0;
                byte[] arr_b1 = fcez0.x("tx_response");
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqy.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hhqy0 = (hhqy)hftv1;
            }
            catch(hfur hfur0) {
                aiko.x.g("Received a malformed TxRequest or TxResponse", hfur0, new Object[0]);
                return;
            }
            if(hhqx0.c.equals(this.b.c)) {
                hhqj hhqj0 = hhqj.b(hhqy0.c) == null ? hhqj.a : hhqj.b(hhqy0.c);
                aiko.x.h("TxId %s was finalized on wear with selection %s. Dismissing the Activity", new Object[]{hhqx0.c, hhqj0});
                if(aikm0 != null) {
                    aikm0.a.u = true;
                    aikm0.a.finish();
                }
            }
        }
    }
}

