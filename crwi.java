import android.content.ContentValues;

public final class crwi {
    public final ContentValues a;

    public crwi() {
        throw null;
    }

    public crwi(ContentValues contentValues0) {
        this.a = contentValues0;
    }

    public final Long a() {
        return this.a.getAsLong("carrier_id");
    }

    public final Long b() {
        return this.a.getAsLong("expiration_time");
    }

    public final String c() {
        return this.a.getAsString("cpid");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof crwi) ? this.a.equals(((crwi)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "SubscriptionTableRowSet{contentValues=" + this.a.toString() + "}";
    }
}

