import java.util.Arrays;

final class ggsk extends ggub {
    public Object[] a;
    public int b;

    public ggsk() {
        this.a = new Object[8];
        this.b = 0;
    }

    public final int a(ggsx ggsx0) {
        for(int v = 0; v < this.b; ++v) {
            if(this.a[v + v].equals(ggsx0)) {
                return v;
            }
        }
        return -1;
    }

    @Override  // ggub
    public final int b() {
        return this.b;
    }

    @Override  // ggub
    public final ggsx c(int v) {
        if(v < this.b) {
            return (ggsx)this.a[v + v];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override  // ggub
    public final Object d(ggsx ggsx0) {
        int v = this.a(ggsx0);
        return v == -1 ? null : ggsx0.c(this.a[v + v + 1]);
    }

    @Override  // ggub
    public final Object e(int v) {
        if(v < this.b) {
            return this.a[v + v + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(ggsx ggsx0, Object object0) {
        if(!ggsx0.b) {
            int v = this.a(ggsx0);
            if(v != -1) {
                Object[] arr_object = this.a;
                ggwv.d(object0, "metadata value");
                arr_object[v + v + 1] = object0;
                return;
            }
        }
        int v1 = this.b + 1;
        Object[] arr_object1 = this.a;
        if(v1 + v1 > arr_object1.length) {
            this.a = Arrays.copyOf(arr_object1, arr_object1.length + arr_object1.length);
        }
        Object[] arr_object2 = this.a;
        int v2 = this.b + this.b;
        ggwv.d(ggsx0, "metadata key");
        arr_object2[v2] = ggsx0;
        Object[] arr_object3 = this.a;
        int v3 = this.b + this.b + 1;
        ggwv.d(object0, "metadata value");
        arr_object3[v3] = object0;
        ++this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Metadata{");
        for(int v = 0; v < this.b; ++v) {
            stringBuilder0.append(" \'");
            stringBuilder0.append(this.c(v));
            stringBuilder0.append("\': ");
            stringBuilder0.append(this.e(v));
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }
}

