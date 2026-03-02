import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.appsearch.safeparcel.GenericDocumentParcel;
import androidx.appsearch.safeparcel.PropertyParcel;
import java.util.ArrayList;

public final class ajm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Bundle bundle0 = parcel0.readBundle(this.getClass().getClassLoader());
        String s = bundle0.getString("namespace");
        String s1 = bundle0.getString("id");
        String s2 = bundle0.getString("schemaType");
        if(s == null || s1 == null || s2 == null) {
            throw new IllegalArgumentException("GenericDocumentParcel bundle doesn\'t have namespace, id, or schemaType.");
        }
        ajl ajl0 = new ajl(s, s1, s2);
        ArrayList arrayList0 = bundle0.getStringArrayList("parentTypes");
        if(arrayList0 != null) {
            ajl0.c(arrayList0);
        }
        ajl0.b = bundle0.getInt("score");
        ajl0.a = bundle0.getLong("creationTimestampMillis");
        ajl0.d(bundle0.getLong("ttlMillis"));
        Bundle bundle1 = bundle0.getBundle("properties");
        if(bundle1 != null) {
            for(Object object0: bundle1.keySet()) {
                ajl0.b(((String)object0), ((PropertyParcel)bundle1.getParcelable(((String)object0))));
            }
        }
        return ajl0.a();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GenericDocumentParcel[v];
    }
}

