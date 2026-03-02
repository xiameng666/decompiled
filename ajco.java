import android.os.Bundle;
import android.os.Parcelable;

public final class ajco {
    public final Bundle a;

    public ajco() {
        this(null);
    }

    public ajco(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.a = bundle0;
    }

    public final Object a(ajcn ajcn0) {
        return this.a.get(ajcn0.a);
    }

    public final Object b(ajcn ajcn0, Object object0) {
        return this.c(ajcn0) ? this.a(ajcn0) : object0;
    }

    public final boolean c(ajcn ajcn0) {
        return this.a.containsKey(ajcn0.a);
    }

    public final void d(ajcn ajcn0, Object object0) {
        Bundle bundle0 = this.a;
        if(object0 == null) {
            bundle0.putString(ajcn0.a, null);
            return;
        }
        if((object0 instanceof Boolean)) {
            bundle0.putBoolean(ajcn0.a, ((Boolean)object0).booleanValue());
            return;
        }
        if((object0 instanceof boolean[])) {
            bundle0.putBooleanArray(ajcn0.a, ((boolean[])object0));
            return;
        }
        if((object0 instanceof Byte)) {
            bundle0.putByte(ajcn0.a, ((Byte)object0).byteValue());
            return;
        }
        if((object0 instanceof byte[])) {
            bundle0.putByteArray(ajcn0.a, ((byte[])object0));
            return;
        }
        if((object0 instanceof CharSequence)) {
            bundle0.putCharSequence(ajcn0.a, ((CharSequence)object0));
            return;
        }
        if((object0 instanceof CharSequence[])) {
            bundle0.putCharSequenceArray(ajcn0.a, ((CharSequence[])object0));
            return;
        }
        if((object0 instanceof Integer)) {
            bundle0.putInt(ajcn0.a, ((Integer)object0).intValue());
            return;
        }
        if((object0 instanceof int[])) {
            bundle0.putIntArray(ajcn0.a, ((int[])object0));
            return;
        }
        if((object0 instanceof Long)) {
            bundle0.putLong(ajcn0.a, ((Long)object0).longValue());
            return;
        }
        if((object0 instanceof long[])) {
            bundle0.putLongArray(ajcn0.a, ((long[])object0));
            return;
        }
        if((object0 instanceof String)) {
            bundle0.putString(ajcn0.a, ((String)object0));
            return;
        }
        if((object0 instanceof String[])) {
            bundle0.putStringArray(ajcn0.a, ((String[])object0));
            return;
        }
        if((object0 instanceof Bundle)) {
            bundle0.putBundle(ajcn0.a, ((Bundle)object0));
            return;
        }
        if((object0 instanceof Parcelable)) {
            bundle0.putParcelable(ajcn0.a, ((Parcelable)object0));
            return;
        }
        if(!(object0 instanceof Parcelable[])) {
            throw new IllegalArgumentException("Class of value unsupported: " + object0.getClass());
        }
        bundle0.putParcelableArray(ajcn0.a, ((Parcelable[])object0));
    }
}

