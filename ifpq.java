import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public final class ifpq implements Serializable {
    public final Map a;
    public transient long b;
    private static final long serialVersionUID = 0xCFEBCB6BA0FE09BCL;

    public ifpq(long v) {
        this.a = new TreeMap();
        this.b = v;
    }

    public ifpq(ifpq ifpq0, long v) {
        this.a = new TreeMap();
        for(Object object0: ifpq0.a.keySet()) {
            ifpp ifpp0 = new ifpp(((ifpp)ifpq0.a.get(((Integer)object0))));
            this.a.put(((Integer)object0), ifpp0);
        }
        this.b = v;
    }

    public ifpq(ifqk ifqk0, long v, byte[] arr_b, byte[] arr_b1) {
        int v12;
        ifqs ifqs1;
        ifpp ifpp1;
        long v11;
        int v10;
        ifqk ifqk1 = ifqk0;
        super();
        this.a = new TreeMap();
        this.b = (1L << ifqk1.d) - 1L;
        long v1 = 0L;
        while(v1 < v) {
            ifqs ifqs0 = ifqk1.c;
            int v2 = ifqs0.c;
            int v3 = 1 << v2;
            long v4 = v1 >> v2;
            int v5 = ifqy.a(v1, v2);
            ifqa ifqa0 = new ifqa();
            ifqa0.f = v4;
            ifqa0.a = v5;
            ifqb ifqb0 = new ifqb(ifqa0);
            int v6 = v3 - 1;
            if(v5 < v6) {
                Integer integer0 = (int)0;
                if(((ifpp)this.a.get(integer0)) == null || v5 == 0) {
                    ifpp ifpp0 = new ifpp(ifqs0, arr_b, arr_b1, ifqb0);
                    this.a.put(integer0, ifpp0);
                }
                this.a(0, arr_b, arr_b1, ifqb0);
            }
            int v7 = 1;
            while(v7 < ifqk1.e) {
                int v8 = ifqy.a(v4, v2);
                long v9 = v4 >> v2;
                ifqa ifqa1 = new ifqa();
                ifqa1.e = v7;
                ifqa1.f = v9;
                ifqa1.a = v8;
                ifqb ifqb1 = new ifqb(ifqa1);
                Integer integer1 = v7;
                if(this.a.get(integer1) == null) {
                    v10 = v2;
                    v11 = v9;
                    ifpp1 = new ifpp(ifqs0, arr_b, arr_b1, ifqb1);
                    this.a.put(integer1, ifpp1);
                }
                else if(v1 == 0L) {
                    v10 = v2;
                    v11 = v9;
                }
                else {
                    v10 = v2;
                    v11 = v9;
                    if(v1 % ((long)Math.pow(v3, v7 + 1)) == 0L) {
                        ifpp1 = new ifpp(ifqs0, arr_b, arr_b1, ifqb1);
                        this.a.put(integer1, ifpp1);
                    }
                }
                if(v8 < v6 && v1 != 0L) {
                    ifqs1 = ifqs0;
                    v12 = v7 + 1;
                    if((v1 + 1L) % ((long)Math.pow(v3, v7)) == 0L) {
                        this.a(v7, arr_b, arr_b1, ifqb1);
                    }
                }
                else {
                    ifqs1 = ifqs0;
                    v12 = v7 + 1;
                }
                ifqk1 = ifqk0;
                ifqs0 = ifqs1;
                v7 = v12;
                v1 = v1;
                v4 = v11;
                v2 = v10;
            }
            ++v1;
            ifqk1 = ifqk0;
        }
    }

    final void a(int v, byte[] arr_b, byte[] arr_b1, ifqb ifqb0) {
        Integer integer0 = v;
        ifpp ifpp0 = new ifpp(((ifpp)this.a.get(integer0)), arr_b, arr_b1, ifqb0);
        ifpp ifpp1 = (ifpp)this.a.put(integer0, ifpp0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.b = objectInputStream0.available() == 0 ? 0L : objectInputStream0.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeLong(this.b);
    }
}

