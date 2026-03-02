import androidx.activity.result.ActivityResult;

final class dvzc implements acn, ibum {
    final dvze a;

    public dvzc(dvze dvze0) {
        this.a = dvze0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, dvze.class, "onDeviceLockSetupActivityResult", "onDeviceLockSetupActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof acn) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "p0");
        ibuq.f(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).a == 0) {
            dvze dvze0 = this.a;
            ((ggtj)dvze.a.h()).x("User cancelled the creation of a device lock.");
            xob xob0 = dvze0.an();
            if(xob0 != null) {
                xob0.setResult(0);
            }
            dvze0.ar();
        }
    }
}

