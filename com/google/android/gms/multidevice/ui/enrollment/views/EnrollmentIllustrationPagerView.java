package com.google.android.gms.multidevice.ui.enrollment.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import cuhk;
import cuhl;
import cuhm;
import cuhp;
import cuhr;
import cuhs;
import cuia;
import ibnn;
import ibnz;
import ibpo;
import ibuq;
import ibwm;
import ibwt;
import java.util.List;

public final class EnrollmentIllustrationPagerView extends LinearLayout {
    public static final List a;
    public int b;
    public final cuhs c;
    private final ibnn d;
    private final ibnn e;
    private final ibnn f;
    private final cuhr g;

    static {
        EnrollmentIllustrationPagerView.a = ibpo.g(new cuia[]{new cuia(0x7F081003, 0x7F150F1E), new cuia(0x7F081004, 0x7F150F1F), new cuia(0x7F081001, 0x7F150F20)});  // drawable:v_illustration_tidepool_videocall
    }

    public EnrollmentIllustrationPagerView(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.d = new ibnz(new cuhk(this));
        this.e = new ibnz(new cuhl(this));
        this.f = new ibnz(new cuhm(this));
        Context context1 = this.getContext();
        ibuq.e(context1, "getContext(...)");
        cuhr cuhr0 = new cuhr(context1);
        this.g = cuhr0;
        cuhs cuhs0 = new cuhs(this);
        this.c = cuhs0;
        LayoutInflater.from(this.getContext()).inflate(0x7F0E032B, this);  // layout:enrollment_illustration_pager
        ViewPager2 viewPager20 = this.a();
        Context context2 = viewPager20.getContext();
        ibuq.e(context2, "getContext(...)");
        viewPager20.f(new cuhp(context2));
        viewPager20.e(cuhs0);
        RecyclerView recyclerView0 = this.c();
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager(0, false));
        recyclerView0.an(cuhr0);
        this.b(0);
        ((ImageView)this.findViewById(0x7F0B16DD)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + EnrollmentIllustrationPagerView.a.size() - 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
        ((ImageView)this.findViewById(0x7F0B16DC)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
    }

    public EnrollmentIllustrationPagerView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        ibuq.f(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.d = new ibnz(new cuhk(this));
        this.e = new ibnz(new cuhl(this));
        this.f = new ibnz(new cuhm(this));
        Context context1 = this.getContext();
        ibuq.e(context1, "getContext(...)");
        cuhr cuhr0 = new cuhr(context1);
        this.g = cuhr0;
        cuhs cuhs0 = new cuhs(this);
        this.c = cuhs0;
        LayoutInflater.from(this.getContext()).inflate(0x7F0E032B, this);  // layout:enrollment_illustration_pager
        ViewPager2 viewPager20 = this.a();
        Context context2 = viewPager20.getContext();
        ibuq.e(context2, "getContext(...)");
        viewPager20.f(new cuhp(context2));
        viewPager20.e(cuhs0);
        RecyclerView recyclerView0 = this.c();
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager(0, false));
        recyclerView0.an(cuhr0);
        this.b(0);
        ((ImageView)this.findViewById(0x7F0B16DD)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + EnrollmentIllustrationPagerView.a.size() - 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
        ((ImageView)this.findViewById(0x7F0B16DC)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
    }

    public EnrollmentIllustrationPagerView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        ibuq.f(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        this.d = new ibnz(new cuhk(this));
        this.e = new ibnz(new cuhl(this));
        this.f = new ibnz(new cuhm(this));
        Context context1 = this.getContext();
        ibuq.e(context1, "getContext(...)");
        cuhr cuhr0 = new cuhr(context1);
        this.g = cuhr0;
        cuhs cuhs0 = new cuhs(this);
        this.c = cuhs0;
        LayoutInflater.from(this.getContext()).inflate(0x7F0E032B, this);  // layout:enrollment_illustration_pager
        ViewPager2 viewPager20 = this.a();
        Context context2 = viewPager20.getContext();
        ibuq.e(context2, "getContext(...)");
        viewPager20.f(new cuhp(context2));
        viewPager20.e(cuhs0);
        RecyclerView recyclerView0 = this.c();
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager(0, false));
        recyclerView0.an(cuhr0);
        this.b(0);
        ((ImageView)this.findViewById(0x7F0B16DD)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + EnrollmentIllustrationPagerView.a.size() - 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
        ((ImageView)this.findViewById(0x7F0B16DC)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.b = ibwt.i((this.a.b + 1) % EnrollmentIllustrationPagerView.a.size(), new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
            this.a().g(this.b);
            int v1 = this.g.a;
            int v2 = this.g.b() - 1;
            this.g.a = ibwt.j(this.b, 0, v2);
            this.g.r(v1);
            this.g.r(this.g.a);
            Object object0 = this.f.a();
            ibuq.e(object0, "getValue(...)");
            ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
        });
    }

    public final ViewPager2 a() {
        Object object0 = this.d.a();
        ibuq.e(object0, "getValue(...)");
        return (ViewPager2)object0;
    }

    // Detected as a lambda impl.
    public final void b(int v) {
        this.b = ibwt.i(v, new ibwm(0, EnrollmentIllustrationPagerView.a.size() - 1));
        this.a().g(this.b);
        int v1 = this.g.a;
        int v2 = this.g.b() - 1;
        this.g.a = ibwt.j(this.b, 0, v2);
        this.g.r(v1);
        this.g.r(this.g.a);
        Object object0 = this.f.a();
        ibuq.e(object0, "getValue(...)");
        ((TextView)object0).setText(((cuia)EnrollmentIllustrationPagerView.a.get(this.b)).b);
    }

    private final RecyclerView c() {
        Object object0 = this.e.a();
        ibuq.e(object0, "getValue(...)");
        return (RecyclerView)object0;
    }
}

