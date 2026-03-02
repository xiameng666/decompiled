package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

public class Purchase {
    private final String a;
    private final String b;

    public Purchase(String s, String s1) {
        this.a = s;
        this.b = s1;
        new JSONObject(s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Purchase) ? TextUtils.equals(this.a, ((Purchase)object0).a) && TextUtils.equals(this.b, ((Purchase)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Purchase. Json: " + this.a;
    }
}

