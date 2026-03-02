package com.google.android.gms.constellation.ui.widget;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import baun;
import bblp;
import bcpp;
import bcqe;
import bcrh;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import fngs;
import fntl;
import fntm;
import fntn;
import fnub;
import foek;

public class AccountPickerView extends FrameLayout {
    public static final int a;
    private static final baun b;
    private TextView c;
    private AccountParticleDisc d;

    static {
        AccountPickerView.b = bcrh.a("account_picker");
    }

    public AccountPickerView(Context context0) {
        super(context0);
    }

    public AccountPickerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public AccountPickerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public final void a(Account account0) {
        AccountParticleDisc accountParticleDisc0 = this.d;
        if(accountParticleDisc0 != null) {
            fntm fntm0 = (fntm)accountParticleDisc0.j;
            if(fntm0 == null || !TextUtils.equals(account0.name, fntm0.c)) {
                AccountPickerView.b.d("Setting account: %s", new Object[]{account0.name});
                AccountParticleDisc accountParticleDisc1 = this.d;
                fntl fntl0 = fntm.a();
                fntl0.b(account0.name);
                accountParticleDisc1.l(fntl0.a());
                TextView textView0 = this.c;
                if(textView0 != null) {
                    textView0.setText(account0.name);
                }
            }
        }
    }

    public final void b(Runnable runnable0) {
        super.setOnClickListener(new bcpp(runnable0));
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView)this.findViewById(0x7F0B0A81);  // id:account_name
        this.d = (AccountParticleDisc)this.findViewById(0x7F0B0A83);  // id:account_particle_disc
        fntn fntn0 = new fntn();
        bblp bblp0 = new bblp(1, 9);
        Context context0 = this.getContext();
        Context context1 = this.getContext();
        bcqe.h();
        Context context2 = this.getContext();
        foek foek0 = new foek();
        foek0.b(context2);
        foek0.b = bblp0;
        fngs fngs0 = new fngs(context0, bblp0, fntn0, new fnub(context1, foek0.a()));
        this.d.h(fngs0, fntn0);
    }
}

