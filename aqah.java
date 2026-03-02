public final class aqah extends aqan {
    public final aqae a;

    public aqah() {
        super(1);
    }

    public aqah(aqae aqae0) {
        super(1);
        this.a = aqae0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof aqah) ? this.a.equals(((aqah)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "ListItemPaymentsBottomSheetItem{listItem=" + this.a + "}";
    }
}

