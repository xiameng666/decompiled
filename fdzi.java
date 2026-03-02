import android.os.SystemProperties;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class fdzi implements ffmj {
    private final ggla a;

    public fdzi() {
        ggdi ggdi0 = new ggdi();
        this.a = ggdi0;
        fdzi.b(new fdzg(fdzh.b(SystemProperties.get("ro.oem.ios_companion_app_ids", "EQHXZ8M8AV.com.google.Wear:EQHXZ8M8AV.com.google.Wear.dev:4ANB9W7R3P.com.google.Wear.enterprise:EQHXZ8M8AV.com.google.experimental0.dev:EQHXZ8M8AV.com.google.experimental1.dev:4ANB9W7R3P.com.google.WearOS.enterprise:EQHXZ8M8AV.com.google.DeviceCompanion.dev:4ANB9W7R3P.com.google.DeviceCompanion.fishfood:4ANB9W7R3P.com.google.DeviceCompanion.enterprise:EQHXZ8M8AV.com.google.DeviceCompanion:EQHXZ8M8AV.com.google.DemoWearSdk.dev:EQHXZ8M8AV.com.google.WearSdkDemo.dev")), gged_interceptors.m("com.google.android.gms", fdzh.a())), ggdi0);
        fdzi.b(new fdzg(fdzh.b("EQHXZ8M8AV.com.google.Wear:EQHXZ8M8AV.com.google.Wear.dev:4ANB9W7R3P.com.google.Wear.enterprise:EQHXZ8M8AV.com.google.experimental0.dev:EQHXZ8M8AV.com.google.experimental1.dev:4ANB9W7R3P.com.google.WearOS.enterprise:EQHXZ8M8AV.com.google.DeviceCompanion.dev:4ANB9W7R3P.com.google.DeviceCompanion.fishfood:4ANB9W7R3P.com.google.DeviceCompanion.enterprise:EQHXZ8M8AV.com.google.DeviceCompanion:EQHXZ8M8AV.com.google.DemoWearSdk.dev:EQHXZ8M8AV.com.google.WearSdkDemo.dev"), gged_interceptors.o("com.google.android.gms", "com.fitbit.FitbitMobile", "com.google.android.wearable.assistant", fdzh.a())), ggdi0);
    }

    public final List a(String s) {
        Set set0 = ((gfyw)this.a).h(s);
        HashSet hashSet0 = new HashSet();
        for(Object object0: set0) {
            hashSet0.addAll(((fdzg)object0).b);
        }
        return ggia.b(hashSet0);
    }

    private static void b(fdzg fdzg0, ggla ggla0) {
        for(Object object0: fdzg0.a) {
            ggla0.v(((String)object0), fdzg0);
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Trusted iOS Peers:");
        bbpd0.b();
        for(Object object0: new HashSet(this.a.x())) {
            bbpd0.println("App IDs: ");
            bbpd0.b();
            for(Object object1: ((fdzg)object0).a) {
                bbpd0.println(ffmf.a(((String)object1)));
            }
            bbpd0.a();
            bbpd0.println("Associated packages:");
            bbpd0.b();
            ggqk ggqk0 = ((gged_interceptors)((fdzg)object0).b).E();
            while(ggqk0.hasNext()) {
                Object object2 = ggqk0.next();
                bbpd0.println(ffmf.a(((String)object2)));
            }
            bbpd0.a();
        }
        bbpd0.a();
    }
}

