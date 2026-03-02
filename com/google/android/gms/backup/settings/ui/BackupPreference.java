package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import asxz;
import java.util.Collections;
import java.util.List;

public abstract class BackupPreference extends Preference {
    public BackupPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l(asxz.h);
    }

    public List k(Account account0) {
        return Collections.EMPTY_LIST;
    }

    public final void l(asxz asxz0) {
        this.n(asxz0.a(this.j));
    }

    public void o() {
    }
}

