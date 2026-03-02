import java.util.Arrays;

public final class fvva extends fvvj {
    private final byte[] a;
    private int b;

    public fvva(byte[] arr_b) {
        if(arr_b.length != 0 && arr_b[0] == 0) {
            this.a = arr_b;
            return;
        }
        byte[] arr_b1 = new byte[1];
        this.a = arr_b1;
        arr_b1[0] = 0;
    }

    @Override  // fvvj
    public final byte a(int v) {
        return 0;
    }

    @Override  // fvvj
    public final byte b(int v) {
        this.q(v);
        return this.a[v * 9 + 7];
    }

    public final byte c() {
        return this.a.length == 0 ? -1 : this.a[0];
    }

    @Override  // hecq
    public final int d() {
        return Math.max(0, (this.a.length - 1) / 9);
    }

    @Override  // fvvj
    public final int e(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvva) && Arrays.equals(((fvva)object0).a, this.a);
    }

    @Override  // fvvj
    public final int f(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // fvvj
    public final int g(int v) {
        this.q(v);
        int v1 = this.a[v * 9 + 8] + 0x80;
        return this.a[v * 9 + 9] == 0 ? gxtu.a(v1, false) : gxtu.a(v1, true);
    }

    @Override  // fvvj
    public final int h(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            v = Arrays.hashCode(this.a) + 0x1F;
            this.b = v;
        }
        return v;
    }

    @Override  // fvvj
    public final int i(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // fvvj
    public final int j(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // fvvj
    public final int k(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // hecq
    public final long l(int v) {
        this.q(v);
        return fvvd.a(this.a, v * 9 + 1, 6);
    }

    @Override  // hecp
    public final long m() {
        throw new UnsupportedOperationException();
    }

    @Override  // hecp
    public final long n(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // fvvj
    public final fvvg[] o() {
        throw new UnsupportedOperationException();
    }

    private final void q(int v) {
        if(v < this.d()) {
            return;
        }
        throw new IllegalArgumentException(String.format("Index (%d) out of range [0, %d)", v, this.d()));
    }

    @Override
    public final String toString() {
        int v = this.d();
        StringBuilder stringBuilder0 = new StringBuilder(v * 40);
        stringBuilder0.append("SimplifiedWifiCompressedScan [");
        if(this.a.length != 1) {
            if(this.a.length == this.d() * 9 + 1 && this.c() == 0) {
            label_8:
                stringBuilder0.append("version=");
                stringBuilder0.append(this.c());
                stringBuilder0.append(", len=");
                stringBuilder0.append(this.a.length);
                stringBuilder0.append(", devices=[");
                for(int v1 = 0; v1 < v; ++v1) {
                    if(v1 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append("[mac=");
                    stringBuilder0.append(this.l(v1));
                    stringBuilder0.append(", rssi=");
                    stringBuilder0.append(this.b(v1));
                    stringBuilder0.append(", frequency=");
                    stringBuilder0.append(this.g(v1));
                    stringBuilder0.append("]");
                }
                stringBuilder0.append("]");
            }
            else {
                stringBuilder0.append("corrupted");
            }
        }
        else if(this.c() != 0) {
            stringBuilder0.append("corrupted");
        }
        else {
            goto label_8;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

