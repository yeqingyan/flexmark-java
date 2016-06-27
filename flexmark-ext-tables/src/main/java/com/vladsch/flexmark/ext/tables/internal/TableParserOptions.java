package com.vladsch.flexmark.ext.tables.internal;

import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.internal.util.DataHolder;

class TableParserOptions {
    final public int maxHeaderRows;
    final public int minHeaderRows;
    final public boolean appendMissingColumns;
    final public boolean discardExtraColumns;
    final public boolean columnSpans;
    final public boolean headerSeparatorColumns;

    TableParserOptions(DataHolder options) {
        this.maxHeaderRows = TablesExtension.MAX_HEADER_ROWS.getFrom(options);
        this.minHeaderRows = TablesExtension.MIN_HEADER_ROWS.getFrom(options);
        this.appendMissingColumns = TablesExtension.APPEND_MISSING_COLUMNS.getFrom(options);
        this.discardExtraColumns = TablesExtension.DISCARD_EXTRA_COLUMNS.getFrom(options);
        this.columnSpans = TablesExtension.COLUMN_SPANS.getFrom(options);
        this.headerSeparatorColumns = TablesExtension.HEADER_SEPARATOR_COLUMNS.getFrom(options);
    }
}