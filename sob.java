import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sob {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final List d;

    private sob(boolean z, boolean z1, boolean z2, List list0) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = list0;
    }

    static sob a(Bundle bundle0) {
        int v2;
        if(bundle0 == null) {
            return sob.b();
        }
        sor.a(bundle0);
        boolean z = bundle0.getBoolean("play_installable");
        bundle0.getBoolean("install_warning");
        boolean z1 = bundle0.getBoolean("contains_ads");
        boolean z2 = bundle0.getBoolean("contains_iap");
        int[] arr_v = bundle0.getIntArray("not_installable_reason_codes");
        if(arr_v != null && arr_v.length != 0) {
            List list0 = new ArrayList();
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                switch(v1) {
                    case 0: {
                        v2 = 0;
                        break;
                    }
                    case 1: {
                        v2 = 1;
                        break;
                    }
                    case 2: {
                        v2 = 2;
                        break;
                    }
                    case 3: {
                        v2 = 3;
                        break;
                    }
                    case 4: {
                        v2 = 4;
                        break;
                    }
                    case 5: {
                        v2 = 5;
                        break;
                    }
                    case 6: {
                        v2 = 6;
                        break;
                    }
                    case 7: {
                        v2 = 7;
                        break;
                    }
                    case 8: {
                        v2 = 8;
                        break;
                    }
                    case 9: {
                        v2 = 9;
                        break;
                    }
                    default: {
                        Log.w("PlayP2pClient.Constants", "Unrecognized NotInstallableReasonCode enum encountered: " + v1);
                        v2 = 0;
                    }
                }
                list0.add(Integer.valueOf(v2));
            }
            return new sob(z, z1, z2, list0);
        }
        return new sob(z, z1, z2, Collections.EMPTY_LIST);
    }

    static sob b() {
        new sor(1);
        return new sob(false, false, false, Collections.EMPTY_LIST);
    }

    public final List c() {
        return new ArrayList(this.d);
    }
}

