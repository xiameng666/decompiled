import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.bluetooth.fastpair.fmd.AutoValue_FmdRequest;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdRequest;

public final class fgsk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = parcel0.readString();
        fgsl fgsl0 = new fgsl();
        fgsl0.a = "";
        fgsl0.b(-1);
        fgsl0.a(fgsh.a);
        fgsl0.a = gfta.b(s);
        fgsl0.b(parcel0.readInt());
        try {
            String s1 = parcel0.readString();
            if(s1 != null) {
                fgsl0.a(((fgsh)Enum.valueOf(fgsh.class, s1)));
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        if(fgsl0.d == 1) {
            String s2 = fgsl0.a;
            if(s2 != null) {
                fgsh fgsh0 = fgsl0.c;
                if(fgsh0 != null) {
                    return new AutoValue_FmdRequest(s2, fgsl0.b, fgsh0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(fgsl0.a == null) {
            stringBuilder0.append(" address");
        }
        if(fgsl0.d == 0) {
            stringBuilder0.append(" version");
        }
        if(fgsl0.c == null) {
            stringBuilder0.append(" optInRequestType");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FmdRequest[v];
    }
}

