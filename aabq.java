import android.content.Context;
import android.graphics.drawable.Drawable;

public final class aabq {
    public static int a(Context context0, grwd grwd0) {
        switch(grwd0.ordinal()) {
            case 6: 
            case 7: 
            case 8: {
                return aabu.r(context0) ? 0x7F080CCD : 0x7F080CCF;  // drawable:quantum_ic_chevron_left_vd_theme_24
            }
            case 9: {
                return 0x7F080D0F;  // drawable:quantum_ic_edit_vd_theme_24
            }
            case 10: {
                return 0x7F080D9B;  // drawable:quantum_ic_open_in_new_vd_theme_24
            }
            case 11: {
                return 0x7F080BED;  // drawable:quantum_gm_ic_phone_android_vd_theme_24
            }
            case 12: {
                return hoju.j() ? 0x7F08062B : cchs.c(context0, 0x7F040132, 0x7F08021A);  // drawable:gs_shapes_vd_theme_24
            }
            case 13: {
                return cchs.c(context0, 0x7F040115, 0x7F080206);  // attr:asAccountCircleOutlineVdTheme24
            }
            case 15: {
                return 0x7F080D45;  // drawable:quantum_ic_help_outline_vd_theme_24
            }
            case 17: {
                return 0x7F080C75;  // drawable:quantum_ic_account_circle_vd_theme_24
            }
            case 14: 
            case 18: {
                return 0x7F080DCC;  // drawable:quantum_ic_search_vd_theme_24
            }
            case 19: {
                return 0x7F080D47;  // drawable:quantum_ic_help_vd_theme_24
            }
            case 21: {
                return 0x7F080216;  // drawable:as_ic_personal_info
            }
            case 22: {
                return 0x7F080C49;  // drawable:quantum_gm_ic_toggle_on_vd_theme_24
            }
            case 23: {
                return 0x7F080BE3;  // drawable:quantum_gm_ic_payment_vd_theme_24
            }
            case 24: {
                return 0x7F080BE5;  // drawable:quantum_gm_ic_people_outline_vd_theme_24
            }
            case 25: {
                return 0x7F080BC1;  // drawable:quantum_gm_ic_lock_vd_theme_24
            }
            case 27: {
                return 0x7F080CE0;  // drawable:quantum_ic_cloud_off_vd_theme_24
            }
            case 26: 
            case 28: {
                return 0x7F080D1E;  // drawable:quantum_ic_error_outline_vd_theme_24
            }
            case 29: {
                return 0x7F080613;  // drawable:gs_quiz_vd_theme_24
            }
            case 30: {
                return 0x7F080A68;
            }
            case 33: {
                return 0x7F080B90;  // drawable:quantum_gm_ic_group_vd_theme_24
            }
            case 34: {
                return 0x7F080D3D;  // drawable:quantum_ic_google_vd_theme_24
            }
            case 43: {
                return 0x7F0805B1;  // drawable:gs_link_vd_theme_24
            }
            default: {
                return 0;
            }
        }
    }

    public static Drawable b(Context context0, grwd grwd0) {
        int v = aabq.a(context0, grwd0);
        if(v != 0) {
            Drawable drawable0 = context0.getDrawable(v);
            if(drawable0 != null) {
                drawable0.setAutoMirrored(aabq.d(grwd0));
                return drawable0;
            }
        }
        return null;
    }

    public static Drawable c(Context context0, grwe grwe0) {
        return grwd.b(grwe0.c) == null ? null : aabq.b(context0, grwd.b(grwe0.c));
    }

    public static boolean d(grwd grwd0) {
        return grwd0 == grwd.k;
    }
}

