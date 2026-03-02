import java.util.List;

public final class bvft {
    public final String a;
    public final List b;

    public bvft(String s, List list0) {
        ibuq.f(s, "title");
        super();
        this.a = s;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvft)) {
            return false;
        }
        return ibuq.m(this.a, ((bvft)object0).a) ? ibuq.m(this.b, ((bvft)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ContinueToManageUiModel(title=" + this.a + ", recommendations=" + this.b + ")";
    }
}

