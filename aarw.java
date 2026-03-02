final class aarw extends ibuo implements ibts {
    public aarw(Object object0) {
        super(1, object0, aary.class, "onNavStackHeadChanged", "onNavStackHeadChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/NavStackModel$NavStackHead;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.e;
        if(((aanx)object0) != null) {
            zho zho0 = ((aanx)object0).a;
            lqi lqi0 = ((aary)object1).d;
            grvg grvg0 = zho0.a().g;
            if(grvg0 == null) {
                grvg0 = grvg.a;
            }
            lqi0.l((grvg0.i == null ? grut.a : grvg0.i));
            lqi lqi1 = ((aary)object1).e;
            grvg grvg1 = zho0.a().g;
            if(grvg1 == null) {
                grvg1 = grvg.a;
            }
            lqi1.l(Boolean.valueOf((grvg1.b & 0x400) != 0));
        }
        return ibom.a;
    }
}

