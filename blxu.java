import java.util.List;

public abstract class blxu {
    public final Long c;
    public final int d;

    public blxu(int v, Long long0) {
        this.d = v;
        this.c = long0;
    }

    public abstract ByteString a();

    protected static String b(List list0) {
        return list0.toString().replace("[", "[\n  ").replace(", ", ",\n  ").replace("]", "\n]\n");
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof blxu)) {
            return false;
        }
        if(this.d != ((blxu)object0).d) {
            return false;
        }
        return this.c == null ? ((blxu)object0).c == null : this.c.equals(((blxu)object0).c);
    }

    @Override
    public int hashCode() {
        return this.c == null ? (this.d + 0x1F) * 0x1F : (this.d + 0x1F) * 0x1F + this.c.hashCode();
    }
}

