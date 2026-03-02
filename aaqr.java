final class aaqr extends ibuo implements ibts {
    public aaqr(Object object0) {
        super(1, object0, aarm.class, "onNavStackHeadChanged", "onNavStackHeadChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/NavStackModel$NavStackHead;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.e;
        if(((aanx)object0) != null) {
            grxw grxw0 = ((aanx)object0).a.a.e;
            if(grxw0 == null) {
                grxw0 = grxw.a;
            }
            int v = grxw0.c;
            Integer integer0 = ((aarm)object1).l;
            if(integer0 != null && ((int)integer0) != v) {
                fhru fhru0 = new fhru(new aarg(false));
                ((aarm)object1).e.l(fhru0);
            }
            if(!((aanx)object0).e.b() || !((aanx)object0).f.b()) {
                fhru fhru1 = new fhru(new aarg(true));
                ((aarm)object1).e.l(fhru1);
            }
            ((aarm)object1).l = v;
        }
        return ibom.a;
    }
}

