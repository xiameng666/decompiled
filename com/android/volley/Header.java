package com.android.volley;

import android.text.TextUtils;

public final class Header {
    private final String a;
    private final String b;

    public Header(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && TextUtils.equals(this.a, ((Header)object0).a) && TextUtils.equals(this.b, ((Header)object0).b);
    }

    public final String getName() {
        return this.a;
    }

    public final String getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}

