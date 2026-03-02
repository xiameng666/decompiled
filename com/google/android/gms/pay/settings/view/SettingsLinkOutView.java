package com.google.android.gms.pay.settings.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ecug;
import edpl;
import edqf;
import funx;
import hwef;
import hwsn;

public class SettingsLinkOutView extends FrameLayout {
    public final ImageView a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    private final View f;

    public SettingsLinkOutView(Context context0) {
        this(context0, null);
    }

    public SettingsLinkOutView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SettingsLinkOutView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        View view0 = SettingsLinkOutView.inflate(context0, 0x7F0E079A, this);  // layout:pay_wallet_secondary_list_item
        this.f = view0;
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B08E5);  // id:TopIcon
        this.a = imageView0;
        ImageView imageView1 = (ImageView)view0.findViewById(0x7F0B0823);  // id:StartIcon
        this.b = imageView1;
        ImageView imageView2 = (ImageView)view0.findViewById(0x7F0B0399);  // id:EndIcon
        this.c = imageView2;
        TextView textView0 = (TextView)view0.findViewById(0x7F0B08C5);  // id:TitleText
        this.d = textView0;
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0857);  // id:SubtitleText
        this.e = textView1;
        imageView2.setVisibility(0);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, (SettingsLinkOutView.b() ? ecug.a : ecug.b), 0, 0);
        try {
            SettingsLinkOutView.b();
            SettingsLinkOutView.a(imageView1, typedArray0, 1, 8);
            SettingsLinkOutView.b();
            SettingsLinkOutView.a(imageView2, typedArray0, 2, 4);
            if(textView0 != null) {
                funx.e(textView0, typedArray0.getString((SettingsLinkOutView.b() ? 5 : 3)));
            }
            if(textView1 != null) {
                SettingsLinkOutView.b();
                edqf.d(textView1, typedArray0.getString(0));
            }
            if(SettingsLinkOutView.b()) {
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    SettingsLinkOutView.a(imageView0, typedArray0, 3, 8);
                }
                if(textView0 != null && typedArray0.getBoolean(4, false)) {
                    textView0.setTextAppearance(edpl.a(view0.getContext(), 0x7F040D1D));  // attr:textAppearanceTitleLarge
                }
            }
        }
        finally {
            typedArray0.recycle();
        }
    }

    private static void a(ImageView imageView0, TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, 0);
        if(imageView0 == null) {
            return;
        }
        if(v2 == 0) {
            imageView0.setVisibility(v1);
            return;
        }
        imageView0.setImageResource(v2);
    }

    private static boolean b() {
        return hwsn.f() || hwef.e();
    }
}

