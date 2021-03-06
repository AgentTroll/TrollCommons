/*
 * Copyright 2014 AgentTroll
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gmail.woodyc40.commons.misc;

import lombok.Getter;

/**
 * Represents a row of data on the ASCII table
 *
 * @author AgentTroll
 * @version 1.0
 * @since 1.0
 */
public class RowEntry implements Row {
    /** The data */
    @Getter private final String[] entries;
    /** The table this row is contained in */
    private final         Table    table;

    /**
     * Constructs a new row
     *
     * @param table the table that holds this row
     */
    public RowEntry(Table table) {
        this.table = table;
        this.entries = new String[table.columns];
    }

    @Override public Row setColumn(int column, String entry) {
        this.entries[column] = entry;

        int max = this.table.max[column];
        if (entry.length() > max)
            this.table.max[column] = entry.length();
        return this;
    }
}
