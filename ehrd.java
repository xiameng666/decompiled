import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ehrd extends xos implements HasAndroidInjector {
    private static final bboh j;
    private final cmec k;
    private final ehlc l;

    static {
        ehrd.j = bboh.b("ViewConsumerServicesBaseChimeraActivity", bbcu.dO);
    }

    public ehrd(cmec cmec0, DispatchingAndroidInjector dispatchingAndroidInjector0, ehlc ehlc0) {
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(dispatchingAndroidInjector0, "androidInjector");
        super();
        this.k = cmec0;
        this.l = ehlc0;
    }

    public ehrd(cmec cmec0, DispatchingAndroidInjector dispatchingAndroidInjector0, ehlc ehlc0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            ehlc0 = null;
        }
        this(cmec0, dispatchingAndroidInjector0, ehlc0);
    }

    public abstract Class a();

    @Override  // xos
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!bbqa.c()) {
            ((ggtj)ehrd.j.i()).x("activity isn\'t available on platforms lower than T. Finishing");
            this.finish();
            return;
        }
        Intent intent0 = this.getIntent();
        ibuq.e(intent0, "getIntent(...)");
        ehpu.a(intent0, this.k);
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.C();
            Class class0 = this.a();
            Intent intent1 = this.getIntent();
            ibuq.e(intent1, "getIntent(...)");
            ca0.D(0x7F0B0FE4, class0, ehpu.b(intent1));  // id:content_frame
            this.getApplicationContext();
            ca0.t(0x7F0B0FE6, new ehnd());  // id:content_parent
            ca0.a();
        }
        this.getApplicationContext();
        ehlc ehlc0 = this.l;
        if(ehlc0 == null) {
            throw new IllegalStateException("HaTS is enabled on device but hatsController is null");
        }
        Activity activity0 = this.getContainerActivity();
        ibuq.e(activity0, "getContainerActivity(...)");
        ehlc0.a(activity0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        gftb.g(ibuq.m(intent0.getAction(), "android.intent.action.MANAGE_PERMISSION_USAGE") || ibuq.m(intent0.getAction(), "com.google.android.gms.permissions.ACTION_MANAGE_SERVICE"), "onNewIntent fired with invalid intent action " + intent0.getAction(), new Object[0]);
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        ehpu.a(intent0, this.k);
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.C();
        ca0.H(0x7F0B0FE4, this.a(), ehpu.b(intent0), null);  // id:content_frame
        ca0.a();
    }
}

