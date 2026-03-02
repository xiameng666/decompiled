import android.os.PersistableBundle;

public final class jzg {
    public static final PersistableBundle a(ibns[] arr_ibns) {
        PersistableBundle persistableBundle0 = new PersistableBundle(arr_ibns.length);
        int v = 0;
        while(v < arr_ibns.length) {
            ibns ibns0 = arr_ibns[v];
            String s = (String)ibns0.a;
            Object object0 = ibns0.b;
            if(object0 == null) {
                persistableBundle0.putString(s, null);
                ++v;
                continue;
            }
            if((object0 instanceof Boolean)) {
                persistableBundle0.putBoolean(s, ((Boolean)object0).booleanValue());
                ++v;
                continue;
            }
            if((object0 instanceof Double)) {
                persistableBundle0.putDouble(s, ((Number)object0).doubleValue());
                ++v;
                continue;
            }
            if((object0 instanceof Integer)) {
                persistableBundle0.putInt(s, ((Number)object0).intValue());
                ++v;
                continue;
            }
            if((object0 instanceof Long)) {
                persistableBundle0.putLong(s, ((Number)object0).longValue());
                ++v;
                continue;
            }
            if((object0 instanceof String)) {
                persistableBundle0.putString(s, ((String)object0));
                ++v;
                continue;
            }
            if((object0 instanceof PersistableBundle)) {
                persistableBundle0.putPersistableBundle(s, ((PersistableBundle)object0));
                ++v;
                continue;
            }
            if((object0 instanceof boolean[])) {
                persistableBundle0.putBooleanArray(s, ((boolean[])object0));
                ++v;
                continue;
            }
            if((object0 instanceof double[])) {
                persistableBundle0.putDoubleArray(s, ((double[])object0));
                ++v;
                continue;
            }
            if((object0 instanceof int[])) {
                persistableBundle0.putIntArray(s, ((int[])object0));
                ++v;
                continue;
            }
            if((object0 instanceof long[])) {
                persistableBundle0.putLongArray(s, ((long[])object0));
                ++v;
                continue;
            }
            if(!(object0 instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + object0.getClass().getCanonicalName() + " for key \"" + s + '\"');
            }
            Class class0 = object0.getClass().getComponentType();
            ibuq.c(class0);
            if(!String.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException("Unsupported value array type " + class0.getCanonicalName() + " for key \"" + s + '\"');
            }
            persistableBundle0.putStringArray(s, ((String[])object0));
            ++v;
            continue;
        }
        return persistableBundle0;
    }
}

