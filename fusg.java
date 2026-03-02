import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.util.ArrayList;

public final class fusg implements fura {
    private static final SparseArray a;
    private static final SparseArray b;
    private static final SparseArray c;

    static {
        SparseArray sparseArray0 = new SparseArray();
        sparseArray0.put(8, "FEATURE_ACTION_BAR");
        sparseArray0.put(9, "FEATURE_ACTION_BAR_OVERLAY");
        sparseArray0.put(10, "FEATURE_ACTION_MODE_OVERLAY");
        sparseArray0.put(13, "FEATURE_ACTIVITY_TRANSITIONS");
        sparseArray0.put(12, "FEATURE_CONTENT_TRANSITIONS");
        sparseArray0.put(6, "FEATURE_CONTEXT_MENU");
        sparseArray0.put(7, "FEATURE_CUSTOM_TITLE");
        sparseArray0.put(3, "FEATURE_LEFT_ICON");
        sparseArray0.put(1, "FEATURE_NO_TITLE");
        sparseArray0.put(0, "FEATURE_OPTIONS_PANEL");
        sparseArray0.put(4, "FEATURE_RIGHT_ICON");
        sparseArray0.put(11, "FEATURE_SWIPE_TO_DISMISS");
        fusg.a = sparseArray0;
        SparseArray sparseArray1 = new SparseArray();
        sparseArray1.put(1, "FLAG_ALLOW_LOCK_WHILE_SCREEN_ON");
        sparseArray1.put(0x20000, "FLAG_ALT_FOCUSABLE_IM");
        sparseArray1.put(2, "FLAG_DIM_BEHIND");
        sparseArray1.put(0x400000, "FLAG_DISMISS_KEYGUARD");
        sparseArray1.put(0x80000000, "FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS");
        sparseArray1.put(0x800, "FLAG_FORCE_NOT_FULLSCREEN");
        sparseArray1.put(0x400, "FLAG_FULLSCREEN");
        sparseArray1.put(0x1000000, "FLAG_HARDWARE_ACCELERATED");
        sparseArray1.put(0x8000, "FLAG_IGNORE_CHEEK_PRESSES");
        sparseArray1.put(0x80, "FLAG_KEEP_SCREEN_ON");
        sparseArray1.put(0x40000000, "FLAG_LAYOUT_ATTACHED_IN_DECOR");
        sparseArray1.put(0x10000, "FLAG_LAYOUT_INSET_DECOR");
        sparseArray1.put(0x2000000, "FLAG_LAYOUT_IN_OVERSCAN");
        sparseArray1.put(0x100, "FLAG_LAYOUT_IN_SCREEN");
        sparseArray1.put(0x200, "FLAG_LAYOUT_NO_LIMITS");
        sparseArray1.put(0x10000000, "FLAG_LOCAL_FOCUS_MODE");
        sparseArray1.put(8, "FLAG_NOT_FOCUSABLE");
        sparseArray1.put(0x20, "FLAG_NOT_TOUCH_MODAL");
        sparseArray1.put(0x4000, "FLAG_SCALED");
        sparseArray1.put(0x2000, "FLAG_SECURE");
        sparseArray1.put(0x100000, "FLAG_SHOW_WALLPAPER");
        sparseArray1.put(0x80000, "FLAG_SHOW_WHEN_LOCKED");
        sparseArray1.put(0x800000, "FLAG_SPLIT_TOUCH");
        sparseArray1.put(0x8000000, "FLAG_TRANSLUCENT_NAVIGATION");
        sparseArray1.put(0x4000000, "FLAG_TRANSLUCENT_STATUS");
        sparseArray1.put(0x200000, "FLAG_TURN_SCREEN_ON");
        sparseArray1.put(0x40000, "FLAG_WATCH_OUTSIDE_TOUCH");
        fusg.b = sparseArray1;
        SparseArray sparseArray2 = new SparseArray();
        sparseArray2.put(4, "SYSTEM_UI_FLAG_FULLSCREEN");
        sparseArray2.put(2, "SYSTEM_UI_FLAG_HIDE_NAVIGATION");
        sparseArray2.put(0x800, "SYSTEM_UI_FLAG_IMMERSIVE");
        sparseArray2.put(0x1000, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY");
        sparseArray2.put(0x400, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN");
        sparseArray2.put(0x200, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION");
        sparseArray2.put(0x100, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        sparseArray2.put(16, "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR");
        sparseArray2.put(0x2000, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR");
        sparseArray2.put(1, "SYSTEM_UI_FLAG_LOW_PROFILE");
        fusg.c = sparseArray2;
    }

    @Override  // fura
    public final void a(fusj fusj0, View view0) {
        if(view0.isAttachedToWindow() && !(view0.getParent() instanceof ViewGroup)) {
            View view1 = view0.findViewById(0x1020002);
            if(view1 == null) {
                view1 = view0;
            }
            Activity activity0 = fusg.b(view1.getContext());
            if(activity0 != null) {
                Window window0 = activity0.getWindow();
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; true; ++v) {
                    SparseArray sparseArray0 = fusg.a;
                    if(v >= sparseArray0.size()) {
                        break;
                    }
                    if(window0.hasFeature(sparseArray0.keyAt(v))) {
                        arrayList0.add(((String)sparseArray0.valueAt(v)));
                    }
                }
                fusj0.b("window_features", TextUtils.join(" | ", arrayList0));
                fusj0.b("window_layoutParams_flags", fusg.c(fusg.b, windowManager$LayoutParams0.flags));
                fusj0.b("window_layoutParams_systemUiVisibility", (windowManager$LayoutParams0.systemUiVisibility == 0 ? "SYSTEM_UI_FLAG_VISIBLE" : fusg.c(fusg.c, windowManager$LayoutParams0.systemUiVisibility)));
                fusj0.b("rootWindowInsets", view0.getRootWindowInsets().toString());
                fusj0.e("window_statusBarColor", window0.getStatusBarColor());
                fusj0.e("window_navigationBarColor", window0.getNavigationBarColor());
                fuse.c(activity0, activity0, fusj0, "activity_");
            }
        }
    }

    private static Activity b(Context context0) {
        if(context0 != null) {
            if((context0 instanceof Activity)) {
                return (Activity)context0;
            }
            return (context0 instanceof ContextWrapper) ? fusg.b(((ContextWrapper)context0).getBaseContext()) : null;
        }
        return null;
    }

    private static String c(SparseArray sparseArray0, int v) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            if((v & v2) == v2) {
                arrayList0.add(((String)sparseArray0.valueAt(v1)));
            }
        }
        return TextUtils.join(" | ", arrayList0);
    }
}

