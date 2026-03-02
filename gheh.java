import java.util.Set;

public abstract class gheh extends gheg implements gheq {
    public gheh() {
    }

    public gheh(byte[] arr_b) {
    }

    @Override  // gheg
    protected final long a() {
        return (long)this.d().b().size();
    }

    public abstract ghel d();

    @Override  // gheq, ghel
    public final Set e(Object object0) {
        return this.d().e(object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof gheq)) {
            return false;
        }
        ((gheq)object0).h();
        return this.f().equals(((gheq)object0).f()) && new ghef(this).equals(((gheq)object0).b());
    }

    @Override  // gheq, ghel
    public final Set f() {
        return this.d().f();
    }

    @Override  // ghel
    public final Set g(Object object0) {
        return this.d().g(object0);
    }

    @Override  // gheq
    public void h() {
    }

    @Override
    public final int hashCode() {
        return new ghef(this).hashCode();
    }

    @Override
    public final String toString() {
        return "isDirected: false, allowsSelfLoops: false, nodes: " + this.f().toString() + ", edges: " + new ghef(this).toString();
    }
}

