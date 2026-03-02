import java.util.List;

public final class gboc {
    public final hdrl a;
    public final hdrl b;
    public final hdrl c;
    public final List d;
    public final hdrl e;
    public final hdrl f;
    private final hdrl g;
    private final List h;
    private final hdrl i;
    private final hdrl j;
    private final hdrl k;
    private final hdrl l;

    public gboc(hdrl hdrl0, List list0, hdrl hdrl1, hdrl hdrl2, hdrl hdrl3, List list1, hdrl hdrl4, hdrl hdrl5, hdrl hdrl6, hdrl hdrl7, hdrl hdrl8, hdrl hdrl9) {
        ibuq.f(hdrl0, "backButtonNode");
        ibuq.f(list0, "flashButtonOneOfNodes");
        ibuq.f(hdrl1, "headerContainerNode");
        ibuq.f(hdrl2, "gPayLogoImageNode");
        ibuq.f(hdrl3, "titleTextInfoNode");
        ibuq.f(list1, "subtitleTextInfoOneOfNodes");
        ibuq.f(hdrl7, "keyboardIconNode");
        ibuq.f(hdrl8, "fallbackTextInfoNode");
        ibuq.f(hdrl9, "fallbackContainerNode");
        super();
        this.g = hdrl0;
        this.h = list0;
        this.a = hdrl1;
        this.b = hdrl2;
        this.c = hdrl3;
        this.d = list1;
        this.i = hdrl4;
        this.j = hdrl5;
        this.e = hdrl6;
        this.k = hdrl7;
        this.l = hdrl8;
        this.f = hdrl9;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gboc)) {
            return false;
        }
        if(!ibuq.m(this.g, ((gboc)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((gboc)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gboc)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((gboc)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((gboc)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((gboc)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.i, ((gboc)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.j, ((gboc)object0).j)) {
            return false;
        }
        if(!ibuq.m(this.e, ((gboc)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.k, ((gboc)object0).k)) {
            return false;
        }
        return ibuq.m(this.l, ((gboc)object0).l) ? ibuq.m(this.f, ((gboc)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v17;
        int v15;
        int v13;
        int v11;
        int v7;
        int v5;
        int v3;
        int v;
        hdrl hdrl0 = this.g;
        if(((ProtoLiteMessage)hdrl0).isImmutable()) {
            v = ((ProtoLiteMessage)hdrl0).s();
        }
        else {
            int v1 = hdrl0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)hdrl0).s();
                hdrl0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = v * 0x1F + this.h.hashCode();
        hdrl hdrl1 = this.a;
        if(((ProtoLiteMessage)hdrl1).isImmutable()) {
            v3 = ((ProtoLiteMessage)hdrl1).s();
        }
        else {
            int v4 = hdrl1.memoizedHashCode;
            if(v4 == 0) {
                v4 = ((ProtoLiteMessage)hdrl1).s();
                hdrl1.memoizedHashCode = v4;
            }
            v3 = v4;
        }
        hdrl hdrl2 = this.b;
        if(((ProtoLiteMessage)hdrl2).isImmutable()) {
            v5 = ((ProtoLiteMessage)hdrl2).s();
        }
        else {
            int v6 = hdrl2.memoizedHashCode;
            if(v6 == 0) {
                v6 = ((ProtoLiteMessage)hdrl2).s();
                hdrl2.memoizedHashCode = v6;
            }
            v5 = v6;
        }
        hdrl hdrl3 = this.c;
        if(((ProtoLiteMessage)hdrl3).isImmutable()) {
            v7 = ((ProtoLiteMessage)hdrl3).s();
        }
        else {
            int v8 = hdrl3.memoizedHashCode;
            if(v8 == 0) {
                v8 = ((ProtoLiteMessage)hdrl3).s();
                hdrl3.memoizedHashCode = v8;
            }
            v7 = v8;
        }
        int v9 = ((((v2 * 0x1F + v3) * 0x1F + v5) * 0x1F + v7) * 0x1F + this.d.hashCode()) * 0x1F;
        hdrl hdrl4 = this.i;
        int v10 = 0;
        if(hdrl4 == null) {
            v11 = 0;
        }
        else if(((ProtoLiteMessage)hdrl4).isImmutable()) {
            v11 = ((ProtoLiteMessage)hdrl4).s();
        }
        else {
            int v12 = hdrl4.memoizedHashCode;
            if(v12 == 0) {
                v12 = ((ProtoLiteMessage)hdrl4).s();
                hdrl4.memoizedHashCode = v12;
            }
            v11 = v12;
        }
        hdrl hdrl5 = this.j;
        if(hdrl5 == null) {
            v13 = 0;
        }
        else if(((ProtoLiteMessage)hdrl5).isImmutable()) {
            v13 = ((ProtoLiteMessage)hdrl5).s();
        }
        else {
            int v14 = hdrl5.memoizedHashCode;
            if(v14 == 0) {
                v14 = ((ProtoLiteMessage)hdrl5).s();
                hdrl5.memoizedHashCode = v14;
            }
            v13 = v14;
        }
        hdrl hdrl6 = this.e;
        if(hdrl6 != null) {
            if(((ProtoLiteMessage)hdrl6).isImmutable()) {
                v10 = ((ProtoLiteMessage)hdrl6).s();
            }
            else {
                v10 = hdrl6.memoizedHashCode;
                if(v10 == 0) {
                    v10 = ((ProtoLiteMessage)hdrl6).s();
                    hdrl6.memoizedHashCode = v10;
                }
            }
        }
        hdrl hdrl7 = this.k;
        if(((ProtoLiteMessage)hdrl7).isImmutable()) {
            v15 = ((ProtoLiteMessage)hdrl7).s();
        }
        else {
            int v16 = hdrl7.memoizedHashCode;
            if(v16 == 0) {
                v16 = ((ProtoLiteMessage)hdrl7).s();
                hdrl7.memoizedHashCode = v16;
            }
            v15 = v16;
        }
        hdrl hdrl8 = this.l;
        if(((ProtoLiteMessage)hdrl8).isImmutable()) {
            v17 = ((ProtoLiteMessage)hdrl8).s();
        }
        else {
            int v18 = hdrl8.memoizedHashCode;
            if(v18 == 0) {
                v18 = ((ProtoLiteMessage)hdrl8).s();
                hdrl8.memoizedHashCode = v18;
            }
            v17 = v18;
        }
        hdrl hdrl9 = this.f;
        if(((ProtoLiteMessage)hdrl9).isImmutable()) {
            return (((((v9 + v11) * 0x1F + v13) * 0x1F + v10) * 0x1F + v15) * 0x1F + v17) * 0x1F + ((ProtoLiteMessage)hdrl9).s();
        }
        int v19 = hdrl9.memoizedHashCode;
        if(v19 == 0) {
            v19 = ((ProtoLiteMessage)hdrl9).s();
            hdrl9.memoizedHashCode = v19;
        }
        return (((((v9 + v11) * 0x1F + v13) * 0x1F + v10) * 0x1F + v15) * 0x1F + v17) * 0x1F + v19;
    }

    @Override
    public final String toString() {
        return "OcrNodeBundle(backButtonNode=" + this.g + ", flashButtonOneOfNodes=" + this.h + ", headerContainerNode=" + this.a + ", gPayLogoImageNode=" + this.b + ", titleTextInfoNode=" + this.c + ", subtitleTextInfoOneOfNodes=" + this.d + ", buttonIconNode=" + this.i + ", switchToNfcTextInfoNode=" + this.j + ", switchToNfcContainerNode=" + this.e + ", keyboardIconNode=" + this.k + ", fallbackTextInfoNode=" + this.l + ", fallbackContainerNode=" + this.f + ")";
    }
}

