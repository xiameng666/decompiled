public final class fltd {
    public final boolean a;

    public fltd() {
        throw null;
    }

    public fltd(byte[] arr_b) {
        this.a = true;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltd) && this.a == ((fltd)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a ? 1001100 : 1001110;
    }

    @Override
    public final String toString() {
        return "BlockUnblockUsers{syncBlockStatus=" + this.a + "}";
    }
}

