package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import android.text.TextUtils.SimpleStringSplitter;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import ejub;
import ejud;
import java.util.ArrayList;
import java.util.List;

public class CategoryInfoRef extends ejub implements CategoryInfo {
    public CategoryInfoRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
    }

    @Override  // com.google.android.gms.reminders.model.CategoryInfo
    public final String a() {
        return this.r(this.p("category_id"));
    }

    @Override  // com.google.android.gms.reminders.model.CategoryInfo
    public final String c() {
        return this.r(this.p("display_name"));
    }

    @Override  // com.google.android.gms.reminders.model.CategoryInfo
    public final List d() {
        List list0 = new ArrayList();
        String s = this.r(this.p("place_types"));
        if(!TextUtils.isEmpty(s)) {
            TextUtils.SimpleStringSplitter textUtils$SimpleStringSplitter0 = new TextUtils.SimpleStringSplitter(',');
            textUtils$SimpleStringSplitter0.setString(s);
            for(Object object0: textUtils$SimpleStringSplitter0) {
                list0.add(((String)object0));
            }
        }
        return list0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static boolean e(DataHolder dataHolder0, int v, int v1, String s) {
        return dataHolder0.f(CategoryInfoRef.G(s, "category_id"), v, v1) && dataHolder0.f(CategoryInfoRef.G(s, "place_types"), v, v1) && dataHolder0.f(CategoryInfoRef.G(s, "display_name"), v, v1);
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof CategoryInfo)) {
            return false;
        }
        return this == object0 ? true : CategoryInfoEntity.e(this, ((CategoryInfo)object0));
    }

    @Override  // bakp
    public final int hashCode() {
        return CategoryInfoEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new CategoryInfoEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejud.a(new CategoryInfoEntity(this), parcel0);
    }
}

