public class hfux {
    protected volatile MessageLite a;
    public volatile ByteString b;
    private volatile boolean c;

    public final int a(int v) {
        return CodedOutputStream.W(v) + this.b();
    }

    public final int b() {
        if(this.b != null) {
            return CodedOutputStream.N(this.b.size());
        }
        return this.a == null ? CodedOutputStream.N(0) : CodedOutputStream.N(this.a.getSerializedSize());
    }

    public final ByteString c() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? ByteString.b : this.a.getDefaultInstanceForType();
        }
        return this.b;
    }

    public final MessageLite d(MessageLite hfvm0) {
        if(this.a == null) {
            synchronized(this) {
                if(this.a != null) {
                    return this.a;
                }
                this.a = hfvm0;
                this.b = ByteString.b;
            }
        }
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hfux)) {
            return false;
        }
        MessageLite hfvm0 = this.a;
        MessageLite hfvm1 = ((hfux)object0).a;
        if(hfvm0 == null && hfvm1 == null) {
            return this.c().equals(((hfux)object0).c());
        }
        if(hfvm0 != null && hfvm1 != null) {
            return hfvm0.equals(hfvm1);
        }
        return hfvm0 == null ? this.d(hfvm1.S()).equals(hfvm1) : hfvm0.equals(((hfux)object0).d(hfvm0.S()));
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

