package com.fr4gus.android.oammblo.util;

import android.util.Log;

/**
 * Utility class to help on logging. Easier way to enable/disable debug statements
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class LogIt {

    public static boolean IS_DEBUG_ENABLED = true;

    public static void e(Object src, Throwable t, Object... message) {
        StringBuilder builder = new StringBuilder();
        if (t != null) {
            builder.append(t.getMessage()).append(": ");
        } else {
            builder.append("ERROR: ");
        }
        for (Object o : message) {
            builder.append(o).append(", ");
        }

        @SuppressWarnings("rawtypes")
        Class c = src instanceof Class ? (Class) src : src.getClass();
        Log.e(c.getName(), builder.toString(), t);
    }

    public static void d(Object src, Object... message) {
        if ( IS_DEBUG_ENABLED ) {
            StringBuilder builder = new StringBuilder();
            for (Object o : message) {
                builder.append(o).append(", ");
            }
            @SuppressWarnings("rawtypes")
            Class c = src instanceof Class ? (Class) src : src.getClass();
            Log.d(c.getName(), builder.toString());
        }
    }
}
