import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class pp extends SeekBar {
    private final pq a;

    public pp(Context context0) {
        this(context0, null);
    }

    public pp(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040AB5);  // attr:seekBarStyle
    }

    public pp(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        wd.d(this, this.getContext());
        pq pq0 = new pq(this);
        this.a = pq0;
        pq0.b(attributeSet0, v);
    }

    @Override  // android.widget.AbsSeekBar
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        pq pq0 = this.a;
        Drawable drawable0 = pq0.c;
        if(drawable0 != null && drawable0.isStateful()) {
            SeekBar seekBar0 = pq0.b;
            if(drawable0.setState(seekBar0.getDrawableState())) {
                seekBar0.invalidateDrawable(drawable0);
            }
        }
    }

    @Override  // android.widget.AbsSeekBar
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.a.c;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // android.widget.AbsSeekBar
    protected final void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            pq pq0 = this.a;
            if(pq0.c != null) {
                SeekBar seekBar0 = pq0.b;
                int v1 = seekBar0.getMax();
                int v2 = 1;
                if(v1 > 1) {
                    int v3 = pq0.c.getIntrinsicWidth();
                    int v4 = pq0.c.getIntrinsicHeight();
                    int v5 = v3 < 0 ? 1 : v3 >> 1;
                    if(v4 >= 0) {
                        v2 = v4 >> 1;
                    }
                    pq0.c.setBounds(-v5, -v2, v5, v2);
                    int v6 = seekBar0.getWidth() - seekBar0.getPaddingLeft() - seekBar0.getPaddingRight();
                    int v7 = canvas0.save();
                    canvas0.translate(((float)seekBar0.getPaddingLeft()), ((float)(seekBar0.getHeight() / 2)));
                    for(int v8 = 0; v8 <= v1; ++v8) {
                        pq0.c.draw(canvas0);
                        canvas0.translate(((float)v6) / ((float)v1), 0.0f);
                    }
                    canvas0.restoreToCount(v7);
                }
            }
        }
    }
}

