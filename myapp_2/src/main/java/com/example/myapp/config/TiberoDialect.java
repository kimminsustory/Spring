package com.example.myapp.config;

import org.hibernate.dialect.Oracle10gDialect;
import org.hibernate.dialect.identity.IdentityColumnSupport;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;

public class TiberoDialect extends Oracle10gDialect {

    @Override
    public IdentityColumnSupport getIdentityColumnSupport() {
        return new TiberoIdentityColumnSupport();
    }

    public static class TiberoIdentityColumnSupport extends IdentityColumnSupportImpl {
        @Override
        public boolean supportsIdentityColumns() {
            return true;
        }

        @Override
        public String getIdentitySelectString(String table, String column, int type) {
            return "SELECT " + column + " FROM " + table + " WHERE " + column + " = LAST_INSERT_ID()";
        }

        @Override
        public String getIdentityColumnString(int type) {
            // Auto-incrementing ID column
            return "GENERATED BY DEFAULT AS IDENTITY";
        }
    }
}

