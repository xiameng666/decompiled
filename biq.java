public final class biq implements lqj {
    public final biu a;
    public final String b;

    public biq(biu biu0, String s) {
        this.a = biu0;
        this.b = s;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        biu biu0 = this.a;
        if(!biu0.f.get()) {
            bcs.h("CameraPresencePrvdr");
            return;
        }
        if(((bae)object0) == null) {
        label_7:
            if(((bae)object0) != null && ((bae)object0).b == 5) {
            label_8:
                bac bac1 = ((bae)object0).a;
                bcs.d("CameraPresencePrvdr", "Camera " + this.b + " state changed to " + bad.a(((bae)object0).b) + " with error: " + (bac1 == null ? null : ((int)bac1.a)) + ". Triggering refresh.");
                bld bld0 = biu0.c;
                if(bld0 != null) {
                    bld0.a();
                }
            }
        }
        else {
            bac bac0 = ((bae)object0).a;
            if(bac0 == null || (bac0.a == 1 || bac0.a == 2 || bac0.a == 3)) {
                goto label_7;
            }
            else {
                goto label_8;
            }
        }
    }
}

