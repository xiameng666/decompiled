import android.content.ContentValues;
import android.text.TextUtils;

public final class ejxk {
    public static void a(ContentValues contentValues0, geeg geeg0) {
        if(((geeg0.b == null ? geef.a : geeg0.b).b & 1) != 0) {
            geef geef0 = geeg0.b == null ? geef.a : geeg0.b;
            contentValues0.put("morning_customized_time", Long.valueOf(ejxk.d((geef0.c == null ? gecj.a : geef0.c))));
        }
        geef geef1 = geeg0.c;
        if(((geef1 == null ? geef.a : geef1).b & 1) != 0) {
            if(geef1 == null) {
                geef1 = geef.a;
            }
            contentValues0.put("afternoon_customized_time", Long.valueOf(ejxk.d((geef1.c == null ? gecj.a : geef1.c))));
        }
        geef geef2 = geeg0.d;
        if(((geef2 == null ? geef.a : geef2).b & 1) != 0) {
            if(geef2 == null) {
                geef2 = geef.a;
            }
            contentValues0.put("evening_customized_time", Long.valueOf(ejxk.d((geef2.c == null ? gecj.a : geef2.c))));
        }
    }

    public static void b(ContentValues contentValues0, geck geck0, String s) {
        Long long0 = null;
        if(geck0 == null) {
            contentValues0.putNull(s + "year");
            contentValues0.putNull(s + "month");
            contentValues0.putNull(s + "day");
            contentValues0.putNull(s + "period");
            contentValues0.putNull(s + "absolute_time_ms");
            ejxk.q(contentValues0, null, s);
            contentValues0.putNull(s + "date_range");
            contentValues0.putNull(s + "unspecified_future_time");
            contentValues0.putNull(s + "all_day");
            return;
        }
        contentValues0.put(s + "year", ((geck0.b & 1) == 0 ? null : ((int)geck0.c)));
        contentValues0.put(s + "month", ((geck0.b & 2) == 0 ? null : ((int)geck0.d)));
        contentValues0.put(s + "day", ((geck0.b & 4) == 0 ? null : ((int)geck0.e)));
        if((geck0.b & 16) != 0) {
            contentValues0.put(s + "period", Integer.valueOf((geci.a(geck0.g) == 0 ? 1 : geci.a(geck0.g))));
        }
        if((geck0.b & 0x40) != 0) {
            long0 = (long)geck0.i;
        }
        contentValues0.put(s + "absolute_time_ms", long0);
        ejxk.q(contentValues0, (geck0.f == null ? gecj.a : geck0.f), s);
        if((geck0.b & 0x20) != 0) {
            contentValues0.put(s + "date_range", Integer.valueOf(1));
        }
        if((geck0.b & 0x80) == 0) {
            contentValues0.putNull(s + "unspecified_future_time");
        }
        else {
            ejxh.b(contentValues0, s + "unspecified_future_time", Boolean.valueOf(geck0.j));
        }
        if((geck0.b & 0x100) != 0) {
            ejxh.b(contentValues0, s + "all_day", Boolean.valueOf(geck0.k));
            return;
        }
        contentValues0.putNull(s + "all_day");
    }

    public static void c(ContentValues contentValues0, gefy gefy0) {
        geen geen0;
        gedj gedj0;
        gedi gedi0;
        gedk gedk0;
        gecb gecb0;
        gecd gecd0;
        gecr gecr0;
        gecn gecn0;
        geck geck1;
        geck geck0;
        gedm gedm0;
        int v = 1;
        Long long0 = null;
        if((gefy0.b & 1) == 0) {
            gedm0 = null;
        }
        else {
            gedm0 = gefy0.c;
            if(gedm0 == null) {
                gedm0 = gedm.a;
            }
        }
        if(gedm0 != null) {
            contentValues0.put("client_assigned_id", ((gedm0.b & 2) == 0 ? null : gedm0.c));
            contentValues0.put("client_assigned_thread_id", ((gedm0.b & 4) == 0 ? null : gedm0.d));
        }
        if(((gefy0.e == null ? gegc.a : gefy0.e).b & 1) != 0) {
            gegc gegc0 = gefy0.e == null ? gegc.a : gefy0.e;
            contentValues0.put("task_list", Integer.valueOf((gegb.a(gegc0.c) == 0 ? 16 : gegb.a(gegc0.c))));
        }
        contentValues0.put("title", ((gefy0.b & 8) == 0 ? null : gefy0.f));
        contentValues0.put("created_time_millis", ((gefy0.b & 16) == 0 ? null : ((long)gefy0.g)));
        contentValues0.put("archived_time_ms", ((gefy0.b & 0x20) == 0 ? null : ((long)gefy0.h)));
        contentValues0.put("snoozed_time_millis", ((gefy0.b & 0x800) == 0 ? null : ((long)gefy0.m)));
        contentValues0.put("location_snoozed_until_ms", ((gefy0.b & 0x10000) == 0 ? null : ((long)gefy0.r)));
        ejxh.b(contentValues0, "archived", ((gefy0.b & 0x40) == 0 ? null : Boolean.valueOf(gefy0.i)));
        ejxh.b(contentValues0, "deleted", ((gefy0.b & 0x80) == 0 ? null : Boolean.valueOf(gefy0.j)));
        ejxh.b(contentValues0, "pinned", ((gefy0.b & 0x100) == 0 ? null : Boolean.valueOf(gefy0.k)));
        ejxh.b(contentValues0, "snoozed", ((gefy0.b & 0x200) == 0 ? null : Boolean.valueOf(gefy0.l)));
        if((gefy0.b & 0x1000) == 0) {
            geck0 = null;
        }
        else {
            geck0 = gefy0.n;
            if(geck0 == null) {
                geck0 = geck.a;
            }
        }
        ejxk.b(contentValues0, geck0, "due_date_");
        if((gefy0.b & 0x2000) == 0) {
            geck1 = null;
        }
        else {
            geck1 = gefy0.o;
            if(geck1 == null) {
                geck1 = geck.a;
            }
        }
        ejxk.b(contentValues0, geck1, "event_date_");
        if((gefy0.b & 0x4000) == 0) {
            gecn0 = null;
        }
        else {
            gecn0 = gefy0.p;
            if(gecn0 == null) {
                gecn0 = gecn.a;
            }
        }
        if(gecn0 == null) {
            contentValues0.putNull("lat");
            contentValues0.putNull("lng");
            contentValues0.putNull("name");
            contentValues0.putNull("radius_meters");
            contentValues0.putNull("location_type");
            contentValues0.putNull("display_address");
            ejxk.e(contentValues0, null);
            ejxk.j(contentValues0, null, "location_");
            ejxk.k(contentValues0, null);
        }
        else {
            contentValues0.put("lat", ((gecn0.b & 1) == 0 ? null : ((double)gecn0.c)));
            contentValues0.put("lng", ((gecn0.b & 2) == 0 ? null : ((double)gecn0.d)));
            contentValues0.put("name", gecn0.e);
            contentValues0.put("radius_meters", ((gecn0.b & 8) == 0 ? null : ((int)gecn0.f)));
            if((16 & gecn0.b) == 0) {
                contentValues0.putNull("location_type");
            }
            else {
                contentValues0.put("location_type", Integer.valueOf((gecm.a(gecn0.g) == 0 ? 1 : gecm.a(gecn0.g))));
            }
            contentValues0.put("display_address", gecn0.i);
            ejxk.e(contentValues0, (gecn0.j == null ? geby.a : gecn0.j));
            ejxk.j(contentValues0, (gecn0.h == null ? gppt.a : gecn0.h), "location_");
            ejxk.k(contentValues0, (gecn0.k == null ? geco.a : gecn0.k));
        }
        if((gefy0.b & 0x8000) == 0) {
            gecr0 = null;
        }
        else {
            gecr0 = gefy0.q;
            if(gecr0 == null) {
                gecr0 = gecr.a;
            }
        }
        if(gecr0 == null) {
            contentValues0.putNull("location_query");
            contentValues0.putNull("location_query_type");
            ejxk.h(contentValues0, null);
            ejxk.f(contentValues0, null);
        }
        else {
            contentValues0.put("location_query", gecr0.c);
            if((gecr0.b & 2) == 0) {
                contentValues0.putNull("location_query_type");
            }
            else {
                contentValues0.put("location_query_type", Integer.valueOf((gecq.a(gecr0.d) == 0 ? 1 : gecq.a(gecr0.d))));
            }
            if((gecr0.b & 4) == 0) {
                gecd0 = null;
            }
            else {
                gecd0 = gecr0.e;
                if(gecd0 == null) {
                    gecd0 = gecd.a;
                }
            }
            ejxk.h(contentValues0, gecd0);
            if((gecr0.b & 8) == 0) {
                gecb0 = null;
            }
            else {
                gecb0 = gecr0.f;
                if(gecb0 == null) {
                    gecb0 = gecb.a;
                }
            }
            ejxk.f(contentValues0, gecb0);
        }
        if((gefy0.b & 0x40000) == 0) {
            gedk0 = null;
        }
        else {
            gedk0 = gefy0.t;
            if(gedk0 == null) {
                gedk0 = gedk.a;
            }
        }
        if(gedk0 == null) {
            ejxk.p(contentValues0, null);
            ejxk.n(contentValues0, null);
            contentValues0.putNull("recurrence_master");
            contentValues0.putNull("recurrence_exceptional");
        }
        else {
            if((gedk0.b & 1) == 0) {
                gedi0 = null;
            }
            else {
                gedi0 = gedk0.c;
                if(gedi0 == null) {
                    gedi0 = gedi.a;
                }
            }
            ejxk.p(contentValues0, gedi0);
            if((gedk0.b & 2) == 0) {
                gedj0 = null;
            }
            else {
                gedj0 = gedk0.d;
                if(gedj0 == null) {
                    gedj0 = gedj.a;
                }
            }
            ejxk.n(contentValues0, gedj0);
            ejxh.b(contentValues0, "recurrence_master", ((gedk0.b & 4) == 0 ? null : Boolean.valueOf(gedk0.e)));
            ejxh.b(contentValues0, "recurrence_exceptional", ((gedk0.b & 8) == 0 ? null : Boolean.valueOf(gedk0.f)));
        }
        if((gefy0.b & 0x80000) != 0) {
            contentValues0.put("assistance", (gefy0.u == null ? gebz.a : gefy0.u).toBytesArray());
        }
        if((gefy0.b & 0x20000) != 0) {
            contentValues0.put("extensions", (gefy0.s == null ? gedl.a : gefy0.s).toBytesArray());
        }
        int v1 = gefy0.b;
        if((v1 & 0x1000) != 0) {
            contentValues0.put("reminder_type", Integer.valueOf(1));
        }
        else if((v1 & 0x4000) == 0 && (v1 & 0x8000) == 0) {
            contentValues0.put("reminder_type", Integer.valueOf(0));
        }
        else {
            contentValues0.put("reminder_type", Integer.valueOf(2));
        }
        if((gefy0.b & 0x200000) == 0) {
            geen0 = null;
        }
        else {
            geen0 = gefy0.v;
            if(geen0 == null) {
                geen0 = geen.a;
            }
        }
        if(geen0 == null) {
            contentValues0.putNull("link_application");
            contentValues0.putNull("link_id");
        }
        else {
            if((geen0.b & 1) != 0) {
                int v2 = geem.a(geen0.c);
                if(v2 != 0) {
                    v = v2;
                }
                contentValues0.put("link_application", Integer.valueOf(v));
            }
            contentValues0.put("link_id", ((geen0.b & 2) == 0 ? null : geen0.d));
        }
        if((gefy0.b & 0x400000) != 0) {
            long0 = (long)gefy0.w;
        }
        contentValues0.put("fired_time_millis", long0);
        contentValues0.put("dirty_sync_bit", Boolean.valueOf(false));
    }

    private static long d(gecj gecj0) {
        return ((long)gecj0.c) * 3600000L + ((long)gecj0.d) * 60000L + ((long)gecj0.e) * 1000L;
    }

    private static void e(ContentValues contentValues0, geby geby0) {
        if(geby0 == null) {
            contentValues0.putNull("address_country");
            contentValues0.putNull("address_locality");
            contentValues0.putNull("address_region");
            contentValues0.putNull("address_street_address");
            contentValues0.putNull("address_street_number");
            contentValues0.putNull("address_street_name");
            contentValues0.putNull("address_postal_code");
            contentValues0.putNull("address_name");
            return;
        }
        contentValues0.put("address_country", geby0.c);
        contentValues0.put("address_locality", geby0.d);
        contentValues0.put("address_region", geby0.e);
        contentValues0.put("address_street_address", geby0.f);
        contentValues0.put("address_street_number", geby0.g);
        contentValues0.put("address_street_name", geby0.h);
        contentValues0.put("address_postal_code", geby0.i);
        contentValues0.put("address_name", geby0.j);
    }

    private static void f(ContentValues contentValues0, gecb gecb0) {
        contentValues0.putNull("place_types");
        if(gecb0 == null) {
            contentValues0.putNull("category_id");
            contentValues0.putNull("display_name");
            return;
        }
        contentValues0.put("category_id", gecb0.c);
        contentValues0.put("display_name", gecb0.e);
        if(gecb0.d.size() != 0) {
            contentValues0.put("place_types", TextUtils.join(",", gecb0.d));
        }
    }

    private static void g(ContentValues contentValues0, gecc gecc0) {
        if(gecc0 == null) {
            ejxk.j(contentValues0, null, "chain_id_");
            return;
        }
        ejxk.j(contentValues0, (gecc0.c == null ? gppt.a : gecc0.c), "chain_id_");
    }

    private static void h(ContentValues contentValues0, gecd gecd0) {
        if(gecd0 == null) {
            contentValues0.putNull("chain_name");
            ejxk.g(contentValues0, null);
            return;
        }
        contentValues0.put("chain_name", gecd0.c);
        ejxk.g(contentValues0, (gecd0.d == null ? gecc.a : gecd0.d));
    }

    private static void i(ContentValues contentValues0, gecs gecs0) {
        Boolean boolean0 = null;
        if(gecs0 == null) {
            ejxk.q(contentValues0, null, "daily_pattern_");
            contentValues0.putNull("daily_pattern_period");
            contentValues0.putNull("daily_pattern_all_day");
            return;
        }
        ejxk.q(contentValues0, (gecs0.c == null ? gecj.a : gecs0.c), "daily_pattern_");
        if((gecs0.b & 2) != 0) {
            contentValues0.put("daily_pattern_period", Integer.valueOf((geci.a(gecs0.d) == 0 ? 1 : geci.a(gecs0.d))));
        }
        if((gecs0.b & 4) != 0) {
            boolean0 = Boolean.valueOf(gecs0.e);
        }
        ejxh.b(contentValues0, "daily_pattern_all_day", boolean0);
    }

    private static void j(ContentValues contentValues0, gppt gppt0, String s) {
        if(gppt0 == null) {
            contentValues0.putNull(s + "cell_id");
            contentValues0.putNull(s + "fprint");
            return;
        }
        contentValues0.put(s + "cell_id", Long.valueOf(gppt0.c));
        contentValues0.put(s + "fprint", Long.valueOf(gppt0.d));
    }

    private static void k(ContentValues contentValues0, geco geco0) {
        if(geco0 == null) {
            contentValues0.putNull("location_alias_id");
            return;
        }
        contentValues0.put("location_alias_id", geco0.c);
    }

    private static void l(ContentValues contentValues0, gecy gecy0) {
        if(gecy0 == null) {
            contentValues0.putNull("monthly_pattern_month_day");
            contentValues0.putNull("monthly_pattern_week_day");
            contentValues0.putNull("monthly_pattern_week_day_number");
            return;
        }
        contentValues0.put("monthly_pattern_month_day", ejtt.a(glwy.n(gecy0.c)));
        if((gecy0.b & 4) != 0) {
            contentValues0.put("monthly_pattern_week_day", Integer.valueOf((gedd.b(gecy0.d) == null ? gedd.a : gedd.b(gecy0.d)).i));
        }
        contentValues0.put("monthly_pattern_week_day_number", ((gecy0.b & 8) == 0 ? null : ((int)gecy0.e)));
    }

    private static void m(ContentValues contentValues0, gecz gecz0) {
        Boolean boolean0 = null;
        if(gecz0 == null) {
            ejxk.b(contentValues0, null, "recurrence_end_");
            contentValues0.putNull("recurrence_end_num_occurrences");
            contentValues0.putNull("recurrence_end_auto_renew");
            ejxk.b(contentValues0, null, "recurrence_end_auto_renew_until_");
            return;
        }
        ejxk.b(contentValues0, (gecz0.c == null ? geck.a : gecz0.c), "recurrence_end_");
        contentValues0.put("recurrence_end_num_occurrences", ((gecz0.b & 4) == 0 ? null : ((int)gecz0.d)));
        if((gecz0.b & 8) != 0) {
            boolean0 = Boolean.valueOf(gecz0.e);
        }
        ejxh.b(contentValues0, "recurrence_end_auto_renew", boolean0);
        ejxk.b(contentValues0, (gecz0.f == null ? geck.a : gecz0.f), "recurrence_end_auto_renew_until_");
    }

    private static void n(ContentValues contentValues0, gedj gedj0) {
        if(gedj0 == null) {
            contentValues0.putNull("recurrence_id");
            return;
        }
        contentValues0.put("recurrence_id", gedj0.c);
    }

    private static void o(ContentValues contentValues0, geda geda0) {
        if(geda0 == null) {
            ejxk.b(contentValues0, null, "recurrence_start_");
            return;
        }
        ejxk.b(contentValues0, (geda0.c == null ? geck.a : geda0.c), "recurrence_start_");
    }

    private static void p(ContentValues contentValues0, gedi gedi0) {
        gecy gecy0;
        gedf gedf0;
        gecs gecs0;
        gecz gecz0;
        geda geda0;
        int v = 1;
        gedh gedh0 = null;
        if(gedi0 == null) {
            contentValues0.putNull("recurrence_frequency");
            contentValues0.putNull("recurrence_every");
            ejxk.o(contentValues0, null);
            ejxk.m(contentValues0, null);
            ejxk.i(contentValues0, null);
            ejxk.r(contentValues0, null);
            ejxk.l(contentValues0, null);
            ejxk.s(contentValues0, null);
            return;
        }
        if((gedi0.b & 1) != 0) {
            int v1 = gecu.a(gedi0.c);
            if(v1 != 0) {
                v = v1;
            }
            contentValues0.put("recurrence_frequency", Integer.valueOf(v - 1));
        }
        contentValues0.put("recurrence_every", ((gedi0.b & 2) == 0 ? null : ((int)gedi0.d)));
        if((gedi0.b & 4) == 0) {
            geda0 = null;
        }
        else {
            geda0 = gedi0.e;
            if(geda0 == null) {
                geda0 = geda.a;
            }
        }
        ejxk.o(contentValues0, geda0);
        if((gedi0.b & 8) == 0) {
            gecz0 = null;
        }
        else {
            gecz0 = gedi0.f;
            if(gecz0 == null) {
                gecz0 = gecz.a;
            }
        }
        ejxk.m(contentValues0, gecz0);
        if((gedi0.b & 16) == 0) {
            gecs0 = null;
        }
        else {
            gecs0 = gedi0.g;
            if(gecs0 == null) {
                gecs0 = gecs.a;
            }
        }
        ejxk.i(contentValues0, gecs0);
        if((gedi0.b & 0x20) == 0) {
            gedf0 = null;
        }
        else {
            gedf0 = gedi0.h;
            if(gedf0 == null) {
                gedf0 = gedf.b;
            }
        }
        ejxk.r(contentValues0, gedf0);
        if((gedi0.b & 0x40) == 0) {
            gecy0 = null;
        }
        else {
            gecy0 = gedi0.i;
            if(gecy0 == null) {
                gecy0 = gecy.a;
            }
        }
        ejxk.l(contentValues0, gecy0);
        if((gedi0.b & 0x80) != 0) {
            gedh0 = gedi0.j;
            if(gedh0 == null) {
                gedh0 = gedh.b;
            }
        }
        ejxk.s(contentValues0, gedh0);
    }

    private static void q(ContentValues contentValues0, gecj gecj0, String s) {
        Integer integer0 = null;
        if(gecj0 == null) {
            contentValues0.putNull(s + "hour");
            contentValues0.putNull(s + "minute");
            contentValues0.putNull(s + "second");
            return;
        }
        contentValues0.put(s + "hour", ((gecj0.b & 1) == 0 ? null : ((int)gecj0.c)));
        contentValues0.put(s + "minute", ((gecj0.b & 2) == 0 ? null : ((int)gecj0.d)));
        if((gecj0.b & 4) != 0) {
            integer0 = (int)gecj0.e;
        }
        contentValues0.put(s + "second", integer0);
    }

    private static void r(ContentValues contentValues0, gedf gedf0) {
        if(gedf0 == null) {
            contentValues0.putNull("weekly_pattern_weekday");
            return;
        }
        gedd[] arr_gedd = (gedd[])new hfuh(gedf0.c, gedf.a).toArray(new gedd[0]);
        int[] arr_v = new int[arr_gedd.length];
        for(int v = 0; v < arr_gedd.length; ++v) {
            arr_v[v] = arr_gedd[v].i;
        }
        contentValues0.put("weekly_pattern_weekday", ejtt.a(arr_v));
    }

    private static void s(ContentValues contentValues0, gedh gedh0) {
        if(gedh0 == null) {
            contentValues0.putNull("yearly_pattern_year_month");
            contentValues0.putNull("yearly_pattern_monthly_pattern_month_day");
            contentValues0.putNull("yearly_pattern_monthly_pattern_week_day");
            contentValues0.putNull("yearly_pattern_monthly_pattern_week_day_number");
            return;
        }
        hfuh hfuh0 = new hfuh(gedh0.e, gedh.a);
        int[] arr_v = new int[hfuh0.size()];
        for(int v = 0; v < hfuh0.size(); ++v) {
            arr_v[v] = ((hfub)hfuh0.get(v)).a();
        }
        contentValues0.put("yearly_pattern_year_month", ejtt.a(arr_v));
        if((gedh0.c & 1) != 0) {
            gecy gecy0 = gedh0.d == null ? gecy.a : gedh0.d;
            contentValues0.put("yearly_pattern_monthly_pattern_month_day", ejtt.a(glwy.n(gecy0.c)));
            if((gecy0.b & 4) != 0) {
                contentValues0.put("yearly_pattern_monthly_pattern_week_day", Integer.valueOf((gedd.b(gecy0.d) == null ? gedd.a : gedd.b(gecy0.d)).i));
            }
            contentValues0.put("yearly_pattern_monthly_pattern_week_day_number", ((gecy0.b & 8) == 0 ? null : ((int)gecy0.e)));
            return;
        }
        contentValues0.putNull("yearly_pattern_monthly_pattern_month_day");
        contentValues0.putNull("yearly_pattern_monthly_pattern_week_day");
        contentValues0.putNull("yearly_pattern_monthly_pattern_week_day_number");
    }
}

