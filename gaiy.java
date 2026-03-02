import android.app.Activity;
import android.content.res.TypedArray;

public final class gaiy {
    public static void a(Activity activity0, int v) {
        if(gaec.C(activity0)) {
            activity0.overridePendingTransition(0, 0);
            return;
        }
        if(!gafp.b() || !gaec.u(activity0)) {
        label_6:
            if(gafp.b() && v == 6) {
                if(gaec.u(activity0)) {
                    activity0.overridePendingTransition((gaec.y(activity0) ? 0x7F0100B2 : 0x7F0100B1), 0x7F0100B3);  // anim:shared_x_axis_activity_close_enter_dynamic_color
                    return;
                }
                activity0.overridePendingTransition(0x7F0100D2, 0x7F0100D3);  // anim:sud_slide_back_in
                return;
            }
            switch(v) {
                case 2: {
                    activity0.overridePendingTransition(0x7F0100D2, 0x7F0100D3);  // anim:sud_slide_back_in
                    return;
                }
                case 3: {
                    activity0.overridePendingTransition(0x7F0100D6, 0x10A0001);  // anim:sud_stay
                    return;
                }
                case 4: {
                    activity0.overridePendingTransition(0x7F0100CE, 0x7F0100CF);  // anim:sud_pre_p_activity_close_enter
                    break;
                }
            }
        }
        else if(v == 6) {
            v = 6;
            goto label_6;
        }
    }

    public static void b(Activity activity0, int v) {
        gaiy.c(activity0, v, false);
    }

    public static void c(Activity activity0, int v, boolean z) {
        if(gaec.C(activity0)) {
            activity0.overridePendingTransition(0, 0);
            return;
        }
        if(gafp.b() && !z && gaec.u(activity0)) {
            if(v != 6) {
                return;
            }
            v = 6;
        }
        if(gafp.b() && v == 6) {
            if(gaec.u(activity0)) {
                activity0.overridePendingTransition((gaec.y(activity0) ? 0x7F0100B5 : 0x7F0100B4), 0x7F0100B6);  // anim:shared_x_axis_activity_open_enter_dynamic_color
                return;
            }
            activity0.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
            return;
        }
        switch(v) {
            case -1: {
                activity0.overridePendingTransition(0, 0);
                return;
            }
            case 1: {
                TypedArray typedArray0 = activity0.obtainStyledAttributes(0x1030001, new int[]{0x10100B8, 0x10100B9});
                activity0.overridePendingTransition(typedArray0.getResourceId(0, 0), typedArray0.getResourceId(1, 0));
                typedArray0.recycle();
                return;
            }
            case 2: {
                activity0.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
                return;
            }
            case 3: {
                activity0.overridePendingTransition(0x10A0000, 0x7F0100D6);  // anim:sud_stay
                return;
            }
            case 4: {
                activity0.overridePendingTransition(0x7F0100D0, 0x7F0100D1);  // anim:sud_pre_p_activity_open_enter
            }
        }
    }
}

