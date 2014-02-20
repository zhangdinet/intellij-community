/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.vcs.log.graph;

import com.intellij.vcs.log.printmodel.GraphPrintCell;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class MouseOverAction implements GraphAction {

  private final int myVisibleRow;
  @NotNull private final Point myRelativePoint;
  @Nullable private final GraphPrintCell myPrintCell;

  public MouseOverAction(int visibleRow, @NotNull Point relativePoint, @Nullable GraphPrintCell printCell) {
    myVisibleRow = visibleRow;
    myRelativePoint = relativePoint;
    myPrintCell = printCell;
  }

  public int getRow() {
    return myVisibleRow;
  }

  @NotNull
  public Point getRelativePoint() {
    return myRelativePoint;
  }

  @Nullable
  public GraphPrintCell getPrintCell() {
    return myPrintCell;
  }
}
