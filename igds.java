import java.io.Serializable;

public class igds extends igdo implements igdj, Serializable {
    public volatile long b;
    private static final long serialVersionUID = 0x259193AF48EL;

    protected igds(long v) {
        this.b = v;
    }

    @Override  // igdj
    public final long h() {
        return this.b;
    }
}

