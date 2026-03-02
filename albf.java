public final class albf implements acn {
    public final albi a;

    public albf(albi albi0) {
        this.a = albi0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        boolean z = boolean0.booleanValue();
        allq.d.h("onCdmAssociationResult: %s.", new Object[]{boolean0});
        allq allq0 = (allq)this.a;
        allq0.aj = z;
        allq0.N(z);
        allq0.M(((du)this.a).getContext(), z);
        alol.a(allq0.ag).k(z);
    }
}

