package com.google.android.libraries.surveys.internal.view;

import MessageLite;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import du;
import fm;
import frqp;
import frra;
import frrh;
import frri;
import frrp;
import frsk;
import frsq;
import frst;
import frsy;
import frvq;
import frwl;
import frwn;
import frwo;
import frwp;
import frwq;
import frwv;
import hhol;
import hhop;
import hhpg;
import iajh;

public class EmbeddedSurveyFragment extends du implements frwl {
    private frra a;

    @Override  // frwf
    public final void A() {
        ImageButton imageButton0 = (ImageButton)this.a.b(0x7F0B21A1);  // id:survey_close_button
        if(imageButton0 != null) {
            imageButton0.setVisibility(8);
        }
    }

    @Override  // frtu
    public final void B() {
        this.a.g();
    }

    @Override  // frtv
    public final void C(boolean z, du du0) {
        frra frra0 = this.a;
        if(!frra0.j && frwv.o(du0) == frra0.e.c && !frra0.k.k) {
            frra0.h(z);
        }
    }

    @Override  // frtu
    public final void D(boolean z) {
        this.a.h(z);
    }

    @Override  // frwf
    public final boolean E() {
        return true;
    }

    @Override  // frwf
    public final boolean F() {
        return this.a.l();
    }

    @Override  // frtu
    public final void G() {
        this.a.j(false);
    }

    @Override  // frwf
    public final fm getSupportFragmentManager() {
        return this.getChildFragmentManager();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        frwo frwo0;
        Bundle bundle1 = this.getArguments();
        Answer answer0 = bundle0 == null ? ((Answer)bundle1.getParcelable("Answer")) : ((Answer)bundle0.getParcelable("Answer"));
        String s = bundle1.getString("TriggerId");
        byte[] arr_b = bundle1.getByteArray("SurveyPayload");
        hhop hhop0 = arr_b == null ? null : ((hhop)frsy.c(((MessageLite)hhop.a), arr_b));
        byte[] arr_b1 = bundle1.getByteArray("SurveySession");
        hhpg hhpg0 = arr_b1 == null ? null : ((hhpg)frsy.c(((MessageLite)hhpg.a), arr_b1));
        int v = 8;
        if(s == null || hhop0 == null || hhop0.g.size() == 0 || answer0 == null) {
            frwo0 = null;
        }
        else if(hhpg0 == null) {
            frwo0 = null;
        }
        else {
            frwn frwn0 = new frwn();
            frwn0.n = (byte)(frwn0.n | 2);
            frwn0.a(false);
            frwn0.b(false);
            frwn0.d(0);
            frwn0.c(false);
            frwn0.m = new Bundle();
            frwn0.a = hhop0;
            frwn0.b = answer0;
            frwn0.f = hhpg0;
            frwn0.e = s;
            frwn0.b((bundle0 == null ? bundle1.getBoolean("IsSubmitting", false) : bundle0.getBoolean("IsSubmitting")));
            if(bundle1.containsKey("LogoResId")) {
                frwn0.d = bundle1.getInt("LogoResId", 0);
            }
            if(bundle1.containsKey("keepNextButtonForLastQuestion")) {
                frwn0.c(bundle1.getBoolean("keepNextButtonForLastQuestion", false));
            }
            frwn0.h = bundle0 == null ? null : bundle0.getInt("CurrentQuestionIndexForViewPager");
            if(bundle0 != null) {
                Bundle bundle2 = bundle0.getBundle("SingleSelectOrdinalAnswerMappings");
                if(bundle2 == null) {
                    bundle2 = new Bundle();
                }
                frwn0.m = bundle2;
            }
            frqp frqp0 = (frqp)bundle1.getSerializable("SurveyCompletionCode");
            if(frqp0 == null) {
                throw new NullPointerException("Null surveyCompletionStyle");
            }
            frwn0.i = frqp0;
            frwn0.a(true);
            frrp frrp0 = frrp.a;
            if(frrp0 == null) {
                throw new NullPointerException("Null surveyStyle");
            }
            frwn0.l = frrp0;
            frwn0.d(bundle1.getInt("StartingQuestionIndex"));
            if(frwn0.n == 0x1F) {
                hhop hhop1 = frwn0.a;
                if(hhop1 != null) {
                    Answer answer1 = frwn0.b;
                    if(answer1 != null) {
                        String s1 = frwn0.e;
                        if(s1 != null) {
                            hhpg hhpg1 = frwn0.f;
                            if(hhpg1 != null) {
                                frqp frqp1 = frwn0.i;
                                if(frqp1 != null) {
                                    frrp frrp1 = frwn0.l;
                                    if(frrp1 != null) {
                                        Bundle bundle3 = frwn0.m;
                                        if(bundle3 != null) {
                                            frwo0 = new frwo(hhop1, answer1, frwn0.c, frwn0.d, s1, hhpg1, frwn0.g, frwn0.h, frqp1, frwn0.j, frwn0.k, frrp1, bundle3);
                                            goto label_88;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(frwn0.a == null) {
                stringBuilder0.append(" surveyPayload");
            }
            if(frwn0.b == null) {
                stringBuilder0.append(" answer");
            }
            if((frwn0.n & 1) == 0) {
                stringBuilder0.append(" isSubmitting");
            }
            if((frwn0.n & 2) == 0) {
                stringBuilder0.append(" ignoreFirstQuestion");
            }
            if(frwn0.e == null) {
                stringBuilder0.append(" triggerId");
            }
            if(frwn0.f == null) {
                stringBuilder0.append(" surveySession");
            }
            if((frwn0.n & 4) == 0) {
                stringBuilder0.append(" startingQuestionIndex");
            }
            if(frwn0.i == null) {
                stringBuilder0.append(" surveyCompletionStyle");
            }
            if((frwn0.n & 8) == 0) {
                stringBuilder0.append(" hideCloseButton");
            }
            if((frwn0.n & 16) == 0) {
                stringBuilder0.append(" keepNextButtonForLastQuestion");
            }
            if(frwn0.l == null) {
                stringBuilder0.append(" surveyStyle");
            }
            if(frwn0.m == null) {
                stringBuilder0.append(" singleSelectOrdinalAnswerMappings");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
    label_88:
        if(frwo0 == null) {
            Log.e("EmbeddedSurveyFragment", "Required EXTRAS not found in the intent, bailing out.");
            return null;
        }
        frra frra0 = new frra(layoutInflater0, this.getChildFragmentManager(), this, frwo0);
        this.a = frra0;
        frra0.b.add(this);
        frra frra1 = this.a;
        if(frra1.j && (frra1.k.l == frrp.a && (frra1.k.i == frqp.b || frra1.k.i == frqp.c))) {
            frra1.b(0x7F0B21A9).setVisibility(8);  // id:survey_main_scroll_view
            return this.a.a;
        }
        frwo frwo1 = frra1.k;
        frrp frrp2 = frwo1.l;
        frrp frrp3 = frrp.a;
        hhop hhop2 = frra1.c;
        boolean z = (hhop2.c == null ? hhol.a : hhop2.c).b;
        frrh frrh0 = frra1.e();
        if(!z || frrp2 == frrp3 && frwo1.h == null) {
            frri.a.f(frrh0);
        }
        if(frrp2 == frrp3) {
            FrameLayout frameLayout0 = (FrameLayout)frra1.b(0x7F0B13FB);  // id:fl_card_container
            frameLayout0.setClipToPadding(false);
            frameLayout0.setClipChildren(false);
            frameLayout0.setPadding(0, frra1.a.getResources().getDimensionPixelOffset(0x7F070313), 0, 0);  // dimen:card_container_top_padding
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)frra1.h.getLayoutParams();
            frameLayout$LayoutParams0.width = -1;
            frameLayout$LayoutParams0.gravity = 0x800033;
            frra1.h.setLayoutParams(frameLayout$LayoutParams0);
        }
        if(frrp2 != frrp3) {
            MaterialCardView materialCardView0 = frra1.h;
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)materialCardView0.getLayoutParams();
            frameLayout$LayoutParams1.width = frsk.d(materialCardView0.getContext()) ? -2 : frsk.a(materialCardView0.getContext());
            materialCardView0.setLayoutParams(frameLayout$LayoutParams1);
        }
        Answer answer2 = frra1.f;
        String s2 = TextUtils.isEmpty(answer2.b) ? null : answer2.b;
        ImageButton imageButton0 = (ImageButton)frra1.b(0x7F0B21A1);  // id:survey_close_button
        imageButton0.setImageDrawable(frsq.f(frra1.a()));
        imageButton0.setOnClickListener(new frwp(frra1, s2));
        frra1.b(0x7F0B21A9).setFocusable(false);  // id:survey_main_scroll_view
        boolean z1 = frra1.l();
        LinearLayout linearLayout0 = frra1.i;
        frra1.d.inflate(0x7F0E0ADA, linearLayout0);  // layout:survey_controls
        if(frst.b(iajh.d(frst.b))) {
            frra1.j(z1);
        }
        else if(!z1) {
            frra1.j(false);
        }
        if(frrp2 != frrp3) {
            if((hhop2.c == null ? hhol.a : hhop2.c).b) {
                frra1.n();
            }
            else {
                frra1.i(s2);
            }
        }
        else if(frwo1.h != null && ((int)frwo1.h) != 0) {
            frra1.n();
        }
        else {
            frra1.i(s2);
        }
        Integer integer0 = frwo1.h;
        boolean z2 = frvq.b(false, hhop2, answer2);
        frwv frwv0 = new frwv(frra1.m, hhop2, frwo1.d, false, z2, frwo1.i, frwo1.g);
        frra1.e = (SurveyViewPager)frra1.b(0x7F0B21D4);  // id:survey_viewpager
        frra1.e.h = frra1.l;
        frra1.e.h(frwv0);
        frra1.e.setImportantForAccessibility(2);
        if(integer0 != null) {
            frra1.e.i(integer0.intValue());
        }
        if(z1) {
            frra1.k();
        }
        linearLayout0.setVisibility(0);
        linearLayout0.forceLayout();
        if(z1) {
            ((MaterialButton)frra1.b(0x7F0B21AD)).setOnClickListener(new frwq(frra1, s2));  // id:survey_next
        }
        for(Object object0: frra1.c()) {
            EmbeddedSurveyFragment embeddedSurveyFragment0 = (EmbeddedSurveyFragment)object0;
        }
        View view0 = frra1.b(0x7F0B21A1);  // id:survey_close_button
        if(!frwo1.j) {
            v = 0;
        }
        view0.setVisibility(v);
        if(frra1.e != null && frra1.e.z() && !(hhop2.c == null ? hhol.a : hhop2.c).b) {
            frra1.m(2);
        }
        return this.a.a;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        SurveyViewPager surveyViewPager0 = this.a.e;
        bundle0.putInt("CurrentQuestionIndexForViewPager", (surveyViewPager0 == null ? 0 : surveyViewPager0.c));
        bundle0.putBoolean("IsSubmitting", this.a.j);
        bundle0.putParcelable("Answer", this.a.f);
        bundle0.putBundle("SingleSelectOrdinalAnswerMappings", this.a.g);
    }

    @Override  // frwl
    public final Activity y() {
        return super.getActivity();
    }

    @Override  // frwf
    public final void z() {
    }
}

