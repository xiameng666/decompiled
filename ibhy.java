import java.util.List;
import java.util.logging.Logger;

final class ibhy {
    static {
        Logger.getLogger(ibhy.class.getName());
    }

    public static byte[][] a(List list0) {
        int v = list0.size();
        byte[][] arr2_b = new byte[v + v][];
        int v1 = 0;
        for(Object object0: list0) {
            arr2_b[v1] = ((ibir)object0).f.o();
            arr2_b[v1 + 1] = ((ibir)object0).g.o();
            v1 += 2;
        }
        return ibfs.b(arr2_b);
    }
}

