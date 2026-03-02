package j$.util.stream;

public abstract class d {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public d() {
        this.a = 4;
    }

    public d(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + v);
        }
        this.a = Math.max(4, 0x20 - Integer.numberOfLeadingZeros(v - 1));
    }

    public abstract void clear();

    public final long count() {
        return this.c == 0 ? ((long)this.b) : this.d[this.c] + ((long)this.b);
    }
}

