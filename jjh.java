import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class jjh extends CharacterStyle implements UpdateAppearance {
    private final hpe a;

    public jjh(hpe hpe0) {
        this.a = hpe0;
    }

    @Override  // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint0) {
        Paint.Cap paint$Cap0;
        Paint.Join paint$Join0;
        if(textPaint0 != null) {
            hpe hpe0 = this.a;
            if(ibuq.m(hpe0, hpg.a)) {
                textPaint0.setStyle(Paint.Style.FILL);
                return;
            }
            if(!(hpe0 instanceof hph)) {
                throw new ibnq();
            }
            textPaint0.setStyle(Paint.Style.STROKE);
            textPaint0.setStrokeWidth(((hph)hpe0).a);
            textPaint0.setStrokeMiter(((hph)hpe0).b);
            int v = ((hph)hpe0).d;
            if(v == 0) {
                paint$Join0 = Paint.Join.MITER;
            }
            else {
                switch(v) {
                    case 1: {
                        paint$Join0 = Paint.Join.ROUND;
                        break;
                    }
                    case 2: {
                        paint$Join0 = Paint.Join.BEVEL;
                        break;
                    }
                    default: {
                        paint$Join0 = Paint.Join.MITER;
                    }
                }
            }
            textPaint0.setStrokeJoin(paint$Join0);
            int v1 = ((hph)hpe0).c;
            if(v1 == 0) {
                paint$Cap0 = Paint.Cap.BUTT;
            }
            else {
                switch(v1) {
                    case 1: {
                        paint$Cap0 = Paint.Cap.ROUND;
                        break;
                    }
                    case 2: {
                        paint$Cap0 = Paint.Cap.SQUARE;
                        break;
                    }
                    default: {
                        paint$Cap0 = Paint.Cap.BUTT;
                    }
                }
            }
            textPaint0.setStrokeCap(paint$Cap0);
            hkt hkt0 = ((hph)hpe0).e;
            textPaint0.setPathEffect((hkt0 == null ? null : hkt0.a));
        }
    }
}

