import j..util.Objects;

public final class dchq extends smz {
    public final dfsq a;
    public final dftl b;
    public final dftm c;

    public dchq(dfsq dfsq0, dftl dftl0, dftm dftm0) {
        this.a = dfsq0;
        this.b = dftl0;
        this.c = dftm0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof dchq) && Objects.equals(this.a, ((dchq)object0).a) && Objects.equals(this.b, ((dchq)object0).b) && Objects.equals(this.c, ((dchq)object0).c);
    }

    @Override
    public final int hashCode() {
        return (Objects.hashCode(this.a) * 0x1F + Objects.hashCode(this.b)) * 0x1F + Objects.hashCode(this.c);
    }

    @Override
    public final String toString() {
        Object[] arr_object = {this.a, this.b, this.c};
        String[] arr_s = "discoveryOptions;scanMode;prioritizedProvider".split(";");
        StringBuilder stringBuilder0 = new StringBuilder("dchq[");
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

