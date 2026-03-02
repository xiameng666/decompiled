import android.accounts.Account;

public final class aqjh implements gfsi {
    public final boolean a;
    public final Account b;

    public aqjh(boolean z, Account account0) {
        this.a = z;
        this.b = account0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqdo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqdo aqdo0 = (aqdo)hftp0.b_message;
        aqdo0.b |= 1;
        aqdo0.c = this.a;
        aqdo aqdo1 = (aqdo)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqdn)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((aqdn)object0))));
        String s = this.b.name;
        s.getClass();
        aqdo1.getClass();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqdn aqdn0 = (aqdn)hftp1.b_message;
        hfvh hfvh0 = aqdn0.b;
        if(!hfvh0.b) {
            aqdn0.b = hfvh0.a();
        }
        aqdn0.b.put(s, aqdo1);
        return (aqdn)hftp1.N_build();
    }
}

