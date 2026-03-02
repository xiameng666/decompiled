import android.util.Log;

public final class fkzq implements gfsi {
    public final fkzv a;

    public fkzq(fkzv fkzv0) {
        this.a = fkzv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fkzv fkzv0 = this.a;
        if(((Integer)object0) == null) {
            Log.e("SyncMetadata", a.i(null, "Unknown event code ", "!"));
            return fkzv0.b;
        }
        Object object1 = (Enum)fkzv0.a.a(((Integer)object0).intValue());
        return object1 != null ? object1 : fkzv0.b;
    }
}

