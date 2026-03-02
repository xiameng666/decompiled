package com.google.android.gms.pay.pass.valuable.view.save;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import dwvm;

public final class WalletSaveButtonViewImpl extends dwvm {
    MaterialButton c;

    public WalletSaveButtonViewImpl(Context context0) {
        this(context0, null);
    }

    public WalletSaveButtonViewImpl(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public WalletSaveButtonViewImpl(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = (MaterialButton)this.findViewById(0x7F0B05D8);  // id:NegativeButton
        this.a.setText("Add");
        this.c.setText("Cancel");
    }

    @Override  // dwvm
    protected final ProgressBar a() {
        return (ProgressBar)this.findViewById(0x7F0B074F);  // id:SaveButtonSpinner
    }

    @Override  // dwvm
    protected final MaterialButton b() {
        return (MaterialButton)this.findViewById(0x7F0B074D);  // id:SaveButton
    }

    @Override  // dwvm
    public final void c() {
        this.a.setVisibility(0);
        this.a.setEnabled(true);
        this.b.setVisibility(4);
        this.c.setVisibility(0);
        this.c.setEnabled(true);
    }

    @Override  // dwvm
    public final void d(View.OnClickListener view$OnClickListener0) {
        MaterialButton materialButton0 = this.c;
        if(materialButton0 != null) {
            materialButton0.setOnClickListener(view$OnClickListener0);
        }
    }

    @Override  // dwvm
    public final void g() {
        this.a.setVisibility(4);
        this.a.setEnabled(false);
        this.b.setVisibility(0);
        MaterialButton materialButton0 = this.c;
        if(materialButton0 != null) {
            materialButton0.setVisibility(4);
            this.c.setEnabled(false);
        }
    }

    @Override  // dwvm
    protected final void h() {
        TextView textView0 = (TextView)this.findViewById(0x7F0B074E);  // id:SaveButtonInfoText
    }
}

