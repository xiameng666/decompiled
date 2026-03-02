import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import java.util.List;

public final class bmpj extends tk {
    public final bmpn a;
    public List e;
    private final int f;

    public bmpj(int v, bmpn bmpn0) {
        this.a = bmpn0;
        this.f = v;
        this.e = ggna.a;
    }

    @Override  // tk
    public final int b() {
        return this.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new bmpi(LayoutInflater.from(viewGroup0.getContext()).inflate(this.f, viewGroup0, false));
    }

    public final void f(List list0) {
        if(list0 == null) {
            list0 = ggna.a;
        }
        this.e = list0;
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        bmpg bmpg0 = (bmpg)this.e.get(v);
        String s = bmpg0.a;
        String s1 = bmpg0.b;
        int v1 = 0;
        if(TextUtils.isEmpty(s)) {
            ((bmpi)uq0).t.setText(s1);
            TextView textView0 = ((bmpi)uq0).v;
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
        }
        else if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
            ((bmpi)uq0).t.setText(s);
            TextView textView1 = ((bmpi)uq0).v;
            if(textView1 != null) {
                textView1.setVisibility(0);
                textView1.setText(s1);
            }
        }
        else {
            ((bmpi)uq0).t.setText(s);
            TextView textView2 = ((bmpi)uq0).v;
            if(textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView0 = ((bmpi)uq0).w;
        if(imageView0 != null) {
            int v2 = bmpg0.c;
            if(v2 == 0x80000000) {
                imageView0.setVisibility(8);
            }
            else if(v2 == 0) {
                Bitmap bitmap0 = bmpg0.d;
                if(bitmap0 != null) {
                    imageView0.setImageBitmap(bitmap0);
                }
            }
            else {
                imageView0.setImageResource(v2);
            }
        }
        MaterialCardView materialCardView0 = ((bmpi)uq0).u;
        if(materialCardView0 != null) {
            float f = materialCardView0.getContext().getResources().getDisplayMetrics().density * 20.0f;
            if(v == 0) {
                fyus fyus0 = new fyus(materialCardView0.C());
                fyus0.l(f);
                fyus0.m(f);
                materialCardView0.mu(new fyut(fyus0));
                v = 0;
            }
            else {
                v1 = v;
            }
            if(v == this.b() - 1) {
                fyus fyus1 = new fyus(materialCardView0.C());
                fyus1.j(f);
                fyus1.k(f);
                materialCardView0.mu(new fyut(fyus1));
            }
            v = v1;
        }
        if(this.a != null) {
            bmph bmph0 = new bmph(this, v);
            ((bmpi)uq0).x.setOnClickListener(bmph0);
        }
        ((bmpi)uq0).x.setTag(Integer.valueOf(v));
    }
}

