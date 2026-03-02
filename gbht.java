import java.util.List;

public final class gbht {
    public final List a;

    public gbht(List list0) {
        ibuq.f(list0, "inputTypeList");
        super();
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gbht) ? ibuq.m(this.a, ((gbht)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OcrData(inputTypeList=" + this.a + ")";
    }
}

