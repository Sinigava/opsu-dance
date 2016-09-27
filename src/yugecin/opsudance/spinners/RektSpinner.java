/*
 * opsu!dance - fork of opsu! with cursordance auto
 * Copyright (C) 2016 yugecin
 *
 * opsu!dance is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * opsu! is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with opsu!dance.  If not, see <http://www.gnu.org/licenses/>.
 */
package yugecin.opsudance.spinners;

import itdelatrisu.opsu.Container;

public class RektSpinner extends Spinner {

	@Override
	public void init() {
		init(new double[][] {
			{ 10, 10 },
			{ Container.width / 2d, 10 },
			{ Container.width - 10, 10 },
			{ Container.width - 10, Container.height - 10 },
			{ Container.width / 2d, Container.height - 10 },
			{ 10, Container.height - 10 }
		});
	}

}
