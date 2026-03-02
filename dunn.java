import android.content.Context;

final class dunn extends ibsl implements ibtw {
    final duoa a;

    public dunn(duoa duoa0, ibrl ibrl0) {
        this.a = duoa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dunn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dunn(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        duoa duoa0 = this.a;
        Context context0 = duoa0.requireContext();
        String s = duoa0.ah;
        gtxf gtxf0 = null;
        if(s == null) {
            ibuq.j("provisioningId");
            s = null;
        }
        gtxf gtxf1 = duoa0.ai;
        if(gtxf1 == null) {
            ibuq.j("mdocType");
        }
        else {
            gtxf0 = gtxf1;
        }
        duoa0.startActivity(dlnf.Z(context0, s, gtxf0));
        duoa0.ar();
        return ibom.a;
    }
}

