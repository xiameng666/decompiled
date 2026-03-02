public final class fman {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;

    public fman() {
        throw null;
    }

    public fman(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fman) && this.a.equals(((fman)object0).a) && this.b.equals(((fman)object0).b) && this.c.equals(((fman)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "BootstrapDetail{numberOfMessagesDeleted=" + this.a + ", numberOfConversationDownloaded=" + this.b + ", bootstrapDuration=" + this.c + "}";
    }
}

