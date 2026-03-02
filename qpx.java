import java.util.Arrays;
import java.util.List;

public final class qpx extends qqi {
    public qpx(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            qtz qtz0 = (qtz)list0.get(v);
            qqm qqm0 = (qqm)qtz0.b;
            qqm qqm1 = (qqm)qtz0.c;
            if(qqm0 != null && qqm1 != null) {
                float[] arr_f = qqm0.a;
                int v1 = arr_f.length;
                float[] arr_f1 = qqm1.a;
                int v2 = arr_f1.length;
                if(v1 != v2) {
                    int v3 = v1 + v2;
                    float[] arr_f2 = new float[v3];
                    System.arraycopy(arr_f, 0, arr_f2, 0, v1);
                    System.arraycopy(arr_f1, 0, arr_f2, v1, v2);
                    Arrays.sort(arr_f2);
                    float f = NaNf;
                    int v5 = 0;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        float f1 = arr_f2[v4];
                        if(f1 != f) {
                            arr_f2[v5] = f1;
                            ++v5;
                            f = arr_f2[v4];
                        }
                    }
                    float[] arr_f3 = Arrays.copyOfRange(arr_f2, 0, v5);
                    qtz0 = new qtz(qqm0.a(arr_f3), qqm1.a(arr_f3));
                }
            }
            list0.set(v, qtz0);
        }
        super(list0);
    }

    @Override  // qqh
    public final qmq a() {
        return new qmv(this.a);
    }
}

