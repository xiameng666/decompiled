import java.util.Arrays;
import java.util.List;

public final class udy {
    public final kav a;
    public final List b;
    public final String c;

    public udy(Class class0, Class class1, Class class2, List list0, kav kav0) {
        this.a = kav0;
        uqo.d(list0);
        this.b = list0;
        this.c = "Failed LoadPath{" + class0.getSimpleName() + "->" + class1.getSimpleName() + "->" + class2.getSimpleName() + "}";
    }

    @Override
    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + "}";
    }
}

