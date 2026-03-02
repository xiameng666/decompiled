import android.location.Location;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;

public final class boyl implements glzm {
    public final LocationAssigningIntentOperation a;
    public final gmcd b;
    public final gmcd c;
    public final Location d;
    public final long e;

    public boyl(LocationAssigningIntentOperation locationAssigningIntentOperation0, gmcd gmcd0, gmcd gmcd1, Location location0, long v) {
        this.a = locationAssigningIntentOperation0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = location0;
        this.e = v;
    }

    @Override  // glzm
    public final gmcd a() {
        gged_interceptors gged0;
        bpcm bpcm0 = (bpcm)gmbu.r(this.b);
        boolean z = ((Boolean)gmbu.r(this.c)).booleanValue();
        long v = this.e;
        LocationAssigningIntentOperation locationAssigningIntentOperation0 = this.a;
        if(bpcm0 == bpcm.b || bpcm0 == bpcm.a) {
            bpcx bpcx0 = locationAssigningIntentOperation0.d;
            boyy boyy0 = new boyy(bpcm0);
            synchronized(bpcx0.b) {
                ListIterator listIterator0 = bpcx0.c.listIterator();
                while(listIterator0.hasNext()) {
                    SortedSet sortedSet0 = ((bpcw)listIterator0.next()).b;
                    Iterator iterator0 = sortedSet0.iterator();
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        bpko bpko0 = (bpko)object1;
                        if(bpko0.c.i()) {
                            break;
                        }
                        iterator0.remove();
                        --bpcx0.d;
                        Object object2 = boyy0.apply(bpko0);
                        hadw hadw0 = bpkq.b(bpko0.e, z);
                        bpcx0.a.c(((hadx)object2), bpko0, hadw0);
                    }
                    if(sortedSet0.isEmpty()) {
                        listIterator0.remove();
                    }
                }
            }
        }
        Location location0 = this.d;
        if(bpsr.a()) {
            bpcx bpcx1 = locationAssigningIntentOperation0.d;
            gfsx gfsx0 = locationAssigningIntentOperation0.b.b();
            if(boyf.b(location0)) {
                synchronized(bpcx1.b) {
                    bpcx1.a(v, gfsx0, z);
                    long v2 = fraz.b(location0.getElapsedRealtimeNanos());
                    long v3 = (long)(((int)Math.floor((hsxv.c() - ((double)location0.getAccuracy())) / hsxv.b())));
                    long v4 = gfsx0.i() ? Math.min(((Long)gfsx0.d()).longValue(), v2 - v3) : v2 - v3;
                    List list0 = bpcx1.c;
                    int v5 = Collections.binarySearch(list0, new bpcw(v4), new bpcu());
                    if(v5 < 0) {
                        v5 = -(v5 + 1);
                    }
                    ListIterator listIterator1 = list0.listIterator(v5);
                    ArrayList arrayList0 = new ArrayList();
                    while(listIterator1.hasNext()) {
                        bpcw bpcw0 = (bpcw)listIterator1.next();
                        long v6 = bpcw0.a;
                        if(v6 > v3 + v2) {
                            break;
                        }
                        float f = !gfsx0.i() || ((long)(((Long)gfsx0.d()))) > v6 || v6 > v2 ? boyf.a(location0, v6) : location0.getAccuracy();
                        Iterator iterator1 = bpcw0.b.iterator();
                        while(iterator1.hasNext()) {
                            Object object4 = iterator1.next();
                            bpko bpko1 = (bpko)object4;
                            if(bpko1.i != 0.0 && bpko1.i <= ((double)f) + hsxv.a.y().e()) {
                                bpko1.c();
                                v2 = v2;
                            }
                            else {
                                iterator1.remove();
                                --bpcx1.d;
                                bpkn bpkn0 = new bpkn(bpko1);
                                bpkn0.d(((double)f));
                                bpko bpko2 = bpkn0.a();
                                arrayList0.add(bpko2);
                                bpcx1.a.c((bpko1.d() ? hadx.l : hadx.k), bpko2, bpkq.b(bpko1.e, z));
                                v2 = v2;
                                bpcx1 = bpcx1;
                            }
                        }
                    }
                    gged0 = arrayList0;
                }
            }
            else {
                gged0 = ggna.a;
            }
        }
        else {
            gged0 = ggna.a;
        }
        gggq.s(gggq.j(gged0, new boyo()));
        return gdtf.k(gdta.g(gdta.g(locationAssigningIntentOperation0.f.f()).i(new boyk(locationAssigningIntentOperation0, location0), locationAssigningIntentOperation0.l)).h(new boyp(gged0), gmap.a), new boyq(locationAssigningIntentOperation0, location0), locationAssigningIntentOperation0.l);
    }
}

