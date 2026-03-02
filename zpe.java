import android.widget.TextView;

public final class zpe {
    public final aacf a;
    public final zem b;

    public zpe(aacf aacf0, zem zem0) {
        this.a = aacf0;
        this.b = zem0;
    }

    public static final void a(TextView textView0, boolean z) {
        if(z) {
            textView0.setGravity(17);
            textView0.setTextAlignment(4);
            return;
        }
        textView0.setGravity(0x800003);
        textView0.setTextAlignment(2);
    }

    public static final boolean b(grvi grvi0) {
        return (grvi0.b & 2) == 0 && grvi0.e.size() == 0 && grvi0.f.size() == 0 && (grvi0.b & 4) == 0 && grvi0.j.size() == 0;
    }
}

