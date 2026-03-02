public final class azki {
    public final glww a;

    public azki() {
        throw null;
    }

    public azki(glww glww0) {
        this.a = glww0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof azki) ? this.a.equals(((azki)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "EventVector{eventCodes=" + this.a.toString() + "}";
    }
}

