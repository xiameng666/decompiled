import android.accounts.Account;

public final class dftn implements gfsi {
    public final dftp a;
    public final Account b;
    public final dcpv c;

    public dftn(dftp dftp0, Account account0, dcpv dcpv0) {
        this.a = dftp0;
        this.b = account0;
        this.c = dcpv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)((dgbe)object0).b).jf(5, null);
        hftp0.X(((ProtoLiteMessage)((dgbe)object0).b));
        dftp dftp0 = this.a;
        if(!dftp0.b.e(this.b, ((dbxw)hftp0), this.c)) {
            dftp0.a.g();
            if(((dbxw)hftp0).a_defaultInstance.isImmutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            ((dbxw)hftp0).b_message = ((ProtoLiteBuilder)(((dbxw)hftp0))).P_newInstance();
            return (dbxx)((ProtoLiteBuilder)(((dbxw)hftp0))).N_build();
        }
        return (dbxx)((ProtoLiteBuilder)(((dbxw)hftp0))).N_build();
    }
}

