import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Map;

public class gxyb {
    public static Intent h(Context context0, byte[] arr_b, String s, boolean z) {
        if(z && s != null) {
            int v = gxup.a(context0, "com.google.android.apps.adm");
            if(v > 1) {
                if(v >= 20001343) {
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    ibuq.f(hlus.c, "deepLinkType");
                    Map map0 = ibpz.i(new ibns[]{new ibns("deviceIdentifierType", "accountKey"), new ibns("deviceIdentifier", hfxi.a(hfsf0, ghjc.f))});
                    return new Intent("android.intent.action.VIEW", Uri.parse(new hlup(hlus.c, s, null, map0, 52).a().toString()));
                }
                return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("android").authority("find").appendQueryParameter("device", ghjc.f.o(arr_b)).build());
            }
            return gxvu.a(context0, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", "com.google.android.apps.adm").build()));
        }
        return null;
    }

    public static Intent i(Context context0, byte[] arr_b, String s, String s1, hihd hihd0, boolean z, boolean z1) {
        return z ? new Intent("com.google.android.gms.nearby.fastpair.FINDDEVICE").addCategory("android.intent.category.DEFAULT").setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.devices.FindDeviceActivity").setFlags(0x10000000).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", arr_b).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT", s).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", s1).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", hihd0.e) : gxyb.h(context0, arr_b, s, z1);
    }

    public static Intent j(Context context0) {
        return new Intent().setClassName(context0, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    public static Intent k(Context context0, gyyc gyyc0) {
        return gxyb.j(context0).setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_EVENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", gyyc0.cY);
    }

    public static Intent l(Context context0, gyyc gyyc0, String s, hihd hihd0, String s1, byte[] arr_b, Parcelable parcelable0) {
        Intent intent0 = gxyb.j(context0);
        if((parcelable0 instanceof Intent)) {
            intent0.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_LAUNCH_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_INTENT", parcelable0);
            return intent0.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", gyyc0.cY).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", s).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", hihd0.e).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", s1).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", arr_b);
        }
        intent0.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_SEND_PENDING_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_PENDING_INTENT", parcelable0);
        return intent0.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", gyyc0.cY).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", s).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", hihd0.e).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", s1).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", arr_b);
    }

    public static Intent m(Context context0, gyyc gyyc0, String s, String s1, long v) {
        return gxyb.j(context0).setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_WEAR_OS_FRAGMENT_EVENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", gyyc0.cY).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", s).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", s1).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DURATION_MILLIS", v);
    }
}

