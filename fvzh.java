import j..util.Objects;

final class fvzh extends smz {
    public final icvk a;
    public final gged_interceptors b;
    public final gged_interceptors c;

    public fvzh(icvk icvk0, gged_interceptors gged0, gged_interceptors gged1) {
        this.a = icvk0;
        this.b = gged0;
        this.c = gged1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvzh) && Objects.equals(this.a, ((fvzh)object0).a) && Objects.equals(this.b, ((fvzh)object0).b) && Objects.equals(this.c, ((fvzh)object0).c);
    }

    @Override
    public final int hashCode() {
        return (Objects.hashCode(this.a) * 0x1F + Objects.hashCode(this.b)) * 0x1F + Objects.hashCode(this.c);
    }

    @Override
    public final String toString() {
        Object[] arr_object = {this.a, this.b, this.c};
        String[] arr_s = "deviceBaroBias;entriesBiasHpa;confidenceScores".split(";");
        StringBuilder stringBuilder0 = new StringBuilder("fvzh[");
        for(int v = 0; v < arr_s.length; ++v) {
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append("=");
            stringBuilder0.append(arr_object[v]);
            if(v != arr_s.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

