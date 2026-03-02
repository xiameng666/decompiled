import java.nio.ByteBuffer;

public final class igry extends gpgh {
    public final String d() {
        int v = this.__offset(4);
        return v == 0 ? null : this.__string(v + this.bb_pos);
    }

    @Override  // gpgh
    protected final int keysCompare(Integer integer0, Integer integer1, ByteBuffer byteBuffer0) {
        return igry.compareStrings(igry.__offset(4, integer0.intValue(), byteBuffer0), igry.__offset(4, integer1.intValue(), byteBuffer0), byteBuffer0);
    }
}

