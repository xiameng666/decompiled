import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class abuo {
    static List a;
    static final Object b;
    private static final bboh c;
    private final Context d;

    static {
        abuo.c = bboh.b("GoogleSettingsIndexGetter", bbcu.dH);
        abuo.b = new Object();
    }

    protected abuo(Context context0) {
        batl.s(context0);
        this.d = context0;
    }

    public final Collection a(boolean z) {
        List list0 = DesugarCollections.synchronizedList(new ArrayList());
        Bundle bundle0 = new Bundle();
        cjah.b(bundle0, list0);
        abuo.a = list0;
        Intent intent0 = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage("com.google.android.gms");
        bundle0.putString("className", "GoogleSettingsIndexGetter");
        intent0.putExtras(bundle0);
        Object object0 = abuo.b;
        synchronized(object0) {
            this.d.startService(intent0);
            try {
                object0.wait();
            }
            catch(InterruptedException interruptedException0) {
                Log.w("GoogleSettingsIndexGetter", interruptedException0);
            }
        }
        HashMap hashMap0 = new HashMap();
        List list1 = abuo.a;
        if(list1 != null) {
            Context context0 = this.d;
            boolean z1 = azqk.g(context0);
            for(Object object1: list1) {
                ((Parcel)object1).setDataPosition(0);
                GoogleSettingsItem googleSettingsItem0 = (GoogleSettingsItem)GoogleSettingsItem.CREATOR.createFromParcel(((Parcel)object1));
                ((Parcel)object1).recycle();
                if(googleSettingsItem0.j) {
                    abup abup0 = new abup(context0, googleSettingsItem0);
                    if(hashMap0.containsKey(abup0.a())) {
                        ((ggtj)abuo.c.i()).B("index key (%s) already present, ignore it", abup0.a());
                    }
                    else {
                        if(z && !z1 && abup0.c()) {
                            continue;
                        }
                        hashMap0.put(abup0.a(), abup0);
                    }
                }
            }
        }
        List list2 = abuo.a;
        if(list2 != null) {
            list2.clear();
            abuo.a = null;
        }
        return hashMap0.values();
    }
}

