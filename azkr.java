import android.content.ContentValues;

public final class azkr {
    public final azks a;
    public final int b;

    public azkr() {
        throw null;
    }

    public azkr(azks azks0, int v) {
        this.a = azks0;
        this.b = v;
    }

    final ContentValues a() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("customer_id", Integer.valueOf(this.a.a.a));
        contentValues0.put("project_id", Integer.valueOf(this.a.a.b));
        contentValues0.put("metric_id", Integer.valueOf(this.a.b));
        contentValues0.put("report_id", Integer.valueOf(this.a.c));
        contentValues0.put("last_generated_day_index", Integer.valueOf(this.b));
        return contentValues0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azkr) && this.a.equals(((azkr)object0).a) && this.b == ((azkr)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ReportEntity{reportKey=" + this.a.toString() + ", lastGeneratedDayIndex=" + this.b + "}";
    }
}

