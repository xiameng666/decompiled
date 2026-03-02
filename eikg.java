import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import com.google.android.gms.personalsafety.storage.LocationScan;
import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;
import com.google.android.gms.personalsafety.storage.TagDeviceData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class eikg {
    public static gfsx a(List list0, String s, gwha gwha0) {
        if(list0.isEmpty()) {
            return gfqx.a;
        }
        eikc eikc0 = new eikc();
        ArrayList arrayList0 = new ArrayList();
        long v = 0x7FFFFFFFFFFFFFFFL;
        int v1 = 0;
        for(Object object0: list0) {
            gwhi gwhi0 = (gwhi)object0;
            v = Math.min(v, (gwhi0.d == null ? gwgx.a : gwhi0.d).f);
            int v2 = (gwhi0.d == null ? gwgx.a : gwhi0.d).h;
            if(Long.compare(v, 0x7FFFFFFFFFFFFFFFL) == 0) {
                ((ggtj)((ggtj)eicd.a.j()).ar(0x32FF)).J("wrong rt device info: time %d, type %d ", v, v2);
            }
            else if(v2 == 0) {
                ((ggtj)((ggtj)eicd.a.j()).ar(0x32FF)).J("wrong rt device info: time %d, type %d ", v, 0);
            }
            if(((gwhi0.e == null ? gwhf.a : gwhi0.e).b & 8) != 0) {
                gwhf gwhf0 = gwhi0.e;
                if(((gwhf0 == null ? gwhf.a : gwhf0).b & 16) != 0) {
                    double f = (double)(gwhf0 == null ? gwhf.a : gwhf0).f;
                    if(gwhf0 == null) {
                        gwhf0 = gwhf.a;
                    }
                    arrayList0.add(new LocationScan(new LatLng(f / 10000000.0, ((double)gwhf0.g) / 10000000.0), (gwhi0.e == null ? gwhf.a : gwhi0.e).e));
                }
            }
            v1 = v2;
        }
        eikc0.c = arrayList0;
        if(v < 0x7FFFFFFFFFFFFFFFL) {
            eikc0.a = v;
        }
        eikc0.b = new TagDeviceData(eigp.a(v1), s);
        if(gwha0 != null && (gwha0.h == 5 || gwha0.h == 6) && (gwha0.b & 0x80) != 0) {
            gwhg gwhg0 = gwha0.i == null ? gwhg.a : gwha0.i;
            eikc0.d = new FinderTagInfo(gwha0.c, gwhg0.f, gwhg0.d, gwhg0.c, gwhg0.e, Boolean.valueOf(gwhg0.g), gwhg0.h, gwhg0.i, gwhg0.j, gwhg0.k, gwhg0.l, Boolean.valueOf(gwhg0.m));
        }
        return gfsx.m(eikc0.a());
    }

    public static String b(ScannedDeviceInfo scannedDeviceInfo0) {
        int v = scannedDeviceInfo0.c.a;
        if(v == 2) {
            FinderTagInfo finderTagInfo0 = scannedDeviceInfo0.f;
            if(finderTagInfo0 == null) {
                v = 2;
                goto label_7;
            }
            return finderTagInfo0.b;
        }
    label_7:
        if(v == 0) {
            return "ATAG";
        }
        if(v == 2) {
            return "FINDER";
        }
        switch(v) {
            case 1: {
                return "TILE";
            }
            case 3: {
                return "OTHER";
            }
            case 4: {
                return "DULT";
            }
            default: {
                return null;
            }
        }
    }

    public static ArrayList c(Map map0, Map map1) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            gfsx gfsx0 = eikg.a(((List)((Map.Entry)object0).getValue()), s, ((gwha)map1.get(s)));
            if(gfsx0.i()) {
                arrayList0.add(gfsx0.d());
            }
        }
        Collections.sort(arrayList0, new eike());
        return arrayList0;
    }
}

