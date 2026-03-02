import android.accounts.Account;

public final class ahda implements glzm {
    public static final bxrs a;
    public final hgjk b;
    private final Account c;

    static {
        ahda.a = new bxrs(((gful_cronetEngineProvider)new ahcy()));
    }

    public ahda(Account account0, hgjk hgjk0) {
        this.c = account0;
        this.b = hgjk0;
    }

    @Override  // glzm
    public final gmcd a() {
        agxo agxo0 = (agxo)agye.b.mr();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((hgjm)hftv0).c = this.b;
        ((hgjm)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgjm)hftp0.b_message).d = 2;
        ((hgjm)hftp0.b_message).b |= 2;
        hgjm hgjm0 = (hgjm)hftp0.N_build();
        return agxo0.c(this.c, ((MessageLite)hgjm0)).c().k(new ahcz(this));
    }
}

