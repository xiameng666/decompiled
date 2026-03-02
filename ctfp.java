import android.content.Context;
import android.content.Intent;

public final class ctfp implements ccrn {
    private final Context a;
    private final csxk b;
    private final cuma c;

    public ctfp(Context context0, csxk csxk0, cuma cuma0) {
        ibuq.f(csxk0, "settingsManager");
        super();
        this.a = context0;
        this.b = csxk0;
        this.c = cuma0;
    }

    @Override  // ccrn
    public final Object g(ibrl ibrl0) {
        ctfo ctfo0;
        if((ibrl0 instanceof ctfo)) {
            ctfo0 = (ctfo)ibrl0;
            int v = ctfo0.c;
            if((v & 0x80000000) == 0) {
                ctfo0 = new ctfo(this, ibrl0);
            }
            else {
                ctfo0.c = v - 0x80000000;
            }
        }
        else {
            ctfo0 = new ctfo(this, ibrl0);
        }
        Object object0 = ctfo0.a;
        Object object1 = ibrx.a;
        switch(ctfo0.c) {
            case 0: {
                ibnx.b(object0);
                ctfo0.c = 1;
                object0 = this.c.a(ctfo0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue() && !cswr.a(this.b.i())) {
            Intent intent0 = cssn.a();
            intent0.putExtra("EXTRA_SETTINGS_INTENT_SOURCE", "GOOGLE_SETTINGS_CONTEXTUAL_CARD");
            if(hvmz.g()) {
                intent0.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", cmfd.c.f);
                intent0.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
            }
            ccmy ccmy0 = ccmu.a(intent0, cmeu.y);
            ibuq.e("@com.google.android.gms:string/multidevice_cross_devices_title", "getString(...)");
            ibuq.e("Find and share with your other nearby devices", "getString(...)");
            ibuq.e("@com.google.android.gms:string/common_set_up", "getString(...)");
            ccne ccne0 = new ccne(new ccnb("@com.google.android.gms:string/common_set_up", ccmy0));
            return new ccnh("@com.google.android.gms:string/multidevice_cross_devices_title", "Find and share with your other nearby devices", ccow.x, ccmy0, ccne0, null, 0x60);
        }
        return null;
    }
}

