public final class ffcz {
    public static String a(feyu feyu0) {
        String s;
        ToStringHelper gfsv0 = new ToStringHelper("");
        gfsv0.add("uri", feyu0.d);
        switch(feyw.a(feyu0.c)) {
            case 0: 
            case 1: {
                s = "FILTER_UNSPECIFIED";
                break;
            }
            case 2: {
                s = "FILTER_PATTERN_LITERAL";
                break;
            }
            default: {
                s = "FILTER_PATTERN_PREFIX";
            }
        }
        gfsv0.add("filterType", s);
        return gfsv0.toString();
    }

    public static String b(ffaz ffaz0) {
        if(ffaz0 == null) {
            return "null";
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: ffaz0.b) {
            String s = ((ffbk)object0).c;
            feyx feyx0 = ((ffbk)object0).d;
            if(feyx0 == null) {
                feyx0 = feyx.a;
            }
            int v = feyx0.b.size();
            feyb feyb0 = ((ffbk)object0).e;
            if(feyb0 == null) {
                feyb0 = feyb.a;
            }
            ggdy0.i(s + "(" + v + "," + feyb0.b.size() + ")");
        }
        gfss gfss0 = gfss.d(',');
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        gfss0.i(stringBuilder0, ggdy0.h());
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    public static String c(ffaz ffaz0) {
        Object object3;
        if(ffaz0 == null) {
            return "null";
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: ffaz0.b) {
            ffbk ffbk0 = (ffbk)object0;
            ToStringHelper gfsv0 = MoreObjects.toStringHelper(ffbk0);
            gfsv0.add("packageName", ffbk0.c);
            Object object1 = null;
            if((ffbk0.b & 2) == 0) {
                object3 = null;
            }
            else {
                feyx feyx0 = ffbk0.d == null ? feyx.a : ffbk0.d;
                ggdy ggdy1 = new ggdy();
                for(Object object2: feyx0.b) {
                    ggdy1.i(ffcz.a(((feyu)object2)));
                }
                gfss gfss0 = gfss.d(',');
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append('[');
                gfss0.i(stringBuilder0, ggdy1.h());
                stringBuilder0.append(']');
                object3 = stringBuilder0.toString();
            }
            gfsv0.add("dataItemFilters", object3);
            if((ffbk0.b & 4) != 0) {
                feyb feyb0 = ffbk0.e == null ? feyb.a : ffbk0.e;
                ggdy ggdy2 = new ggdy();
                for(Object object4: feyb0.b) {
                    ggdy2.i(((feya)object4).c);
                }
                gfss gfss1 = gfss.d(',');
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append('[');
                gfss1.i(stringBuilder1, ggdy2.h());
                stringBuilder1.append(']');
                object1 = stringBuilder1.toString();
            }
            gfsv0.add("capabilityFilters", object1);
            ggdy0.i(gfsv0.toString());
        }
        gfss gfss2 = gfss.d(',');
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append('[');
        gfss2.i(stringBuilder2, ggdy0.h());
        stringBuilder2.append(']');
        return stringBuilder2.toString();
    }
}

