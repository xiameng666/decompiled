import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class caar {
    // This method was un-flattened
    public static Bundle a(List list0) {
        int v;
        if(list0 == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            bzwu bzwu0 = (bzwu)object0;
            switch(bzwu0.c) {
                case 0: {
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                case 3: {
                    v = 5;
                    break;
                }
                case 4: {
                    v = 6;
                    break;
                }
                default: {
                    v = 1;
                }
            }
            switch(v - 2) {
                case 1: {
                    bundle0.putString(bzwu0.b, bzwu0.d);
                    break;
                }
                case 2: {
                    bundle0.putInt(bzwu0.b, bzwu0.e);
                    break;
                }
                case 3: {
                    bundle0.putBoolean(bzwu0.b, bzwu0.f);
                    break;
                }
                case 4: {
                    bundle0.putFloat(bzwu0.b, bzwu0.g);
                }
            }
        }
        return bundle0;
    }

    public static final ApplicationInfo b(String s, int v, bzws bzws0, Integer integer0) {
        if((bzws0.b & 2) != 0) {
            ApplicationInfo applicationInfo0 = new ApplicationInfo();
            if((bzws0.b & 1) != 0) {
                applicationInfo0.targetSdkVersion = (bzws0.e == null ? bzwy.a : bzws0.e).c == 0 ? (bzws0.e == null ? bzwy.a : bzws0.e).b : (bzws0.e == null ? bzwy.a : bzws0.e).c;
            }
            applicationInfo0.flags = 4;
            if(!(bzws0.f == null ? bzwr.a : bzws0.f).h.isEmpty()) {
                applicationInfo0.name = (bzws0.f == null ? bzwr.a : bzws0.f).h;
                applicationInfo0.className = (bzws0.f == null ? bzwr.a : bzws0.f).h;
            }
            applicationInfo0.packageName = s;
            applicationInfo0.enabled = true;
            applicationInfo0.icon = (bzws0.f == null ? bzwr.a : bzws0.f).b;
            applicationInfo0.labelRes = (bzws0.f == null ? bzwr.a : bzws0.f).c;
            if(!(bzws0.f == null ? bzwr.a : bzws0.f).d.isEmpty()) {
                applicationInfo0.nonLocalizedLabel = (bzws0.f == null ? bzwr.a : bzws0.f).d;
            }
            applicationInfo0.logo = (bzws0.f == null ? bzwr.a : bzws0.f).e;
            applicationInfo0.theme = (bzws0.f == null ? bzwr.a : bzws0.f).f;
            if(integer0 != null) {
                applicationInfo0.uid = (int)integer0;
            }
            if((v & 0x80) != 0) {
                applicationInfo0.metaData = caar.a((bzws0.f == null ? bzwr.a : bzws0.f).g);
            }
            return applicationInfo0;
        }
        return null;
    }

    public static final String[] c(List list0) {
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                bzwx bzwx0 = (bzwx)object0;
                if(bzwx0.c <= 0 || bzwx0.c >= Build.VERSION.SDK_INT) {
                    arrayList0.add(bzwx0.b);
                }
            }
            return arrayList0.isEmpty() ? null : ((String[])arrayList0.toArray(new String[0]));
        }
        return null;
    }
}

