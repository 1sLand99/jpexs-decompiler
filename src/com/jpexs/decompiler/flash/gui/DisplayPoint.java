/*
 * Copyright (C) 2022 JPEXS
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.gui;

/**
 *
 * @author JPEXS
 */
public class DisplayPoint {
    public int x;
    public int y;
    public boolean onPath;

    public DisplayPoint(DisplayPoint src) {
        this(src.x, src.y, src.onPath);
    }
    
    public DisplayPoint(int x, int y) {
        this(x, y, true);
    }
    public DisplayPoint(int x, int y, boolean onPath) {
        this.x = x;
        this.y = y;
        this.onPath = onPath;
    }

    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }
    
}