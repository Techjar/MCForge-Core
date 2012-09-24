/*******************************************************************************
 * Copyright (c) 2012 MCForge.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package net.mcforge.world.blocks;

import net.mcforge.server.Server;
import net.mcforge.world.PhysicsBlock;

public class Gravel extends PhysicsBlock {

	int wait = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Gravel(byte ID, String name) {
		super(ID, name);
	}

	public Gravel() {
		super((byte)13, "Gravel");
	}

	public Gravel(byte b, String string, Server s) {
		super(b, string, s);
	}

	@Override
	public PhysicsBlock clone(Server s) {
		Gravel ss = new Gravel((byte)12, "Gravel", s);
		ss.wait = wait;
		return ss;
	}

	@Override
	public void tick() {
		if (wait <= 3) {
			wait++;
			return;
		}
		if (getLevel().getTile(getX(), getY() - 1, getZ()).getVisableBlock() == 0)
			move(getX(), getY() - 1, getZ());
	}

}
