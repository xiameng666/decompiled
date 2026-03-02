import j..util.Objects;

public final class kux {
    public final int a;
    public final CharSequence b;

    static {
        ibns[] arr_ibns = new ibns[13];
        Integer integer0 = (int)5;
        arr_ibns[0] = new ibns(integer0, integer0);
        Integer integer1 = (int)12;
        arr_ibns[1] = new ibns(integer1, integer1);
        Integer integer2 = (int)1;
        arr_ibns[2] = new ibns(integer2, integer2);
        Integer integer3 = (int)7;
        arr_ibns[3] = new ibns(integer3, integer3);
        Integer integer4 = (int)9;
        arr_ibns[4] = new ibns(integer4, integer4);
        Integer integer5 = (int)11;
        arr_ibns[5] = new ibns(integer5, integer5);
        Integer integer6 = (int)14;
        arr_ibns[6] = new ibns(integer6, integer6);
        Integer integer7 = (int)4;
        arr_ibns[7] = new ibns(integer7, integer7);
        Integer integer8 = (int)15;
        arr_ibns[8] = new ibns(integer8, integer8);
        Integer integer9 = (int)3;
        arr_ibns[9] = new ibns(integer9, integer9);
        Integer integer10 = (int)2;
        arr_ibns[10] = new ibns(integer10, integer10);
        Integer integer11 = (int)10;
        arr_ibns[11] = new ibns(integer11, integer11);
        Integer integer12 = (int)8;
        arr_ibns[12] = new ibns(integer12, integer12);
        ibpz.h(arr_ibns);
    }

    public kux(int v, CharSequence charSequence0) {
        this.a = v;
        this.b = charSequence0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof kux) && this.a == ((kux)object0).a && ibuq.m(this.b, ((kux)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b});
    }
}

