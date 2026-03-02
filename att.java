import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

final class att {
    public final awp a;
    public final axc b;
    public final boolean c;

    public att(awp awp0) {
        this.a = awp0;
        this.b = axc.b(awp0);
        int[] arr_v = (int[])awp0.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                if(arr_v[v] == 18) {
                    z = true;
                    break;
                }
            }
        }
        this.c = z;
    }

    public static bat a(bat bat0, Collection collection0, Set set0) {
        if(bat0.h == 1) {
            return null;
        }
        for(Object object0: collection0) {
            bat bat1 = (bat)object0;
            kay.j(bat1, "Fully specified DynamicRange cannot be null.");
            kay.d(bat1.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if(bat1.h != 1 && att.d(bat0, bat1, set0)) {
                return bat1;
            }
        }
        return null;
    }

    public static void b(Set set0, bat bat0, axc axc0) {
        kay.d(((boolean)(set0.isEmpty() ^ 1)), "Cannot update already-empty constraints.");
        Set set1 = axc0.a.b(bat0);
        if(!set1.isEmpty()) {
            HashSet hashSet0 = new HashSet(set0);
            set0.retainAll(set1);
            if(set0.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", bat0, TextUtils.join("\n  ", set1), TextUtils.join("\n  ", hashSet0)));
            }
        }
    }

    public static boolean c(bat bat0, bat bat1) {
        kay.d(bat1.b(), "Fully specified range is not actually fully specified.");
        int v = bat0.h;
        if(v == 2) {
            return bat1.h == 1 ? false : bat0.i == 0 || bat0.i == bat1.i;
        }
        return v == 0 || v == 2 || v == bat1.h ? bat0.i == 0 || bat0.i == bat1.i : false;
    }

    public static boolean d(bat bat0, bat bat1, Set set0) {
        if(!set0.contains(bat1)) {
            bcs.h("DynamicRangeResolver");
            return false;
        }
        return att.c(bat0, bat1);
    }
}

