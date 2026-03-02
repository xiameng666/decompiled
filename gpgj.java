import java.nio.ByteBuffer;

public final class gpgj {
    private static gpgj a;

    public static gpgj a() {
        if(gpgj.a == null) {
            gpgj.a = new gpgj();
        }
        return gpgj.a;
    }

    public static void b(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        int v8;
        int v7;
        int v5;
        int v4;
        int v = charSequence0.length();
        int v1 = byteBuffer0.position();
        int v2 = 0;
        try {
            while(v2 < v) {
                int v3 = charSequence0.charAt(v2);
                if(v3 >= 0x80) {
                    break;
                }
                byteBuffer0.put(v1 + v2, ((byte)v3));
                ++v2;
            }
            if(v2 == v) {
                byteBuffer0.position(v1 + v2);
                return;
            }
            v1 += v2;
            while(true) {
            label_13:
                if(v2 >= v) {
                    byteBuffer0.position(v1);
                    return;
                }
                v4 = charSequence0.charAt(v2);
                if(v4 >= 0x80) {
                    break;
                }
                byteBuffer0.put(v1, ((byte)v4));
                ++v1;
                ++v2;
            }
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
        }
        if(v4 < 0x800) {
            try {
                v5 = v1 + 1;
                byteBuffer0.put(v1, ((byte)(v4 >>> 6 | 0xC0)));
                byteBuffer0.put(v5, ((byte)(v4 & 0x3F | 0x80)));
                v1 = v5;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                v1 = v5;
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
            }
        }
        else if(v4 >= 0xD800 && v4 <= 0xDFFF) {
            if(v2 + 1 != v) {
                try {
                    int v6 = charSequence0.charAt(v2 + 1);
                    if(Character.isSurrogatePair(((char)v4), ((char)v6))) {
                        v7 = Character.toCodePoint(((char)v4), ((char)v6));
                        goto label_31;
                    }
                    else {
                        goto label_46;
                    }
                    throw new gpgk(v2, v);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
                try {
                label_31:
                    byteBuffer0.put(v1, ((byte)(v7 >>> 18 | 0xF0)));
                    v8 = v1 + 2;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v1;
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
                try {
                    byteBuffer0.put(v1 + 1, ((byte)(v7 >>> 12 & 0x3F | 0x80)));
                    v1 += 3;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    v1 = v8;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
                try {
                    byteBuffer0.put(v8, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                    byteBuffer0.put(v1, ((byte)(v7 & 0x3F | 0x80)));
                    ++v2;
                    ++v1;
                    ++v2;
                    goto label_13;
                label_46:
                    ++v2;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
            }
            try {
                throw new gpgk(v2, v);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
            }
        }
        else {
            try {
                v5 = v1 + 1;
                byteBuffer0.put(v1, ((byte)(v4 >>> 12 | 0xE0)));
                v1 += 2;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                v1 = v5;
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
            }
            try {
                byteBuffer0.put(v5, ((byte)(v4 >>> 6 & 0x3F | 0x80)));
                byteBuffer0.put(v1, ((byte)(v4 & 0x3F | 0x80)));
                ++v1;
                ++v2;
                goto label_13;
            }
            catch(IndexOutOfBoundsException unused_ex) {
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
        }
        ++v1;
        ++v2;
        goto label_13;
    }
}

