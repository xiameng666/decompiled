import android.location.GnssMeasurementsEvent;
import android.location.Location;
import android.util.Pair;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class cjds {
    public final Location a;
    public final long b;
    public final int c;
    public final byte[] d;

    public cjds(Location location0, long v, int v1, GnssMeasurementsEvent gnssMeasurementsEvent0) {
        Set set0;
        if(location0 == null) {
            throw new IllegalArgumentException("Null location in RealLocation constructor");
        }
        this.a = location0;
        this.b = v;
        this.c = v1;
        if(gnssMeasurementsEvent0 == null) {
            this.d = null;
            return;
        }
        gwrv gwrv0 = fvmu.a(gnssMeasurementsEvent0);
        if(hunx.c()) {
            HashMap hashMap0 = new HashMap();
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gwrv0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gwrv0));
            int v2 = ((gwrv)((gwru)hftp0).b_message).c.size();
            while(true) {
                --v2;
                if(v2 < 0) {
                    break;
                }
                gwry gwry0 = ((gwru)hftp0).a(v2);
                int v3 = gwry0.d;
                if(v3 != 1 && v3 != 6) {
                    ((gwru)hftp0).l(v2);
                }
                else {
                    int v4 = (int)(((double)gwry0.o) / 1000000.0);
                    if(v4 != 0x498 && v4 != 0x627) {
                        ((gwru)hftp0).l(v2);
                    }
                    else {
                        Pair pair0 = new Pair(v3, ((int)gwry0.c));
                        if(hashMap0.containsKey(pair0)) {
                            set0 = (Set)hashMap0.get(pair0);
                        }
                        else {
                            set0 = new HashSet();
                            hashMap0.put(pair0, set0);
                        }
                        Integer integer0 = v4;
                        set0.add(integer0);
                        ((Set)Objects.requireNonNull(set0)).add(integer0);
                    }
                }
            }
            int v5 = ((gwrv)((gwru)hftp0).b_message).c.size();
            while(true) {
                --v5;
                if(v5 < 0) {
                    break;
                }
                gwry gwry1 = ((gwru)hftp0).a(v5);
                Set set1 = (Set)hashMap0.get(new Pair(((int)gwry1.d), ((int)gwry1.c)));
                if(set1 == null || set1.size() < 2) {
                    ((gwru)hftp0).l(v5);
                }
            }
            gwrv0 = (gwrv)((ProtoLiteBuilder)(((gwru)hftp0))).N_build();
        }
        this.d = gwrv0.toBytesArray();
    }

    public final double a() {
        return this.a.getAltitude();
    }

    public final double b() {
        return this.a.getLatitude();
    }

    public final double c() {
        return this.a.getLongitude();
    }

    public final float d() {
        return this.a.getAccuracy();
    }

    public final float e() {
        return this.a.getBearing();
    }

    public final float f() {
        return this.a.getSpeed();
    }

    public final long g() {
        return this.a.getTime();
    }

    public final boolean h() {
        return this.a.hasAltitude();
    }

    public final boolean i() {
        return this.a.hasBearing();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RealLocation [location=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" satellites=");
        stringBuilder0.append(this.c);
        if(this.i()) {
            stringBuilder0.append(" bearing=");
            stringBuilder0.append(this.e());
        }
        if(this.h()) {
            stringBuilder0.append(" altitude=");
            stringBuilder0.append(this.a());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

