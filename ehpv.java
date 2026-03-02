import android.os.Bundle;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public abstract class ehpv extends xos implements HasAndroidInjector {
    private static final bboh j;
    private final cmec k;

    static {
        ehpv.j = bboh.b("ComplexServiceInfoChimeraActivity", bbcu.dO);
    }

    public ehpv(cmec cmec0, DispatchingAndroidInjector dispatchingAndroidInjector0) {
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(dispatchingAndroidInjector0, "androidInjector");
        super();
        this.k = cmec0;
    }

    public abstract Class a();

    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!bbqa.c()) {
            ((ggtj)ehpv.j.h()).x("activity isn\'t available on platforms lower than T. Finishing");
            this.finish();
            return;
        }
        int v = this.getIntent().getIntExtra("UserServiceId", 0);
        cmgm cmgm0 = cmgl.a(((ProtoLiteMessage)cmfs.a).v_newBuilder());
        cmgk cmgk0 = cmgj.a(((ProtoLiteMessage)cmfp.a).v_newBuilder());
        cmgk0.b((hgiq.b(v) == null ? hgiq.a : hgiq.b(v)));
        cmgm0.c(cmgk0.a());
        this.k.j(cmgm0.a());
        Bundle bundle1 = new Bundle();
        bundle1.putInt("UserServiceId", v);
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.C();
            ca0.D(0x7F0B0FE4, this.a(), bundle1);  // id:content_frame
            ca0.a();
        }
    }
}

