import j..util.Objects;

public final class cjbl extends smz {
    public final int a;
    public final CharSequence b;

    public cjbl(int v, CharSequence charSequence0) {
        this.a = v;
        this.b = charSequence0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cjbl) && this.a == ((cjbl)object0).a && Objects.equals(this.b, ((cjbl)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + Objects.hashCode(this.b);
    }

    @Override
    public final String toString() {
        Object[] arr_object = {((int)this.a), this.b};
        String[] arr_s = "errorCode;errorStr".split(";");
        StringBuilder stringBuilder0 = new StringBuilder("cjbl[");
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

