import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

public final class cpzc {
    public final int a;
    private final gful_cronetEngineProvider b;
    private final String c;

    public cpzc(gful_cronetEngineProvider gful0, String s, int v) {
        this.a = v;
        this.b = gful0;
        this.c = s;
    }

    public final void a(bwni bwni0, Uri uri0) {
        int v = this.a;
        int v1 = bwni0.b;
        if(v1 != 1 && (v != 0 && v != 1)) {
            throw new cpzd(new Status(10, "Expecting a google signed package but got : " + this.c), 11);
        }
        gful_cronetEngineProvider gful0 = this.b;
        String s = this.c;
        int v2 = bwnh.b(v1);
        if(v2 == 0) {
            throw null;
        }
        switch(v2 - 1) {
            case 0: {
                break;
            }
            case 1: {
                if(v != 0 && v != 1) {
                    throw new cpzd(new Status(10, "Access denied to uri (not allowed): " + uri0), 5);
                }
                break;
            }
            default: {
            alab1:
                switch(v2 - 1) {
                    case 2: {
                        if(v != 0 && v != 1) {
                            throw new cpzd(new Status(10, "Access denied to uri (not allowed): " + uri0), 5);
                        }
                        Iterator iterator0 = (v1 == 3 ? ((bwnm)bwni0.c) : bwnm.a).b.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                throw new cpzd(new Status(10, "Access denied to uri (not allowed): " + uri0), 5);
                            }
                            Object object0 = iterator0.next();
                            bwnl bwnl0 = (bwnl)object0;
                            if(!TextUtils.equals(bwnl0.b, s)) {
                                continue;
                            }
                            if((bwnl0.c == null ? bwnn.a : bwnl0.c).b.isEmpty()) {
                                break alab1;
                            }
                            try {
                                int v3 = ((PackageManager)gful0.mr()).getPackageInfo(s, 0).versionCode;
                                if((bwnl0.c == null ? bwnn.a : bwnl0.c).b.contains(Long.valueOf(v3))) {
                                    continue;
                                }
                            }
                            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                                throw new cpzd(new Status(10, "Could not retrieve calling package info. Error: " + packageManager$NameNotFoundException0.getClass().getName()), 5);
                            }
                            return;
                        }
                    }
                    case 3: {
                        if(v != 0) {
                            throw new cpzd(new Status(10, "Access denied to uri (not allowed): " + uri0), 5);
                        }
                        return;
                    }
                    default: {
                        throw new cpzd(new Status(10, "Access denied to uri (not allowed): " + uri0), 5);
                    }
                }
            }
        }
    }

    public final void b(Uri uri0) {
        bwnj bwnj0 = cpzc.c(uri0);
        this.a((bwnj0.d == null ? bwni.a : bwnj0.d), uri0);
        Uri uri1 = new Uri.Builder().path(bwnj0.b).build();
        if(uri0.getPathSegments().size() == uri1.getPathSegments().size() + 1) {
            return;
        }
        throw new cpzd(new Status(10, "Subdirectory system not supported: " + uri0), 5);
    }

    public static bwnj c(Uri uri0) {
        bwnk bwnk0 = hucu.b();
        if(bwnk0 == null) {
            throw new cpzd(new Status(13, "Error in the P/H configuration " + uri0), 10);
        }
        bwnj bwnj0 = cpyz.a(uri0, bwnk0.b);
        if(bwnj0 != null) {
            return bwnj0;
        }
        throw new cpzd(new Status(10, "Access denied to uri (dir not in list): " + uri0), 5);
    }
}

