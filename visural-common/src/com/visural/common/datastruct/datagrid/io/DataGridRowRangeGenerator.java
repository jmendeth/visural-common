/*
 *  Copyright 2009 Richard Nichols.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.visural.common.datastruct.datagrid.io;

import com.visural.common.datastruct.datagrid.DataGrid;
import com.visural.common.datastruct.datagrid.DataGridGenerator;
import com.visural.common.datastruct.datagrid.TableFormat;
import java.util.ArrayList;

/**
 * @version $Id: DataGridRowRangeGenerator.java 2 2009-11-17 12:26:31Z tibes80@gmail.com $
 * @author Richard Nichols
 */
public class DataGridRowRangeGenerator implements DataGridGenerator {

    private TableFormat tfHeader;
    private ArrayList alRows;

    public DataGridRowRangeGenerator(DataGrid dgIn, int nRowStart, int nNumRows) {
        tfHeader = dgIn.getFormat();
        alRows = new ArrayList();
        for (int n = nRowStart; n < dgIn.getNumRows() && n < (nRowStart + nNumRows); n++) {
            alRows.add(dgIn.getRow(n));
        }
    }

    public TableFormat getTableFormat() {
        return tfHeader;
    }

    public ArrayList getRows() {
        return alRows;
    }
    
    public boolean isReady() {
        return true;
    }
}