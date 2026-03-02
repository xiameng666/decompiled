import android.content.Context;

final class duqy extends ibuo implements ibts {
    public duqy(Object object0) {
        super(1, object0, durb.class, "startIssuerSelectorFragment", "startIssuerSelectorFragment(Lcom/google/android/gms/pay/pass/idcard/util/IdFeatures$IdType;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gtxf gtxf0;
        ibuq.f(((dtzi)object0), "p0");
        durb durb0 = (durb)this.e;
        Context context0 = durb0.requireContext();
        switch(((dtzi)object0).ordinal()) {
            case 0: {
                gtxf0 = gtxf.b;
                break;
            }
            case 1: {
                gtxf0 = gtxf.c;
                break;
            }
            case 2: {
                gtxf0 = gtxf.d;
                break;
            }
            default: {
                throw new IllegalStateException("Unsupported ID type in IdTypeSelectorFragment");
            }
        }
        durb0.startActivity(dlnf.P(context0, gtxf0, dvcm.a(durb0.am())));
        durb0.ar();
        return ibom.a;
    }
}

