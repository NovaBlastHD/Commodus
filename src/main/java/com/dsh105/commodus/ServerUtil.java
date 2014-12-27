/*
 * This file is part of Commodus.
 *
 * Commodus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Commodus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Commodus.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dsh105.commodus;

/**
 * Utilities for gaining and manipulating server information
 */
public class ServerUtil {

    // TODO: docs + references

    private ServerUtil() {

    }

    private static Version PLATFORM_VERSION;
    private static Version MINECRAFT_VERSION;

    public static ServerBrand getServerBrand() {
        return ServerBrand.detectBrand();
    }

    public static Version getPlatformVersion() {
        if (PLATFORM_VERSION == null) {
            PLATFORM_VERSION = getServerBrand().getPlatformVersion();
        }
        return PLATFORM_VERSION;
    }

    public static Version getMinecraftVersion() {
        if (MINECRAFT_VERSION == null) {
            MINECRAFT_VERSION = getServerBrand().getMinecraftVersion();
        }
        return MINECRAFT_VERSION;
    }
}