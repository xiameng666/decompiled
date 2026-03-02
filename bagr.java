import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashSet;

public final class bagr {
    public static void a(Context context0) {
        if(hpbc.a.b().a()) {
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            hashSet0.add(new fuqz());
            hashSet0.add(new furc());
            hashSet0.add(new furz());
            hashSet0.add(new fusb());
            hashSet0.add(new fuse());
            hashSet0.add(new fusf());
            hashSet0.add(new fusg());
            hashSet0.add(new bagq());
            if(hashSet0.isEmpty()) {
                throw new IllegalStateException("No AttributeGenerators were registered. Try calling withCommonAttributeGenerators().");
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hashSet0) {
                arrayList0.add(new furt(((fura)object0)));
            }
            arrayList0.addAll(hashSet1);
            furg furg0 = new furg(new furs(arrayList0));
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.libraries.snapshot.action.CAPTURE_SNAPSHOT");
            intentFilter0.addAction("com.google.android.libraries.snapshot.action.GET_SNAPSHOTTER_INFO");
            intentFilter0.addAction("com.google.android.libraries.snapshot.action.RESET_COUNTERS");
            intentFilter0.setPriority(furg0.c);
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(furg0, intentFilter0, 2);
                return;
            }
            context0.registerReceiver(furg0, intentFilter0);
        }
    }
}

