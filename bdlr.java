final class bdlr extends ibuo implements ibth {
    public bdlr(Object object0) {
        super(0, object0, bdmg.class, "onDismissGenericErrorDialog", "onDismissGenericErrorDialog()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        icnl icnl0 = ((bdmg)this.e).l;
        do {
            Object object0 = icnl0.b();
            bdtu bdtu0 = (bdtu)object0;
            bdtu bdtu1 = (bdtu0 instanceof bdtr) ? bdtu0 : null;
            if(((bdtr)bdtu1) == null) {
                ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu0.getClass()).c(), new ibuk(bdtr.class).c());
            }
            else {
                bdtu0 = bdtr.c(((bdtr)bdtu1), null, false, false, false, false, false, 0x3F);
            }
        }
        while(!icnl0.h(object0, bdtu0));
        return ibom.a;
    }
}

