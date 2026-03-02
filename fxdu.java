import j..util.Objects;

final class fxdu extends smz {
    public final String a;
    public final int b;
    public final int c;

    public fxdu(String s, int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fxdu) && this.b == ((fxdu)object0).b && this.c == ((fxdu)object0).c && Objects.equals(this.a, ((fxdu)object0).a);
    }

    @Override
    public final int hashCode() {
        return (this.b * 0x1F + this.c) * 0x1F + Objects.hashCode(this.a);
    }

    @Override
    public final String toString() {
        Object[] arr_object = {this.a, ((int)this.b), ((int)this.c)};
        String[] arr_s = "platformDescription;sdkLevel;networkType".split(";");
        StringBuilder stringBuilder0 = new StringBuilder("fxdu[");
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

