import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

public final class ddxr {
    public static final ShareTarget a(goz goz0) {
        String s;
        goz0.M(0x735E335D);
        Activity activity0 = (Activity)goz0.h(ddyi.a);
        Object object0 = null;
        if(activity0 == null) {
            s = null;
        }
        else {
            Intent intent0 = activity0.getIntent();
            s = intent0 == null ? null : intent0.getStringExtra("android.intent.extra.shortcut.ID");
        }
        goz0.M(5004770);
        boolean z = goz0.X(s);
        Object object1 = goz0.j();
        if(z || object1 == gop.a) {
            if(activity0 == null) {
            label_25:
                if(s != null) {
                    List list0 = new cuqx(activity0).a();
                    ibuq.e(list0, "getDynamicShortcuts(...)");
                    for(Object object2: list0) {
                        jwo jwo0 = (jwo)object2;
                        if(!ibuq.m(jwo0.b, s) || (jwo0.j == null || !jwo0.j.contains("com.google.android.gms.nearby.sharing.main.SHARE_TARGET"))) {
                            continue;
                        }
                        goto label_35;
                    }
                    object2 = null;
                label_35:
                    if(((jwo)object2) != null) {
                        PersistableBundle persistableBundle0 = ((jwo)object2).n;
                        if(persistableBundle0 != null) {
                            String s1 = persistableBundle0.getString("direct_share_target_string");
                            if(s1 != null) {
                                try {
                                    object0 = (ShareTarget)ddst.a(s1, ShareTarget.CREATOR);
                                }
                                catch(IllegalArgumentException unused_ex) {
                                }
                            }
                        }
                    }
                }
            }
            else {
                Intent intent1 = activity0.getIntent();
                if(intent1 != null) {
                    byte[] arr_b = intent1.getByteArrayExtra("direct_share_target_bytes");
                    ShareTarget shareTarget0 = null;
                    if(arr_b != null) {
                        try {
                            shareTarget0 = (ShareTarget)ddst.b(arr_b, ShareTarget.CREATOR);
                        }
                        catch(IllegalArgumentException unused_ex) {
                        }
                    }
                    if(shareTarget0 != null) {
                        object0 = shareTarget0;
                        goto label_41;
                    }
                }
                goto label_25;
            }
        label_41:
            goz0.P(object0);
            object1 = object0;
        }
        goz0.x();
        goz0.M(5004770);
        boolean z1 = goz0.Z(activity0);
        Object object3 = goz0.j();
        if(z1 || object3 == gop.a) {
            object3 = new ddxq(activity0);
            goz0.P(object3);
        }
        goz0.x();
        gqe.h(((ibth)object3), goz0);
        goz0.x();
        return (ShareTarget)object1;
    }
}

