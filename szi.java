import java.io.Serializable;
import java.util.Arrays;

public final class szi implements Serializable {
    public byte[] a;
    private Boolean b;

    public szi(byte[] arr_b) {
        String s;
        if(arr_b == null) {
            throw new IllegalArgumentException("A tag can\'t be NULL.");
        }
        if(arr_b.length == 0) {
            s = "The given array representing a tag is empty";
        }
        else {
            s = null;
            if(arr_b.length == 1) {
                if((arr_b[0] & 0x1F) == 0x1F) {
                    s = "The given byte[] is too short. The tag spcifies multibytes, but the given byte[] has length 1";
                }
            }
            else if((arr_b[0] & 0x1F) != 0x1F) {
                s = "The given byte[] is too long. The tag spcifies single byte, but the given byte[] has length " + arr_b.length;
            }
            else {
                int v1 = arr_b.length - 1;
                if((arr_b[v1] & 0x80) == 0x80) {
                    s = "The last byte in tag is invalid";
                }
                else {
                    for(int v = 1; v < v1; ++v) {
                        if((arr_b[v] & 0x80) != 0x80) {
                            s = a.f(v, "The tag byte[", "] is invalid.");
                            break;
                        }
                    }
                }
            }
        }
        if(s != null) {
            throw new IllegalArgumentException(s);
        }
        this.a = (byte[])arr_b.clone();
    }

    public final boolean a() {
        boolean z = false;
        if(this.b == null) {
            if((this.a[0] & 0x20) != 0) {
                z = true;
            }
            this.b = Boolean.valueOf(z);
        }
        return this.b.booleanValue();
    }

    public final byte[] b() {
        return (byte[])this.a.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof szi)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        byte[] arr_b = ((szi)object0).b();
        return this.a == null || arr_b == null ? false : Arrays.equals(this.a, arr_b);
    }

    @Override
    public final int hashCode() {
        byte[] arr_b = this.a;
        int v1 = 17;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 = v1 * 0x1F + arr_b[v];
        }
        return v1;
    }

    @Override
    public final String toString() {
        return tek.b(this.a);
    }
}

