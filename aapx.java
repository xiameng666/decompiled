import android.os.Bundle;

public final class aapx extends aalp {
    public final grxw a;

    public aapx() {
        throw null;
    }

    public aapx(grxw grxw0) {
        if(grxw0 == null) {
            throw new NullPointerException("Null screenKey");
        }
        this.a = grxw0;
    }

    public final Bundle a() {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("screenKey", this.a.toBytesArray());
        return bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof aapx) ? ((ProtoLiteMessage)this.a).equals(((aapx)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        grxw grxw0 = this.a;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            return ((ProtoLiteMessage)grxw0).s() ^ 1000003;
        }
        int v = grxw0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v;
        }
        return v ^ 1000003;
    }

    @Override
    public final String toString() {
        return "SearchScreenBlueprint{screenKey=" + this.a.toString() + "}";
    }
}

