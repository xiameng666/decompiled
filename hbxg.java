import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.List;

public final class hbxg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        List list0 = hbwx.b(((WordBoxParcel)object0).b);
        String s = ((WordBoxParcel)object0).d;
        if(gfta.c(s)) {
            s = "";
        }
        Rect rect0 = hbwx.a(list0);
        String s1 = ((WordBoxParcel)object0).f;
        if(gfta.c(s1)) {
            s1 = "und";
        }
        return new hbwh(s, rect0, list0, s1);
    }
}

