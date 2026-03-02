import android.content.ContentValues;
import java.util.Map;

final class bwxv {
    public final ContentValues a;
    public final ContentValues b;
    public final Map c;
    public final Map d;
    public final Map e;

    public bwxv(ContentValues contentValues0, ContentValues contentValues1, Map map0, Map map1, Map map2) {
        this.a = contentValues0;
        this.b = contentValues1;
        this.c = map0;
        this.d = map1;
        this.e = map2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bwxv) ? this.a.equals(((bwxv)object0).a) && this.c.equals(((bwxv)object0).c) && this.d.equals(((bwxv)object0).d) && this.e.equals(((bwxv)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() + 0x20F) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "ContactData[contactValues=" + this.a.toString() + ", interactionValues=" + this.b + ", emailValues=" + this.c.toString() + ", phoneValues=" + this.d.toString() + ", postalValues=" + this.e.toString() + "]";
    }
}

