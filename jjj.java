import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class jjj extends CharacterStyle implements UpdateAppearance {
    public final hms a;
    public final gra b;
    private final float c;
    private final gui d;

    public jjj(hms hms0, float f) {
        this.a = hms0;
        this.c = f;
        this.b = new ParcelableSnapshotMutableState(new hkf(0x7FC000007FC00000L), gul.a);
        this.d = new gpx(new jji(this), null);
    }

    public final long a() {
        return ((hkf)this.b.a()).a;
    }

    @Override  // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint0) {
        jir.a(textPaint0, this.c);
        textPaint0.setShader(((Shader)this.d.a()));
    }
}

