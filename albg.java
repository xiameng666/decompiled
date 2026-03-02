public final class albg implements acn {
    public final albi a;

    public albg(albi albi0) {
        this.a = albi0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        allq.d.h("onCdmDisassociationResult: %s.", new Object[]{((Boolean)object0)});
        albi albi0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            ((allq)albi0).aj = false;
            ((allq)albi0).N(false);
            ((allq)albi0).M(((du)albi0).getContext(), false);
            alol.a(((allq)albi0).ag).k(false);
            return;
        }
        ((allq)albi0).am.c(((allq)albi0).ag);
    }
}

