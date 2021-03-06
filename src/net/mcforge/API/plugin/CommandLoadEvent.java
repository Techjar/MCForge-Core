/*******************************************************************************
 * Copyright (c) 2012 MCForge.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package net.mcforge.API.plugin;

import net.mcforge.API.Event;
import net.mcforge.API.EventList;
import net.mcforge.server.Server;

public class CommandLoadEvent extends Event {
    private Command plugin;
    
    private Server server;
    
    private static EventList events = new EventList();
    
    public CommandLoadEvent(Command plugin, Server server) {
        this.server = server;
        this.plugin = plugin;
    }
    
    
    /**
     * Get the server this event took place in
     * @return
     *        The {@link Server} object
     */
    public Server getServer() {
        return server;
    }

    @Override
    public EventList getEvents() {
        return events;
    }
    
    /**
     * Get a list of registered listeners
     * @return The list of listeners
     */
    public static EventList getEventList() {
        return events;
    }
    
    /**
     * Get the command that was loaded
     * @return
     *        The {@link Plugin} object
     */
    public Command getCommand() {
        return plugin;
    }
}

