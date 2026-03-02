package com.google.android.gms.cast.hats;

import android.content.Context;
import android.content.Intent;
import aupz;
import auqa;
import auqc;
import auqg;
import auqi;
import auqj;
import auqo;
import avjf;
import avjh;
import batl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.libraries.surveys.SurveyMetadata;
import frqo;
import j..util.Objects;

public class HatsSurveyManager.CastHatsChimeraActivityReceiver extends TracingBroadcastReceiver {
    public boolean a;
    public final auqo b;

    public HatsSurveyManager.CastHatsChimeraActivityReceiver(auqo auqo0) {
        Objects.requireNonNull(auqo0);
        this.b = auqo0;
        super("cast");
        this.a = false;
    }

    public final void b() {
        if(this.a) {
            this.b.c.unregisterReceiver(this);
            this.a = false;
        }
        if(!avjf.b().g()) {
            this.b.b.d(3);
        }
        auqo auqo0 = this.b;
        auqo0.k();
        if(avjf.b().e()) {
            avjf.b().i.remove(auqo0.n);
        }
        if(avjf.b().h()) {
            auqo0.k = false;
            auqo0.j = null;
        }
        auqo0.o = null;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v = intent0.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT", -1);
        avjh avjh0 = auqo.a;
        avjh0.n("Received HaTS survey event: %d", Integer.valueOf(v));
        switch(v) {
            case 0: {
                SurveyMetadata surveyMetadata0 = (SurveyMetadata)intent0.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                avjh0.m("onSurveyPrompted");
                this.b.r = 3;
                this.b.o = surveyMetadata0 == null ? this.b.o : surveyMetadata0;
                this.b.q.ifPresent(new auqi(this.b, surveyMetadata0));
                return;
            }
            case 1: {
                SurveyMetadata surveyMetadata1 = (SurveyMetadata)intent0.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                avjh0.m("onSurveyClosed");
                this.b.r = 1;
                this.b.o = surveyMetadata1 == null ? this.b.o : surveyMetadata1;
                this.b.q.ifPresent(new aupz(this.b, surveyMetadata1));
                this.b();
                return;
            }
            case 2: {
                if(intent0.hasExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE")) {
                    String s = intent0.getStringExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE");
                    batl.s(s);
                    SurveyMetadata surveyMetadata2 = (SurveyMetadata)intent0.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                    avjh0.m("onPresentSurveyFailed");
                    this.b.r = 1;
                    this.b.o = surveyMetadata2 == null ? this.b.o : surveyMetadata2;
                    this.b.q.ifPresent(new auqg(this.b, ((frqo)Enum.valueOf(frqo.class, s)), surveyMetadata2));
                    this.b();
                }
                return;
            }
            case 3: {
                SurveyMetadata surveyMetadata3 = (SurveyMetadata)intent0.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                avjh0.m("didAnswerSingleSelectQuestion");
                this.b.r = 3;
                this.b.o = surveyMetadata3 == null ? this.b.o : surveyMetadata3;
                this.b.q.ifPresent(new auqa(this.b, surveyMetadata3));
                return;
            }
            case 4: {
                SurveyMetadata surveyMetadata4 = (SurveyMetadata)intent0.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                avjh0.m("didAnswerOpenTextQuestion");
                this.b.r = 3;
                this.b.o = surveyMetadata4 == null ? this.b.o : surveyMetadata4;
                this.b.q.ifPresent(new auqc(this.b, surveyMetadata4));
                return;
            }
            case 5: {
                int v1 = intent0.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_REQUEST_CODE", -999);
                int v2 = intent0.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT_CODE", -999);
                avjh0.p("onActivityResult(): requestCode=%d, resultCode=%d", Integer.valueOf(v1), Integer.valueOf(v2));
                this.b.r = 1;
                this.b.q.ifPresent(new auqj(this.b, v2));
                this.b();
                return;
            }
            default: {
                avjh0.m("Received unknown HaTS survey event!");
            }
        }
    }
}

