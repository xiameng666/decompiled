import java.util.ArrayList;

public final class fvug {
    public final ArrayList a;

    public fvug() {
        throw null;
    }

    public fvug(byte[] arr_b) {
        this.a = new ArrayList();
    }

    public final int a() {
        return this.a.size();
    }

    public final void b() {
        this.a.clear();
    }

    public final fvvj[] c(long v) {
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((fvvj)arrayList0.get(v2)).m() < v) {
                ++v3;
            }
        }
        if(v3 > 0) {
            ArrayList arrayList1 = new ArrayList(arrayList0.size() - v3);
            int v4 = arrayList0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                fvvj fvvj0 = (fvvj)arrayList0.get(v5);
                if(fvvj0.m() >= v) {
                    arrayList1.add(fvvj0);
                }
            }
            arrayList0 = arrayList1;
        }
        return (fvvj[])arrayList0.toArray(new fvvj[0]);
    }
}

