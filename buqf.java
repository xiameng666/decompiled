import android.graphics.Paint.Cap;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.googleone.smui.landing.StorageBarView;

public final class buqf implements lqj {
    public final buqh a;

    public buqf(buqh buqh0) {
        this.a = buqh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v4;
        buqh buqh0 = this.a;
        int v = 8;
        if((((bupq)object0) instanceof bupp)) {
            hiwb hiwb0 = ((bupp)(((bupq)object0))).c;
            buqh0.d.setText(ghin.b((hiwb0.b == null ? ghim.a : hiwb0.b)).b);
            buqh0.ag.setText(hiwb0.c);
            buqh0.am = hiwb0.e;
            buqh0.an = hiwb0.f;
            buqh0.A();
            StorageBarView storageBarView0 = buqh0.al;
            hfuo hfuo0 = hiwb0.d;
            ggdy ggdy0 = new ggdy();
            float f = 0.0f;
            for(Object object1: hfuo0) {
                hiwl hiwl0 = (hiwl)object1;
                float f1 = hiwl0.d;
                if((f1 > 0.0f)) {
                    f += f1;
                    ggdy0.i(new buqe(storageBarView0.a(busl.a((hiwl0.e == null ? hjie.a : hiwl0.e)), Paint.Cap.SQUARE), f));
                }
            }
            storageBarView0.b = ggdy0.h();
            storageBarView0.a = f >= 1.0f;
            buqh0.aj.setOnClickListener(new buqg(buqh0));
            buqh0.ai.setVisibility(0);
            buqh0.ak.removeAllViews();
            for(Object object2: hiwb0.d) {
                LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(buqh0.ak.getContext()).inflate(0x7F0E0A10, buqh0.ak, false);  // layout:storage_details_row_view
                TextView textView0 = (TextView)linearLayout0.findViewById(0x7F0B20F9);  // id:storage_type
                textView0.setText(((hiwl)object2).b);
                hjie hjie0 = ((hiwl)object2).e;
                if(hjie0 == null) {
                    hjie0 = hjie.a;
                }
                int v1 = busl.a(hjie0);
                int v2 = buqh0.getResources().getDimensionPixelSize(0x7F07143B);  // dimen:usage_row_circle_size
                GradientDrawable gradientDrawable0 = new GradientDrawable();
                gradientDrawable0.setShape(1);
                gradientDrawable0.setColor(v1);
                gradientDrawable0.setSize(v2, v2);
                textView0.setCompoundDrawablesWithIntrinsicBounds(gradientDrawable0, null, null, null);
                TextView textView1 = (TextView)linearLayout0.findViewById(0x7F0B20E8);  // id:storage_amount_used
                hiwy hiwy0 = ((hiwl)object2).c;
                if(hiwy0 == null) {
                    hiwy0 = hiwy.a;
                }
                textView1.setText(hiwy0.c);
                buqh0.ak.addView(linearLayout0);
                cmeb cmeb0 = buqh0.ao.b(linearLayout0, 202442);
                int v3 = ((hiwl)object2).f;
                hfta hfta0 = hjcc.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjas.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjbm.a).v_newBuilder();
                switch(v3) {
                    case 1: {
                        v4 = 3;
                        break;
                    }
                    case 2: {
                        v4 = 5;
                        break;
                    }
                    case 3: {
                        v4 = 4;
                        break;
                    }
                    case 4: {
                        v4 = 2;
                        break;
                    }
                    case 5: {
                        v4 = 6;
                        break;
                    }
                    case 6: {
                        v4 = 7;
                        break;
                    }
                    case 8: {
                        v4 = 9;
                        break;
                    }
                    case 100: {
                        v4 = 8;
                        break;
                    }
                    default: {
                        v4 = 1;
                    }
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hjbm)hftp1.b_message).c = v4 - 1;
                ((hjbm)hftp1.b_message).b |= 1;
                hjbm hjbm0 = (hjbm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hjas hjas0 = (hjas)hftp0.b_message;
                hjbm0.getClass();
                hjas0.d = hjbm0;
                hjas0.b |= 0x8000000;
                cmeb0.c(new fhvp(hfta0, hftp0.N_build()));
                cmeb0.f();
            }
            buqh0.ah.setVisibility(0);
        }
        else if((((bupq)object0) instanceof bupn)) {
            ((ggtj)((ggtj)buqh.a.j()).s(((bupn)(((bupq)object0))).a)).x("Error fetching StorageMeter data");
        }
        buqh0.b.setVisibility(((((bupq)object0) instanceof bupo) ? 0 : 8));
        buqh0.c.setVisibility(((((bupq)object0) instanceof bupn) ? 0 : 8));
        ConstraintLayout constraintLayout0 = buqh0.ah;
        if((((bupq)object0) instanceof bupp)) {
            v = 0;
        }
        constraintLayout0.setVisibility(v);
    }
}

