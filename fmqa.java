import android.text.TextUtils;
import android.widget.TextView.BufferType;
import android.widget.TextView;

public final class fmqa implements kar {
    public final fmqb a;

    public fmqa(fmqb fmqb0) {
        this.a = fmqb0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        fmfr fmfr0 = ((fmga)object0).f;
        int v = fmfr0.a() - 1;
        fmqb fmqb0 = this.a;
        switch(v) {
            case 1: {
                fmqb0.a.inflate(0x7F0E0B6D, fmqb0);  // layout:tombstone_text
                ((TextView)fmqb0.findViewById(0x7F0B2259)).setText(fmfr0.d());  // id:text
                return;
            }
            case 3: {
                fmqb0.a.inflate(0x7F0E0B6D, fmqb0);  // layout:tombstone_text
                TextView textView0 = (TextView)fmqb0.findViewById(0x7F0B2259);  // id:text
                textView0.setContentDescription(fmrm.d(fmfr0.c()));
                textView0.setText(fmrm.b(fmqb0.getContext(), fmfr0.c(), gfsx.m(Integer.valueOf(fyho.b(fmqb0, 0x7F0402FC)))), TextView.BufferType.SPANNABLE);  // attr:colorOnSurfaceVariant
                return;
            }
            default: {
                gfsx gfsx0 = ((fmga)object0).e;
                if(gfsx0.i() && !TextUtils.isEmpty(((CharSequence)gfsx0.d()))) {
                    fmqb0.a.inflate(0x7F0E0B6D, fmqb0);  // layout:tombstone_text
                    ((TextView)fmqb0.findViewById(0x7F0B2259)).setText(((CharSequence)gfsx0.d()));  // id:text
                    return;
                }
                fmqb0.setVisibility(8);
            }
        }
    }
}

