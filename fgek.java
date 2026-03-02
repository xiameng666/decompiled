import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.util.Log;

public final class fgek {
    public static int a(Context context0, String s) {
        gajl gajl0 = gajl.b(context0);
        if(gajl0 != null) {
            Resources resources0 = gajl0.b;
            int v = resources0.getIdentifier(s, "color", gajl0.a);
            if(v != 0) {
                try {
                    return resources0.getColor(v, null);
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                    Log.w("PartnerCustomization", "Failed to retrieve color resource: " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return 0;
    }

    public static String b(Context context0, String s) {
        gajl gajl0 = gajl.b(context0);
        if(gajl0 != null) {
            Resources resources0 = gajl0.b;
            int v = resources0.getIdentifier(s, "string", gajl0.a);
            if(v != 0) {
                try {
                    return resources0.getString(v);
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                    Log.w("PartnerCustomization", "Failed to retrieve string resource: " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return null;
    }

    public static Boolean c(Context context0) {
        gajl gajl0 = gajl.b(context0);
        if(gajl0 != null) {
            Resources resources0 = gajl0.b;
            int v = resources0.getIdentifier("qs_qr_draw_border", "bool", gajl0.a);
            if(v != 0) {
                try {
                    return Boolean.valueOf(resources0.getBoolean(v));
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                    Log.w("PartnerCustomization", "Failed to retrieve boolean resource: " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return null;
    }

    public static int d(Context context0) {
        gajl gajl0 = gajl.b(context0);
        if(gajl0 != null) {
            Resources resources0 = gajl0.b;
            int v = resources0.getIdentifier("qs_qr_border_width", "dimen", gajl0.a);
            if(v != 0) {
                try {
                    return resources0.getDimensionPixelSize(v);
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                    Log.w("PartnerCustomization", "Failed to retrieve dimension resource: " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return 0;
    }

    public static float e(Context context0) {
        gajl gajl0 = gajl.b(context0);
        if(gajl0 != null) {
            Resources resources0 = gajl0.b;
            int v = resources0.getIdentifier("qs_qr_border_radius", "dimen", gajl0.a);
            if(v != 0) {
                try {
                    return resources0.getDimension(v);
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                    Log.w("PartnerCustomization", "Failed to retrieve dimension resource: " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return 0.0f;
    }
}

