package com.google.android.gms.accountsettings.mg.poc.model.repository;

import android.content.Context;
import cctd;
import omd;
import omn;
import opb;
import ziz;
import zjz;
import zka;
import zkb;
import zkc;
import zkd;
import zke;
import zkf;
import zkl;

public abstract class RepositoryDatabase extends omn {
    static final opb m;
    static final opb n;
    static final opb o;
    static final opb p;
    static final opb q;
    static final opb r;
    static final opb s;

    static {
        RepositoryDatabase.m = new zjz();
        RepositoryDatabase.n = new zka();
        RepositoryDatabase.o = new zkb();
        RepositoryDatabase.p = new zkc();
        RepositoryDatabase.q = new zkd();
        RepositoryDatabase.r = new zke();
        RepositoryDatabase.s = new zkf();
    }

    public abstract ziz u();

    public static RepositoryDatabase v(Context context0) {
        omd omd0 = cctd.a(context0, RepositoryDatabase.class, "account_settings_repository.db");
        omd0.b(new opb[]{RepositoryDatabase.m, RepositoryDatabase.n, RepositoryDatabase.o, RepositoryDatabase.p, RepositoryDatabase.q, RepositoryDatabase.r, RepositoryDatabase.s});
        omd0.d();
        return (RepositoryDatabase)omd0.a();
    }

    public abstract zkl w();
}

