public final class egzy {
    public final String a;

    public egzy() {
        throw null;
    }

    public egzy(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof egzy)) {
            return this.a == null ? ((egzy)object0).a == null : this.a.equals(((egzy)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 1000003 : this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "PageToken{pageToken=" + this.a + "}";
    }
}

