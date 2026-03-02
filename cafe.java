import android.content.Intent;

final class cafe extends ibuo implements ibth {
    public cafe(Object object0) {
        super(0, object0, cafj.class, "onEnrollmentFlowComplete", "onEnrollmentFlowComplete()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        cafj cafj0 = (cafj)this.e;
        icck icck0 = lsc.a(cafj0);
        cafi cafi0 = new cafi(cafj0, null);
        icbb.b(icck0, cclw.d, null, cafi0, 2);
        Intent intent0 = abjk.b(cafj0.b);
        if(intent0 != null) {
            intent0.addFlags(0x4000000);
            intent0.addFlags(0x20000000);
            cltn cltn0 = new cltn(intent0, null, true, 2);
            cafj0.c.a(cltn0);
        }
        return ibom.a;
    }
}

