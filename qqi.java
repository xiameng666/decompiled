import java.util.Arrays;
import java.util.List;

public abstract class qqi implements qqh {
    public final List a;

    public qqi(List list0) {
        this.a = list0;
    }

    @Override  // qqh
    public final List b() {
        return this.a;
    }

    @Override  // qqh
    public final boolean c() {
        return this.a.isEmpty() ? true : this.a.size() == 1 && ((qtz)this.a.get(0)).f();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        List list0 = this.a;
        if(!list0.isEmpty()) {
            stringBuilder0.append("values=");
            stringBuilder0.append(Arrays.toString(list0.toArray()));
        }
        return stringBuilder0.toString();
    }
}

