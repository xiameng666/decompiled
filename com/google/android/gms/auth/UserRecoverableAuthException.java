package com.google.android.gms.auth;

import acse;
import acsx;
import android.content.Intent;
import android.util.Log;
import batl;

public class UserRecoverableAuthException extends acse {
    private final Intent a;
    private final acsx b;

    public UserRecoverableAuthException(String s, Intent intent0) {
        this(s, intent0, acsx.a);
    }

    private UserRecoverableAuthException(String s, Intent intent0, acsx acsx0) {
        super(s);
        this.a = intent0;
        batl.s(acsx0);
        this.b = acsx0;
    }

    public final Intent a() {
        Intent intent0 = this.a;
        if(intent0 == null) {
            switch(this.b.ordinal()) {
                case 0: {
                    Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                    return null;
                }
                case 1: {
                    Log.e("Auth", "This shouldn\'t happen. Gms API throwing this exception should support the recovery Intent.");
                    return null;
                }
                case 2: {
                    Log.i("Auth", "this instantiation of UserRecoverableAuthException doesn\'t support an Intent.");
                    return null;
                }
                default: {
                    return null;
                }
            }
        }
        return new Intent(intent0);
    }

    public static UserRecoverableAuthException b(String s, Intent intent0) {
        batl.s(intent0);
        return new UserRecoverableAuthException(s, intent0, acsx.b);
    }
}

