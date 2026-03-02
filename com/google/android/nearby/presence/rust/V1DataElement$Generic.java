package com.google.android.nearby.presence.rust;

import java.util.Arrays;

public final class V1DataElement.Generic extends V1DataElement {
    private final long a;
    private final byte[] b;

    private V1DataElement.Generic(long v, byte[] arr_b) {
        this.a = v;
        this.b = Arrays.copyOf(arr_b, arr_b.length);
        if(v == -1L) {
            throw new IllegalArgumentException("Generic DE has a forbidden type-code!");
        }
        if(arr_b.length <= 0x7F) {
            return;
        }
        throw new IllegalArgumentException("Generic DE is too long!");
    }

    public V1DataElement.Generic(NpAdv npAdv0, long v, byte[] arr_b) {
        this(v, arr_b);
        npAdv0.a();
    }

    @Override  // com.google.android.nearby.presence.rust.V1DataElement
    public final V1DataElement.Generic a() {
        return V1DataElement.Generic.nativeTrySerialize(this);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof V1DataElement.Generic) && this.a == ((V1DataElement.Generic)object0).a && Arrays.equals(this.b, ((V1DataElement.Generic)object0).b);
    }

    public byte[] getData() {
        return Arrays.copyOf(this.b, this.b.length);
    }

    public long getType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return ((int)(this.a * 0x1FL)) + v;
    }

    public static native V1DataElement nativeTryDeserialize(V1DataElement.Generic arg0) {
    }

    private static native V1DataElement.Generic nativeTrySerialize(V1DataElement.Generic arg0) {
    }

    @Override
    public final String toString() {
        String s = V1DataElement.b(this.b, 1);
        return "GenericDE { type_code: " + this.a + ", contents: " + s;
    }
}

