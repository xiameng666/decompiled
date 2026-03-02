import android.util.SparseArray;

final class eqgu {
    public byte[] a;
    public int b;
    public int c;
    public final SparseArray d;

    public eqgu() {
        this.b = -1;
        this.c = 0;
        this.d = new SparseArray();
    }

    public final void a(eqnz eqnz0) {
        System.arraycopy(eqnz0.f.toByteArray(), 0, this.a, this.c, eqnz0.f.size());
        this.b = eqnz0.d;
        this.c += eqnz0.f.size();
        eqnz eqnz1 = (eqnz)this.d.get(this.b + 1);
        if(eqnz1 != null) {
            this.a(eqnz1);
        }
    }
}

