import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class cpyx implements Callable {
    public final cpyy a;
    public final Uri b;

    public cpyx(cpyy cpyy0, Uri uri0) {
        this.a = cpyy0;
        this.b = uri0;
    }

    @Override
    public final Object call() {
        hfuo hfuo0 = hucu.b().b;
        bwnj bwnj0 = cpyz.a(this.b, hfuo0);
        if(bwnj0 == null) {
            return ggnj.a;
        }
        bwni bwni0 = bwnj0.c == null ? bwni.a : bwnj0.c;
        int v = bwni0.b;
        int v1 = bwnh.b(v);
        if(v1 != 0) {
            cpyy cpyy0 = this.a;
            switch(v1 - 1) {
                case 0: {
                    throw new IllegalArgumentException("Unsupported ClientMatcher: " + bwnh.a(bwnh.b(v)));
                }
                case 1: {
                    gfug gfug0 = gfug.c(gfqs.a);
                    List list0 = cpyy0.a.getPackageManager().getInstalledPackages(0);
                    int v2 = glwy.h(gfug0.a(TimeUnit.MICROSECONDS));
                    azql azql1 = azql.c(cpyy0.a);
                    Object object2 = new HashSet();
                    HashSet hashSet0 = new HashSet();
                    gfug0.e();
                    gfug0.f();
                    for(Object object3: list0) {
                        String s1 = ((PackageInfo)object3).packageName;
                        if(azql1.g(s1)) {
                            ((Set)object2).add(s1);
                        }
                        else {
                            if(!s1.startsWith("com.google")) {
                                continue;
                            }
                            hashSet0.add(s1);
                        }
                    }
                    int v3 = glwy.h(gfug0.a(TimeUnit.MICROSECONDS));
                    int v4 = list0.size();
                    frmi frmi0 = (frmi)cpyy0.b;
                    int v5 = (int)(((Integer)frmi.g(frmi0.c, Integer.valueOf(0))));
                    if(!frmi0.i(v5)) {
                        return object2;
                    }
                    frls frls0 = new frls(frmi0, v4, hashSet0, v2, v3, v5);
                    frmi0.a.execute(frls0);
                    return object2;
                }
                default: {
                    switch(v1 - 1) {
                        case 2: {
                            bwnm bwnm0 = v == 3 ? ((bwnm)bwni0.c) : bwnm.a;
                            azql azql0 = azql.c(cpyy0.a);
                            Object object0 = new HashSet();
                            for(Object object1: bwnm0.b) {
                                String s = ((bwnl)object1).b;
                                if(azql0.g(s)) {
                                    ((Set)object0).add(s);
                                }
                            }
                            return object0;
                        }
                        case 3: {
                            return ggnj.a;
                        }
                        default: {
                            throw new IllegalArgumentException("Unrecognized ClientMatcher: " + bwnh.a(bwnh.b(v)));
                        }
                    }
                }
            }
        }
        throw null;
    }
}

