package com.google.android.gms.people.cpg.model;

import gged_interceptors;
import j..util.Objects;
import java.util.List;

public final class GroupContactOrder {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Long e;

    public GroupContactOrder(String s, String s1, List list0, String s2, Long long0) {
        this.b = s;
        this.a = s1;
        this.c = gged_interceptors.i(list0);
        this.d = s2;
        this.e = long0;
    }

    public final long a() {
        return (long)this.e;
    }

    public final gged_interceptors b() {
        return gged_interceptors.i(this.c);
    }

    public final boolean c() {
        return Boolean.parseBoolean(this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.b, ((GroupContactOrder)object0).b) && Objects.equals(this.c, ((GroupContactOrder)object0).c) && this.d.equals(((GroupContactOrder)object0).d) && Objects.equals(this.e, ((GroupContactOrder)object0).e);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c, this.d, this.e});
    }

    @Override
    public final String toString() {
        return "rawGroupId: " + this.b + ", order: " + this.c + ", dirty: " + this.d + ", docVersion: " + this.e;
    }
}

