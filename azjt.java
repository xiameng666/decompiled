import android.content.ContentValues;
import j..util.StringJoiner;

public final class azjt {
    public final long a;
    public final azks b;
    public final int c;
    public final long d;
    public final azki e;
    public final azii f;

    public azjt() {
        throw null;
    }

    public azjt(long v, azks azks0, int v1, long v2, azki azki0, azii azii0) {
        this.a = v;
        this.b = azks0;
        this.c = v1;
        this.d = v2;
        this.e = azki0;
        this.f = azii0;
    }

    final ContentValues a() {
        ContentValues contentValues0 = new ContentValues();
        long v = this.a;
        if(v != 0L) {
            contentValues0.put("id", Long.valueOf(v));
        }
        contentValues0.put("customer_id", Integer.valueOf(this.b.a.a));
        contentValues0.put("project_id", Integer.valueOf(this.b.a.b));
        contentValues0.put("metric_id", Integer.valueOf(this.b.b));
        contentValues0.put("report_id", Integer.valueOf(this.b.c));
        contentValues0.put("day_index", Integer.valueOf(this.c));
        contentValues0.put("system_profile_hash", Long.valueOf(this.d));
        azki azki0 = this.e;
        StringJoiner stringJoiner0 = new StringJoiner(",");
        for(int v1 = 0; true; ++v1) {
            glww glww0 = azki0.a;
            if(v1 >= glww0.c()) {
                break;
            }
            stringJoiner0.add(Integer.toString(glww0.a(v1)));
        }
        contentValues0.put("event_vector", stringJoiner0.toString());
        contentValues0.put("aggregate_value", this.f.toBytesArray());
        return contentValues0;
    }

    public static azjs b() {
        azjs azjs0 = new azjs();
        azjs0.d(0L);
        return azjs0;
    }

    public final azjt c(azii azii0) {
        azjs azjs0 = new azjs(this);
        azjs0.b(azii0);
        return azjs0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azjt) && this.a == ((azjt)object0).a && this.b.equals(((azjt)object0).b) && this.c == ((azjt)object0).c && this.d == ((azjt)object0).d && this.e.equals(((azjt)object0).e) && ((ProtoLiteMessage)this.f).equals(((azjt)object0).f);
    }

    @Override
    public final int hashCode() {
        int v = ((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e.hashCode();
        azii azii0 = this.f;
        if(((ProtoLiteMessage)azii0).isImmutable()) {
            return ((ProtoLiteMessage)azii0).s() ^ v * 1000003;
        }
        int v1 = azii0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)azii0).s();
            azii0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "AggregateStoreEntity{id=" + this.a + ", reportKey=" + this.b + ", dayIndex=" + this.c + ", systemProfileHash=" + this.d + ", eventVector=" + this.e + ", aggregateValue=" + this.f + "}";
    }
}

