import com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeIntentOperation;

public final class bdio extends ibsl implements ibtw {
    int a;
    final CredentialExchangeIntentOperation b;

    public bdio(CredentialExchangeIntentOperation credentialExchangeIntentOperation0, ibrl ibrl0) {
        this.b = credentialExchangeIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdio)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdio(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bdjd bdjd0 = this.b.a;
            if(bdjd0 == null) {
                ibuq.j("credentialExporterRegistrar");
                bdjd0 = null;
            }
            this.a = 1;
            if(bdjd0.b(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

